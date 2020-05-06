package katas;
import java.text.DecimalFormat;

public class NthSeries {
    public static String seriesSum(int n) {
        DecimalFormat format = new DecimalFormat("0.00");
        double sum = 0;
        for (int i = 0; i < n; i++){
            sum += 1.0 / (3 * i + 1);
        }
        return format.format(sum);
    }
}