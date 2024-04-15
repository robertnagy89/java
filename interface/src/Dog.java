public class Dog implements Presentable{
    private String name;
    private String breed;
    private String favoriteFood;

    public Dog(String name, String breed, String favoriteFood) {
        this.name = name;
        this.breed = breed;
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }


    @Override
    public void present() {
        System.out.println("Dog with name " + name + " with breed of " + breed + " and his favorite food is " + favoriteFood);
    }
}
