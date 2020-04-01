package P2;

import java.util.HashMap;

/**
 * @param value:
 *            valoarea dintr-un nod
 * @param level:
 *            nivelul pe care se afla nodul (radacina are nivelul 0)
 * @param operation:
 *            operatia dintr-un nod ( 1 - sqrt; 2 - factorial; 3 - floor)
 * @param childs:
 *            HasHMap ce contine copiii nodului.
 */

public class Node {

	private double value;
	private int level;
	private int operation;

	public HashMap<Integer, Node> childs = new HashMap<>();

	// Constructor public
	public Node(double value, int operation) {
		this.value = value;
		this.operation = operation;
		this.level = 0;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getOperation() {
		return operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

}
