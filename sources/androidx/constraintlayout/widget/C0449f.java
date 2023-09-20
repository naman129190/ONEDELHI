package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.widget.f */
public class C0449f {

    /* renamed from: a */
    public static final int f3160a = -1;

    /* renamed from: a */
    public SparseIntArray f3161a = new SparseIntArray();

    /* renamed from: a */
    public HashMap<Integer, HashSet<WeakReference<C0450a>>> f3162a = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.f$a */
    public interface C0450a {
        /* renamed from: a */
        void mo3061a(int i, int i2, int i3);
    }

    /* renamed from: a */
    public void mo3555a(int i, C0450a aVar) {
        HashSet hashSet = this.f3162a.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f3162a.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }

    /* renamed from: b */
    public void mo3556b() {
        this.f3162a.clear();
    }

    /* renamed from: c */
    public void mo3557c(int i, int i2) {
        int i3 = this.f3161a.get(i, -1);
        if (i3 != i2) {
            this.f3161a.put(i, i2);
            HashSet hashSet = this.f3162a.get(Integer.valueOf(i));
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    C0450a aVar = (C0450a) ((WeakReference) it.next()).get();
                    if (aVar != null) {
                        aVar.mo3061a(i, i2, i3);
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        WeakReference weakReference = (WeakReference) it2.next();
                        if (((C0450a) weakReference.get()) == null) {
                            arrayList.add(weakReference);
                        }
                    }
                    hashSet.removeAll(arrayList);
                }
            }
        }
    }

    /* renamed from: d */
    public int mo3558d(int i) {
        return this.f3161a.get(i, -1);
    }

    /* renamed from: e */
    public void mo3559e(int i, C0450a aVar) {
        HashSet hashSet = this.f3162a.get(Integer.valueOf(i));
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0450a aVar2 = (C0450a) weakReference.get();
                if (aVar2 == null || aVar2 == aVar) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    /* renamed from: f */
    public void mo3560f(C0450a aVar) {
        for (Integer intValue : this.f3162a.keySet()) {
            mo3559e(intValue.intValue(), aVar);
        }
    }
}
