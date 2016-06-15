package app.redape.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WindowBuilderTest extends JFrame {

	private JPanel contentPane;
	private JTextField weight;
	private JTextField height;
	private JLabel lblNewLabel_1;
	private JLabel lblBmi;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderTest frame = new WindowBuilderTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilderTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("Results");;
			}
		});
		btnCalculate.setBounds(254, 394, 97, 25);
		contentPane.add(btnCalculate);
		
		weight = new JTextField();
		weight.setBounds(118, 33, 116, 22);
		contentPane.add(weight);
		weight.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Weight");
		lblNewLabel.setBounds(50, 36, 56, 16);
		contentPane.add(lblNewLabel);
		
		height = new JTextField();
		height.setBounds(118, 72, 116, 22);
		contentPane.add(height);
		height.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Height");
		lblNewLabel_1.setBounds(50, 75, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		lblBmi = new JLabel("BMI");
		lblBmi.setBounds(50, 115, 56, 16);
		contentPane.add(lblBmi);
		
		textField = new JTextField();
		textField.setBounds(118, 112, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
