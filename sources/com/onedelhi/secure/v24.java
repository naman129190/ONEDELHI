package com.onedelhi.secure;

import java.util.List;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/v24;", "Lcom/onedelhi/secure/by3;", "Lcom/onedelhi/secure/d34;", "", "subscriptionCount", "Lcom/onedelhi/secure/m81;", "Lcom/onedelhi/secure/zx3;", "a", "", "toString", "", "other", "", "equals", "hashCode", "", "stopTimeout", "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class v24 implements by3 {

    /* renamed from: a */
    public final long f36410a;

    /* renamed from: b */
    public final long f36411b;

    @cf0(mo32326c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", mo32327f = "SharingStarted.kt", mo32328i = {1, 2, 3}, mo32329l = {178, 180, 182, 183, 185}, mo32330m = "invokeSuspend", mo32331n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, mo32332s = {"L$0", "L$0", "L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, d2 = {"Lcom/onedelhi/secure/o81;", "Lcom/onedelhi/secure/zx3;", "", "count", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.v24$a */
    public static final class C7005a extends i84 implements uc1<o81<? super zx3>, Integer, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ v24 f36412a;

        /* renamed from: a */
        public /* synthetic */ Object f36413a;

        /* renamed from: o */
        public int f36414o;

        /* renamed from: p */
        public /* synthetic */ int f36415p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7005a(v24 v24, b80<? super C7005a> b80) {
            super(3, b80);
            this.f36412a = v24;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.onedelhi.secure.o81} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[RETURN] */
        @com.onedelhi.secure.ss2
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo22645D(@com.onedelhi.secure.vr2 java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = com.onedelhi.secure.mt1.m57558h()
                int r1 = r9.f36414o
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x003c
                if (r1 == r6) goto L_0x0038
                if (r1 == r5) goto L_0x0030
                if (r1 == r4) goto L_0x0028
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                goto L_0x0038
            L_0x0018:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0020:
                java.lang.Object r1 = r9.f36413a
                com.onedelhi.secure.o81 r1 = (com.onedelhi.secure.o81) r1
                com.onedelhi.secure.pl3.m61436n(r10)
                goto L_0x008e
            L_0x0028:
                java.lang.Object r1 = r9.f36413a
                com.onedelhi.secure.o81 r1 = (com.onedelhi.secure.o81) r1
                com.onedelhi.secure.pl3.m61436n(r10)
                goto L_0x007d
            L_0x0030:
                java.lang.Object r1 = r9.f36413a
                com.onedelhi.secure.o81 r1 = (com.onedelhi.secure.o81) r1
                com.onedelhi.secure.pl3.m61436n(r10)
                goto L_0x0064
            L_0x0038:
                com.onedelhi.secure.pl3.m61436n(r10)
                goto L_0x009c
            L_0x003c:
                com.onedelhi.secure.pl3.m61436n(r10)
                java.lang.Object r10 = r9.f36413a
                r1 = r10
                com.onedelhi.secure.o81 r1 = (com.onedelhi.secure.o81) r1
                int r10 = r9.f36415p
                if (r10 <= 0) goto L_0x0053
                com.onedelhi.secure.zx3 r10 = com.onedelhi.secure.zx3.START
                r9.f36414o = r6
                java.lang.Object r10 = r1.mo31452c(r10, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x0053:
                com.onedelhi.secure.v24 r10 = r9.f36412a
                long r6 = r10.f36410a
                r9.f36413a = r1
                r9.f36414o = r5
                java.lang.Object r10 = com.onedelhi.secure.fi0.m47884b(r6, r9)
                if (r10 != r0) goto L_0x0064
                return r0
            L_0x0064:
                com.onedelhi.secure.v24 r10 = r9.f36412a
                long r5 = r10.f36411b
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L_0x008e
                com.onedelhi.secure.zx3 r10 = com.onedelhi.secure.zx3.STOP
                r9.f36413a = r1
                r9.f36414o = r4
                java.lang.Object r10 = r1.mo31452c(r10, r9)
                if (r10 != r0) goto L_0x007d
                return r0
            L_0x007d:
                com.onedelhi.secure.v24 r10 = r9.f36412a
                long r4 = r10.f36411b
                r9.f36413a = r1
                r9.f36414o = r3
                java.lang.Object r10 = com.onedelhi.secure.fi0.m47884b(r4, r9)
                if (r10 != r0) goto L_0x008e
                return r0
            L_0x008e:
                com.onedelhi.secure.zx3 r10 = com.onedelhi.secure.zx3.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f36413a = r3
                r9.f36414o = r2
                java.lang.Object r10 = r1.mo31452c(r10, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x009c:
                com.onedelhi.secure.un4 r10 = com.onedelhi.secure.un4.f36206a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.v24.C7005a.mo22645D(java.lang.Object):java.lang.Object");
        }

        @ss2
        /* renamed from: M */
        public final Object mo45938M(@vr2 o81<? super zx3> o81, int i, @ss2 b80<? super un4> b80) {
            C7005a aVar = new C7005a(this.f36412a, b80);
            aVar.f36413a = o81;
            aVar.f36415p = i;
            return aVar.mo22645D(un4.f36206a);
        }

        /* renamed from: o */
        public /* bridge */ /* synthetic */ Object mo34871o(Object obj, Object obj2, Object obj3) {
            return mo45938M((o81) obj, ((Number) obj2).intValue(), (b80) obj3);
        }
    }

    @cf0(mo32326c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", mo32327f = "SharingStarted.kt", mo32328i = {}, mo32329l = {}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, d2 = {"Lcom/onedelhi/secure/zx3;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.v24$b */
    public static final class C7006b extends i84 implements sc1<zx3, b80<? super Boolean>, Object> {

        /* renamed from: a */
        public /* synthetic */ Object f36416a;

        /* renamed from: o */
        public int f36417o;

        public C7006b(b80<? super C7006b> b80) {
            super(2, b80);
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C7006b bVar = new C7006b(b80);
            bVar.f36416a = obj;
            return bVar;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            mt1.m57558h();
            if (this.f36417o == 0) {
                pl3.m61436n(obj);
                return C7377yn.m71912a(((zx3) this.f36416a) != zx3.START);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @ss2
        /* renamed from: M */
        public final Object mo21054h0(@vr2 zx3 zx3, @ss2 b80<? super Boolean> b80) {
            return ((C7006b) mo22644B(zx3, b80)).mo22645D(un4.f36206a);
        }
    }

    public v24(long j, long j2) {
        this.f36410a = j;
        this.f36411b = j2;
        boolean z = true;
        if (j >= 0) {
            if (!(j2 < 0 ? false : z)) {
                throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @vr2
    /* renamed from: a */
    public m81<zx3> mo32186a(@vr2 d34<Integer> d34) {
        return s81.m64352g0(s81.m64364k0(s81.m64334b2(d34, new C7005a(this, (b80<? super C7005a>) null)), new C7006b((b80<? super C7006b>) null)));
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof v24) {
            v24 v24 = (v24) obj;
            return this.f36410a == v24.f36410a && this.f36411b == v24.f36411b;
        }
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (s80.m64248a(this.f36410a) * 31) + s80.m64248a(this.f36411b);
    }

    @vr2
    public String toString() {
        List k = r00.m63299k(2);
        if (this.f36410a > 0) {
            k.add("stopTimeout=" + this.f36410a + "ms");
        }
        if (this.f36411b < Long.MAX_VALUE) {
            k.add("replayExpiration=" + this.f36411b + "ms");
        }
        List b = r00.m63290b(k);
        return "SharingStarted.WhileSubscribed(" + a10.m35851h3(b, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (ec1) null, 63, (Object) null) + ')';
    }
}
