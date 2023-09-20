package com.onedelhi.secure;

public final class v25 {
    @ss2

    /* renamed from: a */
    public final String f36418a;

    public v25() {
        this((String) null, 1);
    }

    public v25(@ss2 String str) {
        this.f36418a = str;
    }

    public /* synthetic */ v25(String str, int i) {
        this((String) null);
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v25) && jt1.m53768g(this.f36418a, ((v25) obj).f36418a);
    }

    public int hashCode() {
        String str = this.f36418a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @vr2
    public String toString() {
        return "B2BPGScreenData(targetAppPackageName=" + this.f36418a + ')';
    }
}
