package com.onedelhi.secure;

import java.util.Comparator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\u001a[\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002 \u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001aC\u0010\f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a_\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0014\u001a\u00020\u0007\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a[\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017\u001a>\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\bø\u0001\u0000\u001aZ\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\bø\u0001\u0000\u001a>\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\bø\u0001\u0000\u001aZ\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\bø\u0001\u0000\u001aR\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\bø\u0001\u0000\u001an\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\bø\u0001\u0000\u001aR\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\bø\u0001\u0000\u001an\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\bø\u0001\u0000\u001ap\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u001028\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00070\u001fH\bø\u0001\u0000\u001aO\u0010$\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010H\u0004\u001aO\u0010%\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010H\u0004\u001a@\u0010'\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\b\b\u0000\u0010\u0000*\u00020&2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010\u001a-\u0010(\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\b\u001a@\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\b\b\u0000\u0010\u0000*\u00020&2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010\u001a-\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\b\u001a&\u0010+\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005\u001a&\u0010,\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005\u001a0\u0010-\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\u0002\u0007\n\u0005\b20\u0001¨\u0006."}, d2 = {"T", "a", "b", "", "Lkotlin/Function1;", "", "selectors", "", "j", "(Ljava/lang/Object;Ljava/lang/Object;[Lcom/onedelhi/secure/ec1;)I", "k", "selector", "h", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)I", "K", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "i", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lcom/onedelhi/secure/ec1;)I", "g", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "d", "([Lcom/onedelhi/secure/ec1;)Ljava/util/Comparator;", "c", "e", "f", "t", "u", "v", "w", "Lkotlin/Function2;", "Lcom/onedelhi/secure/iy2;", "name", "comparison", "x", "s", "y", "", "n", "m", "p", "o", "l", "q", "r", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/comparisons/ComparisonsKt")
public class z10 {

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo38105d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.z10$a */
    public static final class C7412a<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ ec1<T, Comparable<?>>[] f38170a;

        public C7412a(ec1<? super T, ? extends Comparable<?>>[] ec1Arr) {
            this.f38170a = ec1Arr;
        }

        public final int compare(T t, T t2) {
            return z10.m72499k(t, t2, this.f38170a);
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo38105d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.z10$b */
    public static final class C7413b<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ ec1<T, Comparable<?>> f38171a;

        public C7413b(ec1<? super T, ? extends Comparable<?>> ec1) {
            this.f38171a = ec1;
        }

        public final int compare(T t, T t2) {
            ec1<T, Comparable<?>> ec1 = this.f38171a;
            return z10.m72495g(ec1.mo17094X(t), ec1.mo17094X(t2));
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo38105d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.z10$c */
    public static final class C7414c<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ ec1<T, K> f38172a;

        /* renamed from: a */
        public final /* synthetic */ Comparator<? super K> f38173a;

        public C7414c(Comparator<? super K> comparator, ec1<? super T, ? extends K> ec1) {
            this.f38173a = comparator;
            this.f38172a = ec1;
        }

        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.f38173a;
            ec1<T, K> ec1 = this.f38172a;
            return comparator.compare(ec1.mo17094X(t), ec1.mo17094X(t2));
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo38105d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.z10$d */
    public static final class C7415d<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ ec1<T, Comparable<?>> f38174a;

        public C7415d(ec1<? super T, ? extends Comparable<?>> ec1) {
            this.f38174a = ec1;
        }

        public final int compare(T t, T t2) {
            ec1<T, Comparable<?>> ec1 = this.f38174a;
            return z10.m72495g(ec1.mo17094X(t2), ec1.mo17094X(t));
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo38105d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.z10$e */
    public static final class C7416e<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ ec1<T, K> f38175a;

        /* renamed from: a */
        public final /* synthetic */ Comparator<? super K> f38176a;

        public C7416e(Comparator<? super K> comparator, ec1<? super T, ? extends K> ec1) {
            this.f38176a = comparator;
            this.f38175a = ec1;
        }

        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.f38176a;
            ec1<T, K> ec1 = this.f38175a;
            return comparator.compare(ec1.mo17094X(t2), ec1.mo17094X(t));
        }
    }

    @ii2(mo38104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo38105d2 = {"<anonymous>", "", "T", "", "a", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.z10$f */
    public static final class C7417f<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<? super T> f38177a;

        public C7417f(Comparator<? super T> comparator) {
            this.f38177a = comparator;
        }

        public final int compare(@ss2 T t, @ss2 T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return -1;
            }
            if (t2 == null) {
                return 1;
            }
            return this.f38177a.compare(t, t2);
        }
    }

    @ii2(mo38104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo38105d2 = {"<anonymous>", "", "T", "", "a", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.z10$g */
    public static final class C7418g<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<? super T> f38178a;

        public C7418g(Comparator<? super T> comparator) {
            this.f38178a = comparator;
        }

        public final int compare(@ss2 T t, @ss2 T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return 1;
            }
            if (t2 == null) {
                return -1;
            }
            return this.f38178a.compare(t, t2);
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo38105d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.z10$h */
    public static final class C7419h<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f38179a;

        /* renamed from: b */
        public final /* synthetic */ Comparator<? super T> f38180b;

        public C7419h(Comparator<T> comparator, Comparator<? super T> comparator2) {
            this.f38179a = comparator;
            this.f38180b = comparator2;
        }

        public final int compare(T t, T t2) {
            int compare = this.f38179a.compare(t, t2);
            return compare != 0 ? compare : this.f38180b.compare(t, t2);
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo38105d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.z10$i */
    public static final class C7420i<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ ec1<T, Comparable<?>> f38181a;

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f38182a;

        public C7420i(Comparator<T> comparator, ec1<? super T, ? extends Comparable<?>> ec1) {
            this.f38182a = comparator;
            this.f38181a = ec1;
        }

        public final int compare(T t, T t2) {
            int compare = this.f38182a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            ec1<T, Comparable<?>> ec1 = this.f38181a;
            return z10.m72495g(ec1.mo17094X(t), ec1.mo17094X(t2));
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo38105d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.z10$j */
    public static final class C7421j<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ ec1<T, K> f38183a;

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f38184a;

        /* renamed from: b */
        public final /* synthetic */ Comparator<? super K> f38185b;

        public C7421j(Comparator<T> comparator, Comparator<? super K> comparator2, ec1<? super T, ? extends K> ec1) {
            this.f38184a = comparator;
            this.f38185b = comparator2;
            this.f38183a = ec1;
        }

        public final int compare(T t, T t2) {
            int compare = this.f38184a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f38185b;
            ec1<T, K> ec1 = this.f38183a;
            return comparator.compare(ec1.mo17094X(t), ec1.mo17094X(t2));
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo38105d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.z10$k */
    public static final class C7422k<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ ec1<T, Comparable<?>> f38186a;

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f38187a;

        public C7422k(Comparator<T> comparator, ec1<? super T, ? extends Comparable<?>> ec1) {
            this.f38187a = comparator;
            this.f38186a = ec1;
        }

        public final int compare(T t, T t2) {
            int compare = this.f38187a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            ec1<T, Comparable<?>> ec1 = this.f38186a;
            return z10.m72495g(ec1.mo17094X(t2), ec1.mo17094X(t));
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo38105d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.z10$l */
    public static final class C7423l<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ ec1<T, K> f38188a;

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f38189a;

        /* renamed from: b */
        public final /* synthetic */ Comparator<? super K> f38190b;

        public C7423l(Comparator<T> comparator, Comparator<? super K> comparator2, ec1<? super T, ? extends K> ec1) {
            this.f38189a = comparator;
            this.f38190b = comparator2;
            this.f38188a = ec1;
        }

        public final int compare(T t, T t2) {
            int compare = this.f38189a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f38190b;
            ec1<T, K> ec1 = this.f38188a;
            return comparator.compare(ec1.mo17094X(t2), ec1.mo17094X(t));
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo38105d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.z10$m */
    public static final class C7424m<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ sc1<T, T, Integer> f38191a;

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f38192a;

        public C7424m(Comparator<T> comparator, sc1<? super T, ? super T, Integer> sc1) {
            this.f38192a = comparator;
            this.f38191a = sc1;
        }

        public final int compare(T t, T t2) {
            int compare = this.f38192a.compare(t, t2);
            return compare != 0 ? compare : this.f38191a.mo21054h0(t, t2).intValue();
        }
    }

    @ii2(mo38104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo38105d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.z10$n */
    public static final class C7425n<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f38193a;

        /* renamed from: b */
        public final /* synthetic */ Comparator<? super T> f38194b;

        public C7425n(Comparator<T> comparator, Comparator<? super T> comparator2) {
            this.f38193a = comparator;
            this.f38194b = comparator2;
        }

        public final int compare(T t, T t2) {
            int compare = this.f38193a.compare(t, t2);
            return compare != 0 ? compare : this.f38194b.compare(t2, t);
        }
    }

    @xq1
    /* renamed from: b */
    public static final <T> Comparator<T> m72490b(ec1<? super T, ? extends Comparable<?>> ec1) {
        jt1.m53777p(ec1, "selector");
        return new C7413b(ec1);
    }

    @xq1
    /* renamed from: c */
    public static final <T, K> Comparator<T> m72491c(Comparator<? super K> comparator, ec1<? super T, ? extends K> ec1) {
        jt1.m53777p(comparator, "comparator");
        jt1.m53777p(ec1, "selector");
        return new C7414c(comparator, ec1);
    }

    @vr2
    /* renamed from: d */
    public static final <T> Comparator<T> m72492d(@vr2 ec1<? super T, ? extends Comparable<?>>... ec1Arr) {
        jt1.m53777p(ec1Arr, "selectors");
        if (ec1Arr.length > 0) {
            return new C7412a(ec1Arr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @xq1
    /* renamed from: e */
    public static final <T> Comparator<T> m72493e(ec1<? super T, ? extends Comparable<?>> ec1) {
        jt1.m53777p(ec1, "selector");
        return new C7415d(ec1);
    }

    @xq1
    /* renamed from: f */
    public static final <T, K> Comparator<T> m72494f(Comparator<? super K> comparator, ec1<? super T, ? extends K> ec1) {
        jt1.m53777p(comparator, "comparator");
        jt1.m53777p(ec1, "selector");
        return new C7416e(comparator, ec1);
    }

    /* renamed from: g */
    public static final <T extends Comparable<?>> int m72495g(@ss2 T t, @ss2 T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    @xq1
    /* renamed from: h */
    public static final <T> int m72496h(T t, T t2, ec1<? super T, ? extends Comparable<?>> ec1) {
        jt1.m53777p(ec1, "selector");
        return m72495g((Comparable) ec1.mo17094X(t), (Comparable) ec1.mo17094X(t2));
    }

    @xq1
    /* renamed from: i */
    public static final <T, K> int m72497i(T t, T t2, Comparator<? super K> comparator, ec1<? super T, ? extends K> ec1) {
        jt1.m53777p(comparator, "comparator");
        jt1.m53777p(ec1, "selector");
        return comparator.compare(ec1.mo17094X(t), ec1.mo17094X(t2));
    }

    /* renamed from: j */
    public static final <T> int m72498j(T t, T t2, @vr2 ec1<? super T, ? extends Comparable<?>>... ec1Arr) {
        jt1.m53777p(ec1Arr, "selectors");
        if (ec1Arr.length > 0) {
            return m72499k(t, t2, ec1Arr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: k */
    public static final <T> int m72499k(T t, T t2, ec1<? super T, ? extends Comparable<?>>[] ec1Arr) {
        for (ec1<? super T, ? extends Comparable<?>> ec1 : ec1Arr) {
            int g = m72495g((Comparable) ec1.mo17094X(t), (Comparable) ec1.mo17094X(t2));
            if (g != 0) {
                return g;
            }
        }
        return 0;
    }

    @vr2
    /* renamed from: l */
    public static final <T extends Comparable<? super T>> Comparator<T> m72500l() {
        jn2 jn2 = jn2.f30875a;
        jt1.m53775n(jn2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return jn2;
    }

    @xq1
    /* renamed from: m */
    public static final <T extends Comparable<? super T>> Comparator<T> m72501m() {
        return m72502n(m72500l());
    }

    @vr2
    /* renamed from: n */
    public static final <T> Comparator<T> m72502n(@vr2 Comparator<? super T> comparator) {
        jt1.m53777p(comparator, "comparator");
        return new C7417f(comparator);
    }

    @xq1
    /* renamed from: o */
    public static final <T extends Comparable<? super T>> Comparator<T> m72503o() {
        return m72504p(m72500l());
    }

    @vr2
    /* renamed from: p */
    public static final <T> Comparator<T> m72504p(@vr2 Comparator<? super T> comparator) {
        jt1.m53777p(comparator, "comparator");
        return new C7418g(comparator);
    }

    @vr2
    /* renamed from: q */
    public static final <T extends Comparable<? super T>> Comparator<T> m72505q() {
        nm3 nm3 = nm3.f32644a;
        jt1.m53775n(nm3, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return nm3;
    }

    @vr2
    /* renamed from: r */
    public static final <T> Comparator<T> m72506r(@vr2 Comparator<T> comparator) {
        jt1.m53777p(comparator, "<this>");
        if (comparator instanceof om3) {
            return ((om3) comparator).mo41853a();
        }
        Comparator<T> comparator2 = jn2.f30875a;
        if (jt1.m53768g(comparator, comparator2)) {
            nm3 nm3 = nm3.f32644a;
            jt1.m53775n(nm3, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return nm3;
        }
        if (jt1.m53768g(comparator, nm3.f32644a)) {
            jt1.m53775n(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new om3<>(comparator);
        }
        return comparator2;
    }

    @vr2
    /* renamed from: s */
    public static final <T> Comparator<T> m72507s(@vr2 Comparator<T> comparator, @vr2 Comparator<? super T> comparator2) {
        jt1.m53777p(comparator, "<this>");
        jt1.m53777p(comparator2, "comparator");
        return new C7419h(comparator, comparator2);
    }

    @xq1
    /* renamed from: t */
    public static final <T> Comparator<T> m72508t(Comparator<T> comparator, ec1<? super T, ? extends Comparable<?>> ec1) {
        jt1.m53777p(comparator, "<this>");
        jt1.m53777p(ec1, "selector");
        return new C7420i(comparator, ec1);
    }

    @xq1
    /* renamed from: u */
    public static final <T, K> Comparator<T> m72509u(Comparator<T> comparator, Comparator<? super K> comparator2, ec1<? super T, ? extends K> ec1) {
        jt1.m53777p(comparator, "<this>");
        jt1.m53777p(comparator2, "comparator");
        jt1.m53777p(ec1, "selector");
        return new C7421j(comparator, comparator2, ec1);
    }

    @xq1
    /* renamed from: v */
    public static final <T> Comparator<T> m72510v(Comparator<T> comparator, ec1<? super T, ? extends Comparable<?>> ec1) {
        jt1.m53777p(comparator, "<this>");
        jt1.m53777p(ec1, "selector");
        return new C7422k(comparator, ec1);
    }

    @xq1
    /* renamed from: w */
    public static final <T, K> Comparator<T> m72511w(Comparator<T> comparator, Comparator<? super K> comparator2, ec1<? super T, ? extends K> ec1) {
        jt1.m53777p(comparator, "<this>");
        jt1.m53777p(comparator2, "comparator");
        jt1.m53777p(ec1, "selector");
        return new C7423l(comparator, comparator2, ec1);
    }

    @xq1
    /* renamed from: x */
    public static final <T> Comparator<T> m72512x(Comparator<T> comparator, sc1<? super T, ? super T, Integer> sc1) {
        jt1.m53777p(comparator, "<this>");
        jt1.m53777p(sc1, "comparison");
        return new C7424m(comparator, sc1);
    }

    @vr2
    /* renamed from: y */
    public static final <T> Comparator<T> m72513y(@vr2 Comparator<T> comparator, @vr2 Comparator<? super T> comparator2) {
        jt1.m53777p(comparator, "<this>");
        jt1.m53777p(comparator2, "comparator");
        return new C7425n(comparator, comparator2);
    }
}
