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
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Acer
 */
public class GradientBackgroundRowRenderer extends DefaultTableCellRenderer {
    private final Color color1;
    private final Color color2;
    private int x;
    private int width;

    public GradientBackgroundRowRenderer(Color color1, Color color2) {
        this.color1 = color1;
        this.color2 = color2;
        setHorizontalAlignment(SwingConstants.CENTER); // Atur teks ke tengah
        setOpaque(false); // Matikan warna default agar gradient terlihat
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        // Pastikan mengikuti warna dan font dari JTable atau JTableHeader
        if (table.getTableHeader() != null && table.getTableHeader().getDefaultRenderer() == this) {
            setFont(table.getTableHeader().getFont());
            setForeground(table.getTableHeader().getForeground());
        } else {
            setFont(table.getFont());
            setForeground(table.getForeground());
        }

        // Hitung posisi gradient agar dinamis
        Rectangle cellRec = table.getCellRect(row, column, true);
        x = -cellRec.x;
        width = table.getWidth() - cellRec.x;

        return component;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Terapkan gradient
        g2.setPaint(new GradientPaint(x, 0, color1, width, 0, color2));
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));

        // Gambarkan teks setelahnya
        super.paintComponent(g);

        g2.dispose();
    }
}
