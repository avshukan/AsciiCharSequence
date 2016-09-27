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
        byte[] bb = {'a', 'b', 'c'};
        AsciiCharSequence acs;
        acs = new AsciiCharSequence(bb);
        System.out.println("bb = " + Arrays.toString(bb));
                
        System.out.println("Result = " + acs.toString());

        ComplexNumber a = new ComplexNumber((double) 2, (double) 5);
        ComplexNumber b = new ComplexNumber((double) 2.0000000000000002, (double) 5);

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
