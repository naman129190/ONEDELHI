package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@hl3({hl3.C2354a.f13188c})
public class bn3 implements q74, p74 {
    @hw4

    /* renamed from: a */
    public static final TreeMap<Integer, bn3> f9891a = new TreeMap<>();
    @hw4

    /* renamed from: p */
    public static final int f9892p = 15;
    @hw4

    /* renamed from: q */
    public static final int f9893q = 10;

    /* renamed from: r */
    public static final int f9894r = 1;

    /* renamed from: s */
    public static final int f9895s = 2;

    /* renamed from: t */
    public static final int f9896t = 3;

    /* renamed from: u */
    public static final int f9897u = 4;

    /* renamed from: v */
    public static final int f9898v = 5;
    @hw4

    /* renamed from: a */
    public final double[] f9899a;

    /* renamed from: a */
    public final int[] f9900a;
    @hw4

    /* renamed from: a */
    public final long[] f9901a;
    @hw4

    /* renamed from: a */
    public final String[] f9902a;
    @hw4

    /* renamed from: a */
    public final byte[][] f9903a;

    /* renamed from: b */
    public volatile String f9904b;
    @hw4

    /* renamed from: n */
    public final int f9905n;
    @hw4

    /* renamed from: o */
    public int f9906o;

    /* renamed from: com.onedelhi.secure.bn3$a */
    public class C1796a implements p74 {
        public C1796a() {
        }

        /* renamed from: B2 */
        public void mo13596B2(int i, long j) {
            bn3.this.mo13596B2(i, j);
        }

        /* renamed from: I2 */
        public void mo13598I2() {
            bn3.this.mo13598I2();
        }

        /* renamed from: J0 */
        public void mo13599J0(int i) {
            bn3.this.mo13599J0(i);
        }

        /* renamed from: P1 */
        public void mo13600P1(int i, double d) {
            bn3.this.mo13600P1(i, d);
        }

        public void close() {
        }

        /* renamed from: m2 */
        public void mo13605m2(int i, String str) {
            bn3.this.mo13605m2(i, str);
        }

        /* renamed from: w */
        public void mo13606w(int i, byte[] bArr) {
            bn3.this.mo13606w(i, bArr);
        }
    }

    public bn3(int i) {
        this.f9905n = i;
        int i2 = i + 1;
        this.f9900a = new int[i2];
        this.f9901a = new long[i2];
        this.f9899a = new double[i2];
        this.f9902a = new String[i2];
        this.f9903a = new byte[i2][];
    }

    /* renamed from: d */
    public static bn3 m11970d(String str, int i) {
        TreeMap<Integer, bn3> treeMap = f9891a;
        synchronized (treeMap) {
            Map.Entry<Integer, bn3> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                bn3 value = ceilingEntry.getValue();
                value.mo13772l(str, i);
                return value;
            }
            bn3 bn3 = new bn3(i);
            bn3.mo13772l(str, i);
            return bn3;
        }
    }

    /* renamed from: h */
    public static bn3 m11971h(q74 q74) {
        bn3 d = m11970d(q74.mo13768b(), q74.mo13769c());
        q74.mo13767a(new C1796a());
        return d;
    }

    /* renamed from: m */
    public static void m11972m() {
        TreeMap<Integer, bn3> treeMap = f9891a;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: B2 */
    public void mo13596B2(int i, long j) {
        this.f9900a[i] = 2;
        this.f9901a[i] = j;
    }

    /* renamed from: I2 */
    public void mo13598I2() {
        Arrays.fill(this.f9900a, 1);
        Arrays.fill(this.f9902a, (Object) null);
        Arrays.fill(this.f9903a, (Object) null);
        this.f9904b = null;
    }

    /* renamed from: J0 */
    public void mo13599J0(int i) {
        this.f9900a[i] = 1;
    }

    /* renamed from: P1 */
    public void mo13600P1(int i, double d) {
        this.f9900a[i] = 3;
        this.f9899a[i] = d;
    }

    /* renamed from: a */
    public void mo13767a(p74 p74) {
        for (int i = 1; i <= this.f9906o; i++) {
            int i2 = this.f9900a[i];
            if (i2 == 1) {
                p74.mo13599J0(i);
            } else if (i2 == 2) {
                p74.mo13596B2(i, this.f9901a[i]);
            } else if (i2 == 3) {
                p74.mo13600P1(i, this.f9899a[i]);
            } else if (i2 == 4) {
                p74.mo13605m2(i, this.f9902a[i]);
            } else if (i2 == 5) {
                p74.mo13606w(i, this.f9903a[i]);
            }
        }
    }

    /* renamed from: b */
    public String mo13768b() {
        return this.f9904b;
    }

    /* renamed from: c */
    public int mo13769c() {
        return this.f9906o;
    }

    public void close() {
    }

    /* renamed from: g */
    public void mo13771g(bn3 bn3) {
        int c = bn3.mo13769c() + 1;
        System.arraycopy(bn3.f9900a, 0, this.f9900a, 0, c);
        System.arraycopy(bn3.f9901a, 0, this.f9901a, 0, c);
        System.arraycopy(bn3.f9902a, 0, this.f9902a, 0, c);
        System.arraycopy(bn3.f9903a, 0, this.f9903a, 0, c);
        System.arraycopy(bn3.f9899a, 0, this.f9899a, 0, c);
    }

    /* renamed from: l */
    public void mo13772l(String str, int i) {
        this.f9904b = str;
        this.f9906o = i;
    }

    /* renamed from: m2 */
    public void mo13605m2(int i, String str) {
        this.f9900a[i] = 4;
        this.f9902a[i] = str;
    }

    public void release() {
        TreeMap<Integer, bn3> treeMap = f9891a;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f9905n), this);
            m11972m();
        }
    }

    /* renamed from: w */
    public void mo13606w(int i, byte[] bArr) {
        this.f9900a[i] = 5;
        this.f9903a[i] = bArr;
    }
}
