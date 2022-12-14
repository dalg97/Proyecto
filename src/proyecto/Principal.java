package proyecto;

import static java.time.InstantSource.system;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setTitle("RENT A CAR MAD");
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConsultaClientes = new javax.swing.JButton();
        ConsultaSolicitudes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Catalogo = new javax.swing.JButton();
        jMenuBar9 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        RegistrarCliente = new javax.swing.JMenuItem();
        ModificarCliente = new javax.swing.JMenuItem();
        EliminarCliente = new javax.swing.JMenuItem();
        MenuVehiculos = new javax.swing.JMenu();
        RegistrarVehiculo = new javax.swing.JMenuItem();
        ModificarVehiculo = new javax.swing.JMenuItem();
        EliminarVehiculo = new javax.swing.JMenuItem();
        MenuAlquiler = new javax.swing.JMenu();
        SolicitarAlquiler = new javax.swing.JMenuItem();
        DevolucionVehiculo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("proyecto/Bundle"); // NOI18N
        ConsultaClientes.setText(bundle.getString("Principal.ConsultaClientes.text_1")); // NOI18N
        ConsultaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClientesActionPerformed(evt);
            }
        });

        ConsultaSolicitudes.setText(bundle.getString("Principal.ConsultaSolicitudes.text_1")); // NOI18N
        ConsultaSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaSolicitudesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText(bundle.getString("Principal.jLabel1.text_1")); // NOI18N

        Catalogo.setText(bundle.getString("Principal.Catalogo.text_1")); // NOI18N
        Catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatalogoActionPerformed(evt);
            }
        });

        jMenu1.setText(bundle.getString("Principal.jMenu1.text_1")); // NOI18N

        Salir.setText(bundle.getString("Principal.Salir.text_1")); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar9.add(jMenu1);

        MenuClientes.setText(bundle.getString("Principal.MenuClientes.text_1")); // NOI18N

        RegistrarCliente.setText(bundle.getString("Principal.RegistrarCliente.text_1")); // NOI18N
        RegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(RegistrarCliente);

        ModificarCliente.setText(bundle.getString("Principal.ModificarCliente.text_1")); // NOI18N
        ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(ModificarCliente);

        EliminarCliente.setText(bundle.getString("Principal.EliminarCliente.text_1")); // NOI18N
        EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(EliminarCliente);

        jMenuBar9.add(MenuClientes);

        MenuVehiculos.setText(bundle.getString("Principal.MenuVehiculos.text_1")); // NOI18N

        RegistrarVehiculo.setText(bundle.getString("Principal.RegistrarVehiculo.text_1")); // NOI18N
        RegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarVehiculoActionPerformed(evt);
            }
        });
        MenuVehiculos.add(RegistrarVehiculo);

        ModificarVehiculo.setText(bundle.getString("Principal.ModificarVehiculo.text_1")); // NOI18N
        ModificarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarVehiculoActionPerformed(evt);
            }
        });
        MenuVehiculos.add(ModificarVehiculo);

        EliminarVehiculo.setText(bundle.getString("Principal.EliminarVehiculo.text_1")); // NOI18N
        EliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarVehiculoActionPerformed(evt);
            }
        });
        MenuVehiculos.add(EliminarVehiculo);

        jMenuBar9.add(MenuVehiculos);

        MenuAlquiler.setText(bundle.getString("Principal.MenuAlquiler.text_1")); // NOI18N

        SolicitarAlquiler.setText(bundle.getString("Principal.SolicitarAlquiler.text_1")); // NOI18N
        SolicitarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarAlquilerActionPerformed(evt);
            }
        });
        MenuAlquiler.add(SolicitarAlquiler);

        DevolucionVehiculo.setText(bundle.getString("Principal.DevolucionVehiculo.text_1")); // NOI18N
        MenuAlquiler.add(DevolucionVehiculo);

        jMenuBar9.add(MenuAlquiler);

        setJMenuBar(jMenuBar9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Catalogo)
                .addGap(71, 71, 71)
                .addComponent(ConsultaClientes)
                .addGap(71, 71, 71)
                .addComponent(ConsultaSolicitudes)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaClientes)
                    .addComponent(Catalogo)
                    .addComponent(ConsultaSolicitudes))
                .addContainerGap(326, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Pila mipila;
    Clientes client = new Clientes();
    Solicitudes solicitud = new Solicitudes();
    ModificarCliente modificar = new ModificarCliente();
    RegistrarVehiculo vehicle = new RegistrarVehiculo();
    //Test test = new Test();
    private void RegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarClienteActionPerformed
        //Clientes client = new Clientes();
        client.setVisible(true);
        client.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_RegistrarClienteActionPerformed

    private void ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarClienteActionPerformed
        modificar.setVisible(true);
        modificar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ModificarClienteActionPerformed

    private void EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClienteActionPerformed
        int cedula = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Ingrese numero de cedula: "));
        if(solicitud.micola.buscar(cedula)){
            client.mipila.popModificado(cedula);
            JOptionPane.showMessageDialog(null,"Usuario fue"
                + "Eliminado exitosamente");
        }else {
            JOptionPane.showMessageDialog(null,"Usuario no"
                    + "puede ser eliminado");
        }
    }//GEN-LAST:event_EliminarClienteActionPerformed

    private void ConsultaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClientesActionPerformed
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                null, "  Consulta de Clientes\n"
                + "1. Cliente especifico \n"
                + "2. Clientes Registrados \n"));
        if (opcion == 1) {
            int cedula = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Ingrese numero de cedula: "));
            client.mipila.mostrarEspecifico(cedula);
        } else {
            client.mipila.mostrarTotal();
            System.out.println(client.mipila.search(1234));
        }
    }//GEN-LAST:event_ConsultaClientesActionPerformed

    private void ConsultaSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaSolicitudesActionPerformed
        JOptionPane.showMessageDialog(null,
                solicitud.micola.toString());
    }//GEN-LAST:event_ConsultaSolicitudesActionPerformed

    private void RegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarVehiculoActionPerformed

        vehicle.setVisible(true);
        vehicle.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_RegistrarVehiculoActionPerformed

    private void ModificarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarVehiculoActionPerformed
        ModificarVehiculo vehicle = new ModificarVehiculo();
        vehicle.setVisible(true);
        vehicle.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ModificarVehiculoActionPerformed

    private void SolicitarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarAlquilerActionPerformed
        //Solicitudes solicitud = new Solicitudes();
        solicitud.setVisible(true);
        solicitud.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_SolicitarAlquilerActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null,
                "¿Está seguro de Salir?", " Salir ", JOptionPane.YES_NO_OPTION);
        if (answer == 0) {
            dispose();
    }//GEN-LAST:event_SalirActionPerformed
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int answer = JOptionPane.showConfirmDialog(null,
                "¿Está seguro de Salir?", " Salir ", JOptionPane.YES_NO_OPTION);
        if (answer == 0) {
            dispose();
    }//GEN-LAST:event_formWindowClosing
    }
    private void CatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatalogoActionPerformed
        vehicle.milista.mostrarVehiculos();
    }//GEN-LAST:event_CatalogoActionPerformed

    private void EliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarVehiculoActionPerformed
        String placa = JOptionPane.showInputDialog(
                null, "Ingrese numero de placa: ");
        if(vehicle.milista.existe(placa)){
            vehicle.milista.eliminar(placa);
            JOptionPane.showMessageDialog(null,"Vehiculo fue"
                + "Eliminado exitosamente");
        }else {
            JOptionPane.showMessageDialog(null,"Vehiculo no"
                    + "registrado");
        }
    }//GEN-LAST:event_EliminarVehiculoActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Catalogo;
    private javax.swing.JButton ConsultaClientes;
    private javax.swing.JButton ConsultaSolicitudes;
    private javax.swing.JMenuItem DevolucionVehiculo;
    private javax.swing.JMenuItem EliminarCliente;
    private javax.swing.JMenuItem EliminarVehiculo;
    private javax.swing.JMenu MenuAlquiler;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuVehiculos;
    private javax.swing.JMenuItem ModificarCliente;
    private javax.swing.JMenuItem ModificarVehiculo;
    private javax.swing.JMenuItem RegistrarCliente;
    private javax.swing.JMenuItem RegistrarVehiculo;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem SolicitarAlquiler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar9;
    // End of variables declaration//GEN-END:variables
}
