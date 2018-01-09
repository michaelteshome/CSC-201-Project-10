import java.util.Scanner;
import java.util.*;
import javax.swing.JApplet;
import java.awt.*;

public class StudentGraphicExample extends JApplet
{
	int count = 10;
	int forColor = 1;
	
	public void paint (Graphics page)
	{
		//setBackground(Color.WHITE);
		page.setColor(Color.BLACK);
		String out = "SUNSET & SUNRISE";
		Font saveFont = page.getFont();
		page.setFont(new Font("Times New Roman", Font.BOLD, 15));
		page.drawString(out, 500, 20);
		
		
		graph(page);
	}
	public void graph(Graphics page)
	{
		page.setColor(Color.BLACK);
		page.drawLine (150, 0, 150, 915);  // line
		page.drawLine(150, 915, 1020, 915);
		page.drawLine(150, 91, 135, 91);
		String fourAm = "4:00 am";
		page.drawString(fourAm, 75, 91);
		page.drawLine(150, 182, 135, 182);
		page.drawString("5:00 am", 75, 182);
		page.drawLine(150, 273, 135, 273);
		page.drawString("6:00 am", 75, 273);
		page.drawLine(150, 364, 135, 364);
		page.drawString("7:00 am", 75, 364);
		page.drawLine(150, 455, 135, 455);
		page.drawString("8:00 am", 75, 455);
		page.drawLine(150, 546, 135, 546);
		page.drawString("4:00 pm", 75, 546);
		page.drawLine(150, 637, 135, 637);
		page.drawString("5:00 pm", 75, 637);
		page.drawLine(150, 728, 135, 728);
		page.drawString("6:00 pm", 75, 728);
		page.drawLine(150, 819, 135, 819);
		page.drawString("7:00 pm", 75, 819);
		page.drawLine(150, 910, 135, 910);
		page.drawString("8:00 pm", 75, 910);
		//draw months
		//draw december
		page.drawLine(160, 915, 160, 930);
		page.drawString("Dec", 150, 945);
		//December Sunrise
		page.drawLine(150, 368, 175, 382);
		page.drawLine(175, 382, 230, 395);
		//December Sunset
		page.drawLine(150, 590, 175, 615);
		page.drawLine(175, 615, 230, 622);
		
		
		page.drawLine(240, 915, 240, 930);
		page.drawString("Jan", 230, 945);
		//January Sunrise
		page.drawLine(230, 395, 270, 382);
		page.drawLine(270, 382, 310, 368);
		//January Sunset
		page.drawLine(230, 622, 270, 630);
		page.drawLine(270, 630, 310, 641);
		
		//February Sunrise
		page.drawLine(310, 368, 350, 342);
		page.drawLine(350, 342, 390, 300);
		//February Sunset
		page.drawLine(310, 641, 350, 687);
		page.drawLine(350, 687, 390, 710);
		
		//March Sunrise
		page.drawLine(390, 300, 440, 287);
		page.drawLine(440, 287, 470, 265);
		//March Sunset
		page.drawLine(390, 710, 440, 730);
		page.drawLine(440, 730, 470, 750);
		
		//April Sunrise
		page.drawLine(470, 265, 510, 250 );
		page.drawLine(510, 250, 550, 182);
		//April Sunset
		page.drawLine(470, 750, 510, 800);
		page.drawLine(510, 800, 550, 816);
		
		//May Sunrise
		page.drawLine(550, 182, 584, 156);
		page.drawLine(584, 156, 630, 88);
		//May Sunset
		page.drawLine(550, 816, 584, 823);
		page.drawLine(584, 823, 630, 831);
		
		
		//June Sunrise
		page.drawLine(630, 88, 676, 91);
		page.drawLine(676, 91, 710, 120);
		//June Sunset
		page.drawLine(630, 831, 676, 850);
		page.drawLine(676, 850, 710, 852);
		
		//July Sunrise
		page.drawLine(710, 120, 743, 138);
		page.drawLine(743, 138, 790, 182);
		//July Sunset
		page.drawLine(710, 852, 743, 831);
		page.drawLine(743, 831, 790, 828);
		
		//August Sunrise
		page.drawLine(790, 182, 849, 211);
		page.drawLine(849, 211, 870, 224);
		//August Sunset
		page.drawLine(790, 828, 849, 820);
		page.drawLine(849, 820, 870, 820);
		
		//September Sunrise
		page.drawLine(870, 224, 895, 236);
		page.drawLine(895, 236, 950, 255);
		//September Sunset
		page.drawLine(870, 820, 895, 759 );
		page.drawLine(895, 759, 950, 723);
		
		//October Sunrise
		page.drawLine(950, 255, 980, 273);
		page.drawLine(980, 273, 1010, 300);
		//October Sunset
		page.drawLine(950, 723, 980, 590);
		page.drawLine(980, 590, 1010, 602);
		
		
		page.drawLine(320, 915, 320, 930);
		page.drawString("Feb", 310, 945);
		page.drawLine(400, 915, 400, 930);
		page.drawString("Mar", 390, 945);
		page.drawLine(480, 915, 480, 930);
		page.drawString("Apr", 470, 945);
		page.drawLine(560, 915, 560, 930);
		page.drawString("May", 550, 945);
		page.drawLine(640, 915, 640, 930);
		page.drawString("Jun", 630, 945);
		page.drawLine(720, 915, 720, 930);
		page.drawString("Jul", 710, 945);
		page.drawLine(800, 915, 800, 930);
		page.drawString("Aug", 790, 945);
		page.drawLine(880, 915, 880, 930);
		page.drawString("Sep", 870, 945);
		page.drawLine(960, 915, 960, 930);
		page.drawString("Oct", 950, 945);
		page.drawLine(1020, 915, 1020, 930);
		page.drawString("Nov", 1010, 945);
		//Start drawing the sunrise
		//page.drawLine(, arg1, arg2, arg3);
		
		
		
	}
	private void setNewColor(Graphics page, int forColor)
	{
		switch (forColor)
		{
		case 1:
			page.setColor(Color.BLACK);
			break;
		case 2:
			page.setColor(Color.BLUE);
			break;
		case 3:
			page.setColor(Color.CYAN);
			break;
		case 4:
			page.setColor(Color.DARK_GRAY);
			break;
		case 5:
			page.setColor(Color.GRAY);
			break;
		case 6:
			page.setColor(Color.GREEN);
			break;
		case 7:
			page.setColor(Color.LIGHT_GRAY);
			break;
		case 8:
			page.setColor(Color.DARK_GRAY);
			break;
		case 9:
			page.setColor(Color.MAGENTA);
			break;
		case 10:
			page.setColor(Color.ORANGE);
			break;
		case 11:
			page.setColor(Color.PINK);
			break;
		case 12:
			page.setColor(Color.YELLOW);
			break;
		}
	}
}


