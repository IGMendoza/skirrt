package dat_phat_project_over_there;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Images extends JFrame{
	private ImageIcon image1;
	private JLabel label1;
	private ImageIcon image2;
	private JLabel label2;
	
	Images(){
		setLayout(new FlowLayout());
		if (rootPaneCheckingEnabled) {
			
		} else {

		}
		image1 = new ImageIcon(getClass().getResource("/skirrt/imgDir/eyeImg/Eblu.png﻿"));
		
		label1 = new JLabel(image1);
		add(label1);
		
		image2 = new ImageIcon(getClass().getResource("/skirrt/imgDir/hairImg/MHHBro.png"));
		
		label2 = new JLabel(image2);
		add(label2);
		
	}
	
	
}