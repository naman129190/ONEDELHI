package com.onedelhi.secure;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class os3 implements Comparable<os3> {
    /* renamed from: b */
    public static os3 m59612b(String str, long j) {
        return new C5725ih(str, j);
    }

    /* renamed from: a */
    public int compareTo(os3 os3) {
        return mo38090e() < os3.mo38090e() ? -1 : 1;
    }

    /* renamed from: e */
    public abstract long mo38090e();

    /* renamed from: g */
    public abstract String mo38092g();
}
