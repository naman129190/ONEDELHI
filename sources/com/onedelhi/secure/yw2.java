package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0017B!\b\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\n\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/yw2;", "Lcom/onedelhi/secure/t0;", "Lcom/onedelhi/secure/fr;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "g", "b", "()I", "size", "", "byteStrings", "[Lcom/onedelhi/secure/fr;", "i", "()[Lcom/onedelhi/secure/fr;", "", "trie", "[I", "j", "()[I", "<init>", "([Lcom/onedelhi/secure/fr;[I)V", "a", "okio"}, k = 1, mv = {1, 4, 0})
public final class yw2 extends C6809t0<C5301fr> implements RandomAccess {

    /* renamed from: a */
    public static final C7395a f38083a = new C7395a((wg0) null);
    @vr2

    /* renamed from: a */
    public final int[] f38084a;
    @vr2

    /* renamed from: a */
    public final C5301fr[] f38085a;

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007JT\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002R\u0018\u0010\u0016\u001a\u00020\b*\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/yw2$a;", "", "", "Lcom/onedelhi/secure/fr;", "byteStrings", "Lcom/onedelhi/secure/yw2;", "d", "([Lcom/onedelhi/secure/fr;)Lcom/onedelhi/secure/yw2;", "", "nodeOffset", "Lcom/onedelhi/secure/no;", "node", "", "byteStringOffset", "", "fromIndex", "toIndex", "indexes", "Lcom/onedelhi/secure/un4;", "a", "c", "(Lcom/onedelhi/secure/no;)J", "intCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.yw2$a */
    public static final class C7395a {
        public C7395a() {
        }

        public /* synthetic */ C7395a(wg0 wg0) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m72287b(C7395a aVar, long j, C6205no noVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.mo48026a((i4 & 1) != 0 ? 0 : j, noVar, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: a */
        public final void mo48026a(long j, C6205no noVar, int i, List<? extends C5301fr> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C6205no noVar2;
            C6205no noVar3 = noVar;
            int i8 = i;
            List<? extends C5301fr> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((C5301fr) list3.get(i11)).mo36274j0() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                C5301fr frVar = (C5301fr) list.get(i2);
                C5301fr frVar2 = (C5301fr) list3.get(i10 - 1);
                if (i8 == frVar.mo36274j0()) {
                    int intValue = list4.get(i9).intValue();
                    int i12 = i9 + 1;
                    i4 = i12;
                    i5 = intValue;
                    frVar = (C5301fr) list3.get(i12);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (frVar.mo36284y(i8) != frVar2.mo36284y(i8)) {
                    int i13 = 1;
                    for (int i14 = i4 + 1; i14 < i10; i14++) {
                        if (((C5301fr) list3.get(i14 - 1)).mo36284y(i8) != ((C5301fr) list3.get(i14)).mo36284y(i8)) {
                            i13++;
                        }
                    }
                    long c = j + mo48027c(noVar3) + ((long) 2) + ((long) (i13 * 2));
                    noVar3.mo41293w0(i13);
                    noVar3.mo41293w0(i5);
                    for (int i15 = i4; i15 < i10; i15++) {
                        byte y = ((C5301fr) list3.get(i15)).mo36284y(i8);
                        if (i15 == i4 || y != ((C5301fr) list3.get(i15 - 1)).mo36284y(i8)) {
                            noVar3.mo41293w0(y & 255);
                        }
                    }
                    C6205no noVar4 = new C6205no();
                    while (i4 < i10) {
                        byte y2 = ((C5301fr) list3.get(i4)).mo36284y(i8);
                        int i16 = i4 + 1;
                        int i17 = i16;
                        while (true) {
                            if (i17 >= i10) {
                                i6 = i10;
                                break;
                            } else if (y2 != ((C5301fr) list3.get(i17)).mo36284y(i8)) {
                                i6 = i17;
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (i16 == i6 && i8 + 1 == ((C5301fr) list3.get(i4)).mo36274j0()) {
                            noVar3.mo41293w0(list4.get(i4).intValue());
                            i7 = i6;
                            noVar2 = noVar4;
                        } else {
                            noVar3.mo41293w0(((int) (c + mo48027c(noVar4))) * -1);
                            i7 = i6;
                            noVar2 = noVar4;
                            mo48026a(c, noVar4, i8 + 1, list, i4, i6, list2);
                        }
                        noVar4 = noVar2;
                        i4 = i7;
                    }
                    noVar3.mo41235N(noVar4);
                    return;
                }
                int min = Math.min(frVar.mo36274j0(), frVar2.mo36274j0());
                int i18 = i8;
                int i19 = 0;
                while (i18 < min && frVar.mo36284y(i18) == frVar2.mo36284y(i18)) {
                    i19++;
                    i18++;
                }
                long c2 = j + mo48027c(noVar3) + ((long) 2) + ((long) i19) + 1;
                noVar3.mo41293w0(-i19);
                noVar3.mo41293w0(i5);
                int i20 = i8 + i19;
                while (i8 < i20) {
                    noVar3.mo41293w0(frVar.mo36284y(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i20 == ((C5301fr) list3.get(i4)).mo36274j0()) {
                        noVar3.mo41293w0(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C6205no noVar5 = new C6205no();
                noVar3.mo41293w0(((int) (mo48027c(noVar5) + c2)) * -1);
                mo48026a(c2, noVar5, i20, list, i4, i3, list2);
                noVar3.mo41235N(noVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: c */
        public final long mo48027c(C6205no noVar) {
            return noVar.mo41244V0() / ((long) 4);
        }

        @zw1
        @vr2
        /* renamed from: d */
        public final yw2 mo48028d(@vr2 C5301fr... frVarArr) {
            C5301fr[] frVarArr2 = frVarArr;
            jt1.m53777p(frVarArr2, "byteStrings");
            int i = 0;
            if (frVarArr2.length == 0) {
                return new yw2(new C5301fr[0], new int[]{0, -1}, (wg0) null);
            }
            List sz = C4478ab.m37546sz(frVarArr);
            w00.m68658k0(sz);
            ArrayList arrayList = new ArrayList(frVarArr2.length);
            for (C5301fr frVar : frVarArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Integer[] numArr = (Integer[]) array;
            List Q = s00.m64048Q((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = frVarArr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                Q.set(s00.m64065y(sz, frVarArr2[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((C5301fr) sz.get(0)).mo36274j0() > 0) {
                int i4 = 0;
                while (i4 < sz.size()) {
                    C5301fr frVar2 = (C5301fr) sz.get(i4);
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < sz.size()) {
                        C5301fr frVar3 = (C5301fr) sz.get(i6);
                        if (!frVar3.mo36275k0(frVar2)) {
                            continue;
                            break;
                        }
                        if (!(frVar3.mo36274j0() != frVar2.mo36274j0())) {
                            throw new IllegalArgumentException(("duplicate option: " + frVar3).toString());
                        } else if (((Number) Q.get(i6)).intValue() > ((Number) Q.get(i4)).intValue()) {
                            sz.remove(i6);
                            Q.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                    i4 = i5;
                }
                C6205no noVar = new C6205no();
                m72287b(this, 0, noVar, 0, sz, 0, 0, Q, 53, (Object) null);
                int[] iArr = new int[((int) mo48027c(noVar))];
                while (!noVar.mo31685f2()) {
                    iArr[i] = noVar.readInt();
                    i++;
                }
                Object[] copyOf = Arrays.copyOf(frVarArr2, frVarArr2.length);
                jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, size)");
                return new yw2((C5301fr[]) copyOf, iArr, (wg0) null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
    }

    public yw2(C5301fr[] frVarArr, int[] iArr) {
        this.f38085a = frVarArr;
        this.f38084a = iArr;
    }

    public /* synthetic */ yw2(C5301fr[] frVarArr, int[] iArr, wg0 wg0) {
        this(frVarArr, iArr);
    }

    @zw1
    @vr2
    /* renamed from: o */
    public static final yw2 m72279o(@vr2 C5301fr... frVarArr) {
        return f38083a.mo48028d(frVarArr);
    }

    /* renamed from: b */
    public int mo34341b() {
        return this.f38085a.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C5301fr) {
            return mo48020f((C5301fr) obj);
        }
        return false;
    }

    /* renamed from: f */
    public /* bridge */ boolean mo48020f(C5301fr frVar) {
        return super.contains(frVar);
    }

    @vr2
    /* renamed from: g */
    public C5301fr get(int i) {
        return this.f38085a[i];
    }

    @vr2
    /* renamed from: i */
    public final C5301fr[] mo48022i() {
        return this.f38085a;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C5301fr) {
            return mo48024l((C5301fr) obj);
        }
        return -1;
    }

    @vr2
    /* renamed from: j */
    public final int[] mo48023j() {
        return this.f38084a;
    }

    /* renamed from: l */
    public /* bridge */ int mo48024l(C5301fr frVar) {
        return super.indexOf(frVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C5301fr) {
            return mo48025n((C5301fr) obj);
        }
        return -1;
    }

    /* renamed from: n */
    public /* bridge */ int mo48025n(C5301fr frVar) {
        return super.lastIndexOf(frVar);
    }
}
