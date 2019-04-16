public class Vector3D {
    double x;
    double y;
    double z;

    public static final double eps = 1E-10;

    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    double getZ(){
        return z;
    }

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    void printVec(){
        System.out.println(getX() + ", " + getY() + ", " + getZ());
    }

    double scalar(Vector3D v){
        return (x*v.x + y*v.y + z*v.z);
    }
    double len(){
        return (Math.sqrt (this.scalar(this)));
    }

    Vector3D multiply(double factor){
        Vector3D newV = new Vector3D();
        newV.x = x*factor;
        newV.y = y*factor;
        newV.z = z*factor;
        return newV;
    }
    Vector3D add(Vector3D v){
        Vector3D newV = new Vector3D();
        newV.x = x+v.x;
        newV.y = y+v.y;
        newV.z = z+v.z;
        return newV;
    }
    Vector3D sub(Vector3D w){
        Vector3D newV = new Vector3D();
        newV.x = x-w.x;
        newV.y = y-w.y;
        newV.z = z-w.z;
        return newV;
    }
    Vector3D vecX(Vector3D v){
        Vector3D newV = new Vector3D();
        newV.x = y*v.z - v.y*z;
        newV.y = v.x*z - v.z*x;
        newV.z = x*v.y - y*v.x;
        return newV;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vector3D)) return false;
        Vector3D v = ((Vector3D) obj);
        return compareWithAccuracy(x,v.getX())
                && compareWithAccuracy(y,v.getY())
                && compareWithAccuracy(z,v.getZ());
    }
    private boolean compareWithAccuracy(double x, double y) {
        return x > y - eps && x < y + eps;
    }
}
