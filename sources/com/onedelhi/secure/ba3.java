package com.onedelhi.secure;

import com.onedelhi.secure.ym3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class ba3 implements s74 {

    /* renamed from: a */
    public final s74 f9779a;

    /* renamed from: a */
    public final ym3.C4016f f9780a;

    /* renamed from: a */
    public final List<Object> f9781a = new ArrayList();

    /* renamed from: a */
    public final Executor f9782a;

    /* renamed from: b */
    public final String f9783b;

    public ba3(@mr2 s74 s74, @mr2 ym3.C4016f fVar, String str, @mr2 Executor executor) {
        this.f9779a = s74;
        this.f9780a = fVar;
        this.f9783b = str;
        this.f9782a = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m11760h() {
        this.f9780a.mo27645a(this.f9783b, this.f9781a);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m11761l() {
        this.f9780a.mo27645a(this.f9783b, this.f9781a);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m11762m() {
        this.f9780a.mo27645a(this.f9783b, this.f9781a);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m11763p() {
        this.f9780a.mo27645a(this.f9783b, this.f9781a);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m11764q() {
        this.f9780a.mo27645a(this.f9783b, this.f9781a);
    }

    /* renamed from: A */
    public final void mo13594A(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.f9781a.size()) {
            for (int size = this.f9781a.size(); size <= i2; size++) {
                this.f9781a.add((Object) null);
            }
        }
        this.f9781a.set(i2, obj);
    }

    /* renamed from: A2 */
    public long mo13595A2() {
        this.f9782a.execute(new aa3(this));
        return this.f9779a.mo13595A2();
    }

    /* renamed from: B2 */
    public void mo13596B2(int i, long j) {
        mo13594A(i, Long.valueOf(j));
        this.f9779a.mo13596B2(i, j);
    }

    /* renamed from: F2 */
    public long mo13597F2() {
        this.f9782a.execute(new y93(this));
        return this.f9779a.mo13597F2();
    }

    /* renamed from: I2 */
    public void mo13598I2() {
        this.f9781a.clear();
        this.f9779a.mo13598I2();
    }

    /* renamed from: J0 */
    public void mo13599J0(int i) {
        mo13594A(i, this.f9781a.toArray());
        this.f9779a.mo13599J0(i);
    }

    /* renamed from: P1 */
    public void mo13600P1(int i, double d) {
        mo13594A(i, Double.valueOf(d));
        this.f9779a.mo13600P1(i, d);
    }

    /* renamed from: a1 */
    public int mo13601a1() {
        this.f9782a.execute(new z93(this));
        return this.f9779a.mo13601a1();
    }

    public void close() throws IOException {
        this.f9779a.close();
    }

    /* renamed from: i0 */
    public String mo13603i0() {
        this.f9782a.execute(new w93(this));
        return this.f9779a.mo13603i0();
    }

    /* renamed from: m1 */
    public void mo13604m1() {
        this.f9782a.execute(new x93(this));
        this.f9779a.mo13604m1();
    }

    /* renamed from: m2 */
    public void mo13605m2(int i, String str) {
        mo13594A(i, str);
        this.f9779a.mo13605m2(i, str);
    }

    /* renamed from: w */
    public void mo13606w(int i, byte[] bArr) {
        mo13594A(i, bArr);
        this.f9779a.mo13606w(i, bArr);
    }
}
