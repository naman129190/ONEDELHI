package com.onedelhi.secure;

import com.onedelhi.secure.vs1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.onedelhi.secure.mn */
public final class C6126mn extends C5351g1<Boolean> implements vs1.C7079a, RandomAccess, x43 {

    /* renamed from: a */
    public static final C6126mn f32185a;

    /* renamed from: a */
    public boolean[] f32186a;

    /* renamed from: o */
    public int f32187o;

    static {
        C6126mn mnVar = new C6126mn(new boolean[0], 0);
        f32185a = mnVar;
        mnVar.mo36496Q0();
    }

    public C6126mn() {
        this(new boolean[10], 0);
    }

    public C6126mn(boolean[] zArr, int i) {
        this.f32186a = zArr;
        this.f32187o = i;
    }

    /* renamed from: i */
    public static C6126mn m57426i() {
        return f32185a;
    }

    /* renamed from: C0 */
    public vs1.C7079a mo31125H1(int i) {
        if (i >= this.f32187o) {
            return new C6126mn(Arrays.copyOf(this.f32186a, i), this.f32187o);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: S0 */
    public void mo40703S0(boolean z) {
        mo36498b();
        int i = this.f32187o;
        boolean[] zArr = this.f32186a;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f32186a = zArr2;
        }
        boolean[] zArr3 = this.f32186a;
        int i2 = this.f32187o;
        this.f32187o = i2 + 1;
        zArr3[i2] = z;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo36498b();
        vs1.m68432d(collection);
        if (!(collection instanceof C6126mn)) {
            return super.addAll(collection);
        }
        C6126mn mnVar = (C6126mn) collection;
        int i = mnVar.f32187o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32187o;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f32186a;
            if (i3 > zArr.length) {
                this.f32186a = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(mnVar.f32186a, 0, this.f32186a, this.f32187o, mnVar.f32187o);
            this.f32187o = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public boolean mo40705d(int i) {
        mo40711j(i);
        return this.f32186a[i];
    }

    /* renamed from: e */
    public void add(int i, Boolean bool) {
        mo40708g(i, bool.booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6126mn)) {
            return super.equals(obj);
        }
        C6126mn mnVar = (C6126mn) obj;
        if (this.f32187o != mnVar.f32187o) {
            return false;
        }
        boolean[] zArr = mnVar.f32186a;
        for (int i = 0; i < this.f32187o; i++) {
            if (this.f32186a[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Boolean bool) {
        mo40703S0(bool.booleanValue());
        return true;
    }

    /* renamed from: g */
    public final void mo40708g(int i, boolean z) {
        int i2;
        mo36498b();
        if (i < 0 || i > (i2 = this.f32187o)) {
            throw new IndexOutOfBoundsException(mo40713l(i));
        }
        boolean[] zArr = this.f32186a;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f32186a, i, zArr2, i + 1, this.f32187o - i);
            this.f32186a = zArr2;
        }
        this.f32186a[i] = z;
        this.f32187o++;
        this.modCount++;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32187o; i2++) {
            i = (i * 31) + vs1.m68439k(this.f32186a[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f32186a[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo40711j(int i) {
        if (i < 0 || i >= this.f32187o) {
            throw new IndexOutOfBoundsException(mo40713l(i));
        }
    }

    /* renamed from: k */
    public Boolean get(int i) {
        return Boolean.valueOf(mo40705d(i));
    }

    /* renamed from: l */
    public final String mo40713l(int i) {
        return "Index:" + i + ", Size:" + this.f32187o;
    }

    /* renamed from: l0 */
    public boolean mo40714l0(int i, boolean z) {
        mo36498b();
        mo40711j(i);
        boolean[] zArr = this.f32186a;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    /* renamed from: n */
    public Boolean remove(int i) {
        mo36498b();
        mo40711j(i);
        boolean[] zArr = this.f32186a;
        boolean z = zArr[i];
        int i2 = this.f32187o;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f32187o--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: o */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo40714l0(i, bool.booleanValue()));
    }

    public void removeRange(int i, int i2) {
        mo36498b();
        if (i2 >= i) {
            boolean[] zArr = this.f32186a;
            System.arraycopy(zArr, i2, zArr, i, this.f32187o - i2);
            this.f32187o -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f32187o;
    }
}
