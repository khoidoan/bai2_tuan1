import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai2Tuan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        int count = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Nhap so so nguyen ma ban muon tinh tong: ");
                count = scanner.nextInt();
                if (count < 1) {
                    System.out.println("Vui long nhap mot so nguyen duong lon hon 0.");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Du lieu khong hop le. Vui long nhap lai mot so nguyen.");
                scanner.next(); // Đọc và bỏ qua input không hợp lệ
            }
        }

        for (int i = 0; i < count; i++) {
            while (true) {
                try {
                    System.out.print("Nhap mot so nguyen (" + (i + 1) + " tren " + count + "): ");
                    int number = scanner.nextInt();
                    numbers.add(number);
                    break;
                } catch (Exception e) {
                    System.out.println("Du lieu khong hop le. Vui long nhap lai mot so nguyen.");
                    scanner.next(); // Đọc và bỏ qua input không hợp lệ
                }
            }
        }

        int sum = tinhTongCacSoDuong(numbers);
        System.out.println("Tong cac so nguyen duong la: " + sum);
        scanner.close();
    }

    public static int tinhTongCacSoDuong(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }
}
