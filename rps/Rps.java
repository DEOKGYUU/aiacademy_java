package rps;

public class Rps {
	private int player, computer;
	private String result;
	
	public Rps() {
	
	}
	
	public void setPlayer(int player) {
		this.player = player;
	}
	
	public void setComputer(int computer) {
		this.computer = computer;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public int getPlayer() {
		return this.player;
	}
	
	public int getComputer() {
		return this.computer;
	}
	
	public String getResult() {
		return this.result;
	}
	
	public String getRps(int player) {
		switch(player) {
		case 1: return "가위";
		case 2: return "바위";
		case 3: return "보";
		}
		return null;
	}
	
	public String toString() {
		return "[플레이어: " + getRps(player) + ", 컴퓨터: " + getRps(computer) + ", 결과: 플레이어 " + this.result + "]"; 
	}
}
