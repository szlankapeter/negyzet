/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negyzet;

/**
 *
 * @author szlanka.peter
 */
public class Negyzet {

    
    private Koordináta k;
    private int oldal;

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

    public void setOldal(int oldal) {
        this.oldal = oldal;
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
