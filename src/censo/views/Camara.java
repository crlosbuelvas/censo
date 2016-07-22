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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Camara extends JPanel implements Runnable, ActionListener {
    
    private BufferedImage img;
    private boolean imgsusses;
    private Webcam w;
    
    private JButton tomar_foto;
    private JButton reiniciar;
    
    private final Dimension size;
    
    public Camara() {
        imgsusses = false;
        
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
        
        tomar_foto.addActionListener(this);
        reiniciar.addActionListener(this);
        
        add(tomar_foto);
        add(reiniciar);
        
    }
    
    @Override
    public void run() {
        while(true) {
            if(!imgsusses){
                img = w.getImage();
                repaint();
            }
            try {
                    Thread.sleep(1);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton B = (JButton) e.getSource();
        if(B == tomar_foto){
            imgsusses = true;
            w.close();
        }else if(B == reiniciar){
            w.open(true);
            imgsusses = false;
        }
    }
}
