/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Gestores.AdministradorBedeles;
import Gestores.AdministradorInterfaz;
import Gestores.AdministradorSesion;
import db.model.Bedel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Laureano
 */
public class BuscarBedel extends javax.swing.JFrame {

    
    Integer indice = 0;
    
    /**
     * Creates new form RegistrarBedel
     */
    public BuscarBedel() {
        initComponents();
        
        
        cmbTurno.removeAllItems();
        cmbTurno.addItem("---Seleccione Turno---");
        
        cmbBuscarTurno.removeAllItems();
        cmbBuscarTurno.addItem("---Seleccione Turno---");
        ArrayList<String> pes = AdministradorBedeles.getAllTurnos();
        for (String s : pes) {
            cmbTurno.addItem(s);
            
            cmbBuscarTurno.addItem(s);
        }
    }
    
    @Override
    public void setVisible(boolean b) {
        lblNombreAdministrador.setText(AdministradorSesion.getUsuarioActual().getNombreUsuario());
        super.setVisible(b);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscar = new javax.swing.JLabel();
        lblSesion = new javax.swing.JLabel();
        lblNombreAdministrador = new javax.swing.JLabel();
        lblSeleccione = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblContraseña1 = new javax.swing.JLabel();
        lblContraseña2 = new javax.swing.JLabel();
        pnlBusqueda = new javax.swing.JPanel();
        txtBuscarApellido = new javax.swing.JTextField();
        cmbBuscarTurno = new javax.swing.JComboBox<>();
        chkApellido = new javax.swing.JCheckBox();
        chkTurno = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cmbTurno = new javax.swing.JComboBox<>();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContraseña1 = new javax.swing.JPasswordField();
        txtContraseña2 = new javax.swing.JPasswordField();
        btnCerrarSesion = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GateKeeper - Buscar Bedel [ADMINISTRADOR]");
        setResizable(false);
        setSize(new java.awt.Dimension(400, 600));
        setType(java.awt.Window.Type.UTILITY);

        lblBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBuscar.setText("Buscar Bedel");

        lblSesion.setText("<html><u>Sesión Actual:</u></html>");

        lblNombreAdministrador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreAdministrador.setText("Nombre_Administrador");

        lblSeleccione.setText("Seleccione un método de búsqueda y modifique o elimine un bedel.");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setText("Nombre del Bedel");

        lblApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblApellido.setText("Apellido del Bedel");

        lblTurno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTurno.setText("Turno");

        lblNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreUsuario.setText("Nombre de Usuario");

        lblContraseña1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblContraseña1.setText("Contraseña");

        lblContraseña2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblContraseña2.setText("Confirmar Contraseña");

        pnlBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), null)); // NOI18N

        txtBuscarApellido.setText("---Apellido---");
        txtBuscarApellido.setToolTipText("Ingrese el apellido del bedel a buscar");
        txtBuscarApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarApellidoFocusGained(evt);
            }
        });
        txtBuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarApellidoActionPerformed(evt);
            }
        });

        cmbBuscarTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione Turno---", "MAÑANA", "TARDE", "NOCHE" }));
        cmbBuscarTurno.setToolTipText("Seleccione el turno del bedel a buscar");
        cmbBuscarTurno.setEnabled(false);

        chkApellido.setSelected(true);
        chkApellido.setText("Buscar por Apellido");
        chkApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApellidoActionPerformed(evt);
            }
        });

        chkTurno.setText("Buscar por Turno");
        chkTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTurnoActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_search.png"))); // NOI18N
        btnBuscar.setLabel("Buscar");
        btnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_search.png"))); // NOI18N
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlBusquedaLayout = new javax.swing.GroupLayout(pnlBusqueda);
        pnlBusqueda.setLayout(pnlBusquedaLayout);
        pnlBusquedaLayout.setHorizontalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBusquedaLayout.createSequentialGroup()
                        .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkApellido)
                            .addComponent(chkTurno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarApellido)
                            .addComponent(cmbBuscarTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBusquedaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        pnlBusquedaLayout.setVerticalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBuscarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkTurno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnBuscar))
        );

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtNombre.setText("Nombre");
        txtNombre.setToolTipText("Nombre del bedel actual");
        txtNombre.setEnabled(false);

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtApellido.setText("Apellido");
        txtApellido.setToolTipText("Apellido del bedel actual");
        txtApellido.setEnabled(false);

        cmbTurno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione Turno---", "MAÑANA", "TARDE", "NOCHE" }));
        cmbTurno.setToolTipText("Turno del bedel actual");
        cmbTurno.setEnabled(false);

        txtNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreUsuario.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtNombreUsuario.setText("Usuario");
        txtNombreUsuario.setToolTipText("Nombre de usuario de bedel actual");
        txtNombreUsuario.setEnabled(false);

        txtContraseña1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContraseña1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtContraseña1.setText("Contraseña");
        txtContraseña1.setToolTipText("Contraseña del bedel actual");
        txtContraseña1.setEnabled(false);

        txtContraseña2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContraseña2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtContraseña2.setText("Contraseña");
        txtContraseña2.setToolTipText("Contraseña del bedel actual");
        txtContraseña2.setEnabled(false);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back_menu.png"))); // NOI18N
        btnCerrarSesion.setText("Volver al Menu");
        btnCerrarSesion.setToolTipText("Vuelva al menu administrador");
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_edit.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Modifique los datos del bedel actual");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Elimine al bedel actual del sistema");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Actualice los datos del bedel actual");
        btnGuardar.setEnabled(false);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancele los datos actualizados");
        btnCancelar.setEnabled(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        btnPrimero.setFont(new java.awt.Font("Webdings", 0, 14)); // NOI18N
        btnPrimero.setText("");
        btnPrimero.setToolTipText("Ir al principio de la lista");
        btnPrimero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrimeroMouseClicked(evt);
            }
        });

        btnAnterior.setFont(new java.awt.Font("Webdings", 0, 14)); // NOI18N
        btnAnterior.setText("");
        btnAnterior.setToolTipText("Ir al elemento anterior");
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });

        btnSiguiente.setFont(new java.awt.Font("Webdings", 0, 14)); // NOI18N
        btnSiguiente.setText("");
        btnSiguiente.setToolTipText("Ir al elemento siguiente");
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });

        btnUltimo.setFont(new java.awt.Font("Webdings", 0, 14)); // NOI18N
        btnUltimo.setText("");
        btnUltimo.setToolTipText("Ir al final de la lista");
        btnUltimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUltimoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTurno)
                            .addComponent(lblNombreUsuario)
                            .addComponent(lblContraseña1)
                            .addComponent(lblContraseña2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApellido)
                            .addComponent(lblNombre)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido)
                            .addComponent(cmbTurno, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContraseña1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre)
                            .addComponent(txtContraseña2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPrimero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSiguiente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUltimo))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSeleccione)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreAdministrador)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(btnCerrarSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreAdministrador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSeleccione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTurno)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuario)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña1)
                    .addComponent(txtContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña2)
                    .addComponent(txtContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnPrimero)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnUltimo))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        // TODO add your handling code here:
        AdministradorInterfaz.getMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void chkApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApellidoActionPerformed
        if(chkApellido.isSelected()) {
            txtBuscarApellido.setEnabled(true);
        } else {
            txtBuscarApellido.setEnabled(false);
        }
        if(chkTurno.isSelected()) {
            chkTurno.setSelected(false);
            cmbBuscarTurno.setEnabled(false);
        }
    }//GEN-LAST:event_chkApellidoActionPerformed

    private void chkTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTurnoActionPerformed
        if(chkTurno.isSelected()) {
            cmbBuscarTurno.setEnabled(true);
        } else {
            cmbBuscarTurno.setEnabled(false);
        }
        if(chkApellido.isSelected()) {
            chkApellido.setSelected(false);
            txtBuscarApellido.setEnabled(false);
        }
    }//GEN-LAST:event_chkTurnoActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        if (chkApellido.isSelected()) {
            Boolean hh;
            hh = txtBuscarApellido.getText().matches("^[ A-Za-z]+$");
            if (!hh) {
                JOptionPane.showMessageDialog(this, "Caracteres invalidos", "Error cargando los datos", JOptionPane.ERROR_MESSAGE);

            } else {
                AdministradorBedeles.buscarBedelPorApellido(txtBuscarApellido.getText());
                if (AdministradorBedeles.getTamañoBedeles() == 0) {
                    JOptionPane.showMessageDialog(this, "No hay bedeles que cumplan con el criterio especificado");
                }
                indice = 0;
            }
        } else {
            if(chkTurno.isSelected()) {
                if (cmbBuscarTurno.getSelectedIndex() != 0) {
                    AdministradorBedeles.buscarBedelPorTurno(cmbBuscarTurno.getSelectedIndex());
                    if (AdministradorBedeles.getTamañoBedeles() == 0) {
                        JOptionPane.showMessageDialog(this, "No hay bedeles que cumplan con el criterio especificado");
                    }
                    indice = 0;
                } else {
                    JOptionPane.showMessageDialog(this, "No ha seleccionado un turno", "Error cargando los datos", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                //Nada seleccionado
            }
        }
        
        actualizarPanelModificacion();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        if (btnSiguiente.isEnabled()) {
            indice++;
            if (indice > AdministradorBedeles.getTamañoBedeles()-1) {
                indice = 0;
            }
            actualizarPanelModificacion();
        }        
        
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
        if (btnAnterior.isEnabled()) {
            indice--;
            if (indice < 0) {
                indice = AdministradorBedeles.getTamañoBedeles()-1;
            }
            actualizarPanelModificacion();
        }
    }//GEN-LAST:event_btnAnteriorMouseClicked

    private void btnPrimeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrimeroMouseClicked
        if (btnPrimero.isEnabled()) {
            indice = 0;
            actualizarPanelModificacion();
        }
    }//GEN-LAST:event_btnPrimeroMouseClicked

    private void btnUltimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUltimoMouseClicked
        if (btnUltimo.isEnabled()) {
            indice = AdministradorBedeles.getTamañoBedeles()-1;
            actualizarPanelModificacion();
        }
    }//GEN-LAST:event_btnUltimoMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        Integer respuesta = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas cancelar los cambios? Se perderán los datos no guardados", "Cancelar?", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            if (btnCancelar.isEnabled()) {
                actualizarPanelModificacion();
                btnEliminar.setEnabled(!btnEliminar.isEnabled());
                txtNombre.setEnabled(!btnEliminar.isEnabled());
                txtApellido.setEnabled(!btnEliminar.isEnabled());
                cmbTurno.setEnabled(!btnEliminar.isEnabled());
                //txtNombreUsuario.setEnabled(!btnEliminar.isEnabled());
                txtContraseña1.setEnabled(!btnEliminar.isEnabled());
                txtContraseña2.setEnabled(!btnEliminar.isEnabled());
                btnGuardar.setEnabled(!btnEliminar.isEnabled());
                btnCancelar.setEnabled(!btnEliminar.isEnabled());
                btnSiguiente.setEnabled(btnEliminar.isEnabled());
                btnAnterior.setEnabled(btnEliminar.isEnabled());
                btnPrimero.setEnabled(btnEliminar.isEnabled());
                btnUltimo.setEnabled(btnEliminar.isEnabled());
                btnModificar.setEnabled(btnEliminar.isEnabled());
            }
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        if (btnModificar.isEnabled()) {
            btnEliminar.setEnabled(!btnEliminar.isEnabled());
            txtNombre.setEnabled(!btnEliminar.isEnabled());
            txtApellido.setEnabled(!btnEliminar.isEnabled());
            cmbTurno.setEnabled(!btnEliminar.isEnabled());
            //txtNombreUsuario.setEnabled(!btnEliminar.isEnabled());
            txtContraseña1.setEnabled(!btnEliminar.isEnabled());
            txtContraseña2.setEnabled(!btnEliminar.isEnabled());
            btnGuardar.setEnabled(!btnEliminar.isEnabled());
            btnCancelar.setEnabled(!btnEliminar.isEnabled());
            btnSiguiente.setEnabled(btnEliminar.isEnabled());
            btnAnterior.setEnabled(btnEliminar.isEnabled());
            btnPrimero.setEnabled(btnEliminar.isEnabled());
            btnUltimo.setEnabled(btnEliminar.isEnabled());
            btnModificar.setEnabled(btnEliminar.isEnabled());
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if (btnGuardar.isEnabled()) {
            Integer respuesta = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas guardar los cambios?", "Guardar?",  JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                if (cmbTurno.getSelectedIndex() != 0 && Arrays.equals(txtContraseña1.getPassword(), txtContraseña2.getPassword())) {
                    Boolean hh,hh2;
                    hh2 = true;
                    hh = txtApellido.getText().matches("^[ A-Za-z]+$");
                    if (hh) {
                        hh = txtNombre.getText().matches("^[ A-Za-z]+$");
                    }
                    if ((txtNombre.getText().length() > 20) || (txtApellido.getText().length() > 20)) {
                        hh2 = false;
                    }
                    
                    if (!hh) {
                        JOptionPane.showMessageDialog(this, "Campos con carácteres invalidos", "Error cargando los datos", JOptionPane.ERROR_MESSAGE);
                    } else if (!hh2){
                        JOptionPane.showMessageDialog(this, "Nombre o apellido muy largo, tienen que tener 20 caracteres o menos", "Error cargando los datos", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String nombre = txtNombre.getText();
                        String apellido = txtApellido.getText();
                        Integer idTurno = cmbTurno.getSelectedIndex();
                        String username = txtNombreUsuario.getText();
                        String contraseña = new String(txtContraseña1.getPassword());

                        Boolean resultado = AdministradorBedeles.modificarBedel(indice, nombre, apellido, idTurno, contraseña);
                        if (resultado == true) {
                            JOptionPane.showMessageDialog(this, "Modificaciones al usuario " + username + " hechas con exito!");
                            actualizarPanelModificacion();
                            btnEliminar.setEnabled(!btnEliminar.isEnabled());
                            txtNombre.setEnabled(!btnEliminar.isEnabled());
                            txtApellido.setEnabled(!btnEliminar.isEnabled());
                            cmbTurno.setEnabled(!btnEliminar.isEnabled());
                            //txtNombreUsuario.setEnabled(!btnEliminar.isEnabled());
                            txtContraseña1.setEnabled(!btnEliminar.isEnabled());
                            txtContraseña2.setEnabled(!btnEliminar.isEnabled());
                            btnGuardar.setEnabled(!btnEliminar.isEnabled());
                            btnCancelar.setEnabled(!btnEliminar.isEnabled());
                            btnSiguiente.setEnabled(btnEliminar.isEnabled());
                            btnAnterior.setEnabled(btnEliminar.isEnabled());
                            btnPrimero.setEnabled(btnEliminar.isEnabled());
                            btnUltimo.setEnabled(btnEliminar.isEnabled());
                            btnModificar.setEnabled(btnEliminar.isEnabled());
                        } else {
                            JOptionPane.showMessageDialog(this, "El nombre de usuario o la contraseña no cumple con las politicas establecidas", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this,"Error al cambiar atributos.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (btnEliminar.isEnabled()) {
            JOptionPane.showMessageDialog(this,"Funcionalidad en desarrollo.","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void txtBuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarApellidoActionPerformed

    private void txtBuscarApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarApellidoFocusGained
        // TODO add your handling code here:
        txtBuscarApellido.setText("");
    }//GEN-LAST:event_txtBuscarApellidoFocusGained

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
            java.util.logging.Logger.getLogger(BuscarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarBedel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JCheckBox chkApellido;
    private javax.swing.JCheckBox chkTurno;
    private javax.swing.JComboBox<String> cmbBuscarTurno;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblContraseña2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreAdministrador;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JPanel pnlBusqueda;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarApellido;
    private javax.swing.JPasswordField txtContraseña1;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables

    private void actualizarPanelModificacion() {
        if (AdministradorBedeles.getTamañoBedeles() > 0) {
            Bedel tmp = AdministradorBedeles.getBedel(indice);
            txtNombre.setText(tmp.getNombreBedel());
            txtApellido.setText(tmp.getApellidoBedel());
            cmbTurno.setSelectedIndex(tmp.getTurno().getIdTurno());
            txtNombreUsuario.setText(tmp.getNombreUsuario());
            txtContraseña1.setText("");
            txtContraseña2.setText("");
        } else {
            txtNombre.setText("Nombre");
            txtApellido.setText("Apellido");
            cmbTurno.setSelectedIndex(0);
            txtNombreUsuario.setText("Usuario");
            txtContraseña1.setText("Contraseña1");
            txtContraseña2.setText("Contraseña2");
        }
    }
}
