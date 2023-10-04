/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Exon
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabelPrincipal = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jBclientes = new javax.swing.JButton();
        jBmascotas = new javax.swing.JButton();
        jBtratamientos = new javax.swing.JButton();
        jBvisitas = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelPrincipal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelPrincipal.setText("Veterinaria");

        jBsalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBsalir.setText("Salir de la aplicacion");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBclientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBclientes.setText("Clientes");
        jBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclientesActionPerformed(evt);
            }
        });

        jBmascotas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBmascotas.setText("Mascotas");
        jBmascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmascotasActionPerformed(evt);
            }
        });

        jBtratamientos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtratamientos.setText("Tratamientos");
        jBtratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtratamientosActionPerformed(evt);
            }
        });

        jBvisitas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBvisitas.setText("Visitas");
        jBvisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvisitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPrincipal)
                .addGap(316, 316, 316))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jBclientes)
                        .addGap(18, 18, 18)
                        .addComponent(jBmascotas)
                        .addGap(18, 18, 18)
                        .addComponent(jBtratamientos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBvisitas)
                        .addGap(123, 123, 123)
                        .addComponent(jBsalir)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelPrincipal)
                .addGap(18, 18, 18)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBvisitas)
                    .addComponent(jBtratamientos)
                    .addComponent(jBmascotas)
                    .addComponent(jBclientes))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclientesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Clientes cl= new Clientes();
        cl.setVisible(true);
        escritorio.add(cl);
        escritorio.moveToFront(cl);
    }//GEN-LAST:event_jBclientesActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBvisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvisitasActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
        escritorio.repaint();
        Visitas v= new Visitas();
        v.setVisible(true);
        escritorio.add(v);
        escritorio.moveToFront(v);
    }//GEN-LAST:event_jBvisitasActionPerformed

    private void jBmascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmascotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Mascotas m= new Mascotas();
        m.setVisible(true);
        escritorio.add(m);
        escritorio.moveToFront(m);
    }//GEN-LAST:event_jBmascotasActionPerformed

    private void jBtratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtratamientosActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
        escritorio.repaint();
        Tratamientos t= new Tratamientos();
        t.setVisible(true);
        escritorio.add(t);
        escritorio.moveToFront(t);
    }//GEN-LAST:event_jBtratamientosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jBclientes;
    private javax.swing.JButton jBmascotas;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBtratamientos;
    private javax.swing.JButton jBvisitas;
    private javax.swing.JLabel jLabelPrincipal;
    // End of variables declaration//GEN-END:variables
}
