package dat_phat_project_over_there;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame{
	Vector<Vector<String>>attributes;
	
	//variables
	int casehair = 0;
	int caseeye = 0;
	int caseskin = 0;
	
	public Main(String filename) throws IOException
	{
		System.out.println(casehair);
		
		Parser p1 = new Parser(filename);
		this.attributes=p1.get_attributes();
		
		setTitle("TestGUI");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//button
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		//MenuBar
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("Customize Avatar");
		JMenu item1 = new JMenu("Hair Colour");
		JMenu item2 = new JMenu("Eye Colour");
		JMenu item3 = new JMenu("Skin Colour");
		
		//Hair
		JMenuItem item1a = new JMenuItem("Red Hair");
		JMenuItem item1b = new JMenuItem("Black Hair");
		JMenuItem item1c = new JMenuItem("Blonde Hair");
		
		item1.add(item1a);
		item1.add(item1b);
		item1.add(item1c);
		
		//Eye
		JMenuItem item2a = new JMenuItem("Green Eyes");
		JMenuItem item2b = new JMenuItem("Brown Eyes");
		JMenuItem item2c = new JMenuItem("Blue Eyes");
		
		item2.add(item2a);
		item2.add(item2b);
		item2.add(item2c);
		
		//Skin
		JMenuItem item3a = new JMenuItem("Black Skin");
		JMenuItem item3b = new JMenuItem("White Skin");
		JMenuItem item3c = new JMenuItem("Yellow Skin");
			
		item3.add(item3a);
		item3.add(item3b);
		item3.add(item3c);
		
		
		//action listener for MenuItems HAIR
		item1a.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//this 1 means we want red hair
				casehair = 1;
				System.out.println(casehair);
				System.out.println(attributes.elementAt(0));
			}
		});
		item1b.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//this 2 means we want Black hair
				casehair = 2;
				System.out.println(casehair);
			}
		});
		item1c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//this 2 means we want Blonde hair
				casehair = 3;
				System.out.println(casehair);
			}
		}); 
	
		//action listener for MenuItems EYES
				item2a.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						//this 1 means we want green eyes
						caseeye = 1;
					}
				});
				item2b.addActionListener(new ActionListener() {
							
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						//this 2 means we want brown eyes
						caseeye = 2;
					}
				});
				item2c.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						//this 3 means we want blue eyes
						caseeye = 3;
					}
				}); 
		
		file.add(item1);
		file.add(item2);
		file.add(item3);
	
		menu.add(file);
		setJMenuBar(menu);
		
		
		
		
		
		//Layout
		Container pane =  getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(button));
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(button));
		gl.setAutoCreateContainerGaps(true);
	}
	
	public static void main(String[] args) throws IOException {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Main m = null;
				try {
					m = new Main(args[0]);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				m.setVisible(true);
				
			}
		});
		
	}
}

