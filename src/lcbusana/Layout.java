/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lcbusana;

import java.awt.CardLayout;

/**
 *
 * @author Acer
 */
public class Layout extends javax.swing.JFrame {
    private CardLayout card;
    private String status;
    private FormPesanBusana_Main bmain = new FormPesanBusana_Main(this);
    private FormPesanBusana_Ukuran bukuran = new FormPesanBusana_Ukuran(this);
    private FormPesanBusana_Tambahan btambahan = new FormPesanBusana_Tambahan(this);
    private FormPesanBusana_WaktuBiaya bwaktubiaya = new FormPesanBusana_WaktuBiaya(this);
    private FormPermak_Main pmain = new FormPermak_Main(this);
    private FormPermak_Jenis pjenis = new FormPermak_Jenis(this);
    private FormPermak_Tambahan ptambahan = new FormPermak_Tambahan(this);
    private FormPermak_WaktuBiaya pwaktubiaya = new FormPermak_WaktuBiaya(this);
    private FormDataDiri datadiri = new FormDataDiri(this);      
            
    /**
     * Creates new form Layout
     */
    public Layout() {      
        initComponents();                     
        this.card = (CardLayout) pnlBody.getLayout();
        
        setExtendedState(6);
        komponenBody();
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

        pnlNavigasi = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnlBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LC Busana");
        setExtendedState(6);
        setPreferredSize(new java.awt.Dimension(1100, 650));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlNavigasi.setBackground(new java.awt.Color(207, 183, 146));
        pnlNavigasi.setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(207, 183, 146));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Home");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlNavigasi.add(jButton1, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(207, 183, 146));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Pesanan");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 70);
        pnlNavigasi.add(jButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(pnlNavigasi, gridBagConstraints);

        pnlBody.setBackground(new java.awt.Color(153, 153, 153));
        pnlBody.setLayout(new java.awt.CardLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.9;
        getContentPane().add(pnlBody, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public CardLayout getLayoutPanel(){
        return this.card;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ubahPanel("pesanan");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ubahPanel("dashboard");      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void komponenBody(){    
        pnlBody.add(new Dashboard(this), "dashboard");
        pnlBody.add(new Pesanan(this), "pesanan");
        pnlBody.add(bmain, "bmain");
        pnlBody.add(bukuran, "bukuran");
        pnlBody.add(btambahan, "btambahan");
        pnlBody.add(bwaktubiaya, "bwaktubiaya");
        pnlBody.add(pmain, "pmain");
        pnlBody.add(pjenis, "pjenis");
        pnlBody.add(ptambahan, "ptambahan");
        pnlBody.add(pwaktubiaya, "pwaktubiaya");
        pnlBody.add(datadiri, "datadiri");
    }
        
    public void ubahPanel(String namaPanel){
        card.show(pnlBody, namaPanel);
    }
    
    public void pesanBusanaClear(){
        bmain.clear();
        bukuran.clear();
        btambahan.clear();
        bwaktubiaya.clear();
        datadiri.clear();
    }
          
    public void permakBusanaClear(){
        pmain.clear();
        pjenis.clear();
        ptambahan.clear();
        pwaktubiaya.clear();
        datadiri.clear();
    }
    
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
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Layout().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlNavigasi;
    // End of variables declaration//GEN-END:variables
}
