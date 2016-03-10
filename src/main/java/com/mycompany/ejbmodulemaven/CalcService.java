package com.mycompany.ejbmodulemaven;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author waleed
 */
@Stateless
@LocalBean
public class CalcService {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
