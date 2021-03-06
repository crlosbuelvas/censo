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
                preparedStatement = con.prepareStatement("SELECT id_usuario, numero_de_documento, apellido1, apellido2, nombre, " +
                        "direccion, telefono, correo, cod_perfil, contrasena_usuario " +
                        "FROM public.usuarios WHERE numero_de_documento = ? AND contrasena_usuario = ?;");
                preparedStatement.setLong(1, ms.getNumeroDeDocumento());
                preparedStatement.setString(2, ms.getContrasenaUsuario());
                
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    ms.setApellido1(resultSet.getString("apellido1"));
                    ms.setApellido2(resultSet.getString("apellido2"));
                    ms.setNombre(resultSet.getString("nombre"));
                    ms.setIdUsuario(resultSet.getLong("id_usuario"));
                    ms.setNumeroDeDocumento(resultSet.getLong("numero_de_documento"));
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
                preparedStatement = con.prepareStatement("INSERT INTO public.usuarios(numero_de_documento, apellido1, apellido2, nombre, direccion, telefono, correo, cod_perfil, contrasena_usuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
                preparedStatement.setLong(1, ms.getNumeroDeDocumento());
                preparedStatement.setString(2, ms.getApellido1());
                preparedStatement.setString(3, ms.getApellido2());
                preparedStatement.setString(4, ms.getNombre());
                preparedStatement.setString(5, ms.getDireccion());
                preparedStatement.setLong(6, ms.getTelefono());
                preparedStatement.setString(7, ms.getCorreo());
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
