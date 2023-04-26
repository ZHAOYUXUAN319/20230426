/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FudosanControllerLayer;

import javax.swing.*;

import FudosanBean.BukenBean;
import FudosanBean.HeyaBean;
import FudosanService.BukenService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hangt
 */
public class BukenYichiran extends javax.swing.JFrame {

    public BukenYichiran() {
        initComponents();
        //getlistInfo();
        // 获取前一个页面的类名
//        String previousPage = "";
//        if (getParent() instanceof JFrameTizuKara) {
//            previousPage = getParent().getClass().getSimpleName();
//        }
//
//        // 如果前一个页面是指定的页面，则执行特定程序
//        if (previousPage.equals("JFrameTizuKara")) {
//            // 执行特定程序
//            // ...
//            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
//            String address = "東京";
//            BukenService bukenService = new BukenService();
//            BukenBean bukenBean = new BukenBean();
//            //list.bukeheya(String.valueOf(bukenBean.getPropertyId()));
//            List<BukenBean> BukenListInfo = bukenService.toukyoubuken(address);
//            for (BukenBean c : BukenListInfo) {
//                df.addRow(new Object[]{c.getPropertyId(), c.getPropertyName(), c.getAddress(), c.getPropertyType(), c.getPropertyArea(), c.getPrice()});
//            }
//        }
//        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
//        String address = "東京";
//        BukenService bukenService = new BukenService();
//        BukenBean bukenBean = new BukenBean();
//        //list.bukeheya(String.valueOf(bukenBean.getPropertyId()));
//        List<BukenBean> BukenListInfo = bukenService.toukyoubuken(address);
//        for (BukenBean c : BukenListInfo) {
//            df.addRow(new Object[]{c.getPropertyId(), c.getPropertyName(), c.getAddress(), c.getPropertyType(), c.getPropertyArea(), c.getPrice()});
//        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("物件一覧画面");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "物件ID", "物件名", "物件住所", "物件タイプ", "物件面積", "物件金額"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("物件一覧");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FudosanBean/戻る.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("中身部屋");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel1.setText("賃料");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "上限範囲" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "上限範囲" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel5.setText("専有面積");

        jCheckBox2.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jCheckBox2.setText("二階以上");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "部屋ID", "所属物件ID", "部屋名", "階数", "家賃", "駅", "面積", "駅から距離"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(673, 673, 673))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jCheckBox2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getlistInfo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        new JFrameHome().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//jTable5
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        //データをクリアする
        model.setRowCount(0);
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();

        int row = jTable1.getSelectedRow();
        HeyaBean heyaBean = new HeyaBean();
        BukenBean bukenBean = new BukenBean();
        bukenBean.setPropertyId(Integer.parseInt(df.getValueAt(row, 0).toString()));
        BukenService list = new BukenService();
        DefaultTableModel dff = (DefaultTableModel) jTable2.getModel();
        //強制的に文字列に変更する
        List<HeyaBean> listinfo = list.bukeheya(String.valueOf(bukenBean.getPropertyId()));
        for (HeyaBean c : listinfo) {
            dff.addRow(new Object[]{c.getRoomId(), c.getSyozokuPropertyId(), c.getRoomName(), c.getRoomFloor(),
                c.getPrice(), c.getStation(), c.getRoomArea(), c.getMinutesFromStation()});
        }

    }//GEN-LAST:event_jButton5ActionPerformed


    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
//        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
//        df.setRowCount(0);
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("20000000");
        comboBox.addItem("40000000");
        comboBox.addItem("60000000");
        comboBox.addItem("80000000");
        comboBox.addItem("100000000");

// イベント リスナーを追加する(添加事件监听器)
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取当前选定的选项
                String selectedValue = (String) comboBox.getSelectedItem();

                // 打印选定的选项
                System.out.println("当前选定的选项是：" + selectedValue);
                BukenService bukenService = new BukenService();
                bukenService.kensaku(selectedValue);

                BukenService list = new BukenService();
                List<BukenBean> listinfo = list.kensaku(selectedValue);
                DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
                df.setRowCount(0);
                for (BukenBean c : listinfo) {
                    df.addRow(new Object[]{c.getPropertyId(), c.getPropertyName(), c.getAddress(), c.getPropertyType(), c.getPropertyArea(), c.getPrice()});
                }

            }
        });

// JComboBox デモ ウィンドウの作成(创建 JComboBox Demo 窗口)
        JFrame comboBoxDemoFrame = new JFrame("ComboBox Demo");
        comboBoxDemoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        comboBoxDemoFrame.getContentPane().add(comboBox);
        comboBoxDemoFrame.pack();
        comboBoxDemoFrame.setVisible(true);
// WindowListener リスナーを追加する(添加 WindowListener 监听器)
        comboBoxDemoFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }
        });
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("50");
        comboBox.addItem("100");
        comboBox.addItem("150");
        comboBox.addItem("200");
        comboBox.addItem("250");
        comboBox.addItem("300");

// イベント リスナーを追加する(添加事件监听器)
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取当前选定的选项
                String selectedValue = (String) comboBox.getSelectedItem();

                // 打印选定的选项
                System.out.println("当前选定的选项是：" + selectedValue);
                BukenService bukenService = new BukenService();
                bukenService.areakensaku(selectedValue);

                BukenService list = new BukenService();
                List<BukenBean> listinfo = list.areakensaku(selectedValue);
                DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
                df.setRowCount(0);
                for (BukenBean c : listinfo) {
                    df.addRow(new Object[]{c.getPropertyId(), c.getPropertyName(), c.getAddress(), c.getPropertyType(), c.getPropertyArea(), c.getPrice()});
                }

            }
        });

// JComboBox デモ ウィンドウの作成(创建 JComboBox Demo 窗口)
        JFrame comboBoxDemoFrame = new JFrame("ComboBox Demo");
        comboBoxDemoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        comboBoxDemoFrame.getContentPane().add(comboBox);
        comboBoxDemoFrame.pack();
        comboBoxDemoFrame.setVisible(true);
// WindowListener リスナーを追加する(添加 WindowListener 监听器)
        comboBoxDemoFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }
        });
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        bukennikaigetlistInfo();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(BukenYichiran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BukenYichiran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BukenYichiran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BukenYichiran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BukenYichiran().setVisible(true);
            }
        });
    }

    public void bukennikaigetlistInfo() {
        
        BukenService list = new BukenService();
        List<BukenBean> listinfo = list.bukenkaisukyakulistInfo();
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        df.setRowCount(0);
        for (BukenBean c : listinfo) {
            df.addRow(new Object[]{c.getPropertyId(), c.getPropertyName(), c.getAddress(), c.getPropertyType(), c.getPropertyArea(), c.getPrice()});
        }
    }

    public void getlistInfo() {

        BukenService list = new BukenService();
        List<BukenBean> listinfo = list.listInfo();
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        df.setRowCount(0);
        for (BukenBean c : listinfo) {
            df.addRow(new Object[]{c.getPropertyId(), c.getPropertyName(), c.getAddress(), c.getPropertyType(), c.getPropertyArea(), c.getPrice()});
        }
    }
//東京の物件
//    public void getlistInfotoukyou() {
//
//        BukenService list = new BukenService();
//        List<BukenBean> listinfo = list.listInfo();
//        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
//        df.setRowCount(0);
//        for (BukenBean c : listinfo) {
//            df.addRow(new Object[]{c.getPropertyId(), c.getPropertyName(), c.getAddress(), c.getPropertyType(), c.getPropertyArea(), c.getPrice()});
//        }
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
