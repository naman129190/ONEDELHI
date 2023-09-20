package com.onedelhi.secure;

import com.onedelhi.secure.pd0;
import com.onedelhi.secure.rj2;

public class xn4<Model> implements rj2<Model, Model> {

    /* renamed from: a */
    public static final xn4<?> f22634a = new xn4<>();

    /* renamed from: com.onedelhi.secure.xn4$a */
    public static class C3932a<Model> implements sj2<Model, Model> {

        /* renamed from: a */
        public static final C3932a<?> f22635a = new C3932a<>();

        /* renamed from: a */
        public static <T> C3932a<T> m31554a() {
            return f22635a;
        }

        /* renamed from: b */
        public void mo14016b() {
        }

        @mr2
        /* renamed from: c */
        public rj2<Model, Model> mo14017c(am2 am2) {
            return xn4.m31551c();
        }
    }

    /* renamed from: com.onedelhi.secure.xn4$b */
    public static class C3933b<Model> implements pd0<Model> {

        /* renamed from: a */
        public final Model f22636a;

        public C3933b(Model model) {
            this.f22636a = model;
        }

        @mr2
        /* renamed from: a */
        public Class<Model> mo14075a() {
            return this.f22636a.getClass();
        }

        /* renamed from: b */
        public void mo14569b() {
        }

        /* renamed from: c */
        public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super Model> aVar) {
            aVar.mo13893f(this.f22636a);
        }

        public void cancel() {
        }

        @mr2
        /* renamed from: d */
        public vd0 mo14572d() {
            return vd0.LOCAL;
        }
    }

    /* renamed from: c */
    public static <T> xn4<T> m31551c() {
        return f22634a;
    }

    /* renamed from: a */
    public rj2.C3418a<Model> mo13191a(@mr2 Model model, int i, int i2, @mr2 zw2 zw2) {
        return new rj2.C3418a<>(new mt2(model), new C3933b(model));
    }

    /* renamed from: b */
    public boolean mo13192b(@mr2 Model model) {
        return true;
    }
}
