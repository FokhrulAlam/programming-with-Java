package exercises.tutorial.programmingWithJava;

public class TriangularPatternC {
	public static void main(String[] args) {
		for (int row=1;row<=8;row++) {
			for (int column=1;column<=8;column++) {
				if (column>row-1) {
					System.out.print("# ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
