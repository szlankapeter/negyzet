package negyzet;

public class Negyzet {

    private int oldal;
    public void setOldal(int oldal) {
        if (oldal < 0) {
            this.oldal = 1;
        } else {
            this.oldal = oldal;
        }

    }

    public String allapot(int x ,int y) {
        return "x=" + x + " y=" + y + " oldal=" + this.oldal + " T=" + terulet();
    }

    private int terulet() {
        return this.oldal * this.oldal;
    }

}
