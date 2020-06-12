package rps;
public class RpsServiceImpl implements RpsService{
	private Rps[] games;
	private int index;
	
	public RpsServiceImpl() {
		games = new Rps[100];
		index = 0;
	}
	
	@Override
	public void game(Rps rps) {
		String result = "";
		if(rps.getPlayer() == 1) {
			if(rps.getComputer() == 1) {
				result = "무승부";
			} else if(rps.getComputer() == 2) {
				result = "패배";
			} else { result = "승리"; }
		} else if(rps.getPlayer() == 2) {
			if(rps.getComputer() == 1) {
				result = "승리";
			} else if(rps.getComputer() == 2) {
				result = "무승부";
			} else { result = "패배"; }
		} else if(rps.getPlayer() == 3) {
			if(rps.getComputer() == 1) {
				result = "패배";
			} else if(rps.getComputer() == 2) {
				result = "승리";
			} else { result = "무승부"; }
		}
		rps.setResult(result);
		games[index++] = rps;
	}
	
	@Override
	public void score() {
		for(int i=0; i<index; i++) {
			System.out.println(games[i]);
		}
	}

}
