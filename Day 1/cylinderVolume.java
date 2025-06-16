import java.util.Scanner;

public class cylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println(radius*radius*height*Math.PI);
    }
}
