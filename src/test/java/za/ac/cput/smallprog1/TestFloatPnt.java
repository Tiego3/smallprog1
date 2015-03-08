package za.ac.cput.smallprog1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class TestFloatPnt extends TestCase {
    @Test
    public void testFloat() throws Exception{
        FloatPnt fp = new FloatPnt();
        assertEquals(9.7,fp.mainFloatPnt());
    }
}
