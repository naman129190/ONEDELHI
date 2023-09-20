package com.onedelhi.secure;

public final class nu6 {
    /* renamed from: a */
    public static String m23196a(on6 on6) {
        String str;
        StringBuilder sb = new StringBuilder(on6.mo18486f());
        for (int i = 0; i < on6.mo18486f(); i++) {
            int b = on6.mo18484b(i);
            if (b == 34) {
                str = "\\\"";
            } else if (b == 39) {
                str = "\\'";
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            b = (b & 7) + 48;
                        }
                        sb.append((char) b);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
