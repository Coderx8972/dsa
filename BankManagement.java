import javax.swing.*;
public class BankManagement{
    private final JFrame menuFrame=new JFrame("BankManagement");
    ImageIcon image=new ImageIcon("../images/banking-system.png");
    private final JLabel menuLabel=new JLabel(image);
    private final JButton loginButton=new JButton("Login");
    private final JButton registerButton=new JButton("Register");
    private final JButton exitButton=new JButton("Exit");
    public static void main(String[] args) {
        BankManagement bankApp=new BankManagement();
        bankApp.mainMenu();
    }
    private void mainMenu(){
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(500,500);
        menuFrame.setLayout(null);
        menuLabel.setBounds(0,0,500,500);
        loginButton.setBounds(150,50,200,100);
        registerButton.setBounds(150,160,200,100);
        exitButton.setBounds(150,270,200,100);
        menuFrame.add(menuLabel);
        menuFrame.add(loginButton);
        menuFrame.add(registerButton);
        menuFrame.add(exitButton);
        menuFrame.setVisible(true);
    }
}
