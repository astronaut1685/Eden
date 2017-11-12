import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// eden 0.9
// 4.3.2016 adding to whiteboard in comments first form of quests 

public class WhiteBoard {

	
	public static void main(String[] args){
		
//questPage comments
		
		/*
		//introduce days into WhiteBoard 
		//introduce urgency		=?		Potentially split into more classes
			// on begging of the day prompt
				// like cooking 
			// on the end of the day 
		// Consider Groups ['Urgent',	
							'Daily',
							'LongTerm'
							'joyful']
		
		*/
		
//quests	
		
		/*
			
			
			var projects[] = [string name, listSteps[], stateOf{}]
				stateOf{
					ACTIVE; INNACTIVE; FROZEN; ABANDONED }
			var listSteps[] = null;
				// [name, explenation, state]
				 				If state T => next step
				 				
		*/
		
		/*
		 
		 
		 	
			
			ShoppingList [
								WORK 	=> 'Hard Cover Small Notebook', 'Good pens', '
								FOOD 	=> 'BANANA', 'APPLES' 
								HOUSE	=> 'SOAP'		
								
								]
			
			HYGINE
			
			AddComentToEden[
								'if Prompt() => String' 'INCOMPLETE'		
			
			//on begging of the day
			cookSomething[
						cookSteps[
							bef.2 = find receipe 
								
							bef.4 = shop ingredients 
							
							bef.6 = make dinner		] ]
							
			
			
			
			
			firstStock[
						 		stockBuySteps[
						 			bef.11-03 = check if you still own an account in raiffeisen 
						 			bef.01-05 = check stock options 
						 			bef.15.07 = own stocks 
						 			bef.01.09 = check international stock options		=? 		doesn't have to be choronological 	]	]	 	
		 	
		 	
		 	
		 	lanceJobs[
						 		lanceSteps[
						 			bef.07-03 = apply for 5 writings;
						 			bef.30.04 = apply for 5 programing;	]	]
			
			
			
			AskFreeShop[
								'Plants'
								'Pots'
								'Follows'	]
				
			
			
			bestPhotos = arrayListPhotos[!*];
								hope for bP > 60;
								state Djana received this = [ INCOMPLETE ]
			
			
			
			edenSteps[6] = null;
								stateOf{
								 println("advancing it forward trough work not organized steps")
								 wantedState("organized") }
					 
					 
			developmentLog(//commentImprovements){
									stateOf[
									 'ACTIVE', 
									 'in comments betwen import and class'}
			
			
			.draw[
										// these two need to be replaced in order
										#1 = 'Lamp in frenjevacka',	'DESIRED'
										#2 = 'Camera',				'DESIRED' 
										#3 = 'Plant', 				'DESIRED'
										#4 = 'SKY'					'DESIRED' ]
					
			
					 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		 */
		
		
		
		
		
		
		
		
		
		
		
		JFrame frame = new JFrame("White Board");
		frame.setSize(500,500);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new FlowLayout());	
		
		JPanel panel = new JPanel();										frame.add(panel);
		
		JButton btn1 = new JButton("Wasup man with you today");				panel.add(btn1);
		JButton btn2 = new JButton("Not much man");							panel.add(btn2);
		JButton btn3 = new JButton("YO YO YO");								panel.add(btn3);
		
		
		String randomText = "But I must explain to you how all this mistaken idea of denouncing of a pleasure and praising pain was born ";
		
		JTextArea text1 = new JTextArea(randomText);
		text1.setPreferredSize(new Dimension(500,100));

		text1.setLineWrap(true);
		text1.setVisible(true);
		
		panel.add(text1);
		
	}
	
}
