package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * @author adriel
 */
public class DeadlineColumnCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int col) {
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        label.setHorizontalAlignment(CENTER);
        
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);
        if (task.isIsCompleted()) {
            label.setForeground(new Color(0, 255, 0));
        } else if (task.getDeadline().before(new Date())) {
            label.setForeground(new Color(255, 0, 0));
        } else {
            label.setForeground(new Color(0, 0, 0));
        }
        
        if (isSelected) {
            label.setForeground(new Color(255, 255, 255));
        }
        
        return label;
    }
}
