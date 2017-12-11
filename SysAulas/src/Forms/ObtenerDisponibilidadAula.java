/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Dao.AulaDao;
import Gestores.AdministradorAulas;
import Gestores.AdministradorInterfaz;
import Gestores.AdministradorReservas;
import Gestores.AdministradorSesion;
import db.model.Aula;
import db.model.Dia;
import db.model.Esporadica;
import db.model.Fecha;
import db.model.InfoAulasDisponibles;
import db.model.InformacionSolicitante;
import db.model.Informatica;
import db.model.Multimedios;
import db.model.Periodica;
import db.model.SinRecursos;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Hibernate;

/**
 *
 * @author Laureano
 */
public class ObtenerDisponibilidadAula extends javax.swing.JFrame {

    
    private Periodica reservaPeriodica = null;
    private Esporadica reservaEsporadica = null;
    private ArrayList<InfoAulasDisponibles> opciones;
    private ArrayList<Fecha> fechas;
    private ArrayList<Aula> aulasDisponibles;
    private Integer fechaInd;
    private InformacionSolicitante infoSolicitante;
    
    
    /**
     * Creates new form ObtenerDisponibilidadAula
     */
    public ObtenerDisponibilidadAula() {
        initComponents();
    }
    
    @Override
    public void setVisible(boolean b) {
        lblNombreBedel.setText(AdministradorSesion.getUsuarioActual().getNombreUsuario());
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

        ReservasSuperpuestas = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        grdAulas = new javax.swing.JTable();
        btnVolver1 = new javax.swing.JButton();
        lblDisponibilidad1 = new javax.swing.JLabel();
        lblDisponibilidad = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtFecha = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblHoraInicio = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        lblDuracion = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        lblDia = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        lblCatedra = new javax.swing.JLabel();
        txtCatedra = new javax.swing.JTextField();
        lblTipoAula = new javax.swing.JLabel();
        txtTipoAula = new javax.swing.JTextField();
        lblCantAlumnos = new javax.swing.JLabel();
        txtCantAlumnos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAulasDisponibles = new javax.swing.JTable();
        lblSesion = new javax.swing.JLabel();
        lblNombreBedel = new javax.swing.JLabel();
        lblSeleccione = new javax.swing.JLabel();
        btnGuardarReserva = new javax.swing.JButton();
        btnCancelarSolicitud = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDias = new javax.swing.JList<>();
        btnRefrescar = new javax.swing.JButton();
        jGuardarTodo = new javax.swing.JButton();

        ReservasSuperpuestas.setTitle("Disponibilidad de Aulas");
        ReservasSuperpuestas.setType(java.awt.Window.Type.UTILITY);

        grdAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N° de Aula", "Piso", "Capacidad", "Características", "Hora Inicio Disponibilidad", "Hora Fin Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grdAulas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(grdAulas);

        btnVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendar_period.png"))); // NOI18N
        btnVolver1.setText("Volver a la Reserva");
        btnVolver1.setToolTipText("Vuelva a la reserva del aula");
        btnVolver1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblDisponibilidad1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDisponibilidad1.setText("Reservas Superpuestas");

        javax.swing.GroupLayout ReservasSuperpuestasLayout = new javax.swing.GroupLayout(ReservasSuperpuestas.getContentPane());
        ReservasSuperpuestas.getContentPane().setLayout(ReservasSuperpuestasLayout);
        ReservasSuperpuestasLayout.setHorizontalGroup(
            ReservasSuperpuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservasSuperpuestasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReservasSuperpuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReservasSuperpuestasLayout.createSequentialGroup()
                        .addComponent(lblDisponibilidad1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
                .addContainerGap())
        );
        ReservasSuperpuestasLayout.setVerticalGroup(
            ReservasSuperpuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservasSuperpuestasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReservasSuperpuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver1)
                    .addComponent(lblDisponibilidad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysAulas - Disponibilidad de Aulas [BEDEL]");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblDisponibilidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDisponibilidad.setText("Disponibildad de Aulas");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendar_period.png"))); // NOI18N
        btnVolver.setText("Volver a la Reserva");
        btnVolver.setToolTipText("Vuelva a la reserva del aula");
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Solicitud", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), null)); // NOI18N

        txtFecha.setText("  /  /    ");
        txtFecha.setToolTipText("Fecha de la solicitud de reserva");
        txtFecha.setEnabled(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        lblFecha.setText("Fecha");

        lblHoraInicio.setText("Hora Inicio");
        lblHoraInicio.setAutoscrolls(true);

        txtHoraInicio.setText("  :  ");
        txtHoraInicio.setToolTipText("Hora de inicio de la solicitud de reserva");
        txtHoraInicio.setEnabled(false);
        txtHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraInicioActionPerformed(evt);
            }
        });

        lblDuracion.setText("Duracion");
        lblDuracion.setAutoscrolls(true);

        txtDuracion.setToolTipText("");
        txtDuracion.setEnabled(false);

        lblDia.setText("Día");

        txtDia.setToolTipText("Día de la solicitud de reserva");
        txtDia.setEnabled(false);
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        lblCatedra.setText("Cátedra");

        txtCatedra.setToolTipText("Catedra de la solicitud de reserva");
        txtCatedra.setEnabled(false);

        lblTipoAula.setText("Tipo de Aula");

        txtTipoAula.setToolTipText("Tipo de aula de la solicitud de reserva");
        txtTipoAula.setEnabled(false);

        lblCantAlumnos.setText("Alumnos");

        txtCantAlumnos.setToolTipText("Cantidad de alumnos de la solicitud de reserva");
        txtCantAlumnos.setEnabled(false);
        txtCantAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantAlumnos)
                    .addComponent(lblDia)
                    .addComponent(lblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoAula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHoraInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCatedra, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCatedra)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDuracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTipoAula, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFecha)
                        .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHoraInicio)
                        .addComponent(lblDuracion)
                        .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDia)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoAula)
                    .addComponent(txtTipoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCatedra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCatedra)
                    .addComponent(txtCantAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantAlumnos))
                .addGap(6, 6, 6))
        );

        tblAulasDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° de Aula", "Piso", "Capacidad", "Características"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAulasDisponibles.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblAulasDisponibles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAulasDisponibles.getTableHeader().setResizingAllowed(false);
        tblAulasDisponibles.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAulasDisponibles);
        if (tblAulasDisponibles.getColumnModel().getColumnCount() > 0) {
            tblAulasDisponibles.getColumnModel().getColumn(0).setResizable(false);
            tblAulasDisponibles.getColumnModel().getColumn(1).setResizable(false);
            tblAulasDisponibles.getColumnModel().getColumn(2).setResizable(false);
            tblAulasDisponibles.getColumnModel().getColumn(3).setResizable(false);
        }

        lblSesion.setText("<html><u>Sesión Actual:</u></html>");

        lblNombreBedel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreBedel.setText("Nombre_Bedel");

        lblSeleccione.setText("Selecccione un aula disponible para completar la reserva de la solicitud actual.");

        btnGuardarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save.png"))); // NOI18N
        btnGuardarReserva.setText("Guardar Reserva");
        btnGuardarReserva.setToolTipText("Guardar y confirmar la reserva del aula");
        btnGuardarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarReservaMouseClicked(evt);
            }
        });

        btnCancelarSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnCancelarSolicitud.setText("Cancelar Solicitud");
        btnCancelarSolicitud.setToolTipText("Cancelar la solicitud de reserva");
        btnCancelarSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarSolicitudMouseClicked(evt);
            }
        });

        lstDias.setModel(new DefaultListModel ());
        jScrollPane2.setViewportView(lstDias);

        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/refresh.png"))); // NOI18N
        btnRefrescar.setText("Refrescar Datos");
        btnRefrescar.setToolTipText("Actualice los datos de la solicitud actual");
        btnRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefrescarMouseClicked(evt);
            }
        });

        jGuardarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save_all.png"))); // NOI18N
        jGuardarTodo.setText("Guardar todo y volver");
        jGuardarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jGuardarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDisponibilidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSeleccione)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreBedel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jGuardarTodo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisponibilidad)
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreBedel))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jGuardarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lblSeleccione)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnRefrescar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarReserva)
                    .addComponent(btnCancelarSolicitud))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraInicioActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void btnRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescarMouseClicked
        if (lstDias.getSelectedIndex() != -1) {
            DefaultTableModel model = (DefaultTableModel) tblAulasDisponibles.getModel();

            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            aulasDisponibles = new ArrayList<>();

            fechaInd = lstDias.getSelectedIndex();
            Fecha fecha = fechas.get(fechaInd);
            InfoAulasDisponibles opcionSelect = null;
            for(InfoAulasDisponibles iAD : opciones) {
                if (iAD.getFecha() == fecha) {
                    opcionSelect = iAD;
                    break;
                }
            }
            txtFecha.setText(((java.sql.Date)fecha.getFecha()).toString());
            txtHoraInicio.setText(((Time)fecha.getHoraInicio()).toString());
            txtDia.setText(fecha.getDia().getNombreDia());
            txtCatedra.setText(infoSolicitante.getCatedra());
            txtTipoAula.setText(infoSolicitante.getTipoAula());

            if (reservaEsporadica != null) {
                txtCantAlumnos.setText(reservaEsporadica.getCantidadAlumnos().toString());
            }
            if (reservaPeriodica != null) {
                txtCantAlumnos.setText(reservaPeriodica.getCantidadAlumnos().toString());
            }
            txtDuracion.setText(String.format("%.1f", (double) fecha.getDuracion()/1000)+" h");
            
            String caracteristicas = "";
            if (opcionSelect != null) {
                for(Aula a : opcionSelect.getOpcionesAulas()) {
                    //System.out.println(a);
                    if (Hibernate.getClass(a) == Multimedios.class) {
                        Multimedios m = AdministradorAulas.deproxyMultimedios(a);
                        caracteristicas += "AA: "+m.getAireAcondicionado()+" - Tipo pizarron: "+m.getTipoPizarron();
                        caracteristicas += " - Televisor: "+m.getTelevisor()+" - Cañon: "+m.getCanion()+" - PC: "+m.getComputadora()+" - DVD: "+m. getDvd();
                    } else if (Hibernate.getClass(a) == Informatica.class) {
                        Informatica i = AdministradorAulas.deproxyInformatica(a);
                        
                        caracteristicas += "AA: "+i.getAireAcondicionado()+" - Tipo pizarron: "+i.getTipoPizarron();
                        caracteristicas += " - Cañon: "+i.getCanion()+" - Cant. PCs: "+i.getCantidadPcs();
                    } else if (Hibernate.getClass(a) == SinRecursos.class) {
                        SinRecursos s = AdministradorAulas.deproxySinRecursos(a);
                        caracteristicas += "AA: "+s.getAireAcondicionado()+" - Tipo pizarron: "+s.getTipoPizarron();
                        caracteristicas += " - Ventiladores: "+s.getVentiladores();
                    }
                    aulasDisponibles.add(a);
                    tblAulasDisponibles.getColumnModel().getColumn(3).setPreferredWidth(caracteristicas.length()*8);
                    model.addRow(new Object[]{a.getIdAula(),a.getUbicacion(), a.getCapacidad(), caracteristicas});
                    caracteristicas = "";
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe tener seleccionada una fecha para poder ver las aulas disponibles", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRefrescarMouseClicked

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        Integer respuesta = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas volver al menu anterior sin realizar la reserva?", "Volver?",  JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            ObtenerDisponibilidadAula nuevo = new ObtenerDisponibilidadAula();
            nuevo.setLocationRelativeTo(null);
            //nuevo.setAlwaysOnTop(true);
            AdministradorInterfaz.setObtenerDisp(nuevo);
            AdministradorInterfaz.getReservarAula().setVisible(true);
            AdministradorInterfaz.getReservarAula().resetearDias();
            this.dispose();
        }
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnGuardarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarReservaMouseClicked
        if (tblAulasDisponibles.getSelectedRow() != -1) {
            Integer ind = tblAulasDisponibles.getSelectedRow();
            Aula seleccionada = aulasDisponibles.get(ind);
            Integer respuesta = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas reservar el aula "+seleccionada.getIdAula()+" para el dia "+fechas.get(fechaInd).getFecha()+"?", "Guardar?",  JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                fechas.get(fechaInd).setAula(seleccionada);
                JOptionPane.showMessageDialog(this, "Aula asociada a reserva con exito!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un aula para poder resevar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarReservaMouseClicked

    private void jGuardarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarTodoActionPerformed
        boolean permitir = true;
        int i = 0;
        while(permitir && i < fechas.size()) {
            if (fechas.get(i).getAula() == null) {
                permitir = false;
            }
            i++;
        }
        
        if (permitir) {
            if (reservaEsporadica != null) {
                AdministradorReservas.guardarEsporadica(reservaEsporadica, infoSolicitante);
                reservaEsporadica = null;
            }
            if (reservaPeriodica != null) {
                AdministradorReservas.guardarPeriodica(reservaPeriodica, infoSolicitante);
                reservaPeriodica = null;
            }

            //Volver al menu anterior
            ObtenerDisponibilidadAula nuevo = new ObtenerDisponibilidadAula();
            nuevo.setLocationRelativeTo(null);
            //nuevo.setAlwaysOnTop(true);
            
            AdministradorInterfaz.setObtenerDisp(nuevo);
            AdministradorInterfaz.getReservarAula().setVisible(true);
            AdministradorInterfaz.getReservarAula().resetearDias();
        this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No puede guardar la reserva sin seleccionar un aula para cada fecha", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jGuardarTodoActionPerformed

    private void txtCantAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantAlumnosActionPerformed

    private void btnCancelarSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarSolicitudMouseClicked
        Integer respuesta = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas borrar la reserva hecha para el dia "+fechas.get(fechaInd).getFecha()+"?", "Cancelar?",  JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            fechas.get(fechaInd).setAula(null);
            JOptionPane.showMessageDialog(this, "Aula quitada de la reserva con exito!");
        }
    }//GEN-LAST:event_btnCancelarSolicitudMouseClicked

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
            java.util.logging.Logger.getLogger(ObtenerDisponibilidadAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObtenerDisponibilidadAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObtenerDisponibilidadAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObtenerDisponibilidadAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObtenerDisponibilidadAula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ReservasSuperpuestas;
    private javax.swing.JButton btnCancelarSolicitud;
    private javax.swing.JButton btnGuardarReserva;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JTable grdAulas;
    private javax.swing.JButton jGuardarTodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCantAlumnos;
    private javax.swing.JLabel lblCatedra;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblDisponibilidad;
    private javax.swing.JLabel lblDisponibilidad1;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblNombreBedel;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JLabel lblTipoAula;
    private javax.swing.JList<String> lstDias;
    private javax.swing.JTable tblAulasDisponibles;
    private javax.swing.JTextField txtCantAlumnos;
    private javax.swing.JTextField txtCatedra;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtTipoAula;
    // End of variables declaration//GEN-END:variables

    void enviarInformacionPeriodica(Periodica nuevaReserva, ArrayList<InfoAulasDisponibles> opciones, InformacionSolicitante infoSo) {
        infoSolicitante = infoSo;
        reservaPeriodica = nuevaReserva;
        fechas = new ArrayList<>();
        this.opciones = opciones;
        DefaultListModel model = (DefaultListModel) lstDias.getModel();
        //model.removeAllElements();
        
        Dia d;
        ArrayList<Object> tmp;
        Time horaInicio;
        java.sql.Date fecha;
        Integer duracion;
        ArrayList<Fecha> tmp2 = new ArrayList<>();
        for(Object o: nuevaReserva.getDias()) {
            d = (Dia) o;
            tmp = new ArrayList<>(d.getFechas());
            
            for(Object ob: tmp) {
                tmp2.add((Fecha) ob);
            }
        }
        
        
        Collections.sort(tmp2, new Comparator<Fecha>() {
            public int compare(Fecha f1, Fecha f2){
               return f1.getFecha().compareTo(f2.getFecha());
            }
        });
        
        
        for(Fecha f: tmp2) {
            horaInicio = (Time) (f).getHoraInicio();
            fecha = (java.sql.Date) (f).getFecha();
            duracion = (f).getDuracion();

            model.addElement(f.getDia().getNombreDia()+" - Fecha: "+fecha+" - Inicio: "+horaInicio+" -Duracion: "+String.format("%.1f", (double) duracion/1000)+" h");
            fechas.add(f);
        }
    }

    void enviarInformacionEsporadica(Esporadica nuevaReserva, ArrayList<InfoAulasDisponibles> opciones, InformacionSolicitante infoSo) {
        infoSolicitante = infoSo;
        reservaEsporadica = nuevaReserva;
        fechas = new ArrayList<>();
        this.opciones = opciones;
        DefaultListModel model = (DefaultListModel) lstDias.getModel();
        //model.removeAllElements();
        
        Dia d;
        ArrayList<Object> tmp;
        
        Time horaInicio;
        java.sql.Date fecha;
        Integer duracion;
        tmp = new ArrayList<>(nuevaReserva.getFechas());
        ArrayList<Fecha> tmp2 = new ArrayList<>();
        for(Object ob: tmp) {
            tmp2.add((Fecha) ob);
        }
        
        Collections.sort(tmp2, new Comparator<Fecha>() {
            public int compare(Fecha f1, Fecha f2){
               return f1.getFecha().compareTo(f2.getFecha());
            }
        });
        
        for(Fecha f: tmp2) {
            horaInicio = (Time) (f).getHoraInicio();
            fecha = (java.sql.Date) (f).getFecha();
            duracion = (f).getDuracion();
            model.addElement((f).getDia().getNombreDia()+" - Fecha: "+fecha+" - Inicio: "+horaInicio+" -Duracion: "+String.format("%.1f", (double) duracion/1000)+" h");
            fechas.add(f);
        }
    }
}
