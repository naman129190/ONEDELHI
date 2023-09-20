package com.onedelhi.secure;

import java.util.Locale;

public final class vt3 extends Exception {

    /* renamed from: o */
    public static final int f36701o = 0;

    /* renamed from: p */
    public static final int f36702p = 1;

    /* renamed from: q */
    public static final int f36703q = 2;

    /* renamed from: r */
    public static final int f36704r = 3;

    /* renamed from: s */
    public static final int f36705s = 4;

    /* renamed from: n */
    public final int f36706n;

    public vt3(String str) {
        super(str);
        this.f36706n = mo46369b(str);
    }

    /* renamed from: a */
    public int mo46368a() {
        return this.f36706n;
    }

    /* renamed from: b */
    public final int mo46369b(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c = 0;
                    break;
                }
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c = 1;
                    break;
                }
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c = 2;
                    break;
                }
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c = 3;
                    break;
                }
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
            case 4:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }
}
