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
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private boolean ConnectionFail = false;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //1. crear conexion
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/suin", "root", "");
            //2. crear objeto statement
            statement = con.createStatement();
        } catch (Exception e1) {
            //3. si la conexion falla intentamos en otra base temporal y modificamos
            //   una variable que nos dira del fallo
            ConnectionFail = true;
            if(javax.swing.JOptionPane.showConfirmDialog(null, "", "Alerta!", javax.swing.JOptionPane.YES_NO_OPTION) == 0){
                ConexionLocal();
            }
        }
    }
    
    private void ConexionLocal(){
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:temp.db");
            statement = con.createStatement();
        }catch(ClassNotFoundException | SQLException e2){
            e2.printStackTrace();
            System.exit(1);
        }
    }
}
