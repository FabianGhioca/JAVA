package JavaInAction.Java04.ex04;

public class Matrix {
    private int[][] matrix;

    public Matrix(int rows, int cols) {
        matrix = new int[rows][cols];
        int y = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++, y++) {
                matrix[i][j] = y;
            }
        }
    }

    public void print() {
        //int rows = matrix.length;
        //int cols = matrix[0].length;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

    public void rotate90Clockwise() {
        int rows = matrix.length;
        int cols = matrix[0].length;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[rows - 1 - j][i] + "\t");
			}
			System.out.println();
		}
    }

}
