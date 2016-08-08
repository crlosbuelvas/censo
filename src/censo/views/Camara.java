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
import com.github.sarxos.webcam.WebcamUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;


public class Camara extends JPanel implements Runnable, ActionListener {
    
    private BufferedImage img;
    private boolean imgsusses;
    private Webcam w;
    
    private JButton tomar_foto;
    public JButton reiniciar;
    
    private final Dimension size;
    
    public Camara() {
        imgsusses = false;//nos dira si se a tomado uuna foto
        
        w = Webcam.getDefault();//obtenemos la camara por defecto
        w.setViewSize(new Dimension(320,240));//le damos una resolucion
        w.open(true);//encendemos la camara
        img = w.getImage();//y obtenemos su iimagen
        
        //le damos tamaño al panel de la camara
        this.size = new Dimension(224, 224);
        setSize(this.size);
        
        //inicializamos el hilo que actualizara la imagen de la camara pra dar el efecto de video
        //lo que hace este hilo se muestra en la funcion run de mas abajo
        Thread tc = new Thread(this);
        tc.start();
        
        //le decimos el layout o distribucion que utilizara el panel
        setLayout(null);
        
        //creamos los botones de tomar foto y reiniciar
        tomar_foto = new JButton("Foto");
        tomar_foto.setBounds(0, 188, 100 , 30);
        reiniciar = new JButton("Reiniciar");
        reiniciar.setBounds(120, 188, 100, 30);
        
        //creamos los eventos de el click en los botones se muestran en la funcion actionPerformed() de mas adelante
        tomar_foto.addActionListener(this);
        reiniciar.addActionListener(this);
        
        //añadimos los botones
        add(tomar_foto);
        add(reiniciar);
        
    }
    
    public byte[] GetImagenBytea(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write( img, "jpg", baos );
            baos.flush();
            byte[] imageInByte = baos.toByteArray();
            baos.close();
            
            return imageInByte;
        } catch (IOException ex) {
            Logger.getLogger(Camara.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public void run() {
        while(true) {
            if(!imgsusses){
                img = w.getImage();//actualiza la imagen
                repaint();//llama a la funcion PaintComponent
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
        g.drawImage(img, 0, 0, 224, 185, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton B = (JButton) e.getSource();
        if(B == tomar_foto && !imgsusses){
            imgsusses = true;
            w.close();
        }else if(B == reiniciar && imgsusses){
            w.open(true);
            imgsusses = false;
        }
    }
}
