package com.onedelhi.secure;

public final class gk5 extends Exception {
    public gk5(String str) {
        super(String.format("User verification requirement %s not supported", new Object[]{str}));
    }
}
