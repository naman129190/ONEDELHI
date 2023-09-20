package com.onedelhi.secure;

import java.util.Iterator;
import java.util.Map;

public final class nc6 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ zc6 f17320a;

    /* renamed from: a */
    public Iterator f17321a;

    /* renamed from: b */
    public boolean f17322b;

    /* renamed from: n */
    public int f17323n = -1;

    public /* synthetic */ nc6(zc6 zc6, kc6 kc6) {
        this.f17320a = zc6;
    }

    /* renamed from: a */
    public final Iterator mo21147a() {
        if (this.f17321a == null) {
            this.f17321a = this.f17320a.f23571a.entrySet().iterator();
        }
        return this.f17321a;
    }

    public final boolean hasNext() {
        if (this.f17323n + 1 >= this.f17320a.f23570a.size()) {
            return !this.f17320a.f23571a.isEmpty() && mo21147a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f17322b = true;
        int i = this.f17323n + 1;
        this.f17323n = i;
        return (Map.Entry) (i < this.f17320a.f23570a.size() ? this.f17320a.f23570a.get(this.f17323n) : mo21147a().next());
    }

    public final void remove() {
        if (this.f17322b) {
            this.f17322b = false;
            this.f17320a.mo27937r();
            if (this.f17323n < this.f17320a.f23570a.size()) {
                zc6 zc6 = this.f17320a;
                int i = this.f17323n;
                this.f17323n = i - 1;
                Object unused = zc6.mo27934p(i);
                return;
            }
            mo21147a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
