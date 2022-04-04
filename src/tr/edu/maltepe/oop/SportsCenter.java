package tr.edu.maltepe.oop;
import java.util.Vector;

public class SportsCenter {
    private Vector members= new Vector();

    public SportsCenter(){

    }

    public  void SalonaGit(Person person){
        members.add(person);
        System.out.println(person.getName() + "Spora Başladı");
    }
    public  void SalondanCik(Person person){
        members.remove(person);
        System.out.println(person.getName() + "Spordan Ayrıldı");
    }

    public void list_member (){
        for (int i=0; i< members.size();i++ ){
            Person temp = (Person) members.get(i);
            System.out.println(temp.getName());
        }
    }
}
