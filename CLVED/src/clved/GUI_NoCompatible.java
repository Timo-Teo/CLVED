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
public class GUI_NoCompatible extends javax.swing.JFrame {

    /**
     * Creates new form GUI_NoCompatible
     */
    public GUI_NoCompatible() {
        initComponents();
        setLocationRelativeTo(null);
        txaNoCompatibles.setText(GUI_Donador.informacionLista);
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
        lblRinon2 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblRinon1 = new javax.swing.JLabel();
        lblClved = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaNoCompatibles = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(null);

        lblRinon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RiñonPequeño.png"))); // NOI18N
        pnlFondo.add(lblRinon2);
        lblRinon2.setBounds(560, 10, 50, 50);

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lblTitulo.setText("NO COMPATIBLES");
        pnlFondo.add(lblTitulo);
        lblTitulo.setBounds(250, 10, 310, 42);

        lblRinon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RiñonPequeño.png"))); // NOI18N
        pnlFondo.add(lblRinon1);
        lblRinon1.setBounds(190, 10, 50, 50);

        lblClved.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblClved.setText("CLVED");
        pnlFondo.add(lblClved);
        lblClved.setBounds(10, 390, 70, 34);

        btnSalir.setBackground(new java.awt.Color(255, 204, 204));
        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlFondo.add(btnSalir);
        btnSalir.setBounds(730, 390, 120, 30);

        txaNoCompatibles.setColumns(20);
        txaNoCompatibles.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        txaNoCompatibles.setRows(5);
        jScrollPane1.setViewportView(txaNoCompatibles);

        pnlFondo.add(jScrollPane1);
        jScrollPane1.setBounds(100, 80, 620, 280);

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        GUI_Menu menu = new GUI_Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_NoCompatible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_NoCompatible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_NoCompatible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_NoCompatible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_NoCompatible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClved;
    private javax.swing.JLabel lblRinon1;
    private javax.swing.JLabel lblRinon2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextArea txaNoCompatibles;
    // End of variables declaration//GEN-END:variables
}
