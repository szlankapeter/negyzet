package negyzet;

public class Program {

    public static void main(String[] args) {
       new Program().feladat();
    }
    
    public void feladat(){
        Koordináta k = new Koordináta(3, 4);
        Negyzet a = new Negyzet(k, 5);
        System.out.println(a.allapot());
    }
    
}
