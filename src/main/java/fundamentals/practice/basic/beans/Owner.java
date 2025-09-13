package fundamentals.practice.basic.beans;

public class Owner
{
    private String name;
    private int age;
    private String address;

    public Owner(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
