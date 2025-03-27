/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Acer
 */
public class AlignTextCellRenderer extends DefaultTableCellRenderer {
    private int verticalAlignment;
    private int horizontalAlignment;
    
    public AlignTextCellRenderer(int verticalAlignment, int horizontalAlignment) {
        this.verticalAlignment = verticalAlignment;
        this.horizontalAlignment = horizontalAlignment;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (c instanceof JLabel) {
            ((JLabel) c).setVerticalAlignment(verticalAlignment);
            ((JLabel) c).setHorizontalAlignment(horizontalAlignment);
        }
        return c;
    }
}
