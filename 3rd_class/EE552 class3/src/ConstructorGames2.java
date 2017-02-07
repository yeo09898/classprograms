
public class ConstructorGames2 {
	private int x; //x will be zero (no instructor to set it)
	public ConstructorGames2(int x){}
	public static void main(String[] args) {
		//illegal ConstructorGames2 cg = new ConstructorGames2();
		ConstructorGames2 cg = new ConstructorGames2(2);
		System.out.println(cg);
	}
}
