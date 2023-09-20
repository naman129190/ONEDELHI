package com.onedelhi.secure;

import com.onedelhi.secure.C6239o1;
import com.onedelhi.secure.nl3;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0011H\bR>\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078\u0004@BX\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/onedelhi/secure/m1;", "Lcom/onedelhi/secure/o1;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "i", "()Lcom/onedelhi/secure/o1;", "", "size", "", "j", "(I)[Lcom/onedelhi/secure/o1;", "h", "slot", "Lcom/onedelhi/secure/un4;", "m", "(Lcom/onedelhi/secure/o1;)V", "Lkotlin/Function1;", "block", "k", "<set-?>", "slots", "[Lcom/onedelhi/secure/o1;", "o", "()[Lcom/onedelhi/secure/o1;", "getSlots$annotations", "()V", "nCollectors", "I", "n", "()I", "Lcom/onedelhi/secure/d34;", "z", "()Lcom/onedelhi/secure/d34;", "subscriptionCount", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.m1 */
public abstract class C6079m1<S extends C6239o1<?>> {
    @ss2

    /* renamed from: a */
    public o64 f31970a;
    @ss2

    /* renamed from: a */
    public S[] f31971a;

    /* renamed from: n */
    public int f31972n;

    /* renamed from: o */
    public int f31973o;

    /* renamed from: p */
    public static /* synthetic */ void m56803p() {
    }

    @vr2
    /* renamed from: h */
    public final S mo40416h() {
        S s;
        o64 o64;
        synchronized (this) {
            S[] o = mo40420o();
            if (o == null) {
                o = mo34784j(2);
                this.f31971a = o;
            } else if (mo40419n() >= o.length) {
                S[] copyOf = Arrays.copyOf(o, o.length * 2);
                jt1.m53776o(copyOf, "copyOf(this, newSize)");
                this.f31971a = (C6239o1[]) copyOf;
                o = (C6239o1[]) copyOf;
            }
            int i = this.f31973o;
            do {
                s = o[i];
                if (s == null) {
                    s = mo34783i();
                    o[i] = s;
                }
                i++;
                if (i >= o.length) {
                    i = 0;
                }
            } while (!s.mo36555a(this));
            this.f31973o = i;
            this.f31972n = mo40419n() + 1;
            o64 = this.f31970a;
        }
        if (o64 != null) {
            o64.mo41550i0(1);
        }
        return s;
    }

    @vr2
    /* renamed from: i */
    public abstract S mo34783i();

    @vr2
    /* renamed from: j */
    public abstract S[] mo34784j(int i);

    /* renamed from: k */
    public final void mo40417k(@vr2 ec1<? super S, un4> ec1) {
        C6239o1[] g;
        if (this.f31972n != 0 && (g = this.f31971a) != null) {
            int i = 0;
            int length = g.length;
            while (i < length) {
                C6239o1 o1Var = g[i];
                i++;
                if (o1Var != null) {
                    ec1.mo17094X(o1Var);
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo40418m(@vr2 S s) {
        o64 o64;
        int i;
        b80[] b;
        synchronized (this) {
            this.f31972n = mo40419n() - 1;
            o64 = this.f31970a;
            i = 0;
            if (mo40419n() == 0) {
                this.f31973o = 0;
            }
            b = s.mo36556b(this);
        }
        int length = b.length;
        while (i < length) {
            b80 b80 = b[i];
            i++;
            if (b80 != null) {
                nl3.C6191a aVar = nl3.f32575a;
                b80.mo31191m0(nl3.m58187b(un4.f36206a));
            }
        }
        if (o64 != null) {
            o64.mo41550i0(-1);
        }
    }

    /* renamed from: n */
    public final int mo40419n() {
        return this.f31972n;
    }

    @ss2
    /* renamed from: o */
    public final S[] mo40420o() {
        return this.f31971a;
    }

    @vr2
    /* renamed from: z */
    public final d34<Integer> mo40421z() {
        o64 o64;
        synchronized (this) {
            o64 = this.f31970a;
            if (o64 == null) {
                o64 = new o64(mo40419n());
                this.f31970a = o64;
            }
        }
        return o64;
    }
}
