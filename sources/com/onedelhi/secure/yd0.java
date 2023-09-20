package com.onedelhi.secure;

import android.util.Base64;
import com.onedelhi.secure.pd0;
import com.onedelhi.secure.rj2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class yd0<Model, Data> implements rj2<Model, Data> {

    /* renamed from: a */
    public static final String f22981a = "data:image";

    /* renamed from: b */
    public static final String f22982b = ";base64";

    /* renamed from: a */
    public final C3987a<Data> f22983a;

    /* renamed from: com.onedelhi.secure.yd0$a */
    public interface C3987a<Data> {
        /* renamed from: a */
        Class<Data> mo27349a();

        /* renamed from: b */
        void mo27350b(Data data) throws IOException;

        /* renamed from: c */
        Data mo27351c(String str) throws IllegalArgumentException;
    }

    /* renamed from: com.onedelhi.secure.yd0$b */
    public static final class C3988b<Data> implements pd0<Data> {

        /* renamed from: a */
        public final C3987a<Data> f22984a;

        /* renamed from: a */
        public Data f22985a;

        /* renamed from: b */
        public final String f22986b;

        public C3988b(String str, C3987a<Data> aVar) {
            this.f22986b = str;
            this.f22984a = aVar;
        }

        @mr2
        /* renamed from: a */
        public Class<Data> mo14075a() {
            return this.f22984a.mo27349a();
        }

        /* renamed from: b */
        public void mo14569b() {
            try {
                this.f22984a.mo27350b(this.f22985a);
            } catch (IOException unused) {
            }
        }

        /* renamed from: c */
        public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super Data> aVar) {
            try {
                Data c = this.f22984a.mo27351c(this.f22986b);
                this.f22985a = c;
                aVar.mo13893f(c);
            } catch (IllegalArgumentException e) {
                aVar.mo13892e(e);
            }
        }

        public void cancel() {
        }

        @mr2
        /* renamed from: d */
        public vd0 mo14572d() {
            return vd0.LOCAL;
        }
    }

    /* renamed from: com.onedelhi.secure.yd0$c */
    public static final class C3989c<Model> implements sj2<Model, InputStream> {

        /* renamed from: a */
        public final C3987a<InputStream> f22987a = new C3990a();

        /* renamed from: com.onedelhi.secure.yd0$c$a */
        public class C3990a implements C3987a<InputStream> {
            public C3990a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo27349a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo27350b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo27351c(String str) {
                if (str.startsWith(yd0.f22981a)) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(yd0.f22982b)) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Model, InputStream> mo14017c(@mr2 am2 am2) {
            return new yd0(this.f22987a);
        }
    }

    public yd0(C3987a<Data> aVar) {
        this.f22983a = aVar;
    }

    /* renamed from: a */
    public rj2.C3418a<Data> mo13191a(@mr2 Model model, int i, int i2, @mr2 zw2 zw2) {
        return new rj2.C3418a<>(new mt2(model), new C3988b(model.toString(), this.f22983a));
    }

    /* renamed from: b */
    public boolean mo13192b(@mr2 Model model) {
        return model.toString().startsWith(f22981a);
    }
}
