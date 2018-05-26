/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        
        setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registrar = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombreR = new javax.swing.JTextField();
        tf_userR = new javax.swing.JTextField();
        tf_emailR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_edadR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bt_signUp = new javax.swing.JButton();
        tf_passwordR = new javax.swing.JPasswordField();
        jd_logeado = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_nombrePerfil = new javax.swing.JTextField();
        tf_edadPerfil = new javax.swing.JTextField();
        tf_correoPerfil = new javax.swing.JTextField();
        tf_usuarioPerfil = new javax.swing.JTextField();
        tf_passwordPerfil = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_clases = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_atributos = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_command = new javax.swing.JTextArea();
        bt_ejecutar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        tf_user = new javax.swing.JTextField();
        bt_login = new javax.swing.JButton();
        bt_signup = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jd_registrar.setTitle("Registro de Usuarios");

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setForeground(new java.awt.Color(102, 153, 255));
        jPanel4.setToolTipText("");

        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Registro");

        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Usuario:");

        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("Email:");

        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Password:");

        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Edad:");

        bt_signUp.setText("Sign Up");
        bt_signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_signUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombreR)
                            .addComponent(tf_userR)
                            .addComponent(tf_emailR)
                            .addComponent(tf_edadR, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(tf_passwordR)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel4)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_signUp)
                .addGap(78, 78, 78))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_userR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_emailR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_edadR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addComponent(bt_signUp)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_registrarLayout = new javax.swing.GroupLayout(jd_registrar.getContentPane());
        jd_registrar.getContentPane().setLayout(jd_registrarLayout);
        jd_registrarLayout.setHorizontalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_registrarLayout.setVerticalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel10.setText("Nombre:");

        jLabel11.setText("Edad:");

        jLabel12.setText("Correo:");

        jLabel14.setText("Usuario:");

        jLabel15.setText("Password:");

        jl_clases.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_clases);

        jLabel16.setText("Lista de Clases");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(38, 38, 38)
                        .addComponent(tf_edadPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26)
                        .addComponent(tf_correoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(tf_usuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_passwordPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_nombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_edadPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_correoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_usuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(tf_passwordPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addContainerGap(273, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Perfil", jPanel1);

        jl_atributos.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_atributos);

        jLabel18.setText("Lista de Atributos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addGap(65, 65, 65)))
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VIsualizar", jPanel2);

        jLabel17.setText("Comando:");

        ta_command.setColumns(20);
        ta_command.setRows(5);
        ta_command.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ta_commandKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(ta_command);

        bt_ejecutar.setText("Ejecutar");
        bt_ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ejecutarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_ejecutar)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_ejecutar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(425, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ejecutar", jPanel3);

        jButton3.setText("Cerrar Sesion");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_logeadoLayout = new javax.swing.GroupLayout(jd_logeado.getContentPane());
        jd_logeado.getContentPane().setLayout(jd_logeadoLayout);
        jd_logeadoLayout.setHorizontalGroup(
            jd_logeadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_logeadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_logeadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(22, 22, 22))
        );
        jd_logeadoLayout.setVerticalGroup(
            jd_logeadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_logeadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setForeground(new java.awt.Color(204, 255, 204));

        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("Contraseña");

        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("Usuario");

        bt_login.setText("Iniciar Sesion");
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });

        bt_signup.setText("Registrarse");
        bt_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_signupMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Ingreso al Sistema");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_login)
                    .addComponent(jLabel9)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_signup)
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(bt_login)
                .addGap(18, 18, 18)
                .addComponent(bt_signup)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        // TODO add your handling code here:
        String username="",password="";
        
        
        int r=Usuarios.buscar(tf_user.getText(), tf_password.getText());
        
        
        
        for (Usuarios usuario : usuarios) {
            if(usuario instanceof Usuarios){
                for (int i = 0; i < usuarios.size(); i++) {
                    username=usuarios.get(i).getNombre();
                    password=usuarios.get(i).getPassword();
                }
            }
        }
        
        if(tf_user.getText().equals(username)&&tf_password.getText().equals(password)){
            
            tf_user.setText("");
            tf_password.setText("");
            
            jd_logeado.setModal(true);
            jd_logeado.pack();
            jd_logeado.setLocationRelativeTo(this);
            jd_logeado.setVisible(true);
            
            
        }
        else{
            JOptionPane.showMessageDialog(jd_logeado,"No existe ese usuario\n");
        }
        
        
    }//GEN-LAST:event_bt_loginMouseClicked

    private void bt_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_signupMouseClicked
        // TODO add your handling code here:
        jd_registrar.setModal(true);
        jd_registrar.pack();
        jd_registrar.setLocationRelativeTo(this);
        jd_registrar.setVisible(true);
    }//GEN-LAST:event_bt_signupMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        jd_logeado.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void bt_signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_signUpMouseClicked
        String nombre, usuario,correo,contrasena;
        int edad;
        
        try{
            
            nombre=tf_nombreR.getText();
            usuario=tf_userR.getText();
            correo=tf_emailR.getText();
            contrasena=tf_passwordR.getText();
            edad=Integer.parseInt(tf_edadR.getText());
            
            Usuarios user = new Usuarios(nombre, correo, usuario, contrasena, edad);
            
            user.setClases(new ArrayList<Clases>());
            
            usuarios.add(user);
            
            tf_nombreR.setText("");
            tf_userR.setText("");
            tf_emailR.setText("");
            tf_passwordR.setText("");
            tf_edadR.setText("");
            
            JOptionPane.showMessageDialog(
                    jd_registrar,"Usuario registrado con éxito.");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    jd_registrar, "Ocurrió un error y no se guardaron los datos.", 
                    "Error al ingresar datos", JOptionPane.ERROR_MESSAGE);
            
            tf_nombreR.setText("");
            tf_userR.setText("");
            tf_emailR.setText("");
            tf_passwordR.setText("");
            tf_edadR.setText("");
        }
    }//GEN-LAST:event_bt_signUpMouseClicked

    private void bt_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ejecutarMouseClicked
        String menu="";
        menu=ta_command.getText();
        switch(menu){
            case "create class":
                
                String nombre=JOptionPane.showInputDialog(jd_logeado, "Nombre de la Clase:");
                
                Clases x = new Clases(nombre);
                clase.add(x);
                
                DefaultListModel modelo = (DefaultListModel)jl_clases.getModel();
                modelo.addElement(x);
                jl_clases.setModel(modelo);
                
                ta_command.setText("");
                JOptionPane.showMessageDialog(jd_logeado, "Clase creada con éxito");
                break;
            case "modify class":
                int pos=Integer.parseInt(
                        JOptionPane.showInputDialog("Posición de la Clase"));
                
                
                if(pos>=0 && pos <clase.size() 
                        && clase.get(pos) instanceof Clases){
                    String nombreC=JOptionPane.showInputDialog("Nuevo nombre de la clase");
                    
                    ((Clases)clase.get(pos)).setNombre(nombreC);
                }
                break;
            case "delete class":
                int posi=Integer.parseInt(
                        JOptionPane.showInputDialog("Eliminar Clase"));
                
                if(posi>=0 && posi <clase.size() 
                        && clase.get(posi) instanceof Clases){
                    
                    clase.remove(posi);
                }
                break;
            case "add atribute":
                
                String tipoAtributo="", nombreAtributo="";
                int nClase=Integer.parseInt(
                        JOptionPane.showInputDialog("Posición del Atributo"));
                nClase=nClase-1;
                
                Usuarios persona = usuarios.get(nClase);
                
                System.out.println("Nombre: "+persona.getNombre());
                
                Atributos at= new Atributos(tipoAtributo, nombreAtributo);
                Clases clas= new Clases();
                
                JOptionPane.showInputDialog("Atributo de la Clase");
                at.setAtributo(tipoAtributo);                
                
                JOptionPane.showInputDialog("Nombre del atributo");
                at.setNombre(nombreAtributo);
                
                clas.agregarAtributo(at);
                atributos.add(at);
                
                
                DefaultListModel model = (DefaultListModel)jl_atributos.getModel();
                model.addElement(at);
                jl_atributos.setModel(model);
                
                
                ta_command.setText("");
                JOptionPane.showMessageDialog(jd_logeado, "Atributo de clase creado con éxito");
                
                break;
                
            case "modify atribute":
                int posAt=Integer.parseInt(
                        JOptionPane.showInputDialog("Posición del atributo"));
                
                if(posAt>=0 && posAt <atributos.size() 
                        && atributos.get(posAt) instanceof Atributos){
                    String tipoAt=JOptionPane.showInputDialog("Nuevo tipo del atributo");
                    ((Atributos)atributos.get(posAt)).setNombre(tipoAt);
                    
                    String nombreAt=JOptionPane.showInputDialog("Nuevo nombre del atributo");
                    ((Atributos)atributos.get(posAt)).setNombre(nombreAt);
                }
                break;
                
            case "delete atribute":
                int posA=Integer.parseInt(
                        JOptionPane.showInputDialog("Eliminar Clase"));
                
                if(posA>=0 && posA <atributos.size() 
                        && atributos.get(posA) instanceof Atributos){
                    
                    atributos.remove(posA);
                }
                break;
                
                
        }
    }//GEN-LAST:event_bt_ejecutarMouseClicked

    private void ta_commandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta_commandKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            JOptionPane.showMessageDialog(jd_logeado, "Presione ingresar");
        }
    }//GEN-LAST:event_ta_commandKeyPressed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ejecutar;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_signUp;
    private javax.swing.JButton bt_signup;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_logeado;
    private javax.swing.JDialog jd_registrar;
    private javax.swing.JList<String> jl_atributos;
    private javax.swing.JList<String> jl_clases;
    private javax.swing.JTextArea ta_command;
    private javax.swing.JTextField tf_correoPerfil;
    private javax.swing.JTextField tf_edadPerfil;
    private javax.swing.JTextField tf_edadR;
    private javax.swing.JTextField tf_emailR;
    private javax.swing.JTextField tf_nombrePerfil;
    private javax.swing.JTextField tf_nombreR;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JPasswordField tf_passwordPerfil;
    private javax.swing.JPasswordField tf_passwordR;
    private javax.swing.JTextField tf_user;
    private javax.swing.JTextField tf_userR;
    private javax.swing.JTextField tf_usuarioPerfil;
    // End of variables declaration//GEN-END:variables

    public static ArrayList<Atributos> atributos = new ArrayList();
    public static ArrayList<Usuarios> usuarios = new ArrayList();
    public static ArrayList<Clases> clase= new ArrayList();
    
    
}
