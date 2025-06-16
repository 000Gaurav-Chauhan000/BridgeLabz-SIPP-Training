import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        double area = (Math.PI*radius*radius);
        System.out.print(area);
    }
}
