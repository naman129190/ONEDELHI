package com.onedelhi.secure;

import com.onedelhi.secure.rd4;
import kotlin.Metadata;

@my0
@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H$J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/p0;", "Lcom/onedelhi/secure/de4;", "", "c", "Lcom/onedelhi/secure/rd4;", "a", "Lcom/onedelhi/secure/lq0;", "unit", "Lcom/onedelhi/secure/lq0;", "b", "()Lcom/onedelhi/secure/lq0;", "<init>", "(Lcom/onedelhi/secure/lq0;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.p0 */
public abstract class C6354p0 implements de4 {
    @vr2

    /* renamed from: a */
    public final lq0 f33399a;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/p0$a;", "Lcom/onedelhi/secure/rd4;", "Lcom/onedelhi/secure/fq0;", "d", "()J", "duration", "c", "(J)Lcom/onedelhi/secure/rd4;", "", "startedAt", "Lcom/onedelhi/secure/p0;", "timeSource", "offset", "<init>", "(DLcom/onedelhi/secure/p0;JLcom/onedelhi/secure/wg0;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.p0$a */
    public static final class C6355a implements rd4 {

        /* renamed from: a */
        public final double f33400a;

        /* renamed from: a */
        public final long f33401a;
        @vr2

        /* renamed from: a */
        public final C6354p0 f33402a;

        public C6355a(double d, C6354p0 p0Var, long j) {
            this.f33400a = d;
            this.f33402a = p0Var;
            this.f33401a = j;
        }

        public /* synthetic */ C6355a(double d, C6354p0 p0Var, long j, wg0 wg0) {
            this(d, p0Var, j);
        }

        /* renamed from: a */
        public boolean mo34181a() {
            return rd4.C6681a.m63544b(this);
        }

        @vr2
        /* renamed from: b */
        public rd4 mo34182b(long j) {
            return rd4.C6681a.m63545c(this, j);
        }

        @vr2
        /* renamed from: c */
        public rd4 mo34183c(long j) {
            return new C6355a(this.f33400a, this.f33402a, fq0.m48279o0(this.f33401a, j), (wg0) null);
        }

        /* renamed from: d */
        public long mo34184d() {
            return fq0.m48278n0(iq0.m52553l0(this.f33402a.mo42321c() - this.f33400a, this.f33402a.mo42320b()), this.f33401a);
        }

        /* renamed from: e */
        public boolean mo34185e() {
            return rd4.C6681a.m63543a(this);
        }
    }

    public C6354p0(@vr2 lq0 lq0) {
        jt1.m53777p(lq0, "unit");
        this.f33399a = lq0;
    }

    @vr2
    /* renamed from: a */
    public rd4 mo34354a() {
        return new C6355a(mo42321c(), this, fq0.f28620a.mo36206W(), (wg0) null);
    }

    @vr2
    /* renamed from: b */
    public final lq0 mo42320b() {
        return this.f33399a;
    }

    /* renamed from: c */
    public abstract double mo42321c();
}
