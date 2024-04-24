public class FlatRoomComparator implements Comparable<Flat>{
    private Flat flat;

    public FlatRoomComparator(Flat flat) {
        this.flat = flat;
    }

    @Override
    public int compareTo(Flat o) {
        if(this.flat.getNumberOfRooms() > o.getNumberOfRooms()){
            return 1;
        }
        if(this.flat.getNumberOfRooms() < o.getNumberOfRooms()){
            return -1;
        }
        return 0;
    }
}
