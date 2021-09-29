 class AreaPerimeter
{
    private double width;
    private double height;

    public AreaPerimeter()
    {
       this(1.0,1.0);
    }
    public AreaPerimeter(double width,double height)
    {
        this.width=width;
        this.height=height;
    }

    public double getArea()
    {
        return this.width*this.height;
    }

    public double getPerimeter()
    {
        return 2*(this.width+this.height);
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width=width;
    }

    public double getheight()
    {
        return height;
    }
    public void setHeight(double Height)
    {
        this.height=height;
    }
}
public class Rectangle
{
    public static void main(String[] args) {
      AreaPerimeter api=new AreaPerimeter();
      api.getArea();
      System.out.println(api.getArea());

      api.getPerimeter();
      System.out.println();
      System.out.println(api.getPerimeter());
    }
}
