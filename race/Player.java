package race;

public class Player {
	private String name;
	private int record;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRecord(int record) {
		this.record = record;
	}
	
	public void print() {
		System.out.println("�̸�: " + name + ", ���: " + record);
	}
}
