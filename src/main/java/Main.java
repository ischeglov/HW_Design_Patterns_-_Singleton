import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Старт программы");
        logger.log("Ожидание данных для создания списка");

        int N = 0;
        int M = 0;
        int f = 0;

        System.out.print("Доброго дня! \nВведите размер списка: ");
        if (scan.hasNextInt()) {
            N = scan.nextInt();
            if (N <= 0) {
                logger.log("Число не может быть отрицательным или равно 0");
            }
        } else {
            logger.log("Введите целое число!");
        }

        System.out.print("Введите верхнюю границу для значений: ");
        if (scan.hasNextInt()) {
            M = scan.nextInt();
            if (M <= 0) {
                logger.log("Число не может быть отрицательным или равно 0");
            }
        } else {
            logger.log("Введите целое число!");
        }

        logger.log("Происходит создание списка");
        List<Integer> list = new ArrayList<>(N);
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M));
        }
        System.out.println("Наш случайный список: " + list);

        System.out.print("Введите порог для фильтра: ");
        if (scan.hasNextInt()) {
            f = scan.nextInt();
            if (f <= 0 || f >= M) {
                logger.log("Число не может быть отрицательным, равно 0 или выше/равно верхней границы списка");
            }
        } else {
            logger.log("Введите целое число!");
        }

        logger.log("Запуск фильтра");
        Filter filter = new Filter(f);
        filter.filterOut(list);
        logger.log("Завершение программы");
    }
}
