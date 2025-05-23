/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lcbusana;

import database.Koneksi;
import decorationcomponent.RoundedButton;
import decorationcomponent.RoundedLabel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import session.Auth;
import tools.ImageUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tools.Chooser;
import tools.FileIO;

/**
 *
 * @author Acer
 */
public class Profil extends javax.swing.JPanel {
    private Layout main;
    /**
     * Creates new form FormProfil
     */
    public Profil(JFrame frame) {
        initComponents();
        this.main = (Layout) frame;
        
        setPhotoProfile();
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

        pnlProfil = new javax.swing.JPanel();
        lbPhoto = new RoundedLabel(20);
        btnEditPhoto = new RoundedButton(10);
        lbUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnUbahPassword = new RoundedButton(10);
        jLabel5 = new RoundedLabel(20);
        pnlDataDiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNoWa = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSimpan = new RoundedButton(10);
        txtAlamat = new javax.swing.JTextField();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.GridLayout(1, 0));

        pnlProfil.setOpaque(false);
        pnlProfil.setLayout(new java.awt.GridBagLayout());

        lbPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lbPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/default-profile.png"))); // NOI18N
        lbPhoto.setPreferredSize(new java.awt.Dimension(250, 250));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        pnlProfil.add(lbPhoto, gridBagConstraints);

        btnEditPhoto.setBackground(new java.awt.Color(207, 183, 146));
        btnEditPhoto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditPhoto.setText("Edit Photo Profile");
        btnEditPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPhotoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlProfil.add(btnEditPhoto, gridBagConstraints);

        lbUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUsername.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        pnlProfil.add(lbUsername, gridBagConstraints);

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pnlProfil.add(txtUsername, gridBagConstraints);

