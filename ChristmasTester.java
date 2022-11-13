import javax.swing.*;
import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ChristmasTester {

	public static void main(String[] args) {
		System.out.println("+-------------------------------------+");
		System.out.println("|              Hey, buddy!            |");
		System.out.println("|   Do you want to see the snowman?   |");
		System.out.println("|     Type yes to see him, typing     |");
		System.out.println("|   anything else is considered a no. |");
		System.out.println("|Press enter after you are done typing|");
		System.out.println("+-------------------------------------+");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int w = 640;
		int h = 480;
		JFrame f = new JFrame();
		ChristmasCanvas dc = new ChristmasCanvas(w,h);
		f.setSize(w,h);
	    f.setTitle("My name is...");
	    f.add(dc);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	    
		
		if (s.equals("yes")) {
			
			f.setVisible(true);
			
			System.out.println("+-------------------------------------+");
			System.out.println("|                                     |");
			System.out.println("|  What should be the snowman's name? |");
			System.out.println("|     Type the name of the snowman.   |");
			System.out.println("|      Don't forget to press enter.   |");
			System.out.println("|                                     |");
			System.out.println("+-------------------------------------+");
			String name = sc.nextLine();
			f.setTitle("My name is " + name);
			System.out.println("+---------------------------------------------------+");
			System.out.println("|                                                   |");
			System.out.println("| Do you want to add some decoration to the snowman?|");
			System.out.println("|           Type yes for decoration.                |");
			System.out.println("|          Don't forget to press enter.             |");
			System.out.println("|                                                   |");
			System.out.println("+---------------------------------------------------+");
			try {
				TimeUnit.SECONDS.sleep(7);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			f.setVisible(false);}
			 else {
				    System.out.println("+-------------------------------------+");
					System.out.println("|                                     |");
					System.out.println("|                                     |");
					System.out.println("|            Excelent choice!         |");
					System.out.println("|    I also don't want to see him :)  |");
					System.out.println("|                                     |");
					System.out.println("+-------------------------------------+");
				 
		}	
		String decoration = sc.nextLine();
		 if (decoration.equals("yes")) { 
			    JFrame g = new JFrame();
				ChristmasNose ac = new ChristmasNose(w,h);
				g.setSize(w,h);
			    g.setTitle(f.getTitle());
			    g.add(ac);
			    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        g.setVisible(true);
		 }
		 else {
				System.out.println("+---------------------------------------------+");
				System.out.println("|                                             |");
				System.out.println("|                                             |");
				System.out.println("|  You don't want to decorate the snowman :(  |");
				System.out.println("|                                             |");
				System.out.println("|                                             |");
				System.out.println("+---------------------------------------------+");
				f.setVisible(false);
				f.setVisible(true);
				
		 }
	}
}
			
			
			
				
		
			
		
	
		
		




