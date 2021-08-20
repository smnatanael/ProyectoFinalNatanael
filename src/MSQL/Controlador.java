

//Herencia 

package MSQL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import tareafinal.EditarProductos;
import tareafinal.FrmProductos;
import tareafinal.Home;
import tareafinal.Productos;
import tareafinal.Usuarios;

/**
 *
 * @author Kisuke Urahara
 */
public class Controlador implements ActionListener {
    EditarProductos vistaE = new EditarProductos();
    FrmProductos vistaP = new FrmProductos();
    Productos q = new Productos();
    Usuarios p = new Usuarios();
    MetodosSql metodos = new MetodosSql();
    Home vista = new Home();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public Controlador(FrmProductos w){
        
        this.vistaP = w;
        this.vistaP.btnListarP.addActionListener(this);
        listarP(vistaP.tablaProductos);
       
    
    }
    public Controlador(EditarProductos z){
        
        this.vistaE = z;
        this.vistaP.btnListarP.addActionListener(this);
        listarP(vistaP.tablaProductos);
       
    
    }
    
    public Controlador(Home v){
        
        this.vista = v;
        this.vista.btnListar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnEditar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        listar(vista.tablaUsuarios);
        
       
    
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==vistaP.btnListarP){
            limpiarTablaP();
            listarP(vistaP.tablaProductos);
        }
        if(e.getSource()==vista.btnListar){
            limpiarTabla();
            listar(vista.tablaUsuarios);
        }
        
        if(e.getSource()==vista.btnEditar){
            
            int fila = vista.tablaUsuarios.getSelectedRow();
            if (fila == -1){
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una Fila");
            
            
            }else{
               int id = Integer.parseInt((String)vista.tablaUsuarios.getValueAt(fila, 0).toString());
               String nom = (String)vista.tablaUsuarios.getValueAt(fila, 1);
               String ape = (String)vista.tablaUsuarios.getValueAt(fila, 2);
               String tel = (String)vista.tablaUsuarios.getValueAt(fila, 3);
               String ema = (String)vista.tablaUsuarios.getValueAt(fila, 4);
               vista.txtId.setText(""+id);
               vista.txtNom.setText(nom);
               vista.txtApe.setText(ape);
               vista.txtTel.setText(tel);
               vista.txtEma.setText(ema);
            }
        
        }
        if(e.getSource()==vista.btnActualizar){
            Actualizar();
            limpiarTabla();
            listar(vista.tablaUsuarios);
        
        }
        
        if(e.getSource()==vista.btnEliminar){
            
            int fila = vista.tablaUsuarios.getSelectedRow();
            
            if (fila == -1){
            JOptionPane.showMessageDialog(vista, "Debe seleccionar un Usuario");
            
            
            }else{
                int id = Integer.parseInt((String)vista.tablaUsuarios.getValueAt(fila, 0).toString());
                metodos.delete(id);
                JOptionPane.showMessageDialog(vista, "Usuario Eliminado");
                limpiarTabla();
                listar(vista.tablaUsuarios);
            }
            
        }
    
    }
    public void Actualizar (){
        int id=Integer.parseInt(vista.txtId.getText());
        String nom=vista.txtNom.getText();
        String ape=vista.txtApe.getText();
        String tel=vista.txtTel.getText();
        String ema=vista.txtEma.getText();
        p.setId(id);
        p.setNombres(nom);
        p.setApellidos(ape);
        p.setTelefono(tel);
        p.setEmail(ema);
        int r = metodos.Actualizar(p);
       
        
        
        if(r==1){
            JOptionPane.showMessageDialog(vista, "Usuario actualizado");
        }else{
           JOptionPane.showMessageDialog(vista, "Error al actualizar"); 
        }


    }
    public void ActualizarP (){
        int id=Integer.parseInt(vistaE.txtIdP.getText());
        String nom=vistaE.txtNomP.getText();
        String mar=vistaE.txtMar.getText();
        String cat=vistaE.txtCat.getText();
        String pre=vistaE.txtPre.getText();
        int can=Integer.parseInt(vistaE.txtCan.getText());
        
        q.setId(id);
        q.setNombre(nom);
        q.setMarca(mar);
        q.setCategoria(cat);
        q.setPrecio(pre);
        q.setCantidad(can);
        
        int r = metodos.ActualizarP(q);
       
        
        
        if(r==1){
            JOptionPane.showMessageDialog(vistaE, "Producto actualizado");
        }else{
           JOptionPane.showMessageDialog(vistaE, "Error el Producto"); 
        }


    }
    public void listar(JTable tablaUsuarios){
        modelo = (DefaultTableModel)tablaUsuarios.getModel();
        List<Usuarios>lista=metodos.listar();  
        Object[]object = new Object[5];
        
        for(int i = 0; i< lista.size(); i++){
            
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombres();
            object[2] = lista.get(i).getApellidos();
            object[3] = lista.get(i).getTelefono();
            object[4] = lista.get(i).getEmail();
            modelo.addRow(object);
        }
        vista.tablaUsuarios.setModel(modelo);
    }
    public void listarP(JTable tablaProductos){
        modelo = (DefaultTableModel)tablaProductos.getModel();
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
        vistaP.tablaProductos.setModel(modelo);
    }
    
    public void limpiarTabla() {
     
        for(int i = 0; i < vista.tablaUsuarios.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
        }
        
        
    }
    public void limpiarTablaP() {
     
        for(int i = 0; i < vistaP.tablaProductos.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
        }
        
        
    }
}
