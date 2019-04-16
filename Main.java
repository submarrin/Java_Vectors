import Vectors_v2.Point;
import Vectors_v2.Vector;

public class Main {
    public static void main(String[] args){
        Vector3D v = new Vector3D();
        v.x = 3;
        v.y = 4;
        v.z = 0;
        Vector3D w = new Vector3D();
        w.x = 2;
        w.y = 4;
        w.z = 0;
        System.out.println(v.len());
        v.sub(w).printVec();
        v.vecX(w).printVec();



        Vector v2 = new Vector(
            new Point(new double[]{0.0, 0.0, 0.0}),
            new Point(new double[]{1.0, 2.0, 3.0})
        );
        Vector v3 = new Vector(
                new double[]{3,4,0}
        );

        System.out.println(v2.getDimension());
        v2.printCoords();
        v2.sub(v3).printCoords();

        Vector v4 = new Vector(v3,2);
        v4.printCoords();

        Segment segment = new Segment(v, w);
        Vector3D point = new Vector3D(1.0, 1.0, 1.0);
        System.out.println(segment.distanceTo(point));


    }
}
