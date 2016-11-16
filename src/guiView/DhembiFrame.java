
package guiView;

import buisnessLogic.AppException;
import buisnessLogic.Controller;
import buisnessLogic.DhembiInterface;
import buisnessLogic.DhembiRepository;
import database.Dhembi;
import database.Kontrolla;
import database.Pacienti;
import guiModel.DhembiModelTable;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class DhembiFrame extends javax.swing.JInternalFrame {
   DhembiModelTable dhembiModel=new DhembiModelTable();
   DhembiInterface interfaceDhembi=new DhembiRepository();
   Controller ct = new Controller();
   Kontrolla k;
    public DhembiFrame(Kontrolla k) {
        initComponents();
        tableLoad();
        tableMoveKey();
        this.k=k;
    }
    
    public void tableLoad(){
        
        List<Dhembi>listDhembi=interfaceDhembi.findAll( );
        dhembiModel.add(listDhembi);
        table.setModel(dhembiModel);
        dhembiModel.fireTableDataChanged(); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        semundjaField = new javax.swing.JTextField();
        komentField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nrDhembiField = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        jLabel3.setText("Koment");

        jLabel4.setText("Lloji i semundjes");

        semundjaField.setMaximumSize(new java.awt.Dimension(150, 20));
        semundjaField.setMinimumSize(new java.awt.Dimension(150, 20));
        semundjaField.setPreferredSize(new java.awt.Dimension(150, 20));

        komentField.setMaximumSize(new java.awt.Dimension(150, 20));
        komentField.setMinimumSize(new java.awt.Dimension(150, 20));
        komentField.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel1.setText("Nr Dhembit");

        nrDhembiField.setMaximumSize(new java.awt.Dimension(150, 20));
        nrDhembiField.setMinimumSize(new java.awt.Dimension(150, 20));
        nrDhembiField.setPreferredSize(new java.awt.Dimension(150, 20));

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        save.setMaximumSize(new java.awt.Dimension(53, 53));
        save.setMinimumSize(new java.awt.Dimension(53, 53));
        save.setPreferredSize(new java.awt.Dimension(53, 53));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        edit.setMaximumSize(new java.awt.Dimension(53, 53));
        edit.setMinimumSize(new java.awt.Dimension(53, 53));
        edit.setPreferredSize(new java.awt.Dimension(53, 53));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/delet.png"))); // NOI18N
        delete.setMaximumSize(new java.awt.Dimension(53, 53));
        delete.setMinimumSize(new java.awt.Dimension(53, 53));
        delete.setPreferredSize(new java.awt.Dimension(53, 53));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cncl.png"))); // NOI18N
        cancel.setMaximumSize(new java.awt.Dimension(53, 53));
        cancel.setMinimumSize(new java.awt.Dimension(53, 53));
        cancel.setPreferredSize(new java.awt.Dimension(53, 53));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(komentField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nrDhembiField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(25, 25, 25)
                            .addComponent(semundjaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nrDhembiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(komentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semundjaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
      try{
          Dhembi dh=new Dhembi();
             int nr_dhembi=Integer.parseInt(ct.nrDhembi(nrDhembiField.getText()));
      String koment= ct.zbrazet(komentField.getText(), "Koment");
       String ll_semundjes=ct.zbrazet(semundjaField.getText(),"Lloji semundjes");
       dh.setKoment(koment);
       dh.setLlojisemundjes(ll_semundjes);
       dh.setDhembiid(nr_dhembi);
       dh.setKontrollaid(k);
       interfaceDhembi.create(dh);
       tableLoad();
       clearFields();
      }
       catch (AppException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            return;
        }
       
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         int row=table.getSelectedRow();
        if(row!=-1){
            Dhembi dh=dhembiModel.getDhembi(row);
            interfaceDhembi.delete(dh);
            clearFields();
            tableLoad();

        }
        else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
         int row=table.getSelectedRow();
        if(row>-1){
             try{
          Dhembi dh=dhembiModel.getDhembi(row);
             int nr_dhembi=Integer.parseInt(ct.nrDhembi(nrDhembiField.getText()));
       String koment= ct.zbrazet(komentField.getText(), "Koment");
       String ll_semundjes=ct.zbrazet(semundjaField.getText(),"Lloji semundjes");
       dh.setKoment(koment);
       dh.setLlojisemundjes(ll_semundjes);
       dh.setDhembiid(nr_dhembi);
       dh.setKontrollaid(k);
       interfaceDhembi.edit(dh);
       tableLoad();
       clearFields();
      }
       catch (AppException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            return;
        }
        }
         else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te edituar!");
        }
        
    }//GEN-LAST:event_editActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        clearFields();
    }//GEN-LAST:event_cancelActionPerformed
    private void clearFields()
    {
        nrDhembiField.setText("");
       komentField.setText("");
       semundjaField.setText("");
         
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
                    Dhembi dh = dhembiModel.getDhembi(selectedIndex);
                    
                    nrDhembiField.setText(dh.getDhembiid()+"");
                    komentField.setText(dh.getKoment());
                    semundjaField.setText(dh.getLlojisemundjes());
                 

                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField komentField;
    private javax.swing.JTextField nrDhembiField;
    private javax.swing.JButton save;
    private javax.swing.JTextField semundjaField;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
