package com.onedelhi.secure;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

public class bm2<T> implements sg4<T> {

    /* renamed from: a */
    public final Collection<? extends sg4<T>> f9889a;

    public bm2(@mr2 Collection<? extends sg4<T>> collection) {
        if (!collection.isEmpty()) {
            this.f9889a = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @SafeVarargs
    public bm2(@mr2 sg4<T>... sg4Arr) {
        if (sg4Arr.length != 0) {
            this.f9889a = Arrays.asList(sg4Arr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        for (sg4 a : this.f9889a) {
            a.mo13311a(messageDigest);
        }
    }

    @mr2
    /* renamed from: b */
    public ck3<T> mo13753b(@mr2 Context context, @mr2 ck3<T> ck3, int i, int i2) {
        ck3<T> ck32 = ck3;
        for (sg4 b : this.f9889a) {
            ck3<T> b2 = b.mo13753b(context, ck32, i, i2);
            if (ck32 != null && !ck32.equals(ck3) && !ck32.equals(b2)) {
                ck32.mo13177a();
            }
            ck32 = b2;
        }
        return ck32;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bm2) {
            return this.f9889a.equals(((bm2) obj).f9889a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9889a.hashCode();
    }
}
