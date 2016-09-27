/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author _
 */
public class AsciiCharSequence implements CharSequence {

    private final byte[] value;

    public AsciiCharSequence() {
        this.value = null;
    }

    public AsciiCharSequence(byte[] s) {
        this.value = new byte[s.length];
        System.arraycopy(s, 0, this.value, 0, s.length);
    }

    @Override
    public int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char charAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        //return this.substring(i, i1);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.value.length; i++) {
            s += this.value[i];
        }
        return s;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
