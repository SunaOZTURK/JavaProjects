package tr.edu.maltepe.oop;
import java.util.Vector;

public class SportsCenter {
    private Vector members= new Vector();

    public SportsCenter(){

    }

    public  void enterGYM(Person person){
        members.add(person);
        System.out.println(person.getName() + " enter the gym.");
    }
    public  void leftGYM(Person person){
        members.remove(person);
        System.out.println(person.getName() + " left the gym");
    }

    public void list_member (){
        for (int i=0; i< members.size();i++ ){
            Person temp = (Person) members.get(i);
            System.out.println(temp.getName());
        }
    }
}
