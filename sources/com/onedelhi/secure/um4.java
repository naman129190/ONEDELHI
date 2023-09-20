package com.onedelhi.secure;

import com.onedelhi.secure.ql4;
import com.onedelhi.secure.xl4;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0011\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0016\u0010\u000b\u001a\u00020\u0005*\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0011\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0011\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0017\u0010\u000f\u001a\u00020\u0001*\u00020\u000eH\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u0005*\u00020\u0011H\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001e\u0010\u0016\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0001*\u00020\u000eH\bø\u0001\u0000\u001a\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005*\u00020\u0011H\bø\u0001\u0000\u001a\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u0001*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u0005*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000\u001a!\u0010 \u001a\u00020\u001f*\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\nø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a!\u0010\"\u001a\u00020\u001f*\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\nø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010&\u001a\u00020\u001f*\u00020\u000e2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\u001f*\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u001f\u0010*\u001a\u00020\u001f*\u00020\u00112\u0006\u0010%\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010,\u001a\u00020\u001f*\u00020\u000e2\u0006\u0010%\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u001f\u0010/\u001a\u00020\u001f*\u00020\u000e2\u0006\u0010%\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u001f\u00101\u001a\u00020\u001f*\u00020\u00112\u0006\u0010%\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u001f\u00104\u001a\u00020\u0000*\u00020$2\u0006\u00103\u001a\u00020$H\u0004ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001f\u00106\u001a\u00020\u0000*\u00020\u00012\u0006\u00103\u001a\u00020\u0001H\u0004ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u001f\u00108\u001a\u00020\u0004*\u00020\u00052\u0006\u00103\u001a\u00020\u0005H\u0004ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a\u001f\u0010:\u001a\u00020\u0000*\u00020.2\u0006\u00103\u001a\u00020.H\u0004ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\f\u0010<\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\f\u0010=\u001a\u00020\u0004*\u00020\u0004H\u0007\u001a\u0015\u0010@\u001a\u00020\u0000*\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0004\u001a\u0015\u0010B\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020AH\u0004\u001a\u001f\u0010C\u001a\u00020\u000e*\u00020$2\u0006\u00103\u001a\u00020$H\u0004ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u001f\u0010E\u001a\u00020\u000e*\u00020\u00012\u0006\u00103\u001a\u00020\u0001H\u0004ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u001f\u0010G\u001a\u00020\u0011*\u00020\u00052\u0006\u00103\u001a\u00020\u0005H\u0004ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001a\u001f\u0010I\u001a\u00020\u000e*\u00020.2\u0006\u00103\u001a\u00020.H\u0004ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\u001e\u0010L\u001a\u00020\u0001*\u00020\u00012\u0006\u0010K\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001a\u001e\u0010N\u001a\u00020\u0005*\u00020\u00052\u0006\u0010K\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a\u001e\u0010P\u001a\u00020$*\u00020$2\u0006\u0010K\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\u001e\u0010R\u001a\u00020.*\u00020.2\u0006\u0010K\u001a\u00020.H\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a\u001e\u0010U\u001a\u00020\u0001*\u00020\u00012\u0006\u0010T\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010M\u001a\u001e\u0010V\u001a\u00020\u0005*\u00020\u00052\u0006\u0010T\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\bV\u0010O\u001a\u001e\u0010W\u001a\u00020$*\u00020$2\u0006\u0010T\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\bW\u0010Q\u001a\u001e\u0010X\u001a\u00020.*\u00020.2\u0006\u0010T\u001a\u00020.H\u0007ø\u0001\u0000¢\u0006\u0004\bX\u0010S\u001a&\u0010Y\u001a\u00020\u0001*\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a&\u0010[\u001a\u00020\u0005*\u00020\u00052\u0006\u0010K\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001a&\u0010]\u001a\u00020$*\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010T\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b]\u0010^\u001a&\u0010_\u001a\u00020.*\u00020.2\u0006\u0010K\u001a\u00020.2\u0006\u0010T\u001a\u00020.H\u0007ø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a$\u0010c\u001a\u00020\u0001*\u00020\u00012\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00010aH\u0007ø\u0001\u0000¢\u0006\u0004\bc\u0010d\u001a$\u0010e\u001a\u00020\u0005*\u00020\u00052\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00050aH\u0007ø\u0001\u0000¢\u0006\u0004\be\u0010f\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, d2 = {"Lcom/onedelhi/secure/ql4;", "Lcom/onedelhi/secure/il4;", "A", "(Lcom/onedelhi/secure/ql4;)I", "Lcom/onedelhi/secure/xl4;", "Lcom/onedelhi/secure/tl4;", "B", "(Lcom/onedelhi/secure/xl4;)J", "C", "D", "E", "F", "G", "H", "Lcom/onedelhi/secure/sl4;", "I", "(Lcom/onedelhi/secure/sl4;)I", "Lcom/onedelhi/secure/zl4;", "K", "(Lcom/onedelhi/secure/zl4;)J", "Lcom/onedelhi/secure/me3;", "random", "J", "(Lcom/onedelhi/secure/sl4;Lcom/onedelhi/secure/me3;)I", "L", "(Lcom/onedelhi/secure/zl4;Lcom/onedelhi/secure/me3;)J", "M", "O", "N", "P", "element", "", "t", "(Lcom/onedelhi/secure/sl4;Lcom/onedelhi/secure/il4;)Z", "p", "(Lcom/onedelhi/secure/zl4;Lcom/onedelhi/secure/tl4;)Z", "Lcom/onedelhi/secure/al4;", "value", "o", "(Lcom/onedelhi/secure/sl4;B)Z", "r", "(Lcom/onedelhi/secure/zl4;B)Z", "q", "(Lcom/onedelhi/secure/zl4;I)Z", "u", "(Lcom/onedelhi/secure/sl4;J)Z", "Lcom/onedelhi/secure/xm4;", "s", "(Lcom/onedelhi/secure/sl4;S)Z", "v", "(Lcom/onedelhi/secure/zl4;S)Z", "to", "y", "(BB)Lcom/onedelhi/secure/ql4;", "x", "(II)Lcom/onedelhi/secure/ql4;", "z", "(JJ)Lcom/onedelhi/secure/xl4;", "w", "(SS)Lcom/onedelhi/secure/ql4;", "Q", "R", "", "step", "S", "", "T", "W", "(BB)Lcom/onedelhi/secure/sl4;", "V", "(II)Lcom/onedelhi/secure/sl4;", "X", "(JJ)Lcom/onedelhi/secure/zl4;", "U", "(SS)Lcom/onedelhi/secure/sl4;", "minimumValue", "b", "(II)I", "d", "(JJ)J", "c", "(BB)B", "a", "(SS)S", "maximumValue", "f", "h", "g", "e", "k", "(III)I", "m", "(JJJ)J", "l", "(BBB)B", "j", "(SSS)S", "Lcom/onedelhi/secure/mz;", "range", "n", "(ILcom/onedelhi/secure/mz;)I", "i", "(JLcom/onedelhi/secure/mz;)J", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/ranges/URangesKt")
public class um4 {
    @gz3(version = "1.7")
    /* renamed from: A */
    public static final int m67331A(@vr2 ql4 ql4) {
        jt1.m53777p(ql4, "<this>");
        if (!ql4.isEmpty()) {
            return ql4.mo43663j();
        }
        throw new NoSuchElementException("Progression " + ql4 + " is empty.");
    }

