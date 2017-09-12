/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Camioneta extends Auto{
    
    private int cabina;
    private int pesoDeCarga;

    public Camioneta(int cabina, int pesoDeCarga, int ruedas, int puertas, String color) {
        super(ruedas, puertas, color);
        this.cabina = cabina;
        this.pesoDeCarga = pesoDeCarga;
        
    }

 

    public int getCabina() {
        return cabina;
    }

    public void setCabina(int cabina) {
        this.cabina = cabina;
    }

    public int getPesoDeCarga() {
        return pesoDeCarga;
    }

    public void setPesoDeCarga(int pesoDeCarga) {
        this.pesoDeCarga = pesoDeCarga;
    }
    
    
}
