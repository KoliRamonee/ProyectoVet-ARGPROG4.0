/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vet.Acceso.ClienteData;
import vet.Acceso.MascotaData;
import vet.Entidades.Clientes;
import vet.Entidades.Mascotas;

/**
 *
 * @author Exon
 */
public class VMascotas extends javax.swing.JInternalFrame {

    private ArrayList<Clientes> cl =new ArrayList<>();
    private MascotaData md=new MascotaData();
    private ClienteData cld=new ClienteData();
    
    
    
    public VMascotas() {
        
        initComponents();
        cl=(ArrayList) cld.listarClientes();
        
        
        
        cargarCombo(cl);
    }

    
     private void cargarCombo(ArrayList<Clientes> b){
   
    
    for(Clientes cl:b){
    jComboCliente.addItem(cl);
    
    }
        jComboTipo.setSelectedIndex(-1);
        jComboSexo.setSelectedIndex(-1);
         jComboCliente.setSelectedIndex(-1);
    
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
        jLabel2 = new javax.swing.JLabel();
        jTextAlias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextRaza = new javax.swing.JTextField();
        jBguardar = new javax.swing.JButton();
        jBmod = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboCliente = new javax.swing.JComboBox<>();
        jBnewMascota = new javax.swing.JButton();
        jLabelNumero = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextPelo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Mascotas");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Alias:");

        jTextAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAliasActionPerformed(evt);
            }
        });
        jTextAlias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAliasKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Tipo De Mascota:");

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato", "Loro", "Hamster" }));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Sexo:");

        jComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hembra", "Macho" }));
        jComboSexo.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Raza:");

        jTextRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextRazaKeyTyped(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBmod.setText("Modificar");
        jBmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("ID Cliente:");

        jComboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboClienteActionPerformed(evt);
            }
        });

        jBnewMascota.setText("Nueva Mascota");
        jBnewMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnewMascotaActionPerformed(evt);
            }
        });

        jLabelNumero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNumero.setText("0");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Pelaje:");

        jTextPelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPeloKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Fecha de Nacimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBnewMascota)
                                .addGap(18, 18, 18)
                                .addComponent(jBguardar)
                                .addGap(18, 18, 18)
                                .addComponent(jBmod)
                                .addGap(18, 18, 18)
                                .addComponent(jBeliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBsalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextPelo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscar)))
                        .addGap(0, 313, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jLabel8)
                    .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextPelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBsalir)
                            .addComponent(jBguardar)
                            .addComponent(jBmod)
                            .addComponent(jBeliminar)
                            .addComponent(jBnewMascota))))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jTextAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAliasActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
        
             try{
       
       String alias=jTextAlias.getText();
       String raza=jTextRaza.getText();
       String tipo=String.valueOf(jComboTipo.getSelectedItem());
       String sexo=String.valueOf(jComboSexo.getSelectedItem());
       String pelo=jTextPelo.getText();
       LocalDate fecha=jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
   
              
       Clientes cl= new Clientes();
       MascotaData md=new MascotaData();
       cl=(Clientes)jComboCliente.getSelectedItem();
       Mascotas m=new Mascotas(alias, sexo,tipo, raza, fecha, pelo, cl.getIdCliente(), true);
       md.guardarMascota(m);
       
       
       m=md.buscarMascota(cl.getIdCliente(), alias);
       
       jLabelNumero.setText(String.valueOf(m.getIdMascota()));
       
       
       
       
       }catch(NullPointerException d){
       JOptionPane.showMessageDialog(null, "Faltan completar campos");
       }catch(NumberFormatException f){
       JOptionPane.showMessageDialog(null, "Verifique que cada campo este correcto");
    }                                  
        
        
        
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTextAliasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAliasKeyTyped
        // TODO add your handling code here:
         if(!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar()==KeyEvent.VK_SPACE)){
        evt.consume();
        
    }//GEN-LAST:event_jTextAliasKeyTyped
    }
    private void jTextRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRazaKeyTyped
        // TODO add your handling code here:
         if(!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar()==KeyEvent.VK_SPACE)){
        evt.consume();
    }//GEN-LAST:event_jTextRazaKeyTyped
    }
    private void jComboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboClienteActionPerformed

    private void jBnewMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnewMascotaActionPerformed
        
        jComboTipo.setSelectedIndex(-1);
        jComboSexo.setSelectedIndex(-1);
         jComboCliente.setSelectedIndex(-1);
        jTextAlias.setText("");
        
        jTextRaza.setText("");
       
        jTextPelo.setText("");
        
        jLabelNumero.setText("");
        jDate.setDate(null);
        
    }//GEN-LAST:event_jBnewMascotaActionPerformed

    private void jTextPeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPeloKeyTyped
        // TODO add your handling code here:
         if(!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar()==KeyEvent.VK_SPACE)){
        evt.consume();
    }//GEN-LAST:event_jTextPeloKeyTyped
    }
    private void jBmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodActionPerformed
        // TODO add your handling code here:
        
               try{
       
       String alias=jTextAlias.getText();
       String raza=jTextRaza.getText();
       String tipo=String.valueOf(jComboTipo.getSelectedItem());
       String sexo=String.valueOf(jComboSexo.getSelectedItem());
       String pelo=jTextPelo.getText();
       LocalDate fecha=jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       int id=Integer.parseInt(jLabelNumero.getText());
              
       Clientes cl= new Clientes();
       MascotaData md=new MascotaData();
       cl=(Clientes)jComboCliente.getSelectedItem();
       Mascotas m=new Mascotas(id,alias, sexo,tipo, raza, fecha, pelo, cl.getIdCliente(), true);
       md.modificarMascota(m);
       
       
       
       
       
       }catch(NullPointerException d){
       JOptionPane.showMessageDialog(null, "Faltan completar campos");
       }catch(NumberFormatException f){
       JOptionPane.showMessageDialog(null, "Verifique que cada campo este correcto");
    }                                  
        
        
        
        
        
        
    }//GEN-LAST:event_jBmodActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
       try{
          String alias=jTextAlias.getText();
       Clientes cl= new Clientes();
       MascotaData md=new MascotaData();
       cl=(Clientes)jComboCliente.getSelectedItem();
       Mascotas m=new Mascotas();
       m.setAlias(alias);
       m.setIdCliente(cl.getIdCliente());
       
      
      m= md.buscarMascota(m.getIdCliente(), m.getAlias());
       String tipo=m.getEspecie();
       String sex=m.getSexo();
       String pelo=m.getPelaje();
       String raza=m.getRaza();
      
       
       
       
       switch(sex){
           case "Hembra": jComboSexo.setSelectedIndex(0);
           break;
           case "Macho": jComboSexo.setSelectedIndex(1);
           break;
           default: jComboSexo.setSelectedIndex(-1);
           break;
       
       }
      
       switch(tipo){
        case "Perro":  jComboTipo.setSelectedIndex(0);
           break;
           case "Gato": jComboTipo.setSelectedIndex(1);
           break;
           case "Loro": jComboTipo.setSelectedIndex(2);
           break;
           case "Hamster": jComboTipo.setSelectedIndex(3);break;
           default:jComboTipo.setSelectedIndex(-1);
           break;
       }
             
        
        jTextRaza.setText(raza);
        jTextPelo.setText(pelo);
        jDate.setDate(Date.valueOf(m.getFechaNac()));
        jLabelNumero.setText(String.valueOf(m.getIdMascota()));
     
       }catch(NullPointerException a){
           if(jTextAlias.getText().equalsIgnoreCase("") || jComboCliente.getSelectedIndex()==-1){
       JOptionPane.showMessageDialog(this, "faltan completar los campos");}
       }
        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        
            int respuesta = JOptionPane.showOptionDialog(null, "¿Quieres eliminar a la mascota y todos sus tratamientos?", "ADVERTENCIA", 
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "No");
        
        if (respuesta == JOptionPane.YES_OPTION) {
            
             int id=Integer.parseInt(jLabelNumero.getText());
              
      
       MascotaData md=new MascotaData();
             
       md.eliminarMascota(id);
            
        } else if (respuesta == JOptionPane.NO_OPTION) {
            
        }
    

       
      
       
       
       
       
               
        
        
        
    }//GEN-LAST:event_jBeliminarActionPerformed

    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmod;
    private javax.swing.JButton jBnewMascota;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Clientes> jComboCliente;
    private javax.swing.JComboBox<String> jComboSexo;
    private javax.swing.JComboBox<String> jComboTipo;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JTextField jTextAlias;
    private javax.swing.JTextField jTextPelo;
    private javax.swing.JTextField jTextRaza;
    // End of variables declaration//GEN-END:variables
}