    @gz3(version = "1.7")
    /* renamed from: B */
    public static final long m67332B(@vr2 xl4 xl4) {
        jt1.m53777p(xl4, "<this>");
        if (!xl4.isEmpty()) {
            return xl4.mo47350j();
        }
        throw new NoSuchElementException("Progression " + xl4 + " is empty.");
    }

    @gz3(version = "1.7")
    @ss2
    /* renamed from: C */
    public static final il4 m67333C(@vr2 ql4 ql4) {
        jt1.m53777p(ql4, "<this>");
        if (ql4.isEmpty()) {
            return null;
        }
        return il4.m52414b(ql4.mo43663j());
    }

    @gz3(version = "1.7")
    @ss2
    /* renamed from: D */
    public static final tl4 m67334D(@vr2 xl4 xl4) {
        jt1.m53777p(xl4, "<this>");
        if (xl4.isEmpty()) {
            return null;
        }
        return tl4.m65991b(xl4.mo47350j());
    }

    @gz3(version = "1.7")
    /* renamed from: E */
    public static final int m67335E(@vr2 ql4 ql4) {
        jt1.m53777p(ql4, "<this>");
        if (!ql4.isEmpty()) {
            return ql4.mo43664l();
        }
        throw new NoSuchElementException("Progression " + ql4 + " is empty.");
    }

