package Opgave1;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {
    public void testGetValues(){
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);
        //rectangle 1
        assertEquals(4.0,r1.width);
        assertEquals(40.0,r1.height);
        assertEquals(160.0,r1.getArea());
        assertEquals(88.0,r1.getPerimeter());
        //rectangle 2
        assertEquals(3.5,r2.width);
        assertEquals(35.9,r2.height);
        assertEquals(125.64999999999999,r2.getArea());
        assertEquals(78.8,r2.getPerimeter());
    }
}