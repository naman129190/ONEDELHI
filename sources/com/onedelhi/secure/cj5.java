package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class cj5 extends wh5 implements Set {
    @CheckForNull

    /* renamed from: a */
    public transient ui5 f10309a;

    /* renamed from: j */
    public static int m12507j(int i) {
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

    /* renamed from: n */
    public static cj5 m12508n(Object obj, Object obj2) {
        return m12509r(2, obj, obj2);
    }

    /* renamed from: r */
    public static cj5 m12509r(int i, Object... objArr) {
        if (i == 0) {
            return ak5.f9339a;
        }
        if (i != 1) {
            int j = m12507j(i);
            Object[] objArr2 = new Object[j];
            int i2 = j - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                Object obj = objArr[i3];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int a = oh5.m23797a(hashCode);
                    while (true) {
                        int i6 = a & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            a++;
                        } else {
                            objArr[i5] = obj;
                            objArr2[i6] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        }
                    }
                    i3++;
                } else {
                    throw new NullPointerException("at index " + i3);
                }
            }
            Arrays.fill(objArr, i5, i, (Object) null);
            if (i5 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new ik5(obj3);
            }
            if (m12507j(i5) < j / 2) {
                return m12509r(i5, objArr);
            }
            if (i5 <= 0) {
                objArr = Arrays.copyOf(objArr, i5);
            }
            return new ak5(objArr, i4, objArr2, i2, i5);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new ik5(obj4);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cj5) && mo13134o() && ((cj5) obj).mo13134o() && hashCode() != obj.hashCode()) {
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
    public abstract qk5 iterator();

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
    public final ui5 mo14168k() {
        ui5 ui5 = this.f10309a;
        if (ui5 != null) {
            return ui5;
        }
        ui5 l = mo13133l();
        this.f10309a = l;
        return l;
    }

    /* renamed from: l */
    public ui5 mo13133l() {
        Object[] array = toArray();
        int i = ui5.f21390n;
        return ui5.m29372k(array, array.length);
    }

    /* renamed from: o */
    public boolean mo13134o() {
        return false;
    }
}
