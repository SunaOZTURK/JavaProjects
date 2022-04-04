package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {

        Profs prf1 = new Profs(2002020,"Ensar Gül ",50,25);
        Students std1 = new Students(1,"Suna ÖZTÜRK", 39,prf1);
        Students std2 = new Students(2,"Lena ÇAKAL", 8,prf1);

        std1.ShowInfo();
        std2.ShowInfo();
        prf1.ShowInfo();

        SportsCenter swimming_course =new SportsCenter();
        SportsCenter football_course = new SportsCenter();
        System.out.println(" ");
        prf1.PlayFootball(football_course);
        std1.Swim(swimming_course);
        std2.Swim(swimming_course);

        System.out.println(" ");
        System.out.println("Members in swimming course    ");
        System.out.println("------------------------------");
        swimming_course.list_member();

        System.out.println(" ");
        System.out.println("Member in football course    ");
        System.out.println("------------------------------");
        football_course.list_member();


    }

}
