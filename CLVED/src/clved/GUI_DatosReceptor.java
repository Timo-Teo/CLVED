/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clved;

/**
 *
 * @author Tim
 */
public class GUI_DatosReceptor extends javax.swing.JFrame {

    
    
    /**
     * Creates new form GUI_DatosReceptor
     */
    public GUI_DatosReceptor() {
        initComponents();
        setLocationRelativeTo(null);
        
        txaResumenDatos.setText(GUI_Receptor.datosReceptor);
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
        lblEnfermera = new javax.swing.JLabel();
        lblRinion1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnResumenSangre = new javax.swing.JButton();
        lblRinoin = new javax.swing.JLabel();
        btnNoCompatible = new javax.swing.JButton();
        btnCompatible = new javax.swing.JButton();
        lblClved = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResumenDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(null);

        lblEnfermera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enfermera.png"))); // NOI18N
        pnlFondo.add(lblEnfermera);
        lblEnfermera.setBounds(630, 30, 200, 331);

        lblRinion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RiñonPequeño.png"))); // NOI18N
        pnlFondo.add(lblRinion1);
        lblRinion1.setBounds(550, 10, 50, 50);

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lblTitulo.setText("TUS DATOS SON");
        pnlFondo.add(lblTitulo);
        lblTitulo.setBounds(270, 10, 277, 42);

        btnResumenSangre.setBackground(new java.awt.Color(204, 204, 255));
        btnResumenSangre.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        btnResumenSangre.setText("RESUMEN SANGRE");
        btnResumenSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenSangreActionPerformed(evt);
            }
        });
        pnlFondo.add(btnResumenSangre);
        btnResumenSangre.setBounds(620, 380, 210, 33);

        lblRinoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RiñonPequeño.png"))); // NOI18N
        pnlFondo.add(lblRinoin);
        lblRinoin.setBounds(210, 10, 50, 50);

        btnNoCompatible.setBackground(new java.awt.Color(255, 204, 204));
        btnNoCompatible.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        btnNoCompatible.setText("NO COMPATIBLES");
        btnNoCompatible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoCompatibleActionPerformed(evt);
            }
        });
        pnlFondo.add(btnNoCompatible);
        btnNoCompatible.setBounds(330, 380, 210, 33);

        btnCompatible.setBackground(new java.awt.Color(204, 255, 204));
        btnCompatible.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        btnCompatible.setText("COMPATIBLES");
        btnCompatible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompatibleActionPerformed(evt);
            }
        });
        pnlFondo.add(btnCompatible);
        btnCompatible.setBounds(40, 380, 210, 33);

        lblClved.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblClved.setText("CLVED");
        pnlFondo.add(lblClved);
        lblClved.setBounds(10, 10, 70, 34);

        txaResumenDatos.setColumns(20);
        txaResumenDatos.setRows(5);
        jScrollPane1.setViewportView(txaResumenDatos);

        pnlFondo.add(jScrollPane1);
        jScrollPane1.setBounds(40, 100, 500, 230);

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResumenSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenSangreActionPerformed
        // TODO add your handling code here:
        GUI_TipoSangre resumen = new GUI_TipoSangre();
        resumen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnResumenSangreActionPerformed

    private void btnNoCompatibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoCompatibleActionPerformed
        // TODO add your handling code here:
        GUI_NoCompatible noCompatible = new GUI_NoCompatible();
        noCompatible.setVisible(true);
    }//GEN-LAST:event_btnNoCompatibleActionPerformed

    private void btnCompatibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompatibleActionPerformed
        // TODO add your handling code here:
        GUI_Compatible compatible= new GUI_Compatible();
        compatible.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCompatibleActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_DatosReceptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_DatosReceptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_DatosReceptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_DatosReceptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_DatosReceptor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompatible;
    private javax.swing.JButton btnNoCompatible;
    private javax.swing.JButton btnResumenSangre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClved;
    private javax.swing.JLabel lblEnfermera;
    private javax.swing.JLabel lblRinion1;
    private javax.swing.JLabel lblRinoin;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextArea txaResumenDatos;
    // End of variables declaration//GEN-END:variables
}
