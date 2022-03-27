package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {
        Books vbook1, vbook2, vbook3;
        MaltepeLibrary myLib = new MaltepeLibrary();

        Profs prf1 = new Profs(2002020,"Ensar Gül ",50,25);
        Students std1 = new Students(100102933,"Suna ÖZTÜRK", 39,prf1);

        std1.ShowInfo();
        prf1.ShowInfo();

        vbook1 = new Books("Java Programing");
        vbook2 = new Books("C Programming  ");
        vbook3 = new Books("C++ Programming");

        myLib.addBook(vbook1);
        myLib.addBook(vbook2);
        myLib.addBook(vbook3);

        System.out.println("Book List                     ");
        System.out.println("------------------------------");
        myLib.list_books();

        myLib.lendBook(prf1,vbook1);
        myLib.lendBook(std1,vbook2);
        myLib.lendBook(std1,vbook1);

        myLib.borrowBook(prf1,vbook1);
        myLib.lendBook(std1,vbook1);

        prf1.ShowHaveBooks();
        std1.ShowHaveBooks();

    }

}
