package dat_phat_project_over_there;

import java.awt.Container;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Vector;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Main extends JFrame{
	Vector<Vector<String>>attributes;
	
	//variables
	int casehair = 0;
	int caseeye = 0;
	int caseskin = 0;
	int casegender = 0;
	
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
		JMenu item4 = new JMenu("Gender");
		
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
		
		//Gender
		JMenuItem item4a = new JMenuItem("Male");
		JMenuItem item4b = new JMenuItem("Female");
					
		item4.add(item4a);
		item4.add(item4b);
		
		
		//action listener for MenuItems HAIR
		item1a.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//this 1 means we want red hair
				casehair = 1;
				System.out.println(casehair);
				System.out.println(attributes.elementAt(0));
				//create a new vector and add the vector to the vector
				Vector vh1 = new Vector();
				vh1.setSize(4);
				extracted(vh1);
				
				//modify the new vector vh1
				vh1.setElementAt("AB", 3);
				System.out.println(vh1.get(3));
				
				//copy the value into the old vector
				attributes.insertElementAt((Vector<String>) vh1, 0);
				
				attributes.setElementAt(vh1, 0);
				System.out.println(attributes.elementAt(0));
				//reload image after editing
			}

			private void extracted(Vector vh1) {
				Collections.copy(vh1, attributes.get(0));
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
		file.add(item4);
	
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
		
		
		Images gui = new Images();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.pack();
		gui.setTitle("images");
		
		
		//whatever
		File f = new File(C:\Users\Adnan\Documents\GitHub\skirrt\imgDir\bodyImg\bianca.png);
		Desktop d = Desktop.getDesktop();
		d.open(f);
		System.out.println("image sample");
		
}
}

