/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Alexander Shukan
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
        return this.value.length;
    }

    @Override
    public char charAt(int i) {
        return (char) this.value[i];
    }

    @Override
    public CharSequence subSequence(int a, int b) {
//        StringBuilder s = new StringBuilder("");
//        for (int i = a; i < b; i++) {
//            s.append((char) this.value[i]);
//        }
//        return s.toString();
        byte[] s = new byte[b - a];
        for (int i = 0; i < b - a; i++) {
            s[i] = this.value[i + a];
        }

//        System.arraycopy(this.value, 0, s, a, b);
        AsciiCharSequence ss = new AsciiCharSequence(s);
        return (CharSequence) ss;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < this.value.length; i++) {
            s.append((char) this.value[i]);
        }
        return s.toString();
    }

}
