package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/j90;", "Lcom/onedelhi/secure/m0;", "", "toString", "Q0", "name", "R0", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "V0", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class j90 extends C6072m0 {
    @vr2

    /* renamed from: a */
    public static final C5766a f30592a = new C5766a((wg0) null);
    @vr2

    /* renamed from: b */
    public final String f30593b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/j90$a;", "Lcom/onedelhi/secure/b90$c;", "Lcom/onedelhi/secure/j90;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.j90$a */
    public static final class C5766a implements b90.C4636c<j90> {
        public C5766a() {
        }

        public /* synthetic */ C5766a(wg0 wg0) {
            this();
        }
    }

    public j90(@vr2 String str) {
        super(f30592a);
        this.f30593b = str;
    }

    /* renamed from: S0 */
    public static /* synthetic */ j90 m52970S0(j90 j90, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = j90.f30593b;
        }
        return j90.mo38461R0(str);
    }

    @vr2
    /* renamed from: Q0 */
    public final String mo38460Q0() {
        return this.f30593b;
    }

    @vr2
    /* renamed from: R0 */
    public final j90 mo38461R0(@vr2 String str) {
        return new j90(str);
    }

    @vr2
    /* renamed from: V0 */
    public final String mo38462V0() {
        return this.f30593b;
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j90) && jt1.m53768g(this.f30593b, ((j90) obj).f30593b);
    }

    public int hashCode() {
        return this.f30593b.hashCode();
    }

    @vr2
    public String toString() {
        return "CoroutineName(" + this.f30593b + ')';
    }
}
