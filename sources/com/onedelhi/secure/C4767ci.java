package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.ci */
public abstract class C4767ci extends i31 {

    /* renamed from: b */
    public static final /* synthetic */ boolean f26755b = false;

    /* renamed from: n */
    public final int f26756n;

    /* renamed from: o */
    public int f26757o = 0;

    static {
        Class<C4767ci> cls = C4767ci.class;
    }

    public C4767ci(int i) {
        this.f26756n = i;
    }

    /* renamed from: a */
    public int mo32375a() {
        return yy3.m72387a();
    }

    /* renamed from: c */
    public int mo32376c() {
        return az3.m39211b();
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }

    /* renamed from: j */
    public int mo32378j() {
        return this.f26757o;
    }

    /* renamed from: k */
    public void mo32379k(int i) throws no4 {
        if (((this.f26756n - 1) & i) == 0) {
            this.f26757o = i;
            return;
        }
        throw new no4("Start offset must be a multiple of " + this.f26756n);
    }
}
