package com.onedelhi.secure;

import com.onedelhi.secure.C4992da;
import com.onedelhi.secure.C7403z0;
import com.onedelhi.secure.f21;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.qe1.C6546b;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.wx4;
import com.onedelhi.secure.yh2;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class qe1<MessageType extends qe1<MessageType, BuilderType>, BuilderType extends C6546b<MessageType, BuilderType>> extends C7403z0<MessageType, BuilderType> {
    private static Map<Object, qe1<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public bo4 unknownFields = bo4.m40221c();

    /* renamed from: com.onedelhi.secure.qe1$a */
    public static /* synthetic */ class C6545a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34066a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onedelhi.secure.wx4$c[] r0 = com.onedelhi.secure.wx4.C7200c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34066a = r0
                com.onedelhi.secure.wx4$c r1 = com.onedelhi.secure.wx4.C7200c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34066a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wx4$c r1 = com.onedelhi.secure.wx4.C7200c.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qe1.C6545a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.qe1$b */
    public static abstract class C6546b<MessageType extends qe1<MessageType, BuilderType>, BuilderType extends C6546b<MessageType, BuilderType>> extends C7403z0.C7404a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f34067a;

        /* renamed from: b */
        public MessageType f34068b;

        /* renamed from: b */
        public boolean f34069b = false;

        public C6546b(MessageType messagetype) {
            this.f34067a = messagetype;
            this.f34068b = (qe1) messagetype.mo43360hj(C6554i.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: Aj */
        public BuilderType mo43384gj(MessageType messagetype) {
            return mo43372Cj(messagetype);
        }

        /* renamed from: Bj */
        public BuilderType mo43386kj(g00 g00, zy0 zy0) throws IOException {
            mo43393xj();
            try {
                p63.m60498a().mo42386j(this.f34068b).mo31776j(this.f34068b, h00.m50006T(g00), zy0);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: Cj */
        public BuilderType mo43372Cj(MessageType messagetype) {
            mo43393xj();
            mo43376Fj(this.f34068b, messagetype);
            return this;
        }

        /* renamed from: Dj */
        public BuilderType mo43387pj(byte[] bArr, int i, int i2) throws nt1 {
            return mo43388qj(bArr, i, i2, zy0.m74393d());
        }

        /* renamed from: Ej */
        public BuilderType mo43388qj(byte[] bArr, int i, int i2, zy0 zy0) throws nt1 {
            mo43393xj();
            try {
                p63.m60498a().mo42386j(this.f34068b).mo31768f(this.f34068b, bArr, i, i + i2, new C4992da.C4994b(zy0));
                return this;
            } catch (nt1 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw nt1.m58791n();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: Fj */
        public final void mo43376Fj(MessageType messagetype, MessageType messagetype2) {
            p63.m60498a().mo42386j(messagetype).mo31760a(messagetype, messagetype2);
        }

        /* renamed from: N1 */
        public final boolean mo43347N1() {
            return qe1.m62503vj(this.f34068b, false);
        }

        /* renamed from: tj */
        public final MessageType mo43381ab() {
            MessageType uj = mo43377Ja();
            if (uj.mo43347N1()) {
                return uj;
            }
            throw C7403z0.C7404a.m72426sj(uj);
        }

        /* renamed from: uj */
        public MessageType mo43377Ja() {
            if (this.f34069b) {
                return this.f34068b;
            }
            this.f34068b.mo43366wj();
            this.f34069b = true;
            return this.f34068b;
        }

        /* renamed from: vj */
        public final BuilderType mo43379R3() {
            this.f34068b = (qe1) this.f34068b.mo43360hj(C6554i.NEW_MUTABLE_INSTANCE);
            return this;
        }

        /* renamed from: wj */
        public BuilderType mo43383ej() {
            BuilderType Gj = mo43344Dd().mo43350V8();
            Gj.mo43372Cj(mo43377Ja());
            return Gj;
        }

        /* renamed from: xj */
        public final void mo43393xj() {
            if (this.f34069b) {
                mo43394yj();
                this.f34069b = false;
            }
        }

        /* renamed from: yj */
        public void mo43394yj() {
            MessageType messagetype = (qe1) this.f34068b.mo43360hj(C6554i.NEW_MUTABLE_INSTANCE);
            mo43376Fj(messagetype, this.f34068b);
            this.f34068b = messagetype;
        }

        /* renamed from: zj */
        public MessageType mo43344Dd() {
            return this.f34067a;
        }
    }

    /* renamed from: com.onedelhi.secure.qe1$c */
    public static class C6547c<T extends qe1<T, ?>> extends C5070e1<T> {

        /* renamed from: a */
        public final T f34070a;

        public C6547c(T t) {
            this.f34070a = t;
        }

        /* renamed from: b0 */
        public T mo34004d(g00 g00, zy0 zy0) throws nt1 {
            return qe1.m62487Zj(this.f34070a, g00, zy0);
        }

        /* renamed from: c0 */
        public T mo34021u(byte[] bArr, int i, int i2, zy0 zy0) throws nt1 {
            return qe1.m62488ak(this.f34070a, bArr, i, i2, zy0);
        }
    }

    /* renamed from: com.onedelhi.secure.qe1$d */
    public static abstract class C6548d<MessageType extends C6549e<MessageType, BuilderType>, BuilderType extends C6548d<MessageType, BuilderType>> extends C6546b<MessageType, BuilderType> implements C6551f<MessageType, BuilderType> {
        public C6548d(MessageType messagetype) {
            super(messagetype);
        }

        /* renamed from: Jj */
        private f21<C6552g> m62560Jj() {
            f21<C6552g> f21 = ((C6549e) this.f34068b).extensions;
            if (!f21.mo35718D()) {
                return f21;
            }
            f21<C6552g> k = f21.clone();
            ((C6549e) this.f34068b).extensions = k;
            return k;
        }

        /* renamed from: G6 */
        public final <Type> Type mo43398G6(xy0<MessageType, Type> xy0) {
            return ((C6549e) this.f34068b).mo43398G6(xy0);
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.xy0<MessageType, java.util.List<Type>>, com.onedelhi.secure.xy0] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: G8 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <Type> Type mo43399G8(com.onedelhi.secure.xy0<MessageType, java.util.List<Type>> r2, int r3) {
            /*
                r1 = this;
                MessageType r0 = r1.f34068b
                com.onedelhi.secure.qe1$e r0 = (com.onedelhi.secure.qe1.C6549e) r0
                java.lang.Object r2 = r0.mo43399G8(r2, r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qe1.C6548d.mo43399G8(com.onedelhi.secure.xy0, int):java.lang.Object");
        }

        /* renamed from: Gj */
        public final <Type> BuilderType mo43400Gj(xy0<MessageType, List<Type>> xy0, Type type) {
            C6553h bj = qe1.m62491dj(xy0);
            mo43406Nj(bj);
            mo43393xj();
            m62560Jj().mo35732h(bj.f34080a, bj.mo43433j(type));
            return this;
        }

        /* renamed from: Hj */
        public final MessageType mo43390uj() {
            MessageType uj;
            if (this.f34069b) {
                uj = this.f34068b;
            } else {
                ((C6549e) this.f34068b).extensions.mo35721I();
                uj = super.mo43377Ja();
            }
            return (C6549e) uj;
        }

        /* renamed from: Ij */
        public final BuilderType mo43402Ij(xy0<MessageType, ?> xy0) {
            C6553h bj = qe1.m62491dj(xy0);
            mo43406Nj(bj);
            mo43393xj();
            m62560Jj().mo35735j(bj.f34080a);
            return this;
        }

        /* renamed from: Kj */
        public void mo43403Kj(f21<C6552g> f21) {
            mo43393xj();
            ((C6549e) this.f34068b).extensions = f21;
        }

        /* renamed from: Lj */
        public final <Type> BuilderType mo43404Lj(xy0<MessageType, List<Type>> xy0, int i, Type type) {
            C6553h bj = qe1.m62491dj(xy0);
            mo43406Nj(bj);
            mo43393xj();
            m62560Jj().mo35725P(bj.f34080a, i, bj.mo43433j(type));
            return this;
        }

        /* renamed from: Mj */
        public final <Type> BuilderType mo43405Mj(xy0<MessageType, Type> xy0, Type type) {
            C6553h bj = qe1.m62491dj(xy0);
            mo43406Nj(bj);
            mo43393xj();
            m62560Jj().mo35724O(bj.f34080a, bj.mo43434k(type));
            return this;
        }

        /* renamed from: Nj */
        public final void mo43406Nj(C6553h<MessageType, ?> hVar) {
            if (hVar.mo43431h() != mo43344Dd()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* renamed from: Rg */
        public final <Type> int mo43407Rg(xy0<MessageType, List<Type>> xy0) {
            return ((C6549e) this.f34068b).mo43407Rg(xy0);
        }

        /* renamed from: i5 */
        public final <Type> boolean mo43408i5(xy0<MessageType, Type> xy0) {
            return ((C6549e) this.f34068b).mo43408i5(xy0);
        }

        /* renamed from: yj */
        public void mo43394yj() {
            super.mo43394yj();
            MessageType messagetype = this.f34068b;
            ((C6549e) messagetype).extensions = ((C6549e) messagetype).extensions.clone();
        }
    }

    /* renamed from: com.onedelhi.secure.qe1$e */
    public static abstract class C6549e<MessageType extends C6549e<MessageType, BuilderType>, BuilderType extends C6548d<MessageType, BuilderType>> extends qe1<MessageType, BuilderType> implements C6551f<MessageType, BuilderType> {
        public f21<C6552g> extensions = f21.m47486s();

        /* renamed from: com.onedelhi.secure.qe1$e$a */
        public class C6550a {

            /* renamed from: a */
            public final Iterator<Map.Entry<C6552g, Object>> f34072a;

            /* renamed from: a */
            public Map.Entry<C6552g, Object> f34073a;

            /* renamed from: a */
            public final boolean f34074a;

            public C6550a(boolean z) {
                Iterator<Map.Entry<C6552g, Object>> H = C6549e.this.extensions.mo35720H();
                this.f34072a = H;
                if (H.hasNext()) {
                    this.f34073a = H.next();
                }
                this.f34074a = z;
            }

            public /* synthetic */ C6550a(C6549e eVar, boolean z, C6545a aVar) {
                this(z);
            }

            /* renamed from: a */
            public void mo43422a(int i, i00 i00) throws IOException {
                while (true) {
                    Map.Entry<C6552g, Object> entry = this.f34073a;
                    if (entry != null && entry.getKey().mo35764j() < i) {
                        C6552g key = this.f34073a.getKey();
                        if (!this.f34074a || key.mo35765k() != wx4.C7200c.MESSAGE || key.mo35766m()) {
                            f21.m47472T(key, this.f34073a.getValue(), i00);
                        } else {
                            i00.mo37751P1(key.mo35764j(), (yh2) this.f34073a.getValue());
                        }
                        this.f34073a = this.f34072a.hasNext() ? this.f34072a.next() : null;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: sk */
        private void m62575sk(C6553h<MessageType, ?> hVar) {
            if (hVar.mo43431h() != mo43344Dd()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* renamed from: Dd */
        public /* bridge */ /* synthetic */ yh2 mo43344Dd() {
            return qe1.super.mo43344Dd();
        }

        /* renamed from: G6 */
        public final <Type> Type mo43398G6(xy0<MessageType, Type> xy0) {
            C6553h bj = qe1.m62491dj(xy0);
            m62575sk(bj);
            Object u = this.extensions.mo35739u(bj.f34080a);
            return u == null ? bj.f34082a : bj.mo43430g(u);
        }

        /* renamed from: G8 */
        public final <Type> Type mo43399G8(xy0<MessageType, List<Type>> xy0, int i) {
            C6553h bj = qe1.m62491dj(xy0);
            m62575sk(bj);
            return bj.mo43432i(this.extensions.mo35742x(bj.f34080a, i));
        }

        /* renamed from: Rg */
        public final <Type> int mo43407Rg(xy0<MessageType, List<Type>> xy0) {
            C6553h bj = qe1.m62491dj(xy0);
            m62575sk(bj);
            return this.extensions.mo35743y(bj.f34080a);
        }

        /* renamed from: Ud */
        public /* bridge */ /* synthetic */ yh2.C7362a mo43349Ud() {
            return qe1.super.mo43349Ud();
        }

        /* renamed from: V8 */
        public /* bridge */ /* synthetic */ yh2.C7362a mo43350V8() {
            return qe1.super.mo43350V8();
        }

        /* renamed from: fk */
        public final void mo43409fk(g00 g00, C6553h<?, ?> hVar, zy0 zy0, int i) throws IOException {
            mo43419pk(g00, zy0, hVar, wx4.m69700c(i, 2), i);
        }

        /* renamed from: gk */
        public f21<C6552g> mo43410gk() {
            if (this.extensions.mo35718D()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        /* renamed from: hk */
        public boolean mo43411hk() {
            return this.extensions.mo35719E();
        }

        /* renamed from: i5 */
        public final <Type> boolean mo43408i5(xy0<MessageType, Type> xy0) {
            C6553h bj = qe1.m62491dj(xy0);
            m62575sk(bj);
            return this.extensions.mo35716B(bj.f34080a);
        }

        /* renamed from: ik */
        public int mo43412ik() {
            return this.extensions.mo35744z();
        }

        /* renamed from: jk */
        public int mo43413jk() {
            return this.extensions.mo35740v();
        }

        /* renamed from: kk */
        public final void mo43414kk(MessageType messagetype) {
            if (this.extensions.mo35718D()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.mo35722J(messagetype.extensions);
        }

        /* renamed from: lk */
        public final void mo43415lk(C5173er erVar, zy0 zy0, C6553h<?, ?> hVar) throws IOException {
            yh2 yh2 = (yh2) this.extensions.mo35739u(hVar.f34080a);
            yh2.C7362a Ud = yh2 != null ? yh2.mo43349Ud() : null;
            if (Ud == null) {
                Ud = hVar.mo43427c().mo43350V8();
            }
            Ud.mo47812Je(erVar, zy0);
            mo43410gk().mo35724O(hVar.f34080a, hVar.mo43433j(Ud.mo43381ab()));
        }

        /* renamed from: mk */
        public final <MessageType extends yh2> void mo43416mk(MessageType messagetype, g00 g00, zy0 zy0) throws IOException {
            int i = 0;
            C5173er erVar = null;
            C6553h hVar = null;
            while (true) {
                int Y = g00.mo36433Y();
                if (Y == 0) {
                    break;
                } else if (Y == wx4.f37180s) {
                    i = g00.mo36434Z();
                    if (i != 0) {
                        hVar = zy0.mo48471c(messagetype, i);
                    }
                } else if (Y == wx4.f37181t) {
                    if (i == 0 || hVar == null) {
                        erVar = g00.mo36459x();
                    } else {
                        mo43409fk(g00, hVar, zy0, i);
                        erVar = null;
                    }
                } else if (!g00.mo36446g0(Y)) {
                    break;
                }
            }
            g00.mo36435a(wx4.f37179r);
            if (erVar != null && i != 0) {
                if (hVar != null) {
                    mo43415lk(erVar, zy0, hVar);
                } else {
                    mo43367xj(i, erVar);
                }
            }
        }

        /* renamed from: nk */
        public C6549e<MessageType, BuilderType>.a mo43417nk() {
            return new C6550a(this, false, (C6545a) null);
        }

        /* renamed from: ok */
        public C6549e<MessageType, BuilderType>.a mo43418ok() {
            return new C6550a(this, true, (C6545a) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
        /* renamed from: pk */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo43419pk(com.onedelhi.secure.g00 r6, com.onedelhi.secure.zy0 r7, com.onedelhi.secure.qe1.C6553h<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = com.onedelhi.secure.wx4.m69699b(r9)
                r1 = 0
                r2 = 1
                if (r8 != 0) goto L_0x000b
            L_0x0008:
                r0 = 1
            L_0x0009:
                r3 = 0
                goto L_0x0035
            L_0x000b:
                com.onedelhi.secure.qe1$g r3 = r8.f34080a
                com.onedelhi.secure.wx4$b r3 = r3.mo35762h()
                int r3 = com.onedelhi.secure.f21.m47464A(r3, r1)
                if (r0 != r3) goto L_0x0019
                r0 = 0
                goto L_0x0009
            L_0x0019:
                com.onedelhi.secure.qe1$g r3 = r8.f34080a
                boolean r4 = r3.f34077b
                if (r4 == 0) goto L_0x0008
                com.onedelhi.secure.wx4$b r3 = r3.f34076a
                boolean r3 = r3.mo46919e()
                if (r3 == 0) goto L_0x0008
                com.onedelhi.secure.qe1$g r3 = r8.f34080a
                com.onedelhi.secure.wx4$b r3 = r3.mo35762h()
                int r3 = com.onedelhi.secure.f21.m47464A(r3, r2)
                if (r0 != r3) goto L_0x0008
                r0 = 0
                r3 = 1
            L_0x0035:
                if (r0 == 0) goto L_0x003c
                boolean r6 = r5.mo43353ck(r9, r6)
                return r6
            L_0x003c:
                r5.mo43410gk()
                if (r3 == 0) goto L_0x0093
                int r7 = r6.mo36424N()
                int r7 = r6.mo36455t(r7)
                com.onedelhi.secure.qe1$g r9 = r8.f34080a
                com.onedelhi.secure.wx4$b r9 = r9.mo35762h()
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.ENUM
                if (r9 != r10) goto L_0x0076
            L_0x0053:
                int r9 = r6.mo36443f()
                if (r9 <= 0) goto L_0x008e
                int r9 = r6.mo36461z()
                com.onedelhi.secure.qe1$g r10 = r8.f34080a
                com.onedelhi.secure.vs1$d r10 = r10.mo35767n()
                com.onedelhi.secure.vs1$c r9 = r10.mo32393a(r9)
                if (r9 != 0) goto L_0x006a
                return r2
            L_0x006a:
                com.onedelhi.secure.f21<com.onedelhi.secure.qe1$g> r10 = r5.extensions
                com.onedelhi.secure.qe1$g r0 = r8.f34080a
                java.lang.Object r9 = r8.mo43433j(r9)
                r10.mo35732h(r0, r9)
                goto L_0x0053
            L_0x0076:
                int r9 = r6.mo36443f()
                if (r9 <= 0) goto L_0x008e
                com.onedelhi.secure.qe1$g r9 = r8.f34080a
                com.onedelhi.secure.wx4$b r9 = r9.mo35762h()
                java.lang.Object r9 = com.onedelhi.secure.f21.m47469N(r6, r9, r1)
                com.onedelhi.secure.f21<com.onedelhi.secure.qe1$g> r10 = r5.extensions
                com.onedelhi.secure.qe1$g r0 = r8.f34080a
                r10.mo35732h(r0, r9)
                goto L_0x0076
            L_0x008e:
                r6.mo36454s(r7)
                goto L_0x0122
            L_0x0093:
                int[] r9 = com.onedelhi.secure.qe1.C6545a.f34066a
                com.onedelhi.secure.qe1$g r0 = r8.f34080a
                com.onedelhi.secure.wx4$c r0 = r0.mo35765k()
                int r0 = r0.ordinal()
                r9 = r9[r0]
                if (r9 == r2) goto L_0x00c7
                r7 = 2
                if (r9 == r7) goto L_0x00b1
                com.onedelhi.secure.qe1$g r7 = r8.f34080a
                com.onedelhi.secure.wx4$b r7 = r7.mo35762h()
                java.lang.Object r6 = com.onedelhi.secure.f21.m47469N(r6, r7, r1)
                goto L_0x0103
            L_0x00b1:
                int r6 = r6.mo36461z()
                com.onedelhi.secure.qe1$g r7 = r8.f34080a
                com.onedelhi.secure.vs1$d r7 = r7.mo35767n()
                com.onedelhi.secure.vs1$c r7 = r7.mo32393a(r6)
                if (r7 != 0) goto L_0x00c5
                r5.mo43369zj(r10, r6)
                return r2
            L_0x00c5:
                r6 = r7
                goto L_0x0103
            L_0x00c7:
                r9 = 0
                com.onedelhi.secure.qe1$g r10 = r8.f34080a
                boolean r10 = r10.mo35766m()
                if (r10 != 0) goto L_0x00e0
                com.onedelhi.secure.f21<com.onedelhi.secure.qe1$g> r10 = r5.extensions
                com.onedelhi.secure.qe1$g r0 = r8.f34080a
                java.lang.Object r10 = r10.mo35739u(r0)
                com.onedelhi.secure.yh2 r10 = (com.onedelhi.secure.yh2) r10
                if (r10 == 0) goto L_0x00e0
                com.onedelhi.secure.yh2$a r9 = r10.mo43349Ud()
            L_0x00e0:
                if (r9 != 0) goto L_0x00ea
                com.onedelhi.secure.yh2 r9 = r8.mo43427c()
                com.onedelhi.secure.yh2$a r9 = r9.mo43350V8()
            L_0x00ea:
                com.onedelhi.secure.qe1$g r10 = r8.f34080a
                com.onedelhi.secure.wx4$b r10 = r10.mo35762h()
                com.onedelhi.secure.wx4$b r0 = com.onedelhi.secure.wx4.C7195b.GROUP
                if (r10 != r0) goto L_0x00fc
                int r10 = r8.mo43428d()
                r6.mo36415E(r10, r9, r7)
                goto L_0x00ff
            L_0x00fc:
                r6.mo36419I(r9, r7)
            L_0x00ff:
                com.onedelhi.secure.yh2 r6 = r9.mo43381ab()
            L_0x0103:
                com.onedelhi.secure.qe1$g r7 = r8.f34080a
                boolean r7 = r7.mo35766m()
                if (r7 == 0) goto L_0x0117
                com.onedelhi.secure.f21<com.onedelhi.secure.qe1$g> r7 = r5.extensions
                com.onedelhi.secure.qe1$g r9 = r8.f34080a
                java.lang.Object r6 = r8.mo43433j(r6)
                r7.mo35732h(r9, r6)
                goto L_0x0122
            L_0x0117:
                com.onedelhi.secure.f21<com.onedelhi.secure.qe1$g> r7 = r5.extensions
                com.onedelhi.secure.qe1$g r9 = r8.f34080a
                java.lang.Object r6 = r8.mo43433j(r6)
                r7.mo35724O(r9, r6)
            L_0x0122:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qe1.C6549e.mo43419pk(com.onedelhi.secure.g00, com.onedelhi.secure.zy0, com.onedelhi.secure.qe1$h, int, int):boolean");
        }

        /* renamed from: qk */
        public <MessageType extends yh2> boolean mo43420qk(MessageType messagetype, g00 g00, zy0 zy0, int i) throws IOException {
            int a = wx4.m69698a(i);
            return mo43419pk(g00, zy0, zy0.mo48471c(messagetype, a), i, a);
        }

        /* renamed from: rk */
        public <MessageType extends yh2> boolean mo43421rk(MessageType messagetype, g00 g00, zy0 zy0, int i) throws IOException {
            if (i != wx4.f37178q) {
                return wx4.m69699b(i) == 2 ? mo43420qk(messagetype, g00, zy0, i) : g00.mo36446g0(i);
            }
            mo43416mk(messagetype, g00, zy0);
            return true;
        }
    }

    /* renamed from: com.onedelhi.secure.qe1$f */
    public interface C6551f<MessageType extends C6549e<MessageType, BuilderType>, BuilderType extends C6548d<MessageType, BuilderType>> extends zh2 {
        /* renamed from: G6 */
        <Type> Type mo43398G6(xy0<MessageType, Type> xy0);

        /* renamed from: G8 */
        <Type> Type mo43399G8(xy0<MessageType, List<Type>> xy0, int i);

        /* renamed from: Rg */
        <Type> int mo43407Rg(xy0<MessageType, List<Type>> xy0);

        /* renamed from: i5 */
        <Type> boolean mo43408i5(xy0<MessageType, Type> xy0);
    }

    /* renamed from: com.onedelhi.secure.qe1$g */
    public static final class C6552g implements f21.C5210c<C6552g> {

        /* renamed from: a */
        public final vs1.C7082d<?> f34075a;

        /* renamed from: a */
        public final wx4.C7195b f34076a;

        /* renamed from: b */
        public final boolean f34077b;

        /* renamed from: c */
        public final boolean f34078c;

        /* renamed from: n */
        public final int f34079n;

        public C6552g(vs1.C7082d<?> dVar, int i, wx4.C7195b bVar, boolean z, boolean z2) {
            this.f34075a = dVar;
            this.f34079n = i;
            this.f34076a = bVar;
            this.f34077b = z;
            this.f34078c = z2;
        }

        /* renamed from: a */
        public int compareTo(C6552g gVar) {
            return this.f34079n - gVar.f34079n;
        }

        /* renamed from: h */
        public wx4.C7195b mo35762h() {
            return this.f34076a;
        }

        /* renamed from: i */
        public boolean mo35763i() {
            return this.f34078c;
        }

        /* renamed from: j */
        public int mo35764j() {
            return this.f34079n;
        }

        /* renamed from: k */
        public wx4.C7200c mo35765k() {
            return this.f34076a.mo46917a();
        }

        /* renamed from: m */
        public boolean mo35766m() {
            return this.f34077b;
        }

        /* renamed from: n */
        public vs1.C7082d<?> mo35767n() {
            return this.f34075a;
        }

        /* renamed from: p */
        public yh2.C7362a mo35768p(yh2.C7362a aVar, yh2 yh2) {
            return ((C6546b) aVar).mo43372Cj((qe1) yh2);
        }
    }

    /* renamed from: com.onedelhi.secure.qe1$h */
    public static class C6553h<ContainingType extends yh2, Type> extends xy0<ContainingType, Type> {

        /* renamed from: a */
        public final C6552g f34080a;

        /* renamed from: a */
        public final ContainingType f34081a;

        /* renamed from: a */
        public final Type f34082a;

        /* renamed from: b */
        public final yh2 f34083b;

        public C6553h(ContainingType containingtype, Type type, yh2 yh2, C6552g gVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (gVar.mo35762h() == wx4.C7195b.MESSAGE && yh2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f34081a = containingtype;
                this.f34082a = type;
                this.f34083b = yh2;
                this.f34080a = gVar;
            }
        }

        /* renamed from: a */
        public Type mo43425a() {
            return this.f34082a;
        }

        /* renamed from: b */
        public wx4.C7195b mo43426b() {
            return this.f34080a.mo35762h();
        }

        /* renamed from: c */
        public yh2 mo43427c() {
            return this.f34083b;
        }

        /* renamed from: d */
        public int mo43428d() {
            return this.f34080a.mo35764j();
        }

        /* renamed from: f */
        public boolean mo43429f() {
            return this.f34080a.f34077b;
        }

        /* renamed from: g */
        public Object mo43430g(Object obj) {
            if (!this.f34080a.mo35766m()) {
                return mo43432i(obj);
            }
            if (this.f34080a.mo35765k() != wx4.C7200c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object i : (List) obj) {
                arrayList.add(mo43432i(i));
            }
            return arrayList;
        }

        /* renamed from: h */
        public ContainingType mo43431h() {
            return this.f34081a;
        }

        /* renamed from: i */
        public Object mo43432i(Object obj) {
            return this.f34080a.mo35765k() == wx4.C7200c.ENUM ? this.f34080a.f34075a.mo32393a(((Integer) obj).intValue()) : obj;
        }

        /* renamed from: j */
        public Object mo43433j(Object obj) {
            return this.f34080a.mo35765k() == wx4.C7200c.ENUM ? Integer.valueOf(((vs1.C7081c) obj).mo32392j()) : obj;
        }

        /* renamed from: k */
        public Object mo43434k(Object obj) {
            if (!this.f34080a.mo35766m()) {
                return mo43433j(obj);
            }
            if (this.f34080a.mo35765k() != wx4.C7200c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object j : (List) obj) {
                arrayList.add(mo43433j(j));
            }
            return arrayList;
        }
    }

    /* renamed from: com.onedelhi.secure.qe1$i */
    public enum C6554i {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: com.onedelhi.secure.qe1$j */
    public static final class C6555j implements Serializable {

        /* renamed from: b */
        public static final long f34092b = 0;

        /* renamed from: a */
        public final Class<?> f34093a;

        /* renamed from: a */
        public final byte[] f34094a;

        /* renamed from: b */
        public final String f34095b;

        public C6555j(yh2 yh2) {
            Class<?> cls = yh2.getClass();
            this.f34093a = cls;
            this.f34095b = cls.getName();
            this.f34094a = yh2.mo47808b4();
        }

        /* renamed from: a */
        public static C6555j m62619a(yh2 yh2) {
            return new C6555j(yh2);
        }

        /* renamed from: b */
        public Object mo43435b() throws ObjectStreamException {
            try {
                Field declaredField = mo43437d().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((yh2) declaredField.get((Object) null)).mo43350V8().mo47814a9(this.f34094a).mo43377Ja();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f34095b, e);
            } catch (NoSuchFieldException unused) {
                return mo43436c();
            } catch (SecurityException e2) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f34095b, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (nt1 e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            }
        }

        @Deprecated
        /* renamed from: c */
        public final Object mo43436c() throws ObjectStreamException {
            try {
                Field declaredField = mo43437d().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((yh2) declaredField.get((Object) null)).mo43350V8().mo47814a9(this.f34094a).mo43377Ja();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f34095b, e);
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.f34095b, e2);
            } catch (SecurityException e3) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.f34095b, e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Unable to call parsePartialFrom", e4);
            } catch (nt1 e5) {
                throw new RuntimeException("Unable to understand proto buffer", e5);
            }
        }

        /* renamed from: d */
        public final Class<?> mo43437d() throws ClassNotFoundException {
            Class<?> cls = this.f34093a;
            return cls != null ? cls : Class.forName(this.f34095b);
        }
    }

    /* renamed from: Aj */
    public static vs1.C7079a m62463Aj(vs1.C7079a aVar) {
        int size = aVar.size();
        return aVar.mo40702C0(size == 0 ? 10 : size * 2);
    }

    /* renamed from: Bj */
    public static vs1.C7080b m62464Bj(vs1.C7080b bVar) {
        int size = bVar.size();
        return bVar.mo34578P0(size == 0 ? 10 : size * 2);
    }

    /* renamed from: Cj */
    public static vs1.C7084f m62465Cj(vs1.C7084f fVar) {
        int size = fVar.size();
        return fVar.mo46325o2(size == 0 ? 10 : size * 2);
    }

    /* renamed from: Dj */
    public static vs1.C7085g m62466Dj(vs1.C7085g gVar) {
        int size = gVar.size();
        return gVar.mo31140j1(size == 0 ? 10 : size * 2);
    }

    /* renamed from: Ej */
    public static vs1.C7088i m62467Ej(vs1.C7088i iVar) {
        int size = iVar.size();
        return iVar.mo46035C2(size == 0 ? 10 : size * 2);
    }

    /* renamed from: Fj */
    public static <E> vs1.C7095k<E> m62468Fj(vs1.C7095k<E> kVar) {
        int size = kVar.size();
        return kVar.mo31125H1(size == 0 ? 10 : size * 2);
    }

    /* renamed from: Hj */
    public static Object m62469Hj(yh2 yh2, String str, Object[] objArr) {
        return new kf3(yh2, str, objArr);
    }

    /* renamed from: Ij */
    public static <ContainingType extends yh2, Type> C6553h<ContainingType, Type> m62470Ij(ContainingType containingtype, yh2 yh2, vs1.C7082d<?> dVar, int i, wx4.C7195b bVar, boolean z, Class cls) {
        return new C6553h(containingtype, Collections.emptyList(), yh2, new C6552g(dVar, i, bVar, true, z), cls);
    }

    /* renamed from: Jj */
    public static <ContainingType extends yh2, Type> C6553h<ContainingType, Type> m62471Jj(ContainingType containingtype, Type type, yh2 yh2, vs1.C7082d<?> dVar, int i, wx4.C7195b bVar, Class cls) {
        return new C6553h(containingtype, type, yh2, new C6552g(dVar, i, bVar, false, false), cls);
    }

    /* renamed from: Kj */
    public static <T extends qe1<T, ?>> T m62472Kj(T t, InputStream inputStream) throws nt1 {
        return m62493ej(m62484Wj(t, inputStream, zy0.m74393d()));
    }

    /* renamed from: Lj */
    public static <T extends qe1<T, ?>> T m62473Lj(T t, InputStream inputStream, zy0 zy0) throws nt1 {
        return m62493ej(m62484Wj(t, inputStream, zy0));
    }

    /* renamed from: Mj */
    public static <T extends qe1<T, ?>> T m62474Mj(T t, C5173er erVar) throws nt1 {
        return m62493ej(m62475Nj(t, erVar, zy0.m74393d()));
    }

    /* renamed from: Nj */
    public static <T extends qe1<T, ?>> T m62475Nj(T t, C5173er erVar, zy0 zy0) throws nt1 {
        return m62493ej(m62485Xj(t, erVar, zy0));
    }

    /* renamed from: Oj */
    public static <T extends qe1<T, ?>> T m62476Oj(T t, g00 g00) throws nt1 {
        return m62477Pj(t, g00, zy0.m74393d());
    }

    /* renamed from: Pj */
    public static <T extends qe1<T, ?>> T m62477Pj(T t, g00 g00, zy0 zy0) throws nt1 {
        return m62493ej(m62487Zj(t, g00, zy0));
    }

    /* renamed from: Qj */
    public static <T extends qe1<T, ?>> T m62478Qj(T t, InputStream inputStream) throws nt1 {
        return m62493ej(m62487Zj(t, g00.m48670j(inputStream), zy0.m74393d()));
    }

    /* renamed from: Rj */
    public static <T extends qe1<T, ?>> T m62479Rj(T t, InputStream inputStream, zy0 zy0) throws nt1 {
        return m62493ej(m62487Zj(t, g00.m48670j(inputStream), zy0));
    }

    /* renamed from: Sj */
    public static <T extends qe1<T, ?>> T m62480Sj(T t, ByteBuffer byteBuffer) throws nt1 {
        return m62481Tj(t, byteBuffer, zy0.m74393d());
    }

    /* renamed from: Tj */
    public static <T extends qe1<T, ?>> T m62481Tj(T t, ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        return m62493ej(m62477Pj(t, g00.m48674n(byteBuffer), zy0));
    }

    /* renamed from: Uj */
    public static <T extends qe1<T, ?>> T m62482Uj(T t, byte[] bArr) throws nt1 {
        return m62493ej(m62488ak(t, bArr, 0, bArr.length, zy0.m74393d()));
    }

    /* renamed from: Vj */
    public static <T extends qe1<T, ?>> T m62483Vj(T t, byte[] bArr, zy0 zy0) throws nt1 {
        return m62493ej(m62488ak(t, bArr, 0, bArr.length, zy0));
    }

    /* renamed from: Wj */
    public static <T extends qe1<T, ?>> T m62484Wj(T t, InputStream inputStream, zy0 zy0) throws nt1 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            g00 j = g00.m48670j(new C7403z0.C7404a.C7405a(inputStream, g00.m48666O(read, inputStream)));
            T Zj = m62487Zj(t, j, zy0);
            try {
                j.mo36435a(0);
                return Zj;
            } catch (nt1 e) {
                throw e.mo41485l(Zj);
            }
        } catch (nt1 e2) {
            e = e2;
            if (e.mo41482a()) {
                e = new nt1((IOException) e);
            }
            throw e;
        } catch (IOException e3) {
            throw new nt1(e3);
        }
    }

    /* renamed from: Xj */
    public static <T extends qe1<T, ?>> T m62485Xj(T t, C5173er erVar, zy0 zy0) throws nt1 {
        T Zj;
        try {
            g00 L = erVar.mo34537L();
            Zj = m62487Zj(t, L, zy0);
            L.mo36435a(0);
            return Zj;
        } catch (nt1 e) {
            throw e.mo41485l(Zj);
        } catch (nt1 e2) {
            throw e2;
        }
    }

    /* renamed from: Yj */
    public static <T extends qe1<T, ?>> T m62486Yj(T t, g00 g00) throws nt1 {
        return m62487Zj(t, g00, zy0.m74393d());
    }

    /* renamed from: Zj */
    public static <T extends qe1<T, ?>> T m62487Zj(T t, g00 g00, zy0 zy0) throws nt1 {
        T t2 = (qe1) t.mo43360hj(C6554i.NEW_MUTABLE_INSTANCE);
        try {
            xr3 j = p63.m60498a().mo42386j(t2);
            j.mo31776j(t2, h00.m50006T(g00), zy0);
            j.mo31774i(t2);
            return t2;
        } catch (nt1 e) {
            e = e;
            if (e.mo41482a()) {
                e = new nt1((IOException) e);
            }
            throw e.mo41485l(t2);
        } catch (IOException e2) {
            if (e2.getCause() instanceof nt1) {
                throw ((nt1) e2.getCause());
            }
            throw new nt1(e2).mo41485l(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof nt1) {
                throw ((nt1) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: ak */
    public static <T extends qe1<T, ?>> T m62488ak(T t, byte[] bArr, int i, int i2, zy0 zy0) throws nt1 {
        T t2 = (qe1) t.mo43360hj(C6554i.NEW_MUTABLE_INSTANCE);
        try {
            xr3 j = p63.m60498a().mo42386j(t2);
            j.mo31768f(t2, bArr, i, i + i2, new C4992da.C4994b(zy0));
            j.mo31774i(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (nt1 e) {
            e = e;
            if (e.mo41482a()) {
                e = new nt1((IOException) e);
            }
            throw e.mo41485l(t2);
        } catch (IOException e2) {
            if (e2.getCause() instanceof nt1) {
                throw ((nt1) e2.getCause());
            }
            throw new nt1(e2).mo41485l(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw nt1.m58791n().mo41485l(t2);
        }
    }

    /* renamed from: bk */
    public static <T extends qe1<T, ?>> T m62490bk(T t, byte[] bArr, zy0 zy0) throws nt1 {
        return m62493ej(m62488ak(t, bArr, 0, bArr.length, zy0));
    }

    /* renamed from: dj */
    public static <MessageType extends C6549e<MessageType, BuilderType>, BuilderType extends C6548d<MessageType, BuilderType>, T> C6553h<MessageType, T> m62491dj(xy0<MessageType, T> xy0) {
        if (xy0.mo47457e()) {
            return (C6553h) xy0;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    /* renamed from: dk */
    public static <T extends qe1<?, ?>> void m62492dk(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: ej */
    public static <T extends qe1<T, ?>> T m62493ej(T t) throws nt1 {
        if (t == null || t.mo43347N1()) {
            return t;
        }
        throw t.mo48081jh().mo43961a().mo41485l(t);
    }

    /* renamed from: kj */
    public static vs1.C7079a m62494kj() {
        return C6126mn.m57426i();
    }

    /* renamed from: lj */
    public static vs1.C7080b m62495lj() {
        return do0.m45459i();
    }

    /* renamed from: mj */
    public static vs1.C7084f m62496mj() {
        return w71.m69188i();
    }

    /* renamed from: nj */
    public static vs1.C7085g m62497nj() {
        return as1.m39036i();
    }

    /* renamed from: oj */
    public static vs1.C7088i m62498oj() {
        return v92.m67804i();
    }

    /* renamed from: pj */
    public static <E> vs1.C7095k<E> m62499pj() {
        return q63.m62153f();
    }

    /* renamed from: rj */
    public static <T extends qe1<?, ?>> T m62500rj(Class<T> cls) {
        T t = (qe1) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (qe1) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((qe1) ko4.m54711l(cls)).mo43344Dd();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: tj */
    public static Method m62501tj(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* renamed from: uj */
    public static Object m62502uj(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: vj */
    public static final <T extends qe1<T, ?>> boolean m62503vj(T t, boolean z) {
        byte byteValue = ((Byte) t.mo43360hj(C6554i.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean h = p63.m60498a().mo42386j(t).mo31772h(t);
        if (z) {
            t.mo43361ij(C6554i.SET_MEMOIZED_IS_INITIALIZED, h ? t : null);
        }
        return h;
    }

    /* renamed from: Gj */
    public final BuilderType mo43350V8() {
        return (C6546b) mo43360hj(C6554i.NEW_BUILDER);
    }

    /* renamed from: Ia */
    public void mo43346Ia(i00 i00) throws IOException {
        p63.m60498a().mo42386j(this).mo31764d(this, j00.m52795T(i00));
    }

    /* renamed from: N1 */
    public final boolean mo43347N1() {
        return m62503vj(this, true);
    }

    /* renamed from: Tc */
    public final cz2<MessageType> mo43348Tc() {
        return (cz2) mo43360hj(C6554i.GET_PARSER);
    }

    /* renamed from: ai */
    public void mo43351ai(int i) {
        this.memoizedSerializedSize = i;
    }

    /* renamed from: cj */
    public Object mo43352cj() throws Exception {
        return mo43360hj(C6554i.BUILD_MESSAGE_INFO);
    }

    /* renamed from: ck */
    public boolean mo43353ck(int i, g00 g00) throws IOException {
        if (wx4.m69699b(i) == 4) {
            return false;
        }
        mo43362qj();
        return this.unknownFields.mo31965i(i, g00);
    }

    /* renamed from: ed */
    public int mo43354ed() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = p63.m60498a().mo42386j(this).mo31766e(this);
        }
        return this.memoizedSerializedSize;
    }

    /* renamed from: ek */
    public final BuilderType mo43349Ud() {
        BuilderType buildertype = (C6546b) mo43360hj(C6554i.NEW_BUILDER);
        buildertype.mo43372Cj(this);
        return buildertype;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return p63.m60498a().mo42386j(this).mo31762c(this, (qe1) obj);
        }
        return false;
    }

    /* renamed from: fj */
    public final <MessageType extends qe1<MessageType, BuilderType>, BuilderType extends C6546b<MessageType, BuilderType>> BuilderType mo43357fj() {
        return (C6546b) mo43360hj(C6554i.NEW_BUILDER);
    }

    /* renamed from: gj */
    public final <MessageType extends qe1<MessageType, BuilderType>, BuilderType extends C6546b<MessageType, BuilderType>> BuilderType mo43358gj(MessageType messagetype) {
        return mo43357fj().mo43372Cj(messagetype);
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int b = p63.m60498a().mo42386j(this).mo31761b(this);
        this.memoizedHashCode = b;
        return b;
    }

    /* renamed from: hj */
    public Object mo43360hj(C6554i iVar) {
        return mo30548jj(iVar, (Object) null, (Object) null);
    }

    /* renamed from: ij */
    public Object mo43361ij(C6554i iVar, Object obj) {
        return mo30548jj(iVar, obj, (Object) null);
    }

    /* renamed from: jj */
    public abstract Object mo30548jj(C6554i iVar, Object obj, Object obj2);

    /* renamed from: qj */
    public final void mo43362qj() {
        if (this.unknownFields == bo4.m40221c()) {
            this.unknownFields = bo4.m40225n();
        }
    }

    /* renamed from: sj */
    public final MessageType mo43344Dd() {
        return (qe1) mo43360hj(C6554i.GET_DEFAULT_INSTANCE);
    }

    public String toString() {
        return ai2.m38715e(this, super.toString());
    }

    /* renamed from: wa */
    public int mo43365wa() {
        return this.memoizedSerializedSize;
    }

    /* renamed from: wj */
    public void mo43366wj() {
        p63.m60498a().mo42386j(this).mo31774i(this);
    }

    /* renamed from: xj */
    public void mo43367xj(int i, C5173er erVar) {
        mo43362qj();
        this.unknownFields.mo31967k(i, erVar);
    }

    /* renamed from: yj */
    public final void mo43368yj(bo4 bo4) {
        this.unknownFields = bo4.m40224m(this.unknownFields, bo4);
    }

    /* renamed from: zj */
    public void mo43369zj(int i, int i2) {
        mo43362qj();
        this.unknownFields.mo31968l(i, i2);
    }
}
