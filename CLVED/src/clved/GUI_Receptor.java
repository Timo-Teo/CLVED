/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clved;

import javax.swing.ImageIcon;

/**
 *
 * @author Tim
 */
public class GUI_Receptor extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Receptor
     */
    public GUI_Receptor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblTipoSangre = new javax.swing.JLabel();
        lblRinon = new javax.swing.JLabel();
        lblCleved = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblEnfermedades = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblTipodeSangre = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        cmbTipoSangre = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        pnlEnfermedades = new javax.swing.JPanel();
        rbtnPresionArterial = new javax.swing.JRadioButton();
        rbtnDiabetes = new javax.swing.JRadioButton();
        rbtnHepatitis = new javax.swing.JRadioButton();
        rbtnEnfermedadCardiaca = new javax.swing.JRadioButton();
        rbtnEnfermedadRenal = new javax.swing.JRadioButton();
        rbtnNinguno = new javax.swing.JRadioButton();
        rbtnVih = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(null);

        lblTipoSangre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tipo-de-sangre.png"))); // NOI18N
        pnlFondo.add(lblTipoSangre);
        lblTipoSangre.setBounds(560, 20, 150, 180);

        lblRinon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RiñonPequeño.png"))); // NOI18N
        pnlFondo.add(lblRinon);
        lblRinon.setBounds(10, 470, 50, 50);

        lblCleved.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblCleved.setText("CLVED");
        pnlFondo.add(lblCleved);
        lblCleved.setBounds(60, 480, 70, 34);

        btnCancelar.setBackground(new java.awt.Color(255, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnCancelar);
        btnCancelar.setBounds(510, 490, 150, 30);

        lblNombres.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblNombres.setText("Nombres");
        pnlFondo.add(lblNombres);
        lblNombres.setBounds(40, 270, 99, 29);

        lblApellidos.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblApellidos.setText("Apellidos");
        pnlFondo.add(lblApellidos);
        lblApellidos.setBounds(40, 310, 102, 29);

        lblEnfermedades.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblEnfermedades.setText("Enfermedades");
        pnlFondo.add(lblEnfermedades);
        lblEnfermedades.setBounds(550, 290, 180, 29);

        lblSexo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblSexo.setText("Sexo");
        pnlFondo.add(lblSexo);
        lblSexo.setBounds(40, 230, 53, 29);

        lblEdad.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblEdad.setText("Edad");
        pnlFondo.add(lblEdad);
        lblEdad.setBounds(40, 350, 55, 29);

        lblTipodeSangre.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTipodeSangre.setText("Tipo de Sangre");
        pnlFondo.add(lblTipodeSangre);
        lblTipodeSangre.setBounds(440, 230, 180, 29);

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        pnlFondo.add(lblUsuario);
        lblUsuario.setBounds(110, 30, 160, 150);

        btnContinuar.setBackground(new java.awt.Color(204, 255, 204));
        btnContinuar.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        btnContinuar.setText("CONTINUAR");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnContinuar);
        btnContinuar.setBounds(680, 490, 150, 30);

        cmbTipoSangre.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cmbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-" }));
        cmbTipoSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoSangreActionPerformed(evt);
            }
        });
        pnlFondo.add(cmbTipoSangre);
        cmbTipoSangre.setBounds(670, 230, 150, 30);

        cmbSexo.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Femenino", "Masculino" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });
        pnlFondo.add(cmbSexo);
        cmbSexo.setBounds(160, 230, 140, 30);
        pnlFondo.add(txtNombres);
        txtNombres.setBounds(160, 270, 160, 30);
        pnlFondo.add(txtApellidos);
        txtApellidos.setBounds(160, 310, 160, 30);
        pnlFondo.add(txtEdad);
        txtEdad.setBounds(160, 350, 80, 30);

        pnlEnfermedades.setBackground(new java.awt.Color(255, 255, 255));
        pnlEnfermedades.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        rbtnPresionArterial.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtnPresionArterial.setText("Presión Arterial Alta");

        rbtnDiabetes.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtnDiabetes.setText("Diabetes");

        rbtnHepatitis.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtnHepatitis.setText("Hepatitis");

        rbtnEnfermedadCardiaca.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtnEnfermedadCardiaca.setText("Enfermedad Cardiaca");
        rbtnEnfermedadCardiaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEnfermedadCardiacaActionPerformed(evt);
            }
        });

        rbtnEnfermedadRenal.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtnEnfermedadRenal.setText("Enfermedad Renal");

        rbtnNinguno.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtnNinguno.setText("Ninguno");

        rbtnVih.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbtnVih.setText("VIH");

        javax.swing.GroupLayout pnlEnfermedadesLayout = new javax.swing.GroupLayout(pnlEnfermedades);
        pnlEnfermedades.setLayout(pnlEnfermedadesLayout);
        pnlEnfermedadesLayout.setHorizontalGroup(
            pnlEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnfermedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnHepatitis)
                    .addComponent(rbtnDiabetes)
                    .addComponent(rbtnPresionArterial)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnfermedadesLayout.createSequentialGroup()
                        .addComponent(rbtnVih)
                        .addGap(110, 110, 110)))
                .addGroup(pnlEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnfermedadesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnlEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnEnfermedadRenal)
                            .addComponent(rbtnEnfermedadCardiaca))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnfermedadesLayout.createSequentialGroup()
                        .addComponent(rbtnNinguno)
                        .addContainerGap())))
        );
        pnlEnfermedadesLayout.setVerticalGroup(
            pnlEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnfermedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnfermedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnfermedadesLayout.createSequentialGroup()
                        .addComponent(rbtnEnfermedadCardiaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnEnfermedadRenal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnNinguno))
                    .addGroup(pnlEnfermedadesLayout.createSequentialGroup()
                        .addComponent(rbtnPresionArterial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnDiabetes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnHepatitis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnVih)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlFondo.add(pnlEnfermedades);
        pnlEnfermedades.setBounds(430, 330, 410, 140);

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        GUI_Menu menu = new GUI_Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        GUI_Donador donador = new GUI_Donador();
        donador.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void cmbTipoSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoSangreActionPerformed
        // TODO add your handling code here:
        if( cmbTipoSangre.getSelectedItem().equals("A+")){
            lblTipoSangre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/A+.png")));
        }
        if( cmbTipoSangre.getSelectedItem().equals("A-")){
            lblTipoSangre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/A-.png")));
        }
        if( cmbTipoSangre.getSelectedItem().equals("B+")){
            lblTipoSangre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/B+.png")));
        }
        if( cmbTipoSangre.getSelectedItem().equals("B-")){
            lblTipoSangre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/B-.png")));
        }
        if( cmbTipoSangre.getSelectedItem().equals("O+")){
            lblTipoSangre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/O+.png")));
        }
        if( cmbTipoSangre.getSelectedItem().equals("AB+")){
            lblTipoSangre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AB+.png")));
        }
        if( cmbTipoSangre.getSelectedItem().equals("AB-")){
            lblTipoSangre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AB-.png")));
        }
        if( cmbTipoSangre.getSelectedItem().equals("O-")){
            lblTipoSangre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/O-.png")));
        }

    }//GEN-LAST:event_cmbTipoSangreActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
        if( cmbSexo.getSelectedItem().equals("Masculino")){
            lblUsuario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Hombre.png")));
        }if( cmbSexo.getSelectedItem().equals("Femenino")){
            lblUsuario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Mujer.png")));
        }if( cmbSexo.getSelectedItem().equals("Selecionar")){
            lblUsuario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Usuario.png")));
        }

    }//GEN-LAST:event_cmbSexoActionPerformed

    private void rbtnEnfermedadCardiacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEnfermedadCardiacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnEnfermedadCardiacaActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Receptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Receptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Receptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Receptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Receptor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbTipoSangre;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCleved;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEnfermedades;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblRinon;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JLabel lblTipodeSangre;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlEnfermedades;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JRadioButton rbtnDiabetes;
    private javax.swing.JRadioButton rbtnEnfermedadCardiaca;
    private javax.swing.JRadioButton rbtnEnfermedadRenal;
    private javax.swing.JRadioButton rbtnHepatitis;
    private javax.swing.JRadioButton rbtnNinguno;
    private javax.swing.JRadioButton rbtnPresionArterial;
    private javax.swing.JRadioButton rbtnVih;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
