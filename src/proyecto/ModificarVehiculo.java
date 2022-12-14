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
public class ModificarVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form ModificarVehiculo
     */
    public ModificarVehiculo() {
        initComponents();
        
    }
    RegistrarVehiculo vehiculo = new RegistrarVehiculo();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MarcaVehiculo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ModeloVehiculo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AñoVehiculo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ColorVehiculo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CCVehiculo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CombustibleVehiculo = new javax.swing.JTextField();
        CantPasajerosVehiculo = new javax.swing.JTextField();
        PrecioAlquilerVehiculo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ExtraArranque = new javax.swing.JCheckBox();
        ExtraCargador = new javax.swing.JCheckBox();
        ExtraGPS = new javax.swing.JCheckBox();
        ExtraSenReversa = new javax.swing.JCheckBox();
        Limpiar = new javax.swing.JButton();
        BT_Actualizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        EstadoVehiculo = new javax.swing.JTextField();
        searchField = new javax.swing.JTextField();
        searchBtn3 = new javax.swing.JButton();
        jMenuBar9 = new javax.swing.JMenuBar();

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Car Rental.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modificar Vehiculo");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 370, 60));

        jLabel3.setText("Placa:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setText("Marca:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel1.add(MarcaVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 90, -1));

        jLabel5.setText("Modelo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel1.add(ModeloVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 90, -1));

        jLabel6.setText("Año:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel1.add(AñoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 90, -1));

        jLabel7.setText("Color:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        ColorVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(ColorVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 90, -1));

        jLabel8.setText("Cilindraje:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel1.add(CCVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 90, -1));

        jLabel9.setText("Combustible:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        CombustibleVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombustibleVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(CombustibleVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 80, -1));
        jPanel1.add(CantPasajerosVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 90, -1));
        jPanel1.add(PrecioAlquilerVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 80, -1));

        jLabel10.setText("Cant.Pasajeros:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel11.setText("Precio Alquiler Diario:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel12.setText("Extras:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jLabel13.setText("Estado:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        ExtraArranque.setText("Arranque sin llave");
        ExtraArranque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraArranqueActionPerformed(evt);
            }
        });
        jPanel1.add(ExtraArranque, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        ExtraCargador.setText("Cargador Inalambrico");
        jPanel1.add(ExtraCargador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        ExtraGPS.setText("GPS - Navegador en Tiempo Real");
        jPanel1.add(ExtraGPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        ExtraSenReversa.setText("Sensores + Camara Reversa");
        jPanel1.add(ExtraSenReversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        BT_Actualizar.setText("Actualizar");
        BT_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(BT_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));
        jPanel1.add(EstadoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 160, -1));

        searchField.setToolTipText("Ingrese la identificacion");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, -1));

        searchBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        searchBtn3.setToolTipText("Consultar usuario");
        searchBtn3.setBorder(null);
        searchBtn3.setBorderPainted(false);
        searchBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn3ActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 30, 30));

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

    private void ColorVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorVehiculoActionPerformed

    private void ExtraArranqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraArranqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExtraArranqueActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        searchField.setText(null);
        MarcaVehiculo.setText(null);
        ModeloVehiculo.setText(null);
        AñoVehiculo.setText(null);
        ColorVehiculo.setText(null);
        CCVehiculo.setText(null);
        CombustibleVehiculo.setText(null);
        CantPasajerosVehiculo.setText(null);
        PrecioAlquilerVehiculo.setText(null);
        EstadoVehiculo.setText(null);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void limpiarVehiculos() {
        //Limpiar todos los campos
        searchField.setText(null);
        MarcaVehiculo.setText(null);
        ModeloVehiculo.setText(null);
        AñoVehiculo.setText(null);
        ColorVehiculo.setText(null);
        CCVehiculo.setText(null);
        CombustibleVehiculo.setText(null);
        CantPasajerosVehiculo.setText(null);
        PrecioAlquilerVehiculo.setText(null);
        EstadoVehiculo.setText(null);
        ExtraArranque.setSelected(false);
        ExtraCargador.setSelected(false);
        ExtraGPS.setSelected(false);
        ExtraSenReversa.setSelected(false);    
    }

    private void BT_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ActualizarActionPerformed
        // TODO add your handling code here:
        //Guardar el Vehiculo a la Lista
        String Placa = searchField.getText();
        String marca = MarcaVehiculo.getText();
        String modelo = ModeloVehiculo.getText();
        int anio = Integer.parseInt(AñoVehiculo.getText());
        String Color = ColorVehiculo.getText();
        int cilidrada = Integer.parseInt(CCVehiculo.getText());
        String combustible = CombustibleVehiculo.getText();
        int pasajeros = Integer.parseInt(CantPasajerosVehiculo.getText());
        int precio = Integer.parseInt(PrecioAlquilerVehiculo.getText());
        String estado = EstadoVehiculo.getText();
        if(ExtraArranque.isSelected()){
            String extra = "Arranque sin llave";
            vehiculo.milista.modificarV(Placa, marca, modelo, anio, Color, 
                cilidrada, combustible, pasajeros, precio, 
                estado, estado);
        }else if(ExtraCargador.isSelected()){
            String extra = "Cargador Inalambrico";
            vehiculo.milista.modificarV(Placa, marca, modelo, anio, Color, 
                cilidrada, combustible, pasajeros, precio, 
                estado, estado);
        }else if(ExtraGPS.isSelected()){
            String extra = "GPS - Navegador en Tiempo Real";
            vehiculo.milista.modificarV(Placa, marca, modelo, anio, Color, 
                cilidrada, combustible, pasajeros, precio, 
                estado, estado);
        }else {
            String extra = "Sensores + Camara Reversa";
            vehiculo.milista.modificarV(Placa, marca, modelo, anio, Color, 
                cilidrada, combustible, pasajeros, precio, 
                estado, estado);
        }

       JOptionPane.showMessageDialog(null,"Vehiculo fue Modificado"
                + "exitosamente");
        limpiarVehiculos();

    }//GEN-LAST:event_BT_ActualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CombustibleVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombustibleVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombustibleVehiculoActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn3ActionPerformed
        String Placa = (String.valueOf(searchField.getText()));
        if(vehiculo.milista.existe(Placa)){
            vehiculo.milista.getAtributos(Placa);
            System.out.println("entro");
            String [] array = vehiculo.milista.getArray();
            System.out.println(array);
            MarcaVehiculo.setText(array[4]);
            ModeloVehiculo.setText(array[10]);
            AñoVehiculo.setText(array[9]);
            ColorVehiculo.setText(array[1]);
            CCVehiculo.setText(array[7]);
            CombustibleVehiculo.setText(array[5]);
            CantPasajerosVehiculo.setText(array[6]);
            PrecioAlquilerVehiculo.setText(array[8]);
            EstadoVehiculo.setText(array[3]);
            //limpiarVehiculos();
        }
     
    }//GEN-LAST:event_searchBtn3ActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AñoVehiculo;
    private javax.swing.JButton BT_Actualizar;
    private javax.swing.JTextField CCVehiculo;
    private javax.swing.JTextField CantPasajerosVehiculo;
    private javax.swing.JTextField ColorVehiculo;
    private javax.swing.JTextField CombustibleVehiculo;
    private javax.swing.JTextField EstadoVehiculo;
    private javax.swing.JCheckBox ExtraArranque;
    private javax.swing.JCheckBox ExtraCargador;
    private javax.swing.JCheckBox ExtraGPS;
    private javax.swing.JCheckBox ExtraSenReversa;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField MarcaVehiculo;
    private javax.swing.JTextField ModeloVehiculo;
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
    private javax.swing.JButton searchBtn3;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