    @gz3(version = "1.7")
    /* renamed from: F */
    public static final long m67336F(@vr2 xl4 xl4) {
        jt1.m53777p(xl4, "<this>");
        if (!xl4.isEmpty()) {
            return xl4.mo47351l();
        }
        throw new NoSuchElementException("Progression " + xl4 + " is empty.");
    }

    @gz3(version = "1.7")
    @ss2
    /* renamed from: G */
    public static final il4 m67337G(@vr2 ql4 ql4) {
        jt1.m53777p(ql4, "<this>");
        if (ql4.isEmpty()) {
            return null;
        }
        return il4.m52414b(ql4.mo43664l());
    }

    @gz3(version = "1.7")
    @ss2
    /* renamed from: H */
    public static final tl4 m67338H(@vr2 xl4 xl4) {
        jt1.m53777p(xl4, "<this>");
        if (xl4.isEmpty()) {
            return null;
        }
        return tl4.m65991b(xl4.mo47351l());
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @xq1
    /* renamed from: I */
    public static final int m67339I(sl4 sl4) {
        jt1.m53777p(sl4, "<this>");
        return m67340J(sl4, me3.f32085a);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: J */
    public static final int m67340J(@vr2 sl4 sl4, @vr2 me3 me3) {
        jt1.m53777p(sl4, "<this>");
        jt1.m53777p(me3, "random");
        try {
            return sm4.m64745h(me3, sl4);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @xq1
    /* renamed from: K */
    public static final long m67341K(zl4 zl4) {
        jt1.m53777p(zl4, "<this>");
        return m67342L(zl4, me3.f32085a);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: L */
    public static final long m67342L(@vr2 zl4 zl4, @vr2 me3 me3) {
        jt1.m53777p(zl4, "<this>");
        jt1.m53777p(me3, "random");
        try {
            return sm4.m64749l(me3, zl4);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class, oy0.class})
    @xq1
    /* renamed from: M */
    public static final il4 m67343M(sl4 sl4) {
        jt1.m53777p(sl4, "<this>");
        return m67344N(sl4, me3.f32085a);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class, oy0.class})
    @ss2
    /* renamed from: N */
    public static final il4 m67344N(@vr2 sl4 sl4, @vr2 me3 me3) {
        jt1.m53777p(sl4, "<this>");
        jt1.m53777p(me3, "random");
        if (sl4.isEmpty()) {
            return null;
        }
        return il4.m52414b(sm4.m64745h(me3, sl4));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class, oy0.class})
    @xq1
    /* renamed from: O */
    public static final tl4 m67345O(zl4 zl4) {
        jt1.m53777p(zl4, "<this>");
        return m67346P(zl4, me3.f32085a);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class, oy0.class})
    @ss2
    /* renamed from: P */
    public static final tl4 m67346P(@vr2 zl4 zl4, @vr2 me3 me3) {
        jt1.m53777p(zl4, "<this>");
        jt1.m53777p(me3, "random");
        if (zl4.isEmpty()) {
            return null;
        }
        return tl4.m65991b(sm4.m64749l(me3, zl4));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: Q */
    public static final ql4 m67347Q(@vr2 ql4 ql4) {
        jt1.m53777p(ql4, "<this>");
        return ql4.f34305a.mo43667a(ql4.mo43664l(), ql4.mo43663j(), -ql4.mo43665n());
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: R */
    public static final xl4 m67348R(@vr2 xl4 xl4) {
        jt1.m53777p(xl4, "<this>");
        return xl4.f37533a.mo47354a(xl4.mo47351l(), xl4.mo47350j(), -xl4.mo47352n());
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: S */
    public static final ql4 m67349S(@vr2 ql4 ql4, int i) {
        jt1.m53777p(ql4, "<this>");
        cf3.m40866a(i > 0, Integer.valueOf(i));
        ql4.C6591a aVar = ql4.f34305a;
        int j = ql4.mo43663j();
        int l = ql4.mo43664l();
        if (ql4.mo43665n() <= 0) {
            i = -i;
        }
        return aVar.mo43667a(j, l, i);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: T */
    public static final xl4 m67350T(@vr2 xl4 xl4, long j) {
        jt1.m53777p(xl4, "<this>");
        cf3.m40866a(j > 0, Long.valueOf(j));
        xl4.C7270a aVar = xl4.f37533a;
        long j2 = xl4.mo47350j();
        long l = xl4.mo47351l();
        if (xl4.mo47352n() <= 0) {
            j = -j;
        }
        return aVar.mo47354a(j2, l, j);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: U */
    public static final sl4 m67351U(short s, short s2) {
        short s3 = s2 & xm4.f37547c;
        return jt1.m53781t(s3, 0) <= 0 ? sl4.f35140a.mo44411a() : new sl4(il4.m52435s(s & xm4.f37547c), il4.m52435s(il4.m52435s(s3) - 1), (wg0) null);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: V */
    public static final sl4 m67352V(int i, int i2) {
        return mo4.m57477c(i2, 0) <= 0 ? sl4.f35140a.mo44411a() : new sl4(i, il4.m52435s(i2 - 1), (wg0) null);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: W */
    public static final sl4 m67353W(byte b, byte b2) {
        byte b3 = b2 & 255;
        return jt1.m53781t(b3, 0) <= 0 ? sl4.f35140a.mo44411a() : new sl4(il4.m52435s(b & 255), il4.m52435s(il4.m52435s(b3) - 1), (wg0) null);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: X */
    public static final zl4 m67354X(long j, long j2) {
        if (mo4.m57481g(j2, 0) <= 0) {
            return zl4.f38361a.mo48314a();
        }
        return new zl4(j, tl4.m66012s(j2 - tl4.m66012s(((long) 1) & ZipConstants.ZIP64_MAGIC)), (wg0) null);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: a */
    public static final short m67355a(short s, short s2) {
        return jt1.m53781t(s & xm4.f37547c, 65535 & s2) < 0 ? s2 : s;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: b */
    public static final int m67356b(int i, int i2) {
        return mo4.m57477c(i, i2) < 0 ? i2 : i;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: c */
    public static final byte m67357c(byte b, byte b2) {
        return jt1.m53781t(b & 255, b2 & 255) < 0 ? b2 : b;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: d */
    public static final long m67358d(long j, long j2) {
        return mo4.m57481g(j, j2) < 0 ? j2 : j;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: e */
    public static final short m67359e(short s, short s2) {
        return jt1.m53781t(s & xm4.f37547c, 65535 & s2) > 0 ? s2 : s;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: f */
    public static final int m67360f(int i, int i2) {
        return mo4.m57477c(i, i2) > 0 ? i2 : i;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: g */
    public static final byte m67361g(byte b, byte b2) {
        return jt1.m53781t(b & 255, b2 & 255) > 0 ? b2 : b;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: h */
    public static final long m67362h(long j, long j2) {
        return mo4.m57481g(j, j2) > 0 ? j2 : j;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.onedelhi.secure.mz, java.lang.Object, com.onedelhi.secure.mz<com.onedelhi.secure.tl4>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.gz3(version = "1.5")
    @com.onedelhi.secure.tw4(markerClass = {com.onedelhi.secure.oy0.class})
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m67363i(long r2, @com.onedelhi.secure.vr2 com.onedelhi.secure.C6158mz<com.onedelhi.secure.tl4> r4) {
        /*
            java.lang.String r0 = "range"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            boolean r0 = r4 instanceof com.onedelhi.secure.C6069lz
            if (r0 == 0) goto L_0x001a
            com.onedelhi.secure.tl4 r2 = com.onedelhi.secure.tl4.m65991b(r2)
            com.onedelhi.secure.lz r4 = (com.onedelhi.secure.C6069lz) r4
            java.lang.Comparable r2 = com.onedelhi.secure.df3.m45116F(r2, r4)
            com.onedelhi.secure.tl4 r2 = (com.onedelhi.secure.tl4) r2
            long r2 = r2.mo45180r0()
            return r2
        L_0x001a:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0051
            java.lang.Comparable r0 = r4.mo27428i()
            com.onedelhi.secure.tl4 r0 = (com.onedelhi.secure.tl4) r0
            long r0 = r0.mo45180r0()
            int r0 = com.onedelhi.secure.mo4.m57481g(r2, r0)
            if (r0 >= 0) goto L_0x003b
            java.lang.Comparable r2 = r4.mo27428i()
        L_0x0034:
            com.onedelhi.secure.tl4 r2 = (com.onedelhi.secure.tl4) r2
            long r2 = r2.mo45180r0()
            goto L_0x0050
        L_0x003b:
            java.lang.Comparable r0 = r4.mo27427g()
            com.onedelhi.secure.tl4 r0 = (com.onedelhi.secure.tl4) r0
            long r0 = r0.mo45180r0()
            int r0 = com.onedelhi.secure.mo4.m57481g(r2, r0)
            if (r0 <= 0) goto L_0x0050
            java.lang.Comparable r2 = r4.mo27427g()
            goto L_0x0034
        L_0x0050:
            return r2
        L_0x0051:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Cannot coerce value to an empty range: "
            r3.append(r0)
            r3.append(r4)
            r4 = 46
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.um4.m67363i(long, com.onedelhi.secure.mz):long");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: j */
    public static final short m67364j(short s, short s2, short s3) {
        short s4 = s2 & xm4.f37547c;
        short s5 = s3 & xm4.f37547c;
        if (jt1.m53781t(s4, s5) <= 0) {
            short s6 = 65535 & s;
            return jt1.m53781t(s6, s4) < 0 ? s2 : jt1.m53781t(s6, s5) > 0 ? s3 : s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + xm4.m70704k0(s3) + " is less than minimum " + xm4.m70704k0(s2) + '.');
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: k */
    public static final int m67365k(int i, int i2, int i3) {
        if (mo4.m57477c(i2, i3) <= 0) {
            return mo4.m57477c(i, i2) < 0 ? i2 : mo4.m57477c(i, i3) > 0 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + il4.m52428m0(i3) + " is less than minimum " + il4.m52428m0(i2) + '.');
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: l */
    public static final byte m67366l(byte b, byte b2, byte b3) {
        byte b4 = b2 & 255;
        byte b5 = b3 & 255;
        if (jt1.m53781t(b4, b5) <= 0) {
            byte b6 = b & 255;
            return jt1.m53781t(b6, b4) < 0 ? b2 : jt1.m53781t(b6, b5) > 0 ? b3 : b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + al4.m38841k0(b3) + " is less than minimum " + al4.m38841k0(b2) + '.');
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: m */
    public static final long m67367m(long j, long j2, long j3) {
        if (mo4.m57481g(j2, j3) <= 0) {
            return mo4.m57481g(j, j2) < 0 ? j2 : mo4.m57481g(j, j3) > 0 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + tl4.m66005m0(j3) + " is less than minimum " + tl4.m66005m0(j2) + '.');
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.mz, com.onedelhi.secure.mz<com.onedelhi.secure.il4>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.gz3(version = "1.5")
    @com.onedelhi.secure.tw4(markerClass = {com.onedelhi.secure.oy0.class})
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m67368n(int r2, @com.onedelhi.secure.vr2 com.onedelhi.secure.C6158mz<com.onedelhi.secure.il4> r3) {
        /*
            java.lang.String r0 = "range"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            boolean r0 = r3 instanceof com.onedelhi.secure.C6069lz
            if (r0 == 0) goto L_0x001a
            com.onedelhi.secure.il4 r2 = com.onedelhi.secure.il4.m52414b(r2)
            com.onedelhi.secure.lz r3 = (com.onedelhi.secure.C6069lz) r3
            java.lang.Comparable r2 = com.onedelhi.secure.df3.m45116F(r2, r3)
            com.onedelhi.secure.il4 r2 = (com.onedelhi.secure.il4) r2
            int r2 = r2.mo38158r0()
            return r2
        L_0x001a:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0051
            java.lang.Comparable r0 = r3.mo27428i()
            com.onedelhi.secure.il4 r0 = (com.onedelhi.secure.il4) r0
            int r0 = r0.mo38158r0()
            int r0 = com.onedelhi.secure.mo4.m57477c(r2, r0)
            if (r0 >= 0) goto L_0x003b
            java.lang.Comparable r2 = r3.mo27428i()
        L_0x0034:
            com.onedelhi.secure.il4 r2 = (com.onedelhi.secure.il4) r2
            int r2 = r2.mo38158r0()
            goto L_0x0050
        L_0x003b:
            java.lang.Comparable r0 = r3.mo27427g()
            com.onedelhi.secure.il4 r0 = (com.onedelhi.secure.il4) r0
            int r0 = r0.mo38158r0()
            int r0 = com.onedelhi.secure.mo4.m57477c(r2, r0)
            if (r0 <= 0) goto L_0x0050
            java.lang.Comparable r2 = r3.mo27427g()
            goto L_0x0034
        L_0x0050:
            return r2
        L_0x0051:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: "
            r0.append(r1)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.um4.m67368n(int, com.onedelhi.secure.mz):int");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: o */
    public static final boolean m67369o(@vr2 sl4 sl4, byte b) {
        jt1.m53777p(sl4, "$this$contains");
        return sl4.mo44408r(il4.m52435s(b & 255));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @xq1
    /* renamed from: p */
    public static final boolean m67370p(zl4 zl4, tl4 tl4) {
        jt1.m53777p(zl4, "$this$contains");
        return tl4 != null && zl4.mo48311r(tl4.mo45180r0());
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: q */
    public static final boolean m67371q(@vr2 zl4 zl4, int i) {
        jt1.m53777p(zl4, "$this$contains");
        return zl4.mo48311r(tl4.m66012s(((long) i) & ZipConstants.ZIP64_MAGIC));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: r */
    public static final boolean m67372r(@vr2 zl4 zl4, byte b) {
        jt1.m53777p(zl4, "$this$contains");
        return zl4.mo48311r(tl4.m66012s(((long) b) & 255));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: s */
    public static final boolean m67373s(@vr2 sl4 sl4, short s) {
        jt1.m53777p(sl4, "$this$contains");
        return sl4.mo44408r(il4.m52435s(s & xm4.f37547c));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @xq1
    /* renamed from: t */
    public static final boolean m67374t(sl4 sl4, il4 il4) {
        jt1.m53777p(sl4, "$this$contains");
        return il4 != null && sl4.mo44408r(il4.mo38158r0());
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: u */
    public static final boolean m67375u(@vr2 sl4 sl4, long j) {
        jt1.m53777p(sl4, "$this$contains");
        return tl4.m66012s(j >>> 32) == 0 && sl4.mo44408r(il4.m52435s((int) j));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    /* renamed from: v */
    public static final boolean m67376v(@vr2 zl4 zl4, short s) {
        jt1.m53777p(zl4, "$this$contains");
        return zl4.mo48311r(tl4.m66012s(((long) s) & xw4.f37660c));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: w */
    public static final ql4 m67377w(short s, short s2) {
        return ql4.f34305a.mo43667a(il4.m52435s(s & xm4.f37547c), il4.m52435s(s2 & xm4.f37547c), -1);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: x */
    public static final ql4 m67378x(int i, int i2) {
        return ql4.f34305a.mo43667a(i, i2, -1);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: y */
    public static final ql4 m67379y(byte b, byte b2) {
        return ql4.f34305a.mo43667a(il4.m52435s(b & 255), il4.m52435s(b2 & 255), -1);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {oy0.class})
    @vr2
    /* renamed from: z */
    public static final xl4 m67380z(long j, long j2) {
        return xl4.f37533a.mo47354a(j, j2, -1);
    }
}
