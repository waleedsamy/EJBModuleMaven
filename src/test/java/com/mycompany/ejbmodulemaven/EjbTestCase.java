package com.mycompany.ejbmodulemaven;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Abstract test case for unit testing EJB3s using the GF embedded container.
 *
 * @see
 * <a href="http://ctpjava.blogspot.com.eg/2009/10/unit-testing-ejbs-and-jpa-with.html">Unit
 * Testing EJBs and JPA with Embeddable GlassFish</a>
 *
 */
public abstract class EjbTestCase {

    private static Context namingContext;
    private static EJBContainer container;

    private static final String TARGET_DIR = "target/classes";

    /**
     * Sets up the {@link InitialContext} for the embedded application server
     *
     * @throws Exception If the {@link InitialContext} could not be set-up
     */
    @BeforeClass
    public static void setUp() throws Exception {
        Map<String, Object> properties = new HashMap<>();
        properties.put(EJBContainer.MODULES, new File(TARGET_DIR));
        container = EJBContainer.createEJBContainer(properties);
        namingContext = container.getContext();
    }

    @SuppressWarnings("unchecked")
    protected <T> T lookupBy(Class<T> type) throws NamingException {
        return (T) namingContext.lookup("java:global/classes/" + type.getSimpleName());
    }

    @AfterClass
    public static void tearDown() throws Exception {
        namingContext.close();
        container.close();
    }
}
