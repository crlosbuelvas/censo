/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloPoseedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ControladorPoseedor {
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloPoseedor MP = null;
    
    public ControladorPoseedor(ModeloPoseedor MP){
        this.MP = MP;
        
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
    }
    
    public int InsertarActualizar(String consulta){
        if(consulta.equals("InsertInicial")){
            try{
                preparedStatement = con.prepareStatement("INSERT INTO public.poseedores(tipo_id, ape1_pos, ape2_pos, nom_pos, tipo_documento) VALUES (?, ?, ?, ?, ?);");
                preparedStatement.setInt(1, MP.getTipoId());
                preparedStatement.setString(2, MP.getApe1Pos());
                preparedStatement.setString(3, MP.getApe2Pos());
                preparedStatement.setString(4, MP.getNomPos());
                preparedStatement.setString(5, MP.getTipoDocumento());
                
                int r = preparedStatement.executeUpdate();
                
                preparedStatement.close();
                con.close();
                
                return r;
            }catch(SQLException e){
                System.err.println("error");
            }
            
        }
        return 3;
    }
}
