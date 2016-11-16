
package guiView;

import buisnessLogic.AppException;
import buisnessLogic.Controller;
import buisnessLogic.PunetoriInterface;
import buisnessLogic.PunetoriRepository;
import database.Pacienti;
import database.Punetori;
import guiModel.PunetoriModelTable;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PunetoriFrame extends javax.swing.JInternalFrame {
    PunetoriInterface punetoriInterface=new PunetoriRepository();
    PunetoriModelTable punetoriModel=new PunetoriModelTable();
    Controller ct = new Controller();
  private ButtonGroup genderGroup;
    public PunetoriFrame() {
        initComponents();
        tableLoad();  
        tableMoveKey();
        genderGroup=new ButtonGroup();
        maleRadio.setActionCommand("M");
        femaleRadio.setActionCommand("F");
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        maleRadio.setSelected(true);
    }
    public void tableLoad() {
        List<Punetori>listPunetori=punetoriInterface.findAll();
        punetoriModel.add(listPunetori);
        table.setModel(punetoriModel);
        punetoriModel.fireTableDataChanged(); 
    }
    
     private void tableMoveKey() {
         ListSelectionModel rowSM = table.getSelectionModel();
        
        rowSM.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting())
                    return; // if you don't want to handle intermediate selections
                ListSelectionModel rowSM = (ListSelectionModel)e.getSource();
                int selectedIndex = rowSM.getMinSelectionIndex();
                if(selectedIndex > -1){
                    Punetori p = punetoriModel.getPunetori(selectedIndex);
                    nrPersonalField.setText(p.getNrpersonal()+"");
                    emriField.setText(p.getEmri());
                    mbiemriField.setText(p.getMbiemri());
                    pozitaField.setText(p.getPozite());                  
                    if(p.getGjinia()=='M'){
                         genderGroup.add(maleRadio);
                         maleRadio.setSelected(true);
                         femaleRadio.setSelected(false);
                    }else{
                    genderGroup.add(femaleRadio);
                    femaleRadio.setSelected(true);
                    maleRadio.setSelected(false);
                    }

                }
            }
        });
     }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emriField = new javax.swing.JTextField();
        nrPersonalField = new javax.swing.JTextField();
        mbiemriField = new javax.swing.JTextField();
        pozitaField = new javax.swing.JTextField();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel2.setText("Emri");

        jLabel3.setText("Mbiemri");

        jLabel4.setText("Pozita");

        jLabel5.setText("Gjinia");

        emriField.setMaximumSize(new java.awt.Dimension(150, 20));
        emriField.setMinimumSize(new java.awt.Dimension(150, 20));
        emriField.setPreferredSize(new java.awt.Dimension(150, 20));

        nrPersonalField.setMaximumSize(new java.awt.Dimension(150, 20));
        nrPersonalField.setMinimumSize(new java.awt.Dimension(150, 20));
        nrPersonalField.setPreferredSize(new java.awt.Dimension(150, 20));
        nrPersonalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrPersonalFieldActionPerformed(evt);
            }
        });

        mbiemriField.setMaximumSize(new java.awt.Dimension(150, 2));
        mbiemriField.setMinimumSize(new java.awt.Dimension(150, 20));
        mbiemriField.setPreferredSize(new java.awt.Dimension(150, 20));
        mbiemriField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbiemriFieldActionPerformed(evt);
            }
        });

        pozitaField.setMaximumSize(new java.awt.Dimension(150, 20));
        pozitaField.setMinimumSize(new java.awt.Dimension(150, 20));
        pozitaField.setPreferredSize(new java.awt.Dimension(150, 20));

        maleRadio.setText("M");

        femaleRadio.setText("F");

        jLabel1.setText("Nr Personal");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(53, 53));
        jButton1.setMinimumSize(new java.awt.Dimension(53, 53));
        jButton1.setPreferredSize(new java.awt.Dimension(53, 53));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delet.png"))); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(53, 53));
        jButton2.setMinimumSize(new java.awt.Dimension(53, 53));
        jButton2.setPreferredSize(new java.awt.Dimension(53, 53));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(53, 53));
        jButton3.setMinimumSize(new java.awt.Dimension(53, 53));
        jButton3.setPreferredSize(new java.awt.Dimension(53, 53));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(maleRadio)
                        .addGap(18, 18, 18)
                        .addComponent(femaleRadio)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nrPersonalField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emriField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mbiemriField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pozitaField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nrPersonalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mbiemriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pozitaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nrPersonalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrPersonalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrPersonalFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            
        Punetori p=new Punetori();
        int nrPersonal=Integer.parseInt(ct.vetemNumra(nrPersonalField.getText(), "Nr Personal"));
        String emri=ct.vetemShkronja(emriField.getText(),"Emri");
        String mbiemri=ct.vetemShkronja(mbiemriField.getText(),"Mbiemri");
        String pozita=ct.vetemShkronja(pozitaField.getText(),"Pozita");
        String genderString=genderGroup.getSelection().getActionCommand();
        char gender=genderString.charAt(0);
        
        p.setNrpersonal(nrPersonal);
        p.setEmri(emri);
        p.setMbiemri(mbiemri);
        p.setPozite(pozita);
        p.setGjinia(gender);
        
        punetoriInterface.create(p);
        tableLoad();
        clearFields();
        }
         catch (AppException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row=table.getSelectedRow();
        if(row!=-1){
            Punetori p=punetoriModel.getPunetori(row);
            punetoriInterface.delete(p);
            tableLoad();
            clearFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row=table.getSelectedRow();
        if(row!=-1){
            try{
            
        Punetori p=punetoriModel.getPunetori(row);
        int nrPersonal=Integer.parseInt(ct.vetemNumra(nrPersonalField.getText(), "Nr Personal"));
        String emri=ct.vetemShkronja(emriField.getText(),"Emri");
        String mbiemri=ct.vetemShkronja(mbiemriField.getText(),"Mbiemri");
        String pozita=ct.vetemShkronja(pozitaField.getText(),"Pozita");
        String genderString=genderGroup.getSelection().getActionCommand();
        char gender=genderString.charAt(0);
        
        p.setNrpersonal(nrPersonal);
        p.setEmri(emri);
        p.setMbiemri(mbiemri);
        p.setPozite(pozita);
        p.setGjinia(gender);
        
        punetoriInterface.edit(p);
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        clearFields();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void mbiemriFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbiemriFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbiemriFieldActionPerformed

    public void clearFields(){
        nrPersonalField.setText("");
        emriField.setText("");
        mbiemriField.setText("");
        pozitaField.setText("");
        genderGroup.clearSelection();
        table.clearSelection();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField emriField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField mbiemriField;
    private javax.swing.JTextField nrPersonalField;
    private javax.swing.JTextField pozitaField;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

   

    
}
