package element;

/**
 * Created by YUSUF on 1/26/2016.
 */
public class Point {
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Point))  {
            return false;
        }
        Point t = (Point) o;
        return this.x == t.x && this.y == t.y;
    }

    public int hashCode() {
        return this.x * 31 + this.y;
    }
}
