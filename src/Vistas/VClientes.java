/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JOptionPane;
import vet.Acceso.*;
import vet.Entidades.*;

/**
 *
 * @author Exon
 */
public class VClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Clientes
     */
    public VClientes() {
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

        jBsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonMod = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTdireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTtelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTnombrealt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTtelalt = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jTbusqueda = new javax.swing.JTextField();
        jIDnum = new javax.swing.JLabel();
        jidNum = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jestado = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        jBsalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Clientes");

        jButtonNuevo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonNuevo.setText("Nuevo Cliente");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonMod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonMod.setText("Modificar");
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Dirección");

        jLabel6.setText("Telefono");

        jLabel7.setText("Contacto Alternativo");

        jLabel8.setText("Telefono Alt.");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabelID.setText("ID:");

        jLabel9.setText("Busqueda por DNI:");

        jestado.setText(" Activo");
        jestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jestadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTtelalt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTnombrealt, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTdni, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(jTnombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTtelefono)
                                    .addComponent(jTapellido)
                                    .addComponent(jTdireccion))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jidNum, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jestado))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jIDnum, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID)
                    .addComponent(jidNum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscar)
                            .addComponent(jTbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jestado)
                            .addComponent(jLabel10))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTnombrealt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTtelalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBsalir)
                            .addComponent(jButtonNuevo)
                            .addComponent(jButtonGuardar)
                            .addComponent(jButtonMod))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jIDnum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        int dni = Integer.parseInt( jTbusqueda.getText());
        ClienteData cd = new ClienteData();
        
        Clientes cl= new Clientes();
        cl=cd.buscarClientePorDni(dni);
        jTdni.setText(Integer.toString(cl.getDni()));
        jTapellido.setText(cl.getApellido());
        jTnombre.setText(cl.getNombre());
        jTnombrealt.setText(cl.getNombreAlt());
         jTdireccion.setText(cl.getDire());
         jTtelefono.setText(Integer.toString(cl.getTel()));
         jTtelalt.setText(Integer.toString(cl.getTelAlt()));
        jidNum.setText(Integer.toString(cl.getIdCliente()));
        jestado.setSelected(cl.isEstado());
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        jTdni.setText("");
        jTapellido.setText("");
        jTnombre.setText("");
        jTnombrealt.setText("");
         jTdireccion.setText("");
         jTtelefono.setText("");
         jTtelalt.setText("");
        jidNum.setText("");
        jTbusqueda.setText("");
         jestado.setSelected(false);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

           try{
       int dni=Integer.parseInt(jTdni.getText());
       String apellido=jTapellido.getText();
       String nombre=jTnombre.getText();
       String nombreAlt=jTnombrealt.getText();
       String dire=jTdireccion.getText();
       int tel=Integer.parseInt(jTtelefono.getText());
       int telAlt=Integer.parseInt(jTtelalt.getText());
       boolean estado=jestado.isSelected();
       
       Clientes cl= new Clientes(dni,apellido,nombre,nombreAlt,dire,tel,telAlt,estado);
       ClienteData cd= new ClienteData();
       
       cd.guardarCliente(cl);
       }catch(NullPointerException d){
       JOptionPane.showMessageDialog(null, "Faltan completar campos");
       }catch(NumberFormatException f){
       JOptionPane.showMessageDialog(null, "Verifique que cada campo este correcto");
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    }       
    
    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
       ClienteData cd= new ClienteData();

       int dni=Integer.parseInt(jTdni.getText());
       String apellido=jTapellido.getText();
       String nombre=jTnombre.getText();
       String nombreAlt=jTnombrealt.getText();
       String dire=jTdireccion.getText();
       int tel=Integer.parseInt(jTtelefono.getText());
       int telAlt=Integer.parseInt(jTtelalt.getText());
       boolean estado=jestado.isSelected(); 
       int id=Integer.parseInt(jidNum.getText());
       Clientes cl=new Clientes(id,dni,apellido,nombre,nombreAlt,dire,tel,telAlt,estado);
              
       cd.modificarCliente(cl);
    }//GEN-LAST:event_jButtonModActionPerformed

    private void jestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jestadoActionPerformed
        
    }//GEN-LAST:event_jestadoActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMod;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jIDnum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTbusqueda;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTnombrealt;
    private javax.swing.JTextField jTtelalt;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JRadioButton jestado;
    private javax.swing.JLabel jidNum;
    // End of variables declaration//GEN-END:variables
}
