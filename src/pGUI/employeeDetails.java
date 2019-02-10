
package pGUI;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import pcode.Dbconnect;
/**
 *
 * @author sajith
 */
    public class employeeDetails extends javax.swing.JFrame {
    
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int xMouse;
        int yMouse;
    
    public employeeDetails() {
       
        initComponents();
        con = Dbconnect.dconnect();
        tableEmp();
        this.getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation ( employeeDetails.DISPOSE_ON_CLOSE );
        id_txt.grabFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        viewAll = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        deleteAll = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        hoverBar = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        birth_txt = new javax.swing.JTextField();
        pos_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JTextField();
        dept_txt = new javax.swing.JComboBox<>();
        searchid_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JLabel();

        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Position");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 18, 35, 35));

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 18, 35, 35));

        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
        });
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 30));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btns1.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 86, 44, 37));

        viewAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnViewAll3.png"))); // NOI18N
        viewAll.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                viewAllMouseMoved(evt);
            }
        });
        viewAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewAllMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewAllMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                viewAllMouseReleased(evt);
            }
        });
        getContentPane().add(viewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 183, 43));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnAdd1.png"))); // NOI18N
        add.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addMouseMoved(evt);
            }
        });
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addMouseReleased(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 120, 99));

        deleteAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnDeleteAll3.png"))); // NOI18N
        deleteAll.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteAllMouseMoved(evt);
            }
        });
        deleteAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteAllMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteAllMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteAllMouseReleased(evt);
            }
        });
        getContentPane().add(deleteAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 183, 43));

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnUpdate1.png"))); // NOI18N
        update.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                updateMouseMoved(evt);
            }
        });
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateMouseReleased(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 106, 115));

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnDelete1.png"))); // NOI18N
        delete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteMouseMoved(evt);
            }
        });
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteMouseReleased(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 98, 105));

        hoverBar.setForeground(new java.awt.Color(255, 255, 255));
        hoverBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hoverBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 545, 620, 30));

        id_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_txt.setBorder(null);
        id_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                id_txtMouseMoved(evt);
            }
        });
        id_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_txtKeyPressed(evt);
            }
        });
        getContentPane().add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 93, 140, 24));

        name_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name_txt.setBorder(null);
        name_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                name_txtMouseMoved(evt);
            }
        });
        name_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_txtKeyTyped(evt);
            }
        });
        getContentPane().add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 144, 140, 24));

        birth_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        birth_txt.setBorder(null);
        birth_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                birth_txtMouseMoved(evt);
            }
        });
        birth_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                birth_txtKeyPressed(evt);
            }
        });
        getContentPane().add(birth_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 194, 140, 24));

        pos_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos_txt.setBorder(null);
        pos_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pos_txtMouseMoved(evt);
            }
        });
        pos_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pos_txtKeyPressed(evt);
            }
        });
        getContentPane().add(pos_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 245, 140, 24));

        password_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_txt.setBorder(null);
        password_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                password_txtMouseMoved(evt);
            }
        });
        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_txtKeyPressed(evt);
            }
        });
        getContentPane().add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 353, 140, 24));

        dept_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Deparment", "101", "102", "103", "104" }));
        getContentPane().add(dept_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 296, 160, -1));

        searchid_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchid_txt.setBorder(null);
        searchid_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchid_txtMouseMoved(evt);
            }
        });
        searchid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchid_txtActionPerformed(evt);
            }
        });
        searchid_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchid_txtKeyPressed(evt);
            }
        });
        getContentPane().add(searchid_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 93, 140, 24));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 140, 530, 180));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/empdetalix.png"))); // NOI18N
        back.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backMouseMoved(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Add button
    
   //DeleteAll Button
        
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();
        
        String id = jTable1.getValueAt(r, 0).toString();
        String name = jTable1.getValueAt(r, 1).toString();
        String birth = jTable1.getValueAt(r, 2).toString();
        String position = jTable1.getValueAt(r, 3).toString();
        String dept = jTable1.getValueAt(r, 4).toString();
        String password = jTable1.getValueAt(r, 5).toString();
        
        id_txt.setText(id);
        name_txt.setText(name);
        birth_txt.setText(birth);
        pos_txt.setText(position);
        dept_txt.setSelectedItem(dept);
        password_txt.setText(password);
    }//GEN-LAST:event_jTable1MouseClicked

    private void name_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_txtKeyTyped
         char c = evt.getKeyChar();
         if(!(Character.isLetter(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
         
             evt.consume();
         }
    }//GEN-LAST:event_name_txtKeyTyped

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
       
        String id = id_txt.getText();
        String name = name_txt.getText();
        String birth = birth_txt.getText();
        String position = pos_txt.getText();
        String dept =  dept_txt.getSelectedItem().toString();
        String password = password_txt.getText();
        
        
        String sql = "insert into employee_details values('"+id+"','"+name+"','"+birth+"','"+position+"','"+dept+"','"+password+"')";
        
        try{
            pst = con.prepareStatement(sql);
            pst.execute();
            tableEmp();
            JOptionPane.showMessageDialog(null,"Successfully Added");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
    }//GEN-LAST:event_addMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
           
        int c = JOptionPane.showConfirmDialog(null,"Do you want to update this ?");
        if(c==0){
        
        String id = id_txt.getText();
        String name = name_txt.getText();
        String birth = birth_txt.getText();
        String position = pos_txt.getText();
        String dept =  dept_txt.getSelectedItem().toString();
        String password = password_txt.getText();
        
        String sql3 ="update employee_details set ename ='"+name+"', Date_of_birth ='"+birth+"',Position='"+position+"',department='"+dept+"',password='"+password+"' where emp_ID ='"+id+"'";
        
       
        
        try{
            pst = con.prepareStatement(sql3);
            pst.execute();
            tableEmp();
            JOptionPane.showMessageDialog(null,"Successfully Updated");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
        }
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
              int c = JOptionPane.showConfirmDialog(null,"Do you want to delete this ?");
        if(c==0){
        
        String id = id_txt.getText();
        
        String sql4 = "delete from employee_details where emp_ID ='"+id+"' ";
        
        try{
            pst = con.prepareStatement(sql4);
            pst.execute();
            tableEmp();
            JOptionPane.showMessageDialog(null,"Deleted");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseClicked
            
        int c = JOptionPane.showConfirmDialog(null,"Do you want to delete all this ?");
        if(c==0){
            String sql6 ="delete from employee_details";
            
              try{
            pst = con.prepareStatement(sql6);
            pst.execute();
            tableEmp();
            JOptionPane.showMessageDialog(null,"Deleted");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
            
        }
    }//GEN-LAST:event_deleteAllMouseClicked

    private void viewAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMouseClicked
        tableEmp();
    }//GEN-LAST:event_viewAllMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
           String id = searchid_txt.getText();
        
        String sql5 = "select * from employee_details where emp_ID='"+id+"'";
        try{
            pst = con.prepareStatement(sql5);
            rs =pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
    }//GEN-LAST:event_searchMouseClicked

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_dragMouseDragged

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
      dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
       this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("btnAdd2.png"));
        add.setIcon(II); 
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("btnAdd1.png"));
        add.setIcon(II);
    }//GEN-LAST:event_addMouseExited

    private void addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("btnAdd3.png"));
        add.setIcon(II);
    }//GEN-LAST:event_addMousePressed

    private void addMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("btnAdd4.png"));
        add.setIcon(II);
    }//GEN-LAST:event_addMouseReleased

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("btnUpdate2.png"));
        update.setIcon(II);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("btnUpdate1.png"));
        update.setIcon(II);
    }//GEN-LAST:event_updateMouseExited

    private void updateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("btnUpdate3.png"));
        update.setIcon(II);
    }//GEN-LAST:event_updateMousePressed

    private void updateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("btnUpdate4.png"));
        update.setIcon(II);
    }//GEN-LAST:event_updateMouseReleased

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("btnDelete2.png"));
        delete.setIcon(II);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("btnDelete1.png"));
        delete.setIcon(II);
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("btnDelete3.png"));
        delete.setIcon(II);
    }//GEN-LAST:event_deleteMousePressed

    private void deleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("btnDelete4.png"));
        delete.setIcon(II);
    }//GEN-LAST:event_deleteMouseReleased

    private void viewAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMouseEntered
       ImageIcon II = new ImageIcon(getClass().getResource("btnViewAll1.png"));
       viewAll.setIcon(II);
    }//GEN-LAST:event_viewAllMouseEntered

    private void viewAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMouseExited
       ImageIcon II = new ImageIcon(getClass().getResource("btnViewAll3.png"));
       viewAll.setIcon(II);
    }//GEN-LAST:event_viewAllMouseExited

    private void viewAllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMousePressed
       ImageIcon II = new ImageIcon(getClass().getResource("btnViewAll2.png"));
       viewAll.setIcon(II);
    }//GEN-LAST:event_viewAllMousePressed

    private void viewAllMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMouseReleased
       ImageIcon II = new ImageIcon(getClass().getResource("btnViewAll1.png"));
       viewAll.setIcon(II);
    }//GEN-LAST:event_viewAllMouseReleased

    private void deleteAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseEntered
       ImageIcon II = new ImageIcon(getClass().getResource("btnDeleteAll1.png"));
       deleteAll.setIcon(II);
    }//GEN-LAST:event_deleteAllMouseEntered

    private void deleteAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseExited
       ImageIcon II = new ImageIcon(getClass().getResource("btnDeleteAll3.png"));
       deleteAll.setIcon(II);
    }//GEN-LAST:event_deleteAllMouseExited

    private void deleteAllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMousePressed
       ImageIcon II = new ImageIcon(getClass().getResource("btnDeleteAll2.png"));
       deleteAll.setIcon(II);
    }//GEN-LAST:event_deleteAllMousePressed

    private void deleteAllMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseReleased
       ImageIcon II = new ImageIcon(getClass().getResource("btnDeleteAll1.png"));
       deleteAll.setIcon(II);
    }//GEN-LAST:event_deleteAllMouseReleased

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("btns2.png"));
        search.setIcon(II);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("btns1.png"));
        search.setIcon(II);
    }//GEN-LAST:event_searchMouseExited

    private void id_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_txtKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           name_txt.grabFocus();
       }
    }//GEN-LAST:event_id_txtKeyPressed

    private void name_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_txtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           birth_txt.grabFocus();
       }
    }//GEN-LAST:event_name_txtKeyPressed

    private void birth_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_birth_txtKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           pos_txt.grabFocus();
       }
    }//GEN-LAST:event_birth_txtKeyPressed

    private void pos_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pos_txtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           password_txt.grabFocus();
       }
    }//GEN-LAST:event_pos_txtKeyPressed

    private void password_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String id = id_txt.getText();
        String name = name_txt.getText();
        String birth = birth_txt.getText();
        String position = pos_txt.getText();
        String dept =  dept_txt.getSelectedItem().toString();
        String password = password_txt.getText();
        
        
        String sql = "insert into employee_details values('"+id+"','"+name+"','"+birth+"','"+position+"','"+dept+"','"+password+"')";
        
        try{
            pst = con.prepareStatement(sql);
            pst.execute();
            tableEmp();
            JOptionPane.showMessageDialog(null,"Successfully Added");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
        }
    }//GEN-LAST:event_password_txtKeyPressed

    private void searchid_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchid_txtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String id = searchid_txt.getText();
        
        String sql5 = "select * from employee_details where emp_ID='"+id+"'";
        try{
            pst = con.prepareStatement(sql5);
            rs =pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
        }
    }//GEN-LAST:event_searchid_txtKeyPressed

    private void id_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txtMouseMoved
        hoverBar.setText("Enter Employee ID");
        id_txt.grabFocus();
    }//GEN-LAST:event_id_txtMouseMoved

    private void name_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_txtMouseMoved
        hoverBar.setText("Enter Employee Name");
        name_txt.grabFocus();
    }//GEN-LAST:event_name_txtMouseMoved

    private void birth_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birth_txtMouseMoved
        hoverBar.setText("Enter Employee's Birthday");
    }//GEN-LAST:event_birth_txtMouseMoved

    private void pos_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos_txtMouseMoved
        hoverBar.setText("Enter Employee's Position");
        pos_txt.grabFocus();
    }//GEN-LAST:event_pos_txtMouseMoved

    private void password_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMouseMoved
        hoverBar.setText("Enter New Employee Password");
        password_txt.grabFocus();
    }//GEN-LAST:event_password_txtMouseMoved

    private void searchid_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchid_txtMouseMoved
        hoverBar.setText("Enter New Employee Password");
        searchid_txt.grabFocus();
    }//GEN-LAST:event_searchid_txtMouseMoved

    private void viewAllMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMouseMoved
        hoverBar.setText("View All Employee Details");
    }//GEN-LAST:event_viewAllMouseMoved

    private void deleteAllMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseMoved
        hoverBar.setText("Delete All Employee Details");
    }//GEN-LAST:event_deleteAllMouseMoved

    private void addMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseMoved
        hoverBar.setText("Add New Employee Details");
    }//GEN-LAST:event_addMouseMoved

    private void updateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseMoved
       hoverBar.setText("Update The Employee Details");
    }//GEN-LAST:event_updateMouseMoved

    private void deleteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseMoved
       hoverBar.setText("Delete The Employee Details");
    }//GEN-LAST:event_deleteMouseMoved

    private void backMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseMoved
         hoverBar.setText("");
    }//GEN-LAST:event_backMouseMoved

    private void searchid_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchid_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchid_txtActionPerformed

    public void tableEmp(){
    
        try {
            String sql2 = "select * from employee_details";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,e);
        }
    
    }
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
            java.util.logging.Logger.getLogger(employeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel back;
    private javax.swing.JTextField birth_txt;
    private javax.swing.JLabel close;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel deleteAll;
    private javax.swing.JComboBox<String> dept_txt;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel hoverBar;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mini;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField password_txt;
    private javax.swing.JTextField pos_txt;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchid_txt;
    private javax.swing.JLabel update;
    private javax.swing.JLabel viewAll;
    // End of variables declaration//GEN-END:variables
}
