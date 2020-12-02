/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activos;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;

import activos.subestacion.ListaSubestaciones;
import activos.subestacion.SubestacionPanel;
import activos.transformadores.ListaTransformadores;

/**
 *
 * @author david
 */
public class MainActivos extends javax.swing.JPanel {
	private SubestacionPanel agregarSub;
	private final ListaSubestaciones listaSubPanel = new ListaSubestaciones();
	private ListaTransformadores listaTran = new ListaTransformadores();
    /**
     * Creates new form MainSubestacion
     */
    public MainActivos() {
    	agregarSub = new SubestacionPanel();
        initComponents();
        mainTabbedPane.add(listaSubPanel, "Lista de subestacions");
        mainTabbedPane.add(agregarSub, "Agregar subestacion");
        mainTabbedPane.add(listaTran, "Lista de subestaciones");
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

        tituloLabel = new javax.swing.JLabel();
        mainTabbedPane = new javax.swing.JTabbedPane();

        tituloLabel.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        tituloLabel.setText("Gestión de activos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(tituloLabel))
                    .addComponent(mainTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
