
package administracionprospectos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConexion {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    private static final String URL = "jdbc:mysql://localhost:3306/dbprospectos?" + "user="+USER+"&password="+PASSWORD+"&useSSL=false";
    
    private static Connection con = null;
    
    public Connection getConexion(){
        try {
            Class.forName(DRIVER);
            con = (Connection) DriverManager.getConnection(URL);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error en la conexion" + e);
        }
        return con;
    }
    
    public void agregarProspecto(String comando){
        
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(comando);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Los campos con * no deben estar vacios");
        }
        JOptionPane.showMessageDialog(null, "El prospecto se agregó correctamente");
    }
    
    public ResultSet consultarDatos(String comando){
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(comando);
            ResultSet respuesta = ps.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println("erros al consultar" + e);
            return null;
        }
    }
    public void modificarDatos(String comando){
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(comando);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("problema al modificar "+ e);
        }
    }
}
