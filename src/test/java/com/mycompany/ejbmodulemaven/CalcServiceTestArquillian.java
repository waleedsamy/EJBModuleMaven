package org.arquillian.example;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import com.mycompany.ejbmodulemaven.CalcService;

@RunWith(Arquillian.class)
public class CalcServiceTestArquillian {

    @Deployment
    public static JavaArchive createDeployment() {
        JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
        .addClass(CalcService.class)
        .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        
        System.out.println(jar.toString(true));
        return jar;
    }
    
    @Inject
    CalcService calcService;

    /**
     * Test method for {@link test.TestBean#add(int, int)}.
     */
    @Test
    public void testAdd() {
        int a = 1, b = 2, expected = a + b;
        Assert.assertEquals(expected, calcService.add(a, b));
    }

    /**
     * Test method for {@link test.TestBean#multiply(int, int)}.
     */
    @Test
    public void testMultiply() {
        int a = 1, b = 2, expected = a * b;
        Assert.assertEquals(expected, calcService.multiply(a, b));
    }
    
    
}