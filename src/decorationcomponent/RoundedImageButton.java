/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorationcomponent;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Acer
 */
public class RoundedImageButton extends JButton {
    private Image image;   
    private static final String DEFAULT_IMAGE_RESOURCE = "default-profile.png";

    // Constructor kosong pakai gambar default dari resource
    public RoundedImageButton() {
        this(DEFAULT_IMAGE_RESOURCE);
    }

    public RoundedImageButton(String imagePath) {
        setImagePath(imagePath);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    // ✅ Setter untuk mengubah gambar
    public void setImagePath(String imagePath) {
        if (imagePath != null) {
            URL imageURL = getClass().getResource("/image/"+ imagePath);
            if (imageURL != null) {
                this.image = new ImageIcon(imageURL).getImage();
            } else {
                System.err.println("Gagal menemukan gambar: " + imagePath);
            }
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        int size = Math.min(width, height); // supaya tetap bulat

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Ellipse2D circle = new Ellipse2D.Double(
            (width - size) / 2,
            (height - size) / 2,
            size,
            size
        );
        g2.setClip(circle);

        // Gambar akan di-scale ke ukuran lingkaran
        if (image != null) {
            g2.drawImage(image,
                (width - size) / 2,
                (height - size) / 2,
                size, size, this);
        }

        g2.dispose();
        super.paintComponent(g);
    }

    @Override
    public boolean contains(int x, int y) {
        int size = Math.min(getWidth(), getHeight());
        Ellipse2D circle = new Ellipse2D.Double(
            (getWidth() - size) / 2,
            (getHeight() - size) / 2,
            size, size
        );
        return circle.contains(x, y);
    }
}
