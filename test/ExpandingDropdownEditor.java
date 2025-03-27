import javax.swing.*;
import java.awt.*;
        
public class ExpandingDropdownEditor extends DefaultCellEditor {
    private String[] items;
    private DropdownPanel dropdownPanel;
    private JTable table;
    private int editingRow;
    private int originalRowHeight;
    
    public ExpandingDropdownEditor(String[] items) {
        super(new JCheckBox());
        dropdownPanel = new DropdownPanel(items);
        dropdownPanel.setSelectionCallback(this::stopCellEditing);
    }


    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, 
            boolean isSelected, int row, int column) {
        this.table = table;
        this.editingRow = row;
        this.originalRowHeight = table.getRowHeight(row);
        
        // Adjust row height to fit dropdown
//        int preferredHeight = dropdownPanel.getPreferredHeight();
//        if (table.getRowHeight(row) < preferredHeight) {
//            table.setRowHeight(row, preferredHeight);
//        }
        
        return dropdownPanel;
    }
    
    @Override
    public boolean stopCellEditing() {
        // Restore original row height
        if (table != null && editingRow >= 0) {
            table.setRowHeight(editingRow, originalRowHeight);
        }
        return super.stopCellEditing();
    }
    
    @Override
    public void cancelCellEditing() {
        // Restore original row height
        if (table != null && editingRow >= 0) {
            table.setRowHeight(editingRow, originalRowHeight);
        }
        super.cancelCellEditing();
    }
}