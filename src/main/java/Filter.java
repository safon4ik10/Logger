import java.util.ArrayList;
import java.util.List;

public class Filter {
    private final Integer treshold;

    public Filter(Integer treshold){
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source){
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");

        List<Integer> result = new ArrayList<>();
        for (Integer i : source){
            if (i < treshold){
                logger.log("Элемент " + i + " не прошел");
            } else {
                result.add(i);
                logger.log("Элемент " + i + " прошел");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        logger.log("Выводим рузльтат на экран");
        System.out.print("Отфильтрованный список ");
        result.forEach(item -> System.out.print(item + " "));
        System.out.println();
        return result;
    }


}
