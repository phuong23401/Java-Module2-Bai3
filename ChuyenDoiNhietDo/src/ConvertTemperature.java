import java.util.Scanner;

public class ConvertTemperature {
    public static Scanner input = new Scanner(System.in);
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Độ F --> độ C");
            System.out.println("2. Độ C --> độ F");
            System.out.println("0. Thoát");
            System.out.println("Mời chọn chức năng: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập nhiệt độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ F --> độ C: " + fahrenheitToCelsius(fahrenheit) + "\n");
                    break;
                case 2:
                    System.out.print("Nhập nhiệt độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("Độ C --> độ F: " + celsiusToFahrenheit(celsius) + "\n");
                    break;
                case 0:
                    System.out.println("Đã thoát!");
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
