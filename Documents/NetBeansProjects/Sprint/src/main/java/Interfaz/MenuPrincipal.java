/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import Interfaz.RegistroEstudiantes;
import Interfaz.MostrarEstudiantes;
/**
 *
 * @author Usuario
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rEst = new javax.swing.JButton();
        rDoc = new javax.swing.JButton();
        rMat = new javax.swing.JButton();
        mEst = new javax.swing.JButton();
        mDoc = new javax.swing.JButton();
        mMat = new javax.swing.JButton();
        ext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rEst.setBackground(new java.awt.Color(0, 102, 102));
        rEst.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        rEst.setForeground(new java.awt.Color(255, 255, 255));
        rEst.setText("Registrar Estudiante");
        rEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEstActionPerformed(evt);
            }
        });
        getContentPane().add(rEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, -1));

        rDoc.setBackground(new java.awt.Color(0, 102, 102));
        rDoc.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        rDoc.setForeground(new java.awt.Color(255, 255, 255));
        rDoc.setText("Registrar Docente");
        rDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDocActionPerformed(evt);
            }
        });
        getContentPane().add(rDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, -1));

        rMat.setBackground(new java.awt.Color(0, 102, 102));
        rMat.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        rMat.setForeground(new java.awt.Color(255, 255, 255));
        rMat.setText("Registrar Materia");
        getContentPane().add(rMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 170, -1));

        mEst.setBackground(new java.awt.Color(0, 102, 102));
        mEst.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        mEst.setForeground(new java.awt.Color(255, 255, 255));
        mEst.setText("Mostrar Estudiantes");
        mEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEstActionPerformed(evt);
            }
        });
        getContentPane().add(mEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 170, -1));

        mDoc.setBackground(new java.awt.Color(0, 102, 102));
        mDoc.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        mDoc.setForeground(new java.awt.Color(255, 255, 255));
        mDoc.setText("Mostrar Docentes");
        mDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDocActionPerformed(evt);
            }
        });
        getContentPane().add(mDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 170, -1));

        mMat.setBackground(new java.awt.Color(0, 102, 102));
        mMat.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        mMat.setForeground(new java.awt.Color(255, 255, 255));
        mMat.setText("Mostrar Materias");
        getContentPane().add(mMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 170, -1));

        ext.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        ext.setText("Salir");
        ext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extActionPerformed(evt);
            }
        });
        getContentPane().add(ext, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEstActionPerformed
        RegistroEstudiantes r1 = new RegistroEstudiantes(this);
        r1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rEstActionPerformed

    private void extActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extActionPerformed
        System.exit(0);
    }//GEN-LAST:event_extActionPerformed

    private void mEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEstActionPerformed
        MostrarEstudiantes r12 = new MostrarEstudiantes(this);
        r12.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mEstActionPerformed

    private void rDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDocActionPerformed
        RegistroDocentes r2 = new RegistroDocentes(this);
        r2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rDocActionPerformed

    private void mDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDocActionPerformed
        MostrarDocentes r22 = new MostrarDocentes(this);
        r22.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mDocActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mDoc;
    private javax.swing.JButton mEst;
    private javax.swing.JButton mMat;
    private javax.swing.JButton rDoc;
    private javax.swing.JButton rEst;
    private javax.swing.JButton rMat;
    // End of variables declaration//GEN-END:variables
}
