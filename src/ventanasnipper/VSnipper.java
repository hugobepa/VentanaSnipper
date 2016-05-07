
package ventanasnipper;

/**
 *
 * @author hugo
 */
public class VSnipper extends javax.swing.JFrame {

    /**
     * Creates new form VSnipper
     */
    Snipper s=new Snipper();
    
    public VSnipper() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        SPDia = new javax.swing.JSpinner();
        SPMes = new javax.swing.JSpinner();
        SPAño = new javax.swing.JSpinner();
        BTGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BTHombre = new javax.swing.JRadioButton();
        BTMujer = new javax.swing.JRadioButton();
        BTMostrar = new javax.swing.JButton();
        BTSalir = new javax.swing.JButton();
        CBTalla = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SPDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        SPMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        SPAño.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, 2016, 1));

        BTGuardar.setText("Guardar");
        BTGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTGuardarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(BTHombre);
        BTHombre.setText("hombre");
        BTHombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTHombreMouseClicked(evt);
            }
        });

        buttonGroup1.add(BTMujer);
        BTMujer.setText("mujer");
        BTMujer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTMujerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BTHombre)
                .addGap(31, 31, 31)
                .addComponent(BTMujer)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTHombre)
                    .addComponent(BTMujer))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        BTMostrar.setText("Mostrar");
        BTMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTMostrarActionPerformed(evt);
            }
        });

        BTSalir.setText("Salir");
        BTSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalirActionPerformed(evt);
            }
        });

        CBTalla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XXL", "XL", "L", "M" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BTSalir)
                .addGap(18, 18, 18)
                .addComponent(BTMostrar)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(SPDia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(SPMes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SPAño, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BTGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SPDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTMostrar)
                    .addComponent(BTSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTGuardarActionPerformed
        s.getFecha(SPDia.getValue().toString(), SPMes.getValue().toString(),SPAño.getValue().toString());
        s.getTalla(CBTalla.getSelectedItem().toString());
    }//GEN-LAST:event_BTGuardarActionPerformed

    private void BTHombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTHombreMouseClicked
        // TODO add your handling code here:
        s.getSexo(BTHombre.getLabel());
    }//GEN-LAST:event_BTHombreMouseClicked

    private void BTMujerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTMujerMouseClicked
        // TODO add your handling code here:
         s.getSexo(BTMujer.getLabel());
    }//GEN-LAST:event_BTMujerMouseClicked

    private void BTMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTMostrarActionPerformed
        // TODO add your handling code here:
        s.mostrarDatos();
    }//GEN-LAST:event_BTMostrarActionPerformed

    private void BTSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BTSalirActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTGuardar;
    private javax.swing.JRadioButton BTHombre;
    private javax.swing.JButton BTMostrar;
    private javax.swing.JRadioButton BTMujer;
    private javax.swing.JButton BTSalir;
    public static javax.swing.JComboBox CBTalla;
    private javax.swing.JSpinner SPAño;
    private javax.swing.JSpinner SPDia;
    private javax.swing.JSpinner SPMes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
