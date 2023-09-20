package com.onedelhi.secure;

public class nh2 implements h70 {

    /* renamed from: a */
    public final C2980a f17428a;

    /* renamed from: a */
    public final String f17429a;

    /* renamed from: a */
    public final boolean f17430a;

    /* renamed from: com.onedelhi.secure.nh2$a */
    public enum C2980a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: a */
        public static C2980a m22818a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public nh2(String str, C2980a aVar, boolean z) {
        this.f17429a = str;
        this.f17428a = aVar;
        this.f17430a = z;
    }

    @ts2
    /* renamed from: a */
    public y60 mo13850a(qa2 qa2, C2861mj mjVar) {
        if (qa2.mo23030r()) {
            return new oh2(this);
        }
        p92.m24544e("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public C2980a mo21270b() {
        return this.f17428a;
    }

    /* renamed from: c */
    public String mo21271c() {
        return this.f17429a;
    }

    /* renamed from: d */
    public boolean mo21272d() {
        return this.f17430a;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f17428a + '}';
    }
}
