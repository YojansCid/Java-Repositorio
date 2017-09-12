/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otroPaquete;

/**
 *
 * @author Yojans Cid
 */
public class cityCar {
    
    private int kilometrosPorLitro;
    private int peso;

    public cityCar(int kilometrosPorLitro, int peso) {
        this.kilometrosPorLitro = kilometrosPorLitro;
        this.peso = peso;
    }

    public int getKilometrosPorLitro() {
        return kilometrosPorLitro;
    }

    public void setKilometrosPorLitro(int kilometrosPorLitro) {
        this.kilometrosPorLitro = kilometrosPorLitro;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
