package P2;

//Clasa pentru testarea functiei BFS
public class Test {
	private BFS bfs;

	public Test() {
		Integer rand1 = 50 + Utils.generateRandom();// Generarea random a primului numar > decat rand2
		Integer rand2 = Utils.generateRandom();// Generarea random a orimului numar
		if(rand1 == rand2 || rand1 == 1) {
			System.out.println("Eroare generare test");
		}
		System.out.println("BFS for " + rand1 + " " + rand2);// Afisarea numerelor
		this.bfs = new BFS(rand1, rand2);

		long startTime = System.currentTimeMillis(); // Momentul cand incepe executia functiei

		bfs.solution();// Rularea functiei solution

		long stopTime = System.currentTimeMillis(); // Momentul cand se incheie executia functiei
		long elapsedTime = stopTime - startTime; // Calculul duratei de executie
		System.out.println("Time: " + elapsedTime);
	}

}
