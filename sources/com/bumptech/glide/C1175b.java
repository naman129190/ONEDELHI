package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import com.bumptech.glide.C1173a;
import com.bumptech.glide.C1183d;
import com.onedelhi.secure.C2355hm;
import com.onedelhi.secure.C2451im;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.C3131pa;
import com.onedelhi.secure.ej3;
import com.onedelhi.secure.g43;
import com.onedelhi.secure.hj3;
import com.onedelhi.secure.im0;
import com.onedelhi.secure.jb2;
import com.onedelhi.secure.kb2;
import com.onedelhi.secure.mj3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu0;
import com.onedelhi.secure.oh4;
import com.onedelhi.secure.pb2;
import com.onedelhi.secure.rg2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vg0;
import com.onedelhi.secure.y50;
import com.onedelhi.secure.yg2;
import com.onedelhi.secure.ys1;
import com.onedelhi.secure.zg1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.b */
public final class C1175b {

    /* renamed from: a */
    public int f6055a = 4;

    /* renamed from: a */
    public C1173a.C1174a f6056a = new C1176a();

    /* renamed from: a */
    public final C1183d.C1184a f6057a = new C1183d.C1184a();
    @ts2

    /* renamed from: a */
    public hj3.C2353b f6058a;

    /* renamed from: a */
    public C2355hm f6059a;

    /* renamed from: a */
    public im0.C2452a f6060a;

    /* renamed from: a */
    public nu0 f6061a;

    /* renamed from: a */
    public C3131pa f6062a;

    /* renamed from: a */
    public rg2 f6063a;

    /* renamed from: a */
    public y50 f6064a;

    /* renamed from: a */
    public yg2 f6065a;

    /* renamed from: a */
    public zg1 f6066a;
    @ts2

    /* renamed from: a */
    public List<ej3<Object>> f6067a;

    /* renamed from: a */
    public final Map<Class<?>, oh4<?, ?>> f6068a = new C3042oa();

    /* renamed from: a */
    public boolean f6069a;

    /* renamed from: b */
    public zg1 f6070b;

    /* renamed from: c */
    public zg1 f6071c;

    /* renamed from: com.bumptech.glide.b$a */
    public class C1176a implements C1173a.C1174a {
        public C1176a() {
        }

        @mr2
        /* renamed from: a */
        public mj3 mo7470a() {
            return new mj3();
        }
    }

    /* renamed from: com.bumptech.glide.b$b */
    public class C1177b implements C1173a.C1174a {

        /* renamed from: a */
        public final /* synthetic */ mj3 f6074a;

        public C1177b(mj3 mj3) {
            this.f6074a = mj3;
        }

        @mr2
        /* renamed from: a */
        public mj3 mo7470a() {
            mj3 mj3 = this.f6074a;
            return mj3 != null ? mj3 : new mj3();
        }
    }

    /* renamed from: com.bumptech.glide.b$c */
    public static final class C1178c implements C1183d.C1185b {
    }

    /* renamed from: com.bumptech.glide.b$d */
    public static final class C1179d implements C1183d.C1185b {
    }

    /* renamed from: com.bumptech.glide.b$e */
    public static final class C1180e implements C1183d.C1185b {

        /* renamed from: a */
        public final int f6075a;

        public C1180e(int i) {
            this.f6075a = i;
        }
    }

    /* renamed from: com.bumptech.glide.b$f */
    public static final class C1181f implements C1183d.C1185b {
    }

    @mr2
    /* renamed from: a */
    public C1175b mo7471a(@mr2 ej3<Object> ej3) {
        if (this.f6067a == null) {
            this.f6067a = new ArrayList();
        }
        this.f6067a.add(ej3);
        return this;
    }

