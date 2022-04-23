package view;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author adriel
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        decorateTableTask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameNenhumaTarefa = new javax.swing.JPanel();
        iconeSemTarefas = new javax.swing.JLabel();
        labelNenhumaTarefa = new javax.swing.JLabel();
        labelCliqueMais = new javax.swing.JLabel();
        frameFundo = new javax.swing.JPanel();
        frameHeader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        frameProjetos = new javax.swing.JPanel();
        frameHeaderProjetos = new javax.swing.JPanel();
        labelProjetos = new javax.swing.JLabel();
        btnNovoProjeto = new javax.swing.JButton();
        scrollProjetos = new javax.swing.JScrollPane();
        listaProjetos = new javax.swing.JList<>();
        frameTarefas = new javax.swing.JPanel();
        frameHeaderTarefas = new javax.swing.JPanel();
        labelTarefas = new javax.swing.JLabel();
        btnNovaTarefa = new javax.swing.JButton();
        scrollTarefas = new javax.swing.JScrollPane();
        tabelaTarefas = new javax.swing.JTable();

        frameNenhumaTarefa.setBackground(new java.awt.Color(255, 255, 255));

        iconeSemTarefas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeSemTarefas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check-square.png"))); // NOI18N

        labelNenhumaTarefa.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        labelNenhumaTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNenhumaTarefa.setText("Nenhuma tarefa por aqui...");

        labelCliqueMais.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        labelCliqueMais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliqueMais.setText("Clique em + para adicionar uma tarefa");

        javax.swing.GroupLayout frameNenhumaTarefaLayout = new javax.swing.GroupLayout(frameNenhumaTarefa);
        frameNenhumaTarefa.setLayout(frameNenhumaTarefaLayout);
        frameNenhumaTarefaLayout.setHorizontalGroup(
            frameNenhumaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconeSemTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelNenhumaTarefa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
            .addComponent(labelCliqueMais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameNenhumaTarefaLayout.setVerticalGroup(
            frameNenhumaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameNenhumaTarefaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(iconeSemTarefas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNenhumaTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCliqueMais)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TO DO");
        setBackground(new java.awt.Color(223, 230, 233));
        setMinimumSize(new java.awt.Dimension(630, 410));

        frameFundo.setBackground(new java.awt.Color(223, 230, 233));

        frameHeader.setBackground(new java.awt.Color(108, 92, 231));

        labelTitulo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("TO DO");

        javax.swing.GroupLayout frameHeaderLayout = new javax.swing.GroupLayout(frameHeader);
        frameHeader.setLayout(frameHeaderLayout);
        frameHeaderLayout.setHorizontalGroup(
            frameHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameHeaderLayout.setVerticalGroup(
            frameHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHeaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelTitulo)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        frameProjetos.setBackground(new java.awt.Color(255, 255, 255));

        frameHeaderProjetos.setBackground(new java.awt.Color(255, 255, 255));

        labelProjetos.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelProjetos.setText("PROJETOS");

        btnNovoProjeto.setBackground(new java.awt.Color(108, 92, 231));
        btnNovoProjeto.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnNovoProjeto.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus-square.png"))); // NOI18N
        btnNovoProjeto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoProjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoProjetoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovoProjetoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovoProjetoMouseEntered(evt);
            }
        });
        btnNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameHeaderProjetosLayout = new javax.swing.GroupLayout(frameHeaderProjetos);
        frameHeaderProjetos.setLayout(frameHeaderProjetosLayout);
        frameHeaderProjetosLayout.setHorizontalGroup(
            frameHeaderProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHeaderProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        frameHeaderProjetosLayout.setVerticalGroup(
            frameHeaderProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHeaderProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameHeaderProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        listaProjetos.setBorder(null);
        listaProjetos.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        listaProjetos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaProjetos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaProjetos.setFixedCellHeight(30);
        listaProjetos.setSelectionBackground(new java.awt.Color(108, 92, 231));
        listaProjetos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollProjetos.setViewportView(listaProjetos);

        javax.swing.GroupLayout frameProjetosLayout = new javax.swing.GroupLayout(frameProjetos);
        frameProjetos.setLayout(frameProjetosLayout);
        frameProjetosLayout.setHorizontalGroup(
            frameProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameHeaderProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollProjetos)
                .addContainerGap())
        );
        frameProjetosLayout.setVerticalGroup(
            frameProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameProjetosLayout.createSequentialGroup()
                .addComponent(frameHeaderProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollProjetos)
                .addContainerGap())
        );

        frameTarefas.setBackground(new java.awt.Color(255, 255, 255));

        frameHeaderTarefas.setBackground(java.awt.Color.white);

        labelTarefas.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelTarefas.setText("TAREFAS");
        labelTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelTarefasMouseEntered(evt);
            }
        });

        btnNovaTarefa.setBackground(new java.awt.Color(108, 92, 231));
        btnNovaTarefa.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnNovaTarefa.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus-square.png"))); // NOI18N
        btnNovaTarefa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaTarefa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovaTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovaTarefaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovaTarefaMouseEntered(evt);
            }
        });
        btnNovaTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaTarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameHeaderTarefasLayout = new javax.swing.GroupLayout(frameHeaderTarefas);
        frameHeaderTarefas.setLayout(frameHeaderTarefasLayout);
        frameHeaderTarefasLayout.setHorizontalGroup(
            frameHeaderTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHeaderTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        frameHeaderTarefasLayout.setVerticalGroup(
            frameHeaderTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameHeaderTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameHeaderTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        scrollTarefas.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        tabelaTarefas.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        tabelaTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descricao", "Prazo", "Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaTarefas.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaTarefas.setInheritsPopupMenu(true);
        tabelaTarefas.setRowHeight(40);
        tabelaTarefas.setSelectionBackground(new java.awt.Color(108, 92, 231));
        tabelaTarefas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollTarefas.setViewportView(tabelaTarefas);

        javax.swing.GroupLayout frameTarefasLayout = new javax.swing.GroupLayout(frameTarefas);
        frameTarefas.setLayout(frameTarefasLayout);
        frameTarefasLayout.setHorizontalGroup(
            frameTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameHeaderTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(frameTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTarefas)
                .addContainerGap())
        );
        frameTarefasLayout.setVerticalGroup(
            frameTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameTarefasLayout.createSequentialGroup()
                .addComponent(frameHeaderTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTarefas)
                .addContainerGap())
        );

        javax.swing.GroupLayout frameFundoLayout = new javax.swing.GroupLayout(frameFundo);
        frameFundo.setLayout(frameFundoLayout);
        frameFundoLayout.setHorizontalGroup(
            frameFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(frameFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameFundoLayout.setVerticalGroup(
            frameFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameFundoLayout.createSequentialGroup()
                .addComponent(frameHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frameProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frameTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void btnNovaTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovaTarefaActionPerformed

    private void btnNovaTarefaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaTarefaMouseEntered
        btnNovaTarefa.setBackground(new Color(162, 155, 254));
    }//GEN-LAST:event_btnNovaTarefaMouseEntered

    private void btnNovoProjetoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProjetoMouseEntered
        btnNovoProjeto.setBackground(new Color(162, 155, 254));
    }//GEN-LAST:event_btnNovoProjetoMouseEntered

    private void btnNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoProjetoActionPerformed

    private void btnNovoProjetoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProjetoMouseExited
        btnNovoProjeto.setBackground(new Color(108, 92, 231));
    }//GEN-LAST:event_btnNovoProjetoMouseExited

    private void labelTarefasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTarefasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelTarefasMouseEntered

    private void btnNovaTarefaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaTarefaMouseExited
        btnNovaTarefa.setBackground(new Color(108, 92, 231));
    }//GEN-LAST:event_btnNovaTarefaMouseExited

    private void btnNovoProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProjetoMouseClicked
        NewProjectScreen newProjectScreen = new NewProjectScreen(this, rootPaneCheckingEnabled);
        newProjectScreen.setVisible(true);
    }//GEN-LAST:event_btnNovoProjetoMouseClicked

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovaTarefa;
    private javax.swing.JButton btnNovoProjeto;
    private javax.swing.JPanel frameFundo;
    private javax.swing.JPanel frameHeader;
    private javax.swing.JPanel frameHeaderProjetos;
    private javax.swing.JPanel frameHeaderTarefas;
    private javax.swing.JPanel frameNenhumaTarefa;
    private javax.swing.JPanel frameProjetos;
    private javax.swing.JPanel frameTarefas;
    private javax.swing.JLabel iconeSemTarefas;
    private javax.swing.JLabel labelCliqueMais;
    private javax.swing.JLabel labelNenhumaTarefa;
    private javax.swing.JLabel labelProjetos;
    private javax.swing.JLabel labelTarefas;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaProjetos;
    private javax.swing.JScrollPane scrollProjetos;
    private javax.swing.JScrollPane scrollTarefas;
    private javax.swing.JTable tabelaTarefas;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTask() {
        tabelaTarefas.getTableHeader().setFont(new Font("Ubuntu", Font.BOLD, 14));
        tabelaTarefas.getTableHeader().setBackground(new Color(108,92,231));
        tabelaTarefas.getTableHeader().setForeground(new Color(255, 255, 255));
        tabelaTarefas.setAutoCreateRowSorter(true);
    }
}
