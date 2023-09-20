package com.onedelhi.secure;

import com.onedelhi.secure.ip6;
import com.onedelhi.secure.jq6;
import java.io.IOException;

public class ip6<MessageType extends jq6<MessageType, BuilderType>, BuilderType extends ip6<MessageType, BuilderType>> extends nl6<MessageType, BuilderType> {

    /* renamed from: a */
    public final jq6 f13797a;

    /* renamed from: b */
    public jq6 f13798b;

    public ip6(MessageType messagetype) {
        this.f13797a = messagetype;
        if (!messagetype.mo18549y()) {
            this.f13798b = messagetype.mo18544m();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: i */
    public static void m17769i(Object obj, Object obj2) {
        dt6.m13329a().mo14854b(obj.getClass()).mo16913g(obj, obj2);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ vs6 mo17915d() {
        throw null;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ nl6 mo17917g(byte[] bArr, int i, int i2) throws dr6 {
        mo17921l(bArr, 0, i2, oo6.f18059b);
        return this;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ nl6 mo17918h(byte[] bArr, int i, int i2, oo6 oo6) throws dr6 {
        mo17921l(bArr, 0, i2, oo6);
        return this;
    }

    /* renamed from: j */
    public final ip6 mo17916f() {
        ip6 ip6 = (ip6) this.f13797a.mo12815A(5, (Object) null, (Object) null);
        ip6.f13798b = mo17913F9();
        return ip6;
    }

    /* renamed from: k */
    public final ip6 mo17920k(jq6 jq6) {
        if (!this.f13797a.equals(jq6)) {
            if (!this.f13798b.mo18549y()) {
                mo17925p();
            }
            m17769i(this.f13798b, jq6);
        }
        return this;
    }

    /* renamed from: l */
    public final ip6 mo17921l(byte[] bArr, int i, int i2, oo6 oo6) throws dr6 {
        if (!this.f13798b.mo18549y()) {
            mo17925p();
        }
        try {
            dt6.m13329a().mo14854b(this.f13798b.getClass()).mo16910d(this.f13798b, bArr, 0, i2, new vl6(oo6));
            return this;
        } catch (dr6 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw dr6.m13277f();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType mo17922m() {
        /*
            r5 = this;
            com.onedelhi.secure.jq6 r0 = r5.mo17913F9()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo12815A(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            com.onedelhi.secure.dt6 r3 = com.onedelhi.secure.dt6.m13329a()
            java.lang.Class r4 = r0.getClass()
            com.onedelhi.secure.gt6 r3 = r3.mo14854b(r4)
            boolean r3 = r3.mo16908b(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.mo12815A(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            com.onedelhi.secure.ou6 r1 = new com.onedelhi.secure.ou6
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ip6.mo17922m():com.onedelhi.secure.jq6");
    }

    /* renamed from: n */
    public MessageType mo17913F9() {
        if (!this.f13798b.mo18549y()) {
            return this.f13798b;
        }
        this.f13798b.mo18546u();
        return this.f13798b;
    }

    /* renamed from: o */
    public final void mo17924o() {
        if (!this.f13798b.mo18549y()) {
            mo17925p();
        }
    }

    /* renamed from: p */
    public void mo17925p() {
        jq6 m = this.f13797a.mo18544m();
        m17769i(m, this.f13798b);
        this.f13798b = m;
    }
}
