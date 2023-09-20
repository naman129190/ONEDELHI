package com.onedelhi.secure;

public final class s15 {
    @ss2

    /* renamed from: a */
    public final Integer f34895a;
    @ss2

    /* renamed from: a */
    public final String f34896a;

    public s15() {
        this((Integer) null, (String) null, 3);
    }

    public s15(@ss2 Integer num, @ss2 String str) {
        this.f34895a = num;
        this.f34896a = str;
    }

    public /* synthetic */ s15(Integer num, String str, int i) {
        this((Integer) null, (String) null);
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s15)) {
            return false;
        }
        s15 s15 = (s15) obj;
        return jt1.m53768g(this.f34895a, s15.f34895a) && jt1.m53768g(this.f34896a, s15.f34896a);
    }

    public int hashCode() {
        Integer num = this.f34895a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f34896a;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @vr2
    public String toString() {
        return "B2BPGError(errorCode=" + this.f34895a + ", message=" + this.f34896a + ')';
    }
}
