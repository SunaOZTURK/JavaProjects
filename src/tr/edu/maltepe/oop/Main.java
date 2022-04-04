package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {

        Profs prf1 = new Profs(2002020,"Ensar Gül ",50,25);
        Students std1 = new Students(100102933,"Suna ÖZTÜRK", 39,prf1);

        std1.ShowInfo();
        prf1.ShowInfo();

        SportsCenter swimmingpool =new SportsCenter();
        SportsCenter football = new SportsCenter();

        prf1.PlayFootball(football);
        std1.Swim(swimmingpool);

        swimmingpool.list_member();
        football.list_member();


    }

}
