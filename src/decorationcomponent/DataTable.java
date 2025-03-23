/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorationcomponent;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Acer
 */
public class DataTable extends JTable {
    public DataTable() {
        // Atur desain header tabel
        JTableHeader tableHeader = getTableHeader();
        tableHeader.setFont(new Font("Arial", Font.BOLD, 14));
        tableHeader.setBackground(new Color(139, 69, 19)); // Coklat
        tableHeader.setForeground(Color.WHITE);
        tableHeader.setReorderingAllowed(false); // Mencegah user menggeser kolom
        
        // Gunakan custom renderer untuk menyesuaikan tinggi baris
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer());
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
        super.setValueAt(aValue, row, column);
        adjustRowHeight(row);
    }

    // Metode untuk menyesuaikan tinggi baris berdasarkan isi sel
    private void adjustRowHeight(int row) {
        int maxHeight = 0;
        for (int column = 0; column < getColumnCount(); column++) {
            TableCellRenderer cellRenderer = getCellRenderer(row, column);
            Component comp = prepareRenderer(cellRenderer, row, column);
            maxHeight = Math.max(comp.getPreferredSize().height, maxHeight);
        }
        setRowHeight(row, maxHeight);
    }
}
