package com.mycompany.ejbmodulemaven;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author waleed
 */
public class CalcServiceTest extends EjbTestCase {

    public CalcService statService;

    @Before
    public void init() throws Exception {
        statService = (CalcService) lookupBy(CalcService.class);
    }

    /**
     * Test method for {@link test.TestBean#add(int, int)}.
     */
    @Test
    public void testAdd() {
        int a = 1, b = 2, expected = a + b;
        Assert.assertEquals(expected, statService.add(a, b));
    }

    /**
     * Test method for {@link test.TestBean#multiply(int, int)}.
     */
    @Test
    public void testMultiply() {
        int a = 1, b = 2, expected = a * b;
        Assert.assertEquals(expected, statService.multiply(a, b));
    }
}
