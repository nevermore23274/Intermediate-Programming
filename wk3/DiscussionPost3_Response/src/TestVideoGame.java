public class TestVideoGame {

	public static void main(String[] args) {
		
		ResidentEvil2 Game1 = new ResidentEvil2("Resident Evil 2", "Horror", 39.99f, "January", 1);
		System.out.println(Game1.toString());

		System.out.print("\n");

		Minecraft Game2 = new Minecraft("Minecraft", "Open World", 26.95f, "Markus Persson", "Daniel Rosenfeld");
		System.out.println(Game2.toString());
		
		System.out.print("\n");
		
		BauldersGate3 Game3 = new BauldersGate3("Baulders Gate 3", "RPG", 59.99f, "Isometric", "Alpha");
		System.out.println(Game3.toString());
	}
}
		