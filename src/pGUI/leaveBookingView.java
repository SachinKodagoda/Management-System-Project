
package pGUI;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import pcode.Dbconnect;


    public class leaveBookingView extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
  
    
    public leaveBookingView() {
        initComponents();
        con = Dbconnect.dconnect();
        this.setDefaultCloseOperation ( leaveBookingView.DISPOSE_ON_CLOSE );
        this.getContentPane().setBackground(Color.black);
        id_txt.grabFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        hoverBar = new javax.swing.JLabel();
        fullDay = new javax.swing.JRadioButton();
        halfDay = new javax.swing.JRadioButton();
        hours = new javax.swing.JRadioButton();
        datez = new com.toedter.calendar.JDateChooser();
        cover = new javax.swing.JLabel();
        minBtn = new javax.swing.JLabel();
        clsBtn = new javax.swing.JLabel();
        addLbl = new javax.swing.JLabel();
        deleteLbl = new javax.swing.JLabel();
        searchLbl = new javax.swing.JLabel();
        moveLbl = new javax.swing.JLabel();
        reasonCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        id_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        hour_txt = new javax.swing.JTextField();
        backLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leave Planner");
        setMinimumSize(new java.awt.Dimension(862, 548));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(862, 548));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hoverBar.setForeground(new java.awt.Color(255, 255, 255));
        hoverBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoverBar.setText("Duminda Gayan");
        getContentPane().add(hoverBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 512, 500, 25));

        buttonGroup1.add(fullDay);
        fullDay.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fullDayMouseMoved(evt);
            }
        });
        fullDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullDayActionPerformed(evt);
            }
        });
        getContentPane().add(fullDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 198, -1, -1));

        buttonGroup1.add(halfDay);
        halfDay.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                halfDayMouseMoved(evt);
            }
        });
        halfDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfDayActionPerformed(evt);
            }
        });
        getContentPane().add(halfDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 198, -1, -1));

        buttonGroup1.add(hours);
        hours.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoursMouseMoved(evt);
            }
        });
        hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursActionPerformed(evt);
            }
        });
        getContentPane().add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 198, -1, -1));

        datez.setDateFormatString("yyyy-MM-dd");
        datez.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                datezMouseMoved(evt);
            }
        });
        getContentPane().add(datez, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 158, 148, 24));

        cover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                coverMouseMoved(evt);
            }
        });
        getContentPane().add(cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 180, 40));

        minBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minBtnMouseClicked(evt);
            }
        });
        getContentPane().add(minBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 11, 26, 26));

        clsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clsBtnMouseClicked(evt);
            }
        });
        getContentPane().add(clsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 11, 26, 26));

        addLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/l3.png"))); // NOI18N
        addLbl.setPreferredSize(new java.awt.Dimension(57, 59));
        addLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addLblMouseMoved(evt);
            }
        });
        addLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addLblMouseExited(evt);
            }
        });
        getContentPane().add(addLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 190, 60, 60));

        deleteLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/l2.png"))); // NOI18N
        deleteLbl.setPreferredSize(new java.awt.Dimension(51, 58));
        deleteLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteLblMouseMoved(evt);
            }
        });
        deleteLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteLblMouseExited(evt);
            }
        });
        getContentPane().add(deleteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 120, 50, 50));

        searchLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/l1.png"))); // NOI18N
        searchLbl.setMaximumSize(new java.awt.Dimension(20, 20));
        searchLbl.setPreferredSize(new java.awt.Dimension(64, 44));
        searchLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchLblMouseMoved(evt);
            }
        });
        searchLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchLblMouseExited(evt);
            }
        });
        getContentPane().add(searchLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 50, 70, 40));

        moveLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveLblMouseDragged(evt);
            }
        });
        moveLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveLblMousePressed(evt);
            }
        });
        getContentPane().add(moveLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 774, 40));

        reasonCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casual", "Sick" }));
        reasonCombo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                reasonComboMouseMoved(evt);
            }
        });
        getContentPane().add(reasonCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 92, 157, 25));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User_ID", "Date", "Hours", "Reason"
            }
        ));
        jTable1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTable1MouseMoved(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 840, 210));

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
        getContentPane().add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 113, 146, 20));

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
        getContentPane().add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 192, 146, 20));

        hour_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hour_txt.setBorder(null);
        hour_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hour_txtMouseMoved(evt);
            }
        });
        hour_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hour_txtActionPerformed(evt);
            }
        });
        getContentPane().add(hour_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 30, 20));

        backLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/jmaxi.png"))); // NOI18N
        backLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backLblMouseMoved(evt);
            }
        });
        getContentPane().add(backLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int r = jTable1.getSelectedRow();

     
        String id = jTable1.getValueAt(r, 0).toString();
        Date date = (Date) jTable1.getValueAt(r, 1);
        String hour = jTable1.getValueAt(r, 2).toString();
        String reason = jTable1.getValueAt(r,3).toString();

        id_txt.setText(id);
        datez.setDate(date);
        hour_txt.setText(hour);
        
        JComboBox cList = new JComboBox((ComboBoxModel) reasonCombo);
        cList.setSelectedIndex(4);
        cList.addActionListener((ActionListener) this);

        
        

    }//GEN-LAST:event_jTable1MouseClicked

    private void hour_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hour_txtActionPerformed
       
    }//GEN-LAST:event_hour_txtActionPerformed

    private void clsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clsBtnMouseClicked
        dispose();
    }//GEN-LAST:event_clsBtnMouseClicked

    private void minBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBtnMouseClicked
        this.setState(leaveBookingView.ICONIFIED);
    }//GEN-LAST:event_minBtnMouseClicked

    private void moveLblMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveLblMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_moveLblMouseDragged

    private void moveLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveLblMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveLblMousePressed

    
    private void searchLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLblMouseClicked
           
        String sql = "select * from employee_details where emp_ID =? && password =? ";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,id_txt.getText() );
            pst.setString(2,password_txt.getText() );
            rs = pst.executeQuery();
            password_txt.setText("");

            if(rs.next()){

                String id = id_txt.getText();
                String sql2 = "select * from leavebooking  where emp_id ='"+id+"'";
                pst =con.prepareCall(sql2);
                rs= pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            }
            else{

                JOptionPane.showMessageDialog(null,"User ID Or Password Invalid");
            }
        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchLblMouseClicked

    private void deleteLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLblMouseClicked
        
        int c = JOptionPane.showConfirmDialog(null,"Do you want to delete this ?");

        if(c==0){

            String id = id_txt.getText();
            String date = ((JTextField)datez.getDateEditor().getUiComponent()).getText();
            String hour = hour_txt.getText();

            try{

                String sql = "delete from leavebooking where Emp_Id ='"+id+"' and Date ='"+date+"' and Hours='"+hour+"' ";
                pst = con.prepareStatement(sql);
                pst.execute();

                String sql2 = "select * from leavebooking  where emp_id ='"+id+"'";
                pst =con.prepareCall(sql2);
                rs= pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                JOptionPane.showMessageDialog(null,"Deleted");

            }catch(SQLException | HeadlessException e){

                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_deleteLblMouseClicked

    private void addLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLblMouseClicked
        String sql = "select * from employee_details where emp_ID = ? && password =? ";
      
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,id_txt.getText() );
            pst.setString(2,password_txt.getText() );
            rs = pst.executeQuery();
            password_txt.setText("");

            if(rs.next()){

                String id = id_txt.getText();
                String date = ((JTextField)datez.getDateEditor().getUiComponent()).getText();
                String hour = hour_txt.getText();
                String reason = (String) reasonCombo.getSelectedItem();
                String sql1 = "insert into leavebooking values('"+id+"','"+date+"','"+hour+"','"+reason+"')";
                pst = con.prepareStatement(sql1);
                pst.execute();

                String sql2 = "select * from leavebooking where emp_id = '"+id+"'";
                pst = con.prepareStatement(sql2);
                rs = pst.executeQuery();

                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                JOptionPane.showMessageDialog(null,"Successfully Added");

            }
            else{

                JOptionPane.showMessageDialog(null,"User ID Or Password Invalid");
            }
        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_addLblMouseClicked

    private void searchLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLblMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("k1.png"));
        searchLbl.setIcon(II);
    }//GEN-LAST:event_searchLblMouseEntered

    private void deleteLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLblMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("k2.png"));
        deleteLbl.setIcon(II);
    }//GEN-LAST:event_deleteLblMouseEntered

    private void addLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLblMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("k3.png"));
        addLbl.setIcon(II);
    }//GEN-LAST:event_addLblMouseEntered

    private void searchLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLblMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("l1.png"));
        searchLbl.setIcon(II);
    }//GEN-LAST:event_searchLblMouseExited

    private void deleteLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLblMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("l2.png"));
        deleteLbl.setIcon(II);
    }//GEN-LAST:event_deleteLblMouseExited

    private void addLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLblMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("l3.png"));
        addLbl.setIcon(II);
    }//GEN-LAST:event_addLblMouseExited

    private void fullDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullDayActionPerformed
        if(fullDay.isSelected()){
            hour_txt.setText("8");
          //fullDay.setSelected(false);  
        }
    }//GEN-LAST:event_fullDayActionPerformed

    private void halfDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfDayActionPerformed
       if(halfDay.isSelected()){
       hour_txt.setText("4");
       }
    }//GEN-LAST:event_halfDayActionPerformed

    private void hoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursActionPerformed
        if(hours.isSelected()){
            hour_txt.setText("");
        }
    }//GEN-LAST:event_hoursActionPerformed

    private void id_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txtMouseMoved
       hoverBar.setText("Enter the Employee ID");
       id_txt.grabFocus();
    }//GEN-LAST:event_id_txtMouseMoved

    private void password_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMouseMoved
        hoverBar.setText("Enter the Password");
        password_txt.grabFocus();
    }//GEN-LAST:event_password_txtMouseMoved

    private void datezMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datezMouseMoved
        hoverBar.setText("Select Date of the leave");
    }//GEN-LAST:event_datezMouseMoved

    private void hoursMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoursMouseMoved
       hoverBar.setText("Enter the Hours manually");
       hour_txt.grabFocus();
    }//GEN-LAST:event_hoursMouseMoved

    private void reasonComboMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reasonComboMouseMoved
        hoverBar.setText("Select reason for the leave");
    }//GEN-LAST:event_reasonComboMouseMoved

    private void searchLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLblMouseMoved
        hoverBar.setText("Enter Employee ID and the password to search");
    }//GEN-LAST:event_searchLblMouseMoved

    private void deleteLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLblMouseMoved
        hoverBar.setText("Select the data entry and press Delete");
    }//GEN-LAST:event_deleteLblMouseMoved

    private void addLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLblMouseMoved
        hoverBar.setText("Add new leave entry");
    }//GEN-LAST:event_addLblMouseMoved

    private void hour_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hour_txtMouseMoved
         hoverBar.setText("Enter the Hours manually");
    }//GEN-LAST:event_hour_txtMouseMoved

    private void backLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseMoved
         hoverBar.setText("");
    }//GEN-LAST:event_backLblMouseMoved

    private void halfDayMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_halfDayMouseMoved
        hoverBar.setText("Half day leave?");
        password_txt.grabFocus();
    }//GEN-LAST:event_halfDayMouseMoved

    private void fullDayMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullDayMouseMoved
        hoverBar.setText("Full day leave?");
        password_txt.grabFocus();
    }//GEN-LAST:event_fullDayMouseMoved

    private void coverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coverMouseMoved
        hoverBar.setText("Select date of the leave");
       
    }//GEN-LAST:event_coverMouseMoved

    private void jTable1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseMoved
       hoverBar.setText("Select an entry to modify");
    }//GEN-LAST:event_jTable1MouseMoved

    private void password_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                
        String sql = "select * from employee_details where emp_ID =? && password =? ";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,id_txt.getText() );
            pst.setString(2,password_txt.getText() );
            rs = pst.executeQuery();
            password_txt.setText("");

            if(rs.next()){

                String id = id_txt.getText();
                String sql2 = "select * from leavebooking  where emp_id ='"+id+"'";
                pst =con.prepareCall(sql2);
                rs= pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            }
            else{

                JOptionPane.showMessageDialog(null,"User ID Or Password Invalid");
            }
        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null,e);
        } 
       }else if(evt.getKeyCode()==KeyEvent.VK_INSERT){
           
        String sql = "select * from employee_details where emp_ID = ? && password =? ";
      
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,id_txt.getText() );
            pst.setString(2,password_txt.getText() );
            rs = pst.executeQuery();
            password_txt.setText("");

            if(rs.next()){

                String id = id_txt.getText();
                String date = ((JTextField)datez.getDateEditor().getUiComponent()).getText();
                String hour = hour_txt.getText();
                String reason = (String) reasonCombo.getSelectedItem();
                String sql1 = "insert into leavebooking values('"+id+"','"+date+"','"+hour+"','"+reason+"')";
                pst = con.prepareStatement(sql1);
                pst.execute();

                String sql2 = "select * from leavebooking where emp_id = '"+id+"'";
                pst = con.prepareStatement(sql2);
                rs = pst.executeQuery();

                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                JOptionPane.showMessageDialog(null,"Successfully Added");

            }
            else{

                JOptionPane.showMessageDialog(null,"User ID Or Password Invalid");
            }
        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null,e);
        }
       }
    }//GEN-LAST:event_password_txtKeyPressed

    private void id_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_txtKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           password_txt.grabFocus();
       }
    }//GEN-LAST:event_id_txtKeyPressed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
        int c = JOptionPane.showConfirmDialog(null,"Do you want to delete this ?");

        if(c==0){

            String id = id_txt.getText();
            String date = ((JTextField)datez.getDateEditor().getUiComponent()).getText();
            String hour = hour_txt.getText();

            try{

                String sql = "delete from leavebooking where Emp_Id ='"+id+"' and Date ='"+date+"' and Hours='"+hour+"' ";
                pst = con.prepareStatement(sql);
                pst.execute();

                String sql2 = "select * from leavebooking  where emp_id ='"+id+"'";
                pst =con.prepareCall(sql2);
                rs= pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                JOptionPane.showMessageDialog(null,"Deleted");

            }catch(SQLException | HeadlessException e){

                JOptionPane.showMessageDialog(null,e);
            }
        }
        }
    }//GEN-LAST:event_jTable1KeyPressed
 
    
    
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
            java.util.logging.Logger.getLogger(leaveBookingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leaveBookingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leaveBookingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leaveBookingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new leaveBookingView().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLbl;
    private javax.swing.JLabel backLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel clsBtn;
    private javax.swing.JLabel cover;
    private com.toedter.calendar.JDateChooser datez;
    private javax.swing.JLabel deleteLbl;
    private javax.swing.JRadioButton fullDay;
    private javax.swing.JRadioButton halfDay;
    private javax.swing.JTextField hour_txt;
    private javax.swing.JRadioButton hours;
    private javax.swing.JLabel hoverBar;
    private javax.swing.JTextField id_txt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel minBtn;
    private javax.swing.JLabel moveLbl;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JComboBox<String> reasonCombo;
    private javax.swing.JLabel searchLbl;
    // End of variables declaration//GEN-END:variables
}
