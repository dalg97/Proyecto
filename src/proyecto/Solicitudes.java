
package proyecto;

import javax.swing.JOptionPane;
import static proyecto.Clientes.CedulaCliente;
import static proyecto.Clientes.CorreoCliente;
import static proyecto.Clientes.FechaCliente;
import static proyecto.Clientes.NombreCliente;

/**
 *
 * @author diego
 */
public class Solicitudes extends javax.swing.JFrame {

    /**
     * Creates new form Solicitudes
     */
    public Solicitudes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    Cola micola = new Cola();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CedulaSolicitud = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FechaSolicitud = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EstadoSolicitud = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MarcaSolicitud = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PasajerosSolicitud = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DiasSolicitud = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ModeloSolicitud = new javax.swing.JTextField();
        CrearSolicitud = new javax.swing.JButton();
        SinLlave = new javax.swing.JCheckBox();
        Cargador = new javax.swing.JCheckBox();
        GPS = new javax.swing.JCheckBox();
        Sensores = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cedula");

        jLabel2.setText("Fecha");

        FechaSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaSolicitudActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado");

        jLabel4.setText("Marca");

        jLabel5.setText("Pasajeros");

        jLabel6.setText("Extras");

        jLabel7.setText("Dias");

        jLabel8.setText("Modelo");

        CrearSolicitud.setText("Crear Solicitud");
        CrearSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearSolicitudActionPerformed(evt);
            }
        });

        SinLlave.setText("Arranque sin llave");
        SinLlave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinLlaveActionPerformed(evt);
            }
        });

        Cargador.setText("Cargador Inalambrico");

        GPS.setText("GPS - Navegador en tiempo real");
        GPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPSActionPerformed(evt);
            }
        });

        Sensores.setText("Sensores + Camara reversa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CedulaSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                            .addComponent(FechaSolicitud)
                                            .addComponent(EstadoSolicitud))))
                                .addGap(268, 268, 268))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ModeloSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(DiasSolicitud)
                                    .addComponent(MarcaSolicitud)
                                    .addComponent(PasajerosSolicitud))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SinLlave)
                            .addComponent(jLabel6)
                            .addComponent(Cargador)
                            .addComponent(GPS)
                            .addComponent(Sensores)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(CrearSolicitud)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CedulaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(EstadoSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(SinLlave)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(MarcaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cargador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GPS)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(PasajerosSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Sensores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(DiasSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModeloSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(CrearSolicitud)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FechaSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaSolicitudActionPerformed

    private void CrearSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearSolicitudActionPerformed
       int Cedula = Integer.parseInt(CedulaSolicitud.getText());
       String Fecha = FechaSolicitud.getText();
       String Estado = EstadoSolicitud.getText();
       String Marca = MarcaSolicitud.getText();
       int Pasajeros = Integer.parseInt(PasajerosSolicitud.getText());
       int Dias = Integer.parseInt(DiasSolicitud.getText());
       String Modelo = ModeloSolicitud.getText();
     
       if(SinLlave.isSelected()){
           String Extras = "Arranque sin llave";
           micola.encola(new Solicitud(Cedula,Fecha,Dias,
               Estado,Pasajeros,Marca,Modelo,
               Extras));
       }else if(Cargador.isSelected()){
           String Extras = "Cargador Inalambrico";
           micola.encola(new Solicitud(Cedula,Fecha,Dias,
               Estado,Pasajeros,Marca,Modelo,
               Extras));
       }else if(GPS.isSelected()){
           String Extras = "GPS - Navegador en tiempo real";
           micola.encola(new Solicitud(Cedula,Fecha,Dias,
               Estado,Pasajeros,Marca,Modelo,
               Extras));
       }else{
           String Extras = "Sensores + Camara reversa";
           micola.encola(new Solicitud(Cedula,Fecha,Dias,
               Estado,Pasajeros,Marca,Modelo,
               Extras));
       }
       JOptionPane.showMessageDialog(null,"Solicitud "
                + "registrada exitosamente");
       limpiarSolicitudes();
    }//GEN-LAST:event_CrearSolicitudActionPerformed

    private void SinLlaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinLlaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SinLlaveActionPerformed

    private void GPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GPSActionPerformed
    private void limpiarSolicitudes(){
        //Limpiar todos los campos
        CedulaSolicitud.setText("");
        MarcaSolicitud.setText("");
        FechaSolicitud.setText("");
        ModeloSolicitud.setText("");
        EstadoSolicitud.setText("");
        PasajerosSolicitud.setText("");
        DiasSolicitud.setText("");
        GPS.setSelected(false);
        Cargador.setSelected(false);
        SinLlave.setSelected(false);
        Sensores.setSelected(false);
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
            java.util.logging.Logger.getLogger(Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Solicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solicitudes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Cargador;
    private javax.swing.JTextField CedulaSolicitud;
    private javax.swing.JButton CrearSolicitud;
    private javax.swing.JTextField DiasSolicitud;
    private javax.swing.JTextField EstadoSolicitud;
    private javax.swing.JTextField FechaSolicitud;
    private javax.swing.JCheckBox GPS;
    private javax.swing.JTextField MarcaSolicitud;
    private javax.swing.JTextField ModeloSolicitud;
    private javax.swing.JTextField PasajerosSolicitud;
    private javax.swing.JCheckBox Sensores;
    private javax.swing.JCheckBox SinLlave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
