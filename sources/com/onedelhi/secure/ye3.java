package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.util.Range;
import com.onedelhi.secure.C6158mz;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\f\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¨\u0006\u000f"}, d2 = {"", "T", "that", "Landroid/util/Range;", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "value", "c", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "b", "a", "Lcom/onedelhi/secure/mz;", "e", "f", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
@SuppressLint({"ClassVerificationFailure"})
public final class ye3 {

    @Metadata(bv = {}, d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u001c\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"com/onedelhi/secure/ye3$a", "Lcom/onedelhi/secure/mz;", "kotlin.jvm.PlatformType", "g", "()Ljava/lang/Comparable;", "endInclusive", "i", "start", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ye3$a */
    public static final class C3993a implements C6158mz<T> {

        /* renamed from: a */
        public final /* synthetic */ Range<T> f23028a;

        public C3993a(Range<T> range) {
            this.f23028a = range;
        }

        /* renamed from: b */
        public boolean mo27426b(@vr2 T t) {
            return C6158mz.C6159a.m57757a(this, t);
        }

        /* renamed from: g */
        public T mo27427g() {
            return this.f23028a.getUpper();
        }

        /* renamed from: i */
        public T mo27428i() {
            return this.f23028a.getLower();
        }

        public boolean isEmpty() {
            return C6158mz.C6159a.m57758b(this);
        }
    }

    @sj3(21)
    @vr2
    /* renamed from: a */
    public static final <T extends Comparable<? super T>> Range<T> m32294a(@vr2 Range<T> range, @vr2 Range<T> range2) {
        jt1.m53777p(range, "<this>");
        jt1.m53777p(range2, "other");
        Range<T> intersect = range.intersect(range2);
        jt1.m53776o(intersect, "intersect(other)");
        return intersect;
    }

    @sj3(21)
    @vr2
    /* renamed from: b */
    public static final <T extends Comparable<? super T>> Range<T> m32295b(@vr2 Range<T> range, @vr2 Range<T> range2) {
        jt1.m53777p(range, "<this>");
        jt1.m53777p(range2, "other");
        Range<T> extend = range.extend(range2);
        jt1.m53776o(extend, "extend(other)");
        return extend;
    }

    @sj3(21)
    @vr2
    /* renamed from: c */
    public static final <T extends Comparable<? super T>> Range<T> m32296c(@vr2 Range<T> range, @vr2 T t) {
        jt1.m53777p(range, "<this>");
        jt1.m53777p(t, "value");
        Range<T> extend = range.extend(t);
        jt1.m53776o(extend, "extend(value)");
        return extend;
    }

    @sj3(21)
    @vr2
    /* renamed from: d */
    public static final <T extends Comparable<? super T>> Range<T> m32297d(@vr2 T t, @vr2 T t2) {
        jt1.m53777p(t, "<this>");
        jt1.m53777p(t2, "that");
        return new Range<>(t, t2);
    }

    @sj3(21)
    @vr2
    /* renamed from: e */
    public static final <T extends Comparable<? super T>> C6158mz<T> m32298e(@vr2 Range<T> range) {
        jt1.m53777p(range, "<this>");
        return new C3993a(range);
    }

    @sj3(21)
    @vr2
    /* renamed from: f */
    public static final <T extends Comparable<? super T>> Range<T> m32299f(@vr2 C6158mz<T> mzVar) {
        jt1.m53777p(mzVar, "<this>");
        return new Range<>(mzVar.mo27428i(), mzVar.mo27427g());
    }
}
