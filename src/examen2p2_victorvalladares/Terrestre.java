package examen2p2_victorvalladares;

import java.io.Serializable;

public class Terrestre extends Planeta implements Serializable{

    public Terrestre() {
        super.toString();
    }

    public Terrestre(String nombre, int size, int peso, int x, int y) {
        super(nombre, size, peso, x, y);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
