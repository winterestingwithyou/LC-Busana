/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lcbusana;

import database.DataPermakBusana;
import database.DataPesanBusana;
import decorationcomponent.RoundedButton;
import decorationcomponent.BackgroundPanel;
import decorationcomponent.RoundedPanel;
import javax.swing.JFrame;

/**
 *
 * @author Acer
 */
public class Dashboard extends javax.swing.JPanel {
    private Layout main;
    
    /**
     * Creates new form Dashboard
     */
    public Dashboard(JFrame frame) {
        initComponents();
        
        this.main = (Layout) frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlTitle = new BackgroundPanel("bg-dashboard.png");
        pnlWelcome = new RoundedPanel(60);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlTombol = new javax.swing.JPanel();
        btnPesanBusana = new RoundedButton(30);
        btnPermakBusana = new RoundedButton(30);

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        pnlTitle.setLayout(new java.awt.GridBagLayout());

        pnlWelcome.setBackground(new java.awt.Color(207, 183, 146));
        pnlWelcome.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 0, 120)); // NOI18N
        jLabel1.setText("Selamat Datang di");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlWelcome.add(jLabel1, new java.awt.GridBagConstraints());

        jLabel2.setFont(new java.awt.Font("Vladimir Script", 0, 120)); // NOI18N
        jLabel2.setText("LC Busana");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        pnlWelcome.add(jLabel2, gridBagConstraints);
        jLabel2.getAccessibleContext().setAccessibleName("di LC Busana");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 50;
        pnlTitle.add(pnlWelcome, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.6;
        add(pnlTitle, gridBagConstraints);

        pnlTombol.setBackground(new java.awt.Color(255, 255, 255));
        pnlTombol.setLayout(new java.awt.GridBagLayout());

        btnPesanBusana.setBackground(new java.awt.Color(207, 183, 146));
        btnPesanBusana.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPesanBusana.setText("Pesan Busana");
        btnPesanBusana.setBorderPainted(false);
        btnPesanBusana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanBusanaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        pnlTombol.add(btnPesanBusana, gridBagConstraints);

        btnPermakBusana.setBackground(new java.awt.Color(207, 183, 146));
        btnPermakBusana.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPermakBusana.setText("Permak Busana");
        btnPermakBusana.setBorderPainted(false);
        btnPermakBusana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermakBusanaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        pnlTombol.add(btnPermakBusana, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.4;
        add(pnlTombol, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesanBusanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanBusanaActionPerformed
        main.ubahPanel("bmain");
        main.setStatus("Busana");
    }//GEN-LAST:event_btnPesanBusanaActionPerformed

    private void btnPermakBusanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermakBusanaActionPerformed
        main.ubahPanel("pmain");
        main.setStatus("Permak");
    }//GEN-LAST:event_btnPermakBusanaActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if(!(main.getStatus() == null)){
            switch(main.getStatus()){
                case "Busana" -> {
                    DataPesanBusana.getInstance().clear();
                    main.pesanBusanaClear();
                } 
                case "Permak" -> {
                    DataPermakBusana.getInstance().clear();
                    main.permakBusanaClear();
                }
            }
        }
        
        main.setStatus(null);
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPermakBusana;
    private javax.swing.JButton btnPesanBusana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JPanel pnlTombol;
    private javax.swing.JPanel pnlWelcome;
    // End of variables declaration//GEN-END:variables
}
