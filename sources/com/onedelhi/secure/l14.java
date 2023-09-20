package com.onedelhi.secure;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b\u001a-\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aT\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\bø\u0001\u0000\u001a\u0016\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\"\u0010%\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0002\u0007\n\u0005\b20\u0001¨\u0006&"}, d2 = {"T", "Landroid/util/SparseArray;", "", "key", "", "a", "value", "Lcom/onedelhi/secure/un4;", "n", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "other", "k", "b", "c", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "defaultValue", "e", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "f", "(Landroid/util/SparseArray;ILcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "h", "i", "m", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "l", "Lkotlin/Function2;", "Lcom/onedelhi/secure/iy2;", "name", "action", "d", "Lcom/onedelhi/secure/ds1;", "j", "", "o", "g", "(Landroid/util/SparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class l14 {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/onedelhi/secure/l14$a", "Lcom/onedelhi/secure/ds1;", "", "hasNext", "", "b", "index", "I", "d", "()I", "f", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l14$a */
    public static final class C2688a extends ds1 {

        /* renamed from: a */
        public final /* synthetic */ SparseArray<T> f15136a;

        /* renamed from: n */
        public int f15137n;

        public C2688a(SparseArray<T> sparseArray) {
            this.f15136a = sparseArray;
        }

        /* renamed from: b */
        public int mo19249b() {
            SparseArray<T> sparseArray = this.f15136a;
            int i = this.f15137n;
            this.f15137n = i + 1;
            return sparseArray.keyAt(i);
        }

        /* renamed from: d */
        public final int mo19250d() {
            return this.f15137n;
        }

        /* renamed from: f */
        public final void mo19251f(int i) {
            this.f15137n = i;
        }

        public boolean hasNext() {
            return this.f15137n < this.f15136a.size();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/onedelhi/secure/l14$b", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "index", "I", "a", "()I", "b", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l14$b */
    public static final class C2689b implements Iterator<T>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ SparseArray<T> f15138a;

        /* renamed from: n */
        public int f15139n;

        public C2689b(SparseArray<T> sparseArray) {
            this.f15138a = sparseArray;
        }

        /* renamed from: a */
        public final int mo19253a() {
            return this.f15139n;
        }

        /* renamed from: b */
        public final void mo19254b(int i) {
            this.f15139n = i;
        }

        public boolean hasNext() {
            return this.f15139n < this.f15138a.size();
        }

        public T next() {
            SparseArray<T> sparseArray = this.f15138a;
            int i = this.f15139n;
            this.f15139n = i + 1;
            return sparseArray.valueAt(i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: a */
    public static final <T> boolean m20154a(@vr2 SparseArray<T> sparseArray, int i) {
        jt1.m53777p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    /* renamed from: b */
    public static final <T> boolean m20155b(@vr2 SparseArray<T> sparseArray, int i) {
        jt1.m53777p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    /* renamed from: c */
    public static final <T> boolean m20156c(@vr2 SparseArray<T> sparseArray, T t) {
        jt1.m53777p(sparseArray, "<this>");
        return sparseArray.indexOfValue(t) >= 0;
    }

    /* renamed from: d */
    public static final <T> void m20157d(@vr2 SparseArray<T> sparseArray, @vr2 sc1<? super Integer, ? super T, un4> sc1) {
        jt1.m53777p(sparseArray, "<this>");
        jt1.m53777p(sc1, "action");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sc1.mo21054h0(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    /* renamed from: e */
    public static final <T> T m20158e(@vr2 SparseArray<T> sparseArray, int i, T t) {
        jt1.m53777p(sparseArray, "<this>");
        T t2 = sparseArray.get(i);
        return t2 == null ? t : t2;
    }

    /* renamed from: f */
    public static final <T> T m20159f(@vr2 SparseArray<T> sparseArray, int i, @vr2 cc1<? extends T> cc1) {
        jt1.m53777p(sparseArray, "<this>");
        jt1.m53777p(cc1, "defaultValue");
        T t = sparseArray.get(i);
        return t == null ? cc1.invoke() : t;
    }

    /* renamed from: g */
    public static final <T> int m20160g(@vr2 SparseArray<T> sparseArray) {
        jt1.m53777p(sparseArray, "<this>");
        return sparseArray.size();
    }

    /* renamed from: h */
    public static final <T> boolean m20161h(@vr2 SparseArray<T> sparseArray) {
        jt1.m53777p(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    /* renamed from: i */
    public static final <T> boolean m20162i(@vr2 SparseArray<T> sparseArray) {
        jt1.m53777p(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    @vr2
    /* renamed from: j */
    public static final <T> ds1 m20163j(@vr2 SparseArray<T> sparseArray) {
        jt1.m53777p(sparseArray, "<this>");
        return new C2688a(sparseArray);
    }

    @vr2
    /* renamed from: k */
    public static final <T> SparseArray<T> m20164k(@vr2 SparseArray<T> sparseArray, @vr2 SparseArray<T> sparseArray2) {
        jt1.m53777p(sparseArray, "<this>");
        jt1.m53777p(sparseArray2, "other");
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        m20165l(sparseArray3, sparseArray);
        m20165l(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    /* renamed from: l */
    public static final <T> void m20165l(@vr2 SparseArray<T> sparseArray, @vr2 SparseArray<T> sparseArray2) {
        jt1.m53777p(sparseArray, "<this>");
        jt1.m53777p(sparseArray2, "other");
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    /* renamed from: m */
    public static final <T> boolean m20166m(@vr2 SparseArray<T> sparseArray, int i, T t) {
        jt1.m53777p(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey < 0 || !jt1.m53768g(t, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    /* renamed from: n */
    public static final <T> void m20167n(@vr2 SparseArray<T> sparseArray, int i, T t) {
        jt1.m53777p(sparseArray, "<this>");
        sparseArray.put(i, t);
    }

    @vr2
    /* renamed from: o */
    public static final <T> Iterator<T> m20168o(@vr2 SparseArray<T> sparseArray) {
        jt1.m53777p(sparseArray, "<this>");
        return new C2689b(sparseArray);
    }
}
