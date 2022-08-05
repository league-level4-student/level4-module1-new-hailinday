package _03_Text_Funkifier;

public class Underscore implements TextFunkifier {
	 StringBuilder stb = new StringBuilder();
	 private String unfunkifiedText;
	 public Underscore (String unfunkifiedText) {
		 stb.append(unfunkifiedText);
		 for (int i = 0; i < stb.length(); i++) {
			if (stb.charAt(i)==' ') {
				stb.replace(i, i+1, "_");
			}
		}
	 }
	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		return stb.toString();
	}
}
