package goormMission;

public class Java_Mid04 {

    //클래스 생성
    static class Rectangle {
        double length;
        double width;

     public Rectangle(double length, double width) {
         this.length = length;
         this.width = width;
     }

     //넓이 계산
        public double calculateArea() {
            return length * width;
        }

        // 둘레 계산
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    public static void main(String[] args) {
        //Rectangle 객체 생성
        Rectangle rectangle = new Rectangle(50,50);
        System.out.println("넓이: " + rectangle.calculateArea());
        System.out.println("둘레: " + rectangle.calculatePerimeter());
    }
}
