import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        int f = 0;
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (i <= treshold) {
                logger.log("Элемент: " + i + " не прошел");
            } else {
                logger.log("Элемент: " + i + " прошел");
                result.add(i);
                f++;
            }
        }
        logger.log(f + " элементов прошли фильтр из " + source.size());
        logger.log("Вывод списка элементов: ");
        System.out.println(result);
        return result;
    }
}
