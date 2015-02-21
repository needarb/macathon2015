/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Benjamin Mathers
 */
public class DialoguePanel extends javax.swing.JPanel {

    /**
     * Creates new form DialoguePanel2
     */


    public DialoguePanel() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();
        companionLabel = new javax.swing.JLabel();
        messagePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();
        responePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        responseArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        changeIDStateButton = new javax.swing.JButton();
        endDialogueButton = new javax.swing.JButton();
        leftSidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1012, 751));

        jPanel1.setBackground(new java.awt.Color(150, 0, 118));

        jLabel2.setFont(new java.awt.Font("Vani", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bear or Orangutan");
        jPanel1.add(jLabel2);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 218, 247)));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new java.awt.GridLayout(2, 3, 0, 15));

        descriptionArea.setEditable(false);
        descriptionArea.setColumns(20);
        descriptionArea.setLineWrap(true);
        descriptionArea.setRows(5);
        descriptionArea.setText("Would you rather be a cuddly orangutan, or a fuzzy-wuzzy bear? Why?");
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setAutoscrolls(false);
        descriptionArea.setBorder(null);
        descriptionArea.setFocusable(false);
        descriptionArea.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(descriptionArea);

        jPanel2.add(jScrollPane1);

        companionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companionLabel.setText("Speaking With Anonymous Magpie");
        jPanel2.add(companionLabel);

        messagePanel.setBackground(new java.awt.Color(255, 255, 255));
        messagePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 218, 247)));

        messageArea.setEditable(false);
        messageArea.setColumns(20);
        messageArea.setLineWrap(true);
        messageArea.setRows(5);
        messageArea.setWrapStyleWord(true);
        messageArea.setAutoscrolls(false);
        messageArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 218, 247)));
        messageArea.setFocusable(false);
        messageArea.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(messageArea);

        javax.swing.GroupLayout messagePanelLayout = new javax.swing.GroupLayout(messagePanel);
        messagePanel.setLayout(messagePanelLayout);
        messagePanelLayout.setHorizontalGroup(
                messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(messagePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                                .addContainerGap())
        );
        messagePanelLayout.setVerticalGroup(
                messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(messagePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2)
                                .addContainerGap())
        );

        responePanel.setBackground(new java.awt.Color(255, 255, 255));

        responseArea.setColumns(20);
        responseArea.setLineWrap(true);
        responseArea.setRows(5);
        responseArea.setWrapStyleWord(true);
        responseArea.setAutoscrolls(false);
        responseArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 218, 247)));
        responseArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                responseAreaKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(responseArea);

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout responePanelLayout = new javax.swing.GroupLayout(responePanel);
        responePanel.setLayout(responePanelLayout);
        responePanelLayout.setHorizontalGroup(
                responePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(responePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sendButton)
                                .addContainerGap(112, Short.MAX_VALUE))
        );
        responePanelLayout.setVerticalGroup(
                responePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, responePanelLayout.createSequentialGroup()
                                .addGroup(responePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(responePanelLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sendButton))
                                        .addGroup(responePanelLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        changeIDStateButton.setText("Reveal ID");
        changeIDStateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeIDStateButtonActionPerformed(evt);
            }
        });

        endDialogueButton.setText("End Dialogue");
        endDialogueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDialogueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(changeIDStateButton)
                                .addGap(18, 18, 18)
                                .addComponent(endDialogueButton)
                                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(changeIDStateButton)
                                        .addComponent(endDialogueButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leftSidePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/plaid.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(122, 19));
        jLabel1.setMinimumSize(new java.awt.Dimension(122, 19));
        jLabel1.setPreferredSize(new java.awt.Dimension(122, 19));

        javax.swing.GroupLayout leftSidePanelLayout = new javax.swing.GroupLayout(leftSidePanel);
        leftSidePanel.setLayout(leftSidePanelLayout);
        leftSidePanelLayout.setHorizontalGroup(
                leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftSidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addContainerGap())
        );
        leftSidePanelLayout.setVerticalGroup(
                leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftSidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        rightSidePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/plaid.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setMaximumSize(new java.awt.Dimension(122, 19));
        jLabel3.setMinimumSize(new java.awt.Dimension(122, 19));
        jLabel3.setPreferredSize(new java.awt.Dimension(122, 19));

        javax.swing.GroupLayout rightSidePanelLayout = new javax.swing.GroupLayout(rightSidePanel);
        rightSidePanel.setLayout(rightSidePanelLayout);
        rightSidePanelLayout.setHorizontalGroup(
                rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightSidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addContainerGap())
        );
        rightSidePanelLayout.setVerticalGroup(
                rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightSidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(leftSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(responePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rightSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(messagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(responePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(leftSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rightSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
    }// </editor-fold>                        

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == sendButton){
            updateTextArea();
        }
    }

    private void responseAreaKeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == evt.VK_ENTER){
            updateTextArea();
        }
    }

    private void changeIDStateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        changeIDStateButton.setText("ID Revealed");
        changeIDStateButton.setEnabled(false);
        String existingText = messageArea.getText();
        messageArea.setText(existingText + System.lineSeparator() + "Reveal Request Sent" + System.lineSeparator());
        Timer timer = new Timer( 1000, new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                String existingText = messageArea.getText();
                String bResponse = "Anonymous Magpie has accepted your request!" + System.lineSeparator() + "Anonymous Narwhal is Ben Mathers" + System.lineSeparator() + "Anonymous Magpie is Matthias Broderson";
                messageArea.setText(existingText + bResponse + System.lineSeparator());
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    private void endDialogueButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String existingText = messageArea.getText();
        messageArea.setText(System.lineSeparator() + "Anonymous Narwhal has opted to end the dialogue");
        Timer timer = new Timer( 1000, new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                System.exit(0);
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    private void updateTextArea(){
        String text = responseArea.getText();
        String existingText = messageArea.getText();
        messageArea.setText(existingText + "Anonymous Narwhal: " + text + System.lineSeparator());
        Timer timer = new Timer( 1000, new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                String existingText = messageArea.getText();
                String bResponse = "Anonymous Magpie: But Orangutans are so smart and cuddly! Why do you like Bears?";
                messageArea.setText(existingText + bResponse + System.lineSeparator());
            }
        });
        timer.setRepeats( false );
        timer.start();

        responseArea.setText("");
    }

    private void delay(){
        Timer timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){}
        });
        timer.setInitialDelay(1000);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton changeIDStateButton;
    private javax.swing.JLabel companionLabel;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JButton endDialogueButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel leftSidePanel;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JPanel messagePanel;
    private javax.swing.JPanel responePanel;
    private javax.swing.JTextArea responseArea;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JButton sendButton;
    // End of variables declaration                   
}
