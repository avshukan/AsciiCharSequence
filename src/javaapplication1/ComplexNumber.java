/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 */
public final class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

        @Override
    public int hashCode() {
        Double x = this.getRe();
        Double y = this.getIm();
        return (int) (x.hashCode() + y.hashCode());
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        ComplexNumber x = (ComplexNumber) obj;
        Double e = Double.MAX_VALUE;
        Double xi = ((ComplexNumber) x).getIm();
        if (Math.abs(this.getRe() - x.getRe()) < 2 / e) {
            if (Math.abs(this.getIm() - x.getIm()) < 2 / e) {
                return true;
            }
        }

        return false;
    }
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 61 * hash + (int) (Double.doubleToLongBits(this.re) ^ (Double.doubleToLongBits(this.re) >>> 32));
//        hash = 61 * hash + (int) (Double.doubleToLongBits(this.im) ^ (Double.doubleToLongBits(this.im) >>> 32));
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final ComplexNumber other = (ComplexNumber) obj;
//        if (Double.doubleToLongBits(this.re) != Double.doubleToLongBits(other.re)) {
//            return false;
//        }
//        if (Double.doubleToLongBits(this.im) != Double.doubleToLongBits(other.im)) {
//            return false;
//        }
//        return true;
//    }
}
