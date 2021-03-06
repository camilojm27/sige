/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sige.misc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author daveybtw
 */
public class ds_template1 extends JFrame {
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form ds_admin_user
     */
    public ds_template1() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(100, 30);
        FrameDragListener frameDragListener = new FrameDragListener(this);
        this.addMouseListener(frameDragListener);
        this.addMouseMotionListener(frameDragListener);
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

        left_menu = new JPanel();
        left_footer = new JPanel();
        Cerrar_Sesion = new JLabel();
        left_header = new JPanel();
        jLabel9 = new JLabel();
        jLabel1 = new JLabel();
        jPanel6 = new JPanel();
        jPanel7 = new JPanel();
        left_options = new JPanel();
        registrar_usuarios = new JLabel();
        inicio_left = new JLabel();
        modificar_left = new JLabel();
        jPanel8 = new JPanel();
        min_btn = new JLabel();
        cls_btn = new JLabel();
        jLabel2 = new JLabel();
        content_panel = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(254, 254, 254));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left_menu.setBackground(new Color(50, 55, 61));
        left_menu.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(0, 0, 0)));
        left_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left_footer.setBackground(new Color(50, 55, 61));
        left_footer.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        left_footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar_Sesion.setBackground(new Color(254, 254, 254));
        Cerrar_Sesion.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        Cerrar_Sesion.setForeground(new Color(254, 254, 254));
        Cerrar_Sesion.setHorizontalAlignment(SwingConstants.CENTER);
        Cerrar_Sesion.setText("Cerrar Sesion");
        Cerrar_Sesion.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Cerrar_Sesion.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Cerrar_SesionMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                Cerrar_SesionMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                Cerrar_SesionMouseExited(evt);
            }
        });
        left_footer.add(Cerrar_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 20));

        left_menu.add(left_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 230, 20));

        left_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new ImageIcon(getClass().getResource("/avatar.png"))); // NOI18N
        left_header.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 100, -1));

        jLabel1.setBackground(new Color(1, 1, 1));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/bg_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        left_header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 180));
        left_header.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1100, 20));
        left_header.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        left_menu.add(left_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 180));

        left_options.setBackground(new Color(50, 55, 61));
        left_options.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrar_usuarios.setForeground(new Color(254, 254, 254));
        registrar_usuarios.setHorizontalAlignment(SwingConstants.CENTER);
        registrar_usuarios.setText("Registrar usuarios");
        registrar_usuarios.setAlignmentX(0.6F);
        registrar_usuarios.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registrar_usuarios.setHorizontalTextPosition(SwingConstants.CENTER);
        registrar_usuarios.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                registrar_usuariosMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                registrar_usuariosMouseExited(evt);
            }
        });
        left_options.add(registrar_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 30));

        inicio_left.setForeground(new Color(254, 254, 254));
        inicio_left.setHorizontalAlignment(SwingConstants.CENTER);
        inicio_left.setText("Inicio");
        inicio_left.setAlignmentX(0.6F);
        inicio_left.setCursor(new Cursor(Cursor.HAND_CURSOR));
        inicio_left.setHorizontalTextPosition(SwingConstants.CENTER);
        inicio_left.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                inicio_leftMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                inicio_leftMouseExited(evt);
            }
        });
        left_options.add(inicio_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        modificar_left.setForeground(new Color(254, 254, 254));
        modificar_left.setHorizontalAlignment(SwingConstants.CENTER);
        modificar_left.setText("Modificar usuarios");
        modificar_left.setAlignmentX(0.6F);
        modificar_left.setCursor(new Cursor(Cursor.HAND_CURSOR));
        modificar_left.setHorizontalTextPosition(SwingConstants.CENTER);
        modificar_left.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                modificar_leftMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                modificar_leftMouseExited(evt);
            }
        });
        left_options.add(modificar_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 30));

        left_menu.add(left_options, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, 470));

        getContentPane().add(left_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 230, 670));

        jPanel8.setBackground(new Color(50, 55, 61));
        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        min_btn.setIcon(new ImageIcon(getClass().getResource("/btn_minimize.png"))); // NOI18N
        min_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                min_btnMouseClicked(evt);
            }
        });
        jPanel8.add(min_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 20, 20));

        cls_btn.setIcon(new ImageIcon(getClass().getResource("/btn_close.png"))); // NOI18N
        cls_btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cls_btnMouseClicked(evt);
            }
        });
        jPanel8.add(cls_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 20, 20));

        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("SiGE");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 20));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 20));

        content_panel.setBackground(Color.white);
        content_panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, new Color(0, 0, 0)));
        content_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(content_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 870, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_usuariosMouseEntered(MouseEvent evt) {//GEN-FIRST:event_registrar_usuariosMouseEntered
        registrar_usuarios.setOpaque(true);
        registrar_usuarios.setBackground(new Color(2, 143, 224));// TODO add your handling code here:
    }//GEN-LAST:event_registrar_usuariosMouseEntered

    private void registrar_usuariosMouseExited(MouseEvent evt) {//GEN-FIRST:event_registrar_usuariosMouseExited
        registrar_usuarios.setOpaque(false);
        registrar_usuarios.setBackground(new Color(50,55,61));// TODO add your handling code here:
    }//GEN-LAST:event_registrar_usuariosMouseExited

    private void inicio_leftMouseEntered(MouseEvent evt) {//GEN-FIRST:event_inicio_leftMouseEntered
        inicio_left.setOpaque(true);
        inicio_left.setBackground(new Color(2, 143, 224));// TODO add your handling code here:
    }//GEN-LAST:event_inicio_leftMouseEntered

    private void inicio_leftMouseExited(MouseEvent evt) {//GEN-FIRST:event_inicio_leftMouseExited
        inicio_left.setOpaque(false);
        inicio_left.setBackground(new Color(50,55,61));// TODO add your handling code here:
    }//GEN-LAST:event_inicio_leftMouseExited

    private void modificar_leftMouseEntered(MouseEvent evt) {//GEN-FIRST:event_modificar_leftMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_leftMouseEntered

    private void modificar_leftMouseExited(MouseEvent evt) {//GEN-FIRST:event_modificar_leftMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_leftMouseExited

    private void cls_btnMouseClicked(MouseEvent evt) {//GEN-FIRST:event_cls_btnMouseClicked
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_cls_btnMouseClicked

    private void Cerrar_SesionMouseExited(MouseEvent evt) {//GEN-FIRST:event_Cerrar_SesionMouseExited
        Cerrar_Sesion.setOpaque(false);
        Cerrar_Sesion.setBackground(new Color(50,55,61));
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar_SesionMouseExited

    private void Cerrar_SesionMouseEntered(MouseEvent evt) {//GEN-FIRST:event_Cerrar_SesionMouseEntered

        Cerrar_Sesion.setOpaque(true);
        Cerrar_Sesion.setBackground(new Color(2, 143, 224));
    }//GEN-LAST:event_Cerrar_SesionMouseEntered

    private void Cerrar_SesionMouseClicked(MouseEvent evt) {//GEN-FIRST:event_Cerrar_SesionMouseClicked
        this.dispose();
    }//GEN-LAST:event_Cerrar_SesionMouseClicked

    private void min_btnMouseClicked(MouseEvent evt) {//GEN-FIRST:event_min_btnMouseClicked
        this.setState(JFrame.ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_min_btnMouseClicked


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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ds_template1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ds_template1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ds_template1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ds_template1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ds_template1().setVisible(true);
            }
        });
    }

    public static class FrameDragListener extends MouseAdapter {

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel Cerrar_Sesion;
    private JLabel cls_btn;
    private JPanel content_panel;
    private JLabel inicio_left;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel9;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel left_footer;
    private JPanel left_header;
    private JPanel left_menu;
    private JPanel left_options;
    private JLabel min_btn;
    private JLabel modificar_left;
    private JLabel registrar_usuarios;
    // End of variables declaration//GEN-END:variables
}
