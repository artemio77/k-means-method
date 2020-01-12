import org.apache.commons.math3.stat.inference.TestUtils;

import java.util.ArrayList;
import java.util.List;

public class OneWayAnovaMain {


    public static void main(String[] args) {
        double[] calorie = {8, 9, 6, 7, 3};
        double[] fat = {2, 4, 3, 5, 1};
        double[] carb = {3, 5, 4, 2, 3};
        double[] control = {2, 2, -1, 0, 3};
        calculateANOVA(calorie, fat, carb, control);
    }

    private static void calculateANOVA(double[] calorie, double[] fat, double[] carb, double[] control) {
        List<double[]> classes = new ArrayList<>();
        classes.add(calorie);
        classes.add(fat);
        classes.add(carb);
        classes.add(control);
        System.out.println(TestUtils.oneWayAnovaFValue(classes));
        System.out.println(TestUtils.oneWayAnovaPValue(classes));
        System.out.println(TestUtils.oneWayAnovaTest(classes, 0.01));
    }
}
