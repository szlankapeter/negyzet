package negyzet;

public class Program {

    public static void main(String[] args) {
       feladat();
    }
    
    public static void feladat(){
        Negyzet a = new Negyzet();
        a.setOldal(5);
        a.setX(3);
        a.setY(4);
        System.out.println(a.allapot());
    }
    
}
