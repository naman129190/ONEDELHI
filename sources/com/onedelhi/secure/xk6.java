package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class xk6 extends uj6 implements Set {
    @CheckForNull

    /* renamed from: a */
    public transient vk6 f22619a;

    /* renamed from: j */
    public static int m31519j(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    @SafeVarargs
    /* renamed from: n */
    public static xk6 m31520n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return m31521r(15, objArr2);
    }

    /* renamed from: r */
    public static xk6 m31521r(int i, Object... objArr) {
        if (i == 0) {
            return fl6.f12145a;
        }
        if (i != 1) {
            int j = m31519j(i);
            Object[] objArr2 = new Object[j];
            int i2 = j - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                bl6.m11947a(obj, i5);
                int hashCode = obj.hashCode();
                int a = oj6.m23837a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a++;
                    } else {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new hl6(obj3);
            }
            if (m31519j(i4) < j / 2) {
                return m31521r(i4, objArr);
            }
            if (i4 < 10) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new fl6(objArr, i3, objArr2, i2, i4);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new hl6(obj4);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof xk6) && mo16064o() && ((xk6) obj).mo16064o() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    /* renamed from: g */
    public abstract jl6 iterator();

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: k */
    public final vk6 mo26984k() {
        vk6 vk6 = this.f22619a;
        if (vk6 != null) {
            return vk6;
        }
        vk6 l = mo16063l();
        this.f22619a = l;
        return l;
    }

    /* renamed from: l */
    public vk6 mo16063l() {
        Object[] array = toArray();
        int i = vk6.f21851n;
        return vk6.m30218k(array, array.length);
    }

    /* renamed from: o */
    public boolean mo16064o() {
        return false;
    }
}
