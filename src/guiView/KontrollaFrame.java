
package guiView;

import buisnessLogic.AppException;
import buisnessLogic.Controller;
import buisnessLogic.KontrollaInterface;
import buisnessLogic.KontrollaRepository;
import buisnessLogic.PacientiInterface;
import buisnessLogic.PacientiRepository;
import buisnessLogic.PunetoriInterface;
import buisnessLogic.PunetoriRepository;
import database.Kontrolla;
import database.Pacienti;
import database.Punetori;
import guiModel.KontrollaModelTable;
import guiModel.PunetoriComboBoxModel;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import main.MainFrame;





public class KontrollaFrame extends javax.swing.JInternalFrame {
    
   KontrollaInterface kontrollaInterface=new KontrollaRepository();
   PacientiInterface pacientiInterface=new PacientiRepository();
   KontrollaModelTable kontrollaModel=new KontrollaModelTable();
   PunetoriInterface punetoriInterface = new PunetoriRepository();
   PunetoriComboBoxModel pcbm;
   Controller cr = new Controller();
   
    public KontrollaFrame() {
        initComponents();
        tableMoveKey();
        tableLoad();
        fillComBobox();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        OrdinancaPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("OrdinancaPU").createEntityManager();
        pacientiQuery = java.beans.Beans.isDesignTime() ? null : OrdinancaPUEntityManager.createQuery("SELECT p FROM Pacienti p");
        pacientiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pacientiQuery.getResultList();
        pacientiQuery1 = java.beans.Beans.isDesignTime() ? null : OrdinancaPUEntityManager.createQuery("SELECT p FROM Pacienti p");
        pacientiList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pacientiQuery1.getResultList();
        pacientiQuery2 = java.beans.Beans.isDesignTime() ? null : OrdinancaPUEntityManager.createQuery("SELECT p FROM Pacienti p");
        pacientiList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pacientiQuery2.getResultList();
        punetoriQuery = java.beans.Beans.isDesignTime() ? null : OrdinancaPUEntityManager.createQuery("SELECT p FROM Punetori p");
        punetoriList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : punetoriQuery.getResultList();
        kontrollaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mjekuBox = new javax.swing.JComboBox();
        nrPersonalField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        oraField = new javax.swing.JTextField();
        llojiField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CreateBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        dhembiPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout kontrollaPanelLayout = new javax.swing.GroupLayout(kontrollaPanel);
        kontrollaPanel.setLayout(kontrollaPanelLayout);
        kontrollaPanelLayout.setHorizontalGroup(
            kontrollaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kontrollaPanelLayout.setVerticalGroup(
            kontrollaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);

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

        jPanel1.setFocusable(false);

        dateField.setDateFormatString("yyyy-MM-dd");
        dateField.setMaximumSize(new java.awt.Dimension(150, 20));
        dateField.setMinimumSize(new java.awt.Dimension(150, 20));
        dateField.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel1.setText("Mjeku:");

        jLabel6.setText("Data e kontrolles:");

        mjekuBox.setMaximumSize(new java.awt.Dimension(150, 20));
        mjekuBox.setMinimumSize(new java.awt.Dimension(150, 20));
        mjekuBox.setPreferredSize(new java.awt.Dimension(150, 20));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, punetoriList, org.jdesktop.beansbinding.ObjectProperty.create(), mjekuBox, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        mjekuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mjekuBoxActionPerformed(evt);
            }
        });

        nrPersonalField.setAutoscrolls(false);
        nrPersonalField.setMaximumSize(new java.awt.Dimension(150, 20));
        nrPersonalField.setMinimumSize(new java.awt.Dimension(150, 20));
        nrPersonalField.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel4.setText("Nr Personal:");

        jLabel7.setText("Ora e kontrolles:");

        oraField.setMaximumSize(new java.awt.Dimension(150, 20));
        oraField.setMinimumSize(new java.awt.Dimension(150, 20));
        oraField.setPreferredSize(new java.awt.Dimension(150, 20));
        oraField.setVerifyInputWhenFocusTarget(false);

        llojiField.setMaximumSize(new java.awt.Dimension(150, 20));
        llojiField.setMinimumSize(new java.awt.Dimension(150, 20));
        llojiField.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel8.setText("Lloji i kontrolles:");

        CreateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        CreateBtn.setMaximumSize(new java.awt.Dimension(53, 53));
        CreateBtn.setMinimumSize(new java.awt.Dimension(53, 53));
        CreateBtn.setPreferredSize(new java.awt.Dimension(53, 53));
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(53, 53));
        jButton2.setMinimumSize(new java.awt.Dimension(53, 53));
        jButton2.setPreferredSize(new java.awt.Dimension(53, 53));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delet.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(53, 53));
        jButton3.setMinimumSize(new java.awt.Dimension(53, 53));
        jButton3.setPreferredSize(new java.awt.Dimension(53, 53));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cncl.png"))); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(53, 53));
        jButton4.setMinimumSize(new java.awt.Dimension(53, 53));
        jButton4.setPreferredSize(new java.awt.Dimension(53, 53));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dhembi.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(53, 53));
        jButton1.setMinimumSize(new java.awt.Dimension(53, 53));
        jButton1.setPreferredSize(new java.awt.Dimension(53, 53));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(llojiField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mjekuBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nrPersonalField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(oraField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nrPersonalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(oraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mjekuBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llojiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CreateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );

        javax.swing.GroupLayout dhembiPanelLayout = new javax.swing.GroupLayout(dhembiPanel);
        dhembiPanel.setLayout(dhembiPanelLayout);
        dhembiPanelLayout.setHorizontalGroup(
            dhembiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dhembiPanelLayout.setVerticalGroup(
            dhembiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dhembiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dhembiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
                    Kontrolla k = kontrollaModel.getKontrolla(selectedIndex);
                   
                    dateField.setDate(k.getDatakontrolles());
                    oraField.setText(k.getOrakontrolles());
                    llojiField.setText(k.getLlojikontrolles());
                    nrPersonalField.setText(k.getPacientiid().getNrpersonal()+"");
                    mjekuBox.setSelectedItem(k.getPunetoriid());
                    mjekuBox.repaint();
                    
                }
            }
        });
    }
    public void fillComBobox(){
      
        List<Punetori>listPunetori=punetoriInterface.findAll();
        pcbm= new PunetoriComboBoxModel(listPunetori);      
       mjekuBox.setModel(pcbm);
               
    }
    
    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
      try{
        Kontrolla k=new Kontrolla();
        k.setDatakontrolles(cr.data(dateField.getDate()));
        k.setOrakontrolles(cr.ora(oraField.getText()));
        k.setLlojikontrolles(cr.zbrazet(llojiField.getText(),"Lloji i Kontrolles"));
        k.setPacientiid(new Pacienti(Integer.parseInt(nrPersonalField.getText())));
        k.setPunetoriid((Punetori)mjekuBox.getSelectedItem());
        kontrollaInterface.create(k);
        tableLoad();
        clearFields();
      }
      catch (AppException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            return;
        }
        
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void mjekuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mjekuBoxActionPerformed
    }//GEN-LAST:event_mjekuBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int row=table.getSelectedRow();
        if(row!=-1){
            Kontrolla k=kontrollaModel.getKontrolla(row);
             DhembiFrame df = new DhembiFrame(k);
            dhembiPanel.add(df);
            df.show();

        }
        else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row=table.getSelectedRow();
        if(row!=-1){
             try{
        Kontrolla k=kontrollaModel.getKontrolla(row) ;
        k.setDatakontrolles(cr.data(dateField.getDate()));
        k.setPacientiid(new Pacienti(Integer.parseInt(cr.vetemNumra(nrPersonalField.getText(),"Nr Personal"))));
        k.setOrakontrolles(cr.ora(oraField.getText()));
        k.setLlojikontrolles(cr.zbrazet(llojiField.getText(),"Lloji i Kontrolles"));
        
        k.setPunetoriid((Punetori)mjekuBox.getSelectedItem());
        kontrollaInterface.edit(k);
        clearFields();
        tableLoad();
      }
      catch (AppException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }

        }
        else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te edituar!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int row=table.getSelectedRow();
        if(row!=-1){
            Kontrolla k=kontrollaModel.getKontrolla(row);
            kontrollaInterface.delete(k);
            clearFields();
            tableLoad();

        }
        else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void clearFields()
    {
        dateField.setDate(null);
        oraField.setText("");
        llojiField.setText("");
        nrPersonalField.setText("");
        mjekuBox.setSelectedItem(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateBtn;
    private javax.persistence.EntityManager OrdinancaPUEntityManager;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JPanel dhembiPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel kontrollaPanel;
    private javax.swing.JTextField llojiField;
    private javax.swing.JComboBox mjekuBox;
    private javax.swing.JTextField nrPersonalField;
    private javax.swing.JTextField oraField;
    private java.util.List<database.Pacienti> pacientiList;
    private java.util.List<database.Pacienti> pacientiList1;
    private java.util.List<database.Pacienti> pacientiList2;
    private javax.persistence.Query pacientiQuery;
    private javax.persistence.Query pacientiQuery1;
    private javax.persistence.Query pacientiQuery2;
    private java.util.List<database.Punetori> punetoriList;
    private javax.persistence.Query punetoriQuery;
    private javax.swing.JTable table;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public void tableLoad() {
        List<Kontrolla> listKontrolla=kontrollaInterface.findAll();
        kontrollaModel.add(listKontrolla);
        table.setModel(kontrollaModel);
        kontrollaModel.fireTableDataChanged();
    }
}
