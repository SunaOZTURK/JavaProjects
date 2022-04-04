package tr.edu.maltepe.oop;

public class Profs extends Person implements DoSport {


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
        System.out.println("Override from Method Profs!");
        System.out.println("Number of connected students : "+getStudentCount());
    }

    @Override
    public void PlayFootball(SportsCenter sportsCenter) {
        sportsCenter.SalonaGit(this);
    }

    @Override
    public void Swim(SportsCenter sportsCenter) {
        System.out.println("Ben Yüzme Bilmiyorum.");
    }
}
