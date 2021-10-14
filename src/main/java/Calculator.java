import java.util.ArrayList;

public class Calculator {

    public long discriminant(int a, int b, int c) {
        return (long) Math.pow(b, 2) - (4L * a * c);
    }

    public long linearEquation(int a, int b) {
        return (long) (-b / a);
    }

    public ArrayList<Long> quadraticEquation(int a, int b, int c, long d) {
        ArrayList<Long> result = new ArrayList<>();
        if (d > 0) {
            long x1, x2;
            x1 = (long)((-1) * b + Math.sqrt(d)) / (2L * a);
            x2 = (long)((-1) * b - Math.sqrt(d)) / (2L * a);
            result.add(x1);
            result.add(x2);
        } else if (d == 0) {
            long x1;
            x1 = -b / (2L * a);
            result.add(x1);
        }
        return result;
    }
}
