/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author welcome
 */
public class Main extends javax.swing.JFrame {

    private final ListWord LW; // doi tuong chua tat ca du lieu
    TextToSpeech tts = new TextToSpeech();
    public void wordListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_wordListValueChanged

    }//GEN-LAST:event_wordListValueChanged

    public Main() {

        initComponents();

        jEditorExplant.setContentType("text/html");

        LW = new ListWord();

        try {
            LW.insertFromFile();// ham  doc du lieu tu file txt
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultListModel listModel = new DefaultListModel();//bang de set cho Jlist
        for (Word word : LW.words) {
            listModel.addElement(word.getWord_target());// add cac gia tri vao bang Jlist
        }
        jListWords.setModel(listModel); // tao bang cac tu 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListWords = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorExplant = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        addWordButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        voiceButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        txtInputWord = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jListWords.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListWords.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListWordsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListWords);

        jScrollPane1.setViewportView(jEditorExplant);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Nghĩa của từ là ");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        addWordButton.setIcon(new javax.swing.ImageIcon("F:\\Subject-PTIT\\JavaLibrary1\\image\\addWord.png")); // NOI18N
        addWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWordButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon("F:\\Subject-PTIT\\JavaLibrary1\\image\\delete.png")); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        voiceButton.setIcon(new javax.swing.ImageIcon("F:\\Subject-PTIT\\JavaLibrary1\\image\\voice.png")); // NOI18N
        voiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voiceButtonActionPerformed(evt);
            }
        });

        modifyButton.setIcon(new javax.swing.ImageIcon("F:\\Subject-PTIT\\JavaLibrary1\\image\\writing.png")); // NOI18N
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(addWordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deleteButton))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(voiceButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modifyButton)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteButton)
                            .addComponent(addWordButton))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(voiceButton)
                            .addComponent(modifyButton))))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        txtInputWord.setBackground(new java.awt.Color(255, 204, 204));
        txtInputWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputWordActionPerformed(evt);
            }
        });
        txtInputWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputWordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtInputWord, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(txtInputWord, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListWordsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListWordsValueChanged
        int index = jListWords.getSelectedIndex();

        if (index != -1) {
            jEditorExplant.setContentType("text/html");
            jEditorExplant.setText(LW.words.get(index).getWord_explain());
            jEditorExplant.setCaretPosition(0);
        }
    }//GEN-LAST:event_jListWordsValueChanged

    private void txtInputWordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputWordKeyReleased
        int index = LW.preBinarySearch(txtInputWord.getText());
        jListWords.setSelectedIndex(index);
        jListWords.ensureIndexIsVisible(index); // tu dong keo thanh cuon xuong
    }//GEN-LAST:event_txtInputWordKeyReleased

    private void txtInputWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputWordActionPerformed

    }//GEN-LAST:event_txtInputWordActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultListModel mod = (DefaultListModel) jListWords.getModel();

        int index = jListWords.getSelectedIndex();
        if (index != -1) {
            LW.removeWord(index);
            mod.remove(index);
            jEditorExplant.setContentType("text");
            jEditorExplant.setText("");
            jEditorExplant.setContentType("text/html");
            JOptionPane.showMessageDialog(null, "Xoá từ thành công", "Delete Word!", JOptionPane.NO_OPTION);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void voiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voiceButtonActionPerformed
        int index = jListWords.getSelectedIndex();
        if (index == -1) {
            return;
        }
        String tar = jListWords.getSelectedValue();
        tts.speakText(tar);
    }//GEN-LAST:event_voiceButtonActionPerformed

    private void addWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWordButtonActionPerformed
        AddWord addWord = new AddWord(LW, jListWords);
        addWord.setVisible(true);
    }//GEN-LAST:event_addWordButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
         int index = jListWords.getSelectedIndex();
        if (index < 0 ) {
            return;
        }
        ModifyWord modifyWord = new ModifyWord(LW,index,jEditorExplant);
        modifyWord.setVisible(true);
    }//GEN-LAST:event_modifyButtonActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //*************************************************************
        // Bắt đầu code ở đây //

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addWordButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JEditorPane jEditorExplant;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListWords;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField txtInputWord;
    private javax.swing.JButton voiceButton;
    // End of variables declaration//GEN-END:variables
}
