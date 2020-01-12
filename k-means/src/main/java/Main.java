import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String args[]) {
        Vector dataPoints = new Vector();
        dataPoints.add(new DataPoint(22, 21, "1"));
        dataPoints.add(new DataPoint(19, 20, "2"));
        dataPoints.add(new DataPoint(18, 22, "3"));
        dataPoints.add(new DataPoint(1, 3, "4"));
        dataPoints.add(new DataPoint(3, 2, "5"));
        dataPoints.add(new DataPoint(3, 2, "6"));
        dataPoints.add(new DataPoint(10, 56, "7"));
        dataPoints.add(new DataPoint(92, 32, "8"));
        dataPoints.add(new DataPoint(12, 102, "9"));

        JCA jca = new JCA(5, 1000, dataPoints);
        jca.startAnalysis();

        Vector[] v = jca.getClusterOutput();
        for (int i = 0; i < v.length; i++) {
            Vector tempV = v[i];
            System.out.println("-----------Cluster" + i + "---------");
            for (Object o : tempV) {
                DataPoint dpTemp = (DataPoint) o;
                System.out.println(dpTemp.getObjName() +
                        "[" + dpTemp.getX() + ", " + dpTemp.getY() + "]");
            }
        }
    }
}