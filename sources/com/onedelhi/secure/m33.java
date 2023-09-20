package com.onedelhi.secure;

public final class m33 {

    /* renamed from: a */
    public static final boolean f15896a = false;

    /* renamed from: com.onedelhi.secure.m33$a */
    public interface C2831a<T> {
        /* renamed from: a */
        boolean mo20091a(T t);

        /* renamed from: b */
        T mo20092b();

        /* renamed from: c */
        void mo20093c(T[] tArr, int i);
    }

    /* renamed from: com.onedelhi.secure.m33$b */
    public static class C2832b<T> implements C2831a<T> {

        /* renamed from: a */
        public int f15897a;

        /* renamed from: a */
        public final Object[] f15898a;

        public C2832b(int i) {
            if (i > 0) {
                this.f15898a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public boolean mo20091a(T t) {
            int i = this.f15897a;
            Object[] objArr = this.f15898a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f15897a = i + 1;
            return true;
        }

        /* renamed from: b */
        public T mo20092b() {
            int i = this.f15897a;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f15898a;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f15897a = i - 1;
            return t;
        }

        /* renamed from: c */
        public void mo20093c(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.f15897a;
                Object[] objArr = this.f15898a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.f15897a = i3 + 1;
                }
            }
        }

        /* renamed from: d */
        public final boolean mo20094d(T t) {
            for (int i = 0; i < this.f15897a; i++) {
                if (this.f15898a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }
}
