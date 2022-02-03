/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracionprospectos;

/**
 *
 * @author José Carlos Jiménez
 */
public class AdministracionProspectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mandamos llamar a la ventana de menu
        Ventana v =new Ventana();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        
        //conexion con la base de datos
        DBConexion con = new DBConexion();
        con.getConexion();
    }
    
}
