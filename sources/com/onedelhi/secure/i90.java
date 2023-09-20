package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/onedelhi/secure/i90;", "Lcom/onedelhi/secure/sb4;", "", "Lcom/onedelhi/secure/m0;", "toString", "Lcom/onedelhi/secure/b90;", "context", "c1", "oldState", "Lcom/onedelhi/secure/un4;", "b1", "", "Q0", "id", "R0", "", "hashCode", "", "other", "", "equals", "J", "V0", "()J", "<init>", "(J)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
public final class i90 extends C6072m0 implements sb4<String> {
    @vr2

    /* renamed from: a */
    public static final C5668a f30122a = new C5668a((wg0) null);

    /* renamed from: b */
    public final long f30123b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/i90$a;", "Lcom/onedelhi/secure/b90$c;", "Lcom/onedelhi/secure/i90;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.i90$a */
    public static final class C5668a implements b90.C4636c<i90> {
        public C5668a() {
        }

        public /* synthetic */ C5668a(wg0 wg0) {
            this();
        }
    }

    public i90(long j) {
        super(f30122a);
        this.f30123b = j;
    }

    /* renamed from: S0 */
    public static /* synthetic */ i90 m51890S0(i90 i90, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = i90.f30123b;
        }
        return i90.mo37902R0(j);
    }

    /* renamed from: Q0 */
    public final long mo37901Q0() {
        return this.f30123b;
    }

    @vr2
    /* renamed from: R0 */
    public final i90 mo37902R0(long j) {
        return new i90(j);
    }

    /* renamed from: V0 */
    public final long mo37903V0() {
        return this.f30123b;
    }

    /* renamed from: b1 */
    public void mo37900M(@vr2 b90 b90, @vr2 String str) {
        Thread.currentThread().setName(str);
    }

    @vr2
    /* renamed from: c1 */
    public String mo37908p0(@vr2 b90 b90) {
        String V0;
        j90 j90 = (j90) b90.get(j90.f30592a);
        String str = "coroutine";
        if (!(j90 == null || (V0 = j90.mo38462V0()) == null)) {
            str = V0;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int F3 = u54.m66545F3(name, d90.f27280a, 0, false, 6, (Object) null);
        if (F3 < 0) {
            F3 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + F3 + 10);
        String substring = name.substring(0, F3);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(d90.f27280a);
        sb.append(str);
        sb.append('#');
        sb.append(mo37903V0());
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i90) && this.f30123b == ((i90) obj).f30123b;
    }

    public int hashCode() {
        return s80.m64248a(this.f30123b);
    }

    @vr2
    public String toString() {
        return "CoroutineId(" + this.f30123b + ')';
    }
}
