package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u000fB1\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u000e\u0010\u0017J\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/ws3;", "", "d", "f", "b", "segment", "c", "", "byteCount", "e", "Lcom/onedelhi/secure/un4;", "a", "sink", "g", "<init>", "()V", "", "data", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class ws3 {

    /* renamed from: a */
    public static final C7182a f37105a = new C7182a((wg0) null);

    /* renamed from: c */
    public static final int f37106c = 8192;

    /* renamed from: d */
    public static final int f37107d = 1024;
    @rw1

    /* renamed from: a */
    public int f37108a;
    @rw1
    @ss2

    /* renamed from: a */
    public ws3 f37109a;
    @rw1

    /* renamed from: a */
    public boolean f37110a;
    @rw1
    @vr2

    /* renamed from: a */
    public final byte[] f37111a;
    @rw1

    /* renamed from: b */
    public int f37112b;
    @rw1
    @ss2

    /* renamed from: b */
    public ws3 f37113b;
    @rw1

    /* renamed from: b */
    public boolean f37114b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/ws3$a;", "", "", "SHARE_MINIMUM", "I", "SIZE", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.ws3$a */
    public static final class C7182a {
        public C7182a() {
        }

        public /* synthetic */ C7182a(wg0 wg0) {
            this();
        }
    }

    public ws3() {
        this.f37111a = new byte[8192];
        this.f37114b = true;
        this.f37110a = false;
    }

    public ws3(@vr2 byte[] bArr, int i, int i2, boolean z, boolean z2) {
        jt1.m53777p(bArr, C4311b.C4317f.C4318a.f25149a);
        this.f37111a = bArr;
        this.f37108a = i;
        this.f37112b = i2;
        this.f37110a = z;
        this.f37114b = z2;
    }

    /* renamed from: a */
    public final void mo46872a() {
        ws3 ws3 = this.f37113b;
        int i = 0;
        if (ws3 != this) {
            jt1.m53774m(ws3);
            if (ws3.f37114b) {
                int i2 = this.f37112b - this.f37108a;
                ws3 ws32 = this.f37113b;
                jt1.m53774m(ws32);
                int i3 = 8192 - ws32.f37112b;
                ws3 ws33 = this.f37113b;
                jt1.m53774m(ws33);
                if (!ws33.f37110a) {
                    ws3 ws34 = this.f37113b;
                    jt1.m53774m(ws34);
                    i = ws34.f37108a;
                }
                if (i2 <= i3 + i) {
                    ws3 ws35 = this.f37113b;
                    jt1.m53774m(ws35);
                    mo46878g(ws35, i2);
                    mo46873b();
                    zs3.m74279d(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    @ss2
    /* renamed from: b */
    public final ws3 mo46873b() {
        ws3 ws3 = this.f37109a;
        if (ws3 == this) {
            ws3 = null;
        }
        ws3 ws32 = this.f37113b;
        jt1.m53774m(ws32);
        ws32.f37109a = this.f37109a;
        ws3 ws33 = this.f37109a;
        jt1.m53774m(ws33);
        ws33.f37113b = this.f37113b;
        this.f37109a = null;
        this.f37113b = null;
        return ws3;
    }

    @vr2
    /* renamed from: c */
    public final ws3 mo46874c(@vr2 ws3 ws3) {
        jt1.m53777p(ws3, "segment");
        ws3.f37113b = this;
        ws3.f37109a = this.f37109a;
        ws3 ws32 = this.f37109a;
        jt1.m53774m(ws32);
        ws32.f37113b = ws3;
        this.f37109a = ws3;
        return ws3;
    }

    @vr2
    /* renamed from: d */
    public final ws3 mo46875d() {
        this.f37110a = true;
        return new ws3(this.f37111a, this.f37108a, this.f37112b, true, false);
    }

    @vr2
    /* renamed from: e */
    public final ws3 mo46876e(int i) {
        ws3 ws3;
        if (i > 0 && i <= this.f37112b - this.f37108a) {
            if (i >= 1024) {
                ws3 = mo46875d();
            } else {
                ws3 = zs3.m74280e();
                byte[] bArr = this.f37111a;
                byte[] bArr2 = ws3.f37111a;
                int i2 = this.f37108a;
                C7458za.m72894f1(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
            }
            ws3.f37112b = ws3.f37108a + i;
            this.f37108a += i;
            ws3 ws32 = this.f37113b;
            jt1.m53774m(ws32);
            ws32.mo46874c(ws3);
            return ws3;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    @vr2
    /* renamed from: f */
    public final ws3 mo46877f() {
        byte[] bArr = this.f37111a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ws3(copyOf, this.f37108a, this.f37112b, false, true);
    }

    /* renamed from: g */
    public final void mo46878g(@vr2 ws3 ws3, int i) {
        jt1.m53777p(ws3, "sink");
        if (ws3.f37114b) {
            int i2 = ws3.f37112b;
            if (i2 + i > 8192) {
                if (!ws3.f37110a) {
                    int i3 = ws3.f37108a;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = ws3.f37111a;
                        C7458za.m72894f1(bArr, bArr, 0, i3, i2, 2, (Object) null);
                        ws3.f37112b -= ws3.f37108a;
                        ws3.f37108a = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f37111a;
            byte[] bArr3 = ws3.f37111a;
            int i4 = ws3.f37112b;
            int i5 = this.f37108a;
            C7458za.m72840W0(bArr2, bArr3, i4, i5, i5 + i);
            ws3.f37112b += i;
            this.f37108a += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
