package com.onedelhi.secure;

public final class cz3 implements q74 {
    @ts2

    /* renamed from: a */
    public final Object[] f10577a;

    /* renamed from: b */
    public final String f10578b;

    public cz3(String str) {
        this(str, (Object[]) null);
    }

    public cz3(String str, @ts2 Object[] objArr) {
        this.f10578b = str;
        this.f10577a = objArr;
    }

    /* renamed from: d */
    public static void m12860d(p74 p74, int i, Object obj) {
        long j;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            p74.mo13599J0(i);
        } else if (obj instanceof byte[]) {
            p74.mo13606w(i, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = (double) ((Float) obj).floatValue();
            } else if (obj instanceof Double) {
                doubleValue = ((Double) obj).doubleValue();
            } else {
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        p74.mo13605m2(i, (String) obj);
                        return;
                    } else if (obj instanceof Boolean) {
                        j = ((Boolean) obj).booleanValue() ? 1 : 0;
                    } else {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                    }
                    j = (long) byteValue;
                }
                p74.mo13596B2(i, j);
                return;
            }
            p74.mo13600P1(i, doubleValue);
        }
    }

    /* renamed from: e */
    public static void m12861e(p74 p74, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m12860d(p74, i, obj);
            }
        }
    }

    /* renamed from: a */
    public void mo13767a(p74 p74) {
        m12861e(p74, this.f10577a);
    }

    /* renamed from: b */
    public String mo13768b() {
        return this.f10578b;
    }

    /* renamed from: c */
    public int mo13769c() {
        Object[] objArr = this.f10577a;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }
}
