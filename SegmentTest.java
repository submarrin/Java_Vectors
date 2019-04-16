import java.util.Scanner;

public class SegmentTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки");
        Vector3D point = new Vector3D(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Введите координаты начала отрезка");
        Vector3D v = new Vector3D(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Введите координаты конца отрезка");
        Vector3D w = new Vector3D(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

        Segment segm = new Segment(v, w);
        System.out.println(segm.len());
        System.out.println(segm.distanceTo(point));
    }
}
