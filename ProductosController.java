package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DTO.DynamicCombobox;
import static controllers.LoginController.rol_user;
import DTO.ProductosDto;
import modelos.ProductoModelo;
import modelos.ProductoBuilder;
import views.SystemView;

public class ProductosController implements ActionListener, MouseListener, KeyListener {
    
    private SystemView views;
    private ProductoModelo modelo;
    String rol = rol_user;
    DefaultTableModel model = new DefaultTableModel();
    
    public ProductosController( SystemView views, ProductoModelo modelo ) {
        
        this.views = views;
        this.modelo = modelo;
        
        //Setting de botones
        this.views.btn_registrar_producto.addActionListener(this);
        this.views.btn_modificar_producto.addActionListener(this);
        this.views.btn_eliminar_producto.addActionListener(this);
        this.views.btn_cancelar_producto.addActionListener(this);
        this.views.productos_tabla.addMouseListener(this);
        this.views.txt_search_producto.addKeyListener(this);
        this.views.jLabelProductos.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_registrar_producto) {
            if (     views.txt_producto_name.getText().equals("")
                    || views.txt_producto_modelo.getText().equals("")
                    || views.txt_producto_precio.getText().equals("")
                    || views.txt_producto_color.getText().equals("")
                    || views.txt_producto_stock.getText().equals("")
                    || views.txt_producto_marca.getText().equals("") ) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                
                String nombre               = views.txt_producto_name.getText().trim();
                double precio               = Double.parseDouble(views.txt_producto_precio.getText().trim());
                String color                = views.txt_producto_color.getText().trim();
                String marca                = views.txt_producto_marca.getText().trim();
                String modelo1               = views.txt_producto_modelo.getText().trim();
                int stock                   = Integer.parseInt(views.txt_producto_stock.getText());
                
                ProductoBuilder builder = new ProductoBuilder( nombre, precio, marca, modelo1, stock, color );
                
//                int id                      = Integer.parseInt(views.txt_producto_id.getText());
//                String pais                 = views.txt_producto_pais.getText().trim();
//                String dimension            = views.txt_producto_dimensiones.getText().trim();
//                float peso                  = Float.parseFloat(views.txt_producto_peso.getText().trim());
//                int meses_garantia          = Integer.parseInt(views.txt_producto_meses_garantia.getText().trim());
//                String description          = views.txt_producto_description.getText().trim();
                
                if ( ! views.txt_producto_id.getText().equals("") ) builder.conId( Integer.parseInt(views.txt_producto_id.getText()) );
                if ( ! views.txt_producto_pais.getText().equals("") ) builder.conPais(views.txt_producto_pais.getText().trim());
                if ( ! views.txt_producto_dimensiones.getText().equals("") ) builder.conDimension( views.txt_producto_dimensiones.getText().trim() );
                if ( ! views.txt_producto_peso.getText().equals("") ) builder.conPeso( Float.parseFloat(views.txt_producto_peso.getText().trim()) );
                if ( ! views.txt_producto_meses_garantia.getText().equals("") ) builder.conMesesGarantia( Integer.parseInt(views.txt_producto_meses_garantia.getText().trim()) );
                if ( ! views.txt_producto_description.getText().equals("") ) builder.conDescripcion( views.txt_producto_description.getText().trim() );
       
                
                if (modelo.registrarProducto( builder.build())) {
                    cleanTable();
                    cleanFields();
                    listAllProductos();
                    JOptionPane.showMessageDialog(null, "Producto registrado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al producto");
                }

            }
        } else if (e.getSource() == views.btn_modificar_producto) {
            if (     views.txt_producto_name.getText().equals("")
                    || views.txt_producto_modelo.getText().equals("")
                    || views.txt_producto_precio.getText().equals("")
                    || views.txt_producto_color.getText().equals("")
                    || views.txt_producto_stock.getText().equals("")
                    || views.txt_producto_marca.getText().equals("") ) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                
                String nombre               = views.txt_producto_name.getText().trim();
                double precio               = Double.parseDouble(views.txt_producto_precio.getText().trim());
                String color                = views.txt_producto_color.getText().trim();
                String marca                = views.txt_producto_marca.getText().trim();
                String modelo1               = views.txt_producto_modelo.getText().trim();
                int stock                   = Integer.parseInt(views.txt_producto_stock.getText());
                
                ProductoBuilder builderUpdater = new ProductoBuilder( nombre, precio, marca, modelo1, stock, color );
                
                if ( ! views.txt_producto_id.getText().equals("") ) builderUpdater.conId( Integer.parseInt(views.txt_producto_id.getText()) );
                if ( ! views.txt_producto_pais.getText().equals("") ) builderUpdater.conPais(views.txt_producto_pais.getText().trim());
                if ( ! views.txt_producto_dimensiones.getText().equals("") ) builderUpdater.conDimension( views.txt_producto_dimensiones.getText().trim() );
                if ( ! views.txt_producto_peso.getText().equals("") ) builderUpdater.conPeso( Float.parseFloat(views.txt_producto_peso.getText().trim()) );
                if ( ! views.txt_producto_meses_garantia.getText().equals("") ) builderUpdater.conMesesGarantia( Integer.parseInt(views.txt_producto_meses_garantia.getText().trim()) );
                if ( ! views.txt_producto_description.getText().equals("") ) builderUpdater.conDescripcion( views.txt_producto_description.getText().trim() );
       
                
                
                if( modelo.actualizarProducto( builderUpdater.build() )){
                    cleanTable(); 
                    cleanFields(); 
                    listAllProductos(); 
                    JOptionPane.showMessageDialog(null, "Datos del producto modificados con éxito");
                }else{
                    JOptionPane.showMessageDialog(null, "ha ocurrido un error al modificar los datos del producto");
                }
            }
        }else if(e.getSource() == views.btn_eliminar_producto){
            int row = views.productos_tabla.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un producto para eliminar");
            } else {
                int id = Integer.parseInt(views.productos_tabla.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar a este producto?");

                if (question == 0 && modelo.borrarProducto(id) != false) {
                    cleanTable();
                    cleanFields();
                    views.btn_registrar_producto.setEnabled(true);
                    listAllProductos();
                    JOptionPane.showMessageDialog(null, "Producto eliminado con éxito");
                }
            }
        }else if(e.getSource() == views.btn_cancelar_producto){
            cleanFields(); 
            views.btn_registrar_producto.setEnabled(true);
        }
    }
    //Listar productos
    public void listAllProductos() {
        if (rol.equals("Administrativo") || rol.equals("Salon") || rol.equals("Caja") || rol.equals("Despacho")) {
            List<ProductosDto> list = modelo.listarProductos(views.txt_search_producto.getText());
            model = (DefaultTableModel) views.productos_tabla.getModel();
            Object[] row = new Object[12];
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getNombre();
                row[2] = list.get(i).getPrecio();
                row[3] = list.get(i).getStock();
                row[4] = list.get(i).getModelo();
                row[5] = list.get(i).getMarca();
                row[6] = list.get(i).getColor();
                row[7] = list.get(i).getPais();
                row[8] = list.get(i).getDimension();
                row[9] = list.get(i).getPeso();
                row[10] = list.get(i).getMeses_garantia();
                row[11] = list.get(i).getDescription();
                model.addRow(row);
            }
            views.productos_tabla.setModel(model);

            if (rol.equals("Salon") || rol.equals("Caja") || rol.equals("Despacho")) {
                views.btn_registrar_producto.setEnabled(false);
                views.btn_modificar_producto.setEnabled(false);
                views.btn_eliminar_producto.setEnabled(false);
                views.btn_cancelar_producto.setEnabled(false);
                views.txt_producto_description.setEnabled(false);
                views.txt_producto_id.setEditable(false);
                views.txt_producto_name.setEditable(false);
                views.txt_producto_precio.setEditable(false);
                
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.productos_tabla) {
            int row = views.productos_tabla.rowAtPoint(e.getPoint()); //metodo para obtener las coordenadas de la fila donde la persona dio click
//            views.txt_producto_id.setText(views.productos_tabla.getValueAt(row, 0).toString());
//            ProductosDto busquedaDto = modelo.buscarProducto(Integer.parseInt(views.txt_producto_id.getText()));
//            views.txt_producto_description.setText(busquedaDto.getDescription());
            views.txt_producto_id.setText(views.productos_tabla.getValueAt(row, 0).toString());
            views.txt_producto_name.setText(views.productos_tabla.getValueAt(row, 1).toString());
            views.txt_producto_precio.setText(views.productos_tabla.getValueAt(row, 2).toString());
            views.txt_producto_stock.setText(views.productos_tabla.getValueAt(row, 3).toString());
            views.txt_producto_modelo.setText(views.productos_tabla.getValueAt(row, 4).toString());
            views.txt_producto_marca.setText(views.productos_tabla.getValueAt(row, 5).toString());
            views.txt_producto_color.setText(views.productos_tabla.getValueAt(row, 6).toString());
            views.txt_producto_pais.setText(views.productos_tabla.getValueAt(row, 7).toString());
            views.txt_producto_dimensiones.setText(views.productos_tabla.getValueAt(row, 8).toString());
            views.txt_producto_peso.setText(views.productos_tabla.getValueAt(row, 9).toString());
            views.txt_producto_meses_garantia.setText(views.productos_tabla.getValueAt(row, 10).toString());
            views.txt_producto_description.setText(views.productos_tabla.getValueAt(row, 11).toString());
            
            //Deshabilitar
            views.btn_registrar_producto.setEnabled(false);
            views.txt_producto_id.setEditable(false);

        }else if(e.getSource() == views.jLabelProductos){
            views.jTabbedPane1.setSelectedIndex(1);
            //Limpiar tabla
            cleanTable();
            //Limpiar campos
            cleanFields();
            //Listar productos
            listAllProductos();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txt_search_producto) {
            cleanTable();
            listAllProductos();
        }
    }

    //Metodo para limpiar la tabla
    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
    
    //Metodo de limpiar campos
    public void cleanFields(){
        views.txt_producto_id.setText("");
        views.txt_producto_name.setText("");
        views.txt_producto_precio.setText("");
        views.txt_producto_stock.setText("");
        views.txt_producto_modelo.setText("");
        views.txt_producto_marca.setText("");
        views.txt_producto_color.setText("");
        views.txt_producto_pais.setText("");
        views.txt_producto_dimensiones.setText("");
        views.txt_producto_peso.setText("");
        views.txt_producto_meses_garantia.setText("");
        views.txt_producto_description.setText("");
    }
    
}
