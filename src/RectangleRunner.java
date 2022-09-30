public class RectangleRunner
{
    public static void main (String[]args)
    {
        Rectangle rect1 = new Rectangle(150,200);
        Rectangle rect2 = new Rectangle (125);
        Rectangle rect3 = new Rectangle ();

        System.out.println("Plot 1 Length: " + rect1.getLength());
        System.out.println("Plot 1 Width: " + rect1.getWidth());
        System.out.println("Plot 1 Area: " + rect1.calculateArea());

        System.out.println("Plot 2 Length: " + rect2.getLength());
        System.out.println("Plot 2 Width: " + rect2.getWidth());
        System.out.println("Plot 2 Area: " + rect2.calculateArea());

        System.out.println("Plot 3 Length: " + rect3.getLength());
        System.out.println("Plot 3 Width: " + rect3.getWidth());
        System.out.println("Plot 3 Area: " + rect3.calculateArea());

        rect1.setWidth(75);
        rect2.setWidth(75);
        rect2.setLength(75);
        rect3.setWidth(75);
    }
}
