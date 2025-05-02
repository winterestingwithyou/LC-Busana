/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorationcomponent;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JButton;

/**
 *
 * @author Acer
 */
public class ImageButton extends JButton {
    private BufferedImage backgroundImage;

    public ImageButton() {
        setOpaque(false); // Supaya background terlihat
        setContentAreaFilled(false);
        setBorderPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    public ImageButton(String pathGambar) {
        this();
        muatGambar(pathGambar);
    }

    public void setBackgroundImage(String pathGambar) {
        muatGambar(pathGambar);
        repaint();
    }

    private void muatGambar(String path) {
        try {
            URL imageURL = getClass().getResource("/image/"+ path);
            
            if (imageURL != null) {
                backgroundImage = ImageIO.read(imageURL);
            } else {
                System.err.println("Gambar tidak ditemukan: " + path);
                backgroundImage = null;
            }
        } catch (IOException e) {
            System.err.println("Gagal memuat gambar: " + e.getMessage());
            backgroundImage = null;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
        super.paintComponent(g); // menggambar isi tombol seperti teks
    }
}
