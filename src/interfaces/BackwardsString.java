package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);

	}

	@Override
	public String funkifyText(String s) {
		StringBuffer b = new StringBuffer(s);
	 	b.reverse();
		String sb = b.toString();
		System.out.println(b.toString());
		return sb ;
	}

}
