import static org.junit.Assert.*;

public class Vector3DTest {
    Vector3D v = new Vector3D(3,4,0);
    Vector3D w = new Vector3D(1, 0,0);

    @org.junit.Test
    public void scalar() {
        assertEquals(3.0,v.scalar(w),1E-10);
    }

    @org.junit.Test
    public void len() {
        assertEquals(5.0,v.len(), 1E-10);
    }

    @org.junit.Test
    public void multiply() {
        assertEquals(new Vector3D(7.5, 10.0, 0.0), v.multiply(2.50));
    }

    @org.junit.Test
    public void add() {
        assertEquals(new Vector3D(4, 4, 0.0), v.add(w));
    }

    @org.junit.Test
    public void sub() {
        assertEquals(new Vector3D(2, 4, 0.0), v.sub(w));
    }

    @org.junit.Test
    public void vecX() {
        assertEquals(new Vector3D  (0.0, 0.0, -4.0), v.vecX(w));
    }
}