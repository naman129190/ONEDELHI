package com.onedelhi.secure;

import java.util.Collections;
import java.util.List;

public interface rj2<Model, Data> {

    /* renamed from: com.onedelhi.secure.rj2$a */
    public static class C3418a<Data> {

        /* renamed from: a */
        public final ky1 f19899a;

        /* renamed from: a */
        public final pd0<Data> f19900a;

        /* renamed from: a */
        public final List<ky1> f19901a;

        public C3418a(@mr2 ky1 ky1, @mr2 pd0<Data> pd0) {
            this(ky1, Collections.emptyList(), pd0);
        }

        public C3418a(@mr2 ky1 ky1, @mr2 List<ky1> list, @mr2 pd0<Data> pd0) {
            this.f19899a = (ky1) g43.m15509d(ky1);
            this.f19901a = (List) g43.m15509d(list);
            this.f19900a = (pd0) g43.m15509d(pd0);
        }
    }

    @ts2
    /* renamed from: a */
    C3418a<Data> mo13191a(@mr2 Model model, int i, int i2, @mr2 zw2 zw2);

    /* renamed from: b */
    boolean mo13192b(@mr2 Model model);
}
