package com.onedelhi.secure;

import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class kv1 implements du0<kv1> {

    /* renamed from: a */
    public static final fs4<String> f31450a = jv1.f30949a;

    /* renamed from: a */
    public static final C5943b f31451a = new C5943b((C5942a) null);

    /* renamed from: b */
    public static final fs4<Boolean> f31452b = iv1.f30475a;

    /* renamed from: b */
    public static final kt2<Object> f31453b = hv1.f29876a;

    /* renamed from: a */
    public kt2<Object> f31454a = f31453b;

    /* renamed from: a */
    public final Map<Class<?>, kt2<?>> f31455a = new HashMap();

    /* renamed from: a */
    public boolean f31456a = false;

    /* renamed from: b */
    public final Map<Class<?>, fs4<?>> f31457b = new HashMap();

    /* renamed from: com.onedelhi.secure.kv1$a */
    public class C5942a implements od0 {
        public C5942a() {
        }

        /* renamed from: a */
        public void mo39526a(@mr2 Object obj, @mr2 Writer writer) throws IOException {
            kw1 kw1 = new kw1(writer, kv1.this.f31455a, kv1.this.f31457b, kv1.this.f31454a, kv1.this.f31456a);
            kw1.mo39583z(obj, false);
            kw1.mo39560J();
        }

        /* renamed from: b */
        public String mo39527b(@mr2 Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo39526a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: com.onedelhi.secure.kv1$b */
    public static final class C5943b implements fs4<Date> {

        /* renamed from: a */
        public static final DateFormat f31459a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ConfigFetchHttpClient.f25311l, Locale.US);
            f31459a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public C5943b() {
        }

        public /* synthetic */ C5943b(C5942a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo17710a(@mr2 Date date, @mr2 gs4 gs4) throws IOException {
            gs4.mo36879g(f31459a.format(date));
        }
    }

    public kv1() {
        mo34633b(String.class, f31450a);
        mo34633b(Boolean.class, f31452b);
        mo34633b(Date.class, f31451a);
    }

    /* renamed from: m */
    public static /* synthetic */ void m55037m(Object obj, lt2 lt2) throws IOException {
        throw new iu0("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @mr2
    /* renamed from: j */
    public od0 mo39520j() {
        return new C5942a();
    }

    @mr2
    /* renamed from: k */
    public kv1 mo39521k(@mr2 o50 o50) {
        o50.mo17709a(this);
        return this;
    }

    @mr2
    /* renamed from: l */
    public kv1 mo39522l(boolean z) {
        this.f31456a = z;
        return this;
    }

    @mr2
    /* renamed from: p */
    public <T> kv1 mo34632a(@mr2 Class<T> cls, @mr2 kt2<? super T> kt2) {
        this.f31455a.put(cls, kt2);
        this.f31457b.remove(cls);
        return this;
    }

    @mr2
    /* renamed from: q */
    public <T> kv1 mo34633b(@mr2 Class<T> cls, @mr2 fs4<? super T> fs4) {
        this.f31457b.put(cls, fs4);
        this.f31455a.remove(cls);
        return this;
    }

    @mr2
    /* renamed from: r */
    public kv1 mo39525r(@mr2 kt2<Object> kt2) {
        this.f31454a = kt2;
        return this;
    }
}
