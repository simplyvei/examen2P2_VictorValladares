package examen2p2_victorvalladares;

import java.io.Serializable;

public class Planeta implements Serializable{
    private String nombre;
    private int size;
    private int peso;
    private int x;
    private int y;

    public Planeta() {
    }

    public Planeta(String nombre, int size, int peso, int x, int y) {
        this.nombre = nombre;
        this.size = size;
        this.peso = peso;
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
}
