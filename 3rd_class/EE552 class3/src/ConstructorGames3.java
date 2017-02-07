
public class ConstructorGames3 {
	private int x; //x will be zero (no instructor to set it)
	private ConstructorGames3(int x){}
	public static void main(String[] args) {
		//illegal ConstructorGames2 cg = new ConstructorGames2();
		ConstructorGames3 cg = new ConstructorGames3(2);
		System.out.println(cg);
	}
}
