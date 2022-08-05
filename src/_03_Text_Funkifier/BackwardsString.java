package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {
    	StringBuilder stb = new StringBuilder();
    	stb.append(unfunkifiedText);
    	unfunkifiedText = "";
    	for (int i = stb.length()-1; i >= 0; i--) {
			unfunkifiedText = unfunkifiedText + stb.charAt(i);
		}
        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {

        return unfunkifiedText;

    }
}
