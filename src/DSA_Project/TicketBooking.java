package DSA_Project;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class TicketBooking extends javax.swing.JFrame {

   
    DataSaving ds = new DataSaving();
    
    Date date=new Date();
    SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/YYYY");
    
    
    public TicketBooking() {
        initComponents();
        setSize(644,639);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menupanel = new javax.swing.JPanel();
        showlist = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();
        search = new javax.swing.JButton();
        searchold = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        phoneno = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        tablepanel = new javax.swing.JPanel();
        scrollpane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        email = new javax.swing.JLabel();
        numbertf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setLayout(null);

        menuPanel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel.add(menuPanel);
        menuPanel.setBounds(0, 0, 180, 50);

        menupanel.setBackground(new java.awt.Color(153, 153, 153));
        menupanel.setLayout(null);

        showlist.setBackground(new java.awt.Color(102, 102, 102));
        showlist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showlist.setText("Show List");
        showlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showlistActionPerformed(evt);
            }
        });
        menupanel.add(showlist);
        showlist.setBounds(20, 40, 140, 40);

        delete.setBackground(new java.awt.Color(102, 102, 102));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete.setText("Cancel Booking");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        menupanel.add(delete);
        delete.setBounds(20, 110, 140, 40);

        save.setBackground(new java.awt.Color(102, 102, 102));
        save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save.setText("Save Records");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        menupanel.add(save);
        save.setBounds(20, 180, 140, 40);

        search.setBackground(new java.awt.Color(102, 102, 102));
        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        menupanel.add(search);
        search.setBounds(20, 250, 140, 40);

        searchold.setBackground(new java.awt.Color(102, 102, 102));
        searchold.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchold.setText("Search In File");
        searchold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcholdActionPerformed(evt);
            }
        });
        menupanel.add(searchold);
        searchold.setBounds(20, 320, 140, 40);

        panel.add(menupanel);
        menupanel.setBounds(0, 50, 180, 550);

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name:");
        panel.add(name);
        name.setBounds(260, 16, 50, 40);

        nametf.setForeground(new java.awt.Color(153, 153, 153));
        nametf.setText("Name");
        nametf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nametfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nametfFocusLost(evt);
            }
        });
        nametf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nametfKeyPressed(evt);
            }
        });
        panel.add(nametf);
        nametf.setBounds(310, 20, 233, 30);

        phoneno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phoneno.setText(" Phone No:");
        panel.add(phoneno);
        phoneno.setBounds(230, 70, 80, 30);

        emailtf.setForeground(new java.awt.Color(153, 153, 153));
        emailtf.setText("Email");
        emailtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailtfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailtfFocusLost(evt);
            }
        });
        emailtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailtfKeyPressed(evt);
            }
        });
        panel.add(emailtf);
        emailtf.setBounds(310, 120, 233, 30);

        enter.setBackground(new java.awt.Color(153, 153, 153));
        enter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enter.setText("Book Ticket");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        panel.add(enter);
        enter.setBounds(350, 190, 114, 30);

        tablepanel.setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone Number", "Email", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.getTableHeader().setReorderingAllowed(false);
        scrollpane.setViewportView(table);

        tablepanel.add(scrollpane);
        scrollpane.setBounds(0, 0, 430, 290);

        panel.add(tablepanel);
        tablepanel.setBounds(190, 300, 430, 290);

        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setText(" Email:");
        panel.add(email);
        email.setBounds(260, 120, 50, 30);

        numbertf.setForeground(new java.awt.Color(153, 153, 153));
        numbertf.setText("Phone Number");
        numbertf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numbertfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numbertfFocusLost(evt);
            }
        });
        numbertf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numbertfKeyPressed(evt);
            }
        });
        panel.add(numbertf);
        numbertf.setBounds(310, 70, 233, 30);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 630, 601);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
       
       if(emailtf.getText().endsWith("@gmail.com") || emailtf.getText().endsWith("@email.com"))
       {
            ds.add(nametf.getText(), numbertf.getText(), emailtf.getText(), dateformat.format(date));
            JOptionPane.showMessageDialog(null,"Ticket Booked.");
       }
       
       else
       {
           JOptionPane.showMessageDialog(null,"Something is wrong while getting data!",null,JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_enterActionPerformed

    private void showlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showlistActionPerformed
        
        String[] arr = ds.print();
        
        if(arr==null)
        {
            JOptionPane.showMessageDialog(null, "List is empty!");
        }
        
        else
        {
            javax.swing.table.DefaultTableModel model;
            table.setModel(new javax.swing.table.DefaultTableModel(null,new String[] {"Name", "Phone Number", "Email", "Date"}));

            for(int i=0;i<arr.length-3;i++,i++,i++,i++)
            {
                String str1 = arr[i];
                String str2 = arr[i+1];
                String str3 = arr[i+2];
                String str4 = arr[i+3];
                String[] data={str1,str2,str3,str4};
                model=(javax.swing.table.DefaultTableModel) table.getModel();
                model.addRow(data);
            }
        }
        
    }//GEN-LAST:event_showlistActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        String str = JOptionPane.showInputDialog(null, "Enter phone number: ");
        
        if(str==null)
        {
            
        }
        else if(str.length()<=0)
        {
            JOptionPane.showMessageDialog(null, "You entered nothing");
        }
        
        else if(Pattern.matches("^[A-z]+$",str))
        {
            JOptionPane.showMessageDialog(null, "Please enter only number!");
        }
        
        else
        {
            boolean check = ds.cancelBooking(str);
            
            if(check)
            {
                JOptionPane.showMessageDialog(null, "Booking cancelled");
            }
            
            else
            {
                JOptionPane.showMessageDialog(null, "Customer does not exist!");
            }
            
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        String str = JOptionPane.showInputDialog(null, "Enter phone number: ");
        
        if(str==null)
        {
            
        }
        else if(str.length()<=0)
        {
            JOptionPane.showMessageDialog(null, "You entered nothing");
        }
        
        else if(Pattern.matches("^[A-z]+$",str))
        {
            JOptionPane.showMessageDialog(null, "Please enter only number!", null, JOptionPane.ERROR_MESSAGE);
        }
        
        else
        {
            String[] arr = ds.search(str);
            if(arr==null)
            {
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            }
            
            else
            {
                JOptionPane.showMessageDialog(null, "Name: "+arr[0]+"\n"+"Phone No: "+arr[1]+"\n"+"Email: "+arr[2]+"\n"+"Date: "+arr[3]);
            }
        }
        
    }//GEN-LAST:event_searchActionPerformed

    private void nametfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametfKeyPressed
        
        char ch=evt.getKeyChar();
        
        if(Character.isLetter(ch) || Character.isISOControl(ch) || Character.isSpaceChar(ch))
        {
            nametf.setEditable(true);
        }
        
        else
        {
            nametf.setEditable(false);
        }
        
    }//GEN-LAST:event_nametfKeyPressed

    private void emailtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailtfKeyPressed
      
    }//GEN-LAST:event_emailtfKeyPressed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        String [] arr = ds.print();
        
        if(arr==null)
        {
            JOptionPane.showMessageDialog(null, "List is empty!");
        }
        
        else
        {
        
            try {
                 FileWriter obj=new FileWriter("./TicketBooking.txt",true);
                 BufferedWriter ob=new BufferedWriter(obj);

                 for(int i=0;i<arr.length-3;i++,i++,i++,i++)
                 {
                     ob.write(arr[i]+"\t\t\t\t"+arr[i+1]+"\t\t\t\t"+arr[i+2]+"\t\t\t\t"+arr[i+3]+"\r\n");
                 }
                 ob.close();

                 JOptionPane.showMessageDialog(null, "Data saved in TicketBooking file");

            }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_saveActionPerformed

    private void searcholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcholdActionPerformed
        
        String str = JOptionPane.showInputDialog(null, "Enter phone number: ");
        
        if(str==null)
        {
            
        }
        else if(str.length()<=0)
        {
            JOptionPane.showMessageDialog(null, "You entered nothing");
        }
        
        else if(Pattern.matches("^[A-z]+$",str))
        {
            JOptionPane.showMessageDialog(null, "Please enter only number!", null, JOptionPane.ERROR_MESSAGE);
        }
        
        else
        {
            boolean check=false;
            try {
                FileReader fr = new FileReader("./TicketBooking.txt");
                BufferedReader br=new BufferedReader(fr);
                String str2;
                while((str2=br.readLine())!=null)
                {
                    if(str2.contains(str))
                    {
                        check=true;
                        break;
                    }
                    else
                    {
                        check=false;
                    }
                }
                
                if(check)
                {
                    JOptionPane.showMessageDialog(null, str2);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Entry does not exist!");
                }

                br.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_searcholdActionPerformed

    private void numbertfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numbertfKeyPressed
        
        char ch=evt.getKeyChar();
        if(Character.isDigit(ch) || Character.isISOControl(ch))
        {
            numbertf.setEditable(true);
        }
        else
        {
            numbertf.setEditable(false);
        }
        
    }//GEN-LAST:event_numbertfKeyPressed

    private void nametfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametfFocusGained
        
        if(nametf.getText().equals("Name"))
        {
            nametf.setText("");
            nametf.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_nametfFocusGained

    private void nametfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametfFocusLost
        
        if(nametf.getText().equals(""))
        {
            nametf.setText("Name");
            nametf.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_nametfFocusLost

    private void numbertfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numbertfFocusGained
        
        if(numbertf.getText().equals("Phone Number"))
        {
            numbertf.setText("");
            numbertf.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_numbertfFocusGained

    private void numbertfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numbertfFocusLost
        
        if(numbertf.getText().equals(""))
        {
            numbertf.setText("Phone Number");
            numbertf.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_numbertfFocusLost

    private void emailtfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailtfFocusGained
        
        if(emailtf.getText().equals("Email"))
        {
            emailtf.setText("");
            emailtf.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_emailtfFocusGained

    private void emailtfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailtfFocusLost
        
        if(emailtf.getText().equals(""))
        {
            emailtf.setText("Email");
            emailtf.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_emailtfFocusLost

   
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtf;
    private javax.swing.JButton enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField numbertf;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel phoneno;
    private javax.swing.JButton save;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JButton search;
    private javax.swing.JButton searchold;
    private javax.swing.JButton showlist;
    public javax.swing.JTable table;
    private javax.swing.JPanel tablepanel;
    // End of variables declaration//GEN-END:variables
}
