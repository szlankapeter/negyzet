package negyzet;

public class Negyzet {

    
    private Koordináta k;
    private int oldal;

    public Negyzet(){
        this(1);
    }
    
    public Negyzet(int a){
        this(new Koordináta(0, 0), a);
    }
    
    public Negyzet(Koordináta k, int oldal) {
        this.k = k;
        if (this.oldal < 0) {
            this.oldal = 1;
        } else {
            this.oldal = oldal;
        }
    }

    public String allapot() {
        return "x=" + k.getX() + " y=" + k.getY() + " oldal=" + this.oldal + " T=" + terulet();
    }

    private int terulet() {
        return this.oldal * this.oldal;
    }
    
    public void setK(Koordináta k) {
        this.k = k;
    }

    public int getOldal() {
        return oldal;
    }
    
    public Koordináta getK() {
        return k;
    }
    

}
