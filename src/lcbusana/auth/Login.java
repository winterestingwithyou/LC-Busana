/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package lcbusana.auth;

import database.Koneksi;
import decorationcomponent.RoundedButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import security.PasswordUtils;
import session.Auth;

/**
 *
 * @author Acer
 */
public class Login extends javax.swing.JPanel {
    private FormAuth fAuth;
    
    /** Creates new form Login */
    public Login(FormAuth fAuth) {
        initComponents();
        this.fAuth = fAuth;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbTitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLupa = new javax.swing.JButton();
        btnLogin = new RoundedButton(10);
        pnlRegister = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        lbTitle.setFont(new java.awt.Font("Vladimir Script", 0, 70)); // NOI18N
        lbTitle.setText("Log In");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 50, 50);
        add(lbTitle, gridBagConstraints);

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new Color(187, 187, 187));
        txtUsername.setText("Username");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 100, 10, 100);
        add(txtUsername, gridBagConstraints);

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new Color(187, 187, 187));
        txtPassword.setText("Password");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtPassword.setEchoChar((char)0);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 100, 10, 100);
        add(txtPassword, gridBagConstraints);

        btnLupa.setBackground(new java.awt.Color(255, 255, 255));
        btnLupa.setText("<HTML><U>Lupa Password ></U></HTML>");
        btnLupa.setToolTipText("");
        btnLupa.setBorder(null);
        btnLupa.setContentAreaFilled(false);
        btnLupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLupa.setFocusPainted(false);
        btnLupa.setOpaque(true);
        btnLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLupaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLupaMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        add(btnLupa, gridBagConstraints);

        btnLogin.setBackground(new java.awt.Color(207, 183, 146));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOG IN");
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(50, 100, 20, 100);
        add(btnLogin, gridBagConstraints);

        pnlRegister.setOpaque(false);

        lblRegister.setText("Tidak Punya Akun?");
        pnlRegister.add(lblRegister);

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("<HTML><U>Register</U></HTML>");
        btnRegister.setToolTipText("");
        btnRegister.setBorder(null);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.setFocusPainted(false);
        btnRegister.setOpaque(true);
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        pnlRegister.add(btnRegister);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        add(pnlRegister, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLupaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLupaMouseEntered
        btnLupa.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnLupaMouseEntered

    private void btnLupaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLupaMouseExited
        btnLupa.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnLupaMouseExited

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        txtUsername.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLUE));  
        if(txtUsername.getText().equals("Username")){
            txtUsername.setText("");
            txtUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        txtUsername.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        if(txtUsername.getText().isEmpty()){
            txtUsername.setText("Username");
            txtUsername.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        txtPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLUE));
        if(txtPassword.getText().equals("Password")
                && txtPassword.getEchoChar() == (char) 0){
            txtPassword.setText("");
            txtPassword.setEchoChar('*');
            txtPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        txtPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        if(String.valueOf(txtPassword.getPassword()).isEmpty()){
            txtPassword.setText("Password");
            txtPassword.setEchoChar((char) 0);
            txtPassword.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        btnRegister.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        btnRegister.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        fAuth.ubahPanel("Register");
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsername.getText().trim();
        String password = String.valueOf(txtPassword.getPassword());
        String hashedPassword = PasswordUtils.hashPassword(password);
         
        // lakukan proses Login     
        if(login(username, hashedPassword)) {
            fAuth.kembaliKeHalamanUtama();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private boolean login(String username, String password) {
        String query = """
                        SELECT
                            id_pelanggan,
                            username,
                            password,
                            nama_lengkap,
                            nomor_wa,
                            email,
                            alamat
                            FROM pelanggan
                        WHERE username = ? AND password = ?
                       """;

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Login berhasil
                    Auth auth = Auth.getInstance();
                    auth.setAuth(true);
                    auth.setAuthUser(rs.getInt("id_pelanggan"));
                    auth.setUsername(rs.getString("username"));
                    auth.setNamaLengkap(rs.getString("nama_lengkap"));
                    auth.setNomorWa(rs.getString("nomor_wa"));
                    auth.setEmail(rs.getString("email"));
                    auth.setAlamat(rs.getString("alamat"));
                    
                    return true;
                } else {
                    // Username atau password tidak cocok
                    JOptionPane.showMessageDialog(null, "Username atau Password salah", "Login Gagal", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat login:\n" + e.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public void setDefaultField(){
        txtUsername.setText("Username");
        txtPassword.setText("Password");
        txtPassword.setEchoChar((char) 0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLupa;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel pnlRegister;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
