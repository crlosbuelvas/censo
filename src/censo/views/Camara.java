/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.views;

/**
 *
 * @author Admin
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.github.sarxos.webcam.Webcam;
import javax.swing.JButton;


public class Camara extends JPanel implements Runnable{
    
    BufferedImage img;
    Webcam w;
    
    JButton tomar_foto;
    JButton reiniciar;
    
    private final Dimension size;
    
    public Camara() {
        
        w = Webcam.getDefault();
        w.setViewSize(new Dimension(320,240));
        w.open(true);
        img = w.getImage();
        
        this.size = new Dimension(img.getWidth(), img.getHeight());
        setSize(this.size);
        
        Thread tc = new Thread(this);
        tc.start();
        
        setLayout(null);
        
        tomar_foto = new JButton("Foto");
        tomar_foto.setBounds(50, 250, 100 , 30);
        reiniciar = new JButton("Reiniciar");
        reiniciar.setBounds(170, 250, 100, 30);
        
        add(tomar_foto);
        add(reiniciar);
        
    }
    
    @Override
    public void run() {
        while(true) {
            img = w.getImage();
            repaint();
            try {
                    Thread.sleep(100);
            } catch (InterruptedException e) {
                    return;
            }
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, 320, 240, null);
    }
}
