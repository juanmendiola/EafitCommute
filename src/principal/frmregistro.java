
package principal;

import conexion.conexionmysql;
import java.sql.*;
import javax.swing.JOptionPane;
public class frmregistro extends javax.swing.JFrame {
conexion.conexionmysql con=new conexionmysql();
Connection cn=con.conectar();
public frmregistro() {
        initComponents();
        setLocationRelativeTo(null);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnregistrousuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtconfirmarclave = new javax.swing.JPasswordField();
        txtclave = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrarte");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 21, -1, -1));

        txtnombre.setBackground(new java.awt.Color(204, 204, 204));
        txtnombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(0, 0, 0));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 132, 114, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 103, 71, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 103, 71, -1));

        txtcorreo.setBackground(new java.awt.Color(204, 204, 204));
        txtcorreo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 194, 189, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo institucional:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 171, -1, -1));

        txtapellido.setBackground(new java.awt.Color(204, 204, 204));
        txtapellido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtapellido.setForeground(new java.awt.Color(0, 0, 0));
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 132, 114, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 233, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirma tu contraseña:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 296, -1, -1));

        btnregistrousuario.setBackground(new java.awt.Color(255, 204, 0));
        btnregistrousuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnregistrousuario.setForeground(new java.awt.Color(0, 0, 0));
        btnregistrousuario.setText("Registrar");
        btnregistrousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrousuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 422, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 422, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Es rápido y fácil.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 62, -1, -1));

        txtconfirmarclave.setBackground(new java.awt.Color(204, 204, 204));
        txtconfirmarclave.setForeground(new java.awt.Color(0, 0, 0));
        txtconfirmarclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirmarclaveActionPerformed(evt);
            }
        });
        jPanel1.add(txtconfirmarclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 319, 189, -1));

        txtclave.setBackground(new java.awt.Color(204, 204, 204));
        txtclave.setForeground(new java.awt.Color(0, 0, 0));
        txtclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclaveActionPerformed(evt);
            }
        });
        jPanel1.add(txtclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 256, 189, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d1320ba22d23843cab56829012a0f075 (4).jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed
    
    private void btnregistrousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrousuarioActionPerformed
   String nombre=txtnombre.getText();
   String apellido=txtapellido.getText();
   String correo=txtcorreo.getText();
   String clave=txtclave.getText();
   String confirrmarclave=txtconfirmarclave.getText();
   
   
   if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || clave.isEmpty() || confirrmarclave.isEmpty()) {
       JOptionPane.showMessageDialog(this, "DEBE COMPLETAR LOS DATOS", "Error", JOptionPane.ERROR_MESSAGE);
   } else if (!correo.endsWith("@eafit.edu.co")) {
       JOptionPane.showMessageDialog(null, "El correo electrónico debe tener el dominio @eafit.edu.co", "Error de correo electrónico", JOptionPane.ERROR_MESSAGE);
   } else if (!confirrmarclave.equals(clave)) {
              JOptionPane.showMessageDialog(this, "La contraseña debe coincidir.", "Error", JOptionPane.ERROR_MESSAGE);

   } else {
       try {
           String consultar="INSERT INTO usuarios(nombre,apellido,correo,clave,confirmarclave)VALUES('"+nombre+"','"+apellido+"','"+correo+"','"+clave+"','"+confirrmarclave+"')";
           
           PreparedStatement ps=cn.prepareStatement(consultar);
           limpiar();
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
           
           this.setVisible(false);
           frmlogin fr = new frmlogin();
           fr.setVisible(true);    
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "No se pudo guardar usuario"+e);
       }
   }
   
    }//GEN-LAST:event_btnregistrousuarioActionPerformed
    void limpiar (){
        txtnombre.setText("");
        txtapellido.setText("");
        txtcorreo.setText("");
        txtclave.setText("");
        txtconfirmarclave.setText("");
    }
    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
          
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.setVisible(false);
                    frmlogin fr = new frmlogin();
                    fr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclaveActionPerformed

    private void txtconfirmarclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirmarclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmarclaveActionPerformed

    public static void main(String args[]) {
      
        
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
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmregistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnregistrousuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JPasswordField txtconfirmarclave;
    public static javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
