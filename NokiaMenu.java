import java.util.Scanner;

	public class NokiaMenu {

		public static void main ( String [] args ) {
		Scanner input = new Scanner ( System.in );

	System.out.print ( "Press 'ok' to open the menu: " );
	String input1  =  input.nextLine();
	String ok = ( "open menu" );
	

		if ( input1.equalsIgnoreCase ("ok") ) {
		
			System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
			System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
			System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
			System.out.print ("\n10:Reminders		11:Clock		12:Profile");
			System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
			System.out.print ( "\nEnter a number:" );
			int number;
				switch ( input.nextInt() ) {

				case 1: System.out.print ( " Phone book " );
					System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags" );
					System.out.print ( "\nEnter a number: " );
						
						switch ( input.nextInt() ) {
									
							case 1: System.out.print ( "Search" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags\n11.go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Search" );
												break;
											case 2: System.out.print ( "Service Nos." );
												break;
											case 3: System.out.print ( "Add name" );
												break;
											case 4: System.out.print ( "Erase" );
												break;
											case 5: System.out.print ( "Edit" );
												break;
											case 6: System.out.print ( "Assign tone" );
												break;
											case 7: System.out.print ( "Send b'card" );
												break;
											case 8: System.out.print ( "Options" );

												System.out.print ( "\n1. Type of view\n2. Memory status" );
												System.out.print ( "\nEnter a number:" );
												switch ( input.nextInt() ) {
					
												case 1: System.out.print ( "Type of view" );
												break;
												case 2: System.out.print ( "Memory status" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
							 					 break;
											case 9: System.out.print ( "Speed dials" );
											break;
											case 10: System.out.print ( "Voice tags" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;
										
										case 14: System.out.print ( "Flashlight" );
										break;
		
										case 15: System.out.print ("Radio");
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }

								break;
							case 2: System.out.print ( "Service Nos." );
									System.out.print ("\n1. go back" );
									System.out.print ( "\nEnter a number:" );
									switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags\n11.go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Search" );
												break;
											case 2: System.out.print ( "Service Nos." );
												break;
											case 3: System.out.print ( "Add name" );
												break;
											case 4: System.out.print ( "Erase" );
												break;
											case 5: System.out.print ( "Edit" );
												break;
											case 6: System.out.print ( "Assign tone" );
												break;
											case 7: System.out.print ( "Send b'card" );
												break;
											case 8: System.out.print ( "Options" );

												System.out.print ( "\n1. Type of view\n2. Memory status" );
												System.out.print ( "\nEnter a number:" );
												switch ( input.nextInt() ) {
					
												case 1: System.out.print ( "Type of view" );
												break;
												case 2: System.out.print ( "Memory status" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
							 					 break;
											case 9: System.out.print ( "Speed dials" );
											break;
											case 10: System.out.print ( "Voice tags" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
								break;
							case 3: System.out.print ( "Add name" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags\n11.go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Search" );
												break;
											case 2: System.out.print ( "Service Nos." );
												break;
											case 3: System.out.print ( "Add name" );
												break;
											case 4: System.out.print ( "Erase" );
												break;
											case 5: System.out.print ( "Edit" );
												break;
											case 6: System.out.print ( "Assign tone" );
												break;
											case 7: System.out.print ( "Send b'card" );
												break;
											case 8: System.out.print ( "Options" );

												System.out.print ( "\n1. Type of view\n2. Memory status" );
												System.out.print ( "\nEnter a number:" );
												switch ( input.nextInt() ) {
					
												case 1: System.out.print ( "Type of view" );
												break;
												case 2: System.out.print ( "Memory status" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
							 					 break;
											case 9: System.out.print ( "Speed dials" );
											break;
											case 10: System.out.print ( "Voice tags" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
								break;
							case 4: System.out.print ( "Erase" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags\n11.go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Search" );
												break;
											case 2: System.out.print ( "Service Nos." );
												break;
											case 3: System.out.print ( "Add name" );
												break;
											case 4: System.out.print ( "Erase" );
												break;
											case 5: System.out.print ( "Edit" );
												break;
											case 6: System.out.print ( "Assign tone" );
												break;
											case 7: System.out.print ( "Send b'card" );
												break;
											case 8: System.out.print ( "Options" );

												System.out.print ( "\n1. Type of view\n2. Memory status" );
												System.out.print ( "\nEnter a number:" );
												switch ( input.nextInt() ) {
					
												case 1: System.out.print ( "Type of view" );
												break;
												case 2: System.out.print ( "Memory status" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
							 					 break;
											case 9: System.out.print ( "Speed dials" );
											break;
											case 10: System.out.print ( "Voice tags" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
								break;
							case 5: System.out.print ( "Edit" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags\n11.go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Search" );
												break;
											case 2: System.out.print ( "Service Nos." );
												break;
											case 3: System.out.print ( "Add name" );
												break;
											case 4: System.out.print ( "Erase" );
												break;
											case 5: System.out.print ( "Edit" );
												break;
											case 6: System.out.print ( "Assign tone" );
												break;
											case 7: System.out.print ( "Send b'card" );
												break;
											case 8: System.out.print ( "Options" );

												System.out.print ( "\n1. Type of view\n2. Memory status" );
												System.out.print ( "\nEnter a number:" );
												switch ( input.nextInt() ) {
					
												case 1: System.out.print ( "Type of view" );
												break;
												case 2: System.out.print ( "Memory status" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
							 					 break;
											case 9: System.out.print ( "Speed dials" );
											break;
											case 10: System.out.print ( "Voice tags" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
								break;
							case 6: System.out.print ( "Assign tone" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags\n11.go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Search" );
												break;
											case 2: System.out.print ( "Service Nos." );
												break;
											case 3: System.out.print ( "Add name" );
												break;
											case 4: System.out.print ( "Erase" );
												break;
											case 5: System.out.print ( "Edit" );
												break;
											case 6: System.out.print ( "Assign tone" );
												break;
											case 7: System.out.print ( "Send b'card" );
												break;
											case 8: System.out.print ( "Options" );

												System.out.print ( "\n1. Type of view\n2. Memory status" );
												System.out.print ( "\nEnter a number:" );
												switch ( input.nextInt() ) {
					
												case 1: System.out.print ( "Type of view" );
												break;
												case 2: System.out.print ( "Memory status" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
							 					 break;
											case 9: System.out.print ( "Speed dials" );
											break;
											case 10: System.out.print ( "Voice tags" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
								break;
							case 7: System.out.print ( "Send b'card" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags\n11.go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Search" );
												break;
											case 2: System.out.print ( "Service Nos." );
												break;
											case 3: System.out.print ( "Add name" );
												break;
											case 4: System.out.print ( "Erase" );
												break;
											case 5: System.out.print ( "Edit" );
												break;
											case 6: System.out.print ( "Assign tone" );
												break;
											case 7: System.out.print ( "Send b'card" );
												break;
											case 8: System.out.print ( "Options" );

												System.out.print ( "\n1. Type of view\n2. Memory status" );
												System.out.print ( "\nEnter a number:" );
												switch ( input.nextInt() ) {
					
												case 1: System.out.print ( "Type of view" );
												break;
												case 2: System.out.print ( "Memory status" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
							 					 break;
											case 9: System.out.print ( "Speed dials" );
											break;
											case 10: System.out.print ( "Voice tags" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
								break;
							case 8: System.out.print ( "Options" );	

									System.out.print ( "\n1. Type of view\n2. Memory status\n3. go back" );
									System.out.print ( "\nEnter a number: " );
									switch ( input.nextInt() ) {
					
									case 1: System.out.print ( "Type of view" );
									break;
									case 2: System.out.print ( "Memory status" );
									break;
									case 3: System.out.print ( "Options" );
										System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags\n11.go back" );
										System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Search" );
												break;
											case 2: System.out.print ( "Service Nos." );
												break;
											case 3: System.out.print ( "Add name" );
												break;
											case 4: System.out.print ( "Erase" );
												break;
											case 5: System.out.print ( "Edit" );
												break;
											case 6: System.out.print ( "Assign tone" );
												break;
											case 7: System.out.print ( "Send b'card" );
												break;
											case 8: System.out.print ( "Options" );

												System.out.print ( "\n1. Type of view\n2. Memory status" );
												System.out.print ( "\nEnter a number:" );
												switch ( input.nextInt() ) {
					
												case 1: System.out.print ( "Type of view" );
												break;
												case 2: System.out.print ( "Memory status" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
							 					 break;
											case 9: System.out.print ( "Speed dials" );
											break;
											case 10: System.out.print ( "Voice tags" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  
									break;
									default: System.out.print ( "Invalid" );
									break;
									}
							  break;
							case 9: System.out.print ( "Speed dials" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags\n11.go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Search" );
												break;
											case 2: System.out.print ( "Service Nos." );
												break;
											case 3: System.out.print ( "Add name" );
												break;
											case 4: System.out.print ( "Erase" );
												break;
											case 5: System.out.print ( "Edit" );
												break;
											case 6: System.out.print ( "Assign tone" );
												break;
											case 7: System.out.print ( "Send b'card" );
												break;
											case 8: System.out.print ( "Options" );

												System.out.print ( "\n1. Type of view\n2. Memory status" );
												System.out.print ( "\nEnter a number:" );
												switch ( input.nextInt() ) {
					
												case 1: System.out.print ( "Type of view" );
												break;
												case 2: System.out.print ( "Memory status" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
							 					 break;
											case 9: System.out.print ( "Speed dials" );
											break;
											case 10: System.out.print ( "Voice tags" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
								
								break;
							case 10: System.out.print ( "Voice tags" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10.Voice tags\n11.go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Search" );
												break;
											case 2: System.out.print ( "Service Nos." );
												break;
											case 3: System.out.print ( "Add name" );
												break;
											case 4: System.out.print ( "Erase" );
												break;
											case 5: System.out.print ( "Edit" );
												break;
											case 6: System.out.print ( "Assign tone" );
												break;
											case 7: System.out.print ( "Send b'card" );
												break;
											case 8: System.out.print ( "Options" );

												System.out.print ( "\n1. Type of view\n2. Memory status" );
												System.out.print ( "\nEnter a number:" );
												switch ( input.nextInt() ) {
					
												case 1: System.out.print ( "Type of view" );
												break;
												case 2: System.out.print ( "Memory status" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
							 					 break;
											case 9: System.out.print ( "Speed dials" );
											break;
											case 10: System.out.print ( "Voice tags" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
								break;

							default: System.out.print ( "Invalid" );
							break;
								}
				break;

				case 2: System.out.print ( "Messages" );

					System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10.Service command editor" );
					System.out.print ( "\nEnter a number:" );
		
						switch ( input.nextInt() ) {

							case 1: System.out.print ( "Write messages" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. voice mailbox number \n10.Service command editor\n11. go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Write messages" );
												break;
											case 2: System.out.print ( "Inbox" );
												break;
											case 3: System.out.print ( "Outbox" );
												break;
											case 4: System.out.print ( "Picture messages" );
												break;
											case 5: System.out.print ( "Templates" );
												break;
											case 6: System.out.print ( "Smileys" );
												break;
											case 7: System.out.print ( "Message settings" );
												System.out.print ( "\n1. Set 1 \n2. Common " );
												System.out.print ( "\n Enter a number:" );

												switch ( input.nextInt() ) {
														
												case 1: System.out.print ("Set 1");

													System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
													System.out.print ( "\n Enter a number:" );
													switch ( input.nextInt() ) {
													case 1: System.out.print ( "Message centre number" );
													break;
													case 2: System.out.print ( "Message sent as" );
													break;
													case  3: System.out.print ( "Message validity" );
													break;
													default: System.out.print ( "Invalid" );
													break;
													}
													break;
												case 2: System.out.print ( "Common" );
															
													System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
													System.out.print ( "\nEnter a number:" );
													switch ( input.nextInt() ) {
																	
													case 1: System.out.print ("Delivery reports");
													break;
													case 2: System.out.print ("Reply via same center");
													break;
													case 3: System.out.print ("Character support");
													break;

													default: System.out.print ("Invalid");
													break;
									 				 }
													}
												break;
											case 8: System.out.print ( "Info service" );
							 					 break;
											case 9: System.out.print ( "Voice mailbox number " );
											break;
											case 10: System.out.print ( "Service command editor" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
							break;
							case 2: System.out.print ( "Inbox" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. voice mailbox number \n10.Service command editor\n11. go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Write messages" );
												break;
											case 2: System.out.print ( "Inbox" );
												break;
											case 3: System.out.print ( "Outbox" );
												break;
											case 4: System.out.print ( "Picture messages" );
												break;
											case 5: System.out.print ( "Templates" );
												break;
											case 6: System.out.print ( "Smileys" );
												break;
											case 7: System.out.print ( "Message settings" );
												System.out.print ( "\n1. Set 1 \n2. Common " );
												System.out.print ( "\n Enter a number:" );

												switch ( input.nextInt() ) {
														
												case 1: System.out.print ("Set 1");

													System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
													System.out.print ( "\n Enter a number:" );
													switch ( input.nextInt() ) {
													case 1: System.out.print ( "Message centre number" );
													break;
													case 2: System.out.print ( "Message sent as" );
													break;
													case  3: System.out.print ( "Message validity" );
													break;
													default: System.out.print ( "Invalid" );
													break;
													}
													break;
												case 2: System.out.print ( "Common" );
															
													System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
													System.out.print ( "\nEnter a number:" );
													switch ( input.nextInt() ) {
																	
													case 1: System.out.print ("Delivery reports");
													break;
													case 2: System.out.print ("Reply via same center");
													break;
													case 3: System.out.print ("Character support");
													break;

													default: System.out.print ("Invalid");
													break;
									 				 }
													}
												break;
											case 8: System.out.print ( "Info service" );
							 					 break;
											case 9: System.out.print ( "Voice mailbox number " );
											break;
											case 10: System.out.print ( "Service command editor" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
							break;
							case 3: System.out.print ( "Outbox" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. voice mailbox number \n10.Service command editor\n11. go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Write messages" );
												break;
											case 2: System.out.print ( "Inbox" );
												break;
											case 3: System.out.print ( "Outbox" );
												break;
											case 4: System.out.print ( "Picture messages" );
												break;
											case 5: System.out.print ( "Templates" );
												break;
											case 6: System.out.print ( "Smileys" );
												break;
											case 7: System.out.print ( "Message settings" );
												System.out.print ( "\n1. Set 1 \n2. Common " );
												System.out.print ( "\n Enter a number:" );

												switch ( input.nextInt() ) {
														
												case 1: System.out.print ("Set 1");

													System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
													System.out.print ( "\n Enter a number:" );
													switch ( input.nextInt() ) {
													case 1: System.out.print ( "Message centre number" );
													break;
													case 2: System.out.print ( "Message sent as" );
													break;
													case  3: System.out.print ( "Message validity" );
													break;
													default: System.out.print ( "Invalid" );
													break;
													}
													break;
												case 2: System.out.print ( "Common" );
															
													System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
													System.out.print ( "\nEnter a number:" );
													switch ( input.nextInt() ) {
																	
													case 1: System.out.print ("Delivery reports");
													break;
													case 2: System.out.print ("Reply via same center");
													break;
													case 3: System.out.print ("Character support");
													break;

													default: System.out.print ("Invalid");
													break;
									 				 }
													}
												break;
											case 8: System.out.print ( "Info service" );
							 					 break;
											case 9: System.out.print ( "Voice mailbox number " );
											break;
											case 10: System.out.print ( "Service command editor" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
							break;
							case 4: System.out.print ( "Picture messages" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. voice mailbox number \n10.Service command editor\n11. go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Write messages" );
												break;
											case 2: System.out.print ( "Inbox" );
												break;
											case 3: System.out.print ( "Outbox" );
												break;
											case 4: System.out.print ( "Picture messages" );
												break;
											case 5: System.out.print ( "Templates" );
												break;
											case 6: System.out.print ( "Smileys" );
												break;
											case 7: System.out.print ( "Message settings" );
												System.out.print ( "\n1. Set 1 \n2. Common " );
												System.out.print ( "\n Enter a number:" );

												switch ( input.nextInt() ) {
														
												case 1: System.out.print ("Set 1");

													System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
													System.out.print ( "\n Enter a number:" );
													switch ( input.nextInt() ) {
													case 1: System.out.print ( "Message centre number" );
													break;
													case 2: System.out.print ( "Message sent as" );
													break;
													case  3: System.out.print ( "Message validity" );
													break;
													default: System.out.print ( "Invalid" );
													break;
													}
													break;
												case 2: System.out.print ( "Common" );
															
													System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
													System.out.print ( "\nEnter a number:" );
													switch ( input.nextInt() ) {
																	
													case 1: System.out.print ("Delivery reports");
													break;
													case 2: System.out.print ("Reply via same center");
													break;
													case 3: System.out.print ("Character support");
													break;

													default: System.out.print ("Invalid");
													break;
									 				 }
													}
												break;
											case 8: System.out.print ( "Info service" );
							 					 break;
											case 9: System.out.print ( "Voice mailbox number " );
											break;
											case 10: System.out.print ( "Service command editor" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
							break;
							case 5: System.out.print ( "Templates" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. voice mailbox number \n10.Service command editor\n11. go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Write messages" );
												break;
											case 2: System.out.print ( "Inbox" );
												break;
											case 3: System.out.print ( "Outbox" );
												break;
											case 4: System.out.print ( "Picture messages" );
												break;
											case 5: System.out.print ( "Templates" );
												break;
											case 6: System.out.print ( "Smileys" );
												break;
											case 7: System.out.print ( "Message settings" );
												System.out.print ( "\n1. Set 1 \n2. Common " );
												System.out.print ( "\n Enter a number:" );

												switch ( input.nextInt() ) {
														
												case 1: System.out.print ("Set 1");

													System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
													System.out.print ( "\n Enter a number:" );
													switch ( input.nextInt() ) {
													case 1: System.out.print ( "Message centre number" );
													break;
													case 2: System.out.print ( "Message sent as" );
													break;
													case  3: System.out.print ( "Message validity" );
													break;
													default: System.out.print ( "Invalid" );
													break;
													}
													break;
												case 2: System.out.print ( "Common" );
															
													System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
													System.out.print ( "\nEnter a number:" );
													switch ( input.nextInt() ) {
																	
													case 1: System.out.print ("Delivery reports");
													break;
													case 2: System.out.print ("Reply via same center");
													break;
													case 3: System.out.print ("Character support");
													break;

													default: System.out.print ("Invalid");
													break;
									 				 }
													}
												break;
											case 8: System.out.print ( "Info service" );
							 					 break;
											case 9: System.out.print ( "Voice mailbox number " );
											break;
											case 10: System.out.print ( "Service command editor" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
							break;
							case 6: System.out.print ( "Smileys" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. voice mailbox number \n10.Service command editor\n11. go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Write messages" );
												break;
											case 2: System.out.print ( "Inbox" );
												break;
											case 3: System.out.print ( "Outbox" );
												break;
											case 4: System.out.print ( "Picture messages" );
												break;
											case 5: System.out.print ( "Templates" );
												break;
											case 6: System.out.print ( "Smileys" );
												break;
											case 7: System.out.print ( "Message settings" );
												System.out.print ( "\n1. Set 1 \n2. Common " );
												System.out.print ( "\n Enter a number:" );

												switch ( input.nextInt() ) {
														
												case 1: System.out.print ("Set 1");

													System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
													System.out.print ( "\n Enter a number:" );
													switch ( input.nextInt() ) {
													case 1: System.out.print ( "Message centre number" );
													break;
													case 2: System.out.print ( "Message sent as" );
													break;
													case  3: System.out.print ( "Message validity" );
													break;
													default: System.out.print ( "Invalid" );
													break;
													}
													break;
												case 2: System.out.print ( "Common" );
															
													System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
													System.out.print ( "\nEnter a number:" );
													switch ( input.nextInt() ) {
																	
													case 1: System.out.print ("Delivery reports");
													break;
													case 2: System.out.print ("Reply via same center");
													break;
													case 3: System.out.print ("Character support");
													break;

													default: System.out.print ("Invalid");
													break;
									 				 }
													}
												break;
											case 8: System.out.print ( "Info service" );
							 					 break;
											case 9: System.out.print ( "Voice mailbox number " );
											break;
											case 10: System.out.print ( "Service command editor" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
							break;
							case 7: System.out.print ( "Message setting" );

							System.out.print ( "\n1. Set 1 \n2. Common \n3. go back " );
							System.out.print ( "\nEnter a number: " );

								switch ( input.nextInt() ) {
														
								case 1: System.out.print ("Set 1");

									System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
									System.out.print ( "\n Enter a number:" );
									switch ( input.nextInt() ) {
									case 1: System.out.print ( "Message centre number" );
									break;
									case 2: System.out.print ( "Message sent as" );
									break;
									case  3: System.out.print ( "Message validity" );
									break;
									default: System.out.print ( "Invalid" );
									break;
									}
									break;
			
								case 2: System.out.print ( "Common" );
															
									System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
									System.out.print ( "\nEnter a number:" );
									switch ( input.nextInt() ) {
																	
									case 1: System.out.print ("Delivery reports");
										break;
									case 2: System.out.print ("Reply via same center");
										break;
									case 3: System.out.print ("Character support");
										break;

									default: System.out.print ("Invalid");
										break;
									  }

								case 3: System.out.print ( "Message" );
									System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. voice mailbox number \n10.Service command editor\n11. go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Write messages" );
												break;
											case 2: System.out.print ( "Inbox" );
												break;
											case 3: System.out.print ( "Outbox" );
												break;
											case 4: System.out.print ( "Picture messages" );
												break;
											case 5: System.out.print ( "Templates" );
												break;
											case 6: System.out.print ( "Smileys" );
												break;
											case 7: System.out.print ( "Message settings" );
												System.out.print ( "\n1. Set 1 \n2. Common " );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
														
												case 1: System.out.print ("Set 1");

													System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
													System.out.print ( "\n Enter a number:" );
													switch ( input.nextInt() ) {
													case 1: System.out.print ( "Message centre number" );
													break;
													case 2: System.out.print ( "Message sent as" );
													break;
													case  3: System.out.print ( "Message validity" );
													break;
													default: System.out.print ( "Invalid" );
													break;
													}
													break;
												case 2: System.out.print ( "Common" );
															
													System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
													System.out.print ( "\nEnter a number:" );
													switch ( input.nextInt() ) {
																	
													case 1: System.out.print ("Delivery reports");
													break;
													case 2: System.out.print ("Reply via same center");
													break;
													case 3: System.out.print ("Character support");
													break;

													default: System.out.print ("Invalid");
													break;
									 				 }
													}
												break;
											case 8: System.out.print ( "Info service" );
							 					 break;
											case 9: System.out.print ( "Voice mailbox number " );
											break;
											case 10: System.out.print ( "Service command editor" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
								break;
								}
							break;

							case 8: System.out.print ( "Info service" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. voice mailbox number \n10.Service command editor\n11. go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Write messages" );
												break;
											case 2: System.out.print ( "Inbox" );
												break;
											case 3: System.out.print ( "Outbox" );
												break;
											case 4: System.out.print ( "Picture messages" );
												break;
											case 5: System.out.print ( "Templates" );
												break;
											case 6: System.out.print ( "Smileys" );
												break;
											case 7: System.out.print ( "Message settings" );
												System.out.print ( "\n1. Set 1 \n2. Common " );
												System.out.print ( "\n Enter a number:" );

												switch ( input.nextInt() ) {
														
												case 1: System.out.print ("Set 1");

													System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
													System.out.print ( "\n Enter a number:" );
													switch ( input.nextInt() ) {
													case 1: System.out.print ( "Message centre number" );
													break;
													case 2: System.out.print ( "Message sent as" );
													break;
													case  3: System.out.print ( "Message validity" );
													break;
													default: System.out.print ( "Invalid" );
													break;
													}
													break;
												case 2: System.out.print ( "Common" );
															
													System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
													System.out.print ( "\nEnter a number:" );
													switch ( input.nextInt() ) {
																	
													case 1: System.out.print ("Delivery reports");
													break;
													case 2: System.out.print ("Reply via same center");
													break;
													case 3: System.out.print ("Character support");
													break;

													default: System.out.print ("Invalid");
													break;
									 				 }
													}
												break;
											case 8: System.out.print ( "Info service" );
							 					 break;
											case 9: System.out.print ( "Voice mailbox number " );
											break;
											case 10: System.out.print ( "Service command editor" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
							break;
							case 9: System.out.print ( "Voice mailbox number" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. voice mailbox number \n10.Service command editor\n11. go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Write messages" );
												break;
											case 2: System.out.print ( "Inbox" );
												break;
											case 3: System.out.print ( "Outbox" );
												break;
											case 4: System.out.print ( "Picture messages" );
												break;
											case 5: System.out.print ( "Templates" );
												break;
											case 6: System.out.print ( "Smileys" );
												break;
											case 7: System.out.print ( "Message settings" );
												System.out.print ( "\n1. Set 1 \n2. Common " );
												System.out.print ( "\n Enter a number:" );

												switch ( input.nextInt() ) {
														
												case 1: System.out.print ("Set 1");

													System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
													System.out.print ( "\n Enter a number:" );
													switch ( input.nextInt() ) {
													case 1: System.out.print ( "Message centre number" );
													break;
													case 2: System.out.print ( "Message sent as" );
													break;
													case  3: System.out.print ( "Message validity" );
													break;
													default: System.out.print ( "Invalid" );
													break;
													}
													break;
												case 2: System.out.print ( "Common" );
															
													System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
													System.out.print ( "\nEnter a number:" );
													switch ( input.nextInt() ) {
																	
													case 1: System.out.print ("Delivery reports");
													break;
													case 2: System.out.print ("Reply via same center");
													break;
													case 3: System.out.print ("Character support");
													break;

													default: System.out.print ("Invalid");
													break;
									 				 }
													}
												break;
											case 8: System.out.print ( "Info service" );
							 					 break;
											case 9: System.out.print ( "Voice mailbox number " );
											break;
											case 10: System.out.print ( "Service command editor" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
							break;
							case 10: System.out.print ( "Service command editor" );
								System.out.print ("\n1. go back" );
								System.out.print ( "\nEnter a number:" );
								switch (input.nextInt()) {
									case 1:System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. voice mailbox number \n10.Service command editor\n11. go back" );
									System.out.print ("\nEnter a number:");
										switch (input.nextInt()) {
											case 1: System.out.print ( "Write messages" );
												break;
											case 2: System.out.print ( "Inbox" );
												break;
											case 3: System.out.print ( "Outbox" );
												break;
											case 4: System.out.print ( "Picture messages" );
												break;
											case 5: System.out.print ( "Templates" );
												break;
											case 6: System.out.print ( "Smileys" );
												break;
											case 7: System.out.print ( "Message settings" );
												System.out.print ( "\n1. Set 1 \n2. Common " );
												System.out.print ( "\n Enter a number:" );

												switch ( input.nextInt() ) {
														
												case 1: System.out.print ("Set 1");

													System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
													System.out.print ( "\n Enter a number:" );
													switch ( input.nextInt() ) {
													case 1: System.out.print ( "Message centre number" );
													break;
													case 2: System.out.print ( "Message sent as" );
													break;
													case  3: System.out.print ( "Message validity" );
													break;
													default: System.out.print ( "Invalid" );
													break;
													}
													break;
												case 2: System.out.print ( "Common" );
															
													System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
													System.out.print ( "\nEnter a number:" );
													switch ( input.nextInt() ) {
																	
													case 1: System.out.print ("Delivery reports");
													break;
													case 2: System.out.print ("Reply via same center");
													break;
													case 3: System.out.print ("Character support");
													break;

													default: System.out.print ("Invalid");
													break;
									 				 }
													}
												break;
											case 8: System.out.print ( "Info service" );
							 					 break;
											case 9: System.out.print ( "Voice mailbox number " );
											break;
											case 10: System.out.print ( "Service command editor" );
											break;
											case 11: System.out.print ( "go back" );
												System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor" );
														System.out.print ( "\nEnter a number: " );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\n Enter a number: " );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\n Enter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
			

		    							   }

		
     								  }
							break;

							default: System.out.print ( "Invalid" );
							break;
								}
				break;

				case 3: System.out.print ( "Chat");
												System.out.print ("\n1. go back" );
												System.out.print ("\nEnter a number:");
												switch (input.nextInt() ){

											case 1:	System.out.print ( "\n1: Phone book		2: Messages		3: Chat" );
												System.out.print ( "\n4: Call register	5: Tones		6: Settings" );
												System.out.print ("\n7: Call divert		8: Games	      	9: Calculator" );
												System.out.print ("\n10:Reminders		11:Clock		12:Profile");
												System.out.print ("\n13:SIM services		14:Flashlight		15:Radio " );
												System.out.print ( "\nEnter a number:" );
													switch (input.nextInt()) {
							
														case 1: System.out.print ( " Phone book " );
														System.out.print ( "\n1. Search \n2. Service Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags" );
														System.out.print ( "\nEnter a number: " );
						
														switch ( input.nextInt() ) {
									
														case 1: System.out.print ( "Search" );
														break;
														case 2: System.out.print ( "Service Nos." );
														break;
														case 3: System.out.print ( "Add name" );
														break;
														case 4: System.out.print ( "Erase" );
														break;
														case 5: System.out.print ( "Edit" );
														break;
														case 6: System.out.print ( "Assign tone" );
														break;
														case 7: System.out.print ( "Send b'card" );
														break;
														case 8: System.out.print ( "Options" );

														System.out.print ( "\n1. Type of view\n2. Memory status" );
														System.out.print ( "\nEnter a number: " );
														switch ( input.nextInt() ) {
					
														case 1: System.out.print ( "Type of view" );
														break;
														case 2: System.out.print ( "Memory status" );
														break;
														default: System.out.print ( "Invalid" );
														break;
														}
														  break;
														case 9: System.out.print ( "Speed dials" );
														break;
														case 10: System.out.print ( "Voice tags" );
														break;

														default: System.out.print ( "Invalid" );
														break;
														}
													break;

														case 2: System.out.print ( "Messages" );

														System.out.print ( "\n1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates \n6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10.Service command editor" );
														System.out.print ( "\nEnter a number:" );
		
														switch ( input.nextInt() ) {

														case 1: System.out.print ( "Write messages" );
														break;
														case 2: System.out.print ( "Inbox" );
														break;
														case 3: System.out.print ( "Outbox" );
														break;
														case 4: System.out.print ( "Picture messages" );
														break;
														case 5: System.out.print ( "Templates" );
														break;
														case 6: System.out.print ( "Smileys" );
														break;
														case 7: System.out.print ( "Message setting" );

														System.out.print ( "\n1. Set 1 \n2. Common " );
														System.out.print ( "\nEnter a number:" );

														switch ( input.nextInt() ) {
														
														case 1: System.out.print ("Set 1");

															System.out.print ( "\n1. Message centre number  \n2. Message sent as \n3. Message validity" );
																System.out.print ( "\nEnter a number:" );
																	switch ( input.nextInt() ) {
															case 1: System.out.print ( "Message centre number" );
															break;
															case 2: System.out.print ( "Message sent as" );
															break;
															case  3: System.out.print ( "Message validity" );
															break;
															default: System.out.print ( "Invalid" );
															break;
															}
															break;
			
															case 2: System.out.print ( "Common" );
																	
															System.out.print ( "\n1. Delivery reports; \n2. Reply via same center \n3. Character support" );
															System.out.print ( "\nEnter a number:" );
															switch ( input.nextInt() ) {
																	
															case 1: System.out.print ("Delivery reports");
															break;
															case 2: System.out.print ("Reply via same center");
															break;
															case 3: System.out.print ("Character support");
															break;

															default: System.out.print ("Invalid");
															break;
									  						}
														}
														break;

															case 8: System.out.print ( "Info service" );
															break;
															case 9: System.out.print ( "Voice mailbox number" );
															break;
															case 10: System.out.print ( "Service command editor" );
															break;

															default: System.out.print ( "Invalid" );
															break;
															}
														break;

															case 3: System.out.print ( "Chat");
														break;

															case 4: System.out.print ( "Call register" );

															System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt() ) {

															case 1: System.out.print ( "Missed calls" );
							 								break;
															case 2: System.out.print ( "Received calls" );
															break;
															case 3: System.out.print ( "Dialled numbers" );
															break;
															case 4: System.out.print ( "Erase recent call lists" );
															break;
														case 5: System.out.print ( "Show call duration" );

														System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
															System.out.print ( "\nEnter a number:");
															switch ( input.nextInt () ) {

															case 1: System.out.print ( "Last call duration" );
															break;
															case 2: System.out.print ( "All calls duration" );
															break;
															case 3: System.out.print ( "Received calls duration" );
															break;
															case 4: System.out.print ( "Dialled calls duration" );
															break;
															case 5: System.out.print ( "Clear timers" );
															break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
													break;
														case 6: System.out.print ( "Show call costs" );

														System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
														System.out.print ( "\nEnter a number:");
														switch ( input.nextInt() ) {
							
														case 1: System.out.print ( "Last call costs" );
														break;
														case 2: System.out.print ( "All calls cost" );
														break;
														case 3: System.out.print ( "Clear counters" );
														break;
														default: System.out.print ( "Invalid" );
														break;
									
													}
														break;
													case 7: System.out.print ( "Call cost settings" );

													System.out.print ( "\n1. Call cost limit\n2. Show costs in");
													System.out.print ( "\nEnter a number:");
													switch ( input.nextInt() ) {
			
													case 1: System.out.print ( "Call cost limit" );
													break;
													case 2: System.out.print ( "Show costs in" );
													break;
													default: System.out.print ( "Invalid" );
													break;
								
													}
													break;
													case 8: System.out.print ( "Prepaid credit" );
													break;
													default: System.out.print ( "Invalid" );
													break;
		
												}

												break;	

												case 5: System.out.print ( "Tones" );

												System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
												System.out.print ( "\nEnter a number:");
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Ringing tone" );
												break;
												case 2: System.out.print ( "Ringing volume" );
												break;
												case 3: System.out.print ( "Incoming call alert" );
												break;
												case 4: System.out.print ( "Composer" );
												break;
												case 5: System.out.print ( "Message alert tone" );
												break;
												case 6: System.out.print ( "Keypad tones" );
												break;
												case 7: System.out.print ( "Warning and games tones" );
												break;
												case 8: System.out.print ( "Vibrating alert" );
												break;
												case 9: System.out.print ( "Screen saver" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;

										case 6: System.out.print ( "Settings" );

										System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
										System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
										System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
										System.out.print ( "\n4. Restore factory settings");
										System.out.print ( "\nEnter a number:");
				
												switch ( input.nextInt() ) {

												case 1: System.out.print ( "Call dettings" );
												System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
												System.out.print ( "\nEnter a number:" );

												switch ( input.nextInt() ) {
												case 1: System.out.print ( "Automatic redial" );
												break;
												case 2: System.out.print ( "Speed dialling" );
												break;
												case 3: System.out.print ( "Call waiting options" );
												break;
												case 4: System.out.print ( "Own number sending" );
												break;
												case 5: System.out.print ( "Phone line in use" );
												break;
												case 6: System.out.print ( "Automatic answer" );
												break;
												default: System.out.print ( "Invalid" );
												break;
												}
											break;
						
										case 2: System.out.print ( "Phone settings" );
										System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
										System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Language" );
											break;
											case 2: System.out.print ( "Cell info display" );
											break;
											case 3: System.out.print ( "Welcome note" );
											break;
											case 4: System.out.print ( "Network selection" );
											break;
											case 5: System.out.print ( "Lights" );
											break;
											case 6: System.out.print ( "Confirm SIM service actions" );
											break;
											default: System.out.print ( "Invalid" );
											break;
											}
										break;
									
											case 3: System.out.print ( "Security settings" );
											System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
											System.out.print ( "\nEnter a number:" );

											switch ( input.nextInt() ) {
											case 1: System.out.print ( "Pin code request" );
											break;
											case 2: System.out.print ( "Call barring service" );
											break;
											case 3: System.out.print ( "Fixed dialling" );
											break;
											case 4: System.out.print ( "Closed user group" );
											break;
											case 5: System.out.print ( "Phone security" );
											break;
											case 6: System.out.print ( "Change access codes" );
											break;
											default: System.out.print ( "Invalid" );
										break;
										}
									break;
											case 4: System.out.print ( "Restore factory settings" );
											break;
										}
									break;
				
										case  7: System.out.print ( "Call divert" );
										break;

										case 8: System.out.print ( "Games" );
										break;
	
										case 9: System.out.print ( "Calculator" );
										break;
				
										case 10: System.out.print ( "Reminders" );
										break;

										case 11: System.out.print ( "Clock" );
										System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
										System.out.print ( "\nEnter a number:" );

										switch ( input.nextInt() ) {

										case  1: System.out.print ( "Alarm clock" );
										break;
										case 2: System.out.print ( "Clock settings" );
										break;
										case 3: System.out.print ( "Date setting" );
										break;
										case 4: System.out.print ( "Stopwatch" );
										break;
										case 5: System.out.print ( "Countdown timer" );
										break;
										case 6: System.out.print ( "Auto update of date and time" );
										break;
										default: System.out.print ( "Invalid" );
										break;
										}
										break;

										case 12: System.out.print ( "Profiles" );
										break;

										case 13: System.out.print ( "SIM services" );
										break;
										
										case 14: System.out.print ( "Flashlight" );
										break;
		
										case 15: System.out.print ("Radio");
										break;

										default: System.out.print ( "Invalid" );
										break;
										}
									break;
							}
					
				break;
				case 4: System.out.print ( "Call register" );
				System.out.print ( "\n1. Missed calls \n2. Received calls \n3. Dialled numbers \n4. Erase recent call lists \n5. Show call duration \n		1. Last call duration \n		2. All calls duration \n		3. Received calls duration \n 		4. Dialled calls duration \n		5.Clear times \n6. Show call costs\n		1. Last call cost\n	 	2. All calls cost\n		3. Clear counters\n7. Call cost settings\n		1. Call cost limit\n		2. Show costs in\n8. Prepaid credit");
				System.out.print ( "\nEnter a number:");
						switch ( input.nextInt() ) {

							case 1: System.out.print ( "Missed calls" );
							 	break;
							case 2: System.out.print ( "Received calls" );
								break;
							case 3: System.out.print ( "Dialled numbers" );
								break;
							case 4: System.out.print ( "Erase recent call lists" );
								break;
							case 5: System.out.print ( "Show call duration" );

								System.out.print ( "\n1. Last call duration\n2. All calls duration\n3. Received calls duration\n4. Dialled calls duration\n5. Clear times");
								System.out.print ( "\nEnter a number:");
								switch ( input.nextInt () ) {

									case 1: System.out.print ( "Last call duration" );
										break;
									case 2: System.out.print ( "All calls duration" );
										break;
									case 3: System.out.print ( "Received calls duration" );
										break;
									case 4: System.out.print ( "Dialled calls duration" );
										break;
									case 5: System.out.print ( "Clear timers" );
										break;
									default: System.out.print ( "Invalid" );
										break;
									
								}
								break;
							case 6: System.out.print ( "Show call costs" );

								System.out.print ( "\n1. Last call costs\n2. All calls cost\n3. Clear counters");
								System.out.print ( "\nEnter a number:");
								switch ( input.nextInt() ) {
							
									case 1: System.out.print ( "Last call costs" );
										break;
									case 2: System.out.print ( "All calls cost" );
										break;
									case 3: System.out.print ( "Clear counters" );
										break;
									default: System.out.print ( "Invalid" );
										break;
									
								}
								break;
							case 7: System.out.print ( "Call cost settings" );

								System.out.print ( "\n1. Call cost limit\n2. Show costs in");
								System.out.print ( "\nEnter a number:");
								switch ( input.nextInt() ) {
			
									case 1: System.out.print ( "Call cost limit" );
										break;
									case 2: System.out.print ( "Show costs in" );
										break;
									default: System.out.print ( "Invalid" );
										break;
								
								}
								break;
							case 8: System.out.print ( "Prepaid credit" );
								break;
							default: System.out.print ( "Invalid" );
								break;
		
						}

				break;	

				case 5: System.out.print ( "Tones" );
					System.out.print ( "\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tones\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver" );
					System.out.print ( "\nEnter a number:");
						switch ( input.nextInt() ) {

							case 1: System.out.print ( "Ringing tone" );
								break;
							case 2: System.out.print ( "Ringing volume" );
								break;
							case 3: System.out.print ( "Incoming call alert" );
								break;
							case 4: System.out.print ( "Composer" );
								break;
							case 5: System.out.print ( "Message alert tone" );
								break;
							case 6: System.out.print ( "Keypad tones" );
								break;
							case 7: System.out.print ( "Warning and games tones" );
								break;
							case 8: System.out.print ( "Vibrating alert" );
								break;
							case 9: System.out.print ( "Screen saver" );
								break;
							default: System.out.print ( "Invalid" );
								break;
						}
				break;

				case 6: System.out.print ( "Settings" );

					System.out.print ( "\n1. Call settings\n		1. Automatic redial\n		2.Speed dialling\n		3. Call waiting  options\n		4. Own number sending	\n		5. Phone line in use\n		6. Automatic answer" );
					System.out.print ( "\n2. Phone settings\n		1. Languages\n		2. Cell info display\n		3. Welcome note\n		4. Network selection\n		5. Lights\n		6. Confirm SIM service actions" );
					System.out.print ( "\n3. Security settings\n		1. PIN code request\n		2. Call barring service\n		3. Fixed dailling\n		4. Closed user group\n		5. Phone security\n		6.Change access codes");
					System.out.print ( "\n4. Restore factory settings");
					System.out.print ( "\nEnter a number:");
				
					switch ( input.nextInt() ) {

						case 1: System.out.print ( "Call dettings" );
							System.out.print ( "\n1. Automatic redial\n2.Speed dialling\n3. Call waiting  options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer" );
							System.out.print ( "\nEnter a number:" );

							switch ( input.nextInt() ) {
								case 1: System.out.print ( "Automatic redial" );
									break;
								case 2: System.out.print ( "Speed dialling" );
									break;
								case 3: System.out.print ( "Call waiting options" );
									break;
								case 4: System.out.print ( "Own number sending" );
									break;
								case 5: System.out.print ( "Phone line in use" );
									break;
								case 6: System.out.print ( "Automatic answer" );
									break;
								default: System.out.print ( "Invalid" );
									break;
							}
						break;
						
						case 2: System.out.print ( "Phone settings" );
							System.out.print ( "\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions" );
							System.out.print ( "\nEnter a number:" );

							switch ( input.nextInt() ) {
								case 1: System.out.print ( "Language" );
									break;
								case 2: System.out.print ( "Cell info display" );
									break;
								case 3: System.out.print ( "Welcome note" );
									break;
								case 4: System.out.print ( "Network selection" );
									break;
								case 5: System.out.print ( "Lights" );
									break;
								case 6: System.out.print ( "Confirm SIM service actions" );
									break;
								default: System.out.print ( "Invalid" );
									break;
							}
						break;
					
						case 3: System.out.print ( "Security settings" );
							System.out.print ( "\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4.Closed user group\n5. Phone security\n6. Change access codes" );
							System.out.print ( "\nEnter a number:" );

							switch ( input.nextInt() ) {
								case 1: System.out.print ( "Pin code request" );
									break;
								case 2: System.out.print ( "Call barring service" );
									break;
								case 3: System.out.print ( "Fixed dialling" );
									break;
								case 4: System.out.print ( "Closed user group" );
									break;
								case 5: System.out.print ( "Phone security" );
									break;
								case 6: System.out.print ( "Change access codes" );
									break;
								default: System.out.print ( "Invalid" );
									break;
							}
						break;
						case 4: System.out.print ( "Restore factory settings" );
							break;
					}
				break;
				
				case  7: System.out.print ( "Call divert" );
				break;

				case 8: System.out.print ( "Games" );
				break;
	
				case 9: System.out.print ( "Calculator" );
				break;
				
				case 10: System.out.print ( "Reminders" );
				break;

				case 11: System.out.print ( "Clock" );
					System.out.print ( "\n1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown time \n6. Auto update of date and time" );
					System.out.print ( "\nEnter a number:" );

					switch ( input.nextInt() ) {

						case  1: System.out.print ( "Alarm clock" );
							break;
						case 2: System.out.print ( "Clock settings" );
							break;
						case 3: System.out.print ( "Date setting" );
							break;
						case 4: System.out.print ( "Stopwatch" );
							break;
						case 5: System.out.print ( "Countdown timer" );
							break;
						case 6: System.out.print ( "Auto update of date and time" );
							break;
						default: System.out.print ( "Invalid" );
							break;
						}
				break;

				case 12: System.out.print ( "Profiles" );
				break;

				case 13: System.out.print ( "SIM services" );
				break;

				default: System.out.print ( "Invalid" );
				break;
			}
			

		       }

		else {

			System.out.print ( "Invalid Key Entered \nPlease press 'ok' to open Menu" );
		}
	
           }

}