/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.net.URL;
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
    
    public static void setImageToLabel(JLabel label, String pathGambarTanpaExt, String pathGambarDefault) {
        String[] ekstensiUmum = { ".png", ".jpg", ".jpeg" };
        String pathDitemukan = null;

        for (String ekst : ekstensiUmum) {
            String cobaPath = pathGambarTanpaExt + ekst;
            if (new File(cobaPath).exists()) {
                pathDitemukan = cobaPath;
                break;
            }
        }

        if (pathDitemukan == null) {
            pathDitemukan = pathGambarDefault;
        }

        ImageIcon icon = new ImageIcon(pathDitemukan);
        Image image = icon.getImage().getScaledInstance(
                label.getWidth(), label.getHeight(),
                Image.SCALE_SMOOTH
        );
        label.setIcon(new ImageIcon(image));
    }
    
    public static void setImageToLabel(JLabel label, String pathGambarTanpaExt, URL pathDefaultUrl) {
        String pathDitemukan = cariPathGambarYangAda(pathGambarTanpaExt);

        ImageIcon icon;
        if (pathDitemukan != null) {
            icon = new ImageIcon(pathDitemukan);
        } else {
            icon = new ImageIcon(pathDefaultUrl);
        }

        Dimension size = label.getPreferredSize();
        Image image = icon.getImage().getScaledInstance(
                (int) size.getWidth(), (int) size.getHeight(),
                Image.SCALE_SMOOTH
        );
        label.setIcon(new ImageIcon(image));
    }
    
    public static String cariPathGambarYangAda(String pathTanpaEkstensi) {
        String[] ekstensiUmum = { ".png", ".jpg", ".jpeg" };

        for (String ekst : ekstensiUmum) {
            String cobaPath = pathTanpaEkstensi + ekst;
            if (new File(cobaPath).exists()) {
                return cobaPath;
            }
        }

        return null;
    }
}
