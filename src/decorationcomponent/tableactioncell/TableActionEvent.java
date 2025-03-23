package decorationcomponent.tableactioncell;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Acer
 */
public interface TableActionEvent {
    public void onEdit(int row);

    public void onDelete(int row);

    public void onView(int row);
}
