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

    public Conexion() {
        try {
            //1. crear conexion
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/suin", "root", "");
            //2. crear objeto statement
            statement = con.createStatement();
        } catch (Exception e1) {
            try {
                
            }catch(Exception e2){
                
            }
        } finally {
        }

    }
}
