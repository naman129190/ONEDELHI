package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.C1173a;
import com.onedelhi.secure.C3131pa;
import com.onedelhi.secure.ej3;
import com.onedelhi.secure.gv4;
import com.onedelhi.secure.hp1;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.lh3;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.mj3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu0;
import com.onedelhi.secure.oh4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ze1;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.c */
public class C1182c extends ContextWrapper {
    @hw4

    /* renamed from: a */
    public static final oh4<?, ?> f6076a = new ze1();

    /* renamed from: a */
    public final int f6077a;

    /* renamed from: a */
    public final C1173a.C1174a f6078a;

    /* renamed from: a */
    public final C1183d f6079a;

    /* renamed from: a */
    public final hp1 f6080a;

    /* renamed from: a */
    public final lh3 f6081a;
    @mj1("this")
    @ts2

    /* renamed from: a */
    public mj3 f6082a;

    /* renamed from: a */
    public final nu0 f6083a;

    /* renamed from: a */
    public final C3131pa f6084a;

    /* renamed from: a */
    public final List<ej3<Object>> f6085a;

    /* renamed from: a */
    public final Map<Class<?>, oh4<?, ?>> f6086a;

    public C1182c(@mr2 Context context, @mr2 C3131pa paVar, @mr2 lh3 lh3, @mr2 hp1 hp1, @mr2 C1173a.C1174a aVar, @mr2 Map<Class<?>, oh4<?, ?>> map, @mr2 List<ej3<Object>> list, @mr2 nu0 nu0, @mr2 C1183d dVar, int i) {
        super(context.getApplicationContext());
        this.f6084a = paVar;
        this.f6081a = lh3;
        this.f6080a = hp1;
        this.f6078a = aVar;
        this.f6085a = list;
        this.f6086a = map;
        this.f6083a = nu0;
        this.f6079a = dVar;
        this.f6077a = i;
    }

    @mr2
    /* renamed from: a */
    public <X> gv4<ImageView, X> mo7493a(@mr2 ImageView imageView, @mr2 Class<X> cls) {
        return this.f6080a.mo17370a(imageView, cls);
    }

    @mr2
    /* renamed from: b */
    public C3131pa mo7494b() {
        return this.f6084a;
    }

    /* renamed from: c */
    public List<ej3<Object>> mo7495c() {
        return this.f6085a;
    }

    /* renamed from: d */
    public synchronized mj3 mo7496d() {
        if (this.f6082a == null) {
            this.f6082a = (mj3) this.f6078a.mo7470a().mo25186k0();
        }
        return this.f6082a;
    }

    @mr2
    /* renamed from: e */
    public <T> oh4<?, T> mo7497e(@mr2 Class<T> cls) {
        oh4<?, T> oh4 = this.f6086a.get(cls);
        if (oh4 == null) {
            for (Map.Entry next : this.f6086a.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    oh4 = (oh4) next.getValue();
                }
            }
        }
        return oh4 == null ? f6076a : oh4;
    }

    @mr2
    /* renamed from: f */
    public nu0 mo7498f() {
        return this.f6083a;
    }

    /* renamed from: g */
    public C1183d mo7499g() {
        return this.f6079a;
    }

    /* renamed from: h */
    public int mo7500h() {
        return this.f6077a;
    }

    @mr2
    /* renamed from: i */
    public lh3 mo7501i() {
        return this.f6081a;
    }
}
