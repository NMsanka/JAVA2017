import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userDetails extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JButton exitButton;


  public userDetails(String username){
    setContentPane(panel1);
    pack();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);

      exitButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.exit(0);
          }
      });
  }


}
