package Point;

public class Point {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "x= "+this.getX()+" y= "+this.getY();

        }

        public double calcDistance(Point point) {
            int a = point.getX() - this.getX();
            int b = point.getY() - this.getY();
            double c = Math.sqrt(a * a + b * b);
            return c;
        }

        public boolean compare(Point p) {
            return(this.x == p.getX() && this.y == p.getY());
        }

        private int getX() {

            return x;
        }

        private int getY() {
            return y;
        }

        public void setX(double x) {
        }

        public void setY(double y) {
        }

        public void moveTo(int x, int y){
            setX(x);
            setY(y);
        }
}

