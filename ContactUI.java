package contact;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eskandar Atrakchi 23137517
 */
public class ContactUI extends javax.swing.JFrame {

    ArrayList < Contact > cList = new ArrayList < > () ;
    
    /**
     * Creates new form ContactUI
     */
    public ContactUI() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        firstnameTF = new javax.swing.JTextField();
        lastnameTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        firstnameLBL = new javax.swing.JLabel();
        lastnameLBL = new javax.swing.JLabel();
        phoneLBL = new javax.swing.JLabel();
        emailLBL = new javax.swing.JLabel();
        addBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        clearBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        fileBTN = new javax.swing.JButton();
        readfromfileBTN = new javax.swing.JButton();
        typeTOGGLE = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstnameLBL.setText("First Name");

        lastnameLBL.setText("Last Name");

        phoneLBL.setText("Phone Number");

        emailLBL.setText("Email");

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        displayBTN.setText("Display");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        displayTA.setEditable(false);
        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        clearBTN.setText("Clear");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        fileBTN.setText("Add to File");
        fileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileBTNActionPerformed(evt);
            }
        });

        readfromfileBTN.setText("Read From File");
        readfromfileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readfromfileBTNActionPerformed(evt);
            }
        });

        typeTOGGLE.setText("Type?");
        typeTOGGLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeTOGGLEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(searchBTN)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBTN)
                        .addGap(18, 18, 18)
                        .addComponent(clearBTN)
                        .addGap(18, 18, 18)
                        .addComponent(displayBTN)
                        .addGap(18, 18, 18)
                        .addComponent(addBTN))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(firstnameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(firstnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(phoneLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(emailLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lastnameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lastnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(typeTOGGLE, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(readfromfileBTN)
                                .addGap(18, 18, 18)
                                .addComponent(fileBTN)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnameLBL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameLBL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLBL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLBL))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileBTN)
                    .addComponent(readfromfileBTN)
                    .addComponent(typeTOGGLE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(exitBTN)
                    .addComponent(displayBTN)
                    .addComponent(clearBTN)
                    .addComponent(deleteBTN)
                    .addComponent(searchBTN))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>                        

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {                                       

        if (firstnameTF.getText().isEmpty() == true 
                || lastnameTF.getText().isEmpty() == true 
                || emailTF.getText().isEmpty() == true 
                || phoneTF.getText().isEmpty() == true) {
            
            JOptionPane.showMessageDialog(null, "Fill out the fields first please!");
            
        } else {
            
            String lastName = lastnameTF.getText() ;
            String firstName = firstnameTF.getText() ;
            String email = emailTF.getText( ) ;
            String phone = phoneTF.getText()    ;

            Contact c = new Contact (firstName, lastName , email , phone);

            cList.add(c);

            JOptionPane.showMessageDialog(null, "Added successfully!");

        }
        
    }                                      

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        Contact c;
       
        if (cList.isEmpty() == true) {
            
            JOptionPane.showConfirmDialog(null , "There is nothing to display!");
            
        } else {
            
            for (int i = 0; i < cList.size() ; i ++ ) {
            
                c = cList.get(i);
                displayTA.append("\n" + c.toString()  + "\n");

            }
        }
        
    }                                          

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        firstnameTF.setText(null);
        lastnameTF.setText(null);
        emailTF.setText(null);
        phoneTF.setText(null);
        displayTA.setText(null);
        
    }                                        

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        System.exit(0);
        JOptionPane.showMessageDialog(null, "Bye-Bye!");
    }                                       

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        String phone = phoneTF.getText();

        Contact c = null;

        for (Contact contact : cList) {
            if (contact.getPhone().equalsIgnoreCase(phone)) {
               
                c = contact;
                if (c != null) {
            
                    cList.remove(c);
                    JOptionPane.showMessageDialog(null, "Removed successfully!");
                    break;
                    
                }
            }
        }
    }                                         

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        String phone = phoneTF.getText();

        Contact c = null;

        for (Contact contact : cList) {
            if (contact.getPhone().equalsIgnoreCase(phone)) {
               
                c = contact;
                displayTA.append(c.toString()) ;
                break;
                
            }
        }
    }                                         

    private void fileBTNActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        File f;
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try {
            
            f = new File ("data.dat") ;
            fos = new FileOutputStream (f) ;
            oos = new ObjectOutputStream (fos) ;
            
            String firstName = firstnameTF.getText();
            String lastName = lastnameTF.getText();
            String email = emailTF.getText( );
            String phone = phoneTF.getText();
            
            Contact c = new Contact (firstName , lastName , email , phone) ;
            
            cList.add(c);
            oos.writeObject(cList);
            
            oos.close();
            JOptionPane.showMessageDialog(null , "Written successfully to file!");
            
        } catch (IOException e) {
            
            System.out.println(e);
            JOptionPane.showMessageDialog(null , e);
            
        }
        
    }                                       

    private void readfromfileBTNActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
        File f ;
        FileInputStream fis ;
        ObjectInputStream ois ;
        
        try {
            
            f = new File ("data.dat") ;
            fis = new FileInputStream (f) ;
            ois = new ObjectInputStream (fis ) ;
            
            cList = (ArrayList < Contact > ) ois.readObject();
            
            displayTA.append(cList.toString());
            
        } catch (IOException | ClassNotFoundException e ) {//catch with IO and class not found exception e
            
            //notify the user 
            JOptionPane.showMessageDialog(null , e);
            
        }
    }                                               

    private void typeTOGGLEActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        Business c = new Business () ;// instance from Contact class 
        
        if (typeTOGGLE.isSelected() == true ) { // if it is selected 
           
            JOptionPane.showMessageDialog(null , "Business type been selected.");
            
            typeTOGGLE.setText("Business");
            
            //setting the setter method to Book type 
            
            c.setType("Business");
            
            cList.add(c);
            
        } else  { // if it is not selected
            
            JOptionPane.showMessageDialog(null , "Contact type been selected.") ;
            
            c.setType("Contact");//setting the setter method to Contact 
            
            typeTOGGLE.setText("Contact");
            
            cList.add(c);
            
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
            java.util.logging.Logger.getLogger(ContactUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addBTN;
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton displayBTN;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton fileBTN;
    private javax.swing.JLabel firstnameLBL;
    private javax.swing.JTextField firstnameTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastnameLBL;
    private javax.swing.JTextField lastnameTF;
    private javax.swing.JLabel phoneLBL;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JButton readfromfileBTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JToggleButton typeTOGGLE;
    // End of variables declaration                   
}
