package P2;

public class MainClass {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		new BFS(4, 3).solution();
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time: " + elapsedTime);
		
		System.out.println();

		new Test();
		System.out.println();
		/*
		new Test();
		System.out.println();*/

	}

}
