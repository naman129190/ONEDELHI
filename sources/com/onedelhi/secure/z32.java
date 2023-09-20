package com.onedelhi.secure;

import com.onedelhi.secure.vs1;
import java.util.Collections;
import java.util.List;

public abstract class z32 {

    /* renamed from: a */
    public static final z32 f38201a = new C7431b();

    /* renamed from: b */
    public static final z32 f38202b = new C7432c();

    /* renamed from: com.onedelhi.secure.z32$b */
    public static final class C7431b extends z32 {

        /* renamed from: a */
        public static final Class<?> f38203a = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C7431b() {
            super();
        }

        /* renamed from: f */
        public static <E> List<E> m72536f(Object obj, long j) {
            return (List) ko4.m54679Q(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.onedelhi.secure.m22} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.onedelhi.secure.m22} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.onedelhi.secure.m22} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> m72537g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m72536f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.onedelhi.secure.n22
                if (r1 == 0) goto L_0x0014
                com.onedelhi.secure.m22 r0 = new com.onedelhi.secure.m22
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.onedelhi.secure.x43
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.onedelhi.secure.vs1.C7095k
                if (r1 == 0) goto L_0x0024
                com.onedelhi.secure.vs1$k r0 = (com.onedelhi.secure.vs1.C7095k) r0
                com.onedelhi.secure.vs1$k r6 = r0.mo31125H1(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.onedelhi.secure.ko4.m54728t0(r3, r4, r0)
                goto L_0x007a
            L_0x002d:
                java.lang.Class<?> r1 = f38203a
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
            L_0x0046:
                com.onedelhi.secure.ko4.m54728t0(r3, r4, r1)
                r0 = r1
                goto L_0x007a
            L_0x004b:
                boolean r1 = r0 instanceof com.onedelhi.secure.fo4
                if (r1 == 0) goto L_0x005f
                com.onedelhi.secure.m22 r1 = new com.onedelhi.secure.m22
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.onedelhi.secure.fo4 r0 = (com.onedelhi.secure.fo4) r0
                r1.addAll(r0)
                goto L_0x0046
            L_0x005f:
                boolean r1 = r0 instanceof com.onedelhi.secure.x43
                if (r1 == 0) goto L_0x007a
                boolean r1 = r0 instanceof com.onedelhi.secure.vs1.C7095k
                if (r1 == 0) goto L_0x007a
                r1 = r0
                com.onedelhi.secure.vs1$k r1 = (com.onedelhi.secure.vs1.C7095k) r1
                boolean r2 = r1.mo36500p()
                if (r2 != 0) goto L_0x007a
                int r0 = r0.size()
                int r0 = r0 + r6
                com.onedelhi.secure.vs1$k r0 = r1.mo31125H1(r0)
                goto L_0x0029
            L_0x007a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.z32.C7431b.m72537g(java.lang.Object, long, int):java.util.List");
        }

        /* renamed from: c */
        public void mo48129c(Object obj, long j) {
            Object obj2;
            List list = (List) ko4.m54679Q(obj, j);
            if (list instanceof n22) {
                obj2 = ((n22) list).mo36156J1();
            } else if (!f38203a.isAssignableFrom(list.getClass())) {
                if (!(list instanceof x43) || !(list instanceof vs1.C7095k)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    vs1.C7095k kVar = (vs1.C7095k) list;
                    if (kVar.mo36500p()) {
                        kVar.mo36496Q0();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            ko4.m54728t0(obj, j, obj2);
        }

        /* renamed from: d */
        public <E> void mo48130d(Object obj, Object obj2, long j) {
            List f = m72536f(obj2, j);
            List g = m72537g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            ko4.m54728t0(obj, j, f);
        }

        /* renamed from: e */
        public <L> List<L> mo48131e(Object obj, long j) {
            return m72537g(obj, j, 10);
        }
    }

    /* renamed from: com.onedelhi.secure.z32$c */
    public static final class C7432c extends z32 {
        public C7432c() {
            super();
        }

        /* renamed from: f */
        public static <E> vs1.C7095k<E> m72541f(Object obj, long j) {
            return (vs1.C7095k) ko4.m54679Q(obj, j);
        }

        /* renamed from: c */
        public void mo48129c(Object obj, long j) {
            m72541f(obj, j).mo36496Q0();
        }

        /* renamed from: d */
        public <E> void mo48130d(Object obj, Object obj2, long j) {
            vs1.C7095k f = m72541f(obj, j);
            vs1.C7095k f2 = m72541f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo36500p()) {
                    f = f.mo31125H1(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            ko4.m54728t0(obj, j, f2);
        }

        /* renamed from: e */
        public <L> List<L> mo48131e(Object obj, long j) {
            vs1.C7095k f = m72541f(obj, j);
            if (f.mo36500p()) {
                return f;
            }
            int size = f.size();
            vs1.C7095k H1 = f.mo31125H1(size == 0 ? 10 : size * 2);
            ko4.m54728t0(obj, j, H1);
            return H1;
        }
    }

    public z32() {
    }

    /* renamed from: a */
    public static z32 m72531a() {
        return f38201a;
    }

    /* renamed from: b */
    public static z32 m72532b() {
        return f38202b;
    }

    /* renamed from: c */
    public abstract void mo48129c(Object obj, long j);

    /* renamed from: d */
    public abstract <L> void mo48130d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract <L> List<L> mo48131e(Object obj, long j);
}
