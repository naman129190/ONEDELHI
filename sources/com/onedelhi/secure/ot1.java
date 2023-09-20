package com.onedelhi.secure;

public class ot1 extends RuntimeException {
    public ot1(String str) {
        super(str);
    }

    public ot1(String str, Throwable th) {
        super(str, th);
    }
}
