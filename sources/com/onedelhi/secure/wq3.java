package com.onedelhi.secure;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.onedelhi.secure.br3;
import com.onedelhi.secure.hl3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B\u001f\b\u0016\u0012\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010 ¢\u0006\u0004\b\"\u0010#B\t\b\u0016¢\u0006\u0004\b\"\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0007J \u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0002H\u0007J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J3\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/onedelhi/secure/wq3;", "", "Lcom/onedelhi/secure/br3$c;", "o", "", "key", "", "f", "T", "Lcom/onedelhi/secure/lm2;", "i", "initialValue", "j", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/onedelhi/secure/lm2;", "Lcom/onedelhi/secure/d34;", "l", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/onedelhi/secure/d34;", "", "m", "h", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "Lcom/onedelhi/secure/un4;", "q", "(Ljava/lang/String;Ljava/lang/Object;)V", "n", "provider", "r", "e", "hasInitialValue", "k", "(Ljava/lang/String;ZLjava/lang/Object;)Lcom/onedelhi/secure/lm2;", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "a", "b", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
public final class wq3 {
    @vr2

    /* renamed from: a */
    public static final C3869a f22242a = new C3869a((wg0) null);
    @vr2

    /* renamed from: a */
    public static final String f22243a = "values";
    @vr2

    /* renamed from: a */
    public static final Class<? extends Object>[] f22244a = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    @vr2

    /* renamed from: b */
    public static final String f22245b = "keys";
    @vr2

    /* renamed from: a */
    public final br3.C1803c f22246a;
    @vr2

    /* renamed from: a */
    public final Map<String, Object> f22247a;
    @vr2

    /* renamed from: b */
    public final Map<String, br3.C1803c> f22248b;
    @vr2

    /* renamed from: c */
    public final Map<String, C3870b<?>> f22249c;
    @vr2

    /* renamed from: d */
    public final Map<String, ym2<Object>> f22250d;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/wq3$a;", "", "Landroid/os/Bundle;", "restoredState", "defaultState", "Lcom/onedelhi/secure/wq3;", "a", "value", "", "b", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.wq3$a */
    public static final class C3869a {
        public C3869a() {
        }

        public /* synthetic */ C3869a(wg0 wg0) {
            this();
        }

