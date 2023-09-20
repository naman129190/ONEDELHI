package com.onedelhi.secure;

import android.content.Intent;
import com.onedelhi.secure.us1;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public final class mf0 {

    /* renamed from: a */
    public static final Map<String, Set<C7363yi>> f32116a;

    /* renamed from: a */
    public static final Set<C7363yi> f32117a;

    /* renamed from: a */
    public static final Pattern f32118a = Pattern.compile(vf4.f36537c);

    /* renamed from: b */
    public static final Set<C7363yi> f32119b;

    /* renamed from: c */
    public static final Set<C7363yi> f32120c;

    /* renamed from: d */
    public static final Set<C7363yi> f32121d;

    /* renamed from: e */
    public static final Set<C7363yi> f32122e;

    /* renamed from: f */
    public static final Set<C7363yi> f32123f;

    /* renamed from: g */
    public static final Set<C7363yi> f32124g;

    static {
        EnumSet of = EnumSet.of(C7363yi.QR_CODE);
        f32121d = of;
        EnumSet of2 = EnumSet.of(C7363yi.DATA_MATRIX);
        f32122e = of2;
        EnumSet of3 = EnumSet.of(C7363yi.AZTEC);
        f32123f = of3;
        EnumSet of4 = EnumSet.of(C7363yi.PDF_417);
        f32124g = of4;
        EnumSet of5 = EnumSet.of(C7363yi.UPC_A, new C7363yi[]{C7363yi.UPC_E, C7363yi.EAN_13, C7363yi.EAN_8, C7363yi.RSS_14, C7363yi.RSS_EXPANDED});
        f32117a = of5;
        EnumSet of6 = EnumSet.of(C7363yi.CODE_39, C7363yi.CODE_93, C7363yi.CODE_128, C7363yi.ITF, C7363yi.CODABAR);
        f32119b = of6;
        EnumSet copyOf = EnumSet.copyOf(of5);
        f32120c = copyOf;
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f32116a = hashMap;
        hashMap.put(us1.C6979a.f36248d, copyOf);
        hashMap.put(us1.C6979a.f36247c, of5);
        hashMap.put(us1.C6979a.f36249e, of);
        hashMap.put(us1.C6979a.f36250f, of2);
        hashMap.put(us1.C6979a.f36251g, of3);
        hashMap.put(us1.C6979a.f36252h, of4);
    }

    /* renamed from: a */
    public static Set<C7363yi> m57090a(Intent intent) {
        String stringExtra = intent.getStringExtra(us1.C6979a.f36253i);
        return m57091b(stringExtra != null ? Arrays.asList(f32118a.split(stringExtra)) : null, intent.getStringExtra(us1.C6979a.f36245b));
    }

    /* renamed from: b */
    public static Set<C7363yi> m57091b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet<E> noneOf = EnumSet.noneOf(C7363yi.class);
            try {
                for (String valueOf : iterable) {
                    noneOf.add(C7363yi.valueOf(valueOf));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f32116a.get(str);
        }
        return null;
    }
}
