package com.onedelhi.secure;

public abstract class km0 {

    /* renamed from: a */
    public static final km0 f15019a = new C2647a();

    /* renamed from: b */
    public static final km0 f15020b = new C2648b();

    /* renamed from: c */
    public static final km0 f15021c = new C2649c();

    /* renamed from: d */
    public static final km0 f15022d = new C2650d();

    /* renamed from: e */
    public static final km0 f15023e = new C2651e();

    /* renamed from: com.onedelhi.secure.km0$a */
    public class C2647a extends km0 {
        /* renamed from: a */
        public boolean mo19158a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo19159b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo19160c(vd0 vd0) {
            return vd0 == vd0.REMOTE;
        }

        /* renamed from: d */
        public boolean mo19161d(boolean z, vd0 vd0, vt0 vt0) {
            return (vd0 == vd0.RESOURCE_DISK_CACHE || vd0 == vd0.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.onedelhi.secure.km0$b */
    public class C2648b extends km0 {
        /* renamed from: a */
        public boolean mo19158a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo19159b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo19160c(vd0 vd0) {
            return false;
        }

        /* renamed from: d */
        public boolean mo19161d(boolean z, vd0 vd0, vt0 vt0) {
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.km0$c */
    public class C2649c extends km0 {
        /* renamed from: a */
        public boolean mo19158a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo19159b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo19160c(vd0 vd0) {
            return (vd0 == vd0.DATA_DISK_CACHE || vd0 == vd0.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public boolean mo19161d(boolean z, vd0 vd0, vt0 vt0) {
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.km0$d */
    public class C2650d extends km0 {
        /* renamed from: a */
        public boolean mo19158a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo19159b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo19160c(vd0 vd0) {
            return false;
        }

        /* renamed from: d */
        public boolean mo19161d(boolean z, vd0 vd0, vt0 vt0) {
            return (vd0 == vd0.RESOURCE_DISK_CACHE || vd0 == vd0.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.onedelhi.secure.km0$e */
    public class C2651e extends km0 {
        /* renamed from: a */
        public boolean mo19158a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo19159b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo19160c(vd0 vd0) {
            return vd0 == vd0.REMOTE;
        }

        /* renamed from: d */
        public boolean mo19161d(boolean z, vd0 vd0, vt0 vt0) {
            return ((z && vd0 == vd0.DATA_DISK_CACHE) || vd0 == vd0.LOCAL) && vt0 == vt0.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo19158a();

    /* renamed from: b */
    public abstract boolean mo19159b();

    /* renamed from: c */
    public abstract boolean mo19160c(vd0 vd0);

    /* renamed from: d */
    public abstract boolean mo19161d(boolean z, vd0 vd0, vt0 vt0);
}
