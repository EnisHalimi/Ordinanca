
package guiView;

import buisnessLogic.AppException;
import buisnessLogic.PacientiInterface;
import buisnessLogic.PacientiRepository;
import database.Pacienti;
import guiModel.PacientiModelTable;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import buisnessLogic.Controller;

public class PacientiFrame extends javax.swing.JInternalFrame {
        
    PacientiInterface pacientiInterface=new PacientiRepository();
    
    PacientiModelTable pacientiModel=new PacientiModelTable();
    private ButtonGroup genderGroup;

    Controller ct = new Controller();
    public PacientiFrame() {
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
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        nr_personalField = new javax.swing.JTextField();
        emriField = new javax.swing.JTextField();
        emriPrinditField = new javax.swing.JTextField();
        mbiemriField = new javax.swing.JTextField();
        dateField = new com.toedter.calendar.JDateChooser();
        vendlindjaField = new javax.swing.JTextField();
        vendbanimiField = new javax.swing.JTextField();
        komunaField = new javax.swing.JTextField();
        adresaField = new javax.swing.JTextField();
        kontaktiFrame = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        table.setGridColor(new java.awt.Color(63, 63, 63));
        jScrollPane1.setViewportView(table);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(63, 63, 63));
        jLabel1.setText("Nr_Personal:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(63, 63, 63));
        jLabel2.setText("Emri:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(63, 63, 63));
        jLabel3.setText("Emri i prindit:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(63, 63, 63));
        jLabel6.setText("Data e lindjes:");
        jLabel6.setMaximumSize(new java.awt.Dimension(70, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(70, 15));
        jLabel6.setPreferredSize(new java.awt.Dimension(70, 15));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(63, 63, 63));
        jLabel7.setText("Vendlindja:");

        maleRadio.setBackground(new java.awt.Color(255, 255, 255));
        maleRadio.setForeground(new java.awt.Color(63, 63, 63));
        maleRadio.setText("M");
        maleRadio.setBorder(null);
        maleRadio.setPreferredSize(new java.awt.Dimension(35, 24));
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        femaleRadio.setBackground(new java.awt.Color(255, 255, 255));
        femaleRadio.setForeground(new java.awt.Color(63, 63, 63));
        femaleRadio.setText("F");
        femaleRadio.setPreferredSize(new java.awt.Dimension(31, 24));
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(63, 63, 63));
        jLabel8.setText("Adresa:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(63, 63, 63));
        jLabel5.setText("Gjinia:");
        jLabel5.setMaximumSize(new java.awt.Dimension(70, 15));
        jLabel5.setMinimumSize(new java.awt.Dimension(70, 15));
        jLabel5.setPreferredSize(new java.awt.Dimension(70, 15));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(63, 63, 63));
        jLabel9.setText("Komuna:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(63, 63, 63));
        jLabel10.setText("Mbiemri:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(63, 63, 63));
        jLabel4.setText("Vendbanimi:");

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addButton.setBorder(null);
        addButton.setMaximumSize(new java.awt.Dimension(53, 53));
        addButton.setMinimumSize(new java.awt.Dimension(53, 53));
        addButton.setPreferredSize(new java.awt.Dimension(53, 53));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delet.png"))); // NOI18N
        deleteButton.setBorder(null);
        deleteButton.setMaximumSize(new java.awt.Dimension(53, 53));
        deleteButton.setMinimumSize(new java.awt.Dimension(53, 53));
        deleteButton.setPreferredSize(new java.awt.Dimension(53, 53));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editButton.setBorder(null);
        editButton.setMaximumSize(new java.awt.Dimension(53, 53));
        editButton.setMinimumSize(new java.awt.Dimension(53, 53));
        editButton.setPreferredSize(new java.awt.Dimension(53, 53));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cncl.png"))); // NOI18N
        cancelButton.setBorder(null);
        cancelButton.setMaximumSize(new java.awt.Dimension(53, 53));
        cancelButton.setMinimumSize(new java.awt.Dimension(53, 53));
        cancelButton.setPreferredSize(new java.awt.Dimension(53, 53));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        nr_personalField.setMaximumSize(new java.awt.Dimension(150, 20));
        nr_personalField.setPreferredSize(new java.awt.Dimension(150, 20));

        emriField.setMaximumSize(new java.awt.Dimension(150, 20));
        emriField.setPreferredSize(new java.awt.Dimension(150, 20));
        emriField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emriFieldActionPerformed(evt);
            }
        });

        emriPrinditField.setMaximumSize(new java.awt.Dimension(150, 20));
        emriPrinditField.setPreferredSize(new java.awt.Dimension(150, 20));

        mbiemriField.setMaximumSize(new java.awt.Dimension(150, 20));
        mbiemriField.setPreferredSize(new java.awt.Dimension(150, 20));

        dateField.setMaximumSize(new java.awt.Dimension(150, 20));
        dateField.setPreferredSize(new java.awt.Dimension(150, 20));

        vendlindjaField.setMaximumSize(new java.awt.Dimension(150, 20));
        vendlindjaField.setPreferredSize(new java.awt.Dimension(150, 20));

        vendbanimiField.setMaximumSize(new java.awt.Dimension(150, 20));
        vendbanimiField.setPreferredSize(new java.awt.Dimension(150, 20));

        komunaField.setMaximumSize(new java.awt.Dimension(150, 20));
        komunaField.setPreferredSize(new java.awt.Dimension(150, 20));

        adresaField.setMaximumSize(new java.awt.Dimension(150, 20));
        adresaField.setPreferredSize(new java.awt.Dimension(150, 20));

        kontaktiFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/kontakti.png"))); // NOI18N
        kontaktiFrame.setMaximumSize(new java.awt.Dimension(53, 53));
        kontaktiFrame.setMinimumSize(new java.awt.Dimension(53, 53));
        kontaktiFrame.setPreferredSize(new java.awt.Dimension(53, 53));
        kontaktiFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontaktiFrameActionPerformed(evt);
            }
        });

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendbanimiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nr_personalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emriPrinditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mbiemriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vendlindjaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(komunaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adresaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kontaktiFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nr_personalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emriPrinditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mbiemriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(femaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(vendlindjaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vendbanimiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(komunaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kontaktiFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(11, 11, 11))
        );

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        clearFields();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int row=table.getSelectedRow();
        if(row!=-1){
            Pacienti p=pacientiModel.getPacienti(row);
            try {
          
          int nr_personal=Integer.parseInt(ct.vetemNumra(nr_personalField.getText(),"Numri Personal"));
          String emri=ct.vetemShkronja(emriField.getText(),"Emri");
          String emri_prindit=ct.vetemShkronja(emriPrinditField.getText(),"Emri i Prindit");
          String g=genderGroup.getSelection().getActionCommand();
          char gjinia=g.charAt(0);
          p.setNrpersonal(nr_personal);
          p.setEmri(emri);
          p.setMbiemri(ct.vetemShkronja(mbiemriField.getText(), "Mbiemri"));
          p.setEmriprindit(emri_prindit);

          p.setDatalindjes(ct.data(dateField.getDate()));
          p.setVendbanimi(ct.vetemShkronja(vendbanimiField.getText(),"Vendbanimi"));
          p.setVendlindja(ct.vetemShkronja(vendlindjaField.getText(),"Vendlindja"));
          String komuna=ct.vetemShkronja(komunaField.getText(), "Komuna");
          String adresa=ct.numraShkronja(adresaField.getText(),"Adresa");
          p.setAdresa(adresa);
          p.setGjinia(gjinia);
          p.setKomuna(komuna);
          pacientiInterface.edit(p);
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

    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row=table.getSelectedRow();
        if(row!=-1){
            Pacienti p=pacientiModel.getPacienti(row);
            pacientiInterface.delete(p);
            clearFields();
            tableLoad();

        }
        else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
          Pacienti p=new Pacienti();
          int nr_personal=Integer.parseInt(ct.vetemNumra(nr_personalField.getText(),"Numri Personal"));
          String emri=ct.vetemShkronja(emriField.getText(),"Emri");
          String emri_prindit=ct.vetemShkronja(emriPrinditField.getText(),"Emri i Prindit");
          String g=genderGroup.getSelection().getActionCommand();
          char gjinia=g.charAt(0);
          p.setNrpersonal(nr_personal);
          p.setEmri(emri);
          p.setMbiemri(ct.vetemShkronja(mbiemriField.getText(), "Mbiemri"));
          p.setEmriprindit(emri_prindit);

          p.setDatalindjes(ct.data(dateField.getDate()));
          p.setVendbanimi(ct.vetemShkronja(vendbanimiField.getText(),"Vendbanimi"));
          p.setVendlindja(ct.vetemShkronja(vendlindjaField.getText(),"Vendlindja"));
          String komuna=ct.vetemShkronja(komunaField.getText(), "Komuna");
          String adresa=ct.numraShkronja(adresaField.getText(),"Adresa");
          p.setAdresa(adresa);
          p.setGjinia(gjinia);
          p.setKomuna(komuna);
          pacientiInterface.create(p);
          tableLoad();
          clearFields();
        }
        catch (AppException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            return;
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed

    }//GEN-LAST:event_femaleRadioActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed

    }//GEN-LAST:event_maleRadioActionPerformed

    private void kontaktiFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontaktiFrameActionPerformed
        int row=table.getSelectedRow();
        if(row!=-1){
        Pacienti p = pacientiModel.getPacienti(row);
        panel1.removeAll();
        KontaktiFrame kf = new KontaktiFrame(p);
        panel1.add(kf);
        kf.show();
        }
        else{
            JOptionPane.showMessageDialog(null, "Nuk keni selektuar asgje");
        }
    }//GEN-LAST:event_kontaktiFrameActionPerformed

    private void emriFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emriFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emriFieldActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
     
    }//GEN-LAST:event_searchFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pacienti p=pacientiInterface.findByID(Integer.parseInt(searchField.getText()));
       textArea.append("Emri:"+ p.getEmri()+" Mbiemri:"+p.getMbiemri()+" Vendbanimi:"+p.getVendbanimi());
    }//GEN-LAST:event_jButton1ActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField adresaField;
    private javax.swing.JButton cancelButton;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emriField;
    private javax.swing.JTextField emriPrinditField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField komunaField;
    private javax.swing.JButton kontaktiFrame;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField mbiemriField;
    private javax.swing.JTextField nr_personalField;
    private java.awt.Panel panel1;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable table;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField vendbanimiField;
    private javax.swing.JTextField vendlindjaField;
    // End of variables declaration//GEN-END:variables

    private void tableLoad(){
       List<Pacienti>listPacienti=pacientiInterface.findAll();
        pacientiModel.add(listPacienti);
        table.setModel(pacientiModel);
        pacientiModel.fireTableDataChanged(); 
    }

    private void tabelaMoveKey() {
        
    }
  

   public void clearFields(){
        adresaField.setText("");
        komunaField.setText("");
        emriField.setText("");
        mbiemriField.setText("");
        komunaField.setText("");
        adresaField.setText("");
        emriPrinditField.setText("");
        dateField.setDate(null);
        nr_personalField.setText("");
        vendbanimiField.setText("");
        vendlindjaField.setText("");
        
        genderGroup.clearSelection();
        table.clearSelection();
        
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
                    Pacienti p = pacientiModel.getPacienti(selectedIndex);
                    nr_personalField.setText(p.getNrpersonal()+"");
                    komunaField.setText(p.getKomuna());
                    emriField.setText(p.getEmri());
                    mbiemriField.setText(p.getMbiemri());
                    adresaField.setText(p.getAdresa());
                    emriPrinditField.setText(p.getEmriprindit());
                    dateField.setDate(p.getDatalindjes());
                    vendlindjaField.setText(p.getVendlindja());
                    vendbanimiField.setText(p.getVendbanimi());
                                   
                    if(p.getGjinia()=='M'){
                         genderGroup.add(maleRadio);
                         maleRadio.setSelected(true);
                         femaleRadio.setSelected(false);
                    }else if(p.getGjinia()=='F'){
                    genderGroup.add(femaleRadio);
                    femaleRadio.setSelected(true);
                    maleRadio.setSelected(false);
                    }
                       
                }
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
}
