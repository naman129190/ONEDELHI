package com.onedelhi.secure;

import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.C6205no;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/xw4;", "", "Lcom/onedelhi/secure/no$a;", "cursor", "", "key", "Lcom/onedelhi/secure/un4;", "c", "", "code", "", "b", "d", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class xw4 {

    /* renamed from: a */
    public static final int f37653a = 128;

    /* renamed from: a */
    public static final long f37654a = 125;

    /* renamed from: a */
    public static final xw4 f37655a = new xw4();
    @vr2

    /* renamed from: a */
    public static final String f37656a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* renamed from: b */
    public static final int f37657b = 64;

    /* renamed from: b */
    public static final long f37658b = 123;

    /* renamed from: c */
    public static final int f37659c = 32;

    /* renamed from: c */
    public static final long f37660c = 65535;

    /* renamed from: d */
    public static final int f37661d = 16;

    /* renamed from: e */
    public static final int f37662e = 15;

    /* renamed from: f */
    public static final int f37663f = 8;

    /* renamed from: g */
    public static final int f37664g = 128;

    /* renamed from: h */
    public static final int f37665h = 127;

    /* renamed from: i */
    public static final int f37666i = 0;

    /* renamed from: j */
    public static final int f37667j = 1;

    /* renamed from: k */
    public static final int f37668k = 2;

    /* renamed from: l */
    public static final int f37669l = 8;

    /* renamed from: m */
    public static final int f37670m = 9;

    /* renamed from: n */
    public static final int f37671n = 10;

    /* renamed from: o */
    public static final int f37672o = 126;

    /* renamed from: p */
    public static final int f37673p = 127;

    /* renamed from: q */
    public static final int f37674q = 1001;

    /* renamed from: r */
    public static final int f37675r = 1005;

    @vr2
    /* renamed from: a */
    public final String mo47425a(@vr2 String str) {
        jt1.m53777p(str, "key");
        C5301fr.C5302a aVar = C5301fr.f28633a;
        return aVar.mo36296l(str + f37656a).mo36271g0().mo31169g();
    }

    @ss2
    /* renamed from: b */
    public final String mo47426b(int i) {
        StringBuilder sb;
        if (i < 1000 || i >= 5000) {
            sb = new StringBuilder();
            sb.append("Code must be in range [1000,5000): ");
            sb.append(i);
        } else if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
            return null;
        } else {
            sb = new StringBuilder();
            sb.append("Code ");
            sb.append(i);
            sb.append(" is reserved and may not be used.");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo47427c(@vr2 C6205no.C6206a aVar, @vr2 byte[] bArr) {
        jt1.m53777p(aVar, "cursor");
        jt1.m53777p(bArr, "key");
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = aVar.f32659a;
            int i2 = aVar.f32662n;
            int i3 = aVar.f32663o;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (aVar.mo41300b() != -1);
    }

    /* renamed from: d */
    public final void mo47428d(int i) {
        String b = mo47426b(i);
        if (!(b == null)) {
            jt1.m53774m(b);
            throw new IllegalArgumentException(b.toString());
        }
    }
}
