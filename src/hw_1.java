import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args){
        String myNum;

        final int NUM = 20;

        String word = "Hello world!";

        myNum = NUM + word;

        System.out.println("Значения переменной myNum: " + myNum);
        System.out.println("Значения констант NUM: " + NUM);
        System.out.println("Значения переменной word: " + word);

        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.println("Введите ваше имя: ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Привет, " + userName + "!");
    }
}
