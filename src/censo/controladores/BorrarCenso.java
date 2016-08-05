/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class BorrarCenso {
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    int r;
    
    public BorrarCenso(long n_censo){
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
        try{
            preparedStatement = con.prepareStatement("DELETE FROM public.vehiculos WHERE n_censo = ?;");
            preparedStatement.setLong(1, n_censo);
            r = preparedStatement.executeUpdate();
        }catch(SQLException e){
                System.err.println("error: " + e.getMessage());
        }
        try{
            preparedStatement = con.prepareStatement("DELETE FROM public.poseedores WHERE id_poseedor = ?;");
            preparedStatement.setLong(1, n_censo);
            r = preparedStatement.executeUpdate();
        }catch(SQLException e){
                System.err.println("error: " + e.getMessage());
        }
        try{
            preparedStatement = con.prepareStatement("DELETE FROM public.propietarios WHERE id_propietario = ?;");
            preparedStatement.setLong(1, n_censo);
            r = preparedStatement.executeUpdate();
        }catch(SQLException e){
                System.err.println("error: " + e.getMessage());
        }
        try{
            preparedStatement = con.prepareStatement("DELETE FROM public.propietario_imagen WHERE id_imagen = ?;");
            preparedStatement.setLong(1, n_censo);
            r = preparedStatement.executeUpdate();
        }catch(SQLException e){
                System.err.println("error: " + e.getMessage());
        }
        try{
            preparedStatement = con.prepareStatement("DELETE FROM public.conductores WHERE id_vehiculo = ?;");
            preparedStatement.setLong(1, n_censo);
            r = preparedStatement.executeUpdate();
        }catch(SQLException e){
                System.err.println("error: " + e.getMessage());
        }
        try{
            preparedStatement = con.prepareStatement("DELETE FROM public.censo WHERE n_censo = ?;");
            preparedStatement.setLong(1, n_censo);
            r = preparedStatement.executeUpdate();
        }catch(SQLException e){
                System.err.println("error: " + e.getMessage());
        }
    }
}
