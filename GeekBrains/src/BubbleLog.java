// Семинар 2.
// Задание 2. Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class BubbleLog {
    public static void main(String[] args) throws IOException {
        String logFile = "GeekBrains/src/BubbleLog.txt";
        int[] arr = {2, 1, 5, 3, 10, 4, 9, 6, 8, 7, 0};
        SortAndLog(getLogger(logFile), arr);
    }

    private static void SortAndLog(Logger logger, int[] arr) {
        logger.info("Исходный массив: " + Arrays.toString(arr));
        int count = 1;
        for (int j = arr.length; j > 0; j--) {
            String msg;
            for (int i = 0; i < j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    msg = arr[i] + " больше, чем " + arr[i+1] + ", поэтому всплывает: ";
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    logger.info("Шаг " + count + ". " + msg + Arrays.toString(arr));
                }
                else {
                    logger.info("Шаг " + count + ". " + arr[i] + " не больше, чем " + arr[i+1] + ", поэтому остаётся на месте.");
                }
                count++;
            }
        }
    }

    public static Logger getLogger(String logFile) throws IOException {
        Logger logger = Logger.getLogger(BubbleLog.class.getName());
        FileHandler fh = new FileHandler(logFile);
        logger.addHandler(fh);
        fh.setFormatter(new SimpleFormatter());
        return logger;
    }
}
