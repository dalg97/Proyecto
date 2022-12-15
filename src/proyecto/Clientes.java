
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Oro = new javax.swing.JCheckBox();
        Plata = new javax.swing.JCheckBox();
        Bronce = new javax.swing.JCheckBox();
        Zafiro = new javax.swing.JCheckBox();
        RegistrarCliente = new javax.swing.JButton();
        NombreCliente = new javax.swing.JTextField();
        CedulaCliente = new javax.swing.JTextField();
        FechaCliente = new javax.swing.JTextField();
        CorreoCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrar Cliente");

        jLabel2.setText("Nombre Completo");

        jLabel3.setText("Cedula");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Correo");

        jLabel6.setText("Categoria");

        Oro.setText("Oro");
        Oro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OroActionPerformed(evt);
            }
        });

        Plata.setText("Plata");
        Plata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlataActionPerformed(evt);
            }
        });

        Bronce.setText("Bronce");
        Bronce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BronceActionPerformed(evt);
            }
        });

        Zafiro.setText("Zafiro");
        Zafiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZafiroActionPerformed(evt);
            }
        });

        RegistrarCliente.setText("Registrar");
        RegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(Oro)
                                .addComponent(Plata)
                                .addComponent(Bronce)
                                .addComponent(Zafiro)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                        .addComponent(CedulaCliente)
                                        .addComponent(FechaCliente)
                                        .addComponent(CorreoCliente)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(297, 297, 297)
                            .addComponent(RegistrarCliente))))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addComponent(Oro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Plata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bronce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Zafiro)
                .addGap(30, 30, 30)
                .addComponent(RegistrarCliente)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Llamar a la pila
    static Pila mipila = new Pila();
    private void OroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OroActionPerformed
        Oro.setSelected(true);
    }//GEN-LAST:event_OroActionPerformed

    private void PlataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlataActionPerformed
        Plata.setSelected(true);
    }//GEN-LAST:event_PlataActionPerformed

    private void BronceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BronceActionPerformed
        Bronce.setSelected(true);
    }//GEN-LAST:event_BronceActionPerformed

    private void ZafiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZafiroActionPerformed
        Zafiro.setSelected(true);
    }//GEN-LAST:event_ZafiroActionPerformed

    private void RegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarClienteActionPerformed
        //Obtener los datos ingresados por los usuarios
        String Nombre = NombreCliente.getText();
        int Cedula = Integer.parseInt(CedulaCliente.getText());
        String Fecha = FechaCliente.getText();
        String Correo = CorreoCliente.getText();
        if(Oro.isSelected()){
            String Categoria = "Oro";
            //Crear la pila con Categoria Oro
            mipila.push(new Cliente(Cedula,Nombre,Fecha,
                Correo,Categoria));
        }else if(Zafiro.isSelected()){
            //Crear la pila con Categoria Zafiro
            String Categoria = "Zafiro";
            mipila.push(new Cliente(Cedula,Nombre,Fecha,
                Correo,Categoria));
        }else if(Plata.isSelected()){
            //Crear la pila con Categoria Plata
            String Categoria = "Plata";
            mipila.push(new Cliente(Cedula,Nombre,Fecha,
                Correo,Categoria));
        }else{
            //Crear la pila con Categoria Bronce
            String Categoria = "Bronce";
            mipila.push(new Cliente(Cedula,Nombre,Fecha,
                Correo,Categoria));
        }
        JOptionPane.showMessageDialog(null,"Cliente fue "
                + "Registrado exitosamente");
        limpiarClientes();//Limpiar los campos
    }//GEN-LAST:event_RegistrarClienteActionPerformed

    private void limpiarClientes(){
        //Limpiar todos los campos
        NombreCliente.setText("");
        CedulaCliente.setText("");
        FechaCliente.setText("");
        CorreoCliente.setText("");
        Oro.setSelected(false);
        Zafiro.setSelected(false);
        Plata.setSelected(false);
        Bronce.setSelected(false);
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Bronce;
    private javax.swing.JTextField CedulaCliente;
    private javax.swing.JTextField CorreoCliente;
    private javax.swing.JTextField FechaCliente;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JCheckBox Oro;
    private javax.swing.JCheckBox Plata;
    private javax.swing.JButton RegistrarCliente;
    private javax.swing.JCheckBox Zafiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
