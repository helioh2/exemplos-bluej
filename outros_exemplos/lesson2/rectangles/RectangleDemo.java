public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 60, 90);
        System.out.println(box.getX()+ " " + box.getY());
        System.out.println(box);
        
        Rectangle box2 = box;
        System.out.println(box2.getX()+ " " + box2.getY());
        System.out.println(box2);
        
        box.translate(200, 100);
         System.out.println(box.getX()+ " " + box.getY());
        System.out.println(box2.getX()+ " " + box2.getY());
        
        
    }
}
