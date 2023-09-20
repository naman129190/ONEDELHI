package com.onedelhi.secure;

public final class n15 {
    @ss2

    /* renamed from: a */
    public final a35 f32339a;
    @ss2

    /* renamed from: a */
    public final s15 f32340a;
    @ss2

    /* renamed from: a */
    public final v25 f32341a;

    public n15() {
        this((a35) null, (v25) null, (s15) null, 7);
    }

    public n15(@ss2 a35 a35, @ss2 v25 v25, @ss2 s15 s15) {
        this.f32339a = a35;
        this.f32341a = v25;
        this.f32340a = s15;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n15(a35 a35, v25 v25, s15 s15, int i) {
        this((i & 1) != 0 ? null : a35, (i & 2) != 0 ? null : v25, (i & 4) != 0 ? null : s15);
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n15)) {
            return false;
        }
        n15 n15 = (n15) obj;
        return jt1.m53768g(this.f32339a, n15.f32339a) && jt1.m53768g(this.f32341a, n15.f32341a) && jt1.m53768g(this.f32340a, n15.f32340a);
    }

    public int hashCode() {
        a35 a35 = this.f32339a;
        int i = 0;
        int hashCode = (a35 == null ? 0 : a35.hashCode()) * 31;
        v25 v25 = this.f32341a;
        int hashCode2 = (hashCode + (v25 == null ? 0 : v25.hashCode())) * 31;
        s15 s15 = this.f32340a;
        if (s15 != null) {
            i = s15.hashCode();
        }
        return hashCode2 + i;
    }

    @vr2
    public String toString() {
        return "B2BPGResponseWrapper(b2BPGResponse=" + this.f32339a + ", screenData=" + this.f32341a + ", error=" + this.f32340a + ')';
    }
}
