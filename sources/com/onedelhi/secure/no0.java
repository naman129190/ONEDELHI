package com.onedelhi.secure;

public abstract class no0 {

    /* renamed from: a */
    public static final no0 f17492a = new C2987a();

    /* renamed from: a */
    public static final ow2<no0> f17493a;

    /* renamed from: a */
    public static final boolean f17494a = true;

    /* renamed from: b */
    public static final no0 f17495b = new C2988b();

    /* renamed from: c */
    public static final no0 f17496c = new C2991e();

    /* renamed from: d */
    public static final no0 f17497d = new C2989c();

    /* renamed from: e */
    public static final no0 f17498e;

    /* renamed from: f */
    public static final no0 f17499f = new C2992f();

    /* renamed from: g */
    public static final no0 f17500g;

    /* renamed from: com.onedelhi.secure.no0$a */
    public static class C2987a extends no0 {
        /* renamed from: a */
        public C2993g mo21386a(int i, int i2, int i3, int i4) {
            return C2993g.QUALITY;
        }

        /* renamed from: b */
        public float mo21387b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.onedelhi.secure.no0$b */
    public static class C2988b extends no0 {
        /* renamed from: a */
        public C2993g mo21386a(int i, int i2, int i3, int i4) {
            return C2993g.MEMORY;
        }

        /* renamed from: b */
        public float mo21387b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.onedelhi.secure.no0$c */
    public static class C2989c extends no0 {
        /* renamed from: a */
        public C2993g mo21386a(int i, int i2, int i3, int i4) {
            return mo21387b(i, i2, i3, i4) == 1.0f ? C2993g.QUALITY : no0.f17496c.mo21386a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo21387b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, no0.f17496c.mo21387b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.onedelhi.secure.no0$d */
    public static class C2990d extends no0 {
        /* renamed from: a */
        public C2993g mo21386a(int i, int i2, int i3, int i4) {
            return C2993g.QUALITY;
        }

        /* renamed from: b */
        public float mo21387b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.onedelhi.secure.no0$e */
    public static class C2991e extends no0 {
        /* renamed from: a */
        public C2993g mo21386a(int i, int i2, int i3, int i4) {
            return no0.f17494a ? C2993g.QUALITY : C2993g.MEMORY;
        }

        /* renamed from: b */
        public float mo21387b(int i, int i2, int i3, int i4) {
            if (no0.f17494a) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.onedelhi.secure.no0$f */
    public static class C2992f extends no0 {
        /* renamed from: a */
        public C2993g mo21386a(int i, int i2, int i3, int i4) {
            return C2993g.QUALITY;
        }

        /* renamed from: b */
        public float mo21387b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.onedelhi.secure.no0$g */
    public enum C2993g {
        MEMORY,
        QUALITY
    }

    static {
        C2990d dVar = new C2990d();
        f17498e = dVar;
        f17500g = dVar;
        f17493a = ow2.m24135g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    /* renamed from: a */
    public abstract C2993g mo21386a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo21387b(int i, int i2, int i3, int i4);
}
