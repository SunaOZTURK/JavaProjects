package oop;

public class Profs extends Person {

    public Profs(long id, String name, int age, int studentCount) {
        super(id, name, age);
        this.studentCount = studentCount;
        this.setPersonType("Prof");
    }
    private int studentCount;
    public int getStudentCount() {
        return studentCount;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public void ShowInfo() {

        super.ShowInfo();
        System.out.println("Number of connected students : "+getStudentCount());
    }

    public void Borrow(long bookisbn){

    }

}
