import java.util.Scanner;

public class SumValueDiagonalLineOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc cua ma tran");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Nhap vao gia tri cua ma tran tai vi tri matrix[" + i + "][" + j + "]");
                matrix[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Tong cac so o duong cheo chinh la: " + sum);
    }
}
