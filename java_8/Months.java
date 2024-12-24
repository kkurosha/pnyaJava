import java.util.InputMismatchException;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int number = 0;
        System.out.print("Введите целое число от 1 до 12: ");
        try {
            number = in.nextInt();
            if (number < 1 || number > 12) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int days;
            String month = months[number - 1];
            if (number == 2) { //если февраль
                System.out.print("Введите год: ");
                int year = in.nextInt();
                days = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28; //29 - високосный, 28 - нет
            } else { days = dom[number - 1]; } //если не февраль
            System.out.println("Месяц: " + month + ", Количество дней: " + days);
        } //исключения
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нужно ввести число от 1 до 12.");
        } //ожидается другой тип данных
        catch (InputMismatchException e) {
            System.out.println("Нужно ввести целое число.");
        }
        finally {
            in.close();
        }
    }
}
