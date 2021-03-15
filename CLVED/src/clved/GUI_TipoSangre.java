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
public class GUI_TipoSangre extends javax.swing.JFrame {

    /**
     * Creates new form GUI_TipoSangre
     */
    public GUI_TipoSangre() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Riñon.png")).getImage());
        txaTipoSangre.setText(GUI_Receptor.miMatriz.imprimirMatriz());
        txaTipoSangre.setEditable(false);
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
        lblRinon1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblRinon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblClved = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaTipoSangre = new javax.swing.JTextArea();
        btnAtrasDatosReceptor = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        lblTitulo7 = new javax.swing.JLabel();
        lblTitulo8 = new javax.swing.JLabel();
        lblTitulo9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(null);

        lblRinon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RiñonPequeño.png"))); // NOI18N
        pnlFondo.add(lblRinon1);
        lblRinon1.setBounds(560, 10, 50, 50);

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo.setText("c");
        pnlFondo.add(lblTitulo);
        lblTitulo.setBounds(30, 130, 30, 20);

        lblRinon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RiñonPequeño.png"))); // NOI18N
        pnlFondo.add(lblRinon);
        lblRinon.setBounds(210, 10, 50, 50);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("CLVED");
        pnlFondo.add(jLabel5);
        jLabel5.setBounds(70, 510, 70, 34);

        lblClved.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblClved.setText("CLVED");
        pnlFondo.add(lblClved);
        lblClved.setBounds(10, 370, 70, 34);

        btnSalir.setBackground(new java.awt.Color(255, 204, 204));
        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlFondo.add(btnSalir);
        btnSalir.setBounds(680, 360, 120, 30);

        txaTipoSangre.setColumns(20);
        txaTipoSangre.setRows(5);
        jScrollPane1.setViewportView(txaTipoSangre);

        pnlFondo.add(jScrollPane1);
        jScrollPane1.setBounds(70, 90, 730, 210);

        btnAtrasDatosReceptor.setBackground(new java.awt.Color(204, 204, 255));
        btnAtrasDatosReceptor.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnAtrasDatosReceptor.setText("ATRÁS");
        btnAtrasDatosReceptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasDatosReceptorActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAtrasDatosReceptor);
        btnAtrasDatosReceptor.setBounds(540, 360, 120, 30);

        lblTitulo1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lblTitulo1.setText("TIPO DE SANGRE");
        pnlFondo.add(lblTitulo1);
        lblTitulo1.setBounds(270, 10, 290, 42);

        lblTitulo2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo2.setText("Donador");
        pnlFondo.add(lblTitulo2);
        lblTitulo2.setBounds(690, 50, 110, 40);

        lblTitulo3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo3.setText("R");
        pnlFondo.add(lblTitulo3);
        lblTitulo3.setBounds(30, 90, 30, 20);

        lblTitulo4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo4.setText("e");
        pnlFondo.add(lblTitulo4);
        lblTitulo4.setBounds(30, 100, 30, 40);

        lblTitulo5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo5.setText("r");
        pnlFondo.add(lblTitulo5);
        lblTitulo5.setBounds(30, 240, 20, 20);

        lblTitulo6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo6.setText("e");
        pnlFondo.add(lblTitulo6);
        lblTitulo6.setBounds(30, 150, 30, 20);

        lblTitulo7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo7.setText("p");
        pnlFondo.add(lblTitulo7);
        lblTitulo7.setBounds(30, 170, 20, 30);

        lblTitulo8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo8.setText("t");
        pnlFondo.add(lblTitulo8);
        lblTitulo8.setBounds(30, 200, 20, 20);

        lblTitulo9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblTitulo9.setText("o");
        pnlFondo.add(lblTitulo9);
        lblTitulo9.setBounds(30, 220, 20, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        GUI_Menu menu = new GUI_Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAtrasDatosReceptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasDatosReceptorActionPerformed
        // TODO add your handling code here:
        GUI_DatosReceptor receptor = new GUI_DatosReceptor();
        receptor.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasDatosReceptorActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_TipoSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_TipoSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_TipoSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_TipoSangre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_TipoSangre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasDatosReceptor;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClved;
    private javax.swing.JLabel lblRinon;
    private javax.swing.JLabel lblRinon1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JLabel lblTitulo8;
    private javax.swing.JLabel lblTitulo9;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextArea txaTipoSangre;
    // End of variables declaration//GEN-END:variables
}
