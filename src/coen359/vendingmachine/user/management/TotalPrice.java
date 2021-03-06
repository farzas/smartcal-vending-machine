/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coen359.vendingmachine.user.management;

import coen359.vendingmachine.user.payment.CashPaymentGUI;
import coen359.vendingmachine.user.payment.SmartCardGUI;
import coen359.vendingmachine.user.product.TotalProduct;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BoxLayout;

/**
 *
 * @author DELL
 */
public class TotalPrice extends javax.swing.JPanel {

    /**
     * Creates new form TotalPrice
     */
    VendingMachineController vmController;
    String cost;
Boolean componentsAdded ;
    public TotalPrice(VendingMachineController vm) {
         this.vmController = vm;
        initComponents();
        jPanelSelectedProducts.setBackground(Color.WHITE);
                if (jPanelSelectedProducts.getComponentCount()>0){
       
        jPanelSelectedProducts.removeAll();
        textFieldtTotalPrice.setText("");
        jPanelSelectedProducts.revalidate();
        jPanelSelectedProducts.repaint();
        }
        
        Iterator<TotalProduct> itr = vmController.GetTotalPriceProduct().iterator();
        jPanelSelectedProducts.setBounds(61, 11, 81, 140);
        jPanelSelectedProducts.setLayout(new BoxLayout(jPanelSelectedProducts, BoxLayout.Y_AXIS));
        while (itr.hasNext()) {
            jPanelSelectedProducts.add(itr.next());
            componentsAdded= true;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelTotalDispay = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        textFieldtTotalPrice = new java.awt.TextField();
        label2 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelSelectedProducts = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCalculateTotal = new javax.swing.JButton();
        jComboPayMethod = new javax.swing.JComboBox();
        JButConfirm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Order Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1);
        jPanel1.setBounds(540, 10, 180, 40);

        jPanelTotalDispay.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTotalDispay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTotalDispay.setPreferredSize(new java.awt.Dimension(270, 50));

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("Total : ");

        textFieldtTotalPrice.setEditable(false);

        label2.setText("$");

        javax.swing.GroupLayout jPanelTotalDispayLayout = new javax.swing.GroupLayout(jPanelTotalDispay);
        jPanelTotalDispay.setLayout(jPanelTotalDispayLayout);
        jPanelTotalDispayLayout.setHorizontalGroup(
            jPanelTotalDispayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalDispayLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(textFieldtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanelTotalDispayLayout.setVerticalGroup(
            jPanelTotalDispayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalDispayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTotalDispayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTotalDispayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanelTotalDispay);
        jPanelTotalDispay.setBounds(650, 400, 320, 50);

        jPanelSelectedProducts.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSelectedProducts.setLayout(new javax.swing.BoxLayout(jPanelSelectedProducts, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(jPanelSelectedProducts);

        add(jScrollPane1);
        jScrollPane1.setBounds(650, 100, 316, 292);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Product Name");
        add(jLabel1);
        jLabel1.setBounds(710, 60, 90, 21);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Quantity");
        add(jLabel2);
        jLabel2.setBounds(840, 60, 80, 19);

        jButtonCalculateTotal.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCalculateTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCalculateTotal.setText("Proceed to CheckOut");
        jButtonCalculateTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculateTotalActionPerformed(evt);
            }
        });
        add(jButtonCalculateTotal);
        jButtonCalculateTotal.setBounds(710, 460, 190, 43);

        jComboPayMethod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboPayMethod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pay by Cash ", "Pay by SmartCard" }));
        jComboPayMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPayMethodActionPerformed(evt);
            }
        });
        add(jComboPayMethod);
        jComboPayMethod.setBounds(650, 520, 136, 43);

        JButConfirm.setBackground(new java.awt.Color(255, 255, 255));
        JButConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JButConfirm.setText("Confirm");
        JButConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButConfirmActionPerformed(evt);
            }
        });
        add(JButConfirm);
        JButConfirm.setBounds(840, 520, 136, 43);

        jPanel2.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coen359/vendingmachine/resources/Bestprice.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 250, 271);

        add(jPanel2);
        jPanel2.setBounds(110, 110, 250, 270);

        jButton2.setText("Cancel Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(1000, 40, 150, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coen359/vendingmachine/resources/blue-abstract-background-hd.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1290, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalculateTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculateTotalActionPerformed
//
//        jPanelTotalDispay.setVisible(true);
        cost = vmController.GetTotalPrice();
        textFieldtTotalPrice.setText(cost);
//        this.setCost(cost);
    }//GEN-LAST:event_jButtonCalculateTotalActionPerformed

    public String getCost() {
        return cost;
    }

    private void JButConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButConfirmActionPerformed

        if (((jComboPayMethod.getSelectedItem()).equals("Pay by SmartCard"))) {
            SmartCardGUI payBySmart = new SmartCardGUI(Double.parseDouble(this.getCost()), vmController.getTotalProd(), vmController.getMediator());
            Index.showPayBySmartCard(payBySmart);
            CardLayout cl = (CardLayout) (Index.getDynamicPanel().getLayout());
            cl.show(Index.getDynamicPanel(), Index.PAY_BY_SMART);
            payBySmart.setCost(Double.parseDouble(this.getCost()));
            System.out.println("Cost in VM GUI :" + this.getCost());
        } else {
            CashPaymentGUI cashPay = new CashPaymentGUI(Double.parseDouble(this.getCost()), vmController.getTotalProd(), vmController.getMediator());

            Index.showPayByCash(cashPay);
            CardLayout cl = (CardLayout) (Index.getDynamicPanel().getLayout());
            cl.show(Index.getDynamicPanel(), Index.PAY_BY_CASH);
            cashPay.setCost(Double.parseDouble(this.getCost()));
            System.out.println("Cost in VM GUI cash :" + this.getCost());
        }


    }//GEN-LAST:event_JButConfirmActionPerformed

    private void jComboPayMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPayMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPayMethodActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanelSelectedProducts.removeAll();
        textFieldtTotalPrice.setText("");
        jPanelSelectedProducts.revalidate();
        jPanelSelectedProducts.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButConfirm;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCalculateTotal;
    public javax.swing.JComboBox jComboPayMethod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelSelectedProducts;
    private javax.swing.JPanel jPanelTotalDispay;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextField textFieldtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
