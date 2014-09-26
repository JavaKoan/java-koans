package com.javakoan.lesson.patterns.decorator.ex2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/08/13
 * Time: 11:42
 * To change this template use File | Settings | File Templates.
 */
public class L33tSp34kInputStream extends FilterInputStream {

    public L33tSp34kInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int character = super.read();

        if((char)character == 'a' || (char)character == 'A'){
            return '4';
        }

        if((char)character == 'e' || (char)character == 'E'){
            return '3';
        }

        return character;
    }
}
