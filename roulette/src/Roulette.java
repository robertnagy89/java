

import java.util.Random;

public class Roulette {

    private final static Color[] COLORS = {
            Color.GREEN, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.BLACK,
            Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK,
            Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.RED, Color.BLACK,
            Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED,
            Color.BLACK, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED,
            Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.RED,
            Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.BLACK,
            Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.BLACK, Color.RED, Color.BLACK,
            Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED, Color.BLACK, Color.RED,
    };

    private final static THIRD[] THIRDS = {
            THIRD.FIRST_THIRD, THIRD.FIRST_THIRD, THIRD.FIRST_THIRD, THIRD.FIRST_THIRD,
            THIRD.FIRST_THIRD, THIRD.FIRST_THIRD, THIRD.FIRST_THIRD, THIRD.FIRST_THIRD,
            THIRD.FIRST_THIRD, THIRD.FIRST_THIRD, THIRD.FIRST_THIRD, THIRD.FIRST_THIRD,
            THIRD.SECOND_THIRD, THIRD.SECOND_THIRD, THIRD.SECOND_THIRD, THIRD.SECOND_THIRD,
            THIRD.SECOND_THIRD, THIRD.SECOND_THIRD, THIRD.SECOND_THIRD, THIRD.SECOND_THIRD,
            THIRD.SECOND_THIRD, THIRD.SECOND_THIRD, THIRD.SECOND_THIRD, THIRD.SECOND_THIRD,
            THIRD.THIRD_THIRD, THIRD.THIRD_THIRD, THIRD.THIRD_THIRD, THIRD.THIRD_THIRD,
            THIRD.THIRD_THIRD, THIRD.THIRD_THIRD, THIRD.THIRD_THIRD, THIRD.THIRD_THIRD,
            THIRD.THIRD_THIRD, THIRD.THIRD_THIRD, THIRD.THIRD_THIRD, THIRD.THIRD_THIRD,
    };

    private final Random random;
    private int balance;

    public Roulette(int balance) {
        this.balance = balance;
        this.random = new Random();
    }

    public int getBalance() {
        return balance;
    }

    public boolean betOnColor(int amount, Color color) {
        if (color == COLORS[random.nextInt(0, 37)]) {
            balance += amount;
            return true;
        } else {
            balance -= amount;
            return false;
        }
    }

    public boolean betOnNumber(int amount, int number) {
        if (number == random.nextInt(0, 37)) {
            balance += amount * 35;
            return true;
        } else {
            balance -= amount;
            return false;
        }
    }

    public boolean betOnParity(int amount, Parity parity) {
        int randomNumber = random.nextInt(0, 37);

        if (randomNumber == 0) {
            balance -= amount;
            return false;
        }
        if (randomNumber % 2 == 0) {
            if (parity == Parity.EVEN) {
                balance += amount;
                return true;
            } else {
                balance -= amount;
                return false;
            }
        } else {
            if (parity == Parity.ODD) {
                balance += amount;
                return true;
            } else {
                balance -= amount;
                return false;
            }
        }
    }


    public boolean betOnHalf(int amount, HALF half) {
        int randomNumber = random.nextInt(0, 37);

        if (randomNumber == 0) {
            balance -= amount;
            return false;
        }

        if (randomNumber < 19) {
            if (half == HALF.FIRST_HALF) {
                balance += amount;
                return true;
            } else {
                balance -= amount;
                return false;
            }
        } else {
            if (half == HALF.SECOND_HALF) {
                balance += amount;
                return true;
            } else {
                balance -= amount;
                return false;
            }
        }
    }

    public boolean betOnThird(int amount, THIRD third) {

        int randomNumber = random.nextInt(0, 37);

        if (randomNumber == 0) {
            balance -= amount;
            return false;
        }
        if (third == THIRDS[randomNumber]) {
            balance += 2 * amount;
            return true;
        } else {
            balance -= amount;
            return false;
        }

    }
}
