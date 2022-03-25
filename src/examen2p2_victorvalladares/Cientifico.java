package examen2p2_victorvalladares;

import java.util.ArrayList;

public class Cientifico {
    private String nombre;
    private ArrayList <Planeta> planetas = new ArrayList();

    public Cientifico() {
    }

    public Cientifico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
