
package guiView;

import buisnessLogic.AppException;
import buisnessLogic.Controller;
import buisnessLogic.TretmaniInterface;
import buisnessLogic.TretmaniRepository;
import database.Kontrolla;
import database.Pacienti;
import database.Tretmani;
import guiModel.TretmaniModelTable;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class TretmaniFrame extends javax.swing.JInternalFrame {

  TretmaniInterface tretmaniInterface=new TretmaniRepository();
  TretmaniModelTable tretmaniModel=new TretmaniModelTable();
  Controller ct = new Controller();
    public TretmaniFrame() {
        initComponents();
        tableLoad();
        tableMoveKey();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        OrdinancaPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("OrdinancaPU").createEntityManager();
        kontrollaQuery = java.beans.Beans.isDesignTime() ? null : OrdinancaPUEntityManager.createQuery("SELECT k FROM Kontrolla k");
        kontrollaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kontrollaQuery.getResultList();
        kontrollaQuery1 = java.beans.Beans.isDesignTime() ? null : OrdinancaPUEntityManager.createQuery("SELECT k FROM Kontrolla k");
        kontrollaList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kontrollaQuery1.getResultList();
        jLabel1 = new javax.swing.JLabel();
        cbmKontrolla = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tretmaniField = new javax.swing.JTextField();
        kohezgjatjaField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        createbtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("Kontrolla ID");

        cbmKontrolla.setMaximumSize(new java.awt.Dimension(150, 20));
        cbmKontrolla.setMinimumSize(new java.awt.Dimension(150, 20));
        cbmKontrolla.setPreferredSize(new java.awt.Dimension(150, 20));

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, kontrollaList1, cbmKontrolla);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabel2.setText("Lloji i tretmanit");

        jLabel3.setText("Kohezgjatja");

        tretmaniField.setMaximumSize(new java.awt.Dimension(150, 2));
        tretmaniField.setMinimumSize(new java.awt.Dimension(15, 20));
        tretmaniField.setPreferredSize(new java.awt.Dimension(150, 20));

        kohezgjatjaField.setMaximumSize(new java.awt.Dimension(150, 2));
        kohezgjatjaField.setMinimumSize(new java.awt.Dimension(15, 20));
        kohezgjatjaField.setPreferredSize(new java.awt.Dimension(150, 20));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(table);

        createbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        createbtn.setToolTipText("");
        createbtn.setMaximumSize(new java.awt.Dimension(53, 53));
        createbtn.setMinimumSize(new java.awt.Dimension(53, 53));
        createbtn.setPreferredSize(new java.awt.Dimension(53, 53));
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editBtn.setMaximumSize(new java.awt.Dimension(53, 53));
        editBtn.setMinimumSize(new java.awt.Dimension(53, 53));
        editBtn.setPreferredSize(new java.awt.Dimension(53, 53));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delet.png"))); // NOI18N
        deleteBtn.setMaximumSize(new java.awt.Dimension(53, 53));
        deleteBtn.setMinimumSize(new java.awt.Dimension(53, 53));
        deleteBtn.setPreferredSize(new java.awt.Dimension(53, 53));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cncl.png"))); // NOI18N
        cancelBtn.setMaximumSize(new java.awt.Dimension(53, 53));
        cancelBtn.setMinimumSize(new java.awt.Dimension(53, 53));
        cancelBtn.setPreferredSize(new java.awt.Dimension(53, 53));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tretmaniField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kohezgjatjaField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(cbmKontrolla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbmKontrolla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tretmaniField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(kohezgjatjaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
       try{
           
        Tretmani t=new Tretmani();
        t.setKontrollaID((Kontrolla)cbmKontrolla.getSelectedItem());
        t.setLlojitretmanit(ct.vetemShkronja(tretmaniField.getText(), "Lloji i tretmanit"));
        t.setKohezgjatja(ct.numraShkronja(kohezgjatjaField.getText(),"Kohezgjatja"));
        tretmaniInterface.create(t);
        tableLoad();
        clearFields();
       }
        catch (AppException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            
        }
        
        
        
    }//GEN-LAST:event_createbtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        
        int row=table.getSelectedRow();
        if(row>-1){
          try{
           
        Tretmani t=tretmaniModel.getTretmani(row);
        t.setKontrollaID((Kontrolla)cbmKontrolla.getSelectedItem());
        t.setLlojitretmanit(ct.vetemShkronja(tretmaniField.getText(), "Lloji i tretmanit"));
        t.setKohezgjatja(ct.numraShkronja(kohezgjatjaField.getText(),"Kohezgjatja"));
        tretmaniInterface.edit(t);
        tableLoad();
        clearFields();
       }
            catch (AppException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te edituar!");
        }
        
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int row=table.getSelectedRow();
        if(row>-1){
            Tretmani t=tretmaniModel.getTretmani(row);
            tretmaniInterface.delete(t);
            clearFields();
            tableLoad();
        }
         else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
            
        clearFields();
            
    }//GEN-LAST:event_cancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager OrdinancaPUEntityManager;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> cbmKontrolla;
    private javax.swing.JButton createbtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kohezgjatjaField;
    private java.util.List<database.Kontrolla> kontrollaList;
    private java.util.List<database.Kontrolla> kontrollaList1;
    private javax.persistence.Query kontrollaQuery;
    private javax.persistence.Query kontrollaQuery1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tretmaniField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public void tableLoad() {
        List<Tretmani>listTretmani=tretmaniInterface.findAll();
        tretmaniModel.add(listTretmani);
        table.setModel(tretmaniModel);
        tretmaniModel.fireTableDataChanged();
    }

    private void tableMoveKey(){
        ListSelectionModel rowSM = table.getSelectionModel();
        
        rowSM.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting())
                    return; // if you don't want to handle intermediate selections
                ListSelectionModel rowSM = (ListSelectionModel)e.getSource();
                int selectedIndex = rowSM.getMinSelectionIndex();
                if(selectedIndex > -1){
                    Tretmani t = tretmaniModel.getTretmani(selectedIndex);
                    
                    cbmKontrolla.setSelectedItem(t.getKontrollaID());
                    cbmKontrolla.repaint();
                    tretmaniField.setText(t.getLlojitretmanit());
                    kohezgjatjaField.setText(t.getKohezgjatja());
                    
                    
                 

                }
            }
        });
    }

    public void clearFields() {
        cbmKontrolla.setSelectedItem(null);
        tretmaniField.setText("");
        kohezgjatjaField.setText("");
    }
}
