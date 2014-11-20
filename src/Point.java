//Ajeet Bains
//9 Nitrogen
// A Point object represents a pair of (x, y) integer coordinates.
// Reference Building Java Programs pp 505-517
import java.lang.Math;

public class Point
{
  int x;
  int y;

  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public double distanceFromOrigin()
  {
    return Math.sqrt((x * x) + (y * y));
  }
  public double distance(Point a)
  {
    return Math.sqrt(((a.x - x) * (a.x - x)) + ((a.y - y) * (a.y - y)));
  }
  public String toString()
  {
    return "(" + x + "," + y + ")";
  }
  public void setX(int b)
  {
    x = b;
  }
  public void setY(int c)
  {
    y = c;
  }
  public void translate(int dx, int dy)
  {
    x += dx;
    y += dy;
  }
}

    
    
    
