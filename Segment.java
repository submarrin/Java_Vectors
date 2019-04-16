public class Segment {
    Vector3D v;
    Vector3D w;

    public Segment(Vector3D v, Vector3D w){
        this.v = v;
        this.w = w;
    }

    double len(){
        return v.sub(w).len();
    }
    double distanceTo(Vector3D point){
        Vector3D AB = w.sub(v);
        Vector3D BA = v.sub(w);
        Vector3D AC = point.sub(v);
        Vector3D BC = point.sub(w);
        if (AC.scalar(AB) <= 0) return AC.len();
        if (BC.scalar(BA) <= 0) return BC.len();
        if (AC.scalar(AB) > 0 && BC.scalar(BA) > 0) return (AC.vecX(BC).len() / AB.len());
        return 0.0;
    }
}
