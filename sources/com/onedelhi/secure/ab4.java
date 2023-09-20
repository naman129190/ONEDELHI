package com.onedelhi.secure;

public final class ab4 {

    /* renamed from: com.onedelhi.secure.ab4$a */
    public static class C4507a implements C4509c {

        /* renamed from: a */
        public final /* synthetic */ C5173er f25807a;

        public C4507a(C5173er erVar) {
            this.f25807a = erVar;
        }

        /* renamed from: a */
        public byte mo30517a(int i) {
            return this.f25807a.mo34545i(i);
        }

        public int size() {
            return this.f25807a.size();
        }
    }

    /* renamed from: com.onedelhi.secure.ab4$b */
    public static class C4508b implements C4509c {

        /* renamed from: a */
        public final /* synthetic */ byte[] f25808a;

        public C4508b(byte[] bArr) {
            this.f25808a = bArr;
        }

        /* renamed from: a */
        public byte mo30517a(int i) {
            return this.f25808a[i];
        }

        public int size() {
            return this.f25808a.length;
        }
    }

    /* renamed from: com.onedelhi.secure.ab4$c */
    public interface C4509c {
        /* renamed from: a */
        byte mo30517a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m37780a(C5173er erVar) {
        return m37781b(new C4507a(erVar));
    }

    /* renamed from: b */
    public static String m37781b(C4509c cVar) {
        String str;
        StringBuilder sb = new StringBuilder(cVar.size());
        for (int i = 0; i < cVar.size(); i++) {
            int a = cVar.mo30517a(i);
            if (a == 34) {
                str = "\\\"";
            } else if (a == 39) {
                str = "\\'";
            } else if (a != 92) {
                switch (a) {
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
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            a = (a & 7) + 48;
                        }
                        sb.append((char) a);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m37782c(byte[] bArr) {
        return m37781b(new C4508b(bArr));
    }

    /* renamed from: d */
    public static String m37783d(String str) {
        return str.replace(C3002nr.f17551h, "\\\\").replace("\"", "\\\"");
    }

    /* renamed from: e */
    public static String m37784e(String str) {
        return m37780a(C5173er.m47136w(str));
    }
}
