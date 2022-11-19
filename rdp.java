import org.antlr.v4.runtime.Token;

public class rdp {
	gram lexer;
	Token token;
	Token tk;
	rdp(gram lexer){
		this.lexer = lexer;
	}
	public boolean start() {
		System.out.println("At start");
		token = lexer.nextToken();
		if(token.getType()==-1) {
			return true;
		}
		else if(programs()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean programs() {
		System.out.println("At programs");
		if(token.getType()==-1){
			return true;
		}
		else {
			if(program()) {
				token=lexer.nextToken();
				if(token.getType()==-1) {
					return true;
				}
				else {
					return programs();
				}
			}
			else {
				return false;
			}
		}
	}
	public boolean program() {
		System.out.println("At program");
		
		if(token.getType()==-1){
			return true;
		}
		else {
			tk=token;
			if(importst() || classdef() || mainfun() || function() ) {
				return true;
			}
			else {
				
				return false;
			}
		}
	}
	
	public Boolean importst()
	{
		System.out.println("at import statement  ");
		token = tk;
		if(token.getType()==1) {
			token=lexer.nextToken();
			if(token.getType()==1) {
				token=lexer.nextToken();	
				if(token.getType()==8) {
					token=lexer.nextToken();
					System.out.println("true");
					if(programs()) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	public Boolean classdef() {
		System.out.println("at class definition");
		token = tk;
		if(token.getType()==1) {
			
			token=lexer.nextToken();
		
			if(token.getType()==2) {
				token=lexer.nextToken();
				
				if(token.getType()==18) {
					token=lexer.nextToken();
					
				if(token.getType()==12) {
						token=lexer.nextToken();
						
					if(programs()) {
						System.out.println("true");	
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	
	public boolean mainfun() {
		token = tk;
		System.out.println("main function");
			if(token.getType()==1) {
				token=lexer.nextToken();
				if(token.getType()==1) {
					token=lexer.nextToken();
				if(token.getType()==1) {
					token=lexer.nextToken();
					if(token.getType()==9) {
						token=lexer.nextToken();
						if(token.getType()==1) {
							token=lexer.nextToken();
						if(token.getType()==14) {
							token=lexer.nextToken();		
							if(token.getType()==9) {
								token=lexer.nextToken();
								
								if(token.getType()==10) {
									token=lexer.nextToken();
									if(token.getType()==11) {
										token=lexer.nextToken();
										if(token.getType()==1) {
											token=lexer.nextToken();
											if(token.getType()==15) {
												token=lexer.nextToken();
												if(token.getType()==12) {
													token=lexer.nextToken();
									if(statements()) {
										token=lexer.nextToken();
										if(token.getType()==13) {
											System.out.println("true");
											return true;
										}
										else {
											return false;
										}
									}
									else {
										return false;
									}
								}
								else {
									return false;
								}
							}
							else {
								return false;
							}
						}
										else {
											return false;
										}
										}
										else {
											return false;
										}
									}
									else {
										return false;
									}
								}
								else {
									return false;
								}
							}
							else {
								return false;
							}
						}
						else {
							return false;
						}
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
	}
	
	public boolean function() {
		token = tk;
		System.out.println("At function");
		System.out.println(token);
			if(token.getType()==1) {
				token=lexer.nextToken();
				if(token.getType()==9) {
					token=lexer.nextToken();
					if(token.getType()==18) {
						token=lexer.nextToken();
						if(token.getType()==14) {
							token=lexer.nextToken();
						if(token.getType()==-1 || functionParameters()) {
							token=lexer.nextToken();				
							if(token.getType()==15) {
								token=lexer.nextToken();
								if(token.getType()==12) {
									token=lexer.nextToken();
									if(statements()) {
										token=lexer.nextToken();
										if(token.getType()==13) {
											System.out.println("true");
											return true;
										}
										else {
											return false;
										}
									}
									else {
										return false;
									}
								}
								else {
									return false;
								}
							}
							else {
								return functionParameters();
							}
						}
						else {
							return false;
						}
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
	}
	public boolean functionParameters() {
		System.out.println("At functionParameters");
		if(token.getType()==-1){
			return true;
		}
		else {
			if(functionParameter()) {
//				token=lexer.nextToken();
				return true;
			}
			else {
				return false;
			}
		}
	}
	public boolean functionParameter() {
		System.out.println("At functionParameter");
		
		if(token.getType()==-1){
			return true;
		}
		else {
			if(token.getType()==169) {
				token=lexer.nextToken();
				if(token.getType()==26) {
					token=lexer.nextToken();
					if(token.getType()==6) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
	}
	
	
	
	public boolean arrayType() {
		System.out.println("At arrayType");
		if(token.getType()==78) {
			token=lexer.nextToken();
			if(token.getType()== 46) {
				token=lexer.nextToken();
					if(token.getType()==47) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		
	
	public boolean statements() {
		System.out.println("at Statements");
		if(statement()) {
			token=lexer.nextToken();
			if(token.getType()== 13) {
				return true;
			}
			else {
			return statements();
			}
		}
		else{
			return true;
		}
	}
	public Boolean statement() {
		System.out.println("at statement");
		if(elseblock()||ifcall()||whilecall()||functionCall() || variableDec()  || inputCall() ) {
			return true;
		}
		else {
			return false;
		}
	}
	public Boolean functionCall() {
		System.out.println("at functionCall");
		if(token.getType() == 2) {
			token=lexer.nextToken();
			if(token.getType() == 8) {
				token=lexer.nextToken();
				if(token.getType() == 3) {
					token=lexer.nextToken();
			 if(token.getType()==14) {
				token=lexer.nextToken();
				if(token.getType()==23) {
					token=lexer.nextToken();
					if(token.getType()==15) {
						token=lexer.nextToken();
					if(token.getType()==8) {
						System.out.println("true");
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			 else {
					return false;
				}
			}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
		else {
			return false;
		}
	}
	
	public Boolean printsts() {
		System.out.println("at printsts");
		if(token.getType() == 13) {
			return true;
		}
		else {
		if(token.getType() == 2) {
			token=lexer.nextToken();
			if(token.getType() == 8) {
				token=lexer.nextToken();
				if(token.getType() == 3) {
					token=lexer.nextToken();
			 if(token.getType()==14) {
				token=lexer.nextToken();
				if(token.getType()==23) {
					token=lexer.nextToken();
					if(token.getType()==15) {
						token=lexer.nextToken();
					if(token.getType()==8) {
						token=lexer.nextToken();
						System.out.println("true");
					if(printsts()) {
							return true;
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			 else {
					return false;
				}
			}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
		else {
			return false;
		}
		}	}
	
	public Boolean whilecall() {
		System.out.println("at whileCall");
		if(token.getType() == 4) {
			token=lexer.nextToken();
			if(token.getType() == 14) {
				token=lexer.nextToken();
				if(token.getType() == 18) {
					token=lexer.nextToken();
			 if(token.getType()== 7) {
				token=lexer.nextToken();
				if(token.getType()==18||token.getType()==20 || token.getType()==19 || token.getType()==23||token.getType()==24) {
					token=lexer.nextToken();
					if(token.getType()==15) {
						token=lexer.nextToken();
					if(token.getType()==12) {
						token=lexer.nextToken();
						System.out.println("true");
							if(opassignment()||printsts())
							{
							
								return true;
							}
							else {
								return false;
							}
					}
							
					else {
					
						return false;
					}
				}
				else {
					return false;
				}
			}
			 else {
					return false;
				}
			}
				else {
					return false;
				}
			}
			 
			
			else {
				return false;
			}
		}
				else {
					return false;
				}
			}
				
		else {
			return false;
		}
	}

		
	public Boolean ifcall() {
		System.out.println("at ifCall");
		if(token.getType() == 5 ) {
			token=lexer.nextToken();
			if(token.getType() == 14) {
				token=lexer.nextToken();
				if(token.getType() == 18) {
					token=lexer.nextToken();
			 if(token.getType()== 7) {
				token=lexer.nextToken();
				if(token.getType()==18||token.getType()==20 || token.getType()==19 || token.getType()==23||token.getType()==24) {
					token=lexer.nextToken();
					if(token.getType()==15) {
						token=lexer.nextToken();
					if(token.getType()==12) {
						token=lexer.nextToken();
						System.out.println("true");
						if(printsts() || opassignment() )
						{	
							
							return true;
						}
						else {
							return false;
						}
							
						}
						else {
							return false;
						}
					
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			 else {
					return false;
				}
			}
				else {
					return false;
				}
			}
			 
			
			else {
				return false;
			}
		}
				else {
					return false;
				}
			}
				
	public Boolean elseblock() {
		System.out.println("at elseCall");
		if(token.getType() == 6 ) {
			token=lexer.nextToken();
					if(token.getType()==12) {
						token=lexer.nextToken();
						System.out.println("true");
						if(printsts() || opassignment() )
						{						
							return true;
						}
						else {
							return false;
						}
							
						}
						else {
							return false;
						}
					
					}
					else {
						return false;
					}
				}
				
	
	public Boolean opassignment() {
		System.out.println("at opassignment call");
		if(token.getType() == 13) {
			return true;
		}
		else {
		if(token.getType() == 18) {
			token=lexer.nextToken();
			if(token.getType() == 7) {
				token=lexer.nextToken();
				if(token.getType() == 18 || token.getType() == 19 || token.getType() == 20) {
					token=lexer.nextToken();
			 if(token.getType()==7) {
				token=lexer.nextToken();
				if(token.getType()==18|| token.getType()==20 || token.getType()==19) {
					token=lexer.nextToken();
					if(token.getType()==8) {
						token=lexer.nextToken();
						System.out.println("true");
						if(opassignment()) {
							return true;
						}
						else {
							return false;
						}
					
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			 else {
				 if(token.getType()==8) {
					token=lexer.nextToken(); 
					System.out.println("true");
					return true;
				 }
					else {
						return false;
					}
			 }
					
			}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	}
		
	
	
	public Boolean inputCall() {
		System.out.println("at inputCall");
		System.out.println("hii"+token);
		if(token.getType() == 18) {
			token=lexer.nextToken();		
			System.out.println("heloo"+token);
			if(token.getType() == 7) {
				token=lexer.nextToken();
				System.out.println(token);
				if(token.getType() == 9) {
					token=lexer.nextToken();
					System.out.println(token);
			 if(token.getType()==8) {
				token=lexer.nextToken();
				if(token.getType()==1) {
					token=lexer.nextToken();
					if(token.getType()==14) {
						token=lexer.nextToken();
						if(token.getType()==2) {
							token=lexer.nextToken();
								if(token.getType()==8) {
									token=lexer.nextToken();
									if(token.getType()==1) {
										token=lexer.nextToken();
										if(token.getType()==14) {
											token=lexer.nextToken();
											if(token.getType()==15) {
												token=lexer.nextToken();
												if(token.getType()==15) {
													token=lexer.nextToken();
					if(token.getType()==8) {
						System.out.println("true");
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			 else {
					return false;
				}
			}
				else {
					return false;
				}
			}
									else {
										return false;
									}
								}
								else {
									return false;
								}
							}
							else {
								return false;
							}
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			 else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		
		else {
			return false;
		}
	}
	
	public Boolean variableDec() {
		System.out.println("at variable Declaration");
		
		if(token.getType()==9) {
			token=lexer.nextToken();
			if(token.getType()==18) {
				token=lexer.nextToken();
				if(token.getType()==7) {
					token=lexer.nextToken();
					if(token.getType()==18||token.getType()==23 || token.getType()==24 || token.getType()==19 || token.getType()==20){
						token=lexer.nextToken();
					if(token.getType()==8) {
								return true;
							}
							else {
								return false;
							}
						}
						else {
							return false;
						}
					}
				else {
					return false;
				}
			}
					else {
						return false;
					}
				}
			else {
				return false;
			}
		}
		
	
	
	public Boolean assignment() {
		System.out.println("at assignment");
		if(token.getType()==10) {
			token=lexer.nextToken();
			if(token.getType()==4) {
				token=lexer.nextToken();
				if(token.getType()==15) {
					token=lexer.nextToken();
				if(token.getType()==5) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
			
	}
		else {
			return false;
		}
		}
		
}	



