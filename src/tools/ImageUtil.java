/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Acer
 */
public class ImageUtil {
    public static void setImageToLabel(JLabel label, String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        Image img = icon.getImage();

        int width = label.getWidth();
        int height = width; // Menjaga rasio 1:1

        Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaledImg));

        // Menyesuaikan tinggi label agar tetap 1:1
        label.setSize(width, height);
    }
}
