/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.am.client.EventDTO;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

/**
 *
 * @author Tecnico
 */
public class ListEventsForm extends javax.swing.JFrame {

    List<EventDTO> returnedEvents;
    String username = "";
    String password = "";

    /**
     * Creates new form ListEventsForm
     *
     * @param returnedEvents
     */
    public ListEventsForm(List<EventDTO> returnedEvents, String username, String password) throws ParseException {
        initComponents();
        this.returnedEvents = returnedEvents;
        this.username = username;
        this.password = password;

        jLabel_currentUser.setText(username);
        System.out.println(username);
        actualizarListaEventos();
        // JOptionPane.showMessageDialog(null, returnedEvents);
       /* jList1.setListData(returnedEvents);
         for (EventDTO event : returnedEvents) {
         jList1.add(event.getName(), this);
         }
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_currentUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Event", "Start Date", "Close Date", "IN PROGRESS", "OPEN", "Key Confirm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Confirm Presence");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(jButton1)
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("My Events List");

        jLabel1.setText("Username :");

        jLabel_currentUser.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_currentUser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_currentUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //it will validate if the key is write on the event in progress
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
        Date date = new Date();

        int i = 0;
<<<<<<< HEAD
       // System.out.println("tamanho lista eventos:" + returnedEvents.size());
        //System.out.println("»»»»»KEY PRIMEIRO ELEMENTO =" + jTable2.getModel().getValueAt(0, 4).toString());
        //System.out.println("»»»»»KEY SEGUNDO ELEMENTO =" + jTable2.getModel().getValueAt(1, 4).toString());
        boolean oneToSubmmit = false;
        for (i = 0; i <= (returnedEvents.size() - 1); i++) {
           // System.out.println("#####SIZE:" + returnedEvents.size());
            try {
               // System.out.println("»»»»»1");
              //  System.out.println("»»»»»ESTA EM PROGRESSO ->" + isInProgress(dateFormat.format(date), returnedEvents.get(i).getStartDate(), returnedEvents.get(i).getFinishDate()));
               // System.out.println("»»»»»TEM KEY =" + jTable2.getModel().getValueAt(i, 4).toString());
                if (isInProgress(dateFormat.format(date), returnedEvents.get(i).getStartDate(), returnedEvents.get(i).getFinishDate())
                        && !jTable2.getModel().getValueAt(i, 4).toString().equals("")) {
                    System.out.println("»»»»»ENTROU");
                    //its an event in progress that have the key with some input text by the user
                  //  System.out.println("Evento Preenchido com key : " + jTable2.getModel().getValueAt(i, 4));
                    changeKeyOnEvent(returnedEvents.get(i).getId(), jTable2.getModel().getValueAt(i, 4).toString());
                    //TODO - it will commit the key for the rest service
                    //TODO - how he confirm that the key is stored by the rest service?
                    oneToSubmmit = true;
                    break;
                }

=======
        System.out.println("tamanho lista eventos:" + returnedEvents.size());
        boolean oneToSubmmit=false;
        for (i = 0; i < returnedEvents.size(); i++) {
           
            try {
                if (isInProgress(dateFormat.format(date), returnedEvents.get(i).getStartDate(), returnedEvents.get(i).getFinishDate()) 
                        && jTable2.getModel().getValueAt(i, 5).toString() != "" && returnedEvents.get(i).isOpenForPresence()) {

                    //its an event in progress that have the key with some input text by the user
                    System.out.println("Evento Preenchido com key : " + jTable2.getModel().getValueAt(i, 5));
                    changeKeyOnEvent(returnedEvents.get(i).getId(), jTable2.getModel().getValueAt(i, 5).toString());
                    //TODO - it will commit the key for the rest service
                    //TODO - how he confirm that the key is stored by the rest service?
                    oneToSubmmit=true;
                }
               
                
>>>>>>> 810acc2af5d9bbb05a45f4c1af2b2b6815aa335f
            } catch (ParseException ex) {
                Logger.getLogger(ListEventsForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
<<<<<<< HEAD
        if (!oneToSubmmit) {
            JOptionPane.showMessageDialog(null, "No key on Event InProgress to submmit!");
        }
=======
         if(!oneToSubmmit)
                 JOptionPane.showMessageDialog(null, "ERROR !!! \n Verify if you have a KEY on event that is OPEN and IN PROGRESS for submmit presence !");
>>>>>>> 810acc2af5d9bbb05a45f4c1af2b2b6815aa335f


    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ListEventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListEventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListEventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListEventsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_currentUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void actualizarListaEventos() throws ParseException {
        if (returnedEvents != null) {
            Object[] dataTitle = {"Event", "Start Date", "Close Date", "IN PROGRESS","OPEN" ,"Key Confirm"};
            Object[][] dataRow = new Object[returnedEvents.size()][6];

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
            Date date = new Date();
            //System.out.println(dateFormat.format(date));

            int x = 0;
            for (EventDTO event : returnedEvents) {
                System.out.println("OPENS EV------"+ event.isOpenForPresence());
                dataRow[x][0] = event.getName();
                dataRow[x][1] = event.getStartDate();
                dataRow[x][2] = event.getFinishDate();
                if (isInProgress(dateFormat.format(date), event.getStartDate(), event.getFinishDate())) {
                    dataRow[x][3] = "IN PROGRESS";
                } else {
                    dataRow[x][3] = "NOT IN PROGRESS";
                }
                 if (event.isOpenForPresence()) {
                    dataRow[x][4]  = "Open";
                } else {
                     dataRow[x][4]  = "Close";
                }
                //dataRow[x][4] = event.isOpenForPresence();

                dataRow[x][5] = ""; //key  presenca

                x++;
            }

            final DefaultTableModel model2 = new DefaultTableModel(dataRow, dataTitle) {
                Class[] types = new Class[]{
<<<<<<< HEAD
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.String.class, java.lang.String.class
=======
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
>>>>>>> 810acc2af5d9bbb05a45f4c1af2b2b6815aa335f
                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false,false, true
                };

                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }

            };
            model2.addTableModelListener(new TableModelListener() {

                @Override
                public void tableChanged(TableModelEvent e) {

                }
            });
            jTable2.setModel(model2);
            //t.setModel(model2);
        }
    }

    // it will verify if the events are in progress or not
    private boolean isInProgress(String current_date, String start_date, String finish_date) throws ParseException {
        if (compareDates(start_date, current_date) && compareDates(current_date, finish_date)) {
            return true;
        }
        return false;
    }

    public static boolean compareDates(String psDate1, String psDate2) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
        Date date1 = dateFormat.parse(psDate1);
        Date date2 = dateFormat.parse(psDate2);
        if (date2.after(date1)) {
            return true;
        } else {
            return false;
        }
    }

    private void changeKeyOnEvent(Long event_id, String key) {

        String baseUri = "http://localhost:8080/PresencesEnterprise_RESTWS/webapi";
        Client client = ClientBuilder.newClient();

        HttpAuthenticationFeature feature = null;
<<<<<<< HEAD
=======
        System.out.println("HTTP REQUEST :  user + pass"+username+" -> "+ password);
>>>>>>> 810acc2af5d9bbb05a45f4c1af2b2b6815aa335f
        feature = HttpAuthenticationFeature.basic(username, password);
        client.register(feature);

        String resposta = "";
        try {
            //System.out.println("teste-2");
            resposta = client.target(baseUri)
                    .path("/events/attendant_event_update_key")
                    .queryParam("event_id", event_id)
                    .queryParam("key", key)
                    .request(MediaType.APPLICATION_XML)
                    .get(new GenericType<String>() {
                    });

            JOptionPane.showMessageDialog(null, resposta);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            // System.out.println("teste-ERROR");
            System.err.println(e.getMessage());
        }

    }

}
