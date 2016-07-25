/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

/**
 *
 * @author Admin
 */

import java.sql.*;

public class Conexion {
    
    private Connection con = null;
    private boolean ConnectionFail = false;

    public boolean CrearConexion() {
        try {
            //0. driver a utilizar
            Class.forName("org.postgresql.Driver");
            //1. crear conexion
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Censo","postgres","1234");
            if(con!=null){
                return true;
            }
        } catch (Exception e1) {
            //3. si la conexion falla intentamos en otra base temporal y modificamos
            //   una variable que nos dira del fallo
            ConnectionFail = true;
            if(javax.swing.JOptionPane.showConfirmDialog(null, "", "Alerta!", javax.swing.JOptionPane.YES_NO_OPTION) == 0){
                return ConexionLocal();
            }
        }
        return false;
    }
    
    private boolean ConexionLocal(){
        try {
            //0. driver a utilizar
            Class.forName("org.sqlite.JDBC");
            //1. crear conexion local
            con = DriverManager.getConnection("jdbc:sqlite:temp.db");
            if(con!=null){
                return true;
            }
        }catch(ClassNotFoundException | SQLException e2){
            //3. si la conexion local falla el programa deve detenerse
            e2.printStackTrace();
            System.exit(1);
        }
        return false;
    }
    
    public Connection getConexion(){
        return con;
    }
}
