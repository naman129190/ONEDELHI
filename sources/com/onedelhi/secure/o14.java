package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.util.SparseLongArray;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\u0015\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\b\u001a\u001d\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\b\u001a&\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\bø\u0001\u0000\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\b\u001a\r\u0010\u0012\u001a\u00020\u0003*\u00020\u0000H\b\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007\u001aH\u0010\u0019\u001a\u00020\u0007*\u00020\u000026\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\bø\u0001\u0000\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0007\u001a\f\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0007\"\u0016\u0010 \u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0002\u0007\n\u0005\b20\u0001¨\u0006!"}, d2 = {"Landroid/util/SparseLongArray;", "", "key", "", "a", "", "value", "Lcom/onedelhi/secure/un4;", "n", "other", "k", "b", "c", "defaultValue", "e", "Lkotlin/Function0;", "f", "h", "i", "m", "l", "Lkotlin/Function2;", "Lcom/onedelhi/secure/iy2;", "name", "action", "d", "Lcom/onedelhi/secure/ds1;", "j", "Lcom/onedelhi/secure/y92;", "o", "g", "(Landroid/util/SparseLongArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class o14 {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/onedelhi/secure/o14$a", "Lcom/onedelhi/secure/ds1;", "", "hasNext", "", "b", "index", "I", "d", "()I", "f", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.o14$a */
    public static final class C3019a extends ds1 {

        /* renamed from: a */
        public final /* synthetic */ SparseLongArray f17642a;

        /* renamed from: n */
        public int f17643n;

        public C3019a(SparseLongArray sparseLongArray) {
            this.f17642a = sparseLongArray;
        }

        /* renamed from: b */
        public int mo19249b() {
            SparseLongArray sparseLongArray = this.f17642a;
            int i = this.f17643n;
            this.f17643n = i + 1;
            return sparseLongArray.keyAt(i);
        }

        /* renamed from: d */
        public final int mo21554d() {
            return this.f17643n;
        }

        /* renamed from: f */
        public final void mo21555f(int i) {
            this.f17643n = i;
        }

        public boolean hasNext() {
            return this.f17643n < this.f17642a.size();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/onedelhi/secure/o14$b", "Lcom/onedelhi/secure/y92;", "", "hasNext", "", "b", "", "index", "I", "d", "()I", "f", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.o14$b */
    public static final class C3020b extends y92 {

        /* renamed from: a */
        public final /* synthetic */ SparseLongArray f17644a;

        /* renamed from: n */
        public int f17645n;

        public C3020b(SparseLongArray sparseLongArray) {
            this.f17644a = sparseLongArray;
        }

        /* renamed from: b */
        public long mo17159b() {
            SparseLongArray sparseLongArray = this.f17644a;
            int i = this.f17645n;
            this.f17645n = i + 1;
            return sparseLongArray.valueAt(i);
        }

        /* renamed from: d */
        public final int mo21557d() {
            return this.f17645n;
        }

        /* renamed from: f */
        public final void mo21558f(int i) {
            this.f17645n = i;
        }

        public boolean hasNext() {
            return this.f17645n < this.f17644a.size();
        }
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: a */
    public static final boolean m23259a(@vr2 SparseLongArray sparseLongArray, int i) {
        jt1.m53777p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: b */
    public static final boolean m23260b(@vr2 SparseLongArray sparseLongArray, int i) {
        jt1.m53777p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: c */
    public static final boolean m23261c(@vr2 SparseLongArray sparseLongArray, long j) {
        jt1.m53777p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(j) >= 0;
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: d */
    public static final void m23262d(@vr2 SparseLongArray sparseLongArray, @vr2 sc1<? super Integer, ? super Long, un4> sc1) {
        jt1.m53777p(sparseLongArray, "<this>");
        jt1.m53777p(sc1, "action");
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            sc1.mo21054h0(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public static final long m23263e(@vr2 SparseLongArray sparseLongArray, int i, long j) {
        jt1.m53777p(sparseLongArray, "<this>");
        return sparseLongArray.get(i, j);
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: f */
    public static final long m23264f(@vr2 SparseLongArray sparseLongArray, int i, @vr2 cc1<Long> cc1) {
        jt1.m53777p(sparseLongArray, "<this>");
        jt1.m53777p(cc1, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : cc1.invoke().longValue();
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    public static final int m23265g(@vr2 SparseLongArray sparseLongArray) {
        jt1.m53777p(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: h */
    public static final boolean m23266h(@vr2 SparseLongArray sparseLongArray) {
        jt1.m53777p(sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: i */
    public static final boolean m23267i(@vr2 SparseLongArray sparseLongArray) {
        jt1.m53777p(sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: j */
    public static final ds1 m23268j(@vr2 SparseLongArray sparseLongArray) {
        jt1.m53777p(sparseLongArray, "<this>");
        return new C3019a(sparseLongArray);
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: k */
    public static final SparseLongArray m23269k(@vr2 SparseLongArray sparseLongArray, @vr2 SparseLongArray sparseLongArray2) {
        jt1.m53777p(sparseLongArray, "<this>");
        jt1.m53777p(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        m23270l(sparseLongArray3, sparseLongArray);
        m23270l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: l */
    public static final void m23270l(@vr2 SparseLongArray sparseLongArray, @vr2 SparseLongArray sparseLongArray2) {
        jt1.m53777p(sparseLongArray, "<this>");
        jt1.m53777p(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: m */
    public static final boolean m23271m(@vr2 SparseLongArray sparseLongArray, int i, long j) {
        jt1.m53777p(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey < 0 || j != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: n */
    public static final void m23272n(@vr2 SparseLongArray sparseLongArray, int i, long j) {
        jt1.m53777p(sparseLongArray, "<this>");
        sparseLongArray.put(i, j);
    }

    @sj3(18)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: o */
    public static final y92 m23273o(@vr2 SparseLongArray sparseLongArray) {
        jt1.m53777p(sparseLongArray, "<this>");
        return new C3020b(sparseLongArray);
    }
}
