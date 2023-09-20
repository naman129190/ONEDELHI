package com.onedelhi.secure;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1195a;
import com.bumptech.glide.load.data.C1197b;
import com.onedelhi.secure.n33;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lh3 {

    /* renamed from: a */
    public static final String f15364a = "Gif";

    /* renamed from: b */
    public static final String f15365b = "Bitmap";

    /* renamed from: c */
    public static final String f15366c = "BitmapDrawable";

    /* renamed from: d */
    public static final String f15367d = "legacy_prepend_all";

    /* renamed from: e */
    public static final String f15368e = "legacy_append";

    /* renamed from: a */
    public final C1197b f15369a;

    /* renamed from: a */
    public final ap1 f15370a;

    /* renamed from: a */
    public final fu0 f15371a;

    /* renamed from: a */
    public final h62 f15372a = new h62();

    /* renamed from: a */
    public final jk3 f15373a;

    /* renamed from: a */
    public final n33.C2922a<List<Throwable>> f15374a;

    /* renamed from: a */
    public final ok3 f15375a;

    /* renamed from: a */
    public final qg4 f15376a;

    /* renamed from: a */
    public final tj2 f15377a;

    /* renamed from: a */
    public final uj2 f15378a = new uj2();

    /* renamed from: com.onedelhi.secure.lh3$a */
    public static class C2742a extends RuntimeException {
        public C2742a(@mr2 String str) {
            super(str);
        }
    }

    /* renamed from: com.onedelhi.secure.lh3$b */
    public static final class C2743b extends C2742a {
        public C2743b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.onedelhi.secure.lh3$c */
    public static class C2744c extends C2742a {
        public C2744c(@mr2 Class<?> cls, @mr2 Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public C2744c(@mr2 Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> C2744c(@mr2 M m, @mr2 List<rj2<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }
    }

    /* renamed from: com.onedelhi.secure.lh3$d */
    public static class C2745d extends C2742a {
        public C2745d(@mr2 Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: com.onedelhi.secure.lh3$e */
    public static class C2746e extends C2742a {
        public C2746e(@mr2 Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public lh3() {
        n33.C2922a<List<Throwable>> f = mz0.m22233f();
        this.f15374a = f;
        this.f15377a = new tj2(f);
        this.f15371a = new fu0();
        this.f15373a = new jk3();
        this.f15375a = new ok3();
        this.f15369a = new C1197b();
        this.f15376a = new qg4();
        this.f15370a = new ap1();
        mo19577z(Arrays.asList(new String[]{f15364a, f15365b, f15366c}));
    }

    @mr2
    /* renamed from: a */
    public <Data> lh3 mo19552a(@mr2 Class<Data> cls, @mr2 cu0<Data> cu0) {
        this.f15371a.mo16172a(cls, cu0);
        return this;
    }

    @mr2
    /* renamed from: b */
    public <TResource> lh3 mo19553b(@mr2 Class<TResource> cls, @mr2 nk3<TResource> nk3) {
        this.f15375a.mo21961a(cls, nk3);
        return this;
    }

    @mr2
    /* renamed from: c */
    public <Model, Data> lh3 mo19554c(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<Model, Data> sj2) {
        this.f15377a.mo25212a(cls, cls2, sj2);
        return this;
    }

    @mr2
    /* renamed from: d */
    public <Data, TResource> lh3 mo19555d(@mr2 Class<Data> cls, @mr2 Class<TResource> cls2, @mr2 ik3<Data, TResource> ik3) {
        mo19556e(f15368e, cls, cls2, ik3);
        return this;
    }

    @mr2
    /* renamed from: e */
    public <Data, TResource> lh3 mo19556e(@mr2 String str, @mr2 Class<Data> cls, @mr2 Class<TResource> cls2, @mr2 ik3<Data, TResource> ik3) {
        this.f15373a.mo18458a(str, ik3, cls, cls2);
        return this;
    }

    @mr2
    /* renamed from: f */
    public final <Data, TResource, Transcode> List<rf0<Data, TResource, Transcode>> mo19557f(@mr2 Class<Data> cls, @mr2 Class<TResource> cls2, @mr2 Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f15373a.mo18461d(cls, cls2)) {
            for (Class next2 : this.f15376a.mo23173b(next, cls3)) {
                arrayList.add(new rf0(cls, next, next2, this.f15373a.mo18459b(cls, next), this.f15376a.mo23172a(next, next2), this.f15374a));
            }
        }
        return arrayList;
    }

    @mr2
    /* renamed from: g */
    public List<ImageHeaderParser> mo19558g() {
        List<ImageHeaderParser> b = this.f15370a.mo13224b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new C2743b();
    }

    @ts2
    /* renamed from: h */
    public <Data, TResource, Transcode> g62<Data, TResource, Transcode> mo19559h(@mr2 Class<Data> cls, @mr2 Class<TResource> cls2, @mr2 Class<Transcode> cls3) {
        g62<Data, TResource, Transcode> a = this.f15372a.mo17074a(cls, cls2, cls3);
        if (this.f15372a.mo17076c(a)) {
            return null;
        }
        if (a == null) {
            List<rf0<Data, TResource, Transcode>> f = mo19557f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new g62<>(cls, cls2, cls3, f, this.f15374a);
            }
            this.f15372a.mo17077d(cls, cls2, cls3, a);
        }
        return a;
    }

    @mr2
    /* renamed from: i */
    public <Model> List<rj2<Model, ?>> mo19560i(@mr2 Model model) {
        return this.f15377a.mo25215e(model);
    }

    @mr2
    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo19561j(@mr2 Class<Model> cls, @mr2 Class<TResource> cls2, @mr2 Class<Transcode> cls3) {
        List<Class<?>> b = this.f15378a.mo25642b(cls, cls2, cls3);
        if (b == null) {
            b = new ArrayList<>();
            for (Class<?> d : this.f15377a.mo25214d(cls)) {
                for (Class next : this.f15373a.mo18461d(d, cls2)) {
                    if (!this.f15376a.mo23173b(next, cls3).isEmpty() && !b.contains(next)) {
                        b.add(next);
                    }
                }
            }
            this.f15378a.mo25643c(cls, cls2, cls3, Collections.unmodifiableList(b));
        }
        return b;
    }

    @mr2
    /* renamed from: k */
    public <X> nk3<X> mo19562k(@mr2 ck3<X> ck3) throws C2745d {
        nk3<X> b = this.f15375a.mo21962b(ck3.mo13180d());
        if (b != null) {
            return b;
        }
        throw new C2745d(ck3.mo13180d());
    }

    @mr2
    /* renamed from: l */
    public <X> C1195a<X> mo19563l(@mr2 X x) {
        return this.f15369a.mo7521a(x);
    }

    @mr2
    /* renamed from: m */
    public <X> cu0<X> mo19564m(@mr2 X x) throws C2746e {
        cu0<X> b = this.f15371a.mo16173b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new C2746e(x.getClass());
    }

    /* renamed from: n */
    public boolean mo19565n(@mr2 ck3<?> ck3) {
        return this.f15375a.mo21962b(ck3.mo13180d()) != null;
    }

    @mr2
    /* renamed from: o */
    public <Data> lh3 mo19566o(@mr2 Class<Data> cls, @mr2 cu0<Data> cu0) {
        this.f15371a.mo16174c(cls, cu0);
        return this;
    }

    @mr2
    /* renamed from: p */
    public <TResource> lh3 mo19567p(@mr2 Class<TResource> cls, @mr2 nk3<TResource> nk3) {
        this.f15375a.mo21963c(cls, nk3);
        return this;
    }

    @mr2
    /* renamed from: q */
    public <Model, Data> lh3 mo19568q(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<Model, Data> sj2) {
        this.f15377a.mo25217g(cls, cls2, sj2);
        return this;
    }

    @mr2
    /* renamed from: r */
    public <Data, TResource> lh3 mo19569r(@mr2 Class<Data> cls, @mr2 Class<TResource> cls2, @mr2 ik3<Data, TResource> ik3) {
        mo19570s(f15367d, cls, cls2, ik3);
        return this;
    }

    @mr2
    /* renamed from: s */
    public <Data, TResource> lh3 mo19570s(@mr2 String str, @mr2 Class<Data> cls, @mr2 Class<TResource> cls2, @mr2 ik3<Data, TResource> ik3) {
        this.f15373a.mo18462e(str, ik3, cls, cls2);
        return this;
    }

    @mr2
    /* renamed from: t */
    public lh3 mo19571t(@mr2 ImageHeaderParser imageHeaderParser) {
        this.f15370a.mo13223a(imageHeaderParser);
        return this;
    }

    @mr2
    /* renamed from: u */
    public lh3 mo19572u(@mr2 C1195a.C1196a<?> aVar) {
        this.f15369a.mo7522b(aVar);
        return this;
    }

    @mr2
    @Deprecated
    /* renamed from: v */
    public <Data> lh3 mo19573v(@mr2 Class<Data> cls, @mr2 cu0<Data> cu0) {
        return mo19552a(cls, cu0);
    }

    @mr2
    @Deprecated
    /* renamed from: w */
    public <TResource> lh3 mo19574w(@mr2 Class<TResource> cls, @mr2 nk3<TResource> nk3) {
        return mo19553b(cls, nk3);
    }

    @mr2
    /* renamed from: x */
    public <TResource, Transcode> lh3 mo19575x(@mr2 Class<TResource> cls, @mr2 Class<Transcode> cls2, @mr2 xk3<TResource, Transcode> xk3) {
        this.f15376a.mo23174c(cls, cls2, xk3);
        return this;
    }

    @mr2
    /* renamed from: y */
    public <Model, Data> lh3 mo19576y(@mr2 Class<Model> cls, @mr2 Class<Data> cls2, @mr2 sj2<? extends Model, ? extends Data> sj2) {
        this.f15377a.mo25219i(cls, cls2, sj2);
        return this;
    }

    @mr2
    /* renamed from: z */
    public final lh3 mo19577z(@mr2 List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(f15367d);
        for (String add : list) {
            arrayList.add(add);
        }
        arrayList.add(f15368e);
        this.f15373a.mo18463f(arrayList);
        return this;
    }
}
