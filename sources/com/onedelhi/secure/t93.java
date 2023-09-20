package com.onedelhi.secure;

import com.onedelhi.secure.ym3;
import java.util.concurrent.Executor;

public final class t93 implements o74, ji0 {

    /* renamed from: a */
    public final o74 f20709a;

    /* renamed from: a */
    public final ym3.C4016f f20710a;

    /* renamed from: a */
    public final Executor f20711a;

    public t93(@mr2 o74 o74, @mr2 ym3.C4016f fVar, @mr2 Executor executor) {
        this.f20709a = o74;
        this.f20710a = fVar;
        this.f20711a = executor;
    }

    /* renamed from: Z1 */
    public n74 mo13225Z1() {
        return new s93(this.f20709a.mo13225Z1(), this.f20710a, this.f20711a);
    }

    @mr2
    /* renamed from: a */
    public o74 mo13226a() {
        return this.f20709a;
    }

    public void close() {
        this.f20709a.close();
    }

    @ts2
    public String getDatabaseName() {
        return this.f20709a.getDatabaseName();
    }

    @sj3(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f20709a.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: x */
    public n74 mo13235x() {
        return new s93(this.f20709a.mo13235x(), this.f20710a, this.f20711a);
    }
}
