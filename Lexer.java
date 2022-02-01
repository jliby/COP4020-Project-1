public class Lexer implements ILexer {
  private String input;
  public IToken next() throws LexicalException {
    return new IToken();
  }
	public IToken peek() throws LexicalException {

  }
  
  public Lexer(String input){
      this.input = input;
  }
  
}
