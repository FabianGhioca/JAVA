package JavaInAction.Java04.ex04;

public class MatrixRotationTest {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 4);
        matrix.print();
        System.out.println();
        matrix.rotate90Clockwise();
        //matrix.print();
    }
}