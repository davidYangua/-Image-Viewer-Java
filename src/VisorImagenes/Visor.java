package VisorImagenes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Visor extends JPanel{
    
    private String ruta;
    
    public Visor(int ancho, int largo, String ruta){
        this.setSize(ancho, largo);
        this.ruta = ruta;
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Dimension d = this.getSize();
        ImageIcon img = new ImageIcon(ruta);
        if(img.getIconWidth()>img.getIconHeight()){
            g.drawImage(img.getImage(), 20, 10, d.width-40, d.height-20, null);
        }else{
            g.drawImage(img.getImage(),(d.width/5),(d.height/10),(int)(d.width*0.6), (int)(d.height*0.8), null);
        }
    }
}
