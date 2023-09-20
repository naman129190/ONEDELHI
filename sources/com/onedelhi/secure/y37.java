package com.onedelhi.secure;

import java.io.IOException;
import java.util.Iterator;

public final class y37 implements Iterable {

    /* renamed from: a */
    public final /* synthetic */ d57 f22876a;

    /* renamed from: a */
    public final /* synthetic */ CharSequence f22877a;

    public y37(d57 d57, CharSequence charSequence) {
        this.f22876a = d57;
        this.f22877a = charSequence;
    }

    public final Iterator iterator() {
        return this.f22876a.mo14536h(this.f22877a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence a = cz6.m12869a(it.next(), ", ");
                while (true) {
                    sb.append(a);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(", ");
                    a = cz6.m12869a(it.next(), ", ");
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
