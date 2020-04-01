package P2;

import java.util.*;

/**
 * @param root:
 *            radacina
 * @param target:
 *            valoarea pe care vrem sa o obtinem
 * @param path:
 *            ArrayList ce stocheaza calea
 *
 */
public class BFS {
	private Node root;
	private int target;
	private List<Node> path = new ArrayList<>();

	// Constructor public
	public BFS(double value, int target) {
		this.root = new Node(value, 0);
		this.target = target;
	}

	// Metoda ce determina copiii unui nod in functie de operatie
	public Node getChildNode(double value, int operation) {
		Node node;

		if (operation == 1) {
			node = new Node(Math.sqrt(value), operation);
		} else if (operation == 2) {
			node = new Node(Utils.calcFactorial(value), operation);
		} else {
			node = new Node(Math.floor(value), operation);
		}

		return node;
	}

	// Functie prin care este parcurs arborele
	public void solution() {
		Queue<Node> queue = new LinkedList<>(); // Coada in care sunt adaugate toate nodurile
		queue.add(root); // Se adauga radacina

		while (!queue.isEmpty()) { // Cat timp exista elemente in Coada
			Node node = queue.poll(); // Se extrage primul element
			Node child;

			for (int integer = 1; integer <= 3; integer++) { // Fiecare nod are 3 copiii, deoarece exista 3 operatii ce
																// pot fi efectuate
				child = getChildNode(node.getValue(), integer); // Se determina copilul
				child.setLevel(node.getLevel() + 1); // Se incrementeaza nivelul copilului

				if (child.getValue() != 1) { 
					node.childs.put(integer, child); // Se adauga copilul in HashMap in functie de cheia i
					queue.add(child); // Se adauga nodul in Coada
				}
			}

			if (node.getValue() == target) { // Se verifica daca s-a ajuns la valoarea dorita
				printPath(root); // Se determina calea
				break;
			}
		}

		// Afisarea operatiilor necesare:
		for (int integer = path.size() - 1; integer >= 0; integer--) {
			if (path.get(integer).getOperation() == 0) {
				System.out.println("root - do nothing");
			} else if (path.get(integer).getOperation() == 1) {
				System.out.println("sqrt");
			} else if (path.get(integer).getOperation() == 2) {
				System.out.println("factorial");
			} else if (path.get(integer).getOperation() == 3) {
				System.out.println("floor");
			}
		}
	}

	public Boolean printPath(Node node) {
		if (node == null)
			return false;
		if (node.getValue() == target || printPath(node.childs.getOrDefault(1, null)) // || = Logical-OR
				|| printPath(node.childs.getOrDefault(2, null)) || printPath(node.childs.getOrDefault(3, null))) {

			path.add(node); // Se aduaga in path nodul
			return true;
		}
		return false;
	}
}
