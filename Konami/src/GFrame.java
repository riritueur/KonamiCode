import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4898263281564791339L;
	private JPanel contentPane;
	
	private App app = new App();
	private ArrayList<JLabel> labels = new ArrayList<JLabel>();
	public GFrame that = this;
	Sound s = new Sound();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GFrame frame = new GFrame();
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
	public GFrame() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 1000);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(200, 200, 198, 198);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(GFrame.class.getResource("ex3.png")));
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(400, 200, 198, 198);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(GFrame.class.getResource("ex5.png")));
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(600, 200, 198, 198);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(GFrame.class.getResource("ex0.png")));
		
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(200, 400, 198, 198);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(GFrame.class.getResource("ex1.png")));
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setBounds(400, 400, 198, 198);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(GFrame.class.getResource("ex4.png")));
		
		JLabel lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setBounds(600, 400, 198, 198);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon(GFrame.class.getResource("ex2.png")));
		
		JLabel lblNewLabel_6 = new JLabel();
		lblNewLabel_6.setBounds(200, 600, 198, 198);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(GFrame.class.getResource("ex7.png")));
		
		JLabel lblNewLabel_7 = new JLabel();
		lblNewLabel_7.setBounds(400, 600, 198, 198);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon(GFrame.class.getResource("ex8.png")));
		
		JLabel lblNewLabel_8 = new JLabel();
		lblNewLabel_8.setBounds(600, 600, 198, 198);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setIcon(new ImageIcon(GFrame.class.getResource("ex6.png")));
		
		JLabel bg = new JLabel();
		bg.setBounds(0,0,1000,1000);
		contentPane.add(bg);
		bg.setIcon(new ImageIcon(GFrame.class.getResource("orichalcosbg.jpg")));
		
		labels.add(lblNewLabel);
		labels.add(lblNewLabel_1);
		labels.add(lblNewLabel_2);
		labels.add(lblNewLabel_3);
		labels.add(lblNewLabel_4);
		labels.add(lblNewLabel_5);
		labels.add(lblNewLabel_6);
		labels.add(lblNewLabel_7);
		labels.add(lblNewLabel_8);
		
		lblNewLabel.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent evt){
				try {
					click(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_1.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent evt){
				try {
					click(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_2.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent evt){
				try {
					click(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_3.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent evt){
				try {
					click(4);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_4.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent evt){
				try {
					click(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_5.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent evt){
				try {
					click(6);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		lblNewLabel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_6.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent evt){
				try {
					click(7);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		lblNewLabel_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_7.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent evt){
				try {
					click(8);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		lblNewLabel_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_8.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent evt){
				try {
					click(9);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		lblNewLabel_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	
	public void click(int a) throws InterruptedException{
		if(a == 1){
			if(app.orders[1] == 0){
				reverse(1,2);
			}
			if(app.orders[3] == 0){
				reverse(1,4);
			}
		}
		if(a == 2){
			if(app.orders[0] == 0){
				reverse(1,2);
			}
			if(app.orders[4] == 0){
				reverse(5,2);
			}
			if(app.orders[2] == 0){
				reverse(3,2);
			}
		}
		if(a == 3){
			if(app.orders[1] == 0){
				reverse(3,2);
			}
			if(app.orders[5] == 0){
				reverse(6,3);
			}
		}
		if(a == 4){
			if(app.orders[0] == 0){
				reverse(1,4);
			}
			if(app.orders[4] == 0){
				reverse(5,4);
			}
			if(app.orders[6] == 0){
				reverse(7,4);
			}
		}
		if(a == 5){
			if(app.orders[1] == 0){
				reverse(5,2);
			}
			if(app.orders[3] == 0){
				reverse(5,4);
			}
			if(app.orders[5] == 0){
				reverse(5,6);
			}
			if(app.orders[7] == 0){
				reverse(5,8);
			}
		}
		if(a == 6){
			if(app.orders[2] == 0){
				reverse(3,6);
			}
			if(app.orders[4] == 0){
				reverse(5,6);
			}
			if(app.orders[8] == 0){
				reverse(9,6);
			}
		}
		if(a == 7){
			if(app.orders[3] == 0){
				reverse(4,7);
			}
			if(app.orders[7] == 0){
				reverse(8,7);
			}
		}
		if(a == 8){
			if(app.orders[4] == 0){
				reverse(5,8);
			}
			if(app.orders[6] == 0){
				reverse(7,8);
			}
			if(app.orders[8] == 0){
				reverse(9,8);
			}
		}
		if(a == 9){
			if(app.orders[7] == 0){
				reverse(8,9);
			}
			if(app.orders[5] == 0){
				reverse(6,9);
			}
		}
	}

	public void reverse(int a, int b) throws InterruptedException{
		ImageIcon tmp = (ImageIcon)labels.get(a-1).getIcon();
		labels.get(a-1).setIcon((ImageIcon)labels.get(b-1).getIcon());
		labels.get(b-1).setIcon(tmp);
		app.reverse(a, b);
		if(app.isCompleted()){
			finish();
		}
	}
	
	public void finish() throws InterruptedException{
		ImageIcon bgg = new ImageIcon(GFrame.class.getResource("ex.gif"));
		contentPane.removeAll();
		s.play();
		JLabel bgf = new JLabel();
		bgf.setBounds(0,0,998,964);
		contentPane.add(bgf);
		bgf.setIcon(bgg);
		Timer timer = new Timer(500, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				JOptionPane.showMessageDialog((Component)contentPane, "Look at your desktop.", "↑ ↑ ↓ ↓ ← → ← → B A", JOptionPane.WARNING_MESSAGE);
				try {
					FileGenerator.generate();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.exit(ABORT);
			}
		});
		timer.start();
	}
}
