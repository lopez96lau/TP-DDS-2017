/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import javax.swing.DefaultCellEditor;

/**
 *
 * @author Laureano
 */
public class ReservarAula extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarBedel
     */
    public ReservarAula() {
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

        cmbDuracion = new javax.swing.JComboBox<>();
        lblReservar = new javax.swing.JLabel();
        lblSesion = new javax.swing.JLabel();
        lblNombreBedel = new javax.swing.JLabel();
        lblComplete = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSolicitar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        pnlPeriodo = new javax.swing.JPanel();
        chkLunes = new javax.swing.JCheckBox();
        chkMartes = new javax.swing.JCheckBox();
        chkMiercoles = new javax.swing.JCheckBox();
        chkJueves = new javax.swing.JCheckBox();
        chkViernes = new javax.swing.JCheckBox();
        lblHoraInicio1 = new javax.swing.JLabel();
        txtHoraInicio1 = new javax.swing.JTextField();
        lblDuracion1 = new javax.swing.JLabel();
        cmbDuracion1 = new javax.swing.JComboBox<>();
        lblHoraInicio2 = new javax.swing.JLabel();
        txtHoraInicio2 = new javax.swing.JTextField();
        lblDuracion2 = new javax.swing.JLabel();
        cmbDuracion2 = new javax.swing.JComboBox<>();
        lblHoraInicio3 = new javax.swing.JLabel();
        txtHoraInicio3 = new javax.swing.JTextField();
        lblDuracion3 = new javax.swing.JLabel();
        cmbDuracion3 = new javax.swing.JComboBox<>();
        lblHoraInicio4 = new javax.swing.JLabel();
        txtHoraInicio4 = new javax.swing.JTextField();
        lblDuracion4 = new javax.swing.JLabel();
        cmbDuracion4 = new javax.swing.JComboBox<>();
        lblHoraInicio5 = new javax.swing.JLabel();
        txtHoraInicio5 = new javax.swing.JTextField();
        lblDuracion5 = new javax.swing.JLabel();
        cmbDuracion5 = new javax.swing.JComboBox<>();
        cmbPeriodo = new javax.swing.JComboBox<>();
        pnlFecha = new javax.swing.JPanel();
        btnPeriodo = new javax.swing.JButton();
        btnFecha = new javax.swing.JButton();
        lblNombreSolicitante = new javax.swing.JLabel();
        lblApellidoSolicitante = new javax.swing.JLabel();
        lblCatedra = new javax.swing.JLabel();
        lblTipoAula = new javax.swing.JLabel();
        lblCantAlumnos = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtNombreSolicitante = new javax.swing.JTextField();
        txtApellidoSolicitante = new javax.swing.JTextField();
        txtCatedra = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCantAlumnos = new javax.swing.JTextField();
        cmbTipoAula = new javax.swing.JComboBox<>();

        cmbDuracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duración", "0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysAulas - Reservar Aula [BEDEL]");
        setPreferredSize(new java.awt.Dimension(375, 660));
        setResizable(false);
        setSize(new java.awt.Dimension(375, 660));
        setType(java.awt.Window.Type.UTILITY);

        lblReservar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblReservar.setText("Reservar Aula");

        lblSesion.setText("<html><u>Sesión Actual:</u></html>");

        lblNombreBedel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreBedel.setText("Nombre_Bedel");

        lblComplete.setText("<html>Complete todos los campos para solicitar la reserva de un aula.</html>");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancele el ingreso de los datos");
        btnCancelar.setEnabled(false);

        btnSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/solicitate.png"))); // NOI18N
        btnSolicitar.setText("Solicitar");
        btnSolicitar.setToolTipText("Solicite la reserva del aula y obtenga su disponibilidad");
        btnSolicitar.setEnabled(false);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back_menu.png"))); // NOI18N
        btnCerrarSesion.setText("Volver al Menu");
        btnCerrarSesion.setToolTipText("Vuelva al menu de bedel");
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        pnlPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Días Fijos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), null)); // NOI18N
        pnlPeriodo.setEnabled(false);

        chkLunes.setText("Lunes");
        chkLunes.setAutoscrolls(true);
        chkLunes.setEnabled(false);

        chkMartes.setText("Martes");
        chkMartes.setAutoscrolls(true);
        chkMartes.setEnabled(false);

        chkMiercoles.setText("Miércoles");
        chkMiercoles.setAutoscrolls(true);
        chkMiercoles.setEnabled(false);

        chkJueves.setText("Jueves");
        chkJueves.setAutoscrolls(true);
        chkJueves.setEnabled(false);

        chkViernes.setText("Viernes");
        chkViernes.setAutoscrolls(true);
        chkViernes.setEnabled(false);

        lblHoraInicio1.setText("Hora Inicio");
        lblHoraInicio1.setAutoscrolls(true);
        lblHoraInicio1.setEnabled(false);

        txtHoraInicio1.setText("  :  ");
        txtHoraInicio1.setToolTipText("Ingrese la hora de inicio de la reserva");
        txtHoraInicio1.setEnabled(false);

        lblDuracion1.setText("Duración");
        lblDuracion1.setAutoscrolls(true);
        lblDuracion1.setEnabled(false);

        cmbDuracion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duración", "0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6" }));
        cmbDuracion1.setEnabled(false);

        lblHoraInicio2.setText("Hora Inicio");
        lblHoraInicio2.setAutoscrolls(true);
        lblHoraInicio2.setEnabled(false);

        txtHoraInicio2.setText("  :  ");
        txtHoraInicio2.setToolTipText("Ingrese la hora de inicio de la reserva");
        txtHoraInicio2.setEnabled(false);

        lblDuracion2.setText("Duración");
        lblDuracion2.setAutoscrolls(true);
        lblDuracion2.setEnabled(false);

        cmbDuracion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duración", "0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6" }));
        cmbDuracion2.setEnabled(false);

        lblHoraInicio3.setText("Hora Inicio");
        lblHoraInicio3.setAutoscrolls(true);
        lblHoraInicio3.setEnabled(false);

        txtHoraInicio3.setText("  :  ");
        txtHoraInicio3.setToolTipText("Ingrese la hora de inicio de la reserva");
        txtHoraInicio3.setEnabled(false);

        lblDuracion3.setText("Duración");
        lblDuracion3.setAutoscrolls(true);
        lblDuracion3.setEnabled(false);

        cmbDuracion3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duración", "0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6" }));
        cmbDuracion3.setEnabled(false);

        lblHoraInicio4.setText("Hora Inicio");
        lblHoraInicio4.setAutoscrolls(true);
        lblHoraInicio4.setEnabled(false);

        txtHoraInicio4.setText("  :  ");
        txtHoraInicio4.setToolTipText("Ingrese la hora de inicio de la reserva");
        txtHoraInicio4.setEnabled(false);

        lblDuracion4.setText("Duración");
        lblDuracion4.setAutoscrolls(true);
        lblDuracion4.setEnabled(false);

        cmbDuracion4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duración", "0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6" }));
        cmbDuracion4.setEnabled(false);

        lblHoraInicio5.setText("Hora Inicio");
        lblHoraInicio5.setAutoscrolls(true);
        lblHoraInicio5.setEnabled(false);

        txtHoraInicio5.setText("  :  ");
        txtHoraInicio5.setToolTipText("Ingrese la hora de inicio de la reserva");
        txtHoraInicio5.setEnabled(false);

        lblDuracion5.setText("Duración");
        lblDuracion5.setAutoscrolls(true);
        lblDuracion5.setEnabled(false);

        cmbDuracion5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duración", "0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6" }));
        cmbDuracion5.setEnabled(false);

        cmbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione período---", "PRIMER CUATRIMESTRE", "SEGUNDO CUATRIMESTRE", "ANUAL" }));
        cmbPeriodo.setToolTipText("Seleccione el período por el que desea reservar el aula");
        cmbPeriodo.setEnabled(false);

        javax.swing.GroupLayout pnlPeriodoLayout = new javax.swing.GroupLayout(pnlPeriodo);
        pnlPeriodo.setLayout(pnlPeriodoLayout);
        pnlPeriodoLayout.setHorizontalGroup(
            pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkViernes)
                    .addComponent(chkJueves)
                    .addComponent(chkMiercoles)
                    .addComponent(chkMartes)
                    .addComponent(chkLunes))
                .addGap(16, 16, 16)
                .addGroup(pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPeriodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPeriodoLayout.createSequentialGroup()
                        .addGroup(pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                .addComponent(lblHoraInicio5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraInicio5))
                            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                .addComponent(lblHoraInicio4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraInicio4))
                            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                .addComponent(lblHoraInicio3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraInicio3))
                            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                .addComponent(lblHoraInicio2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraInicio2))
                            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                .addComponent(lblHoraInicio1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                .addComponent(lblDuracion4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbDuracion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                .addComponent(lblDuracion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbDuracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                .addComponent(lblDuracion2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbDuracion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                .addGroup(pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                        .addComponent(lblDuracion5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbDuracion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlPeriodoLayout.createSequentialGroup()
                                        .addComponent(lblDuracion3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbDuracion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlPeriodoLayout.setVerticalGroup(
            pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeriodoLayout.createSequentialGroup()
                .addGroup(pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkLunes)
                    .addComponent(lblHoraInicio1)
                    .addComponent(txtHoraInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuracion1)
                    .addComponent(cmbDuracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMartes)
                    .addComponent(lblHoraInicio2)
                    .addComponent(txtHoraInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuracion2)
                    .addComponent(cmbDuracion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoraInicio3)
                    .addComponent(txtHoraInicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuracion3)
                    .addComponent(cmbDuracion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkJueves)
                    .addComponent(lblHoraInicio4)
                    .addComponent(txtHoraInicio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuracion4)
                    .addComponent(cmbDuracion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkViernes)
                    .addComponent(lblHoraInicio5)
                    .addComponent(txtHoraInicio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuracion5)
                    .addComponent(cmbDuracion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Días Específicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), null)); // NOI18N
        pnlFecha.setEnabled(false);

        javax.swing.GroupLayout pnlFechaLayout = new javax.swing.GroupLayout(pnlFecha);
        pnlFecha.setLayout(pnlFechaLayout);
        pnlFechaLayout.setHorizontalGroup(
            pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlFechaLayout.setVerticalGroup(
            pnlFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        btnPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendar_period.png"))); // NOI18N
        btnPeriodo.setText("Por Período");
        btnPeriodo.setToolTipText("Solicite la reserva de un aula por un determinado período de tiempo");
        btnPeriodo.setEnabled(false);
        btnPeriodo.setIconTextGap(6);

        btnFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendar_date.png"))); // NOI18N
        btnFecha.setText("Por Fecha");
        btnFecha.setToolTipText("Solicite un aula de manera esporádica para una fecha en particular");
        btnFecha.setEnabled(false);
        btnFecha.setIconTextGap(6);

        lblNombreSolicitante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreSolicitante.setText("Nombre del Solicitante");
        lblNombreSolicitante.setEnabled(false);

        lblApellidoSolicitante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblApellidoSolicitante.setText("Apellido del Solicitante");
        lblApellidoSolicitante.setEnabled(false);

        lblCatedra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCatedra.setText("Nombre de la Cátedra");
        lblCatedra.setEnabled(false);

        lblTipoAula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipoAula.setText("Tipo de Aula");
        lblTipoAula.setEnabled(false);

        lblCantAlumnos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCantAlumnos.setText("Cantidad de Alumnos");
        lblCantAlumnos.setEnabled(false);

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEmail.setText("Email de Contacto");
        lblEmail.setEnabled(false);

        txtNombreSolicitante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreSolicitante.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtNombreSolicitante.setText("Nombre");
        txtNombreSolicitante.setToolTipText("Ingrese el nombre del solicitante");
        txtNombreSolicitante.setEnabled(false);

        txtApellidoSolicitante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellidoSolicitante.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtApellidoSolicitante.setText("Apellido");
        txtApellidoSolicitante.setToolTipText("Ingrese el apellido del solicitante");
        txtApellidoSolicitante.setEnabled(false);

        txtCatedra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCatedra.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtCatedra.setText("Cátedra");
        txtCatedra.setToolTipText("Ingrese la cátedra que solicita el aula");
        txtCatedra.setEnabled(false);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtEmail.setText("usuario@dominio.com");
        txtEmail.setToolTipText("Ingrese un correo electrónico de contacto");
        txtEmail.setEnabled(false);

        txtCantAlumnos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCantAlumnos.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        txtCantAlumnos.setToolTipText("Ingrese la cantidad de alumnos");
        txtCantAlumnos.setEnabled(false);

        cmbTipoAula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTipoAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aula", "Multimedios", "Informática", "Sin Recursos" }));
        cmbTipoAula.setToolTipText("Seleccione el tipo de aula");
        cmbTipoAula.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblReservar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion))
                    .addComponent(pnlPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSolicitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCantAlumnos)
                        .addGap(12, 12, 12)
                        .addComponent(txtCantAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipoAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTipoAula, 0, 1, Short.MAX_VALUE))
                    .addComponent(pnlFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComplete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreBedel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCatedra)
                            .addComponent(lblEmail))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(txtCatedra)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreSolicitante)
                            .addComponent(lblApellidoSolicitante))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreSolicitante)
                            .addComponent(txtApellidoSolicitante))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservar)
                    .addComponent(btnCerrarSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreBedel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblComplete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPeriodo)
                    .addComponent(btnFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreSolicitante)
                    .addComponent(txtNombreSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoSolicitante)
                    .addComponent(txtApellidoSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCatedra)
                    .addComponent(txtCatedra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantAlumnos)
                    .addComponent(txtCantAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoAula)
                    .addComponent(cmbTipoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ReservarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarAula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnFecha;
    private javax.swing.JButton btnPeriodo;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JCheckBox chkJueves;
    private javax.swing.JCheckBox chkLunes;
    private javax.swing.JCheckBox chkMartes;
    private javax.swing.JCheckBox chkMiercoles;
    private javax.swing.JCheckBox chkViernes;
    private javax.swing.JComboBox<String> cmbDuracion;
    private javax.swing.JComboBox<String> cmbDuracion1;
    private javax.swing.JComboBox<String> cmbDuracion2;
    private javax.swing.JComboBox<String> cmbDuracion3;
    private javax.swing.JComboBox<String> cmbDuracion4;
    private javax.swing.JComboBox<String> cmbDuracion5;
    private javax.swing.JComboBox<String> cmbPeriodo;
    private javax.swing.JComboBox<String> cmbTipoAula;
    private javax.swing.JLabel lblApellidoSolicitante;
    private javax.swing.JLabel lblCantAlumnos;
    private javax.swing.JLabel lblCatedra;
    private javax.swing.JLabel lblComplete;
    private javax.swing.JLabel lblDuracion1;
    private javax.swing.JLabel lblDuracion2;
    private javax.swing.JLabel lblDuracion3;
    private javax.swing.JLabel lblDuracion4;
    private javax.swing.JLabel lblDuracion5;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoraInicio1;
    private javax.swing.JLabel lblHoraInicio2;
    private javax.swing.JLabel lblHoraInicio3;
    private javax.swing.JLabel lblHoraInicio4;
    private javax.swing.JLabel lblHoraInicio5;
    private javax.swing.JLabel lblNombreBedel;
    private javax.swing.JLabel lblNombreSolicitante;
    private javax.swing.JLabel lblReservar;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JLabel lblTipoAula;
    private javax.swing.JPanel pnlFecha;
    private javax.swing.JPanel pnlPeriodo;
    private javax.swing.JTextField txtApellidoSolicitante;
    private javax.swing.JTextField txtCantAlumnos;
    private javax.swing.JTextField txtCatedra;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoraInicio1;
    private javax.swing.JTextField txtHoraInicio2;
    private javax.swing.JTextField txtHoraInicio3;
    private javax.swing.JTextField txtHoraInicio4;
    private javax.swing.JTextField txtHoraInicio5;
    private javax.swing.JTextField txtNombreSolicitante;
    // End of variables declaration//GEN-END:variables
}
