public class HouseRoomComparator implements Comparable<House> {
    private House house;

    public HouseRoomComparator(House house) {
        this.house = house;
    }

    @Override
    public int compareTo(House o) {
        if (this.house.getNumberOfRooms() > o.getNumberOfRooms()) {
            return 1;
        }
        if (this.house.getNumberOfRooms() < o.getNumberOfRooms()) {
            return -1;
        }
        return 0;
    }
}
