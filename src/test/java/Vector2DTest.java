import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;//1e-9=0.000...0001
    private static Vector2D v1;//action

    @BeforeClass
    public static void createNewVector() {
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLenght() {
        //assertion
        Assert.assertEquals(0, v1.length(), EPS);
    }
    @Test
    public void newVectorShouldHaveZeroX() {
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveY() {
        Assert.assertEquals(0, v1.getY(), EPS);
    }
}
