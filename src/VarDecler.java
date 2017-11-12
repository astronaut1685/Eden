import java.util.Scanner;

// add activities : Thinking, walking, 
// change strength to courage ; change notMuch to nothing
// spiriti can perhaps be on one level and just change location (perhaps it can be the ground of my eden) " makal and haal "
// perhaps i need to place in visual representation of roots(&ground); leafs ; & fruits 
// put in kobjektiv as well
// URGENT: ADD A WHITE BOARD
// it needs to ask for routine stuff
// maybe put prompts into a different class 
// you could initialize the entire variables in an arrayList
// #1 add comments 
// put if statements lower and the variables higher
// add percentage calculator 
// #2 build quest.java Class 
// make it pop up in a new window when you run it where it prompts you for all the data 
// daily urgency

public class VarDecler {

	public static void checkZero(int m){
		if(m > 0){
			//do nothing
		} else {
			m = 0;
		}
	}
	
	public static void curLvl(int stat, int lvl, int cap){
		if(stat > cap){
			lvl++;
			stat = stat - cap; 
			cap = cap + cap/10;
				curLvl(stat, lvl, cap);
		}
	}
	
	public static String divider() {
		return "------";
	}
	
	public static String makeString(String name, int xp, int lvl, int cap){
		String g = name +":" + "\n" + "current xp: " + xp + "\n" + "current lvl: " + lvl +"\n" + "next level at: " + cap + "\n" + divider() + "\n";
		return g;
	}
	
	public static String progressString(String progress, String name, int sessions){
		progress = progress + "Today you did " + sessions + " sessions of " + name +". \n";
		return progress;
	}
	
	
	
