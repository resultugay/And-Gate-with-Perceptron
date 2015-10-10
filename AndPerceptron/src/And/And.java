package And;
import static And.And.w;
import static And.And.x;
import static And.And.y;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class And extends JFrame implements ActionListener{

	public static double x [][] = {{-1,-1,-1},
								   {-1,+1,-1},
								   {-1,-1,+1},
								   {-1,+1,+1}};	
	public static double d [] = {-1,-1,-1,1};
	public static double y [] = {0,0,0,0};
	
	public static double w [] = {-0.5,1,1};
	
	public static JLabel x11;
	public static JLabel output;
	public static JLabel x22;
    public	static JLabel []xLabels;
    public static JLabel b11;
    public static JLabel w11;
    public static JLabel w22;
    public static JLabel []wLabels;
    
    public static JTextField x1Text;
    public static JTextField x2Text;
	public static JPanel generalPanel;
	public static JPanel altPanel;
    
	static JButton train;
	static JButton test;
	
	public And(){
		//Frame that holds all panels.
		JFrame schema = new JFrame();
		schema.setLayout(null);
		//General panel that holds all subpanels.
		generalPanel = new JPanel();
		generalPanel.setLayout(null);
		//generalPanel.setBackground(Color.gray);

		
		x11 = new JLabel("");
		x11.setSize(30,10);
		x11.setLocation(230, 210);

     	x22 = new JLabel("");
     	x22.setSize(30,10);
     	x22.setLocation(230, 260);
     	
    	JLabel x33 = new JLabel("1");
    	x33.setSize(30,10);
    	x33.setLocation(230, 300);
     	
         	
		xLabels = new JLabel[2];
		xLabels[0] = x11;
		xLabels[1] = x22;

		w11 = new JLabel("");
		w11.setSize(30,10);
		w11.setLocation(280, 220);

		w22 = new JLabel("");
		w22.setSize(30,10);
		w22.setLocation(280, 260);

		b11 = new JLabel("");
		b11.setSize(30,10);
		b11.setLocation(280, 300);

		
		wLabels = new JLabel[3];
		wLabels[0] = b11;
		wLabels[1] = w11;
		wLabels[2] = w22;
		
		train = new JButton("train");
		train.setSize(100,30);
		train.setLocation(700, 50);
		train.addActionListener(this);
		
		test = new JButton("test");
		test.setSize(100,30);
		test.setLocation(700, 100);
		test.setEnabled(false);
		test.addActionListener(this);
		
		
		output = new JLabel("");
		output.setSize(70,10);
		output.setLocation(435, 255);

		
		
		
		generalPanel.add(x11);
		generalPanel.add(x22);
		generalPanel.add(x33);
		generalPanel.add(b11);
		generalPanel.add(w11);
		generalPanel.add(w22);
		generalPanel.add(train);
		generalPanel.add(test);
		generalPanel.add(output);
		
		x1Text = new JTextField();
		x1Text.setSize(40,30);
		x1Text.setLocation(350, 15);
		
		x2Text = new JTextField();
		x2Text.setSize(40,30);
		x2Text.setLocation(450, 15);
		
		JLabel x1temp = new JLabel("X1 :");
		x1temp.setSize(30,10);
		x1temp.setLocation(320, 20);

		JLabel x2temp = new JLabel("X2 :");
		x2temp.setSize(30,10);
		x2temp.setLocation(420, 20);
		
		
		generalPanel.add(x1Text);
		generalPanel.add(x2Text);
		generalPanel.add(x1temp);
		generalPanel.add(x2temp);
		
		altPanel = new JPanel();
		altPanel.setLayout(null);
		
		shapes a = new shapes(altPanel);
		
		a.setLocation(100, 50);
		a.setSize(550,450);
		a.setBackground(Color.white);
		
		generalPanel.add(a);
		
		
		schema.setSize(1000, 600);
		schema.setLocation(100, 100);
		schema.setContentPane(generalPanel);
		schema.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		schema.setVisible(true);
	}
	
	public static void main(String [] args){
		And obj = new And();

				
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == train){
			train train2= new train();
			train2.start();
			test.setEnabled(true);
		}
		if(e.getSource() == test){
			double x1 = Double.parseDouble(x1Text.getText());
			double x2 = Double.parseDouble(x2Text.getText());
			double y = -1*w[0]+ x1 * w[1] + x2 * w[2];
			if(y >= 0){
				y = +1;
				output.setText("output :"+y);
			}
			else{
				y = -1;
				output.setText("output :"+y);
			}
			//JOptionPane.showMessageDialog(null, "Sonuc  " + y);
		}
	}
}
