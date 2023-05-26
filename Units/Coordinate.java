package Units;

public class Coordinate {
    public int x, y;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    public float getDistance(Coordinate coordinateEnemy){
        float dx = distanceXY(coordinateEnemy)[0];
        float dy = distanceXY(coordinateEnemy)[1];
        return (float) Math.sqrt(dx*dx + dy*dy);
    }

    public float[] distanceXY(Coordinate coordinate){
        float[] result = new float[2];
        result[0] = (float)coordinate.x - this.x;
        result[1] = (float)coordinate.y - this.y;
        return result;
    }
}
