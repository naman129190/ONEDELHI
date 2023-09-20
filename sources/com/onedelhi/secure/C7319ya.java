package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aI\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0005*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\n\u001a\u00020\t*\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\u000f\u001a\u00028\u0001\"\u0010\b\u0000\u0010\f*\u0006\u0012\u0002\b\u00030\u0001*\u00028\u0001\"\u0004\b\u0001\u0010\u0005*\u00028\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00012\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001f"}, d2 = {"T", "", "", "j", "([[Ljava/lang/Object;)Ljava/util/List;", "R", "Lcom/onedelhi/secure/ey2;", "m", "([Lcom/onedelhi/secure/ey2;)Lcom/onedelhi/secure/ey2;", "", "l", "([Ljava/lang/Object;)Z", "C", "Lkotlin/Function0;", "defaultValue", "k", "([Ljava/lang/Object;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "other", "g", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "", "h", "([Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "result", "", "processed", "Lcom/onedelhi/secure/un4;", "i", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/ArraysKt")
/* renamed from: com.onedelhi.secure.ya */
public class C7319ya extends C7229xa {
    @uw1(name = "contentDeepEquals")
    @z73
    @gz3(version = "1.3")
    /* renamed from: g */
    public static final <T> boolean m71428g(@ss2 T[] tArr, @ss2 T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            T t = tArr[i];
            T t2 = tArr2[i];
            if (t != t2) {
                if (t == null || t2 == null) {
                    return false;
                }
                if (!(t instanceof Object[]) || !(t2 instanceof Object[])) {
                    if (!(t instanceof byte[]) || !(t2 instanceof byte[])) {
                        if (!(t instanceof short[]) || !(t2 instanceof short[])) {
                            if (!(t instanceof int[]) || !(t2 instanceof int[])) {
                                if (!(t instanceof long[]) || !(t2 instanceof long[])) {
                                    if (!(t instanceof float[]) || !(t2 instanceof float[])) {
                                        if (!(t instanceof double[]) || !(t2 instanceof double[])) {
                                            if (!(t instanceof char[]) || !(t2 instanceof char[])) {
                                                if (!(t instanceof boolean[]) || !(t2 instanceof boolean[])) {
                                                    if (!(t instanceof bl4) || !(t2 instanceof bl4)) {
                                                        if (!(t instanceof ym4) || !(t2 instanceof ym4)) {
                                                            if (!(t instanceof nl4) || !(t2 instanceof nl4)) {
                                                                if (!(t instanceof ul4) || !(t2 instanceof ul4)) {
                                                                    if (!jt1.m53768g(t, t2)) {
                                                                        return false;
                                                                    }
                                                                } else if (!zk4.m73525X0(((ul4) t).mo45649B(), ((ul4) t2).mo45649B())) {
                                                                    return false;
                                                                }
                                                            } else if (!zk4.m73471T0(((nl4) t).mo41113B(), ((nl4) t2).mo41113B())) {
                                                                return false;
                                                            }
                                                        } else if (!zk4.m73458S0(((ym4) t).mo47865B(), ((ym4) t2).mo47865B())) {
                                                            return false;
                                                        }
                                                    } else if (!zk4.m73497V0(((bl4) t).mo31924B(), ((bl4) t2).mo31924B())) {
                                                        return false;
                                                    }
                                                } else if (!Arrays.equals((boolean[]) t, (boolean[]) t2)) {
                                                    return false;
                                                }
                                            } else if (!Arrays.equals((char[]) t, (char[]) t2)) {
                                                return false;
                                            }
                                        } else if (!Arrays.equals((double[]) t, (double[]) t2)) {
                                            return false;
                                        }
                                    } else if (!Arrays.equals((float[]) t, (float[]) t2)) {
                                        return false;
                                    }
                                } else if (!Arrays.equals((long[]) t, (long[]) t2)) {
                                    return false;
                                }
                            } else if (!Arrays.equals((int[]) t, (int[]) t2)) {
                                return false;
                            }
                        } else if (!Arrays.equals((short[]) t, (short[]) t2)) {
                            return false;
                        }
                    } else if (!Arrays.equals((byte[]) t, (byte[]) t2)) {
                        return false;
                    }
                } else if (!m71428g((Object[]) t, (Object[]) t2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @uw1(name = "contentDeepToString")
    @vr2
    @z73
    @gz3(version = "1.3")
    /* renamed from: h */
    public static final <T> String m71429h(@ss2 T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((df3.m45219u(tArr.length, 429496729) * 5) + 2);
        m71430i(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: i */
    public static final <T> void m71430i(T[] tArr, StringBuilder sb, List<Object[]> list) {
        String j1;
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            T t = tArr[i];
            if (t == null) {
                j1 = "null";
            } else if (t instanceof Object[]) {
                m71430i((Object[]) t, sb, list);
            } else {
                if (t instanceof byte[]) {
                    j1 = Arrays.toString((byte[]) t);
                } else if (t instanceof short[]) {
                    j1 = Arrays.toString((short[]) t);
                } else if (t instanceof int[]) {
                    j1 = Arrays.toString((int[]) t);
                } else if (t instanceof long[]) {
                    j1 = Arrays.toString((long[]) t);
                } else if (t instanceof float[]) {
                    j1 = Arrays.toString((float[]) t);
                } else if (t instanceof double[]) {
                    j1 = Arrays.toString((double[]) t);
                } else if (t instanceof char[]) {
                    j1 = Arrays.toString((char[]) t);
                } else if (t instanceof boolean[]) {
                    j1 = Arrays.toString((boolean[]) t);
                } else {
                    j1 = t instanceof bl4 ? zk4.m73693j1(((bl4) t).mo31924B()) : t instanceof ym4 ? zk4.m73749n1(((ym4) t).mo47865B()) : t instanceof nl4 ? zk4.m73735m1(((nl4) t).mo41113B()) : t instanceof ul4 ? zk4.m73777p1(((ul4) t).mo45649B()) : t.toString();
                }
                jt1.m53776o(j1, "toString(this)");
            }
            sb.append(j1);
        }
        sb.append(']');
        list.remove(s00.m64039H(list));
    }

    @vr2
    /* renamed from: j */
    public static final <T> List<T> m71431j(@vr2 T[][] tArr) {
        jt1.m53777p(tArr, "<this>");
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        ArrayList arrayList = new ArrayList(i);
        for (T[] q0 : tArr) {
            x00.m69814q0(arrayList, q0);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.gz3(version = "1.3")
    @com.onedelhi.secure.xq1
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <C extends java.lang.Object & R, R> R m71432k(C r1, com.onedelhi.secure.cc1<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            int r0 = r1.length
            if (r0 != 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 == 0) goto L_0x0011
            java.lang.Object r1 = r2.invoke()
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7319ya.m71432k(java.lang.Object[], com.onedelhi.secure.cc1):java.lang.Object");
    }

    @gz3(version = "1.3")
    @xq1
    /* renamed from: l */
    public static final boolean m71433l(Object[] objArr) {
        if (objArr != null) {
            return objArr.length == 0;
        }
    }

    @vr2
    /* renamed from: m */
    public static final <T, R> ey2<List<T>, List<R>> m71434m(@vr2 ey2<? extends T, ? extends R>[] ey2Arr) {
        jt1.m53777p(ey2Arr, "<this>");
        ArrayList arrayList = new ArrayList(ey2Arr.length);
        ArrayList arrayList2 = new ArrayList(ey2Arr.length);
        for (ey2<? extends T, ? extends R> ey2 : ey2Arr) {
            arrayList.add(ey2.mo35668e());
            arrayList2.add(ey2.mo35670f());
        }
        return yi4.m71797a(arrayList, arrayList2);
    }
}
