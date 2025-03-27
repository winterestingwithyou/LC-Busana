import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class ExpandingDropdownRenderer extends DefaultTableCellRenderer {
    private String[] items;
    
    public ExpandingDropdownRenderer(String[] items) {
        this.items = items;
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        setText(value != null ? value.toString() : "");
        
        // Set tooltip untuk menampilkan semua opsi
        StringBuilder tooltip = new StringBuilder("<html>");
        for (String item : items) {
            tooltip.append(item).append("<br>");
        }
        tooltip.append("</html>");
        setToolTipText(tooltip.toString());
        
        return this;
    }
}