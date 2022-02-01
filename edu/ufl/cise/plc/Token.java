package edu.ufl.cise.plc;
public class Token implements IToken {
  public record SourceLocation(int line, int column) {
      
  } 
  	//returns the token kind
	public Kind getKind(){
    return Kind.ERROR;
  }

	//returns the characters in the source code that correspond to this token
	//if the token is a STRING_LIT, this returns the raw characters, including delimiting "s and unhandled escape sequences.
	public String getText(){
    return "NA";
  }
	
	//returns the location in the source code of the first character of the token.
	public SourceLocation getSourceLocation(){
    return SourceLocation(-1, -1);
  }

	//returns the int value represented by the characters of this token if kind is INT_LIT
	public int getIntValue(){
    return -1;
  }

	//returns the float value represented by the characters of this token if kind is FLOAT_LIT
	public float getFloatValue(){
    return -1;
  }

	//returns the boolean value represented by the characters of this token if kind is BOOLEAN_LIT
	public boolean getBooleanValue(){
    return false;
  }
	
	//returns the String represented by the characters of this token if kind is STRING_LIT
	//The delimiters should be removed and escape sequences replaced by the characters they represent.  
	public String getStringValue(){
    return "NA";
  }
}
