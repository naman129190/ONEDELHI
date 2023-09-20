package com.onedelhi.secure;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

public final class vs1 {

    /* renamed from: a */
    public static final int f36662a = 4096;

    /* renamed from: a */
    public static final g00 f36663a;

    /* renamed from: a */
    public static final ByteBuffer f36664a;

    /* renamed from: a */
    public static final Charset f36665a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static final byte[] f36666a;

    /* renamed from: b */
    public static final Charset f36667b = Charset.forName("ISO-8859-1");

    /* renamed from: com.onedelhi.secure.vs1$a */
    public interface C7079a extends C7095k<Boolean> {
        /* renamed from: C0 */
        C7079a mo40702C0(int i);

        /* renamed from: S0 */
        void mo40703S0(boolean z);

        /* renamed from: d */
        boolean mo40705d(int i);

        /* renamed from: l0 */
        boolean mo40714l0(int i, boolean z);
    }

    /* renamed from: com.onedelhi.secure.vs1$b */
    public interface C7080b extends C7095k<Double> {
        /* renamed from: P0 */
        C7080b mo34578P0(int i);

        /* renamed from: V0 */
        void mo34579V0(double d);

        double getDouble(int i);

        /* renamed from: q0 */
        double mo34592q0(int i, double d);
    }

    /* renamed from: com.onedelhi.secure.vs1$c */
    public interface C7081c {
        /* renamed from: j */
        int mo32392j();
    }

    /* renamed from: com.onedelhi.secure.vs1$d */
    public interface C7082d<T extends C7081c> {
        /* renamed from: a */
        T mo32393a(int i);
    }

    /* renamed from: com.onedelhi.secure.vs1$e */
    public interface C7083e {
        /* renamed from: a */
        boolean mo32395a(int i);
    }

    /* renamed from: com.onedelhi.secure.vs1$f */
    public interface C7084f extends C7095k<Float> {
        /* renamed from: b2 */
        void mo46323b2(float f);

        float getFloat(int i);

        /* renamed from: o2 */
        C7084f mo46325o2(int i);

        /* renamed from: p1 */
        float mo46326p1(int i, float f);
    }

    /* renamed from: com.onedelhi.secure.vs1$g */
    public interface C7085g extends C7095k<Integer> {
        /* renamed from: G0 */
        void mo31124G0(int i);

        /* renamed from: f1 */
        int mo31133f1(int i, int i2);

        int getInt(int i);

        /* renamed from: j1 */
        C7085g mo31140j1(int i);
    }

    /* renamed from: com.onedelhi.secure.vs1$h */
    public static class C7086h<F, T> extends AbstractList<T> {

        /* renamed from: a */
        public final C7087a<F, T> f36668a;

        /* renamed from: a */
        public final List<F> f36669a;

        /* renamed from: com.onedelhi.secure.vs1$h$a */
        public interface C7087a<F, T> {
            /* renamed from: a */
            T mo37131a(F f);
        }

        public C7086h(List<F> list, C7087a<F, T> aVar) {
            this.f36669a = list;
            this.f36668a = aVar;
        }

        public T get(int i) {
            return this.f36668a.mo37131a(this.f36669a.get(i));
        }

        public int size() {
            return this.f36669a.size();
        }
    }

    /* renamed from: com.onedelhi.secure.vs1$i */
    public interface C7088i extends C7095k<Long> {
        /* renamed from: C2 */
        C7088i mo46035C2(int i);

        /* renamed from: L1 */
        void mo46036L1(long j);

        /* renamed from: c0 */
        long mo46037c0(int i, long j);

        long getLong(int i);
    }

    /* renamed from: com.onedelhi.secure.vs1$j */
    public static class C7089j<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: a */
        public final C7091b<RealValue, V> f36670a;

        /* renamed from: a */
        public final Map<K, RealValue> f36671a;

        /* renamed from: com.onedelhi.secure.vs1$j$a */
        public static class C7090a implements C7091b<Integer, T> {

            /* renamed from: a */
            public final /* synthetic */ C7081c f36672a;

            /* renamed from: a */
            public final /* synthetic */ C7082d f36673a;

            public C7090a(C7082d dVar, C7081c cVar) {
                this.f36673a = dVar;
                this.f36672a = cVar;
            }

            /* renamed from: c */
            public Integer mo46333b(T t) {
                return Integer.valueOf(t.mo32392j());
            }

            /* renamed from: d */
            public T mo46332a(Integer num) {
                T a = this.f36673a.mo32393a(num.intValue());
                return a == null ? this.f36672a : a;
            }
        }

        /* renamed from: com.onedelhi.secure.vs1$j$b */
        public interface C7091b<A, B> {
            /* renamed from: a */
            B mo46332a(A a);

            /* renamed from: b */
            A mo46333b(B b);
        }

        /* renamed from: com.onedelhi.secure.vs1$j$c */
        public class C7092c implements Map.Entry<K, V> {

            /* renamed from: a */
            public final Map.Entry<K, RealValue> f36675a;

            public C7092c(Map.Entry<K, RealValue> entry) {
                this.f36675a = entry;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
            }

            public K getKey() {
                return this.f36675a.getKey();
            }

            public V getValue() {
                return C7089j.this.f36670a.mo46332a(this.f36675a.getValue());
            }

            public int hashCode() {
                return this.f36675a.hashCode();
            }

            public V setValue(V v) {
                RealValue value = this.f36675a.setValue(C7089j.this.f36670a.mo46333b(v));
                if (value == null) {
                    return null;
                }
                return C7089j.this.f36670a.mo46332a(value);
            }
        }

        /* renamed from: com.onedelhi.secure.vs1$j$d */
        public class C7093d implements Iterator<Map.Entry<K, V>> {

