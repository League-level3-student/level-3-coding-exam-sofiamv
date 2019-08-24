import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> a) {
		int c = 0;
		int b = 0;
		String winner = "";
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i).equalsIgnoreCase("pope francis")) {
				c++;
			} else if (a.get(i).equalsIgnoreCase("edward snowden")) {
				b++;
			}
		}if(c > b) {
			winner = "pope francis";
		}else if (b > c) {
			winner = "edward snowden";
		}else if (b == c) {
			winner = "TIE";
		}
		return winner;
	}
}
