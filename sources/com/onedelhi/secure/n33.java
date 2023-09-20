package com.onedelhi.secure;

public final class n33 {

    /* renamed from: com.onedelhi.secure.n33$a */
    public interface C2922a<T> {
        /* renamed from: a */
        boolean mo20817a(@mr2 T t);

        @ts2
        /* renamed from: b */
        T mo20818b();
    }

    /* renamed from: com.onedelhi.secure.n33$b */
    public static class C2923b<T> implements C2922a<T> {

        /* renamed from: a */
        public int f17006a;

        /* renamed from: a */
        public final Object[] f17007a;

        public C2923b(int i) {
            if (i > 0) {
                this.f17007a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public boolean mo20817a(@mr2 T t) {
            if (!mo20858c(t)) {
                int i = this.f17006a;
                Object[] objArr = this.f17007a;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = t;
                this.f17006a = i + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }

        /* renamed from: b */
        public T mo20818b() {
            int i = this.f17006a;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f17007a;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f17006a = i - 1;
            return t;
        }

        /* renamed from: c */
        public final boolean mo20858c(@mr2 T t) {
            for (int i = 0; i < this.f17006a; i++) {
                if (this.f17007a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.n33$c */
    public static class C2924c<T> extends C2923b<T> {

        /* renamed from: a */
        public final Object f17008a = new Object();

        public C2924c(int i) {
            super(i);
        }

        /* renamed from: a */
        public boolean mo20817a(@mr2 T t) {
            boolean a;
            synchronized (this.f17008a) {
                a = super.mo20817a(t);
            }
            return a;
        }

        /* renamed from: b */
        public T mo20818b() {
            T b;
            synchronized (this.f17008a) {
                b = super.mo20818b();
            }
            return b;
        }
    }
}
