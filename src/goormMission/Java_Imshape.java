package goormMission;

import java.util.Arrays;

//도형 인터페이스 작성하기
public class Java_Imshape {

    public static void main(String[] args) {
        Circle1 Circle1 = new Circle1(5);
        Rectangle1 Rectangle1 = new Rectangle1(5, 5);
        Triangle1 Triangle1 = new Triangle1(5, 5);

        // 도형 배열에 저장
        Shape1 [] shapes = {Circle1, Rectangle1, Triangle1};

        System.out.println(Arrays.toString(shapes));

        //도형 배열 출력
        for (Shape1 shape1 : shapes) {
            System.out.println("Type: " + shape1.getType() + ", Area: " + shape1.calculateArea());
        }
    }
}
    //도형 인터페이스
    interface Shape1 {
        double calculateArea();
        String getType();
    }

    //원
    class Circle1 implements Shape1 {
      private double radius;

      public Circle1(double radius) {
        this.radius = radius;
      }

      public double calculateArea() {
        return Math.PI * radius * radius;
      }

      public String getType() {
          return "원_인터페이스";
      }
    }

    class Rectangle1 implements Shape1 {
        private double width;
        private double height;

        public Rectangle1(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }

        public String getType() {
            return "사각형_인터페이스";
        }
    }

    class Triangle1 implements Shape1 {
        private double base;
        private double height;

        public Triangle1(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return 0.5 * base * height;
        }

        @Override
        public String getType() {
            return "삼각형_인터페이스";
        }
    }
