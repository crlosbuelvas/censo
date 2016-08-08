/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloReporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ControladorReporte {
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloReporte MR = null;
    
    public ControladorReporte(ModeloReporte MR){
        this.MR = MR;
        
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
    }
    
    public int InsertarActualizar(String consulta){
        if(consulta.equals("Insert")){
            try{
                preparedStatement = con.prepareStatement("INSERT INTO public.reporte_espejo"
                        + "(tabla, clave_primaria, estado, fecha_de_alta, accion, usuario) "
                        + "VALUES "
                        + "(?, ?, ?, current_date, ?, ?);");
                preparedStatement.setString(1, MR.getTabla());
                preparedStatement.setLong(2, MR.getClavePrimaria());
                preparedStatement.setInt(3, MR.getEstado());
                preparedStatement.setString(4, MR.getAccion());
                preparedStatement.setLong(5, MR.getUsuario());
                
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
