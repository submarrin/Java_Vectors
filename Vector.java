public class Vector {
    int dimension;
    double[] coords;

    public Vector(int dim, double[] coords) {
        int dimension = dim;
        coords = coords;
    }

    public Vector(Vector v, int dim) {
        this.dimension = dimension;
        this.coords = makeCoords(v, dim);
    }

    private double[] makeCoords(Vector v, int dim) {
        double[] result = new double[dim];
        if (v.dimension >= dim) {
            for (int i = 0; i < dim; i++)
                result[i] = v.coords[i];
            return result;
        }
        for (int i = 0; i < v.dimension; i++)
            result[i] = v.coords[i];
        return result;
    }

    int dimension() {
        return this.dimension;
    }

    double getComponent(int i) {
        return this.coords[i + 1];
    }

    double scalar(Vector v) {
        double result = 0.0;
        for (int i = 0; i < v.dimension; i++) {
            result = result + v.coords[i] * this.coords[i];
        }
        return result;
    }

    double len() {
        double sqrLen = 0.0;
        for (int i = 0; i < this.dimension; i++) {
            sqrLen = sqrLen + this.coords[i] * this.coords[i];
        }
        return Math.sqrt(sqrLen);
    }

    Vector multiple(double factor) {
        double[] newCoords = new double[this.dimension];
        for (int i = 0; i < this.dimension(); i++) {
            newCoords[i] = this.coords[i] * factor;
        }
        Vector newVector = new Vector(this.dimension, newCoords);
        return newVector;
    }

    public Vector add(Vector v) {
        int newDim = this.dimension;
        if (v.dimension() != this.dimension) {
            newDim = Math.min(v.dimension, this.dimension);
        }
        double[] newCoords = new double[newDim];
        for (int i = 0; i < newDim; i++) {
            newCoords[i] = v.coords[i] + this.coords[i];
        }
        Vector newVector = new Vector(newDim, newCoords);
        return newVector;
    }

    public Vector sub(Vector v) {
        int newDim = this.dimension;
        if (v.dimension() != this.dimension) {
            newDim = Math.min(v.dimension, this.dimension);
        }
        double[] newCoords = new double[newDim];
        for (int i = 0; i < newDim; i++) {
            newCoords[i] = v.coords[i] - this.coords[i];
        }
        Vector newVector = new Vector(newDim, newCoords);
        return newVector;
    }


}
