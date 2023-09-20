package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\\\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J&\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J`\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0011\u0010 \u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/onedelhi/secure/k20;", "", "Lcom/onedelhi/secure/ju;", "cont", "", "cause", "Lcom/onedelhi/secure/un4;", "i", "a", "Lcom/onedelhi/secure/au;", "b", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "c", "d", "e", "result", "cancelHandler", "onCancellation", "idempotentResume", "cancelCause", "f", "", "toString", "", "hashCode", "other", "", "equals", "h", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lcom/onedelhi/secure/au;Lcom/onedelhi/secure/ec1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class k20 {
    @rw1
    @ss2

    /* renamed from: a */
    public final C4592au f31079a;
    @rw1
    @ss2

    /* renamed from: a */
    public final ec1<Throwable, un4> f31080a;
    @rw1
    @ss2

    /* renamed from: a */
    public final Object f31081a;
    @rw1
    @ss2

    /* renamed from: a */
    public final Throwable f31082a;
    @rw1
    @ss2

    /* renamed from: b */
    public final Object f31083b;

    public k20(@ss2 Object obj, @ss2 C4592au auVar, @ss2 ec1<? super Throwable, un4> ec1, @ss2 Object obj2, @ss2 Throwable th) {
        this.f31081a = obj;
        this.f31079a = auVar;
        this.f31080a = ec1;
        this.f31083b = obj2;
        this.f31082a = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k20(Object obj, C4592au auVar, ec1 ec1, Object obj2, Throwable th, int i, wg0 wg0) {
        this(obj, (i & 2) != 0 ? null : auVar, (i & 4) != 0 ? null : ec1, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    /* renamed from: g */
    public static /* synthetic */ k20 m54009g(k20 k20, Object obj, C4592au auVar, ec1<Throwable, un4> ec1, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = k20.f31081a;
        }
        if ((i & 2) != 0) {
            auVar = k20.f31079a;
        }
        C4592au auVar2 = auVar;
        if ((i & 4) != 0) {
            ec1 = k20.f31080a;
        }
        ec1<Throwable, un4> ec12 = ec1;
        if ((i & 8) != 0) {
            obj2 = k20.f31083b;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = k20.f31082a;
        }
        return k20.mo39011f(obj, auVar2, ec12, obj4, th);
    }

    @ss2
    /* renamed from: a */
    public final Object mo39005a() {
        return this.f31081a;
    }

    @ss2
    /* renamed from: b */
    public final C4592au mo39006b() {
        return this.f31079a;
    }

    @ss2
    /* renamed from: c */
    public final ec1<Throwable, un4> mo39007c() {
        return this.f31080a;
    }

    @ss2
    /* renamed from: d */
    public final Object mo39008d() {
        return this.f31083b;
    }

    @ss2
    /* renamed from: e */
    public final Throwable mo39009e() {
        return this.f31082a;
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k20)) {
            return false;
        }
        k20 k20 = (k20) obj;
        return jt1.m53768g(this.f31081a, k20.f31081a) && jt1.m53768g(this.f31079a, k20.f31079a) && jt1.m53768g(this.f31080a, k20.f31080a) && jt1.m53768g(this.f31083b, k20.f31083b) && jt1.m53768g(this.f31082a, k20.f31082a);
    }

    @vr2
    /* renamed from: f */
    public final k20 mo39011f(@ss2 Object obj, @ss2 C4592au auVar, @ss2 ec1<? super Throwable, un4> ec1, @ss2 Object obj2, @ss2 Throwable th) {
        return new k20(obj, auVar, ec1, obj2, th);
    }

    /* renamed from: h */
    public final boolean mo39012h() {
        return this.f31082a != null;
    }

    public int hashCode() {
        Object obj = this.f31081a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C4592au auVar = this.f31079a;
        int hashCode2 = (hashCode + (auVar == null ? 0 : auVar.hashCode())) * 31;
        ec1<Throwable, un4> ec1 = this.f31080a;
        int hashCode3 = (hashCode2 + (ec1 == null ? 0 : ec1.hashCode())) * 31;
        Object obj2 = this.f31083b;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f31082a;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final void mo39014i(@vr2 C5847ju<?> juVar, @vr2 Throwable th) {
        C4592au auVar = this.f31079a;
        if (auVar != null) {
            juVar.mo38901p(auVar, th);
        }
        ec1<Throwable, un4> ec1 = this.f31080a;
        if (ec1 != null) {
            juVar.mo38904s(ec1, th);
        }
    }

    @vr2
    public String toString() {
        return "CompletedContinuation(result=" + this.f31081a + ", cancelHandler=" + this.f31079a + ", onCancellation=" + this.f31080a + ", idempotentResume=" + this.f31083b + ", cancelCause=" + this.f31082a + ')';
    }
}
