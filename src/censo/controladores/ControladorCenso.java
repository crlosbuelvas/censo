/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloCenso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ControladorCenso {
    
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloCenso MC = null;
    
    public ControladorCenso(ModeloCenso MC){
        this.MC = MC;
        
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
    }
    
    public ModeloCenso Select(String consulta){
        if(consulta.equals("SelectUltimo")){
            try{
                preparedStatement = con.prepareStatement("SELECT * FROM public.censo ORDER BY n_censo DESC LIMIT 1;");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    MC.setNCenso(resultSet.getLong("n_censo"));
                }
                resultSet.close();
                preparedStatement.close();
                con.close();
                
                return MC;
            }catch(SQLException e){
                System.err.println("error en SelectUltimo");
            }
            
        }
        return null;
    }
    
    public int InsertarActualizar(String consulta){
        if(consulta.equals("InsertInicial")){
            try{
                preparedStatement = con.prepareStatement("INSERT INTO public.censo(n_censo, fecha_alta) VALUES (? , current_date);");
                preparedStatement.setLong(1, MC.getNCenso());
                
                int r = preparedStatement.executeUpdate();
                
                preparedStatement.close();
                con.close();
                
                return r;
            }catch(SQLException e){
                System.err.println("error: " + e.getMessage());
                return 3;
            }
            
        }
        return 3;
    }
}
