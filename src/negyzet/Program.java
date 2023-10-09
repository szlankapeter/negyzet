package negyzet;

public class Program {

    public static void main(String[] args) {
       new Program().feladat();
    }
    
    public void feladat(){
        Negyzet a = new Negyzet();
        Koordinata kr = new Koordinata();
        a.setOldal(10);
        kr.setX(20);
        kr.setY(29);
        System.out.println(a.allapot(kr.getX(),kr.getY()));
    }
    
}
