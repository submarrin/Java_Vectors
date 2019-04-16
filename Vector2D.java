public class Vector2D extends Vector {
    private double x;
    private double y;
    public Vector2D(double[] v){ super(2, v);
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public Vector2D ortVec(){
        Vector2D v = new Vector2D(new double[] {-x, y});
        return v;
    }

}
