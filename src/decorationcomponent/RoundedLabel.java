/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorationcomponent;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Acer
 */
public class RoundedLabel extends JLabel {
    private int radius;

    public RoundedLabel(int radius) {
        this.radius = radius;
        setOpaque(false); // agar background bisa digambar secara manual
        setHorizontalAlignment(SwingConstants.CENTER); // teks rata tengah
    }

    public void setRadius(int radius) {
        this.radius = radius;
        repaint();
    }

    public int getRadius() {
        return radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Gambar background rounded
        Shape rounded = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fill(rounded);

        // Siapkan teks dan ikon
        Icon icon = getIcon();
        String text = getText();
        FontMetrics fm = g2.getFontMetrics(getFont());
        int textWidth = (text != null) ? fm.stringWidth(text) : 0;
        int textHeight = fm.getAscent();

        int iconWidth = (icon != null) ? icon.getIconWidth() : 0;
        int iconHeight = (icon != null) ? icon.getIconHeight() : 0;

        int totalWidth = textWidth + (icon != null && text != null && !text.isEmpty() ? 4 : 0) + iconWidth;
        int x = (getWidth() - totalWidth) / 2;
        int y = (getHeight() - Math.max(textHeight, iconHeight)) / 2;

        // Gambar ikon
        if (icon != null) {
            icon.paintIcon(this, g2, x, (getHeight() - iconHeight) / 2);
            x += iconWidth + 4; // jarak antara ikon dan teks
        }

        // Gambar teks
        if (text != null && !text.isEmpty()) {
            g2.setFont(getFont());
            g2.setColor(getForeground());
            g2.drawString(text, x, (getHeight() + textHeight) / 2 - 2);
        }

        g2.dispose();
    }
    
    @Override
    protected void paintBorder(Graphics g) {
        // tidak menggambar border sama sekali
    }
}
