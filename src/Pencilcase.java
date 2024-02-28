public class Pencilcase {
    private int current = 0;
    private int size;
    private Stationary[] stationaries;

    public Pencilcase(int size){
        stationaries = new Stationary[size];
        this.size = size;
    }

    public void addStationary(Stationary stationary){
        if(current >= size){
            System.out.println("Tolltartó megtelt!");
        }
        if(stationary instanceof Pen){
            System.out.println("Added Pen!");
            stationaries[current] = stationary;
            current++;
        }
        if(stationary instanceof Pencil){
            System.out.println("Added Pencil!");
            stationaries[current] = stationary;
            current++;
        }
        if(stationary instanceof Ruler){
            System.out.println("Added Pen!");
            stationaries[current] = stationary;
            current++;
        }
    }
}
