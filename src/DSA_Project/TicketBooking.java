package DSA_Project;

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
        menupanel = new javax.swing.JPanel();
        showlist = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();
        search = new javax.swing.JButton();
        searchold = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        phoneno = new javax.swing.JLabel();
        numbertf = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        tablepanel = new javax.swing.JPanel();
        scrollpane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setLayout(null);

        menupanel.setBackground(new java.awt.Color(153, 153, 153));
        menupanel.setLayout(null);

        showlist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showlist.setText("Show List");
        showlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showlistActionPerformed(evt);
            }
        });
        menupanel.add(showlist);
        showlist.setBounds(27, 53, 120, 32);

        delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        menupanel.add(delete);
        delete.setBounds(27, 123, 120, 32);

        save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save.setText("Save Records");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        menupanel.add(save);
        save.setBounds(27, 197, 120, 32);

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        menupanel.add(search);
        search.setBounds(30, 270, 120, 32);

        searchold.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchold.setText("Search Old");
        searchold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcholdActionPerformed(evt);
            }
        });
        menupanel.add(searchold);
        searchold.setBounds(30, 340, 120, 30);

        panel.add(menupanel);
        menupanel.setBounds(0, 0, 180, 600);

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name:");
        panel.add(name);
        name.setBounds(242, 51, 53, 26);

        nametf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nametfKeyPressed(evt);
            }
        });
        panel.add(nametf);
        nametf.setBounds(309, 44, 233, 33);

        phoneno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phoneno.setText("Phone No:");
        panel.add(phoneno);
        phoneno.setBounds(217, 110, 80, 27);

        numbertf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numbertfKeyPressed(evt);
            }
        });
        panel.add(numbertf);
        numbertf.setBounds(309, 107, 233, 35);

        enter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        panel.add(enter);
        enter.setBounds(329, 184, 114, 30);

        tablepanel.setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone Number", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
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

        getContentPane().add(panel);
        panel.setBounds(0, 0, 630, 601);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
       
        ds.add(nametf.getText(), numbertf.getText(), dateformat.format(date));
        JOptionPane.showMessageDialog(null,"Data Saved");
    }//GEN-LAST:event_enterActionPerformed

    private void showlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showlistActionPerformed
        
        String[] arr = ds.print();
        
        javax.swing.table.DefaultTableModel model;
        table.setModel(new javax.swing.table.DefaultTableModel(null,new String[] {"Name", "Phone Number", "Date"}));
       
        for(int i=0;i<arr.length-2;i++,i++,i++)
        {
            String str1 = arr[i];
            String str2 = arr[i+1];
            String str3 = arr[i+2];
            String[] data={str1,str2,str3};
            model=(javax.swing.table.DefaultTableModel) table.getModel();
            model.addRow(data);
        }
        
    }//GEN-LAST:event_showlistActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        String str = JOptionPane.showInputDialog(null, "Enter phone number: ");
        
        if(str==null)
        {
            
        }
        else if(str.length()<=0)
        {
            JOptionPane.showMessageDialog(null, "You have entered nothing");
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
            JOptionPane.showMessageDialog(null, "You have entered nothing");
        }
        
        else if(Pattern.matches("^[A-z]+$",str))
        {
            JOptionPane.showMessageDialog(null, "Please enter only number!");
        }
        
        else
        {
            String[] arr = ds.search(str);
            if(arr.equals(null))
            {
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            }
            
            else
            {
                JOptionPane.showMessageDialog(null, "Name: "+arr[0]+"\n"+"Phone No: "+arr[1]);
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

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        String [] arr = ds.print();
        
        try {
             FileWriter obj=new FileWriter("./TicketBooking.txt",true);
	     BufferedWriter ob=new BufferedWriter(obj);
             
             for(int i=0;i<arr.length-2;i++,i++,i++)
             {
                 ob.write(arr[i]+"\t\t\t\t"+arr[i+1]+"\t\t\t\t"+arr[i+2]+"\r\n");
             }
             ob.close();
             
             JOptionPane.showMessageDialog(null, "Data saved in TicketBooking file");
             
	}catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
	}
        
    }//GEN-LAST:event_saveActionPerformed

    private void searcholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcholdActionPerformed
        
        String str = JOptionPane.showInputDialog(null, "Enter phone number: ");
        
        if(str==null)
        {
            
        }
        else if(str.length()<=0)
        {
            JOptionPane.showMessageDialog(null, "You have entered nothing");
        }
        
        else if(Pattern.matches("^[A-z]+$",str))
        {
            JOptionPane.showMessageDialog(null, "Please enter only number!");
        }
        
        else
        {
        
            try {
                FileReader fr = new FileReader("./TicketBooking.txt");
                BufferedReader br=new BufferedReader(fr);
                String str2;
                while((str2=br.readLine())!=null)
                {
                    if(str2.contains(str))
                    {
                        JOptionPane.showMessageDialog(null, str2);
                        break;
                    }
                }

                br.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        
    }//GEN-LAST:event_searcholdActionPerformed

   
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
    private javax.swing.JButton enter;
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
