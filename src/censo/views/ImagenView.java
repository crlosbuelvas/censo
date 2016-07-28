/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.views;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ImagenView extends JPanel{
    BufferedImage img = null;
    
    public void setImagen(BufferedImage img){
        this.img = img;
        repaint();
    }
    
    public void setImagenByte(byte[] img) throws IOException{
        InputStream in = new ByteArrayInputStream(img);
        this.img = ImageIO.read(in);
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        if(img != null){
            g.drawImage(img, 0, 0, getSize().width, getSize().height, null);
            System.out.println("hola");
        }
    }
}
