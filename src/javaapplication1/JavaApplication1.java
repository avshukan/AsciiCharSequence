/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.awt.Robot;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.function.*;

/**
 *
 * @author _
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber((double) 2, (double) 5);
        ComplexNumber b = new ComplexNumber((double) 2.0000000000000002, (double) 5);
        DoubleUnaryOperator o;
        //o = new DoubleUnaryOperator();
        System.out.println(a.equals(b));
        double xx = 1.0 / 0.0;
        double yy = -1.0 / 0.0;
        double zz = xx+yy;
        int i = 0b01111111111111111111111111111111;
        int ii = (int) 3_000_000_001L;
        System.out.println(xx);
        System.out.println(yy);
        System.out.println(zz);
        System.out.println(i);
        System.out.println(ii);
        System.out.println(
                integrate(x -> 1, 0, 10));

    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        BigInteger scale = BigInteger.ONE;
        double step = 1 / scale.doubleValue();
        double area = integrate_once(f, a, b, step);
        double area_prev;
        do {
            scale = scale.multiply(BigInteger.valueOf(10));
            step = 1 / scale.doubleValue();
            area_prev = area;
            area = integrate_once(f, a, b, step);
        } while (Math.abs(area - area_prev) > 0.01);
        System.out.println(scale.toString());
        System.out.println(step);
        return area;
    }

    public static double integrate_once(DoubleUnaryOperator f, double a, double b, double step) {
        double area = 0.0;
        for (double x = a; x < b; x = x + step) {
            area = area + step * f.applyAsDouble(x);
        }
        return area;
    }
    
    

}
