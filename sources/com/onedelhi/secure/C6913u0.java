package com.onedelhi.secure;

import com.onedelhi.secure.rd4;
import kotlin.Metadata;

@my0
@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H$J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/u0;", "Lcom/onedelhi/secure/de4;", "", "c", "Lcom/onedelhi/secure/rd4;", "a", "Lcom/onedelhi/secure/lq0;", "unit", "Lcom/onedelhi/secure/lq0;", "b", "()Lcom/onedelhi/secure/lq0;", "<init>", "(Lcom/onedelhi/secure/lq0;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.u0 */
public abstract class C6913u0 implements de4 {
    @vr2

    /* renamed from: a */
    public final lq0 f35856a;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/u0$a;", "Lcom/onedelhi/secure/rd4;", "Lcom/onedelhi/secure/fq0;", "d", "()J", "duration", "c", "(J)Lcom/onedelhi/secure/rd4;", "", "startedAt", "Lcom/onedelhi/secure/u0;", "timeSource", "offset", "<init>", "(JLcom/onedelhi/secure/u0;JLcom/onedelhi/secure/wg0;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.u0$a */
    public static final class C6914a implements rd4 {

        /* renamed from: a */
        public final long f35857a;
        @vr2

        /* renamed from: a */
        public final C6913u0 f35858a;

        /* renamed from: b */
        public final long f35859b;

        public C6914a(long j, C6913u0 u0Var, long j2) {
            this.f35857a = j;
            this.f35858a = u0Var;
            this.f35859b = j2;
        }

        public /* synthetic */ C6914a(long j, C6913u0 u0Var, long j2, wg0 wg0) {
            this(j, u0Var, j2);
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
            return new C6914a(this.f35857a, this.f35858a, fq0.m48279o0(this.f35859b, j), (wg0) null);
        }

        /* renamed from: d */
        public long mo34184d() {
            return fq0.m48278n0(iq0.m52557n0(this.f35858a.mo43830c() - this.f35857a, this.f35858a.mo45346b()), this.f35859b);
        }

        /* renamed from: e */
        public boolean mo34185e() {
            return rd4.C6681a.m63543a(this);
        }
    }

    public C6913u0(@vr2 lq0 lq0) {
        jt1.m53777p(lq0, "unit");
        this.f35856a = lq0;
    }

    @vr2
    /* renamed from: a */
    public rd4 mo34354a() {
        return new C6914a(mo43830c(), this, fq0.f28620a.mo36206W(), (wg0) null);
    }

    @vr2
    /* renamed from: b */
    public final lq0 mo45346b() {
        return this.f35856a;
    }

    /* renamed from: c */
    public abstract long mo43830c();
}
