package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b\u001a/\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a&\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001aT\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\bø\u0001\u0000\u001a\u0018\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\"\"\u0010&\u001a\u00020#\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%\u0002\u0007\n\u0005\b20\u0001¨\u0006'"}, d2 = {"T", "Landroid/util/LongSparseArray;", "", "key", "", "a", "value", "Lcom/onedelhi/secure/un4;", "n", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "other", "k", "b", "c", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "defaultValue", "e", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "f", "(Landroid/util/LongSparseArray;JLcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "h", "i", "m", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "l", "Lkotlin/Function2;", "Lcom/onedelhi/secure/iy2;", "name", "action", "d", "Lcom/onedelhi/secure/y92;", "j", "", "o", "", "g", "(Landroid/util/LongSparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class ha2 {

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/onedelhi/secure/ha2$a", "Lcom/onedelhi/secure/y92;", "", "hasNext", "", "b", "", "index", "I", "d", "()I", "f", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ha2$a */
    public static final class C2320a extends y92 {

        /* renamed from: a */
        public final /* synthetic */ LongSparseArray<T> f13004a;

        /* renamed from: n */
        public int f13005n;

        public C2320a(LongSparseArray<T> longSparseArray) {
            this.f13004a = longSparseArray;
        }

        @SuppressLint({"ClassVerificationFailure"})
        /* renamed from: b */
        public long mo17159b() {
            LongSparseArray<T> longSparseArray = this.f13004a;
            int i = this.f13005n;
            this.f13005n = i + 1;
            return longSparseArray.keyAt(i);
        }

        /* renamed from: d */
        public final int mo17160d() {
            return this.f13005n;
        }

        /* renamed from: f */
        public final void mo17161f(int i) {
            this.f13005n = i;
        }

        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            return this.f13005n < this.f13004a.size();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/onedelhi/secure/ha2$b", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "index", "I", "a", "()I", "b", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ha2$b */
    public static final class C2321b implements Iterator<T>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ LongSparseArray<T> f13006a;

        /* renamed from: n */
        public int f13007n;

        public C2321b(LongSparseArray<T> longSparseArray) {
            this.f13006a = longSparseArray;
        }

        /* renamed from: a */
        public final int mo17163a() {
            return this.f13007n;
        }

        /* renamed from: b */
        public final void mo17164b(int i) {
            this.f13007n = i;
        }

        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            return this.f13007n < this.f13006a.size();
        }

        @SuppressLint({"ClassVerificationFailure"})
        public T next() {
            LongSparseArray<T> longSparseArray = this.f13006a;
            int i = this.f13007n;
            this.f13007n = i + 1;
            return longSparseArray.valueAt(i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: a */
    public static final <T> boolean m16546a(@vr2 LongSparseArray<T> longSparseArray, long j) {
        jt1.m53777p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j) >= 0;
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: b */
    public static final <T> boolean m16547b(@vr2 LongSparseArray<T> longSparseArray, long j) {
        jt1.m53777p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j) >= 0;
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: c */
    public static final <T> boolean m16548c(@vr2 LongSparseArray<T> longSparseArray, T t) {
        jt1.m53777p(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(t) >= 0;
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: d */
    public static final <T> void m16549d(@vr2 LongSparseArray<T> longSparseArray, @vr2 sc1<? super Long, ? super T, un4> sc1) {
        jt1.m53777p(longSparseArray, "<this>");
        jt1.m53777p(sc1, "action");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            sc1.mo21054h0(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public static final <T> T m16550e(@vr2 LongSparseArray<T> longSparseArray, long j, T t) {
        jt1.m53777p(longSparseArray, "<this>");
        T t2 = longSparseArray.get(j);
        return t2 == null ? t : t2;
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: f */
    public static final <T> T m16551f(@vr2 LongSparseArray<T> longSparseArray, long j, @vr2 cc1<? extends T> cc1) {
        jt1.m53777p(longSparseArray, "<this>");
        jt1.m53777p(cc1, "defaultValue");
        T t = longSparseArray.get(j);
        return t == null ? cc1.invoke() : t;
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    public static final <T> int m16552g(@vr2 LongSparseArray<T> longSparseArray) {
        jt1.m53777p(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: h */
    public static final <T> boolean m16553h(@vr2 LongSparseArray<T> longSparseArray) {
        jt1.m53777p(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: i */
    public static final <T> boolean m16554i(@vr2 LongSparseArray<T> longSparseArray) {
        jt1.m53777p(longSparseArray, "<this>");
        return longSparseArray.size() != 0;
    }

    @sj3(16)
    @vr2
    /* renamed from: j */
    public static final <T> y92 m16555j(@vr2 LongSparseArray<T> longSparseArray) {
        jt1.m53777p(longSparseArray, "<this>");
        return new C2320a(longSparseArray);
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: k */
    public static final <T> LongSparseArray<T> m16556k(@vr2 LongSparseArray<T> longSparseArray, @vr2 LongSparseArray<T> longSparseArray2) {
        jt1.m53777p(longSparseArray, "<this>");
        jt1.m53777p(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        m16557l(longSparseArray3, longSparseArray);
        m16557l(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    @sj3(16)
    /* renamed from: l */
    public static final <T> void m16557l(@vr2 LongSparseArray<T> longSparseArray, @vr2 LongSparseArray<T> longSparseArray2) {
        jt1.m53777p(longSparseArray, "<this>");
        jt1.m53777p(longSparseArray2, "other");
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: m */
    public static final <T> boolean m16558m(@vr2 LongSparseArray<T> longSparseArray, long j, T t) {
        jt1.m53777p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !jt1.m53768g(t, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    @sj3(16)
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: n */
    public static final <T> void m16559n(@vr2 LongSparseArray<T> longSparseArray, long j, T t) {
        jt1.m53777p(longSparseArray, "<this>");
        longSparseArray.put(j, t);
    }

    @sj3(16)
    @vr2
    /* renamed from: o */
    public static final <T> Iterator<T> m16560o(@vr2 LongSparseArray<T> longSparseArray) {
        jt1.m53777p(longSparseArray, "<this>");
        return new C2321b(longSparseArray);
    }
}
