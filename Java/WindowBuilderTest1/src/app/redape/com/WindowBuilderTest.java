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
import java.text.DecimalFormat;
import javax.swing.JFormattedTextField;

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
		setBounds(100, 100, 388, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent click) {
				
				double result = Double.valueOf(weight.getText())/(Double.valueOf(height.getText())*Double.valueOf(height.getText()))*10000;										
				DecimalFormat df = new DecimalFormat("#.00");
				String resultStr  = df.format(result);
				textField.setText(resultStr);
			}
		});
		btnCalculate.setBounds(149, 145, 97, 25);
		contentPane.add(btnCalculate);
		
		weight = new JTextField();
		weight.setBounds(149, 33, 116, 22);
		contentPane.add(weight);
		weight.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Weight [kg]");
		lblNewLabel.setBounds(50, 36, 71, 16);
		contentPane.add(lblNewLabel);
		
		height = new JTextField();
		height.setBounds(149, 66, 116, 22);
		contentPane.add(height);
		height.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Height [cm]");
		lblNewLabel_1.setBounds(50, 69, 71, 16);
		contentPane.add(lblNewLabel_1);
		
		lblBmi = new JLabel("BMI");
		lblBmi.setBounds(50, 102, 71, 16);
		contentPane.add(lblBmi);
		
		textField = new JTextField();
		textField.setBounds(149, 99, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index Calculator");
		lblBodyMassIndex.setBounds(118, 8, 168, 14);
		contentPane.add(lblBodyMassIndex);
	}
}
