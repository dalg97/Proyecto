/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author danny
 */
public class RegistrarVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarVehiculo
     */
    public RegistrarVehiculo() {
        initComponents();
        setTitle("Registrar Vehículo");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    static Lista milista = new Lista();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Limpiar = new javax.swing.JButton();
        BT_Guardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ExtraArranque = new javax.swing.JCheckBox();
        ExtraCargador = new javax.swing.JCheckBox();
        ExtraGPS = new javax.swing.JCheckBox();
        ExtraSenReversa = new javax.swing.JCheckBox();
        PlacaVehiculo = new javax.swing.JTextField();
        MarcaVehiculo = new javax.swing.JTextField();
        ModeloVehiculo = new javax.swing.JTextField();
        AnioVehiculo = new javax.swing.JTextField();
        ColorVehiculo = new javax.swing.JTextField();
        CCVehiculo = new javax.swing.JTextField();
        EstadoVehiculo = new javax.swing.JTextField();
        CantPasajerosVehiculo = new javax.swing.JTextField();
        PrecioAlquilerVehiculo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CombustibleVehiculo1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar9 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        BT_Guardar.setText("Guardar");
        BT_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(BT_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        ExtraArranque.setText("Arranque sin llave");
        ExtraArranque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraArranqueActionPerformed(evt);
            }
        });
        jPanel1.add(ExtraArranque, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        ExtraCargador.setText("Cargador Inalambrico");
        jPanel1.add(ExtraCargador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        ExtraGPS.setText("GPS - Navegador en Tiempo Real");
        jPanel1.add(ExtraGPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        ExtraSenReversa.setText("Sensores + Camara Reversa");
        jPanel1.add(ExtraSenReversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        PlacaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(PlacaVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 90, -1));
        jPanel1.add(MarcaVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 90, -1));
        jPanel1.add(ModeloVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 90, -1));
        jPanel1.add(AnioVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 90, -1));

        ColorVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(ColorVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 90, -1));
        jPanel1.add(CCVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 90, -1));
        jPanel1.add(EstadoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 90, -1));
        jPanel1.add(CantPasajerosVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 80, -1));
        jPanel1.add(PrecioAlquilerVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 80, -1));

        jLabel12.setText("Extras:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        jLabel11.setText("Precio Alquiler Diario:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        jLabel10.setText("Cant.Pasajeros:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLabel9.setText("Estado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        jLabel8.setText("Cilindraje:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        jLabel7.setText("Color:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabel6.setText("Año:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel5.setText("Modelo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jLabel4.setText("Marca:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel3.setText("Placa:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar Vehiculo");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 370, 60));
        jPanel1.add(CombustibleVehiculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 90, -1));

        jLabel13.setText("Combustible:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        setJMenuBar(jMenuBar9);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlacaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlacaVehiculoActionPerformed

    private void ColorVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorVehiculoActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
       limpiarVehiculos();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void limpiarVehiculos() {
        //Limpiar todos los campos
        PlacaVehiculo.setText("");
        MarcaVehiculo.setText("");
        ModeloVehiculo.setText("");
        AnioVehiculo.setText("");
        ColorVehiculo.setText("");
        CCVehiculo.setText("");
        EstadoVehiculo.setText("");
        CantPasajerosVehiculo.setText("");
        PrecioAlquilerVehiculo.setText("");
        ExtraArranque.setSelected(false);
        ExtraCargador.setSelected(false);
        ExtraGPS.setSelected(false);
        ExtraSenReversa.setSelected(false);

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed


    private void BT_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_GuardarActionPerformed
        // TODO add your handling code here:
        //Guardar el Vehiculo a la Lista
        String Placa = PlacaVehiculo.getText();
        String marca = MarcaVehiculo.getText();
        String modelo = ModeloVehiculo.getText();
        int anio = Integer.parseInt(AnioVehiculo.getText());
        String Color = ColorVehiculo.getText();
        int cilindrada = Integer.parseInt(CCVehiculo.getText());
        String combustible = CombustibleVehiculo1.getText();
        int pasajeros = Integer.parseInt(CantPasajerosVehiculo.getText());
        int precio = Integer.parseInt(PrecioAlquilerVehiculo.getText());
        String estado = EstadoVehiculo.getText();
        
        if(ExtraArranque.isSelected()){
            String extras = "Arranque sin Llave"; 
            milista.insertar(new Vehiculo(Placa,marca,modelo,anio,
                    Color,cilindrada,combustible,pasajeros,
                    precio,extras,estado));
        }else if(ExtraCargador.isSelected()){
            String extras = "Cargador Inalambrico"; 
            milista.insertar(new Vehiculo(Placa,marca,modelo,anio,
                    Color,cilindrada,combustible,pasajeros,
                    precio,extras,estado));
        }else if(ExtraGPS.isSelected()){ 
            String extras = "GPS - Navegador en Tiempo Real"; 
            milista.insertar(new Vehiculo(Placa,marca,modelo,anio,
                    Color,cilindrada,combustible,pasajeros,
                    precio,extras,estado));
        }else{
           String extras = "Sensores + Camara Reversa"; 
            milista.insertar(new Vehiculo(Placa,marca,modelo,anio,
                    Color,cilindrada,combustible,pasajeros,
                    precio,extras,estado)); 
        }
        JOptionPane.showMessageDialog(null,"Vehiculo fue Registrado"
                + " exitosamente");
        limpiarVehiculos();
    }//GEN-LAST:event_BT_GuardarActionPerformed

    private void ExtraArranqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraArranqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExtraArranqueActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarVehiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarVehiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarVehiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarVehiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnioVehiculo;
    private javax.swing.JButton BT_Guardar;
    private javax.swing.JTextField CCVehiculo;
    private javax.swing.JTextField CantPasajerosVehiculo;
    private javax.swing.JTextField ColorVehiculo;
    private javax.swing.JTextField CombustibleVehiculo1;
    private javax.swing.JTextField EstadoVehiculo;
    private javax.swing.JCheckBox ExtraArranque;
    private javax.swing.JCheckBox ExtraCargador;
    private javax.swing.JCheckBox ExtraGPS;
    private javax.swing.JCheckBox ExtraSenReversa;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField MarcaVehiculo;
    private javax.swing.JTextField ModeloVehiculo;
    private javax.swing.JTextField PlacaVehiculo;
    private javax.swing.JTextField PrecioAlquilerVehiculo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
