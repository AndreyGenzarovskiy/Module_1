package task_3;

public class AreaOfTriangle {

    public static double getLengthOfTriangleSide(int x1, int y1, int x2, int y2){
        double expr = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double length = Math.sqrt(expr);

        return length;
    }
    public static double getAreaOfTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        double lengthA = getLengthOfTriangleSide(x1, y1, x2, y2);
        double lengthB = getLengthOfTriangleSide(x1, y1, x3, y3);
        double lengthC = getLengthOfTriangleSide(x2, y2, x3, y3);
        double p = (lengthA + lengthB + lengthC)/2;
        double area = Math.sqrt( p*(p - lengthA) * (p - lengthB)*(p - lengthC));
        return area;
    }
}
