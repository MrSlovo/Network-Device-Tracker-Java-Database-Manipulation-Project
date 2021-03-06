
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nngob
 */
public class AddScreen extends javax.swing.JFrame {

  /**
   * Creates new form AddScreen
   */
  public AddScreen() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    Main = new javax.swing.JPanel();
    LeftLabels = new javax.swing.JPanel();
    lblDeviceName = new javax.swing.JLabel();
    lblPrice = new javax.swing.JLabel();
    lblDescription = new javax.swing.JLabel();
    lblNumOfPorts = new javax.swing.JLabel();
    lblProtocol = new javax.swing.JLabel();
    lblProtocol1 = new javax.swing.JLabel();
    RightInputs = new javax.swing.JPanel();
    txtDeviceName = new javax.swing.JTextField();
    txtDevicePrice = new javax.swing.JTextField();
    txtDeviceNumOfPorts = new javax.swing.JTextField();
    txtDefinition = new javax.swing.JTextField();
    spnrProtocols = new javax.swing.JSpinner();
    tglbtnSignalBoosting = new javax.swing.JRadioButton();
    btnAddDevice = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    lblDeviceName.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    lblDeviceName.setText("Device Name :");

    lblPrice.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    lblPrice.setText("Price :");

    lblDescription.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    lblDescription.setText("Description :");

    lblNumOfPorts.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    lblNumOfPorts.setText("Num. of Ports :");

    lblProtocol.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    lblProtocol.setText("Signal Boosting :");

    lblProtocol1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    lblProtocol1.setText("Protocol :");

    javax.swing.GroupLayout LeftLabelsLayout = new javax.swing.GroupLayout(LeftLabels);
    LeftLabels.setLayout(LeftLabelsLayout);
    LeftLabelsLayout.setHorizontalGroup(
      LeftLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(LeftLabelsLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(LeftLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblDeviceName, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblDescription, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblProtocol1, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblNumOfPorts, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblProtocol, javax.swing.GroupLayout.Alignment.TRAILING))
        .addContainerGap())
    );
    LeftLabelsLayout.setVerticalGroup(
      LeftLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(LeftLabelsLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lblDeviceName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(lblNumOfPorts, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(lblProtocol1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(lblProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    txtDeviceName.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    txtDeviceName.setText("Enter Device Name");

    txtDevicePrice.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    txtDevicePrice.setText("Enter Device Price");

    txtDeviceNumOfPorts.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    txtDeviceNumOfPorts.setText("Enter Number of Ports");

    txtDefinition.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    txtDefinition.setText("Describe Device Functionality");

    spnrProtocols.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    spnrProtocols.setModel(new javax.swing.SpinnerListModel(new String[] {"Device Name", "Price", "Num. of Ports", "Protocol", "Signal Boost"}));

    tglbtnSignalBoosting.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    tglbtnSignalBoosting.setText("Signal Boosting");

    javax.swing.GroupLayout RightInputsLayout = new javax.swing.GroupLayout(RightInputs);
    RightInputs.setLayout(RightInputsLayout);
    RightInputsLayout.setHorizontalGroup(
      RightInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(RightInputsLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(RightInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtDevicePrice)
          .addComponent(txtDeviceName)
          .addComponent(txtDeviceNumOfPorts)
          .addComponent(txtDefinition, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
          .addGroup(RightInputsLayout.createSequentialGroup()
            .addGroup(RightInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(spnrProtocols, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tglbtnSignalBoosting))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    RightInputsLayout.setVerticalGroup(
      RightInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(RightInputsLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtDeviceName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(txtDevicePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(txtDeviceNumOfPorts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(txtDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(spnrProtocols, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(tglbtnSignalBoosting, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(28, Short.MAX_VALUE))
    );

    btnAddDevice.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
    btnAddDevice.setText("Add Record");
    btnAddDevice.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddDeviceActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
    Main.setLayout(MainLayout);
    MainLayout.setHorizontalGroup(
      MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(MainLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(LeftLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(RightInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(23, Short.MAX_VALUE))
      .addGroup(MainLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(btnAddDevice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    MainLayout.setVerticalGroup(
      MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(MainLayout.createSequentialGroup()
        .addGap(46, 46, 46)
        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(RightInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(LeftLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(btnAddDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(55, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 751, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 0, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 505, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 0, Short.MAX_VALUE)))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnAddDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeviceActionPerformed
    try {
      // Gets Values for record
      String device = txtDeviceName.getText();
      Double price = Double.parseDouble(txtDevicePrice.getText());
      int numOfPorts = Integer.parseInt(txtDeviceNumOfPorts.getText());
      String description = txtDefinition.getText();
      boolean signalBoosting = tglbtnSignalBoosting.isSelected();
      String protocol = spnrProtocols.getValue().toString();

      // Creates the record
      try {
        DbConnect dbObj = new DbConnect("tblNetworkDevices.accdb");
        dbObj.addField(device, price, numOfPorts, protocol, description, signalBoosting ? "TRUE" : "FALSE");
      } catch (ClassNotFoundException e) {
        JOptionPane.showMessageDialog(null, "Error creating record");
      }

      // Goes back to main screen
      this.setVisible(false);
      new MainScreen().setVisible(true);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Error in input validaion: " + e);
    }

  }//GEN-LAST:event_btnAddDeviceActionPerformed

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
      java.util.logging.Logger.getLogger(AddScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(AddScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(AddScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(AddScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AddScreen().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel LeftLabels;
  private javax.swing.JPanel Main;
  private javax.swing.JPanel RightInputs;
  private javax.swing.JButton btnAddDevice;
  private javax.swing.JLabel lblDescription;
  private javax.swing.JLabel lblDeviceName;
  private javax.swing.JLabel lblNumOfPorts;
  private javax.swing.JLabel lblPrice;
  private javax.swing.JLabel lblProtocol;
  private javax.swing.JLabel lblProtocol1;
  private javax.swing.JSpinner spnrProtocols;
  private javax.swing.JRadioButton tglbtnSignalBoosting;
  private javax.swing.JTextField txtDefinition;
  private javax.swing.JTextField txtDeviceName;
  private javax.swing.JTextField txtDeviceNumOfPorts;
  private javax.swing.JTextField txtDevicePrice;
  // End of variables declaration//GEN-END:variables
}
