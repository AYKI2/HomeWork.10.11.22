import java.util.*;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        Time time = new Time(23,59,57);
        System.out.println(time);
        while (true) {
            System.out.println("Choice +(second++), -(second--), =(increase by a certain number), /(reduce by a certain number): ");
            char symbol = input.next().charAt(0);
            switch (symbol) {
                case '+': time.nextSecond();
                    System.out.println(time);
                    break;
                case '-':
                    time.previousSecond();
                    System.out.println(time);
                    break;
                case '=':
                    time.specificPlusSecond(input.nextInt());
                    System.out.println(time);
                    break;
                case'/':
                    time.specificMinusSecond(input.nextInt());
                    System.out.println(time);
                    break;
                default:
                    System.out.println("No such symbol!");
            }
        }

    }
}