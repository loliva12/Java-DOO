package views;


public class SystemView extends javax.swing.JFrame { 

   
    public SystemView() {
        initComponents();
        setSize(1208, 680); 
        setResizable(false);
        setTitle("Panel de administración");
        setLocationRelativeTo(null);
        
        this.repaint();

    }
    
    public void titleInterface( String nombre, String apellido, String rol ){
        setTitle("Panel - " + rol);
        label_name_empleado.setText(nombre + apellido );
        label_name_rol.setText(rol);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btn_photo = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        label_name_empleado = new javax.swing.JLabel();
        label_name_rol = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Empleados = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txt_empleado_id = new javax.swing.JTextField();
        txt_empleado_apellido = new javax.swing.JTextField();
        txt_empleado_username = new javax.swing.JTextField();
        cmb_rol = new javax.swing.JComboBox<>();
        txt_empleado_address = new javax.swing.JTextField();
        txt_empleado_telephone = new javax.swing.JTextField();
        txt_empleado_email = new javax.swing.JTextField();
        btn_registrar_empleado = new javax.swing.JButton();
        btn_modificar_empleado = new javax.swing.JButton();
        btn_eliminar_empleado = new javax.swing.JButton();
        btn_cancelar_empleado = new javax.swing.JButton();
        txt_empleado_password = new javax.swing.JPasswordField();
        txt_empleado_nombre = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txt_search_empleado = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        empleado_table = new javax.swing.JTable();
        jLabelReporte1 = new javax.swing.JLabel();
        name1 = new javax.swing.JPanel();
        txt_search_producto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jp_productos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_producto_name = new javax.swing.JTextField();
        txt_producto_precio = new javax.swing.JTextField();
        txt_producto_description = new javax.swing.JTextField();
        txt_producto_id = new javax.swing.JTextField();
        btn_registrar_producto = new javax.swing.JButton();
        btn_modificar_producto = new javax.swing.JButton();
        btn_eliminar_producto = new javax.swing.JButton();
        btn_cancelar_producto = new javax.swing.JButton();
        txt_producto_color = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_producto_stock = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_producto_peso = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_producto_dimensiones = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_producto_pais = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_producto_meses_garantia = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_producto_modelo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_producto_marca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        productos_tabla = new javax.swing.JTable();
        name3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_cliente_id = new javax.swing.JTextField();
        txt_cliente_nombre = new javax.swing.JTextField();
        txt_cliente_apellido = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_cliente_email = new javax.swing.JTextField();
        txt_cliente_dni = new javax.swing.JTextField();
        btn_registrar_cliente = new javax.swing.JButton();
        btn_modificar_cliente = new javax.swing.JButton();
        btn_eliminar_cliente = new javax.swing.JButton();
        btn_cancelar_cliente = new javax.swing.JButton();
        txt_cliente_direccion = new javax.swing.JTextField();
        txt_cliente_celular = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_search_cliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientes_tabla = new javax.swing.JTable();
        name4 = new javax.swing.JPanel();
        jp_nueva_compra = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_pedido_producto_id = new javax.swing.JTextField();
        txt_pedido_producto_nombre = new javax.swing.JTextField();
        txt_pedido_cantidad = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_pedido_precio = new javax.swing.JTextField();
        txt_pedido_subtotal = new javax.swing.JTextField();
        txt_pedido_id = new javax.swing.JTextField();
        txt_pedido_total_a_pagar = new javax.swing.JTextField();
        btn_confirmar_pedido = new javax.swing.JButton();
        btn_eliminar_pedido = new javax.swing.JButton();
        btn_nuevo_pedido = new javax.swing.JButton();
        btn_agregar_producto_a_comprar = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txt_pedido_cliente_id = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        pedidos_tabla = new javax.swing.JTable();
        name6 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabla_todos_pedidos = new javax.swing.JTable();
        jButton_pagar = new javax.swing.JButton();
        jButton_despachar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanelEmpleado = new javax.swing.JPanel();
        jLabelEmpleados = new javax.swing.JLabel();
        jPanelPurchases = new javax.swing.JPanel();
        jLabelProductos = new javax.swing.JLabel();
        jPanelEmployees = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        jPanelSuppliers = new javax.swing.JPanel();
        jLabelPedidos = new javax.swing.JLabel();
        jPanelReports = new javax.swing.JPanel();
        jLabelReporte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(133, 214, 240));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario (1).png"))); // NOI18N
        btn_photo.setMaximumSize(new java.awt.Dimension(80, 65));
        btn_photo.setMinimumSize(new java.awt.Dimension(80, 65));
        btn_photo.setPreferredSize(new java.awt.Dimension(80, 65));
        jPanel3.add(btn_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 80, 65));

        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_logout.setText("Salir");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel3.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 35, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DisignElectronic");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 340, 100));

        label_name_empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_name_empleado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(label_name_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 130, 20));

        label_name_rol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_name_rol.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(label_name_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 140, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 100));
        jLabel1.setRequestFocusEnabled(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        Empleados.setBackground(new java.awt.Color(181, 200, 243));
        Empleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Identificación:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setText("Nombre:");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("Nombre de usuario:");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("Rol:");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setText("Dirección:");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setText("Telefono:");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setText("Email:");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setText("Contraseña:");

        txt_empleado_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_empleado_idActionPerformed(evt);
            }
        });

        cmb_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Salon", "Caja", "Despacho", " " }));

        btn_registrar_empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_registrar_empleado.setText("Registrar");

        btn_modificar_empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_modificar_empleado.setText("Modificar");

        btn_eliminar_empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_eliminar_empleado.setText("Eliminar ");

        btn_cancelar_empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancelar_empleado.setText("Cancelar");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setText("Apellido:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(txt_empleado_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(123, 123, 123)
                        .addComponent(cmb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel53)
                            .addComponent(jLabel61))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_empleado_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_empleado_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_empleado_username, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(57, 57, 57)
                        .addComponent(txt_empleado_address, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addGap(84, 84, 84)
                        .addComponent(txt_empleado_email, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(60, 60, 60)
                        .addComponent(txt_empleado_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(39, 39, 39)
                        .addComponent(txt_empleado_password, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_registrar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel56)
                    .addComponent(txt_empleado_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_empleado_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(txt_empleado_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_empleado_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53))))
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empleado_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(txt_empleado_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_empleado_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel59)
                    .addComponent(cmb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_empleado_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Empleados.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 300));
        Empleados.add(txt_search_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 160, 30));

        jLabel60.setBackground(new java.awt.Color(102, 102, 102));
        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setText("Buscar");
        Empleados.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        empleado_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombre", "Nombre usuario", "Dirección", "Telefono", "Email", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(empleado_table);

        Empleados.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 930, 120));

        jLabelReporte1.setBackground(new java.awt.Color(12, 40, 53));
        jLabelReporte1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelReporte1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReporte1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReporte1.setText("Reporte");
        Empleados.add(jLabelReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 200, 35));

        jTabbedPane1.addTab("Empleados", Empleados);

        name1.setBackground(new java.awt.Color(181, 200, 243));
        name1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search_producto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name1.add(txt_search_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 170, 20));

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Buscar:");
        name1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jp_productos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Precio de Venta:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Marca:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Descripción: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID:");

        txt_producto_id.setEditable(false);
        txt_producto_id.setEnabled(false);
        txt_producto_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_producto_idActionPerformed(evt);
            }
        });

        btn_registrar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_registrar_producto.setText("Registrar");
        btn_registrar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_productoActionPerformed(evt);
            }
        });

        btn_modificar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_modificar_producto.setText("Modificar");
        btn_modificar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_productoActionPerformed(evt);
            }
        });

        btn_eliminar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_eliminar_producto.setText("Eliminar");

        btn_cancelar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancelar_producto.setText("Cancelar");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Stock:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Color:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Dimenciones:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Pais:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Peso:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Meses Garantia:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Modelo:");

        javax.swing.GroupLayout jp_productosLayout = new javax.swing.GroupLayout(jp_productos);
        jp_productos.setLayout(jp_productosLayout);
        jp_productosLayout.setHorizontalGroup(
            jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel14)
                        .addComponent(jLabel4)
                        .addComponent(jLabel8)
                        .addComponent(jLabel31))
                    .addGroup(jp_productosLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6)))
                .addGap(33, 33, 33)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_producto_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_producto_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_producto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_producto_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_producto_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_producto_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel26))
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_producto_color, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_producto_description, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_producto_meses_garantia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_producto_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_producto_dimensiones, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_producto_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );
        jp_productosLayout.setVerticalGroup(
            jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_productosLayout.createSequentialGroup()
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_productosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_registrar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_producto_color, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_productosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_producto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_productosLayout.createSequentialGroup()
                        .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_productosLayout.createSequentialGroup()
                                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_producto_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(12, 12, 12)
                                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_producto_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14))
                            .addGroup(jp_productosLayout.createSequentialGroup()
                                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_producto_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_producto_dimensiones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_producto_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_producto_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29))))
                        .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_productosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_producto_meses_garantia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30)))
                            .addGroup(jp_productosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_producto_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_producto_description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(jp_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txt_producto_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jp_productosLayout.createSequentialGroup()
                        .addComponent(btn_modificar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(btn_eliminar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        name1.add(jp_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 920, 270));

        productos_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Stock", "Modelo", "Marca", "Color", "Pais", "Dimension", "Peso", "Garantia", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(productos_tabla);

        name1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1000, 130));

        jTabbedPane1.addTab("Productos", name1);

        name3.setBackground(new java.awt.Color(181, 200, 243));
        name3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Identificación:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Nombre:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Apellido:");

        txt_cliente_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cliente_idActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Celular:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Email:");

        btn_registrar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_registrar_cliente.setText("Registrar");

        btn_modificar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_modificar_cliente.setText("Modificar");
        btn_modificar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_clienteActionPerformed(evt);
            }
        });

        btn_eliminar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_eliminar_cliente.setText("Eliminar");

        btn_cancelar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancelar_cliente.setText("Cancelar");

        txt_cliente_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cliente_direccionActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Dni:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Direccion:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cliente_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_cliente_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_cliente_email, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_cliente_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_cliente_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btn_modificar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_cliente_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_registrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(422, 422, 422))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(txt_cliente_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cliente_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btn_cancelar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(btn_registrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cliente_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_cliente_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btn_modificar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cliente_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cliente_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        name3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 270));

        txt_search_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name3.add(txt_search_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 30));

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Buscar:");
        name3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        clientes_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombre", "Apellido", "Celular", "Dni", "Direccion", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(clientes_tabla);

        name3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 930, 120));

        jTabbedPane1.addTab("Clientes", name3);

        name4.setBackground(new java.awt.Color(181, 200, 243));
        name4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_nueva_compra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Id del producto:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Nombre del producto:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Cantidad:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Precio de compra:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Total a pagar:");

        txt_pedido_producto_nombre.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Subtotal:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("ID:");

        txt_pedido_precio.setEditable(false);

        txt_pedido_subtotal.setEditable(false);

        txt_pedido_id.setEditable(false);
        txt_pedido_id.setEnabled(false);

        txt_pedido_total_a_pagar.setEditable(false);

        btn_confirmar_pedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_confirmar_pedido.setText("Generar Pedido");

        btn_eliminar_pedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_eliminar_pedido.setText("Eliminar");

        btn_nuevo_pedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_nuevo_pedido.setText("Nuevo");

        btn_agregar_producto_a_comprar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_agregar_producto_a_comprar.setText("Agregar Producto");
        btn_agregar_producto_a_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_producto_a_comprarActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Id del cliente:");

        javax.swing.GroupLayout jp_nueva_compraLayout = new javax.swing.GroupLayout(jp_nueva_compra);
        jp_nueva_compra.setLayout(jp_nueva_compraLayout);
        jp_nueva_compraLayout.setHorizontalGroup(
            jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_nueva_compraLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pedido_cliente_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pedido_producto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pedido_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pedido_producto_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_nueva_compraLayout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(78, 78, 78)
                            .addComponent(txt_pedido_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp_nueva_compraLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(18, 18, 18)
                            .addComponent(txt_pedido_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_nueva_compraLayout.createSequentialGroup()
                        .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel17))
                        .addGap(46, 46, 46)
                        .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pedido_total_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pedido_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_nueva_compraLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_eliminar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregar_producto_a_comprar)
                            .addComponent(btn_confirmar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_nueva_compraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_nuevo_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jp_nueva_compraLayout.setVerticalGroup(
            jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_nueva_compraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addComponent(txt_pedido_producto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pedido_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar_producto_a_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_pedido_producto_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_pedido_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txt_pedido_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pedido_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirmar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_nueva_compraLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_nuevo_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pedido_total_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_nueva_compraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_nueva_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txt_pedido_cliente_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );

        name4.add(jp_nueva_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 310));

        pedidos_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre del producto", "Cantidad", "Precio", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(pedidos_tabla);

        name4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 920, 130));

        jTabbedPane1.addTab("Pedidos", name4);

        name6.setBackground(new java.awt.Color(181, 200, 243));
        name6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setBackground(new java.awt.Color(0, 0, 102));
        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 102));
        jLabel63.setText("PEDIDOS REALIZADOS");
        name6.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        tabla_todos_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Total", "Fecha de pedido", "Empleado", "Cliente", "Estado Pedido", "Tipo Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tabla_todos_pedidos);

        name6.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 950, 220));

        jButton_pagar.setText("Pagar");
        jButton_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pagarActionPerformed(evt);
            }
        });
        name6.add(jButton_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 90, 30));

        jButton_despachar.setText("Despachar");
        jButton_despachar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_despacharActionPerformed(evt);
            }
        });
        name6.add(jButton_despachar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, -1, 30));

        jButton_cancelar.setText("Cancelar");
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });
        name6.add(jButton_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 90, 30));

        jTabbedPane1.addTab("Reporte", name6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 580));

        jPanel1.setBackground(new java.awt.Color(133, 214, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelEmpleado.setBackground(new java.awt.Color(0, 51, 51));
        jPanelEmpleado.setForeground(new java.awt.Color(255, 255, 255));

        jLabelEmpleados.setBackground(new java.awt.Color(133, 214, 240));
        jLabelEmpleados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmpleados.setText("Empleados");
        jLabelEmpleados.setToolTipText("");

        javax.swing.GroupLayout jPanelEmpleadoLayout = new javax.swing.GroupLayout(jPanelEmpleado);
        jPanelEmpleado.setLayout(jPanelEmpleadoLayout);
        jPanelEmpleadoLayout.setHorizontalGroup(
            jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                .addComponent(jLabelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelEmpleadoLayout.setVerticalGroup(
            jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmpleadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 35));

        jPanelPurchases.setBackground(new java.awt.Color(0, 51, 51));
        jPanelPurchases.setForeground(new java.awt.Color(255, 255, 255));

        jLabelProductos.setBackground(new java.awt.Color(12, 40, 53));
        jLabelProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelProductos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductos.setText("Productos");

        javax.swing.GroupLayout jPanelPurchasesLayout = new javax.swing.GroupLayout(jPanelPurchases);
        jPanelPurchases.setLayout(jPanelPurchasesLayout);
        jPanelPurchasesLayout.setHorizontalGroup(
            jPanelPurchasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPurchasesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPurchasesLayout.setVerticalGroup(
            jPanelPurchasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPurchasesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelPurchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 35));

        jPanelEmployees.setBackground(new java.awt.Color(0, 51, 51));

        jLabelClientes.setBackground(new java.awt.Color(12, 40, 53));
        jLabelClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelClientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClientes.setText("Clientes");

        javax.swing.GroupLayout jPanelEmployeesLayout = new javax.swing.GroupLayout(jPanelEmployees);
        jPanelEmployees.setLayout(jPanelEmployeesLayout);
        jPanelEmployeesLayout.setHorizontalGroup(
            jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelEmployeesLayout.setVerticalGroup(
            jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 35));

        jPanelSuppliers.setBackground(new java.awt.Color(0, 51, 51));
        jPanelSuppliers.setForeground(new java.awt.Color(255, 255, 255));

        jLabelPedidos.setBackground(new java.awt.Color(12, 40, 53));
        jLabelPedidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPedidos.setText("Pedidos");

        javax.swing.GroupLayout jPanelSuppliersLayout = new javax.swing.GroupLayout(jPanelSuppliers);
        jPanelSuppliers.setLayout(jPanelSuppliersLayout);
        jPanelSuppliersLayout.setHorizontalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuppliersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelSuppliersLayout.setVerticalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuppliersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 35));

        jPanelReports.setBackground(new java.awt.Color(0, 51, 51));
        jPanelReports.setForeground(new java.awt.Color(255, 255, 255));

        jLabelReporte.setBackground(new java.awt.Color(12, 40, 53));
        jLabelReporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelReporte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReporte.setText("Reporte");

        javax.swing.GroupLayout jPanelReportsLayout = new javax.swing.GroupLayout(jPanelReports);
        jPanelReports.setLayout(jPanelReportsLayout);
        jPanelReportsLayout.setHorizontalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportsLayout.createSequentialGroup()
                .addComponent(jLabelReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelReportsLayout.setVerticalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 200, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        //Boton salir
        if(evt.getSource() == btn_logout){
            dispose();
            login login = new login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void jButton_despacharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_despacharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_despacharActionPerformed

    private void jButton_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_pagarActionPerformed

    private void btn_agregar_producto_a_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_producto_a_comprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregar_producto_a_comprarActionPerformed

    private void txt_cliente_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cliente_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cliente_direccionActionPerformed

    private void btn_modificar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificar_clienteActionPerformed

    private void txt_cliente_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cliente_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cliente_idActionPerformed

    private void btn_modificar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificar_productoActionPerformed

    private void btn_registrar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar_productoActionPerformed

    private void txt_producto_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_producto_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_producto_idActionPerformed

    private void txt_empleado_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_empleado_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empleado_idActionPerformed

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Empleados;
    public javax.swing.JButton btn_agregar_producto_a_comprar;
    public javax.swing.JButton btn_cancelar_cliente;
    public javax.swing.JButton btn_cancelar_empleado;
    public javax.swing.JButton btn_cancelar_producto;
    public javax.swing.JButton btn_confirmar_pedido;
    public javax.swing.JButton btn_eliminar_cliente;
    public javax.swing.JButton btn_eliminar_empleado;
    public javax.swing.JButton btn_eliminar_pedido;
    public javax.swing.JButton btn_eliminar_producto;
    private javax.swing.JButton btn_logout;
    public javax.swing.JButton btn_modificar_cliente;
    public javax.swing.JButton btn_modificar_empleado;
    public javax.swing.JButton btn_modificar_producto;
    public javax.swing.JButton btn_nuevo_pedido;
    private javax.swing.JButton btn_photo;
    public javax.swing.JButton btn_registrar_cliente;
    public javax.swing.JButton btn_registrar_empleado;
    public javax.swing.JButton btn_registrar_producto;
    public javax.swing.JTable clientes_tabla;
    public javax.swing.JComboBox<String> cmb_rol;
    public javax.swing.JTable empleado_table;
    public javax.swing.JButton jButton_cancelar;
    public javax.swing.JButton jButton_despachar;
    public javax.swing.JButton jButton_pagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelClientes;
    public javax.swing.JLabel jLabelEmpleados;
    public javax.swing.JLabel jLabelPedidos;
    public javax.swing.JLabel jLabelProductos;
    public javax.swing.JLabel jLabelReporte;
    public javax.swing.JLabel jLabelReporte1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanelEmpleado;
    public javax.swing.JPanel jPanelEmployees;
    public javax.swing.JPanel jPanelPurchases;
    public javax.swing.JPanel jPanelReports;
    public javax.swing.JPanel jPanelSuppliers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jp_nueva_compra;
    private javax.swing.JPanel jp_productos;
    public javax.swing.JLabel label_name_empleado;
    public javax.swing.JLabel label_name_rol;
    private javax.swing.JPanel name1;
    private javax.swing.JPanel name3;
    public javax.swing.JPanel name4;
    private javax.swing.JPanel name6;
    public javax.swing.JTable pedidos_tabla;
    public javax.swing.JTable productos_tabla;
    public javax.swing.JTable tabla_todos_pedidos;
    public javax.swing.JTextField txt_cliente_apellido;
    public javax.swing.JTextField txt_cliente_celular;
    public javax.swing.JTextField txt_cliente_direccion;
    public javax.swing.JTextField txt_cliente_dni;
    public javax.swing.JTextField txt_cliente_email;
    public javax.swing.JTextField txt_cliente_id;
    public javax.swing.JTextField txt_cliente_nombre;
    public javax.swing.JTextField txt_empleado_address;
    public javax.swing.JTextField txt_empleado_apellido;
    public javax.swing.JTextField txt_empleado_email;
    public javax.swing.JTextField txt_empleado_id;
    public javax.swing.JTextField txt_empleado_nombre;
    public javax.swing.JPasswordField txt_empleado_password;
    public javax.swing.JTextField txt_empleado_telephone;
    public javax.swing.JTextField txt_empleado_username;
    public javax.swing.JTextField txt_pedido_cantidad;
    public javax.swing.JTextField txt_pedido_cliente_id;
    public javax.swing.JTextField txt_pedido_id;
    public javax.swing.JTextField txt_pedido_precio;
    public javax.swing.JTextField txt_pedido_producto_id;
    public javax.swing.JTextField txt_pedido_producto_nombre;
    public javax.swing.JTextField txt_pedido_subtotal;
    public javax.swing.JTextField txt_pedido_total_a_pagar;
    public javax.swing.JTextField txt_producto_color;
    public javax.swing.JTextField txt_producto_description;
    public javax.swing.JTextField txt_producto_dimensiones;
    public javax.swing.JTextField txt_producto_id;
    public javax.swing.JTextField txt_producto_marca;
    public javax.swing.JTextField txt_producto_meses_garantia;
    public javax.swing.JTextField txt_producto_modelo;
    public javax.swing.JTextField txt_producto_name;
    public javax.swing.JTextField txt_producto_pais;
    public javax.swing.JTextField txt_producto_peso;
    public javax.swing.JTextField txt_producto_precio;
    public javax.swing.JTextField txt_producto_stock;
    public javax.swing.JTextField txt_search_cliente;
    public javax.swing.JTextField txt_search_empleado;
    public javax.swing.JTextField txt_search_producto;
    // End of variables declaration//GEN-END:variables
}
