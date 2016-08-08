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
    
    public ModeloImagen Select(String consulta){
        if(consulta.equals("SelectForId")){
            try{
                preparedStatement = con.prepareStatement("SELECT n_censo, nombre, imagen FROM public.persona_imagen WHERE n_censo = ?;");
                preparedStatement.setLong(1, MI.getNCenso());
                
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    
                    System.out.println(resultSet.getBinaryStream("imagen"));
                    //System.out.println(resultSet.getByte("imagen"));
                    MI.setNCenso(resultSet.getLong("n_censo"));
                    MI.setNombre(resultSet.getString("nombre"));
                    MI.setImagen(resultSet.getBytes("imagen"));
                }
                
                resultSet.close();
                preparedStatement.close();
                con.close();
                
                return MI;
            }catch(SQLException e){
                System.err.println("error en SelectForId");
            }
            
        }
        return null;
    }
    
    public int InsertarActualizar(String consulta){
        if(consulta.equals("InsertInicial")){
            try{
                preparedStatement = con.prepareStatement("INSERT INTO public.persona_imagen(n_censo, nombre, imagen) VALUES (?, ?, ?);");
                preparedStatement.setLong(1, MI.getNCenso());
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
