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
    
    private int x;
    private int y;
    private int oldal;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setOldal(int oldal) {
        this.oldal = oldal;
    }
    
    
    public String allapot(){
        return "x=" + this.x + " y=" + this.y + " oldal=" + this.oldal;
    }
    
    public int terulet(){
        return oldal * oldal;
    }
    
    
    
}
