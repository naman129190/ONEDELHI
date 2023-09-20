package com.onedelhi.secure;

import com.onedelhi.secure.vs1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class as1 extends C5351g1<Integer> implements vs1.C7085g, RandomAccess, x43 {

    /* renamed from: a */
    public static final as1 f25986a;

    /* renamed from: a */
    public int[] f25987a;

    /* renamed from: o */
    public int f25988o;

    static {
        as1 as1 = new as1(new int[0], 0);
        f25986a = as1;
        as1.mo36496Q0();
    }

    public as1() {
        this(new int[10], 0);
    }

    public as1(int[] iArr, int i) {
        this.f25987a = iArr;
        this.f25988o = i;
    }

    /* renamed from: i */
    public static as1 m39036i() {
        return f25986a;
    }

    /* renamed from: G0 */
    public void mo31124G0(int i) {
        mo36498b();
        int i2 = this.f25988o;
        int[] iArr = this.f25987a;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f25987a = iArr2;
        }
        int[] iArr3 = this.f25987a;
        int i3 = this.f25988o;
        this.f25988o = i3 + 1;
        iArr3[i3] = i;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo36498b();
        vs1.m68432d(collection);
        if (!(collection instanceof as1)) {
            return super.addAll(collection);
        }
        as1 as1 = (as1) collection;
        int i = as1.f25988o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25988o;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f25987a;
            if (i3 > iArr.length) {
                this.f25987a = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(as1.f25987a, 0, this.f25987a, this.f25988o, as1.f25988o);
            this.f25988o = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public void add(int i, Integer num) {
        mo31134g(i, num.intValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as1)) {
            return super.equals(obj);
        }
        as1 as1 = (as1) obj;
        if (this.f25988o != as1.f25988o) {
            return false;
        }
        int[] iArr = as1.f25987a;
        for (int i = 0; i < this.f25988o; i++) {
            if (this.f25987a[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Integer num) {
        mo31124G0(num.intValue());
        return true;
    }

    /* renamed from: f1 */
    public int mo31133f1(int i, int i2) {
        mo36498b();
        mo31139j(i);
        int[] iArr = this.f25987a;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    /* renamed from: g */
    public final void mo31134g(int i, int i2) {
        int i3;
        mo36498b();
        if (i < 0 || i > (i3 = this.f25988o)) {
            throw new IndexOutOfBoundsException(mo31142l(i));
        }
        int[] iArr = this.f25987a;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f25987a, i, iArr2, i + 1, this.f25988o - i);
            this.f25987a = iArr2;
        }
        this.f25987a[i] = i2;
        this.f25988o++;
        this.modCount++;
    }

    public int getInt(int i) {
        mo31139j(i);
        return this.f25987a[i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25988o; i2++) {
            i = (i * 31) + this.f25987a[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f25987a[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo31139j(int i) {
        if (i < 0 || i >= this.f25988o) {
            throw new IndexOutOfBoundsException(mo31142l(i));
        }
    }

    /* renamed from: j1 */
    public vs1.C7085g mo31125H1(int i) {
        if (i >= this.f25988o) {
            return new as1(Arrays.copyOf(this.f25987a, i), this.f25988o);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    /* renamed from: l */
    public final String mo31142l(int i) {
        return "Index:" + i + ", Size:" + this.f25988o;
    }

    /* renamed from: n */
    public Integer remove(int i) {
        mo36498b();
        mo31139j(i);
        int[] iArr = this.f25987a;
        int i2 = iArr[i];
        int i3 = this.f25988o;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f25988o--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* renamed from: o */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo31133f1(i, num.intValue()));
    }

    public void removeRange(int i, int i2) {
        mo36498b();
        if (i2 >= i) {
            int[] iArr = this.f25987a;
            System.arraycopy(iArr, i2, iArr, i, this.f25988o - i2);
            this.f25988o -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f25988o;
    }
}
