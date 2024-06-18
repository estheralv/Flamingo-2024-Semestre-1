package inicio;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class RegistroCadastro extends JFrame {
	
private JTextField usernameField;
private JPasswordField passwordField;
private JButton registerButton;

public RegistroCadastro() {

	setTitle("Register");
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setSize(300, 200);
	setLocationRelativeTo(null);
	
	JLabel usernameLabel = new JLabel("Username:");
	JLabel passwordLabel = new JLabel("Password:");
	usernameField = new JTextField();
	passwordField = new JPasswordField();
	registerButton = new JButton("Register");
	
	setLayout(new GridLayout(3, 2));
	add(usernameLabel);
	add(usernameField);
	add(passwordLabel);
	add(passwordField);
	add(new JLabel()); 
	add(registerButton);
	
	registerButton.addActionListener(new ActionListener() {
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
	
		String username = usernameField.getText();
		char[] password = passwordField.getPassword();
		
		createUserAccount(username, password);
		
		dispose();
		
		}
		
		});
		
		setVisible(true);
		
		}
		private void createUserAccount(String username, char[] password) {
		
		}
		public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
		
		new RegistroCadastro();
		
		});
		
		}
		
		}

