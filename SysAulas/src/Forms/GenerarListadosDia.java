/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author luciano
 */
public class GenerarListadosDia extends javax.swing.JFrame {

    /**
     * Creates new form BuscarAula
     */
    public GenerarListadosDia() {
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

        lblGenerar = new javax.swing.JLabel();
        lblSesion = new javax.swing.JLabel();
        lblNombreBedel = new javax.swing.JLabel();
        pnlReservasDia = new javax.swing.JPanel();
        lblNumeroAula = new javax.swing.JLabel();
        cmbNumeroAula = new javax.swing.JComboBox<>();
        lblTipoAula = new javax.swing.JLabel();
        cmbTipoAula = new javax.swing.JComboBox<>();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnGenerarListado1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAulas1 = new javax.swing.JTable();
        btnGenerarListado4 = new javax.swing.JButton();
        btnVolverMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GateKeeper - Generar Listados [BEDEL]");
        setResizable(false);
        setSize(new java.awt.Dimension(680, 300));
        setType(java.awt.Window.Type.UTILITY);

        lblGenerar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGenerar.setText("Generar Listados");

        lblSesion.setText("<html><u>Sesión Actual:</u></html>");

        lblNombreBedel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreBedel.setText("Nombre_Bedel");

        pnlReservasDia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Reservas por Día", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), null)); // NOI18N

        lblNumeroAula.setText("N° de Aula");

        cmbNumeroAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "1", "2", "..." }));
        cmbNumeroAula.setToolTipText("Seleccione el número del aula que desea buscar");

        lblTipoAula.setText("Tipo de Aula");

        cmbTipoAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aula", "Multimedios", "Informáticas", "Sin Recursos" }));
        cmbTipoAula.setToolTipText("Seleccione el tipo de aula que desea buscar");

        lblFecha.setText("Fecha Específica");

        txtFecha.setText("  /  /");
        txtFecha.setToolTipText("Ingrese la fecha que desea buscar (DD/MM/AAAA)");

        btnGenerarListado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/generate_list.png"))); // NOI18N
        btnGenerarListado1.setText("Agregar al Listado");
        btnGenerarListado1.setToolTipText("Agregue los datos de la tabla al listado");
        btnGenerarListado1.setActionCommand("");
        btnGenerarListado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarListado1MouseClicked(evt);
            }
        });
        btnGenerarListado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarListado1ActionPerformed(evt);
            }
        });

        tblAulas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° de Aula", "Cátedra", "Docente´", "Hora de Inicio", "Hora de Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAulas1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAulas1);
        if (tblAulas1.getColumnModel().getColumnCount() > 0) {
            tblAulas1.getColumnModel().getColumn(4).setHeaderValue("Estado");
        }
        tblAulas1.getAccessibleContext().setAccessibleName("");

        btnGenerarListado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/refresh.png"))); // NOI18N
        btnGenerarListado4.setText("Limpiar Campos");
        btnGenerarListado4.setToolTipText("Limpie los datos filtrados de las tablas");
        btnGenerarListado4.setActionCommand("");
        btnGenerarListado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarListado4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlReservasDiaLayout = new javax.swing.GroupLayout(pnlReservasDia);
        pnlReservasDia.setLayout(pnlReservasDiaLayout);
        pnlReservasDiaLayout.setHorizontalGroup(
            pnlReservasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservasDiaLayout.createSequentialGroup()
                .addGroup(pnlReservasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReservasDiaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTipoAula)
                        .addGap(102, 102, 102))
                    .addGroup(pnlReservasDiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlReservasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFecha)
                            .addComponent(lblNumeroAula, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGenerarListado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerarListado1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(cmbNumeroAula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTipoAula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        pnlReservasDiaLayout.setVerticalGroup(
            pnlReservasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservasDiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlReservasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlReservasDiaLayout.createSequentialGroup()
                        .addComponent(lblFecha)
                        .addGap(2, 2, 2)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipoAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbTipoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumeroAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNumeroAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnGenerarListado1)
                        .addGap(13, 13, 13)
                        .addComponent(btnGenerarListado4)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back_menu.png"))); // NOI18N
        btnVolverMenu.setText("Volver al Menu");
        btnVolverMenu.setToolTipText("Vuelva al menu de bedel");
        btnVolverMenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos a Incluir", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), javax.swing.UIManager.getDefaults().getColor("textHighlight"))); // NOI18N

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Código de Reserva");
        jCheckBox1.setToolTipText("");
        jCheckBox1.setActionCommand("");
        jCheckBox1.setEnabled(false);

        jCheckBox2.setText("N° de Aula");

        jCheckBox3.setText("Tipo de Aula");

        jCheckBox4.setText("Estado");

        jCheckBox5.setText("Cantidad de Alumnos");
        jCheckBox5.setActionCommand("");

        jCheckBox6.setText("Ubicación");

        jCheckBox7.setText("Capacidad");
        jCheckBox7.setActionCommand("");

        jCheckBox8.setText("Docente");

        jCheckBox9.setText("Duración");

        jCheckBox10.setText("Hora de Inicio");

        jCheckBox11.setText("Fecha de Reserva");

        jCheckBox12.setText("Cátedra");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("Seleccionar Todos");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText("Deseleccionar Todos");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/generate_pdf.png"))); // NOI18N
        jButton3.setText("Generar PDF");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/print.png"))); // NOI18N
        jButton4.setText("Imprimir Listado");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/generate_xls.png"))); // NOI18N
        jButton5.setText("Generar XLS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox7))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox11))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox7)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlReservasDia, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreBedel)
                        .addGap(0, 518, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGenerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverMenu)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenerar)
                    .addComponent(btnVolverMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreBedel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlReservasDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarListado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarListado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarListado1ActionPerformed

    private void btnGenerarListado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarListado4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarListado4ActionPerformed

    private void btnGenerarListado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarListado1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarListado1MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarListadosDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarListado1;
    private javax.swing.JButton btnGenerarListado4;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JComboBox<String> cmbNumeroAula;
    private javax.swing.JComboBox<String> cmbTipoAula;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGenerar;
    private javax.swing.JLabel lblNombreBedel;
    private javax.swing.JLabel lblNumeroAula;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JLabel lblTipoAula;
    private javax.swing.JPanel pnlReservasDia;
    private javax.swing.JTable tblAulas1;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
