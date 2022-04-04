package tr.edu.maltepe.oop;

public class Students extends Person implements DoSport {


    private Profs parentProf;

    public Students(long id, String name, int age, Profs parentProf) {
        super(id, name, age);
        this.parentProf = parentProf;
        this.setPersonType("Student");

    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Connected professor :"+getParentProf().getName());
    }


    public Profs getParentProf() {
        return parentProf;
    }

    public void setParentProf(Profs parentProf) {
        this.parentProf = parentProf;
    }

    @Override
    public void PlayFootball(SportsCenter sportsCenter) {
        sportsCenter.enterGYM(this);
    }

    @Override
    public void Swim(SportsCenter sportsCenter) {
        sportsCenter.enterGYM(this);
    }
}
