/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloImagen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ControladorImagen {
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloImagen MI = null;
    
    public ControladorImagen(ModeloImagen MI){
        this.MI = MI;
        
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
    }
    
    public int InsertarActualizar(String consulta){
        if(consulta.equals("InsertInicial")){
            try{
                preparedStatement = con.prepareStatement("INSERT INTO public.propietario_imagen(id_imagen, nombre, imagen) VALUES (?, ?, ?);");
                preparedStatement.setInt(1, MI.getIdImagen());
                preparedStatement.setString(2, MI.getNombre());
                preparedStatement.setBytes(3, MI.getImagenBytea());
                
                int r = preparedStatement.executeUpdate();
                
                preparedStatement.close();
                con.close();
                
                return r;
            }catch(SQLException e){
                e.printStackTrace();
                System.err.println("error: " + e.getMessage());
            }
            
        }
        return 3;
    }
}
