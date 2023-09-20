package com.onedelhi.secure;

import java.io.DataInputStream;
import java.io.IOException;

public final class j02 {

    /* renamed from: a */
    public final int f30541a;

    /* renamed from: a */
    public final byte[] f30542a;

    /* renamed from: b */
    public int f30543b = 0;

    /* renamed from: c */
    public int f30544c = 0;

    /* renamed from: d */
    public int f30545d = 0;

    /* renamed from: e */
    public int f30546e = 0;

    /* renamed from: f */
    public int f30547f = 0;

    /* renamed from: g */
    public int f30548g = 0;

    public j02(int i, byte[] bArr, C4477aa aaVar) {
        this.f30541a = i;
        byte[] a = aaVar.mo30487a(i, false);
        this.f30542a = a;
        if (bArr != null) {
            int min = Math.min(bArr.length, i);
            this.f30544c = min;
            this.f30545d = min;
            this.f30543b = min;
            System.arraycopy(bArr, bArr.length - min, a, 0, min);
        }
    }

    /* renamed from: a */
    public void mo38368a(DataInputStream dataInputStream, int i) throws IOException {
        int min = Math.min(this.f30541a - this.f30544c, i);
        dataInputStream.readFully(this.f30542a, this.f30544c, min);
        int i2 = this.f30544c + min;
        this.f30544c = i2;
        if (this.f30545d < i2) {
            this.f30545d = i2;
        }
    }

    /* renamed from: b */
    public int mo38369b(byte[] bArr, int i) {
        int i2 = this.f30544c;
        int i3 = this.f30543b;
        int i4 = i2 - i3;
        if (i2 == this.f30541a) {
            this.f30544c = 0;
        }
        System.arraycopy(this.f30542a, i3, bArr, i, i4);
        this.f30543b = this.f30544c;
        return i4;
    }

    /* renamed from: c */
    public int mo38370c(int i) {
        int i2 = this.f30544c;
        int i3 = (i2 - i) - 1;
        if (i >= i2) {
            i3 += this.f30541a;
        }
        return this.f30542a[i3] & 255;
    }

    /* renamed from: d */
    public int mo38371d() {
        return this.f30544c;
    }

    /* renamed from: e */
    public boolean mo38372e() {
        return this.f30547f > 0;
    }

    /* renamed from: f */
    public boolean mo38373f() {
        return this.f30544c < this.f30546e;
    }

    /* renamed from: g */
    public void mo38374g(C4477aa aaVar) {
        aaVar.mo30489e(this.f30542a);
    }

    /* renamed from: h */
    public void mo38375h(byte b) {
        byte[] bArr = this.f30542a;
        int i = this.f30544c;
        int i2 = i + 1;
        this.f30544c = i2;
        bArr[i] = b;
        if (this.f30545d < i2) {
            this.f30545d = i2;
        }
    }

    /* renamed from: i */
    public void mo38376i(int i, int i2) throws IOException {
        int i3;
        int i4;
        if (i < 0 || i >= this.f30545d) {
            throw new s90();
        }
        int min = Math.min(this.f30546e - this.f30544c, i2);
        this.f30547f = i2 - min;
        this.f30548g = i;
        int i5 = this.f30544c;
        int i6 = (i5 - i) - 1;
        if (i >= i5) {
            i6 += this.f30541a;
        }
        do {
            byte[] bArr = this.f30542a;
            int i7 = this.f30544c;
            i4 = i7 + 1;
            this.f30544c = i4;
            int i8 = i3 + 1;
            bArr[i7] = bArr[i3];
            i3 = i8 == this.f30541a ? 0 : i8;
            min--;
        } while (min > 0);
        if (this.f30545d < i4) {
            this.f30545d = i4;
        }
    }

    /* renamed from: j */
    public void mo38377j() throws IOException {
        int i = this.f30547f;
        if (i > 0) {
            mo38376i(this.f30548g, i);
        }
    }

    /* renamed from: k */
    public void mo38378k() {
        this.f30543b = 0;
        this.f30544c = 0;
        this.f30545d = 0;
        this.f30546e = 0;
        this.f30542a[this.f30541a - 1] = 0;
    }

    /* renamed from: l */
    public void mo38379l(int i) {
        int i2 = this.f30541a;
        int i3 = this.f30544c;
        if (i2 - i3 <= i) {
            this.f30546e = i2;
        } else {
            this.f30546e = i3 + i;
        }
    }
}
