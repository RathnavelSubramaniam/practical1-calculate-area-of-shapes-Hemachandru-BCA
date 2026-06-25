
public class practical1 {
    class point{
        double x;
        double y;
        public point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public double getX(){
            return x;
        }
        public double getY(){
            return y;
        }
    }

    class Quadrilateral{
        point point1;
        point point2;
        point point3;
        point point4;
        
        public Quadrilateral(point p1, point p2, point p3, point p4){
            this.point1 = p1;
            this.point2 = p2;
            this.point3 = p3;
            this.point4 = p4;
        }
    }
    class Trapezoid extends Quadrilateral{
        public Trapezoid(point p1, point p2, point p3, point p4){
            super(p1, p2, p3, p4);
        }
    }
    public double calculateArea(Quadrilateral shape){
        double base1 = Math.abs(shape.point1.getX() - shape.point2.getX());
        double base2 = Math.abs(shape.point3.getX() - shape.point4.getX());
        double height = Math.abs(shape.point1.getY() - shape.point3.getY());
        return (base1 + base2) * height / 2.0;
    }
    class Rectangle extends Quadrilateral {
    
        public Rectangle(point p1, point p2, point p3, point p4){
            super(p1, p2, p3, p4);
        }
        public double calculateArea(){
            double length = Math.abs(point1.getX() - point2.getX());
            double width = Math.abs(point2.getY() - point3.getY());
            return length * width;
        }
    }

    class Square extends Rectangle{
            double sideLength;
            public Square(point p1, double sideLength){
                this.sideLength = sideLength;   
                super(p1, new point(p1.getX() + sideLength, p1.getY()), new point(p1.getX() + sideLength, p1.getY() + sideLength), new point(p1.getX(), p1.getY() + sideLength));
            }
            public double calculateArea(){
                return sideLength * sideLength;
        }
    }

    public static void main(String[] args) {
        point p1 = new practical1().new point(0, 0);
        point p2 = new practical1().new point(4, 0);
        point p3 = new practical1().new point(4, 3);
        point p4 = new practical1().new point(0, 3);

        Trapezoid trapezoid = new practical1().new Trapezoid(p1, p2, p3, p4);
        double trapezoidArea = new practical1().calculateArea(trapezoid);
        System.out.println("Area of the trapezoid: " + trapezoidArea);      
        Square square = new practical1().new Square(p1, 3);

        Rectangle rectangle = new practical1().new Rectangle(p1, p2, p3, p4);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + rectangleArea);

        double squareArea = square.calculateArea();
        System.out.println("Area of the square: " + squareArea);
    }
}