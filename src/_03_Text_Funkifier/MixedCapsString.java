package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;
    StringBuilder stb = new StringBuilder();
    public MixedCapsString(String unfunkifiedText) {
    	stb.append(unfunkifiedText);
    	char help1 = Character.toLowerCase(stb.charAt(0));
    	stb.replace(0, 1, "" + help1);
    	for (int i = 0; i < stb.length(); i++) {
			if (i%2==1) {
				char help = Character.toUpperCase(stb.charAt(i));
				stb.replace(i, i+1, "" + help);
			}
		}
        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		return stb.toString();
	}

}
