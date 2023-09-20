package com.onedelhi.secure;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ih1 {

    /* renamed from: a */
    public static volatile ih1 f30334a;

    /* renamed from: a */
    public final Set<s22> f30335a = new HashSet();

    /* renamed from: a */
    public static ih1 m52278a() {
        ih1 ih1 = f30334a;
        if (ih1 == null) {
            synchronized (ih1.class) {
                ih1 = f30334a;
                if (ih1 == null) {
                    ih1 = new ih1();
                    f30334a = ih1;
                }
            }
        }
        return ih1;
    }

    /* renamed from: b */
    public Set<s22> mo38096b() {
        Set<s22> unmodifiableSet;
        synchronized (this.f30335a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f30335a);
        }
        return unmodifiableSet;
    }

    /* renamed from: c */
    public void mo38097c(String str, String str2) {
        synchronized (this.f30335a) {
            this.f30335a.add(s22.m64137a(str, str2));
        }
    }
}
