package uk.ac.cam.wz337.Q14;

public class Vector2D {
    public float x;
    public float y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    static public Vector2D add(Vector2D a, Vector2D b) {
        return new Vector2D(a.x + b.x, a.y + b.y);
    }

    static public Vector2D scalarProduct(Vector2D a, Vector2D b) {
        return new Vector2D(a.x * b.x, a.y * b.y);
    }

    static public Vector2D normalised(Vector2D a) {
        float length = (float) Math.sqrt(a.x * a.x + a.y * a.y);
        return new Vector2D(a.x / length, a.y / length);
    }

    static public float getMagnitude(Vector2D a) {
        return (float) Math.sqrt(a.x * a.x + a.y * a.y);
    }
}
