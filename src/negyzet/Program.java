package negyzet;

public class Program {

    public static void main(String[] args) {
       new Program().feladat();
    }
    
    public void feladat(){
        
        Negyzet a = new Negyzet(new Koordináta(3, 4), 5);
        Negyzet b = new Negyzet(new Koordináta(1, 4), 6);
        
        System.out.println(a.allapot());
        System.out.println(a.osszehasonlit(b));
        
    }
    
}
