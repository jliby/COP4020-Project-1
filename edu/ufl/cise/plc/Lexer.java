package edu.ufl.cise.plc;
public class Lexer implements ILexer {
  private String input;
  public IToken next() throws LexicalException {
    return new Token();
  }
	public IToken peek() throws LexicalException {
    return new Token();
  }
  
  public Lexer(String input){
      this.input = input;
  }
  
}
