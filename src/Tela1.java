import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Tela1 implements ActionListener{

	JLabel label;
	JTextField textField;
	
	public Tela1() {

		//Implementando método actionperformed, actionlistner
		JFrame frame = new JFrame("Título da tela");
		frame.setVisible(true);
		frame.setSize(400, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		textField = new JTextField(10);
		frame.add(textField);
		
		JButton button = new JButton("Executar");
		button.addActionListener(this);//Função que adiciona ação ao botão fazendo referência a ela mesma
		frame .add(button);
	
		label = new JLabel("Texto");
		frame.add(label);

		
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

			new Tela1();
			
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {//Método que adiciona a ção ao botão

		label.setText(textField.getText());
		textField.setText("");
	
	}

}
