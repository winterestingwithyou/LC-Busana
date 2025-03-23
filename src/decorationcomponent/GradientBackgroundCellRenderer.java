/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorationcomponent;

import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Acer
 */
public class GradientBackgroundCellRenderer extends DefaultTableCellRenderer {
    private Color color1;
    private Color color2;
    private int x;
    private int width;
    
    public GradientBackgroundCellRenderer(Color color1, Color color2) {
        this.color1 = color1;
        this.color2 = color2;
        setOpaque(false);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Rectangle cellRec = table.getCellRect(row, column, true);
        
        // Ambil properti dari header JTable
        JTableHeader header = table.getTableHeader();
        if (header != null) {
            setFont(header.getFont()); // Gunakan font yang sudah diatur di header
            setForeground(header.getForeground()); // Gunakan warna teks yang sudah diatur di header
        }

        setHorizontalAlignment(SwingConstants.CENTER); // Pusatkan teks
        
        x = -cellRec.x;
        width = table.getWidth() - cellRec.x;
        return this;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        
        // Gambar gradasi warna
        g2.setPaint(new GradientPaint(x, 0, color1, width, 0, color2));
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));

        super.paintComponent(g);
    }
}
