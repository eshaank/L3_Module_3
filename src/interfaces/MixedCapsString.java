package interfaces;

import java.util.ArrayList;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String string) {
		super(string);
	}

	

	@Override
	public String funkifyText(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (i%2 == 0) {
				result += (s.charAt(i) + "").toLowerCase();
			}
			else {
				result +=  (s.charAt(i) + "").toUpperCase();
			}
		}
		
		return  result ; 
	}

}
