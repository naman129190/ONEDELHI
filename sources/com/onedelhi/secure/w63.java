package com.onedelhi.secure;

import java.io.IOException;

public class w63 implements gs4 {

    /* renamed from: a */
    public final s63 f36908a;

    /* renamed from: a */
    public v11 f36909a;

    /* renamed from: a */
    public boolean f36910a = false;

    /* renamed from: b */
    public boolean f36911b = false;

    public w63(s63 s63) {
        this.f36908a = s63;
    }

    /* renamed from: a */
    public final void mo46559a() {
        if (!this.f36910a) {
            this.f36910a = true;
            return;
        }
        throw new iu0("Cannot encode a second value in the ValueEncoderContext");
    }

    @mr2
    /* renamed from: b */
    public gs4 mo36877b(int i) throws IOException {
        mo46559a();
        this.f36908a.mo44216o(this.f36909a, i, this.f36911b);
        return this;
    }

    /* renamed from: c */
    public void mo46560c(v11 v11, boolean z) {
        this.f36910a = false;
        this.f36909a = v11;
        this.f36911b = z;
    }

    @mr2
    /* renamed from: f */
    public gs4 mo36878f(float f) throws IOException {
        mo46559a();
        this.f36908a.mo44213g(this.f36909a, f, this.f36911b);
        return this;
    }

    @mr2
    /* renamed from: g */
    public gs4 mo36879g(@ts2 String str) throws IOException {
        mo46559a();
        this.f36908a.mo44214h(this.f36909a, str, this.f36911b);
        return this;
    }

    @mr2
    /* renamed from: h */
    public gs4 mo36880h(boolean z) throws IOException {
        mo46559a();
        this.f36908a.mo44220x(this.f36909a, z, this.f36911b);
        return this;
    }

    @mr2
    /* renamed from: l */
    public gs4 mo36881l(double d) throws IOException {
        mo46559a();
        this.f36908a.mo44212f(this.f36909a, d, this.f36911b);
        return this;
    }

    @mr2
    /* renamed from: o */
    public gs4 mo36882o(@mr2 byte[] bArr) throws IOException {
        mo46559a();
        this.f36908a.mo44214h(this.f36909a, bArr, this.f36911b);
        return this;
    }

    @mr2
    /* renamed from: q */
    public gs4 mo36883q(long j) throws IOException {
        mo46559a();
        this.f36908a.mo44218v(this.f36909a, j, this.f36911b);
        return this;
    }
}
