package examen2p2_victorvalladares;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


public class HiloProgressBar extends Thread{
    Random r = new Random();
    
    private JProgressBar barra;
    private Planeta planeta1;
    private Planeta planeta2;
    private Cientifico cientifico;
    private boolean existe;
    
    public HiloProgressBar(JProgressBar barra, Planeta planeta1, Planeta planeta2, Cientifico cientifico) {
        this.barra = barra;
        this.planeta1 = planeta1;
        this.planeta2 = planeta2;
        this.cientifico = cientifico;
        existe = true;
    }
    
    @Override
    public void run(){
        while(existe){
            barra.setValue(barra.getValue()+1);
            if(barra.getValue()==barra.getMaximum()){
                existe=false;
                JOptionPane.showMessageDialog(null, "La colision ha terminado");
                barra.setValue(0);
                
                int colision =  r.nextInt(100)+0;
                //colision = 15;
                int x = (planeta1.getX()+planeta2.getX())/2;
                int y = (planeta1.getY()+planeta2.getY())/2;
                int peso = (planeta1.getPeso()+planeta2.getPeso())/2;
                int size = (planeta1.getSize()+planeta2.getSize())/2;

                if (planeta1 instanceof Terrestre){
                    if(colision <= 25){
                        JOptionPane.showMessageDialog(null, "Se ha creado un nuevo planeta");
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo planeta");
                        Terrestre terrestre = new Terrestre (nombre, size, peso, x, y);
                        cientifico.getPlanetas().add(terrestre);
                    }
                }else if (planeta2 instanceof Gaseoso){
                    if(colision <= 20){
                        JOptionPane.showMessageDialog(null, "Se ha creado un nuevo planeta");
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo planeta");
                        Gaseoso gaseoso = new Gaseoso (nombre, size, peso, x, y);
                        cientifico.getPlanetas().add(gaseoso);
                    }
                }

            }                
            
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
            }
        }
    }
}
