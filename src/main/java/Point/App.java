package Point;

public class App {

        public static void main(String[] args){

            Point point1 = new Point(1,1);
            Point point2 = new Point(2,1);

            double distance = point1.calcDistance(point2);
            boolean compare = point1.compare(point2);

            System.out.println(point1);
            System.out.println(point2);

            System.out.println(distance);
            System.out.println(compare);

        }
}

