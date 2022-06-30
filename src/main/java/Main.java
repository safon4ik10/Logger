import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер списка: ");
        Integer size = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите верхнюю границу для значений: ");
        Integer maxItems = Integer.parseInt(scanner.nextLine());

        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size;  i++){
            list.add(random.nextInt(maxItems));
        }
        System.out.print("Вот случайный список: ");
        list.stream().forEach(item -> System.out.print(item + " "));
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        Integer max = Integer.parseInt(scanner.nextLine());

        Filter filter = new Filter(max);
        List<Integer> resultList = filter.filterOut(list);
        logger.log("Завершаем программу");
    }
}
