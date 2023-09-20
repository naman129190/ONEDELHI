package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class z14 {

    /* renamed from: a */
    public final ArrayList<Object> f38197a;

    public z14(int i) {
        this.f38197a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void mo48115a(Object obj) {
        this.f38197a.add(obj);
    }

    /* renamed from: b */
    public void mo48116b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f38197a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f38197a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f38197a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f38197a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f38197a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    /* renamed from: c */
    public int mo48117c() {
        return this.f38197a.size();
    }

    /* renamed from: d */
    public Object[] mo48118d(Object[] objArr) {
        return this.f38197a.toArray(objArr);
    }
}
