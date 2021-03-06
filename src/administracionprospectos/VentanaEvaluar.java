/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracionprospectos;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author José Carlos Jiménez
 */
public class VentanaEvaluar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEvaluar
     */
    DefaultTableModel modelo;
    DBConexion dbc = new DBConexion();
    String id;
    public VentanaEvaluar() {
        initComponents();
        
        String[] titulo = {"id", "Nombre", "Apellido Paterno", "Apellido Materno", 
            "calle", "numero", "colonia", "codigo Postal","Telefono", "RFC",
            "status", "Observaciones"};
        modelo = new DefaultTableModel(null,titulo);
        tblEvaluar.setModel(modelo);
        mostarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEvaluar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRechazar = new javax.swing.JButton();
        btnAutorizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tblEvaluar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblEvaluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEvaluar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblEvaluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblEvaluar.setSelectionBackground(new java.awt.Color(222, 222, 222));
        tblEvaluar.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblEvaluar.setShowVerticalLines(false);
        tblEvaluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEvaluarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEvaluar);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Evaluar Prospecto");

        btnRechazar.setBackground(new java.awt.Color(255, 87, 87));
        btnRechazar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnRechazar.setForeground(new java.awt.Color(255, 255, 255));
        btnRechazar.setText("Rechazar");
        btnRechazar.setBorderPainted(false);
        btnRechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechazarActionPerformed(evt);
            }
        });

        btnAutorizar.setBackground(new java.awt.Color(172, 233, 125));
        btnAutorizar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAutorizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAutorizar.setText("Autorizar");
        btnAutorizar.setBorderPainted(false);
        btnAutorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorizarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(10, 81, 175));

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Prospectos");

        btnSalir1.setBackground(new java.awt.Color(255, 22, 22));
        btnSalir1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setText("X");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(290, 290, 290)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnSalir1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(10, 81, 175));
        btnVolver.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(44, 44, 44)
                        .addComponent(btnRechazar)
                        .addGap(48, 48, 48)
                        .addComponent(btnAutorizar)
                        .addGap(93, 93, 93))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRechazar)
                    .addComponent(btnAutorizar)
                    .addComponent(btnVolver))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarActionPerformed
        dbc.modificarDatos("UPDATE tblprospectos set status='Rechazado', "
                + "observaciones='" +JOptionPane.showInputDialog("Indique las observaciones de rechazo:")
                + "' WHERE id='"+id+"';");
        JOptionPane.showMessageDialog(null, "El prospecto fue rechazado");
        modelo.setRowCount(0);
        mostarDatos();
    }//GEN-LAST:event_btnRechazarActionPerformed

    private void tblEvaluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEvaluarMouseClicked
        if(evt.getClickCount() == 1){
            JTable lector = (JTable) evt.getSource();
            
            //el lector guarda el id del prospecto en la variable id
            id = lector.getModel().getValueAt(lector.getSelectedRow(),0).toString();
            System.out.println(id);
        }
    }//GEN-LAST:event_tblEvaluarMouseClicked

    private void btnAutorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorizarActionPerformed
        dbc.modificarDatos("UPDATE tblprospectos set status='Autorizado' WHERE id='"+id+"';");
        JOptionPane.showMessageDialog(null, "El prospecto fue autorizado");
        modelo.setRowCount(0);
        mostarDatos();
    }//GEN-LAST:event_btnAutorizarActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.hide();
        Ventana v =new Ventana();
        v.setLocationRelativeTo(null);
        v.show();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public void mostarDatos(){
        DBConexion dbc = new DBConexion();
        
        try {
            ResultSet resultado = dbc.consultarDatos("SELECT * FROM tblprospectos;");
            
            while(resultado.next()){
                Object[] obj = {
                    resultado.getString("id"),
                    resultado.getString("nombre"),
                    resultado.getString("apellidoPaterno"),
                    resultado.getString("apellidoMaterno"),
                    resultado.getString("calle"),
                    resultado.getString("numero"),
                    resultado.getString("colonia"),
                    resultado.getString("codigoPostal"),
                    resultado.getString("telefono"),
                    resultado.getString("rfc"),
                    resultado.getString("status"),
                    resultado.getString("observaciones"),};
                
                modelo.addRow(obj);
            }
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaEvaluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEvaluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEvaluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEvaluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEvaluar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutorizar;
    private javax.swing.JButton btnRechazar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEvaluar;
    // End of variables declaration//GEN-END:variables
}