	public static void main(String[] args){
		
		//@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//give the date 
		System.out.println("What days is eden documenting: ");
		String dateName = input.nextLine();
		
		// fluid attributes 
		System.out.print("How happy are you (1 to 30) : ");
		int happiness = input.nextInt(); // out of 30
		

		String y = "y";
		
		
		String comment = "";
		
		System.out.println("Comments ? ");
		String b1 = input.next();
		input.nextLine();
		
		if(b1.equals(y)){
			String com1 = input.nextLine();
			comment = comment + "comment" + "\n" + com1;
			/*System.out.println("More ? ");
			input.nextLine();
			String b2 = input.next();
			input.nextLine();
			if(b2.equals(y)){
				String com2 = input.nextLine();
				input.nextLine();
				System.out.println("More ? ");
				String b3 = input.next();
				input.nextLine();
				comment = comment + "\n" + com2;
				if(b3.equals(y)){
					String com3 = input.nextLine();
					input.nextLine();
					comment = comment + "\n" + com3;
				} 
			}*/
		}
		
		comment = comment + "\n" + "------" + "\n"; 
		
		//activities 
				/* core ones 1,2 */			int program=0;	int schreibe=0;
				/* secondary 3,4,5,6,7*/	int read=0;		int workout=0;	int housework=0;	int meditation=0;	int eden=0;
				/* easy 8,9,10,11*/			int thinking=0;	int nothing=0; 	int news=0; 		int albums=0;		int people=0;
				/* easy 12,13,14,15 */		int editing=0;	int stumble=0; 	int dpThought=0;	int entertainment=0;  
				/* easy */					int walk=0; 	int hqEntertainment=0;
				//notMuch needs to give an off shoot "deep thought"
				
			
				//Check what activites have been done that day
				
				System.out.print("Did you program today: ");	String a1 = input.next();
				System.out.print("Did you write today: ");	String a2 = input.next();
				
				System.out.print("Did you read today: ");	String a3 = input.next();		
				System.out.print("Did you workout today: ");	String a4 = input.next();
				System.out.print("Did you do housework today: ");	String a5 = input.next();
				System.out.print("Did you meditate today: ");	String a6 = input.next();
				System.out.print("Did you build eden today: ");	String a7 = input.next();
				
				System.out.print("Did you do nothing today: ");	String a8 = input.next();
				System.out.print("Did you inform today: ");	String a9 = input.next();
				System.out.print("Did you spend time thinking today: ");	String a10 = input.next();
				System.out.print("Did you people today: ");	String a11 = input.next();
				System.out.print("Did you walk today: ");	String a12 = input.next();
				//- System.out.print("Did you stumble today: ");	String a13 = input.next();
				System.out.print("Did you consume entertainment today: "); String a14 = input.next();
				System.out.print("Did you consume high quality entertainment today: "); String a15=input.next();
				
				/*("program(1), write(2),");
				("read(3),workout(4),housework(5),meditation(6),eden(7),");
				("not much(8), news(9), albums (10), people(11), gardening(12), stumble(13)")*/;
				
				String progress = ""; 
				
				//ask how many sessions of activites that have been performed has been done
				//and add the progress to a string
			if(a1.equals(y)){										
				System.out.print("How much of programing did you do: ");
				program= input.nextInt();
				progress = progressString(progress, "program", program);}
			if(a2.equals(y)){										
				System.out.print("How much of writing did you do: ");
				schreibe = input.nextInt();
				progress =  progressString(progress, "writing", schreibe);}
			
			if(a3.equals(y)){										
				System.out.print("How much of reading did you do: ");
				read = input.nextInt();
				progress =  progressString(progress, "reading", read);}
				
			if(a4.equals(y)){										
				System.out.print("How much of workout did you do: ");
				workout= input.nextInt();
				progress =  progressString(progress, "working out", workout);}
			if(a5.equals(y)){										
				System.out.print("How much of housework did you do: ");
				housework = input.nextInt();
				progress =  progressString(progress, "housework", housework);}
			if(a6.equals(y)){										
				System.out.print("How much of meditation did you do: ");
				meditation= input.nextInt();
				progress =  progressString(progress,"meditation", meditation);}
			if(a7.equals(y)){										
				System.out.print("How much of eden did you do: ");
				eden= input.nextInt();
				progress =  progressString(progress,"eden", eden);}
			
			if(a8.equals(y)){										
				System.out.print("How much of nothing did you do: ");
				nothing = input.nextInt();
				progress =  progressString(progress,"nothing",nothing);}
			if(a9.equals(y)){										
				System.out.print("How much of news did you do: ");
				news= input.nextInt();
				progress =  progressString(progress,"watching news",news);}
			
			if(a10.equals(y)){										
				System.out.print("How much of thinking did you do: ");
				thinking= input.nextInt();
				progress =  progressString(progress,"thinking", thinking);}
			if(a11.equals(y)){										
				System.out.print("How much of people did you do: ");
				people = input.nextInt();
				progress =  progressString(progress,"hanging out",people);}
			if(a12.equals(y)){										
				System.out.print("How much of walking did you do: ");
				walk = input.nextInt();
				progress =  progressString(progress,"walking",walk);}
			if(a14.equals(y)){
				System.out.print("How much did you entertainment did you consume today today: ");
				entertainment= input.nextInt();
				progress= progressString(progress,"entertainment", entertainment);}
			if(a15.equals(y)){
				System.out.print("How much did you high quality entertainment did you consume today today: ");
				hqEntertainment= input.nextInt();
				progress= progressString(progress,"hqEntertainment", hqEntertainment);}
			progress = progress + divider() + "\n";
			
			
		String hapString = "Happiness: " + happiness + "\n";
		
		
		
		//Basic construct of a trait
		int xp = 15404;
		int intellect = 2273;
		int dexterity = 5975;
		int strength = 2183;
		int spiriti = 529; 
		int agility = 1447;
		int programing = 1904;
		int writing = 1522;
		int sociability = 1722;
		
		xp = xp
				+ dpThought*25
				+ schreibe*26 + read*17 + news*10 + nothing*6 + meditation*4 + editing* + stumble*3
				+ program*27
				+ thinking*16 + walk*6 + hqEntertainment*8
				+ housework*3 + eden*22 
				+ workout*10 + albums*10
				+ people*16
				- entertainment*3;
		int lvl = 1; 
		int cap = 85200;
			//lvl actualization
			if(xp > cap){
				lvl++;
				xp = xp - cap; 
				cap = cap + cap/10;
			}
		String charString = makeString("character", xp, lvl, cap);
		
		
		/*(
		("stumble(13)")*/;
		
		intellect = intellect
				+ schreibe*20 + read*17 + news*10 + thinking*14 
				+ nothing*6 + meditation*4 + editing*13 + stumble*3 + hqEntertainment*8 - entertainment*3 - 4;
			int intLvl = 14 ;
			int intCap = 14760;
				//lvl actualization
				if(intellect > intCap){
					intLvl++;
					System.out.println("Intellect increased to " + intLvl);
					intellect = intellect - intCap; 
					intCap = intCap + intCap/10;
				}
			String intString = makeString("intellect",intellect, intLvl, intCap);
			
		
		dexterity = dexterity
				+ program*24 + schreibe*20 + read*13 + thinking*16 + walk*6
				+ workout*10 + housework*16 + albums*10 + eden*6 + editing*5 + hqEntertainment*3 - entertainment*3 - 5;
			int dexLvl = 6;
			int dexCap = 11340;
				//lvl actualization
				if(dexterity > dexCap){
					dexLvl++;
					System.out.println("Dexterity increased to " + dexLvl);
					dexterity = dexterity - dexCap;
					dexCap = dexCap + dexCap/10;
				}
			String dexString = makeString("dexterity",dexterity, dexLvl, dexCap);
		
		strength = strength
				+ program*12 + schreibe*19 +workout*20 + walk*6 + thinking*8 + editing*3 + hqEntertainment*5 + nothing*3 - entertainment*3 - 4;
		int strLvl = 4;
		int strCap = 11160;
			//lvl actualization
			if(strength > strCap){
				strLvl++;
				System.out.println("Strength increased to " + strLvl);
				strength = strength - strCap; 
				strCap = strCap + strCap/10;
			}
		String strString = makeString("strength",strength, strLvl, strCap);
		
		spiriti = spiriti  
				+ schreibe*17 + meditation*8 + thinking*6 + walk + nothing + editing*9 - 4;
		int spiLvl = 54;
		int spiCap = 31860;
			//lvl actualization
			if(spiriti > spiCap){
				spiLvl++;
				System.out.println("spirit increased to " + spiLvl);
				spiriti = spiriti - spiCap; 
				spiCap = spiCap + spiCap/10;
			}
		String spiString = makeString("spirit",spiriti, spiLvl, spiCap);
		
		agility = agility  
				+ program*11 + schreibe*14 + housework*3 + walk*12 + thinking*16 + nothing*2 + eden*14 + editing*8 + hqEntertainment*5 - entertainment*11 -4;
		int agiLvl = 3;
		int agiCap = 8570;
			//lvl actualization
				if(agility > agiCap){
				agiLvl++;
				System.out.println("Agility increased to " + agiLvl);
				agility = agility - agiCap; 
				agiCap = agiCap + agiCap/10;
			}
		String agiString = makeString("agility",agility, agiLvl, agiCap);
		
		programing = programing 
				+ program*27 - 7;
		int progLvl = 2;
		int progCap = 16380;
			//lvl actualization
			if(programing > progCap){
				progLvl++;
				System.out.println("Programing increased to " + progLvl);
				programing = programing - progCap; 
				progCap = progCap + progCap/10;
			}
		String progString = makeString("programming",programing, progLvl, progCap);
		
		writing = writing
				+ schreibe*26 + read*8 + news*4 + walk*5 + thinking*12 + stumble*2 + editing*3-7;
		int writLvl = 4; 
		int writCap = 5760;
			//lvl actualization
			if(writing > writCap){
				writLvl++;
				System.out.println("Writing increased to " + writLvl);
				writing = writing - writCap; 
				writCap = writCap + writCap/10;
			}
		String writString = makeString("writing",writing, writLvl, writCap);
		
		sociability = sociability
				+ people*16 - 4 ;
		int socLvl = 14;
		int socCap = 25560;
			//lvl actualization
			if(sociability > socCap){
				socLvl++;
				System.out.println("Sociabilty increased to " + socLvl);
				sociability = sociability - socCap; 
				socCap = socCap + socCap/10;
			}
		String socString = makeString("sociability",sociability,socLvl,socCap);
		
		
		
		//check if variables are == 0
		checkZero(intellect);		checkZero(intLvl);		checkZero(dexterity);checkZero(dexLvl);		checkZero(strength);		checkZero(strLvl);		checkZero(spiriti);		checkZero(spiLvl);		checkZero(agility);		checkZero(agiLvl);
		
		//make a compilation String of all the information you want saved and name the file after the date name
		String compilation = comment + hapString + charString + intString + dexString + strString + spiString + agiString + progString + writString /*+ creatString*/ + socString + progress;
		String saveLocation = "C:/Users/alpak/Desktop/Eden.jur/" + dateName + ".txt";
		input.close();
	
		
		// save all attributes to a save.file
		save write = new save();
		write.save(compilation, saveLocation);
	
	
	}
	
}
