package proyecto;

import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author diego
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Clientes() {
        initComponents();
        setTitle("Ventana Registro de Clientes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreCliente = new javax.swing.JTextField();
        CedulaCliente = new javax.swing.JTextField();
        FechaCliente = new javax.swing.JTextField();
        CorreoCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Oro = new javax.swing.JCheckBox();
        Plata = new javax.swing.JCheckBox();
        Bronce = new javax.swing.JCheckBox();
        Zafiro = new javax.swing.JCheckBox();
        RegistrarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrar Cliente");

        jLabel2.setText("Nombre Completo");

        jLabel3.setText("Cedula");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Correo");

        NombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreClienteActionPerformed(evt);
            }
        });

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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(CorreoCliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FechaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(CedulaCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NombreCliente, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(427, 427, 427))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Oro)
                            .addComponent(jLabel6)
                            .addComponent(Plata)
                            .addComponent(Bronce)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Zafiro)
                                .addGap(242, 242, 242)
                                .addComponent(RegistrarCliente)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addGap(373, 373, 373))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(FechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(CorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)
                                .addComponent(Oro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Plata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bronce)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Zafiro))
                            .addComponent(CedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegistrarCliente)
                        .addGap(27, 27, 27))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     Pila mipila = new Pila();
    private void NombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreClienteActionPerformed

    private void PlataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlataActionPerformed
        Plata.setSelected(true);
    }//GEN-LAST:event_PlataActionPerformed

    private void ZafiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZafiroActionPerformed
        Zafiro.setSelected(true);
    }//GEN-LAST:event_ZafiroActionPerformed

    private void RegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarClienteActionPerformed
      
           
       
        String Nombre = NombreCliente.getText();
        Long Cedula = Long.parseLong(CedulaCliente.getText());
        String Fecha = FechaCliente.getText();
        String Correo = CorreoCliente.getText();
        //System.out.println(Nombre+Cedula+Fecha+Correo);
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

    private void OroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OroActionPerformed
        Oro.setSelected(true);
    }//GEN-LAST:event_OroActionPerformed

    private void BronceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BronceActionPerformed
        Bronce.setSelected(true);
    }//GEN-LAST:event_BronceActionPerformed
    
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
    protected static javax.swing.JCheckBox Bronce;
    protected static javax.swing.JTextField CedulaCliente;
    protected static javax.swing.JTextField CorreoCliente;
    protected static javax.swing.JTextField FechaCliente;
    protected static javax.swing.JTextField NombreCliente;
    protected static javax.swing.JCheckBox Oro;
    protected static javax.swing.JCheckBox Plata;
    protected static javax.swing.JButton RegistrarCliente;
    protected static javax.swing.JCheckBox Zafiro;
    protected static javax.swing.JLabel jLabel1;
    protected static javax.swing.JLabel jLabel2;
    protected static javax.swing.JLabel jLabel3;
    protected static javax.swing.JLabel jLabel4;
    protected static javax.swing.JLabel jLabel5;
    protected static javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
