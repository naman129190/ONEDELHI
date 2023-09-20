package com.onedelhi.secure;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import com.onedelhi.secure.hl3;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public abstract class vs4 {

    /* renamed from: a */
    public static final int f21922a = -1;

    /* renamed from: a */
    public static final String f21923a = "VersionedParcel";

    /* renamed from: b */
    public static final int f21924b = -2;

    /* renamed from: c */
    public static final int f21925c = -3;

    /* renamed from: d */
    public static final int f21926d = -4;

    /* renamed from: e */
    public static final int f21927e = -5;

    /* renamed from: f */
    public static final int f21928f = -6;

    /* renamed from: g */
    public static final int f21929g = -7;

    /* renamed from: h */
    public static final int f21930h = -9;

    /* renamed from: i */
    public static final int f21931i = 1;

    /* renamed from: j */
    public static final int f21932j = 2;

    /* renamed from: k */
    public static final int f21933k = 3;

    /* renamed from: l */
    public static final int f21934l = 4;

    /* renamed from: m */
    public static final int f21935m = 5;

    /* renamed from: n */
    public static final int f21936n = 7;

    /* renamed from: o */
    public static final int f21937o = 8;

    /* renamed from: a */
    public final C3042oa<String, Method> f21938a;

    /* renamed from: b */
    public final C3042oa<String, Method> f21939b;

    /* renamed from: c */
    public final C3042oa<String, Class> f21940c;

    /* renamed from: com.onedelhi.secure.vs4$a */
    public class C3807a extends ObjectInputStream {
        public C3807a(InputStream inputStream) {
            super(inputStream);
        }

        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    /* renamed from: com.onedelhi.secure.vs4$b */
    public static class C3808b extends RuntimeException {
        public C3808b(Throwable th) {
            super(th);
        }
    }

    public vs4(C3042oa<String, Method> oaVar, C3042oa<String, Method> oaVar2, C3042oa<String, Class> oaVar3) {
        this.f21938a = oaVar;
        this.f21939b = oaVar2;
        this.f21940c = oaVar3;
    }

    @mr2
    /* renamed from: f */
    public static Throwable m30314f(@mr2 Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* renamed from: A */
    public double[] mo26202A() {
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        double[] dArr = new double[L];
        for (int i = 0; i < L; i++) {
            dArr[i] = mo26315y();
        }
        return dArr;
    }

    /* renamed from: A0 */
    public final <T> void mo26203A0(Collection<T> collection) {
        if (collection == null) {
            mo26225L0(-1);
            return;
        }
        int size = collection.size();
        mo26225L0(size);
        if (size > 0) {
            int g = mo26271g(collection.iterator().next());
            mo26225L0(g);
            switch (g) {
                case 1:
                    for (T l1 : collection) {
                        mo26288l1(l1);
                    }
                    return;
                case 2:
                    for (T W0 : collection) {
                        mo26247W0(W0);
                    }
                    return;
                case 3:
                    for (T Y0 : collection) {
                        mo26251Y0(Y0);
                    }
                    return;
                case 4:
                    for (T e1 : collection) {
                        mo26268e1(e1);
                    }
                    return;
                case 5:
                    for (T g1 : collection) {
                        mo26273g1(g1);
                    }
                    return;
                case 7:
                    for (T intValue : collection) {
                        mo26225L0(intValue.intValue());
                    }
                    return;
                case 8:
                    for (T floatValue : collection) {
                        mo26217H0(floatValue.floatValue());
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: B */
    public double[] mo26204B(double[] dArr, int i) {
        return !mo26212F(i) ? dArr : mo26202A();
    }

    /* renamed from: B0 */
    public final <T> void mo26205B0(Collection<T> collection, int i) {
        mo26278i0(i);
        mo26203A0(collection);
    }

    /* renamed from: C */
    public final Exception mo26206C(int i, String str) {
        return mo26257b(i, str);
    }

    /* renamed from: C0 */
    public abstract void mo26207C0(double d);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r2 = mo26210E();
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Exception mo26208D(java.lang.Exception r1, int r2) {
        /*
            r0 = this;
            boolean r2 = r0.mo26212F(r2)
            if (r2 != 0) goto L_0x0007
            return r1
        L_0x0007:
            int r2 = r0.mo26210E()
            if (r2 == 0) goto L_0x0015
            java.lang.String r1 = r0.mo26261c0()
            java.lang.Exception r1 = r0.mo26206C(r2, r1)
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vs4.mo26208D(java.lang.Exception, int):java.lang.Exception");
    }

    /* renamed from: D0 */
    public void mo26209D0(double d, int i) {
        mo26278i0(i);
        mo26207C0(d);
    }

    /* renamed from: E */
    public final int mo26210E() {
        return mo26224L();
    }

    /* renamed from: E0 */
    public void mo26211E0(double[] dArr) {
        if (dArr != null) {
            mo26225L0(r0);
            for (double C0 : dArr) {
                mo26207C0(C0);
            }
            return;
        }
        mo26225L0(-1);
    }

    /* renamed from: F */
    public abstract boolean mo26212F(int i);

    /* renamed from: F0 */
    public void mo26213F0(double[] dArr, int i) {
        mo26278i0(i);
        mo26211E0(dArr);
    }

    /* renamed from: G */
    public abstract float mo26214G();

    /* renamed from: G0 */
    public void mo26215G0(Exception exc, int i) {
        mo26278i0(i);
        if (exc == null) {
            mo26245V0();
            return;
        }
        int i2 = 0;
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i2 = -9;
        } else if (exc instanceof SecurityException) {
            i2 = -1;
        } else if (exc instanceof BadParcelableException) {
            i2 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i2 = -3;
        } else if (exc instanceof NullPointerException) {
            i2 = -4;
        } else if (exc instanceof IllegalStateException) {
            i2 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i2 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i2 = -7;
        }
        mo26225L0(i2);
        if (i2 != 0) {
            mo26268e1(exc.getMessage());
            if (i2 == -9) {
                mo26247W0((Parcelable) exc);
            }
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }

    /* renamed from: H */
    public float mo26216H(float f, int i) {
        return !mo26212F(i) ? f : mo26214G();
    }

    /* renamed from: H0 */
    public abstract void mo26217H0(float f);

    /* renamed from: I */
    public float[] mo26218I() {
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        float[] fArr = new float[L];
        for (int i = 0; i < L; i++) {
            fArr[i] = mo26214G();
        }
        return fArr;
    }

    /* renamed from: I0 */
    public void mo26219I0(float f, int i) {
        mo26278i0(i);
        mo26217H0(f);
    }

    /* renamed from: J */
    public float[] mo26220J(float[] fArr, int i) {
        return !mo26212F(i) ? fArr : mo26218I();
    }

    /* renamed from: J0 */
    public void mo26221J0(float[] fArr) {
        if (fArr != null) {
            mo26225L0(r0);
            for (float H0 : fArr) {
                mo26217H0(H0);
            }
            return;
        }
        mo26225L0(-1);
    }

    /* renamed from: K */
    public <T extends ys4> T mo26222K(String str, vs4 vs4) {
        try {
            return (ys4) mo26266e(str).invoke((Object) null, new Object[]{vs4});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: K0 */
    public void mo26223K0(float[] fArr, int i) {
        mo26278i0(i);
        mo26221J0(fArr);
    }

    /* renamed from: L */
    public abstract int mo26224L();

    /* renamed from: L0 */
    public abstract void mo26225L0(int i);

    /* renamed from: M */
    public int mo26226M(int i, int i2) {
        return !mo26212F(i2) ? i : mo26224L();
    }

    /* renamed from: M0 */
    public void mo26227M0(int i, int i2) {
        mo26278i0(i2);
        mo26225L0(i);
    }

    /* renamed from: N */
    public int[] mo26228N() {
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        int[] iArr = new int[L];
        for (int i = 0; i < L; i++) {
            iArr[i] = mo26224L();
        }
        return iArr;
    }

    /* renamed from: N0 */
    public void mo26229N0(int[] iArr) {
        if (iArr != null) {
            mo26225L0(r0);
            for (int L0 : iArr) {
                mo26225L0(L0);
            }
            return;
        }
        mo26225L0(-1);
    }

    /* renamed from: O */
    public int[] mo26230O(int[] iArr, int i) {
        return !mo26212F(i) ? iArr : mo26228N();
    }

    /* renamed from: O0 */
    public void mo26231O0(int[] iArr, int i) {
        mo26278i0(i);
        mo26229N0(iArr);
    }

    /* renamed from: P */
    public <T> List<T> mo26232P(List<T> list, int i) {
        return !mo26212F(i) ? list : (List) mo26313x(new ArrayList());
    }

    /* renamed from: P0 */
    public <T> void mo26233P0(List<T> list, int i) {
        mo26205B0(list, i);
    }

    /* renamed from: Q */
    public abstract long mo26234Q();

    /* renamed from: Q0 */
    public abstract void mo26235Q0(long j);

    /* renamed from: R */
    public long mo26236R(long j, int i) {
        return !mo26212F(i) ? j : mo26234Q();
    }

    /* renamed from: R0 */
    public void mo26237R0(long j, int i) {
        mo26278i0(i);
        mo26235Q0(j);
    }

    /* renamed from: S */
    public long[] mo26238S() {
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        long[] jArr = new long[L];
        for (int i = 0; i < L; i++) {
            jArr[i] = mo26234Q();
        }
        return jArr;
    }

    /* renamed from: S0 */
    public void mo26239S0(long[] jArr) {
        if (jArr != null) {
            mo26225L0(r0);
            for (long Q0 : jArr) {
                mo26235Q0(Q0);
            }
            return;
        }
        mo26225L0(-1);
    }

    /* renamed from: T */
    public long[] mo26240T(long[] jArr, int i) {
        return !mo26212F(i) ? jArr : mo26238S();
    }

    /* renamed from: T0 */
    public void mo26241T0(long[] jArr, int i) {
        mo26278i0(i);
        mo26239S0(jArr);
    }

    /* renamed from: U */
    public <K, V> Map<K, V> mo26242U(Map<K, V> map, int i) {
        if (!mo26212F(i)) {
            return map;
        }
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        C3042oa oaVar = new C3042oa();
        if (L == 0) {
            return oaVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        mo26313x(arrayList);
        mo26313x(arrayList2);
        for (int i2 = 0; i2 < L; i2++) {
            oaVar.put(arrayList.get(i2), arrayList2.get(i2));
        }
        return oaVar;
    }

    /* renamed from: U0 */
    public <K, V> void mo26243U0(Map<K, V> map, int i) {
        mo26278i0(i);
        if (map == null) {
            mo26225L0(-1);
            return;
        }
        int size = map.size();
        mo26225L0(size);
        if (size != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(next.getKey());
                arrayList2.add(next.getValue());
            }
            mo26203A0(arrayList);
            mo26203A0(arrayList2);
        }
    }

    /* renamed from: V */
    public abstract <T extends Parcelable> T mo26244V();

    /* renamed from: V0 */
    public void mo26245V0() {
        mo26225L0(0);
    }

    /* renamed from: W */
    public <T extends Parcelable> T mo26246W(T t, int i) {
        return !mo26212F(i) ? t : mo26244V();
    }

    /* renamed from: W0 */
    public abstract void mo26247W0(Parcelable parcelable);

    /* renamed from: X */
    public Serializable mo26248X() {
        String c0 = mo26261c0();
        if (c0 == null) {
            return null;
        }
        try {
            return (Serializable) new C3807a(new ByteArrayInputStream(mo26303s())).readObject();
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + c0 + pl2.f33727d, e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + c0 + pl2.f33727d, e2);
        }
    }

    /* renamed from: X0 */
    public void mo26249X0(Parcelable parcelable, int i) {
        mo26278i0(i);
        mo26247W0(parcelable);
    }

    /* renamed from: Y */
    public <T> Set<T> mo26250Y(Set<T> set, int i) {
        return !mo26212F(i) ? set : (Set) mo26313x(new C3679ua());
    }

    /* renamed from: Y0 */
    public final void mo26251Y0(Serializable serializable) {
        if (serializable == null) {
            mo26268e1((String) null);
            return;
        }
        String name = serializable.getClass().getName();
        mo26268e1(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            mo26306t0(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + pl2.f33727d, e);
        }
    }

    @sj3(api = 21)
    /* renamed from: Z */
    public Size mo26252Z(Size size, int i) {
        if (!mo26212F(i)) {
            return size;
        }
        if (mo26286l()) {
            return new Size(mo26224L(), mo26224L());
        }
        return null;
    }

    /* renamed from: Z0 */
    public void mo26253Z0(Serializable serializable, int i) {
        mo26278i0(i);
        mo26251Y0(serializable);
    }

    /* renamed from: a */
    public abstract void mo26254a();

    @sj3(api = 21)
    /* renamed from: a0 */
    public SizeF mo26255a0(SizeF sizeF, int i) {
        if (!mo26212F(i)) {
            return sizeF;
        }
        if (mo26286l()) {
            return new SizeF(mo26214G(), mo26214G());
        }
        return null;
    }

    /* renamed from: a1 */
    public <T> void mo26256a1(Set<T> set, int i) {
        mo26205B0(set, i);
    }

    /* renamed from: b */
    public final Exception mo26257b(int i, String str) {
        switch (i) {
            case f21930h /*-9*/:
                return (Exception) mo26244V();
            case f21929g /*-7*/:
                return new UnsupportedOperationException(str);
            case f21928f /*-6*/:
                return new NetworkOnMainThreadException();
            case f21927e /*-5*/:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
            default:
                return new RuntimeException("Unknown exception code: " + i + " msg " + str);
        }
    }

    /* renamed from: b0 */
    public SparseBooleanArray mo26258b0(SparseBooleanArray sparseBooleanArray, int i) {
        if (!mo26212F(i)) {
            return sparseBooleanArray;
        }
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(L);
        for (int i2 = 0; i2 < L; i2++) {
            sparseBooleanArray2.put(mo26224L(), mo26286l());
        }
        return sparseBooleanArray2;
    }

    @sj3(api = 21)
    /* renamed from: b1 */
    public void mo26259b1(Size size, int i) {
        mo26278i0(i);
        mo26290m0(size != null);
        if (size != null) {
            mo26225L0(size.getWidth());
            mo26225L0(size.getHeight());
        }
    }

    /* renamed from: c */
    public abstract vs4 mo26260c();

    /* renamed from: c0 */
    public abstract String mo26261c0();

    @sj3(api = 21)
    /* renamed from: c1 */
    public void mo26262c1(SizeF sizeF, int i) {
        mo26278i0(i);
        mo26290m0(sizeF != null);
        if (sizeF != null) {
            mo26217H0(sizeF.getWidth());
            mo26217H0(sizeF.getHeight());
        }
    }

    /* renamed from: d */
    public final Class mo26263d(Class<? extends ys4> cls) throws ClassNotFoundException {
        Class cls2 = this.f21940c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f21940c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d0 */
    public String mo26264d0(String str, int i) {
        return !mo26212F(i) ? str : mo26261c0();
    }

    /* renamed from: d1 */
    public void mo26265d1(SparseBooleanArray sparseBooleanArray, int i) {
        mo26278i0(i);
        if (sparseBooleanArray == null) {
            mo26225L0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        mo26225L0(size);
        for (int i2 = 0; i2 < size; i2++) {
            mo26225L0(sparseBooleanArray.keyAt(i2));
            mo26290m0(sparseBooleanArray.valueAt(i2));
        }
    }

    /* renamed from: e */
    public final Method mo26266e(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<vs4> cls = vs4.class;
        Method method = this.f21938a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f21938a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e0 */
    public abstract IBinder mo26267e0();

    /* renamed from: e1 */
    public abstract void mo26268e1(String str);

    /* renamed from: f0 */
    public IBinder mo26269f0(IBinder iBinder, int i) {
        return !mo26212F(i) ? iBinder : mo26267e0();
    }

    /* renamed from: f1 */
    public void mo26270f1(String str, int i) {
        mo26278i0(i);
        mo26268e1(str);
    }

    /* renamed from: g */
    public final <T> int mo26271g(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof ys4) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    /* renamed from: g0 */
    public <T extends ys4> T mo26272g0() {
        String c0 = mo26261c0();
        if (c0 == null) {
            return null;
        }
        return mo26222K(c0, mo26260c());
    }

    /* renamed from: g1 */
    public abstract void mo26273g1(IBinder iBinder);

    /* renamed from: h */
    public final Method mo26274h(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f21939b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class d = mo26263d(cls);
        System.currentTimeMillis();
        Method declaredMethod = d.getDeclaredMethod("write", new Class[]{cls, vs4.class});
        this.f21939b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: h0 */
    public <T extends ys4> T mo26275h0(T t, int i) {
        return !mo26212F(i) ? t : mo26272g0();
    }

    /* renamed from: h1 */
    public void mo26276h1(IBinder iBinder, int i) {
        mo26278i0(i);
        mo26273g1(iBinder);
    }

    /* renamed from: i */
    public boolean mo26277i() {
        return false;
    }

    /* renamed from: i0 */
    public abstract void mo26278i0(int i);

    /* renamed from: i1 */
    public abstract void mo26279i1(IInterface iInterface);

    /* renamed from: j */
    public <T> T[] mo26280j(T[] tArr) {
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(L);
        if (L != 0) {
            int L2 = mo26224L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    arrayList.add(mo26272g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    arrayList.add(mo26244V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    arrayList.add(mo26248X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    arrayList.add(mo26261c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    arrayList.add(mo26267e0());
                    L--;
                }
            }
        }
        return arrayList.toArray(tArr);
    }

    /* renamed from: j0 */
    public void mo26281j0(boolean z, boolean z2) {
    }

    /* renamed from: j1 */
    public void mo26282j1(IInterface iInterface, int i) {
        mo26278i0(i);
        mo26279i1(iInterface);
    }

    /* renamed from: k */
    public <T> T[] mo26283k(T[] tArr, int i) {
        return !mo26212F(i) ? tArr : mo26280j(tArr);
    }

    /* renamed from: k0 */
    public <T> void mo26284k0(T[] tArr) {
        if (tArr == null) {
            mo26225L0(-1);
            return;
        }
        int length = tArr.length;
        mo26225L0(length);
        if (length > 0) {
            int i = 0;
            int g = mo26271g(tArr[0]);
            mo26225L0(g);
            if (g == 1) {
                while (i < length) {
                    mo26288l1((ys4) tArr[i]);
                    i++;
                }
            } else if (g == 2) {
                while (i < length) {
                    mo26247W0((Parcelable) tArr[i]);
                    i++;
                }
            } else if (g == 3) {
                while (i < length) {
                    mo26251Y0((Serializable) tArr[i]);
                    i++;
                }
            } else if (g == 4) {
                while (i < length) {
                    mo26268e1((String) tArr[i]);
                    i++;
                }
            } else if (g == 5) {
                while (i < length) {
                    mo26273g1((IBinder) tArr[i]);
                    i++;
                }
            }
        }
    }

    /* renamed from: k1 */
    public <T extends ys4> void mo26285k1(T t, vs4 vs4) {
        try {
            mo26274h(t.getClass()).invoke((Object) null, new Object[]{t, vs4});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: l */
    public abstract boolean mo26286l();

    /* renamed from: l0 */
    public <T> void mo26287l0(T[] tArr, int i) {
        mo26278i0(i);
        mo26284k0(tArr);
    }

    /* renamed from: l1 */
    public void mo26288l1(ys4 ys4) {
        if (ys4 == null) {
            mo26268e1((String) null);
            return;
        }
        mo26294n1(ys4);
        vs4 c = mo26260c();
        mo26285k1(ys4, c);
        c.mo26254a();
    }

    /* renamed from: m */
    public boolean mo26289m(boolean z, int i) {
        return !mo26212F(i) ? z : mo26286l();
    }

    /* renamed from: m0 */
    public abstract void mo26290m0(boolean z);

    /* renamed from: m1 */
    public void mo26291m1(ys4 ys4, int i) {
        mo26278i0(i);
        mo26288l1(ys4);
    }

    /* renamed from: n */
    public boolean[] mo26292n() {
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        boolean[] zArr = new boolean[L];
        for (int i = 0; i < L; i++) {
            zArr[i] = mo26224L() != 0;
        }
        return zArr;
    }

    /* renamed from: n0 */
    public void mo26293n0(boolean z, int i) {
        mo26278i0(i);
        mo26290m0(z);
    }

    /* renamed from: n1 */
    public final void mo26294n1(ys4 ys4) {
        try {
            mo26268e1(mo26263d(ys4.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(ys4.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: o */
    public boolean[] mo26295o(boolean[] zArr, int i) {
        return !mo26212F(i) ? zArr : mo26292n();
    }

    /* renamed from: o0 */
    public void mo26296o0(boolean[] zArr) {
        if (zArr != null) {
            mo26225L0(r0);
            for (boolean z : zArr) {
                mo26225L0(z ? 1 : 0);
            }
            return;
        }
        mo26225L0(-1);
    }

    /* renamed from: p */
    public abstract Bundle mo26297p();

    /* renamed from: p0 */
    public void mo26298p0(boolean[] zArr, int i) {
        mo26278i0(i);
        mo26296o0(zArr);
    }

    /* renamed from: q */
    public Bundle mo26299q(Bundle bundle, int i) {
        return !mo26212F(i) ? bundle : mo26297p();
    }

    /* renamed from: q0 */
    public abstract void mo26300q0(Bundle bundle);

    /* renamed from: r */
    public byte mo26301r(byte b, int i) {
        return !mo26212F(i) ? b : (byte) (mo26224L() & 255);
    }

    /* renamed from: r0 */
    public void mo26302r0(Bundle bundle, int i) {
        mo26278i0(i);
        mo26300q0(bundle);
    }

    /* renamed from: s */
    public abstract byte[] mo26303s();

    /* renamed from: s0 */
    public void mo26304s0(byte b, int i) {
        mo26278i0(i);
        mo26225L0(b);
    }

    /* renamed from: t */
    public byte[] mo26305t(byte[] bArr, int i) {
        return !mo26212F(i) ? bArr : mo26303s();
    }

    /* renamed from: t0 */
    public abstract void mo26306t0(byte[] bArr);

    /* renamed from: u */
    public char[] mo26307u(char[] cArr, int i) {
        if (!mo26212F(i)) {
            return cArr;
        }
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        char[] cArr2 = new char[L];
        for (int i2 = 0; i2 < L; i2++) {
            cArr2[i2] = (char) mo26224L();
        }
        return cArr2;
    }

    /* renamed from: u0 */
    public void mo26308u0(byte[] bArr, int i) {
        mo26278i0(i);
        mo26306t0(bArr);
    }

    /* renamed from: v */
    public abstract CharSequence mo26309v();

    /* renamed from: v0 */
    public abstract void mo26310v0(byte[] bArr, int i, int i2);

    /* renamed from: w */
    public CharSequence mo26311w(CharSequence charSequence, int i) {
        return !mo26212F(i) ? charSequence : mo26309v();
    }

    /* renamed from: w0 */
    public void mo26312w0(byte[] bArr, int i, int i2, int i3) {
        mo26278i0(i3);
        mo26310v0(bArr, i, i2);
    }

    /* renamed from: x */
    public final <T, S extends Collection<T>> S mo26313x(S s) {
        int L = mo26224L();
        if (L < 0) {
            return null;
        }
        if (L != 0) {
            int L2 = mo26224L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    s.add(mo26272g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    s.add(mo26244V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    s.add(mo26248X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    s.add(mo26261c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    s.add(mo26267e0());
                    L--;
                }
            }
        }
        return s;
    }

    /* renamed from: x0 */
    public void mo26314x0(char[] cArr, int i) {
        mo26278i0(i);
        if (cArr != null) {
            mo26225L0(r4);
            for (char L0 : cArr) {
                mo26225L0(L0);
            }
            return;
        }
        mo26225L0(-1);
    }

    /* renamed from: y */
    public abstract double mo26315y();

    /* renamed from: y0 */
    public abstract void mo26316y0(CharSequence charSequence);

    /* renamed from: z */
    public double mo26317z(double d, int i) {
        return !mo26212F(i) ? d : mo26315y();
    }

    /* renamed from: z0 */
    public void mo26318z0(CharSequence charSequence, int i) {
        mo26278i0(i);
        mo26316y0(charSequence);
    }
}
