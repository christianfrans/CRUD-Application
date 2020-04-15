/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapp.Frame;

import crudapp.Controller.OutcomingController;
import crudapp.Helper.Helper;
import crudapp.Logic.Logic;
import crudapp.Model.MainModel;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class Outcoming extends javax.swing.JFrame {
	
	MainModel model = new MainModel();
	Logic logic = new Logic();
	OutcomingController controller = new OutcomingController();
	public String outcome_id;
	Helper helper = new Helper();
	ResultSet rs;
	
	/**
	 * Creates new form Outcoming
	 */
	public Outcoming() {
		initComponents();
		getAllData();
		refresh();
		label_income.setVisible(false);
		jLabel7.setVisible(false);
	}
	
	public void search(String type, String query) {
		try {
			if (query.isEmpty()) {
				this.rs = controller.get();
			} else if (type.equals("id") && !query.isEmpty()) {
				this.rs = controller.showById(query);
			} else if (type.equals("product_id") && !query.isEmpty()) {
				this.rs = controller.showByProductID(query);
			}

			loadTable(this.rs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void refresh(){
		clear();
		tf_name.setEnabled(true);
		dp_outcome.setEnabled(true);
	}

	public void getAllData() {
		this.rs = controller.get();
		loadTable(this.rs);
	}

	public void loadTable(ResultSet rs) {
		tb_outcoming.setModel(DbUtils.resultSetToTableModel(rs));
	}

	public void clear() {
		tf_name.setText("");
		tf_goods.setText("");
		tf_address.setText("");
		dp_outcome.setDate(null);
		tf_total.setText("");
		label_income.setText("");

		btn_update.setEnabled(false);
	}


	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_goods = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_outcoming = new javax.swing.JTable();
        tf_total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        btn_searchID = new javax.swing.JButton();
        dp_outcome = new org.jdesktop.swingx.JXDatePicker();
        btn_searchName = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        label_income = new javax.swing.JLabel();
        btn_switch = new javax.swing.JButton();
        tf_address = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Total Pemasukan");

        tb_outcoming.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_outcoming.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_outcomingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_outcoming);

        tf_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_totalActionPerformed(evt);
            }
        });

        jLabel8.setText("Pencarian");

        btn_searchID.setText("Cari dengan Nama");
        btn_searchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchIDActionPerformed(evt);
            }
        });

        btn_searchName.setText("Cari dengan ID");
        btn_searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Outcoming");

        jLabel2.setText("Nama");

        jLabel3.setText("ID Barang");

        jLabel4.setText("Alamat Pengiriman");

        jLabel5.setText("Tanggal Keluar");

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jLabel6.setText("Total Barang Keluar");

        label_income.setText("-");

        btn_switch.setText("Pindah ke Incoming");
        btn_switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_switchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(btn_switch))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_goods, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label_income)
                                        .addComponent(dp_outcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(tf_total, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_submit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_searchID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_searchName)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tf_goods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(dp_outcome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(label_income))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_submit)
                    .addComponent(btn_update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_switch)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchID)
                    .addComponent(btn_searchName))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_totalActionPerformed

    private void btn_switchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_switchActionPerformed
        // TODO add your handling code here:
		Incoming incoming = new Incoming();
			this.setVisible(false);
			incoming.setVisible(true);
			dispose();
    }//GEN-LAST:event_btn_switchActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
		try {
			String name = tf_name.getText();
			String product_id = tf_goods.getText();
			String address = tf_address.getText();
			Date date = dp_outcome.getDate();
			String stock_outcome = tf_total.getText();
			String income = label_income.getText();

			model.setOutcome_name(name);
			model.setProduct_id(product_id);
			model.setAddress(address);
			model.setTotal(stock_outcome);
			model.setOutcoming(date);
			model.setIncome(income);			

			boolean result = controller.input(model);
			Boolean check_name = logic.checkName(name);
			if (result) {
					JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Data");
					refresh();
			} else {
				JOptionPane.showMessageDialog(null, "Gagal Menambahkan Data");
			}
			getAllData();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
		try {
			String name = tf_name.getText();
			String product_id = tf_goods.getText();
			String address = tf_address.getText();
			Date date = dp_outcome.getDate();
			String stock_outcome = tf_total.getText();
			String income = label_income.getText();

			model.setOutcome_name(name);
			model.setProduct_id(product_id);
			model.setAddress(address);
			model.setTotal(stock_outcome);
			model.setOutcoming(date);
			model.setIncome(income);	

			boolean result = controller.update(outcome_id, model);
			if (result) {
				JOptionPane.showMessageDialog(null, "Berhasil Mengubah Data");
			} else {
				JOptionPane.showMessageDialog(null, "Gagal Mengubah Data");
			}
			refresh();
			getAllData();
			dp_outcome.setEnabled(true); //SETELAH KLIK BUTTON UPDATE BARU DP_INCOME BISA DIGUNAKAN KEMBALI

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tb_outcomingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_outcomingMouseClicked
        // TODO add your handling code here:
		try {
			String id = helper.getValueRows(tb_outcoming, 0);
			String name = helper.getValueRows(tb_outcoming, 1);
			String product_id = helper.getValueRows(tb_outcoming, 2);
			String address = helper.getValueRows(tb_outcoming, 3);
			String total = helper.getValueRows(tb_outcoming, 4);
			String outcoming = helper.getValueRows(tb_outcoming, 5);
			
			btn_update.setEnabled(true);

			this.outcome_id = id;
			tf_name.setText(name);
			tf_goods.setText(product_id);
			tf_address.setText(address);
			tf_total.setText(total);
			dp_outcome.setDate(helper.parseStringToDatePickerFormat(outcoming));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }//GEN-LAST:event_tb_outcomingMouseClicked

    private void btn_searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchNameActionPerformed
        // TODO add your handling code here:
		search("name", tf_search.getText());
    }//GEN-LAST:event_btn_searchNameActionPerformed

    private void btn_searchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchIDActionPerformed
        // TODO add your handling code here:
		search("id", tf_search.getText());
    }//GEN-LAST:event_btn_searchIDActionPerformed

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
			java.util.logging.Logger.getLogger(Outcoming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Outcoming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Outcoming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Outcoming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Outcoming().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_searchID;
    private javax.swing.JButton btn_searchName;
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton btn_switch;
    private javax.swing.JButton btn_update;
    private org.jdesktop.swingx.JXDatePicker dp_outcome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_income;
    private javax.swing.JTable tb_outcoming;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_goods;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_total;
    // End of variables declaration//GEN-END:variables
}
