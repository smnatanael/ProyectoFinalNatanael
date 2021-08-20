/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareafinal;

import MSQL.MetodosSql;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Kisuke Urahara
 */
public class EditarProductos extends javax.swing.JInternalFrame {

    
    public EditarProductos() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdP = new javax.swing.JTextField();
        txtCat = new javax.swing.JTextField();
        txtMar = new javax.swing.JTextField();
        txtPre = new javax.swing.JTextField();
        txtCan = new javax.swing.JTextField();
        txtNomP = new javax.swing.JTextField();
        btnGuardarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Editar Productos");

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Categoria:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Cantidad:");

        btnGuardarP.setText("Guardar");
        btnGuardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPActionPerformed(evt);
            }
        });

        btnEliminarP.setText("Eliminar");
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCan, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarP)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnEliminarP)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCan, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarP))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPActionPerformed
            FrmProductos vistaP = new FrmProductos();
            
        
            ActualizarP();
            limpiarTablaP();
            listarP(vistaP.tablaProductos);
            this.dispose();
        
    }//GEN-LAST:event_btnGuardarPActionPerformed

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
       FrmProductos vistaP = new FrmProductos();
       MetodosSql metodos = new MetodosSql();
        

        int id = Integer.parseInt(txtIdP.getText());
        metodos.deleteP(id);
        JOptionPane.showMessageDialog(vistaP, "Producto Eliminado");
        limpiarTablaP();
        listarP(vistaP.tablaProductos);
        this.dispose();
        
    }//GEN-LAST:event_btnEliminarPActionPerformed
    public void limpiarTablaP() {
        FrmProductos vistaP = new FrmProductos();
        DefaultTableModel modelo = new DefaultTableModel();
        
        for(int i = 0; i < vistaP.tablaProductos.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
        }
        
        
    }
    public void ActualizarP (){
        Productos q = new Productos();
        MetodosSql metodos = new MetodosSql();
        
        int id=Integer.parseInt(txtIdP.getText());
        String nom=txtNomP.getText();
        String mar=txtMar.getText();
        String cat=txtCat.getText();
        String pre=txtPre.getText();
        int can=Integer.parseInt(txtCan.getText());
        
        q.setId(id);
        q.setNombre(nom);
        q.setMarca(mar);
        q.setCategoria(cat);
        q.setPrecio(pre);
        q.setCantidad(can);
        
        int r = metodos.ActualizarP(q);
       
        
        
        if(r==1){
            JOptionPane.showMessageDialog(this, "Producto actualizado");
        }else{
           JOptionPane.showMessageDialog(this, "Error el Producto"); 
        }


    }
    public void listarP(JTable tablaProductos){
        FrmProductos vistaP = new FrmProductos();
        MetodosSql metodos = new MetodosSql();
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo = (DefaultTableModel)vistaP.tablaProductos.getModel();
        List<Productos>lista=metodos.listarP();  
        Object[]object = new Object[6];
        
        for(int i = 0; i< lista.size(); i++){
            
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getMarca();
            object[3] = lista.get(i).getCategoria();
            object[4] = lista.get(i).getPrecio();
            object[5] = lista.get(i).getCantidad();
            modelo.addRow(object);
        }
        tablaProductos.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEliminarP;
    public javax.swing.JButton btnGuardarP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField txtCan;
    public javax.swing.JTextField txtCat;
    public javax.swing.JTextField txtIdP;
    public javax.swing.JTextField txtMar;
    public javax.swing.JTextField txtNomP;
    public javax.swing.JTextField txtPre;
    // End of variables declaration//GEN-END:variables
}
