package Q1;

public class Player {
	private String name;
	private String country;
	private int goal;//이름. 국가, 골을 private으로 선언
	
	public Player(String name, int goal, String country) {
		this.name = name;
		this.goal = goal;
		this.country = country;
	}
	
	public String getname() {
		return this.name;
	}//name getter
	
	public int getgoal() {
		return this.goal;
	}//goal getter
	
	public String getcountry() {
		return this.country;
	}//country getter
	
	void show() {
		System.out.print(getname() + " has scored " + getgoal() + " goals in " + getcountry());
	}
}
