package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * @author adriel
 */
public class TaskColumnCellRenderer extends DefaultTableCellRenderer {
     @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int col) {
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);
        if (task.isIsCompleted()) {
            label.setForeground(new Color(0, 184, 148));
        } else {
            label.setForeground(new Color(0, 0, 0));
        }
        
        if (isSelected) {
            label.setForeground(new Color(255, 255, 255));
        }
        
        return label;
    }
}
