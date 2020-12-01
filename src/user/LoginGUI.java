package user;

import user.config.ConfigControl;
import user.mantenimiento.Mantenimiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class LoginGUI extends javax.swing.JFrame {
	public ConfigControl configControl;
	private User usuario;
    /**
     * Creates new form ds_login
     */
    public LoginGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        configControl = new ConfigControl();
        setVisible(true);
        initComponents();
        changeComponents();
    }
    
    public void exit(){
        this.dispose();
    }
    
    public void wrongUserPassword(){
        JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectas");
    }
    
    public void changeComponents(){
        // ---------------------------------------------
        jTextField2.setBorder(BorderFactory.createCompoundBorder(
        jTextField2.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        // ----------------------------------------------
        jPasswordField1.setBorder(BorderFactory.createCompoundBorder(
        jPasswordField1.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        // ----------------------------------------------
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
          
            if(jTextField2.getText().length() != 0 && String.valueOf(jPasswordField1.getPassword()).length() != 0){
                try {
                    // intentional error
                	
                    String s = jTextField2.getText();
                    
                    /* Una vez se tengan el cc y la contraseña, se cre una instancia
                     * de usuario, para poder realizar el login más adelante.
                     */
                    usuario = new User(s, String.valueOf(jPasswordField1.getPassword()));
                    
                    if (usuario.attemptLogin(s, String.valueOf(jPasswordField1.getPassword()))) {
                        int rol = usuario.getIdRol();
                        configControl.updateData();
                        switch(rol){
                            case 0:
                                System.out.println("Not found");
                                wrongUserPassword();
                                jPasswordField1.setText("");
                                break;
                            case 1:
                                Dashboard adminInterface = new Dashboard(usuario);
                                adminInterface.setVisible(true);
                                System.out.println("Welcome back admin");
                                exit();
                                break;
                            case 2:
                                if (configControl.tiempoDelMantenimiento() > 0){
                                    Mantenimiento mantenimiento = new Mantenimiento(configControl.getHMS());
                                    mantenimiento.setVisible(true);
                                }
                                else{
                                    System.out.println("Welcome back manager");
                                    Dashboard managerInterface = new Dashboard(usuario);
                                    managerInterface.setVisible(true);
                                }
                                exit();

                                break;
                            case 3:
                                if (configControl.tiempoDelMantenimiento() > 0){
                                    Mantenimiento mantenimiento = new Mantenimiento(configControl.getHMS());
                                    mantenimiento.setVisible(true);
                                }else{
                                    System.out.println("Welcome back operator");
                                    Dashboard operatorInterface = new Dashboard(usuario);
                                    operatorInterface.setVisible(true);
                                }
                                exit();

                                break;
                            case 4:
                                System.out.println("Couldn't find a proper window");
                                break;
                        }
                    } else {
                    	wrongUserPassword();
                    }
                }
                catch (NumberFormatException nfe) {
                    System.out.println("Invalido");
                    wrongUserPassword();
                }
                
            } else {
                System.out.println("Vacio");
                wrongUserPassword();
            }

          }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/login_bg.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 410, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido nuevamente");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jTextField2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 11)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 228, 228)));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 400, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, 20));

        jButton1.setBackground(new java.awt.Color(3, 255, 157));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 160, 40));

        jPasswordField1.setToolTipText("Ingresa tu clave");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 228, 228)));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 400, 40));

        jLabel3.setText("Contraseña");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel5.setText("Cedula");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 490, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
