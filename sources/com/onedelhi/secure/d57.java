package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jspecify.nullness.NullMarked;

@NullMarked
public final class d57 {

    /* renamed from: a */
    public final h37 f10640a;

    /* renamed from: a */
    public final rv6 f10641a;

    /* renamed from: a */
    public final boolean f10642a;

    public d57(h37 h37, boolean z, rv6 rv6, int i) {
        this.f10640a = h37;
        this.f10642a = z;
        this.f10641a = rv6;
    }

    /* renamed from: c */
    public static d57 m12974c(rv6 rv6) {
        return new d57(new h37(rv6), false, bu6.f9981a, Integer.MAX_VALUE);
    }

    /* renamed from: b */
    public final d57 mo14533b() {
        return new d57(this.f10640a, true, this.f10641a, Integer.MAX_VALUE);
    }

    /* renamed from: d */
    public final Iterable mo14534d(CharSequence charSequence) {
        return new y37(this, charSequence);
    }

    /* renamed from: f */
    public final List mo14535f(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator h = mo14536h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add((String) h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    public final Iterator mo14536h(CharSequence charSequence) {
        return new q27(this.f10640a, this, charSequence);
    }
}
