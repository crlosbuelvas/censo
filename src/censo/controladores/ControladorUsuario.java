/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ControladorUsuario {
    
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloUsuario ms;
    
    public ControladorUsuario(ModeloUsuario ms){
        this.ms = ms;
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
    }
    
    public ModeloUsuario Select(String consulta){
        if(consulta.equals("SelectForLogin")){
            try{
                preparedStatement = con.prepareStatement("SELECT id_usuario, cod_id, ape1_usuario, ape2_usuario, nom_usuario, " +
                        "dir_usuario, tel_usuario, mail_usuario, cod_perfil, contrasena_usuario " +
                        "FROM public.usuarios WHERE cod_id = ? AND contrasena_usuario = ?;");
                preparedStatement.setLong(1, ms.getCodId());
                preparedStatement.setString(2, ms.getContrasenaUsuario());
                
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    ms.setApe1Usuario(resultSet.getString("ape1_usuario"));
                    ms.setApe2Usuario(resultSet.getString("ape2_usuario"));
                    ms.setNomUsuario(resultSet.getString("nom_usuario"));
                    ms.setIdUsuario(resultSet.getLong("id_usuario"));
                    ms.setCodId(resultSet.getLong("cod_id"));
                    ms.setCodPerfil(resultSet.getLong("cod_perfil"));

                    resultSet.close();
                    preparedStatement.close();
                    con.close();
                    
                    return ms;
                }
            }catch(SQLException e){
                e.printStackTrace();
                System.err.println("hay un error en la consulta select for login");
                JOptionPane.showMessageDialog(null, "error: " + e.getMessage(), "Error!!!", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        }
        return null;
    }
    
    public int InsertarActualizar(String consulta){
        if(consulta.equals("Insert")){
            try{
                preparedStatement = con.prepareStatement("INSERT INTO public.usuarios(cod_id, ape1_usuario, ape2_usuario, nom_usuario, dir_usuario, tel_usuario, mail_usuario, cod_perfil, contrasena_usuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
                preparedStatement.setLong(1, ms.getCodId());
                preparedStatement.setString(2, ms.getApe1Usuario());
                preparedStatement.setString(3, ms.getApe2Usuario());
                preparedStatement.setString(4, ms.getNomUsuario());
                preparedStatement.setString(5, ms.getDir());
                preparedStatement.setLong(6, ms.getTelUsuario());
                preparedStatement.setString(7, ms.getMailuUsuario());
                preparedStatement.setLong(8, ms.getCodPerfil());
                preparedStatement.setString(9, ms.getContrasenaUsuario());
                
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
