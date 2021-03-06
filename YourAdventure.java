import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*
PROJECT BY ENRIQUE RODRIGUEZ, PERIOD 7
*/
public class YourAdventure extends JComponent implements MouseListener {

	public static String nameOfApp = "Programming a Game, the Game";

	int state = 0;
	int x = 20;
	int live;
	String race = "default";
	String abil = "default";
	String ally = "default";

	public YourAdventure() {
		addMouseListener(this);
	}
	
	public static int liveRNG(int live){
		live = (int)(Math.random()*10);
		if(live>1){
			live=1;
		} else if (live<1){
			live=0;
		}
		return live;
	}
	
/*
				if (ally == "Imperial"){
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("Do You...", x, 50);
			g.setColor(Color.RED);
			g.drawString("", x, 100);
			g.drawString("", x, 150);
			}
			if (ally == "Stormcloak"){
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("Do you...", x, 50);
			g.setColor(Color.BLUE);
			g.drawString("", x, 100);
			g.drawString("", x, 150);
			}
	*/
	
	
	public void paint(Graphics g) {
		if (state == 0) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("Skyrim, A text based Intereptation", 300, 50);
			g.setColor(Color.BLACK);
			g.drawString("Start", 330, 350);
			g.drawString("Load", 760, 350);
		} else if (state == 1) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("Let's choose your Race, What Race are you?", x, 50);
			g.setColor(Color.BLACK);
			g.drawString("Nord", x, 100);
			g.drawString("Elf", x, 150);
			g.drawString("Khajit", x, 200);
			g.drawString("Argonian", x, 250);
		} else if (state == 2) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("I see, so you are a " + race + " correct?", x, 50);
			g.setColor(Color.BLACK);
			g.drawString("Yes", x, 100);
			g.drawString("No", x, 150);
		} else if (state == 3) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("What Class do you wish to be?", x, 50);
			g.setColor(Color.BLACK);
			g.drawString("Warrior", x, 100);
			g.drawString("Archer", x, 150);
			g.drawString("Mage", x, 200);
		} else if (state == 4) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("So you are a " + race + " " + abil + " then?", x, 50);
			g.setColor(Color.BLACK);
			g.drawString("Yes", x, 100);
			g.drawString("No", x, 150);
		} else if (state == 5) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("You are going to the military recruitment station, Do you...", x, 50);
			g.setColor(Color.BLUE);
			g.drawString("Join the Stormcloaks", x, 100);
			g.setColor(Color.RED);
			g.drawString("Join the Imperials", x, 150);
		} else if (state == 6) {
			if (ally == "Stormcloak") {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("Your first mission is to raid an Imperial Trade Convoy, Do you...", x, 50);
			g.setColor(Color.BLUE);
			g.drawString("Join the Engagement Party", x, 100);
			g.drawString("Patrol the Flank", x, 150);
			}
			if (ally == "Imperial") {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("Your first mission is to raid an Stormcloak Trade Post, Do you...", x, 50);
			g.setColor(Color.RED);
			g.drawString("Target the Enemy Troops", x, 100);
			g.drawString("Destroy the Stormcloak's Shipping Crates", x, 150);
			}

		} else if (state == 7) {
			if (ally == "Imperial") {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.RED);
			g.drawString("You Charged the Enemy Troops alone and died.", x, 50); // ENDING 1
																						
			}
			if (ally == "Stormcloak") {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.RED);
			g.drawString("Your party got focused and you were killed", x, 50); // ENDING 2
																					
			}
		} else if (state == 8) {
			if (ally == "Imperial"){
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("You destroy the Shipping Crates, Do You...", x, 50);
			g.setColor(Color.RED);
			g.drawString("Regroup and focus on their Troops together", x, 100);
			g.drawString("Loot from the rubble", x, 150);
			}
			if (ally == "Stormcloak"){
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("Your group got surrounded by a group of wolves, Do you...", x, 50);
			g.setColor(Color.BLUE);
			g.drawString("Fight the wolves", x, 100);
			g.drawString("Run away", x, 150);
			}
		} else if (state == 9){
			if(ally == "Stormcloak"){
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.RED);
			g.drawString("Did you honestly expect to out run wolves and live?", x, 50);	// ENDING 3
			}
			if(ally == "Imperial"){
			Font font = new Font("Impact", Font.BOLD, 30);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("You and your fellow troops force their troops to flee and capture the fort", x, 50);	//ENDING4
			}
		}  else if (state == 10) {
	/*		if (ally == "Imperial" && (live==0)){
			Font font = new Font("Impact", Font.BOLD, 30);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("While looting from the rubble, you were split from your division and killed.", x, 50);
			g.setColor(Color.RED);
			}
			*/
			if (ally == "Imperial"){
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("You found a rare sword, Do you...", x, 50);
			g.setColor(Color.RED);
			g.drawString("Help your fellow soldiers", x, 100);
			g.drawString("Abandon and flee to town", x, 150);
			}
			if (ally == "Stormcloak"){
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("You successfully fend off the wolves, Do you...", x, 50);
			g.setColor(Color.BLUE);
			g.drawString("Meet up with your fellow soldiers", x, 100);
			g.drawString("Abandon them and go to town", x, 150);
			}
		} else if (state == 11){
			if(ally == "Stormcloak"){
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLUE);
			g.drawString("You return back and help capture the fort", x, 50);	// ENDING 5
			}
			if(ally == "Imperial"){
			Font font = new Font("Impact", Font.BOLD, 31);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("Using the sword, you single handedly capture the fort and become a hero", x, 50);	//ENDING 6
			}
		} else if (state == 12) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("Do you wish to visit the...", x, 50);
			g.setColor(Color.RED);
			g.drawString("Tavern", x, 100);
			g.drawString("Shop", x, 150);
		} else if (state == 13) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("Do You...", x, 50);
			g.setColor(Color.RED);
			g.drawString("Get some drinks", x, 100);
			g.drawString("Converse with the locals", x, 150);
		} else if (state == 14) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("You become so drunk that you die of Alcohol poisoning", x, 50); //ENDING 7
			g.setColor(Color.RED);
		} else if (state == 15) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("One of the locals is drunk and wants to fight, Do you...", x, 50);
			g.setColor(Color.RED);
			g.drawString("Fight him head on, no turning back.", x, 100);
		} else if (state == 16) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("One of the locals is drunk and wants to fight, Do you...", x, 50);
			g.setColor(Color.RED);
			g.drawString("Fight him head on, no turning back.", x, 100);
		} else if (state == 17) {
			if(race=="Nord") {
				Font font = new Font("Impact", Font.BOLD, 30);
				g.setFont(font);
				g.setColor(Color.BLACK);
				g.drawString("As a Nord, you use your overwhelming strength to knock him out", x, 50); //ENDING 8
			}
			if(race=="Elf") {
				Font font = new Font("Impact", Font.BOLD, 30);
				g.setFont(font);
				g.setColor(Color.RED);		
				g.drawString("As an Elf, the Drunkard overpowers you and kills you", x, 50); //ENDING 9
			}
			if(race=="Khajit") {
				Font font = new Font("Impact", Font.BOLD, 30);
				g.setFont(font);
				g.setColor(Color.BLACK);
				g.drawString("As an Khajit, you lose the fight but manage to escape the city as he chases you away", x, 50); // ENDING 10
			}
			if(race=="Argonian") {
				Font font = new Font("Impact", Font.BOLD, 30);
				g.setFont(font);
				g.setColor(Color.BLACK);
				g.drawString("As an Argonian, your rough skin easily knocks him out and you win free drinks on the house", x, 50); //ENDING 11
			}
		} else if (state == 18) {
			if (ally == "Imperial"){
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("Approaching the Shopkeeper, Do you...", x, 50);
			g.setColor(Color.RED);
			g.drawString("Sell your sword", x, 100);
			g.drawString("Attempt to rob him with your sword", x, 150);
			}
			if (ally == "Stormcloak"){
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("Arriving at the store, there was nothing you could buy", x, 50);
			g.setColor(Color.BLUE);
			g.drawString("Exit the Shop", x, 100);
			}
		} else if (state == 19) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("You sell your sword and become the richest person in Skyrim", x, 50); //Ending 12
		} else if (state == 20) {
			if(abil=="Warrior") {
				Font font = new Font("Impact", Font.BOLD, 30);
				g.setFont(font);
				g.setColor(Color.BLACK);
				g.drawString("As a warrior, you successfully overpowered and steal his money before leaving town", x, 50); //ENDING 13
			}
			if(abil=="Archer") {
				Font font = new Font("Impact", Font.BOLD, 30);
				g.setFont(font);
				g.setColor(Color.RED);		
				g.drawString("As an Archer, you fail to overpower him and get imprisoned for life", x, 50); //ENDING 14
			}
			if(abil=="Mage") {
				Font font = new Font("Impact", Font.BOLD, 30);
				g.setFont(font);
				g.setColor(Color.BLACK);
				g.drawString("As a Mage, you fail in robbing in and in haste, light the building on fire, trapping and killing you inside", x, 50); // ENDING 15
			}
		}	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + ", " + e.getY());
		//skip command V
		if (e.getX() >= 1120 && e.getY() >= 537 && e.getX() <= 1269 && e.getY() <= 688) {
			state = 12;
			ally = "Stormcloak";
			race= "Argonian";
		}

		if (state == 0 && e.getX() >= 330 && e.getY() >= 315 && e.getX() <= 420 && e.getY() <= 350) {
			state++;
			System.out.print(state);

		} else if (state == 1 && e.getX() >= 20 && e.getY() >= 66 && e.getX() <= 105 && e.getY() <= 101) {
			race = "Nord";
			state++;
			System.out.print(state);
		} else if (state == 1 && e.getX() >= 20 && e.getY() >= 120 && e.getX() <= 70 && e.getY() <= 151) {
			race = "Elf";
			state++;
			System.out.print(state);

		} else if (state == 1 && e.getX() >= 20 && e.getY() >= 166 && e.getX() <= 130 && e.getY() <= 201) {
			race = "Khajit";
			state++;
			System.out.print(state);

		} else if (state == 1 && e.getX() >= 20 && e.getY() >= 215 && e.getX() <= 184 && e.getY() <= 252) {
			race = "Argonian";
			state++;
			System.out.print(state);

		} else if (state == 2 && e.getX() >= 20 && e.getY() >= 66 && e.getX() <= 84 && e.getY() <= 99) {
			state++;
			System.out.print(state);
		} else if (state == 2 && e.getX() >= 20 && e.getY() >= 116 && e.getX() <= 68 && e.getY() <= 150) {
			state--;
			System.out.print(state);
		} else if (state == 3 && e.getX() >= 20 && e.getY() >= 66 && e.getX() <= 161 && e.getY() <= 100) {
			state++;
			abil = "Warrior";
		} else if (state == 3 && e.getX() >= 20 && e.getY() >= 117 && e.getX() <= 141 && e.getY() <= 152) {
			state++;
			abil = "Archer";
		} else if (state == 3 && e.getX() >= 20 && e.getY() >= 166 && e.getX() <= 117 && e.getY() <= 203) {
			state++;
			abil = "Mage";
		} else if (state == 4 && e.getX() >= 20 && e.getY() >= 66 && e.getX() <= 84 && e.getY() <= 99) {
			state++;
			System.out.print(state);
		} else if (state == 4 && e.getX() >= 20 && e.getY() >= 116 && e.getX() <= 68 && e.getY() <= 150) {
			state--;
		} else if (state == 5 && e.getX() >= 17 && e.getY() >= 60 && e.getX() <= 397 && e.getY() <= 102) {
			ally = "Stormcloak";
			state++;
		} else if (state == 5 && e.getX() >= 17 && e.getY() >= 115 && e.getX() <= 344 && e.getY() <= 153) {
			ally = "Imperial";
			state++;
		} else if (ally == "Imperial" && state == 6 && e.getX() >= 17 && e.getY() >= 68 && e.getX() <= 465 && e.getY() <= 103) {
			state++;
		} else if (ally == "Imperial" && state == 6 && e.getX() >= 17 && e.getY() >= 118 && e.getX() <= 775 && e.getY() <= 153) {
			state = state + 2;
		} else if (ally == "Stormcloak" && state == 6 && e.getX() >= 20 && e.getY() >= 118 && e.getX() <= 304 && e.getY() <= 151){
			state = state+2;
		} else if (ally == "Stormcloak" && state == 8 && e.getX() >= 20 && e.getY() >= 118 && e.getX() <= 194 && e.getY() <= 151){
			state++; //ENDING 3 
		}else if (ally == "Stormcloak" && state == 8 && e.getX() >= 20 && e.getY() >= 66 && e.getX() <= 314 && e.getY() <= 101){
			state=state+2;
		} else if (ally == "Imperial" && state == 8 && e.getX() >= 20 && e.getY() >= 67 && e.getX() <= 811 && e.getY() <= 101){
			state++; //ENDING 4
		} else if (ally == "Imperial" && state == 8 && e.getX() >= 20 && e.getY() >= 118 && e.getX() <= 384 && e.getY() <= 151){
			state = state+2;
		} else if (ally == "Stormcloak" && state == 10 && e.getX() >= 20 && e.getY() >= 65 && e.getX() <= 625 && e.getY() <= 100){
			state++;//ending 5
		} else if (ally == "Stormcloak" && state == 10 && e.getX() >= 20 && e.getY() >= 114 && e.getX() <= 554 && e.getY() <= 152){
			state=state+2;
		} else if (ally == "Imperial" && state == 10 && e.getX() >= 20 && e.getY() >= 65 && e.getX() <= 473 && e.getY() <= 100){
			state++;//ending6
		} else if (ally == "Imperial" && state == 10 && e.getX() >= 20 && e.getY() >= 114 && e.getX() <= 478 && e.getY() <= 152){
			state=state+2;
		} else if (state == 12 && e.getX() >= 20 && e.getY() >= 68 && e.getX() <= 143 && e.getY() <= 101){
			state++;
		} else if (state == 12 && e.getX() >= 20 && e.getY() >= 118 && e.getX() <= 109 && e.getY() <= 154){
			state=state+6;
		} else if (state == 13 && e.getX() >= 20 && e.getY() >= 68 && e.getX() <= 312 && e.getY() <= 101){
			state++;//Ending 7
		} else if (state == 13 && e.getX() >= 20 && e.getY() >= 118 && e.getX() <= 467 && e.getY() <= 154){
			state=state+2;
		} else if (state == 16 && e.getX() >= 20 && e.getY() >= 68 && e.getX() <= 658 && e.getY() <= 101){
			state++; //Endings 8,9,10,11
		} else if (ally == "Imperial" || state == 18 && e.getX() >= 20 && e.getY() >= 68 && e.getX() <= 301 && e.getY() <= 101){
		state++; //Ending 12
		} else if (ally == "Imperial" || state == 18 && e.getX() >= 17 && e.getY() >= 117 && e.getX() <= 658 && e.getY() <= 154){
		state=state+2; //Ending 13,14,15
		} else if (ally == "Stormcloak" || state == 18 && e.getX() >= 17 && e.getY() >= 66 && e.getX() <= 251 && e.getY() <= 103){
			state=12;
			}
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame(nameOfApp);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new YourAdventure());
		frame.setSize(1280, 720);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.YELLOW);
	}

}