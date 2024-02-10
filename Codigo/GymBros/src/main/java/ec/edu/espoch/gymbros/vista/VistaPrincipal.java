package ec.edu.espoch.gymbros.vista;

import ec.edu.espoch.gymbros.controlador.ControladorVistaPrincipal;

public class VistaPrincipal extends javax.swing.JFrame {

    private ControladorVistaPrincipal controlador;
    
    public VistaPrincipal() {
        initComponents();
        this.controlador = new ControladorVistaPrincipal(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bnRegistar = new javax.swing.JButton();
        btDatosGenerales = new javax.swing.JButton();
        inf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GymBros");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("GYMBROS");

        bnRegistar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bnRegistar.setText("Resgistrar");
        bnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnRegistarActionPerformed(evt);
            }
        });

        btDatosGenerales.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btDatosGenerales.setText("Datos Generales");
        btDatosGenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDatosGeneralesActionPerformed(evt);
            }
        });

        inf.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        inf.setText("?");
        inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 104, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bnRegistar)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btDatosGenerales)
                                .addGap(108, 108, 108))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(inf)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(inf, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnRegistar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDatosGenerales)
                .addContainerGap(18, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void btDatosGeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDatosGeneralesActionPerformed
        this.controlador.botonAccion("Datos Generales");
    }//GEN-LAST:event_btDatosGeneralesActionPerformed

    private void bnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnRegistarActionPerformed
        this.controlador.botonAccion("Registrar");
    }//GEN-LAST:event_bnRegistarActionPerformed

    private void infActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infActionPerformed
        this.controlador.botonInf();
    }//GEN-LAST:event_infActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnRegistar;
    private javax.swing.JButton btDatosGenerales;
    private javax.swing.JButton inf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
