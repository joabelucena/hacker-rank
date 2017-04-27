package hr.amazon;
import java.util.ArrayList;
import java.util.List;

public class WarehouseMaximumDistance {

	public static void main(String... args) throws InterruptedException {
		int x = 100;
		int y = 30;

		List<Coord> sites = new ArrayList<>();

		sites.add(new Coord(4, 0));
		sites.add(new Coord(3, 4));
		sites.add(new Coord(9, 17));
		sites.add(new Coord(15, 25));
		sites.add(new Coord(80, 25));

		mostDistant(x, y, sites);

	}

	public static int mostDistant(int matX, int matY, List<Coord> sites) throws InterruptedException {

		int mostDistant = 0;

		System.out.println("Wahehouses:" + sites);
		System.out.println();

		for (int x = 0; x < matX; x++) {
			inner: for (int y = 0; y < matY; y++) {
				int distance = Integer.MAX_VALUE;
				for (Coord w : sites) {
					if (w.x == x && w.y == y) {
						System.out.print(">A<" + " | ");
						continue inner;
					}

					distance = Coord.distance(w, new Coord(x, y)) < distance ? Coord.distance(w, new Coord(x, y))
							: distance;
				}

				System.out.print(String.format("%03d", distance) + " | ");
				mostDistant = distance > mostDistant ? distance : mostDistant;

//				Thread.sleep(2);
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("Most distant customer: " + mostDistant);

		return mostDistant;

	}

}

class Coord {
	public int x;
	public int y;

	Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Returns the distance in a pac-man way (vertically and horizontally) from
	 * a coordinate (a) to another one (b)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int distance(Coord a, Coord b) {
		return Math.abs((a.x - b.x)) + Math.abs((a.y - b.y));
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
