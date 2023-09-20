package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/bm1;", "", "", "inbound", "", "streamId", "length", "type", "flags", "", "c", "b", "(I)Ljava/lang/String;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class bm1 {

    /* renamed from: a */
    public static final int f26417a = 16384;

    /* renamed from: a */
    public static final bm1 f26418a = new bm1();
    @rw1
    @vr2

    /* renamed from: a */
    public static final C5301fr f26419a = C5301fr.f28633a.mo36296l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: a */
    public static final String[] f26420a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b */
    public static final int f26421b = 0;

    /* renamed from: b */
    public static final String[] f26422b = new String[64];

    /* renamed from: c */
    public static final int f26423c = 1;

    /* renamed from: c */
    public static final String[] f26424c;

    /* renamed from: d */
    public static final int f26425d = 2;

    /* renamed from: e */
    public static final int f26426e = 3;

    /* renamed from: f */
    public static final int f26427f = 4;

    /* renamed from: g */
    public static final int f26428g = 5;

    /* renamed from: h */
    public static final int f26429h = 6;

    /* renamed from: i */
    public static final int f26430i = 7;

    /* renamed from: j */
    public static final int f26431j = 8;

    /* renamed from: k */
    public static final int f26432k = 9;

    /* renamed from: l */
    public static final int f26433l = 0;

    /* renamed from: m */
    public static final int f26434m = 1;

    /* renamed from: n */
    public static final int f26435n = 1;

    /* renamed from: o */
    public static final int f26436o = 4;

    /* renamed from: p */
    public static final int f26437p = 4;

    /* renamed from: q */
    public static final int f26438q = 8;

    /* renamed from: r */
    public static final int f26439r = 32;

    /* renamed from: s */
    public static final int f26440s = 32;

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            jt1.m53776o(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = t54.m65444j2(nq4.m58722v("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f26424c = strArr;
        String[] strArr2 = f26422b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f26422b;
            strArr3[i3 | 8] = jt1.m53745C(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = f26422b;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f26422b;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + to1.f35743f + strArr5[i5];
                strArr5[i8 | 8] = strArr5[i7] + to1.f35743f + strArr5[i5] + "|PADDED";
            }
        }
        int length = f26422b.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = f26422b;
            if (strArr6[i9] == null) {
                strArr6[i9] = f26424c[i9];
            }
        }
    }

    @vr2
    /* renamed from: a */
    public final String mo31949a(int i, int i2) {
        String str;
        boolean z;
        int i3;
        Object obj;
        String str2;
        String str3;
        if (i2 == 0) {
            return "";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : f26424c[i2];
            }
            if (!(i == 7 || i == 8)) {
                String[] strArr = f26422b;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    jt1.m53774m(str);
                } else {
                    str = f26424c[i2];
                }
                String str4 = str;
                if (i == 5 && (i2 & 4) != 0) {
                    z = false;
                    i3 = 4;
                    obj = null;
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else if (i != 0 || (i2 & 32) == 0) {
                    return str4;
                } else {
                    z = false;
                    i3 = 4;
                    obj = null;
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                return t54.m65446k2(str4, str2, str3, z, i3, obj);
            }
        }
        return f26424c[i2];
    }

    @vr2
    /* renamed from: b */
    public final String mo31950b(int i) {
        String[] strArr = f26420a;
        if (i < strArr.length) {
            return strArr[i];
        }
        return nq4.m58722v("0x%02x", Integer.valueOf(i));
    }

    @vr2
    /* renamed from: c */
    public final String mo31951c(boolean z, int i, int i2, int i3, int i4) {
        return nq4.m58722v("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), mo31950b(i3), mo31949a(i3, i4));
    }
}
