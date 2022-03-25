package examen2p2_victorvalladares;

import java.io.Serializable;

public class Gaseoso extends Planeta implements Serializable{
    public Gaseoso() {
        super.toString();
    }

    public Gaseoso(String nombre, int size, int peso, int x, int y) {
        super(nombre, size, peso, x, y);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
