/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coen359.vendingmachine.user.foodsuggestion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

/**
 *
 * @author DELL
 */
public class FoodSuggestionGUI extends javax.swing.JPanel {

    private FoodSuggestionController foodSuggestController;
    private JTable jTable1;
    DefaultListModel listModel = new DefaultListModel();

    /**
     * Creates new form FoodSuggestionGUI
     */
    public FoodSuggestionGUI() {
       // setVisible(true);
        initComponents();
        foodSuggestController = new FoodSuggestionController(this);
        addJTable();
        String image ="coen359\\\\vendingmachine\\\\resources\\\\search.png";
         ThumbnailIcon warnIcon = new ThumbnailIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource(image)), 100);
        jButSearch.setIcon(warnIcon);

//        Object[] options = {"Cancel"};
//        JOptionPane.showOptionDialog(this, jPanel1, "Payment", JOptionPane.PLAIN_MESSAGE,
//                JOptionPane.QUESTION_MESSAGE, null,
//                options,
//                options[0]);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFatsTo = new javax.swing.JTextField();
        JTextFatsFrom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextSugarto = new javax.swing.JTextField();
        jTextSuagrFrom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextCalTo = new javax.swing.JTextField();
        jTextCalFrom = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboType = new javax.swing.JComboBox();
        jButSearch = new javax.swing.JButton();
        jPanelDisplay = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextProdID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextProdName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1320, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Food Suggestion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Fats");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("To");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("From");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sugar");

        jTextSuagrFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSuagrFromActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Calories");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFatsTo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jTextSugarto, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(jTextCalTo, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCalFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(JTextFatsFrom)
                            .addComponent(jTextSuagrFrom))))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jTextFatsTo))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextSugarto)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(JTextFatsFrom)
                        .addGap(18, 18, 18)
                        .addComponent(jTextSuagrFrom)))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextCalTo)
                    .addComponent(jTextCalFrom))
                .addGap(5, 5, 5))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Type");

        jComboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Candy", "Sandwich", "Beverage" }));

        jButSearch.setText("Search");
        jButSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButSearch.setPreferredSize(new java.awt.Dimension(170, 150));
        jButSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelDisplay.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDisplay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDisplay.setPreferredSize(new java.awt.Dimension(1330, 480));

        javax.swing.GroupLayout jPanelDisplayLayout = new javax.swing.GroupLayout(jPanelDisplay);
        jPanelDisplay.setLayout(jPanelDisplayLayout);
        jPanelDisplayLayout.setHorizontalGroup(
            jPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelDisplayLayout.setVerticalGroup(
            jPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ID :");

        jTextProdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextProdIDActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Product Name :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextProdID)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jTextProdName))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 1272, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSearchActionPerformed
      
       Integer calto;
       Integer calFrom;
       Integer fatto;
       Integer fatfrom;
       Integer sugarto;
       Integer sugarFrom;
       if (getjTextCalTo().equals("")){
           calto=0;
       }else{
           calto=Integer.parseInt(getjTextCalTo());
       }
       
        if (getjTextCalFrom().equals("")){
           calFrom=1000;
       }else{
           calFrom=Integer.parseInt(getjTextCalFrom());
       }
        
        if (getjTextFatsTo().equals("")){
           fatto=0;
       }else{
           fatto=Integer.parseInt(getjTextFatsTo());
       }
        
        if (getJTextFatsFrom().equals("")){
           fatfrom=1000;
       }else{
           fatfrom=Integer.parseInt(getJTextFatsFrom());
       }
        
        if (getjTextSugarto().equals("")){
           sugarto=0;
       }else{
           sugarto=Integer.parseInt(getjTextSugarto());
       }
        
        if (getjTextSuagrFrom().equals("")){
           sugarFrom=1000;
       }else{
           sugarFrom=Integer.parseInt(getjTextSuagrFrom());
       }
        
        
        foodSuggestController.searchProdct(calto, calFrom, fatto,fatfrom,sugarto,sugarFrom, getjComboType(), getjTextProdID(), getjTextProdName());
        jTable1.setBackground(new Color(153, 204, 255));
       
        // add a ListSelectionListener to the table
        jTable1.getSelectionModel().addListSelectionListener(foodSuggestController);
        this.updateTable();
    }//GEN-LAST:event_jButSearchActionPerformed

    public void updateTable() {
    	jTable1.setModel(foodSuggestController.getTableModel());
    }
    private void jTextSuagrFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSuagrFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSuagrFromActionPerformed

    private void jTextProdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextProdIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextProdIDActionPerformed

    public String getJTextFatsFrom() {
        return JTextFatsFrom.getText();
    }

    public String getjComboType() {
        return (String) jComboType.getSelectedItem();
    }

    public String getjTextCalFrom() {
        return jTextCalFrom.getText();
    }

    public String getjTextCalTo() {
        return jTextCalTo.getText();
    }

    public String getjTextFatsTo() {
        return jTextFatsTo.getText();
    }

    public String getjTextProdID() {
        return jTextProdID.getText();
    }

    public String getjTextProdName() {
        return jTextProdName.getText();
    }

    public String getjTextSuagrFrom() {
        return jTextSuagrFrom.getText();
    }

    public String getjTextSugarto() {
        return jTextSugarto.getText();
    }

    public void addJTable() {

    		// add the data and column names to a JTable
        //jtable1  = new JTable(BudgetListTableController.getData(), BudgetListTableController.getColumnNames());
        //jTable2 = new JTable()
        jTable1 = new JTable(foodSuggestController.getTableModel());

        JCheckBox jcheck = new JCheckBox();
            //jTable1.setBackground(new Color(153,204,255));
        // add a ListSelectionListener to the table
        jTable1.getSelectionModel().addListSelectionListener(foodSuggestController);
        //jTable1.setDefaultRenderer(jTable1.getColumnClass(3), new MyImageCellRenderer());
        jTable1.setRowHeight(80);
        
        // add the table to a scrollpane
        JScrollPane scrollpane = new JScrollPane(jTable1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //
        
       
        scrollpane.setPreferredSize(getPreferredSize());
        
//        add(scrollpane).setBounds(10,30,250,350); 
//        scrollpane.setPreferredSize(getPreferredSize());
        // create a window
        jPanelDisplay.setLayout(new BorderLayout());
        jPanelDisplay.add(scrollpane, BorderLayout.CENTER);
        
         scrollpane.setPreferredSize(new Dimension(800, 400));
       // scrollpane.setPreferredSize(new Dimension(650, 300));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFatsFrom;
    private javax.swing.JButton jButSearch;
    private javax.swing.JComboBox jComboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelDisplay;
    private javax.swing.JTextField jTextCalFrom;
    private javax.swing.JTextField jTextCalTo;
    private javax.swing.JTextField jTextFatsTo;
    private javax.swing.JTextField jTextProdID;
    private javax.swing.JTextField jTextProdName;
    private javax.swing.JTextField jTextSuagrFrom;
    private javax.swing.JTextField jTextSugarto;
    // End of variables declaration//GEN-END:variables
}