        btnUbahPassword.setBackground(new java.awt.Color(101, 84, 51));
        btnUbahPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUbahPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnUbahPassword.setText("Ubah Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 30, 30);
        pnlProfil.add(btnUbahPassword, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(207, 183, 146));
        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pengaturan Profil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlProfil.add(jLabel5, gridBagConstraints);

        add(pnlProfil);

        pnlDataDiri.setOpaque(false);
        pnlDataDiri.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        pnlDataDiri.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("No WhatsApp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        pnlDataDiri.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        pnlDataDiri.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        pnlDataDiri.add(jLabel4, gridBagConstraints);

        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pnlDataDiri.add(txtNama, gridBagConstraints);

        txtNoWa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNoWa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNoWaFocusLost(evt);
            }
        });
        txtNoWa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoWaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pnlDataDiri.add(txtNoWa, gridBagConstraints);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pnlDataDiri.add(txtEmail, gridBagConstraints);

        btnSimpan.setBackground(new java.awt.Color(207, 183, 146));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 50, 50);
        pnlDataDiri.add(btnSimpan, gridBagConstraints);

        txtAlamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 400;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pnlDataDiri.add(txtAlamat, gridBagConstraints);

        add(pnlDataDiri);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/bg-profile.png"));
        Image img = icon.getImage();
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
    
    private void setPhotoProfile(){
        String pathPhoto = "attachments/Profil/" + Auth.getInstance().getAuthUser();
        URL urlDefault = getClass().getResource("/image/default-profile.png");
                
        ImageUtil.setImageToLabel(lbPhoto, pathPhoto, urlDefault);
    }
    
    //Mengisi TextField berdasarkan data user yang terautentikasi
    private void isiFieldAuth(){
        Auth authUser = Auth.getInstance();
        txtUsername.setText(authUser.getUsername());
        txtNama.setText(authUser.getNamaLengkap());
        txtNoWa.setText(authUser.getNomorWa());
        txtEmail.setText(authUser.getEmail());
        txtAlamat.setText(authUser.getAlamat());
    }
    
    public boolean simpan(int idPelanggan, String username, String nama, String nowa, String email, String alamat) {
        String sql = "UPDATE pelanggan SET username = ?, nama_lengkap = ?, nomor_wa = ?, email = ?, alamat = ? WHERE id_pelanggan = ?";

        try (Connection conn = Koneksi.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, nama);
            stmt.setString(3, nowa);
            stmt.setString(4, email);
            stmt.setString(5, alamat);
            stmt.setInt(6, idPelanggan);

            int barisTerpengaruh = stmt.executeUpdate();
            return barisTerpengaruh > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memperbarui data:\n" + e.getMessage(), "Terjadi Kesalahan", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        setPhotoProfile();
        isiFieldAuth();
    }//GEN-LAST:event_formComponentShown

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        //Mengambil nilai dari field
        String username = txtUsername.getText().trim();
        String nama = txtNama.getText().trim();
        String noWa = txtNoWa.getText().trim();
        String email = txtEmail.getText().trim();
        String alamat = txtAlamat.getText().trim();
        
        //Validasi Input
        if (username.isEmpty() || nama.isEmpty() || noWa.isEmpty() || email.isEmpty() || alamat.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Semua field harus diisi!", "Validasi", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Mengambil id pelanggan
        Auth auth = Auth.getInstance();
        int idPelanggan = auth.getAuthUser();
        
        //Lakukan simpan perubahan
        if(simpan(idPelanggan, username, nama, noWa, email, alamat)){
            auth.setUsername(username);
            auth.setNamaLengkap(nama);
            auth.setNomorWa(noWa);
            auth.setEmail(email);
            auth.setAlamat(alamat);
            
            JOptionPane.showMessageDialog(null, "Berhasil memperbarui data");
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtNoWaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoWaFocusLost
        String input = txtNoWa.getText().trim();
            if (!input.matches("^08\\d{9,11}$")) {
                JOptionPane.showMessageDialog(main, "Nomor tidak valid! Harus diawali 08 dan 11-13 digit.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                txtNoWa.setText("");
            }
    }//GEN-LAST:event_txtNoWaFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        String input = txtEmail.getText().trim();
            if (!input.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
                JOptionPane.showMessageDialog(main, "Email tidak valid!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                txtEmail.setText("");
            }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtNoWaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoWaKeyTyped
        char c = evt.getKeyChar();

        // Jika bukan digit dan bukan backspace/delete, tampilkan peringatan
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume(); // Mencegah karakter ditulis ke JTextField
            JOptionPane.showMessageDialog(
                        main,
                        "Nomor Whatsapp harus diisi dengan angka",
                        "Peringatan",
                        JOptionPane.WARNING_MESSAGE
                    );
        }
        
        // Batasi panjang maksimal 13 digit
        if (Character.isDigit(c) && txtNoWa.getText().length() >= 13) {
            evt.consume();
            JOptionPane.showMessageDialog(
                main,
                "Nomor Whatsapp tidak boleh lebih dari 13 digit!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_txtNoWaKeyTyped

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        char c = evt.getKeyChar();

        // Jika bukan huruf, bukan spasi, bukan titik, dan bukan backspace/delete, tampilkan peringatan
        if (!Character.isLetter(c) && c != ' ' && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume(); // Mencegah karakter tidak valid masuk
            JOptionPane.showMessageDialog(
                    main,
                    "Nama harus diisi dengan huruf atau spasi",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNamaKeyTyped

    private void btnEditPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPhotoActionPerformed
        String dirProfil = "attachments/Profil";
        String profilBaru = Chooser.chooseFile();
        String idUser = String.valueOf(Auth.getInstance().getAuthUser());
        
        //Simpan foto profil baru
        FileIO.simpanFile(dirProfil, idUser, profilBaru);
        
        setPhotoProfile();
        main.loadProfil();
    }//GEN-LAST:event_btnEditPhotoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditPhoto;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbahPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbPhoto;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel pnlDataDiri;
    private javax.swing.JPanel pnlProfil;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoWa;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
