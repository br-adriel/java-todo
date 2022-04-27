/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author adriel
 */
public class NewTaskScreen extends javax.swing.JDialog {

    TaskController controller;
    Project project;

    /**
     * Creates new form NewTaskScreen
     */
    public NewTaskScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameFundo = new javax.swing.JPanel();
        frameHeader = new javax.swing.JPanel();
        labelHeader = new javax.swing.JLabel();
        frameForm = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        scrollDescricao = new javax.swing.JScrollPane();
        inputDescricao = new javax.swing.JTextArea();
        btnSalvar = new javax.swing.JButton();
        inputNome = new javax.swing.JTextField();
        labelPrazo = new javax.swing.JLabel();
        labelNotas = new javax.swing.JLabel();
        scrollNotas = new javax.swing.JScrollPane();
        inputNotas = new javax.swing.JTextArea();
        inputPrazo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova tarefa");

        frameFundo.setBackground(new java.awt.Color(223, 230, 233));

        frameHeader.setBackground(new java.awt.Color(108, 92, 231));

        labelHeader.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelHeader.setForeground(new java.awt.Color(255, 255, 255));
        labelHeader.setText("Nova tarefa");

        javax.swing.GroupLayout frameHeaderLayout = new javax.swing.GroupLayout(frameHeader);
        frameHeader.setLayout(frameHeaderLayout);
        frameHeaderLayout.setHorizontalGroup(
            frameHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHeaderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameHeaderLayout.setVerticalGroup(
            frameHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        frameForm.setBackground(new java.awt.Color(255, 255, 255));

        labelNome.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        labelNome.setText("Nome:");

        labelDescricao.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição:");

        inputDescricao.setColumns(20);
        inputDescricao.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        inputDescricao.setRows(5);
        scrollDescricao.setViewportView(inputDescricao);

        btnSalvar.setBackground(new java.awt.Color(108, 92, 231));
        btnSalvar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        inputNome.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        labelPrazo.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        labelPrazo.setText("Prazo:");

        labelNotas.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        labelNotas.setText("Notas:");

        inputNotas.setColumns(20);
        inputNotas.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        inputNotas.setRows(5);
        scrollNotas.setViewportView(inputNotas);

        inputPrazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        inputPrazo.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        inputPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrazoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameFormLayout = new javax.swing.GroupLayout(frameForm);
        frameForm.setLayout(frameFormLayout);
        frameFormLayout.setHorizontalGroup(
            frameFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameFormLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameFormLayout.createSequentialGroup()
                        .addGroup(frameFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(frameFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameFormLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(labelPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(frameFormLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(frameFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scrollNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameFormLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(inputPrazo)))))
                .addContainerGap())
        );
        frameFormLayout.setVerticalGroup(
            frameFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameFormLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(frameFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(frameFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(scrollDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout frameFundoLayout = new javax.swing.GroupLayout(frameFundo);
        frameFundo.setLayout(frameFundoLayout);
        frameFundoLayout.setHorizontalGroup(
            frameFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(frameFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameFundoLayout.setVerticalGroup(
            frameFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameFundoLayout.createSequentialGroup()
                .addComponent(frameHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frameForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPrazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPrazoActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        String nome = inputNome.getText();
        String descricao = inputDescricao.getText();
        String prazo = inputPrazo.getText();
        String notas = inputNotas.getText();

        if (nome.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo 'nome' está vazio");
        } else if (prazo.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo 'prazo' está vazio");
        } else if (!inputPrazo.isValid()) {
            JOptionPane.showMessageDialog(rootPane, "Insira uma data válida no campo 'prazo'");
        } else {
            try {
                Task task = new Task();
                
                task.setIdProject(project.getId());
                task.setName(nome);
                task.setDescription(descricao);
                task.setNotes(notas);
                task.setIsCompleted(false);
                task.setCreatedAt(new Date());
                task.setUpdatedAt(new Date());

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date deadline = dateFormat.parse(prazo);

                task.setDeadline(deadline);

                controller.save(task);
                JOptionPane.showMessageDialog(rootPane, "Tarefa salva");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Um erro ocorreu");
            }
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewTaskScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTaskScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTaskScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTaskScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewTaskScreen dialog = new NewTaskScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel frameForm;
    private javax.swing.JPanel frameFundo;
    private javax.swing.JPanel frameHeader;
    private javax.swing.JTextArea inputDescricao;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextArea inputNotas;
    private javax.swing.JFormattedTextField inputPrazo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNotas;
    private javax.swing.JLabel labelPrazo;
    private javax.swing.JScrollPane scrollDescricao;
    private javax.swing.JScrollPane scrollNotas;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }

}
