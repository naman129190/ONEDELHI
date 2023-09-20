package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r*\f\b\u0002\u0010\u000f\"\u00020\u000e2\u00020\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "Lkotlin/Function2;", "Lcom/onedelhi/secure/bu3;", "Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/un4;", "", "Lcom/onedelhi/secure/wy0;", "block", "Lcom/onedelhi/secure/zt3;", "b", "(Lcom/onedelhi/secure/sc1;)Lcom/onedelhi/secure/zt3;", "", "a", "(Lcom/onedelhi/secure/sc1;)Ljava/util/Iterator;", "", "State", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/sequences/SequencesKt")
public class du3 {

    /* renamed from: a */
    public static final int f27620a = 0;

    /* renamed from: b */
    public static final int f27621b = 1;

    /* renamed from: c */
    public static final int f27622c = 2;

    /* renamed from: d */
    public static final int f27623d = 3;

    /* renamed from: e */
    public static final int f27624e = 4;

    /* renamed from: f */
    public static final int f27625f = 5;

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/fu3$a", "Lcom/onedelhi/secure/zt3;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.du3$a */
    public static final class C5058a implements zt3<T> {

        /* renamed from: a */
        public final /* synthetic */ sc1 f27626a;

        public C5058a(sc1 sc1) {
            this.f27626a = sc1;
        }

        @vr2
        public Iterator<T> iterator() {
            return du3.m45550a(this.f27626a);
        }
    }

    @gz3(version = "1.3")
    @vr2
    /* renamed from: a */
    public static final <T> Iterator<T> m45550a(@C7381yp @vr2 sc1<? super bu3<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        jt1.m53777p(sc1, "block");
        au3 au3 = new au3();
        au3.mo31196r(lt1.m56481c(sc1, au3, au3));
        return au3;
    }

    @gz3(version = "1.3")
    @vr2
    /* renamed from: b */
    public static final <T> zt3<T> m45551b(@C7381yp @vr2 sc1<? super bu3<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        jt1.m53777p(sc1, "block");
        return new C5058a(sc1);
    }
}
