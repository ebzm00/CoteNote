package goormMission;

public class Java_Shape {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape triangle = new Triangle(6, 3);

        // 도형 배열에 저장
        Shape [] shapes = {circle, rectangle, triangle};

        //도형 배열 출력
        for (Shape shape : shapes) {
            System.out.println("Type: " + shape.getType() + ", Area: " + shape.getArea());
        }
    }
}

    class Shape {
        private String type; // 종류
        private double area; // 면적

        public Shape(String type, double area) {
            this.type = type;
            this.area = area;
        }

        public String getType() {
            return type;
        }

        public double getArea() {
            return area;
        }

        @Override
        public String toString() {
            return "Shape{" +
                    "도형='" + type + '\'' +
                    ", 면적=" + area +
                    '}';
        }
    }
    //원
    class Circle extends Shape {
        public Circle(double radius) {
            super("원", Math.PI * radius * radius); // 원주율 * 반지름 * 반지름
        }
    }
    //사각형
    class Rectangle extends Shape {
        public Rectangle(double width, double height) {
            super("사각형", width * height); // 가로 * 세로
        }
    }
    //삼각형
    class Triangle extends Shape {
        public Triangle(double base, double height) {
            super("삼각형", 0.5 * base * height); // 0.5 * 밑변 * 높이
        }
    }

