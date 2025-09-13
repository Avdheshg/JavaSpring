package fundamentals.practice.basic.beans;

public class SchoolClass
{
    private Student student;
    private String name;
    private String teacherName;
    private int floorNo;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public void showClassDetails()
    {
        System.out.println(this.name + " details: " + this.toString());
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "student=" + student +
                ", name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", floorNo=" + floorNo +
                '}';
    }
}
