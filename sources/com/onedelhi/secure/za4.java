package com.onedelhi.secure;

public final class za4 extends C6133mr {
    /* renamed from: b */
    public int mo31184b() {
        return 2;
    }

    /* renamed from: d */
    public int mo40743d(char c, StringBuilder sb) {
        int i;
        int i2;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i2 = (c - '0') + 4;
            } else if (c < 'a' || c > 'z') {
                if (c < ' ') {
                    sb.append(0);
                } else {
                    if (c <= '/') {
                        sb.append(1);
                        i = c - '!';
                    } else if (c <= '@') {
                        sb.append(1);
                        i = (c - ':') + 15;
                    } else if (c >= '[' && c <= '_') {
                        sb.append(1);
                        i = (c - '[') + 22;
                    } else if (c == '`') {
                        sb.append(2);
                        i = c - '`';
                    } else if (c <= 'Z') {
                        sb.append(2);
                        i = (c - 'A') + 1;
                    } else if (c <= 127) {
                        sb.append(2);
                        i = (c - '{') + 27;
                    } else {
                        sb.append("\u0001\u001e");
                        return mo40743d((char) (c - 128), sb) + 2;
                    }
                    c = (char) i;
                }
                sb.append(c);
                return 2;
            } else {
                i2 = (c - 'a') + 14;
            }
            c2 = (char) i2;
        }
        sb.append(c2);
        return 1;
    }
}