            /* renamed from: a */
            public final Iterator<Map.Entry<K, RealValue>> f36677a;

            public C7093d(Iterator<Map.Entry<K, RealValue>> it) {
                this.f36677a = it;
            }

            /* renamed from: a */
            public Map.Entry<K, V> next() {
                return new C7092c(this.f36677a.next());
            }

            public boolean hasNext() {
                return this.f36677a.hasNext();
            }

            public void remove() {
                this.f36677a.remove();
            }
        }

        /* renamed from: com.onedelhi.secure.vs1$j$e */
        public class C7094e extends AbstractSet<Map.Entry<K, V>> {

            /* renamed from: a */
            public final Set<Map.Entry<K, RealValue>> f36679a;

            public C7094e(Set<Map.Entry<K, RealValue>> set) {
                this.f36679a = set;
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                return new C7093d(this.f36679a.iterator());
            }

            public int size() {
                return this.f36679a.size();
            }
        }

        public C7089j(Map<K, RealValue> map, C7091b<RealValue, V> bVar) {
            this.f36671a = map;
            this.f36670a = bVar;
        }

        /* renamed from: d */
        public static <T extends C7081c> C7091b<Integer, T> m68476d(C7082d<T> dVar, T t) {
            return new C7090a(dVar, t);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return new C7094e(this.f36671a.entrySet());
        }

        public V get(Object obj) {
            RealValue realvalue = this.f36671a.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.f36670a.mo46332a(realvalue);
        }

        public V put(K k, V v) {
            RealValue put = this.f36671a.put(k, this.f36670a.mo46333b(v));
            if (put == null) {
                return null;
            }
            return this.f36670a.mo46332a(put);
        }
    }

    /* renamed from: com.onedelhi.secure.vs1$k */
    public interface C7095k<E> extends List<E>, RandomAccess {
        /* renamed from: H1 */
        C7095k<E> mo31125H1(int i);

        /* renamed from: Q0 */
        void mo36496Q0();

        /* renamed from: p */
        boolean mo36500p();
    }

    static {
        byte[] bArr = new byte[0];
        f36666a = bArr;
        f36664a = ByteBuffer.wrap(bArr);
        f36663a = g00.m48676p(bArr);
    }

    /* renamed from: a */
    public static byte[] m68429a(String str) {
        return str.getBytes(f36667b);
    }

    /* renamed from: b */
    public static ByteBuffer m68430b(String str) {
        return ByteBuffer.wrap(m68429a(str));
    }

    /* renamed from: c */
    public static C5173er m68431c(String str) {
        return C5173er.m47134u(str.getBytes(f36667b));
    }

    /* renamed from: d */
    public static <T> T m68432d(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: e */
    public static <T> T m68433e(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: f */
    public static ByteBuffer m68434f(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    /* renamed from: g */
    public static boolean m68435g(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m68436h(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
    }

    /* renamed from: i */
    public static boolean m68437i(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!m68436h(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static <T extends yh2> T m68438j(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (yh2) method.invoke(method, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get default instance for " + cls, e);
        }
    }

    /* renamed from: k */
    public static int m68439k(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: l */
    public static int m68440l(List<byte[]> list) {
        int i = 1;
        for (byte[] m : list) {
            i = (i * 31) + m68441m(m);
        }
        return i;
    }

    /* renamed from: m */
    public static int m68441m(byte[] bArr) {
        return m68442n(bArr, 0, bArr.length);
    }

    /* renamed from: n */
    public static int m68442n(byte[] bArr, int i, int i2) {
        int w = m68451w(i2, bArr, i, i2);
        if (w == 0) {
            return 1;
        }
        return w;
    }

    /* renamed from: o */
    public static int m68443o(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int w = m68451w(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (w == 0) {
                return 1;
            }
            return w;
        }
        int i = 4096;
        if (byteBuffer.capacity() <= 4096) {
            i = byteBuffer.capacity();
        }
        byte[] bArr = new byte[i];
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        int capacity = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= i ? duplicate.remaining() : i;
            duplicate.get(bArr, 0, remaining);
            capacity = m68451w(capacity, bArr, 0, remaining);
        }
        if (capacity == 0) {
            return 1;
        }
        return capacity;
    }

    /* renamed from: p */
    public static int m68444p(List<ByteBuffer> list) {
        int i = 1;
        for (ByteBuffer o : list) {
            i = (i * 31) + m68443o(o);
        }
        return i;
    }

    /* renamed from: q */
    public static int m68445q(C7081c cVar) {
        return cVar.mo32392j();
    }

    /* renamed from: r */
    public static int m68446r(List<? extends C7081c> list) {
        int i = 1;
        for (C7081c q : list) {
            i = (i * 31) + m68445q(q);
        }
        return i;
    }

    /* renamed from: s */
    public static int m68447s(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: t */
    public static boolean m68448t(C5173er erVar) {
        return erVar.mo34533G();
    }

    /* renamed from: u */
    public static boolean m68449u(byte[] bArr) {
        return hq4.m50771t(bArr);
    }

    /* renamed from: v */
    public static Object m68450v(Object obj, Object obj2) {
        return ((yh2) obj).mo43349Ud().mo47818ia((yh2) obj2).mo43377Ja();
    }

    /* renamed from: w */
    public static int m68451w(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: x */
    public static String m68452x(String str) {
        return new String(str.getBytes(f36667b), f36665a);
    }

    /* renamed from: y */
    public static byte[] m68453y(String str) {
        return str.getBytes(f36665a);
    }

    /* renamed from: z */
    public static String m68454z(byte[] bArr) {
        return new String(bArr, f36665a);
    }
}
