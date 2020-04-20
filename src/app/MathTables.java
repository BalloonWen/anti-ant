package app;

public class MathTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 12; i++) {
			System.out.println("\nTabla de multiplicacion: Tabla " + Integer.toString(i));
			for (int j = 1; j <= 10; j++) {
				System.out.println(String.format("%d x %d = %d", i, j, i * j));
			}
		}
	}

}
