//dleinen 2015

package bj_sim;

import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JLabel;

//import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class MainForm {

	private JFrame frame;
	private final Action action = new SwingAction();
	Game game = new Game();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public MainForm() {
		
		initialize();
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//creating the window/form
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setFocusCycleRoot(true);
		frame.setResizable(false);
		
		//RADIO BUTTONS
		//1 deck radio button
		JRadioButton rdbtn1decks = new JRadioButton("1 Decks");
		rdbtn1decks.setBounds(5, 30, 100, 25);
		frame.getContentPane().add(rdbtn1decks);
		
		//2 decks radio button
		JRadioButton rdbtn2decks = new JRadioButton("2 Decks");
		rdbtn2decks.setSelected(true);
		rdbtn2decks.setBounds(5, 60, 100, 25);
		frame.getContentPane().add(rdbtn2decks);
		
		//4 decks radio button
		JRadioButton rdbtn4decks = new JRadioButton("4 Decks");
		rdbtn4decks.setBounds(5, 90, 100, 25);
		frame.getContentPane().add(rdbtn4decks);
		
		//6 decks radio button
		JRadioButton rdbtn6decks = new JRadioButton("6 Decks");
		rdbtn6decks.setBounds(5, 120, 100, 25);
		frame.getContentPane().add(rdbtn6decks);
		
		//8 decks radio button
		JRadioButton rdbtn8decks = new JRadioButton("8 Decks");
		rdbtn8decks.setBounds(5, 150, 100, 25);
		frame.getContentPane().add(rdbtn8decks);
		
		//deck number button group
		ButtonGroup groupDecks = new ButtonGroup();
		groupDecks.add(rdbtn1decks);
		groupDecks.add(rdbtn2decks);
		groupDecks.add(rdbtn4decks);
		groupDecks.add(rdbtn6decks);
		groupDecks.add(rdbtn8decks);
		
		//$5 minimum radio button
		JRadioButton rdbtn5$ = new JRadioButton("$5");
		rdbtn5$.setBounds(175, 30, 100, 25);
		frame.getContentPane().add(rdbtn5$);
		
		//$10 minimum radio button
		JRadioButton rdbtn10$ = new JRadioButton("$10");
		rdbtn10$.setSelected(true);
		rdbtn10$.setBounds(175, 60, 100, 25);
		frame.getContentPane().add(rdbtn10$);
		
		//$15 minimum radio button
		JRadioButton rdbtn15$ = new JRadioButton("$15");
		rdbtn15$.setBounds(175, 90, 100, 25);
		frame.getContentPane().add(rdbtn15$);
		
		//$25minimum radio button
		JRadioButton rdbtn25$ = new JRadioButton("$25");
		rdbtn25$.setBounds(175, 120, 100, 25);
		frame.getContentPane().add(rdbtn25$);
		
		//$50minimum radio button
		JRadioButton rdbtn50$ = new JRadioButton("$50");
		rdbtn50$.setBounds(175, 150, 100, 25);
		frame.getContentPane().add(rdbtn50$);
		
		//table minimum button group
		ButtonGroup groupTableMin = new ButtonGroup();
		groupTableMin.add(rdbtn5$);
		groupTableMin.add(rdbtn10$);
		groupTableMin.add(rdbtn15$);
		groupTableMin.add(rdbtn25$);
		groupTableMin.add(rdbtn50$);
		
		//TEXTBOXES
		//textbox for start playing amount
		JTextField textFieldStart;
		textFieldStart = new JTextField();
		textFieldStart.setText("15");
		textFieldStart.setBounds(500, 35, 100, 25);
		frame.getContentPane().add(textFieldStart);
		textFieldStart.setColumns(10);
		
		//textbox for stop playing amount
		JTextField textFieldStop;
		textFieldStop = new JTextField();
		textFieldStop.setText("225");
		textFieldStop.setBounds(500, 90, 100, 25);
		frame.getContentPane().add(textFieldStop);
		textFieldStop.setColumns(10);
		
		//textbox for number of sessions
		JTextField textFieldSession;
		textFieldSession = new JTextField();
		textFieldSession.setText("1");
		textFieldSession.setBounds(500, 145, 100, 25);
		frame.getContentPane().add(textFieldSession);
		textFieldSession.setColumns(10);
		
		//LABELS
		//starting amount label
		JLabel lblStartingAmount = new JLabel("STARTING AMOUNT:");
		lblStartingAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStartingAmount.setBounds(360, 40, 130, 15);
		frame.getContentPane().add(lblStartingAmount);
		
		//stop amount label
		JLabel lblStopAmount = new JLabel("STOPING AMOUNT:");
		lblStopAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStopAmount.setBounds(360, 95, 130, 15);
		frame.getContentPane().add(lblStopAmount);
		
		//sessions label
		JLabel lblSession = new JLabel("SESSIONS:");
		lblSession.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSession.setBounds(360, 150, 130, 15);
		frame.getContentPane().add(lblSession);
		
		//betting systems label
		JLabel lblBettingcouningSystems = new JLabel("BETTING/COUNTING SYSTEMS:");
		lblBettingcouningSystems.setBounds(175, 203, 200, 16);
		frame.getContentPane().add(lblBettingcouningSystems);
		
		// ? BUTTONS
		// ? button start
		JButton btnQuesStart = new JButton("?");
		btnQuesStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"This is the amount that you are starting a playing sessiosn with. For more\ninformation on the suggested starting amounts please see the HELP menu.");
			}
		});
		btnQuesStart.setForeground(Color.BLUE);
		btnQuesStart.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnQuesStart.setBounds(605, 35, 25, 25);
		frame.getContentPane().add(btnQuesStart);

		// ? button stop
		JButton btnQuesStop = new JButton("?");
		btnQuesStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "This is the amount you are stoping your sessions with. For more\ninformation on stopping amounts please see the HELP menu.");
			}
		});
		btnQuesStop.setForeground(Color.BLUE);
		btnQuesStop.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnQuesStop.setBounds(605, 90, 25, 25);
		frame.getContentPane().add(btnQuesStop);
		
		// ? button sessions
		JButton btnQuesSess = new JButton("?");
		btnQuesSess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "This is the total number of playing sessions you wish to have. For more\ninformation on session amounts please see the HELP menu.");
			}
		});
		btnQuesSess.setForeground(Color.BLUE);
		btnQuesSess.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnQuesSess.setBounds(605, 145, 25, 25);
		frame.getContentPane().add(btnQuesSess);
		
		// ? button bet
		JButton btnQuesBet = new JButton("?");
		btnQuesBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"These are different betting stratagies and systems. You may check more than one. For more\ninformation on the all these systems please see the HELP menu.");
			}
		});
		btnQuesBet.setForeground(Color.BLUE);
		btnQuesBet.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnQuesBet.setBounds(375, 198, 25, 25);
		frame.getContentPane().add(btnQuesBet);
		
		//CHECKBOXES
		//checkbox for matingale
		JCheckBox chckbxMartingale = new JCheckBox("Martingale");
		chckbxMartingale.setBounds(175, 234, 128, 23);
		frame.getContentPane().add(chckbxMartingale);
		
		//checkbox for maritngale plus
		JCheckBox chckbxMartingale_1 = new JCheckBox("Martingale +");
		chckbxMartingale_1.setBounds(175, 269, 128, 23);
		frame.getContentPane().add(chckbxMartingale_1);
		
		//checkbox for flat
		JCheckBox chckbxFlat = new JCheckBox("FLAT");
		chckbxFlat.setBounds(315, 234, 73, 23);
		frame.getContentPane().add(chckbxFlat);
		
		//checkbox for paroli
		JCheckBox chckbxParoli = new JCheckBox("PAROLI");
		chckbxParoli.setBounds(315, 269, 85, 23);
		frame.getContentPane().add(chckbxParoli);
		
		//checkbox for ko
		JCheckBox chckbxKo = new JCheckBox("KO");
		chckbxKo.setBounds(455, 234, 73, 23);
		frame.getContentPane().add(chckbxKo);
		
		//checkbox for hilo
		JCheckBox chckbxHilo = new JCheckBox("HI/LO");
		chckbxHilo.setBounds(455, 269, 77, 23);
		frame.getContentPane().add(chckbxHilo);
		
		//progress bar
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(15, 317, 615, 20);
		frame.getContentPane().add(progressBar);
		//progressBar.setVisible(false);
		
		//the menu bar
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		//the file menu
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		//the exit item
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//the about menu item
		JMenuItem mntmAbout = new JMenuItem("About BJ Simulator");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"BJ Simulator 1.0.0\n2015© Black Snake Software");
			}
		});
		mnFile.add(mntmAbout);
		
		//the preferences menu
		JMenuItem mntmPreferences = new JMenuItem("Preferences");
		mnFile.add(mntmPreferences);
		mnFile.add(mntmExit);
		
		//the help menu
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		//the about menu item
		JMenuItem mntmCheckUpdates = new JMenuItem("Check for updates");
		mnHelp.add(mntmCheckUpdates);
		
		//the information menu w/sub menus
		JMenu mnInfo = new JMenu("Information");
		mnHelp.add(mnInfo);
		
		//the start sub menu
		JMenuItem mntnStart = new JMenuItem("Start playing");
		mntnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"<html>Your start playing amount should be a value that reflects\nand correlates with your starting amount. For exmaple"
						+" if\nyou were to play the standard martingale system you might want "
							+ "...</html> ");
			}
		});
		mnInfo.add(mntnStart);
		
		//the stop sub menu
		JMenuItem mntnStop = new JMenuItem("Stop playing");
		mnInfo.add(mntnStop);
		
		//the sessions sub menu
		JMenuItem mntnSess = new JMenuItem("Sessions");
		mnInfo.add(mntnSess);
		
		//the betting sub menu
		JMenuItem mntnBetting = new JMenuItem("Betting/Counting");
		mnInfo.add(mntnBetting);
		
		// BUTTONS
		//exit button
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(5, 270, 100, 25);
		frame.getContentPane().add(btnExit);
		
		//clear button
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldStart.setText(null);
				textFieldStart.requestFocusInWindow();
				textFieldStop.setText(null);
				textFieldSession.setText(null);
				chckbxMartingale.setSelected(false);
				chckbxMartingale_1.setSelected(false);
				chckbxFlat.setSelected(false);
				chckbxParoli.setSelected(false);
				chckbxKo.setSelected(false);
				chckbxHilo.setSelected(false);
			}
		});
		btnClear.setBounds(5, 235, 100, 25);
		frame.getContentPane().add(btnClear);
		
		//run button
		JButton btnRun = new JButton("RUN");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					int myDeck = 0;
					int myMin = 0;
					boolean myMart = false;
					boolean myMartP = false;
					boolean myFlat = false;
					boolean myPar = false;
					
					//reading in the user input from textboxes
					double myStrt = Double.parseDouble(textFieldStart.getText());
					double myStop = Double.parseDouble(textFieldStop.getText());
					int    mySess = Integer.parseInt(textFieldSession.getText());
					
					//ERROR CHECKING
					//starting amount must be greater than or equal to 5
					while(myStrt < 5){
						JOptionPane.showMessageDialog(frame, "Start play value must be greater or equal to 5");
						textFieldStart.setText(null);
						textFieldStart.requestFocusInWindow();
						return;
					}
					
					//stopping amount must be greater than 1
					while(myStop <= myStrt){
						
						JOptionPane.showMessageDialog(frame,"Stop play value must be greater than Start amount");
						textFieldStop.setText(null);
						textFieldStop.requestFocusInWindow();
						return; 
					}
					
					//sessions amount must be at least 1
					while(mySess < 1){
						JOptionPane.showMessageDialog(frame,"Sessions must be greater than 1");
						textFieldSession.setText(null);
						textFieldSession.requestFocusInWindow();
						return;
					}
					
					//DECK NUMBER
					//check for selected radio buttons
					if (rdbtn1decks.isSelected()){
						myDeck = 1;
					}
					
					else if (rdbtn2decks.isSelected()){
						myDeck = 2;
					}
					
					else if (rdbtn4decks.isSelected()){
						myDeck = 4;
					}
					
					else if (rdbtn6decks.isSelected()){
						myDeck = 6;
					}
					
					else if (rdbtn8decks.isSelected()){
						myDeck = 8;
					}
					
					//TABLE MINIMUM
					//check for selected radio buttons
					if (rdbtn5$.isSelected()){
						myMin = 5;
					}
					
					else if (rdbtn10$.isSelected()){
						myMin = 10;
					}
					
					else if (rdbtn15$.isSelected()){
						myMin = 15;
					}
					
					else if (rdbtn25$.isSelected()){
						myMin = 25;
					}
					
					else if (rdbtn50$.isSelected()){
						myMin = 50;
					}
					
					//check for selected check boxes
					if (chckbxMartingale.isSelected()){
						myMart = true;
					}
					
					if (chckbxMartingale_1.isSelected()){
						myMartP = true;
					}
					
					if (chckbxFlat.isSelected()){
						myFlat = true;
					}
					
					if (chckbxParoli.isSelected()){
						myPar = true;
					}
					
					if (chckbxKo.isSelected()){
						
					}
					
					if (chckbxHilo.isSelected()){
						
					}
					
					//my debug
					JOptionPane.showMessageDialog(frame,"My start: " + myStrt + "\nMy stop: " + myStop + "\nMy sessions: " + mySess);
					
					//SET VARIABLES
					game.setSessions(mySess);
					game.setDecks(myDeck);
					game.setTableMinimum(myMin);
					game.setBettingSystems(myMart, myMartP, myFlat, myPar);
					
					game.runSessions();
					
									
				} catch (NumberFormatException e1) {
					
				    // if non numeric in any text boxes
					JOptionPane.showMessageDialog(frame,"Please check your entered values! \nAll values must be ONLY numeric "
															+ "with no $ or ,\nSessions must be a non-deciaml value greater than 1.");
					
				}
				
			}//end run event listener 
			
		});
		btnRun.setBounds(5, 200, 100, 25);
		frame.getContentPane().add(btnRun);
		//end run button
		
	}//end initialize
	
	public Action getAction() {
		return action;
	}

	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
}//end main form
