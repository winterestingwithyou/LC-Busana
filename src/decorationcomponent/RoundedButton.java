/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorationcomponent;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

/**
 *
 * @author Acer
 */
public class RoundedButton extends JButton {
    private int cornerRadius;

    public RoundedButton(int radius) {
        this.cornerRadius = radius;
        setContentAreaFilled(false); // Menghindari rendering default JButton
        setFocusPainted(false); // Menghilangkan border fokus saat ditekan
        setBorderPainted(false); // Menghapus border bawaan JButton
        setOpaque(false); // Membuat tombol transparan di luar area yang digambar
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Warna latar belakang saat tombol ditekan
        if (getModel().isArmed()) {
            g2.setColor(getBackground().darker());
        } else {
            g2.setColor(getBackground());
        }

        // Menggambar tombol dengan sudut melengkung
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
        g2.dispose();

        // Menggambar teks tombol
        super.paintComponent(g);
    }
}
