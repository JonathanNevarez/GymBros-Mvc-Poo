package ec.edu.espoch.gymbros.vista;

import ec.edu.espoch.gymbros.controlador.ControladorDatosGenerales;
import ec.edu.espoch.gymbros.modelo.Persona;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VistaDatosGenerales extends javax.swing.JFrame {
    
    private ControladorDatosGenerales controlDatosGenearal;
    DefaultTableModel model = new DefaultTableModel();
    
    
    public VistaDatosGenerales() {
        initComponents();
        controlDatosGenearal = new ControladorDatosGenerales(this);
        controlDatosGenearal.accionAgregar();
    }
    
    public void setModelo(){
        String[] cabecera = {"Nombre", "Edad", "Cedula", "Tipo de Sangre", "Suscripcion"};
        model.setColumnIdentifiers(cabecera);
        jTable1.setModel(model);
    }
    
    public void setDatos(ArrayList<Persona> personas){
        Object[] datos = new Object[model.getColumnCount()];
        int i =0;
        for (Persona persona : personas) {
            datos[0] = persona.getNombre();
            datos[1] = persona.getEdad();
            datos[2] = persona.getCedula();
            datos[3] = persona.getTpSangre();
            datos[4] = persona.getTpSuscripcion();
            i++;
            model.addRow(datos);      
        }
        jTable1.setModel(model);
    }
 
    public void actualizarTabla(ArrayList<Persona> personas) {
        model.setRowCount(0);
        setDatos(personas);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        regresar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        modificar = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Generales");
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Personas registradas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        regresar.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        mensaje.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje.setText(" ");

        modificar.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 162, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(regresar)
                .addGap(24, 24, 24)
                .addComponent(modificar)
                .addGap(18, 18, 18)
                .addComponent(eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(eliminar)
                    .addComponent(modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.controlDatosGenearal.accionRetroceder();
    }//GEN-LAST:event_regresarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        this.controlDatosGenearal.accionEliminar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        this.controlDatosGenearal.accionModificar();
    }//GEN-LAST:event_modificarActionPerformed

    public void setMensaje(String mensaje) {
        this.mensaje.setText(mensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JButton modificar;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
