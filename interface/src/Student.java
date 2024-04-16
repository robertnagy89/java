import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final int age;
    private final int height;

    public Student(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //getter, setter és toString metódusok

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && height == student.height && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    @Override
    public int compareTo(Student o) {

        return getName().compareTo(o.getName());
    }
}
