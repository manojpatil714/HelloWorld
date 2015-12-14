package group;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app = new App();

    @Test
    public void shouldAddTwoIntegers() {
        int result = app.add("7","3");
        Assert.assertEquals(10, result);
    }

}
