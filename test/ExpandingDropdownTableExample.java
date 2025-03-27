import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ExpandingDropdownTableExample {
    public static void main(String[] args) {
        String[] items = {"Java", "Python", "C++", "JavaScript", "Ruby", "Go", "Swift", "Kotlin"};
        
        // Create table model
        DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Programming Language"}, 0);
        model.addRow(new Object[]{1, "Java"});
        model.addRow(new Object[]{2, "Python"});
        model.addRow(new Object[]{3, "C++"});
        model.addRow(new Object[]{4, "JavaScript"});
        
        // Create table
        JTable table = new JTable(model);
        table.setRowHeight(25); // Tinggi default
        
        // Set renderer and editor for the second column
        table.getColumnModel().getColumn(0).setCellRenderer(new AlignTextCellRenderer(SwingConstants.TOP, SwingConstants.CENTER));
        table.getColumnModel().getColumn(1).setCellRenderer(new ExpandingDropdownRenderer(items));
        table.getColumnModel().getColumn(1).setCellEditor(new ExpandingDropdownEditor(items));
        
        // Create frame
        JFrame frame = new JFrame("Expanding Dropdown Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(table));
        frame.pack();
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}