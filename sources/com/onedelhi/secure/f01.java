package com.onedelhi.secure;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/f01;", "Lcom/onedelhi/secure/ma1;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "close", "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "Lcom/onedelhi/secure/ec1;", "a", "()Lcom/onedelhi/secure/ec1;", "Lcom/onedelhi/secure/oz3;", "delegate", "<init>", "(Lcom/onedelhi/secure/oz3;Lcom/onedelhi/secure/ec1;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public class f01 extends ma1 {
    @vr2

    /* renamed from: a */
    public final ec1<IOException, un4> f28129a;

    /* renamed from: b */
    public boolean f28130b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f01(@vr2 oz3 oz3, @vr2 ec1<? super IOException, un4> ec1) {
        super(oz3);
        jt1.m53777p(oz3, "delegate");
        jt1.m53777p(ec1, "onException");
        this.f28129a = ec1;
    }

    @vr2
    /* renamed from: a */
    public final ec1<IOException, un4> mo35680a() {
        return this.f28129a;
    }

    public void close() {
        if (!this.f28130b) {
            try {
                super.close();
            } catch (IOException e) {
                this.f28130b = true;
                this.f28129a.mo17094X(e);
            }
        }
    }

    public void flush() {
        if (!this.f28130b) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f28130b = true;
                this.f28129a.mo17094X(e);
            }
        }
    }

    public void write(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "source");
        if (this.f28130b) {
            noVar.mo31670F1(j);
            return;
        }
        try {
            super.write(noVar, j);
        } catch (IOException e) {
            this.f28130b = true;
            this.f28129a.mo17094X(e);
        }
    }
}
