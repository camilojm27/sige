/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sige.finance.pagos;

import java.awt.CardLayout;
import java.awt.Color;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;

import sige.finance.pagoDirecto.VistaRegistrarPago;
import sige.finance.pagoSucursal.VistaSucursal;
import sige.user.User;

/**
 *
 * @author david
 */
public class MainPagosPanel extends javax.swing.JPanel {
    private VistaRegistrarPago panelDirecto;
    private VistaSucursal panelSucursal;
    private User loggedUser;

    /**
     * Creates new form MainPagosPanel
     */
    public MainPagosPanel(User usuario) {
        this.loggedUser = usuario;
        panelDirecto = new VistaRegistrarPago(loggedUser);
        panelSucursal = new VistaSucursal(loggedUser);
        initComponents();
        //backBtn.setVisible(false);
    }
    
    public void lightMode() {
		FlatLightLaf.install();
		FlatLaf.updateUI();
		this.revalidate();
		this.repaint();
	}

    public void darkMode(){
		FlatDarkLaf.install();
		FlatLaf.updateUI();
		this.revalidate();
		this.repaint();

	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardsPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pagoDirectoBtn = new javax.swing.JButton();
        pagoDirectoLbl = new javax.swing.JLabel();
        pagoSucursalBtn = new javax.swing.JButton();
        sucursalLbl = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        topLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(870, 670));

        cardsPanel.setName(""); // NOI18N
        cardsPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        cardsPanel.setLayout(new CardLayout());

        mainPanel.setMaximumSize(new java.awt.Dimension(858, 654));
        mainPanel.setMinimumSize(new java.awt.Dimension(858, 654));
        mainPanel.setPreferredSize(new java.awt.Dimension(858, 654));

        tituloLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Escoja que tipo de pago va a registrar");

        pagoDirectoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pago-directo.png.png"))); // NOI18N
        pagoDirectoBtn.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 0), 1, true));
        pagoDirectoBtn.setBorderPainted(false);
        pagoDirectoBtn.setContentAreaFilled(false);
        pagoDirectoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagoDirectoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagoDirectoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagoDirectoBtnMouseExited(evt);
            }
        });
        pagoDirectoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoDirectoBtnActionPerformed(evt);
            }
        });

        pagoDirectoLbl.setFont(new java.awt.Font("SF Pro Text", 1, 12)); // NOI18N
        pagoDirectoLbl.setText("Pago directo");

        pagoSucursalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pago-sucural.png"))); // NOI18N
        pagoSucursalBtn.setContentAreaFilled(false);
        pagoSucursalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagoSucursalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagoSucursalBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagoSucursalBtnMouseExited(evt);
            }
        });
        pagoSucursalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoSucursalBtnActionPerformed(evt);
            }
        });

        sucursalLbl.setFont(new java.awt.Font("SF Pro Text", 1, 12)); // NOI18N
        sucursalLbl.setText("Pago en sucursal");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(pagoDirectoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(pagoDirectoLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(pagoSucursalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(sucursalLbl)
                        .addGap(125, 125, 125))))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(pagoDirectoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagoDirectoLbl))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(pagoSucursalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sucursalLbl)))
                .addContainerGap(383, Short.MAX_VALUE))
        );

        cardsPanel.add(mainPanel, "card2");

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/go-back.png"))); // NOI18N
        backBtn.setToolTipText("Volver al menú anterior");
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        topLabel.setFont(new java.awt.Font("SF Pro Rounded", 0, 11)); // NOI18N
        topLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topLabel.setText("Registro de pagos");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(backBtn)
                .addGap(315, 315, 315)
                .addComponent(topLabel)
                .addGap(393, 393, 393))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pagoDirectoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoDirectoBtnActionPerformed
    	cardsPanel.add(panelDirecto, "panelDirecto");
    	((CardLayout) cardsPanel.getLayout()).show(cardsPanel, "panelDirecto");
        //backBtn.setVisible(true);
    }//GEN-LAST:event_pagoDirectoBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
        ((CardLayout) cardsPanel.getLayout()).show(cardsPanel, "card2");
        ((CardLayout)cardsPanel.getLayout()).removeLayoutComponent(panelDirecto);
        ((CardLayout)cardsPanel.getLayout()).removeLayoutComponent(panelSucursal);
        //backBtn.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void pagoDirectoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagoDirectoBtnMouseEntered
        pagoDirectoBtn.setOpaque(true);
        pagoDirectoBtn.setBackground(new Color(219, 219, 219));
    }//GEN-LAST:event_pagoDirectoBtnMouseEntered

    private void pagoDirectoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagoDirectoBtnMouseExited
        pagoDirectoBtn.setOpaque(false);
    }//GEN-LAST:event_pagoDirectoBtnMouseExited

    private void pagoSucursalBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagoSucursalBtnMouseEntered
        pagoSucursalBtn.setOpaque(true);
        pagoSucursalBtn.setBackground(new Color(219, 219, 219));
    }//GEN-LAST:event_pagoSucursalBtnMouseEntered

    private void pagoSucursalBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagoSucursalBtnMouseExited
       pagoSucursalBtn.setOpaque(false);
    }//GEN-LAST:event_pagoSucursalBtnMouseExited

    private void pagoSucursalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoSucursalBtnActionPerformed
        cardsPanel.add(panelSucursal, "panelSucursal");
        ((CardLayout) cardsPanel.getLayout()).show(cardsPanel, "panelSucursal");
    }//GEN-LAST:event_pagoSucursalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel cardsPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton pagoDirectoBtn;
    private javax.swing.JLabel pagoDirectoLbl;
    private javax.swing.JButton pagoSucursalBtn;
    private javax.swing.JLabel sucursalLbl;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel topLabel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