    @mr2
    /* renamed from: b */
    public C1173a mo7472b(@mr2 Context context) {
        if (this.f6066a == null) {
            this.f6066a = zg1.m33125j();
        }
        if (this.f6070b == null) {
            this.f6070b = zg1.m33121f();
        }
        if (this.f6071c == null) {
            this.f6071c = zg1.m33118c();
        }
        if (this.f6065a == null) {
            this.f6065a = new yg2.C4000a(context).mo27480a();
        }
        if (this.f6064a == null) {
            this.f6064a = new vg0();
        }
        if (this.f6059a == null) {
            int b = this.f6065a.mo27477b();
            if (b > 0) {
                this.f6059a = new kb2((long) b);
            } else {
                this.f6059a = new C2451im();
            }
        }
        if (this.f6062a == null) {
            this.f6062a = new jb2(this.f6065a.mo27476a());
        }
        if (this.f6063a == null) {
            this.f6063a = new pb2((long) this.f6065a.mo27478d());
        }
        if (this.f6060a == null) {
            this.f6060a = new ys1(context);
        }
        if (this.f6061a == null) {
            this.f6061a = new nu0(this.f6063a, this.f6060a, this.f6070b, this.f6066a, zg1.m33128m(), this.f6071c, this.f6069a);
        }
        List<ej3<Object>> list = this.f6067a;
        this.f6067a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        C1183d c = this.f6057a.mo7505c();
        return new C1173a(context, this.f6061a, this.f6063a, this.f6059a, this.f6062a, new hj3(this.f6058a, c), this.f6064a, this.f6055a, this.f6056a, this.f6068a, this.f6067a, c);
    }

    @mr2
    /* renamed from: c */
    public C1175b mo7473c(@ts2 zg1 zg1) {
        this.f6071c = zg1;
        return this;
    }

    @mr2
    /* renamed from: d */
    public C1175b mo7474d(@ts2 C3131pa paVar) {
        this.f6062a = paVar;
        return this;
    }

    @mr2
    /* renamed from: e */
    public C1175b mo7475e(@ts2 C2355hm hmVar) {
        this.f6059a = hmVar;
        return this;
    }

    @mr2
    /* renamed from: f */
    public C1175b mo7476f(@ts2 y50 y50) {
        this.f6064a = y50;
        return this;
    }

    @mr2
    /* renamed from: g */
    public C1175b mo7477g(@mr2 C1173a.C1174a aVar) {
        this.f6056a = (C1173a.C1174a) g43.m15509d(aVar);
        return this;
    }

    @mr2
    /* renamed from: h */
    public C1175b mo7478h(@ts2 mj3 mj3) {
        return mo7477g(new C1177b(mj3));
    }

    @mr2
    /* renamed from: i */
    public <T> C1175b mo7479i(@mr2 Class<T> cls, @ts2 oh4<?, T> oh4) {
        this.f6068a.put(cls, oh4);
        return this;
    }

    @mr2
    /* renamed from: j */
    public C1175b mo7480j(@ts2 im0.C2452a aVar) {
        this.f6060a = aVar;
        return this;
    }

    @mr2
    /* renamed from: k */
    public C1175b mo7481k(@ts2 zg1 zg1) {
        this.f6070b = zg1;
        return this;
    }

    /* renamed from: l */
    public C1175b mo7482l(nu0 nu0) {
        this.f6061a = nu0;
        return this;
    }

    /* renamed from: m */
    public C1175b mo7483m(boolean z) {
        this.f6057a.mo7506d(new C1178c(), z && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @mr2
    /* renamed from: n */
    public C1175b mo7484n(boolean z) {
        this.f6069a = z;
        return this;
    }

    @mr2
    /* renamed from: o */
    public C1175b mo7485o(int i) {
        if (i < 2 || i > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f6055a = i;
        return this;
    }

    /* renamed from: p */
    public C1175b mo7486p(boolean z) {
        this.f6057a.mo7506d(new C1179d(), z);
        return this;
    }

    @mr2
    /* renamed from: q */
    public C1175b mo7487q(@ts2 rg2 rg2) {
        this.f6063a = rg2;
        return this;
    }

    @mr2
    /* renamed from: r */
    public C1175b mo7488r(@mr2 yg2.C4000a aVar) {
        return mo7489s(aVar.mo27480a());
    }

    @mr2
    /* renamed from: s */
    public C1175b mo7489s(@ts2 yg2 yg2) {
        this.f6065a = yg2;
        return this;
    }

    /* renamed from: t */
    public void mo7490t(@ts2 hj3.C2353b bVar) {
        this.f6058a = bVar;
    }

    @Deprecated
    /* renamed from: u */
    public C1175b mo7491u(@ts2 zg1 zg1) {
        return mo7492v(zg1);
    }

    @mr2
    /* renamed from: v */
    public C1175b mo7492v(@ts2 zg1 zg1) {
        this.f6066a = zg1;
        return this;
    }
}