        @zw1
        @hl3({hl3.C2354a.LIBRARY_GROUP})
        @vr2
        /* renamed from: a */
        public final wq3 mo26657a(@ss2 Bundle bundle, @ss2 Bundle bundle2) {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(wq3.f22243a);
                if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = parcelableArrayList.get(i);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                    }
                    return new wq3(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new wq3();
            } else {
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    jt1.m53776o(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new wq3(hashMap);
            }
        }

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        /* renamed from: b */
        public final boolean mo26658b(@ss2 Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : wq3.f22244a) {
                jt1.m53774m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/wq3$b;", "T", "Lcom/onedelhi/secure/lm2;", "value", "Lcom/onedelhi/secure/un4;", "q", "(Ljava/lang/Object;)V", "r", "Lcom/onedelhi/secure/wq3;", "handle", "", "key", "<init>", "(Lcom/onedelhi/secure/wq3;Ljava/lang/String;Ljava/lang/Object;)V", "(Lcom/onedelhi/secure/wq3;Ljava/lang/String;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.wq3$b */
    public static final class C3870b<T> extends lm2<T> {
        @ss2

        /* renamed from: a */
        public wq3 f22251a;
        @vr2

        /* renamed from: a */
        public String f22252a;

        public C3870b(@ss2 wq3 wq3, @vr2 String str) {
            jt1.m53777p(str, "key");
            this.f22252a = str;
            this.f22251a = wq3;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3870b(@ss2 wq3 wq3, @vr2 String str, T t) {
            super(t);
            jt1.m53777p(str, "key");
            this.f22252a = str;
            this.f22251a = wq3;
        }

        /* renamed from: q */
        public void mo4933q(T t) {
            wq3 wq3 = this.f22251a;
            if (wq3 != null) {
                wq3.f22247a.put(this.f22252a, t);
                ym2 ym2 = (ym2) wq3.f22250d.get(this.f22252a);
                if (ym2 != null) {
                    ym2.mo34788s(t);
                }
            }
            super.mo4933q(t);
        }

        /* renamed from: r */
        public final void mo26659r() {
            this.f22251a = null;
        }
    }

    public wq3() {
        this.f22247a = new LinkedHashMap();
        this.f22248b = new LinkedHashMap();
        this.f22249c = new LinkedHashMap();
        this.f22250d = new LinkedHashMap();
        this.f22246a = new vq3(this);
    }

    public wq3(@vr2 Map<String, ? extends Object> map) {
        jt1.m53777p(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f22247a = linkedHashMap;
        this.f22248b = new LinkedHashMap();
        this.f22249c = new LinkedHashMap();
        this.f22250d = new LinkedHashMap();
        this.f22246a = new vq3(this);
        linkedHashMap.putAll(map);
    }

    @zw1
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @vr2
    /* renamed from: g */
    public static final wq3 m31016g(@ss2 Bundle bundle, @ss2 Bundle bundle2) {
        return f22242a.mo26657a(bundle, bundle2);
    }

    /* renamed from: p */
    public static final Bundle m31017p(wq3 wq3) {
        jt1.m53777p(wq3, "this$0");
        for (Map.Entry next : id2.m52098F0(wq3.f22248b).entrySet()) {
            wq3.mo26655q((String) next.getKey(), ((br3.C1803c) next.getValue()).mo879a());
        }
        Set<String> keySet = wq3.f22247a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next2 : keySet) {
            arrayList.add(next2);
            arrayList2.add(wq3.f22247a.get(next2));
        }
        return C2357hq.m16893b(yi4.m71797a("keys", arrayList), yi4.m71797a(f22243a, arrayList2));
    }

    @bc2
    /* renamed from: e */
    public final void mo26645e(@vr2 String str) {
        jt1.m53777p(str, "key");
        this.f22248b.remove(str);
    }

    @bc2
    /* renamed from: f */
    public final boolean mo26646f(@vr2 String str) {
        jt1.m53777p(str, "key");
        return this.f22247a.containsKey(str);
    }

    @bc2
    @ss2
    /* renamed from: h */
    public final <T> T mo26647h(@vr2 String str) {
        jt1.m53777p(str, "key");
        return this.f22247a.get(str);
    }

    @bc2
    @vr2
    /* renamed from: i */
    public final <T> lm2<T> mo26648i(@vr2 String str) {
        jt1.m53777p(str, "key");
        return mo26650k(str, false, (Object) null);
    }

    @bc2
    @vr2
    /* renamed from: j */
    public final <T> lm2<T> mo26649j(@vr2 String str, T t) {
        jt1.m53777p(str, "key");
        return mo26650k(str, true, t);
    }

    /* renamed from: k */
    public final <T> lm2<T> mo26650k(String str, boolean z, T t) {
        C3870b bVar;
        C3870b<?> bVar2 = this.f22249c.get(str);
        lm2<T> lm2 = bVar2 instanceof lm2 ? bVar2 : null;
        if (lm2 != null) {
            return lm2;
        }
        if (this.f22247a.containsKey(str)) {
            bVar = new C3870b(this, str, this.f22247a.get(str));
        } else if (z) {
            this.f22247a.put(str, t);
            bVar = new C3870b(this, str, t);
        } else {
            bVar = new C3870b(this, str);
        }
        this.f22249c.put(str, bVar);
        return bVar;
    }

    @bc2
    @vr2
    /* renamed from: l */
    public final <T> d34<T> mo26651l(@vr2 String str, T t) {
        jt1.m53777p(str, "key");
        Map<String, ym2<Object>> map = this.f22250d;
        ym2<Object> ym2 = map.get(str);
        if (ym2 == null) {
            if (!this.f22247a.containsKey(str)) {
                this.f22247a.put(str, t);
            }
            ym2 = f34.m47561a(this.f22247a.get(str));
            this.f22250d.put(str, ym2);
            map.put(str, ym2);
        }
        return s81.m64369m(ym2);
    }

    @bc2
    @vr2
    /* renamed from: m */
    public final Set<String> mo26652m() {
        return iv3.m52701D(iv3.m52701D(this.f22247a.keySet(), this.f22248b.keySet()), this.f22249c.keySet());
    }

    @bc2
    @ss2
    /* renamed from: n */
    public final <T> T mo26653n(@vr2 String str) {
        jt1.m53777p(str, "key");
        T remove = this.f22247a.remove(str);
        C3870b remove2 = this.f22249c.remove(str);
        if (remove2 != null) {
            remove2.mo26659r();
        }
        this.f22250d.remove(str);
        return remove;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @vr2
    /* renamed from: o */
    public final br3.C1803c mo26654o() {
        return this.f22246a;
    }

    @bc2
    /* renamed from: q */
    public final <T> void mo26655q(@vr2 String str, @ss2 T t) {
        jt1.m53777p(str, "key");
        if (f22242a.mo26658b(t)) {
            C3870b<?> bVar = this.f22249c.get(str);
            lm2 lm2 = bVar instanceof lm2 ? bVar : null;
            if (lm2 != null) {
                lm2.mo4933q(t);
            } else {
                this.f22247a.put(str, t);
            }
            ym2 ym2 = this.f22250d.get(str);
            if (ym2 != null) {
                ym2.mo34788s(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        jt1.m53774m(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    @bc2
    /* renamed from: r */
    public final void mo26656r(@vr2 String str, @vr2 br3.C1803c cVar) {
        jt1.m53777p(str, "key");
        jt1.m53777p(cVar, "provider");
        this.f22248b.put(str, cVar);
    }
}
