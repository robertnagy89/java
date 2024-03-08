public class Card {
    private String rank;
    private CardSuit cardSuit;

    public Card(String rank, CardSuit cardSuit) {
        this.rank = rank;
        this.cardSuit = cardSuit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }
}
