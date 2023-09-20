package com.onedelhi.secure;

import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002*\u00020\u0004H\u0007\u001a\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002*\u00020\u0007H\u0007\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002*\u00020\nH\u0007\u001a\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u001a\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e*\u00020\u0004H\u0007\u001a\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000e*\u00020\u0007H\u0007\u001a\u0012\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e*\u00020\nH\u0007¨\u0006\u0013"}, d2 = {"T", "Ljava/util/stream/Stream;", "Lcom/onedelhi/secure/zt3;", "e", "Ljava/util/stream/IntStream;", "", "c", "Ljava/util/stream/LongStream;", "", "d", "Ljava/util/stream/DoubleStream;", "", "b", "f", "", "k", "i", "j", "h", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 6, 0}, pn = "kotlin.streams")
@uw1(name = "StreamsKt")
public final class o44 {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/fu3$a", "Lcom/onedelhi/secure/zt3;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.o44$a */
    public static final class C6240a implements zt3<T> {

        /* renamed from: a */
        public final /* synthetic */ Stream f32882a;

        public C6240a(Stream stream) {
            this.f32882a = stream;
        }

        @vr2
        public Iterator<T> iterator() {
            Iterator<T> it = this.f32882a.iterator();
            jt1.m53776o(it, "iterator()");
            return it;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/fu3$a", "Lcom/onedelhi/secure/zt3;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.o44$b */
    public static final class C6241b implements zt3<Integer> {

        /* renamed from: a */
        public final /* synthetic */ IntStream f32883a;

        public C6241b(IntStream intStream) {
            this.f32883a = intStream;
        }

        @vr2
        public Iterator<Integer> iterator() {
            PrimitiveIterator.OfInt it = this.f32883a.iterator();
            jt1.m53776o(it, "iterator()");
            return it;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/fu3$a", "Lcom/onedelhi/secure/zt3;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.o44$c */
    public static final class C6242c implements zt3<Long> {

        /* renamed from: a */
        public final /* synthetic */ LongStream f32884a;

        public C6242c(LongStream longStream) {
            this.f32884a = longStream;
        }

        @vr2
        public Iterator<Long> iterator() {
            PrimitiveIterator.OfLong it = this.f32884a.iterator();
            jt1.m53776o(it, "iterator()");
            return it;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/fu3$a", "Lcom/onedelhi/secure/zt3;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.o44$d */
    public static final class C6243d implements zt3<Double> {

        /* renamed from: a */
        public final /* synthetic */ DoubleStream f32885a;

        public C6243d(DoubleStream doubleStream) {
            this.f32885a = doubleStream;
        }

        @vr2
        public Iterator<Double> iterator() {
            PrimitiveIterator.OfDouble it = this.f32885a.iterator();
            jt1.m53776o(it, "iterator()");
            return it;
        }
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: b */
    public static final zt3<Double> m58911b(@vr2 DoubleStream doubleStream) {
        jt1.m53777p(doubleStream, "<this>");
        return new C6243d(doubleStream);
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: c */
    public static final zt3<Integer> m58912c(@vr2 IntStream intStream) {
        jt1.m53777p(intStream, "<this>");
        return new C6241b(intStream);
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: d */
    public static final zt3<Long> m58913d(@vr2 LongStream longStream) {
        jt1.m53777p(longStream, "<this>");
        return new C6242c(longStream);
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: e */
    public static final <T> zt3<T> m58914e(@vr2 Stream<T> stream) {
        jt1.m53777p(stream, "<this>");
        return new C6240a(stream);
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: f */
    public static final <T> Stream<T> m58915f(@vr2 zt3<? extends T> zt3) {
        jt1.m53777p(zt3, "<this>");
        Stream<T> stream = StreamSupport.stream(new n44(zt3), 16, false);
        jt1.m53776o(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    /* renamed from: g */
    public static final Spliterator m58916g(zt3 zt3) {
        jt1.m53777p(zt3, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(zt3.iterator(), 16);
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: h */
    public static final List<Double> m58917h(@vr2 DoubleStream doubleStream) {
        jt1.m53777p(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        jt1.m53776o(array, "toArray()");
        return C7458za.m72955p(array);
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: i */
    public static final List<Integer> m58918i(@vr2 IntStream intStream) {
        jt1.m53777p(intStream, "<this>");
        int[] array = intStream.toArray();
        jt1.m53776o(array, "toArray()");
        return C7458za.m72969r(array);
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: j */
    public static final List<Long> m58919j(@vr2 LongStream longStream) {
        jt1.m53777p(longStream, "<this>");
        long[] array = longStream.toArray();
        jt1.m53776o(array, "toArray()");
        return C7458za.m72976s(array);
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: k */
    public static final <T> List<T> m58920k(@vr2 Stream<T> stream) {
        jt1.m53777p(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        jt1.m53776o(collect, "collect(Collectors.toList<T>())");
        return (List) collect;
    }
}
