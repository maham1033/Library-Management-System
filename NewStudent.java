package library.management.system;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class NewStudent extends javax.swing.JFrame {

    static Connection c;
    
    public NewStudent() {
        initComponents();
        setTitle("Library Management System");
        setResizable(false);
        setLocationRelativeTo(null);
        jTable1.setEnabled(false);
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	   
            c = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=library_management_system;encrypt=true;trustServerCertificate=true", "sa", "123");
        
            displaytable();
        }
        catch(Exception e){e.printStackTrace();}
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "New Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        jLabel4.setText("Branch");

        jLabel3.setText("Course");

        jLabel5.setText("Email");

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F.Y.B tech", "S.Y.B tech", "T.Y.B tech", "B.E" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setText("ADD STUDENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Student ID");

        jLabel2.setText("Name");

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setText("Delete Student");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 102));
        jButton4.setText("Update Student");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox1, 0, 197, Short.MAX_VALUE)
                            .addComponent(jTextField4))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(38, 38, 38)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(86, 86, 86))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true)));

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displaytable(){
        
        try{
            PreparedStatement ps = c.prepareStatement("select * from Student;");
            ResultSet set = ps.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(set));
        }
        catch(Exception e){e.printStackTrace();}
        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
//        if ( jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() ){
//            JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
//        }
//        else{
//            try{
//                int SID = Integer.parseInt( jTextField1.getText() );
//                String Name = jTextField2.getText();
//                String Course = jComboBox1.getSelectedItem().toString();
//                String Branch = jTextField3.getText();
//                String Email = jTextField4.getText();
//
//                PreparedStatement stmt = c.prepareStatement("insert into Student values('"+SID+"','"+Name+"','"+Course+"','"+Branch+"','"+Email+"') ");
//                stmt.execute();
//                displaytable();
//                JOptionPane.showMessageDialog(new JFrame(), "Student Added Successfully !", "Message" , JOptionPane.INFORMATION_MESSAGE);
//                
//                jTextField1.setText("");
//                jTextField2.setText("");
//                jComboBox1.setSelectedIndex(0);
//                jTextField3.setText("");
//                jTextField4.setText("");
//            }
//            catch(Exception e) {
//                e.printStackTrace();
//                JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Message" , JOptionPane.ERROR_MESSAGE);
//            }
//        }

 if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty()) {
        JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message", JOptionPane.INFORMATION_MESSAGE);
    } else {
        try {
            int SID = Integer.parseInt(jTextField1.getText());
            String Name = jTextField2.getText();
            String Course = jComboBox1.getSelectedItem().toString();
            String Branch = jTextField3.getText();
            String Email = jTextField4.getText();

            // Call the stored procedure to add a new student
            try (CallableStatement stmt = c.prepareCall("{call AddStudent(?, ?, ?, ?, ?)}")) {
                stmt.setInt(1, SID);
                stmt.setString(2, Name);
                stmt.setString(3, Course);
                stmt.setString(4, Branch);
                stmt.setString(5, Email);

                stmt.execute();
            }

            displaytable();
            JOptionPane.showMessageDialog(new JFrame(), "Student Added Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);

            jTextField1.setText("");
            jTextField2.setText("");
            jComboBox1.setSelectedIndex(0);
            jTextField3.setText("");
            jTextField4.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
        // Prompt the user to enter the student ID
        String studentIDStr = JOptionPane.showInputDialog(new JFrame(), "Enter Student ID to delete:");

        // Check if the user clicked Cancel or entered a blank value
        if (studentIDStr == null || studentIDStr.trim().isEmpty()) {
            return;
        }

        // Convert the entered value to an integer
        int studentIDToDelete = Integer.parseInt(studentIDStr);

        // Delete the student from the database
        PreparedStatement deleteStmt = c.prepareStatement("DELETE FROM Student WHERE SID = ?");
        deleteStmt.setInt(1, studentIDToDelete);
        int rowsAffected = deleteStmt.executeUpdate();

        if (rowsAffected > 0) {
            // If deletion is successful, update the table and show a success message
            displaytable();
            JOptionPane.showMessageDialog(new JFrame(), "Student deleted successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Failed to delete student. Student ID not found.", "Message", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(new JFrame(), "Invalid input. Please enter a valid Student ID.", "Message", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {
        // Prompt the user to enter the student ID
        String studentIDStr = JOptionPane.showInputDialog(new JFrame(), "Enter Student ID to update:");

        // Check if the user clicked Cancel or entered a blank value
        if (studentIDStr == null || studentIDStr.trim().isEmpty()) {
            return;
        }

        // Convert the entered value to an integer
        int studentIDToUpdate = Integer.parseInt(studentIDStr);

        // Fetch the student details based on the entered Student ID
        PreparedStatement fetchStmt = c.prepareStatement("SELECT * FROM Student WHERE SID = ?");
        fetchStmt.setInt(1, studentIDToUpdate);
        ResultSet resultSet = fetchStmt.executeQuery();

        if (resultSet.next()) {
            // Student found, prompt for additional information
            String newName = JOptionPane.showInputDialog(new JFrame(), "Enter new name:", resultSet.getString("Name"));
            String newCourse = JOptionPane.showInputDialog(new JFrame(), "Enter new course:", resultSet.getString("Course"));
            String newBranch = JOptionPane.showInputDialog(new JFrame(), "Enter new branch:", resultSet.getString("Branch"));
            String newEmail = JOptionPane.showInputDialog(new JFrame(), "Enter new email:", resultSet.getString("Email"));

            if (newName != null && newCourse != null && newBranch != null && newEmail != null) {
                // Update the student details
                PreparedStatement updateStmt = c.prepareStatement("UPDATE Student SET Name=?, Course=?, Branch=?, Email=? WHERE SID=?");
                updateStmt.setString(1, newName);
                updateStmt.setString(2, newCourse);
                updateStmt.setString(3, newBranch);
                updateStmt.setString(4, newEmail);
                updateStmt.setInt(5, studentIDToUpdate);

                int affectedRows = updateStmt.executeUpdate();

                if (affectedRows > 0) {
                    displaytable();
                    JOptionPane.showMessageDialog(new JFrame(), "Student Updated Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Failed to update student. Student ID not found.", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Student not found with ID: " + studentIDToUpdate, "Message", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(new JFrame(), "Invalid input. Please enter a valid Student ID.", "Message", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
