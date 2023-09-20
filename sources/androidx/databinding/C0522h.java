package androidx.databinding;

import androidx.databinding.C0525j;
import com.onedelhi.secure.C3042oa;
import java.util.Collection;

/* renamed from: androidx.databinding.h */
public class C0522h<K, V> extends C3042oa<K, V> implements C0525j<K, V> {

    /* renamed from: a */
    public transient C0517e f3441a;

    /* renamed from: a */
    public void mo4012a(C0525j.C0526a<? extends C0525j<K, V>, K, V> aVar) {
        if (this.f3441a == null) {
            this.f3441a = new C0517e();
        }
        this.f3441a.mo3974a(aVar);
    }

    /* renamed from: b */
    public void mo4013b(C0525j.C0526a<? extends C0525j<K, V>, K, V> aVar) {
        C0517e eVar = this.f3441a;
        if (eVar != null) {
            eVar.mo3987m(aVar);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            super.clear();
            mo4020v((Object) null);
        }
    }

    /* renamed from: o */
    public V mo4015o(int i) {
        Object m = mo25350m(i);
        V o = super.mo4015o(i);
        if (o != null) {
            mo4020v(m);
        }
        return o;
    }

    /* renamed from: p */
    public V mo4016p(int i, V v) {
        Object m = mo25350m(i);
        V p = super.mo4016p(i, v);
        mo4020v(m);
        return p;
    }

    public V put(K k, V v) {
        super.put(k, v);
        mo4020v(k);
        return v;
    }

    /* renamed from: t */
    public boolean mo4018t(Collection<?> collection) {
        boolean z = false;
        for (Object i : collection) {
            int i2 = mo25346i(i);
            if (i2 >= 0) {
                z = true;
                mo4015o(i2);
            }
        }
        return z;
    }

    /* renamed from: u */
    public boolean mo4019u(Collection<?> collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(mo25350m(size))) {
                mo4015o(size);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: v */
    public final void mo4020v(Object obj) {
        C0517e eVar = this.f3441a;
        if (eVar != null) {
            eVar.mo3982h(this, 0, obj);
        }
    }
}
