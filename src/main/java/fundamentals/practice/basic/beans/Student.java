package fundamentals.practice.basic.beans;

public class Student
{
    private String firstName;
    private String lastName;
    private int rollNo;
    private String address;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Big");
    }

    // setter
//    public void setFirstName(String firstName)
//    {
//        this.firstName = firstName;
//    }
//    public void setLastName(String lastName)
//    {
//        this.lastName = lastName;
//    }
//
    public void setRollNo(int rollNo) {
        System.out.println("Setter - Roll");
        this.rollNo = rollNo;
    }

    public void setAddress(String address) {
        System.out.println("Setter - Address");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                ", address='" + address + '\'' +
                '}';
    }
}
