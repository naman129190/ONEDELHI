package com.onedelhi.secure;

import android.content.Context;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class m10 {

    /* renamed from: a */
    public static final byte f15755a = 1;

    /* renamed from: a */
    public static final C2798d f15756a = new C2798d(1, "android");

    /* renamed from: a */
    public static final String f15757a = "color";

    /* renamed from: a */
    public static final Comparator<C2796b> f15758a = new C2795a();

    /* renamed from: a */
    public static final short f15759a = 2;

    /* renamed from: b */
    public static final byte f15760b = Byte.MAX_VALUE;

    /* renamed from: b */
    public static final short f15761b = 1;

    /* renamed from: c */
    public static byte f15762c = 0;

    /* renamed from: c */
    public static final short f15763c = 512;

    /* renamed from: d */
    public static final short f15764d = 513;

    /* renamed from: e */
    public static final short f15765e = 514;

    /* renamed from: com.onedelhi.secure.m10$a */
    public class C2795a implements Comparator<C2796b> {
        /* renamed from: a */
        public int compare(C2796b bVar, C2796b bVar2) {
            return bVar.f15769a - bVar2.f15769a;
        }
    }

    /* renamed from: com.onedelhi.secure.m10$b */
    public static class C2796b {

        /* renamed from: a */
        public final byte f15766a;
        @d10

        /* renamed from: a */
        public final int f15767a;

        /* renamed from: a */
        public final String f15768a;

        /* renamed from: a */
        public final short f15769a;

        /* renamed from: b */
        public final byte f15770b;

        public C2796b(int i, String str, int i2) {
            this.f15768a = str;
            this.f15767a = i2;
            this.f15769a = (short) (65535 & i);
            this.f15770b = (byte) ((i >> 16) & 255);
            this.f15766a = (byte) ((i >> 24) & 255);
        }
    }

    /* renamed from: com.onedelhi.secure.m10$c */
    public static class C2797c {

        /* renamed from: a */
        public static final int f15771a = 128;

        /* renamed from: a */
        public static final short f15772a = 288;

        /* renamed from: a */
        public final C2798d f15773a;

        /* renamed from: a */
        public final C2799e f15774a;

        /* renamed from: a */
        public final C2802h f15775a = new C2802h(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* renamed from: a */
        public final C2805k f15776a;

        /* renamed from: b */
        public final C2802h f15777b;

        public C2797c(C2798d dVar, List<C2796b> list) {
            this.f15773a = dVar;
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i).f15768a;
            }
            this.f15777b = new C2802h(true, strArr);
            this.f15776a = new C2805k(list);
            this.f15774a = new C2799e(m10.f15763c, f15772a, mo19990a());
        }

        /* renamed from: a */
        public int mo19990a() {
            return this.f15775a.mo19996a() + 288 + this.f15777b.mo19996a() + this.f15776a.mo20005b();
        }

        /* renamed from: b */
        public void mo19991b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f15774a.mo19992a(byteArrayOutputStream);
            byteArrayOutputStream.write(m10.m21125j(this.f15773a.f15778a));
            char[] charArray = this.f15773a.f15779a.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(m10.m21123h(charArray[i]));
                } else {
                    byteArrayOutputStream.write(m10.m21123h(0));
                }
            }
            byteArrayOutputStream.write(m10.m21125j(288));
            byteArrayOutputStream.write(m10.m21125j(0));
            byteArrayOutputStream.write(m10.m21125j(this.f15775a.mo19996a() + 288));
            byteArrayOutputStream.write(m10.m21125j(0));
            byteArrayOutputStream.write(m10.m21125j(0));
            this.f15775a.mo19998c(byteArrayOutputStream);
            this.f15777b.mo19998c(byteArrayOutputStream);
            this.f15776a.mo20006c(byteArrayOutputStream);
        }
    }

    /* renamed from: com.onedelhi.secure.m10$d */
    public static class C2798d {

        /* renamed from: a */
        public final int f15778a;

        /* renamed from: a */
        public final String f15779a;

        public C2798d(int i, String str) {
            this.f15778a = i;
            this.f15779a = str;
        }
    }

    /* renamed from: com.onedelhi.secure.m10$e */
    public static class C2799e {

        /* renamed from: a */
        public final int f15780a;

        /* renamed from: a */
        public final short f15781a;

        /* renamed from: b */
        public final short f15782b;

        public C2799e(short s, short s2, int i) {
            this.f15781a = s;
            this.f15782b = s2;
            this.f15780a = i;
        }

        /* renamed from: a */
        public void mo19992a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(m10.m21126k(this.f15781a));
            byteArrayOutputStream.write(m10.m21126k(this.f15782b));
            byteArrayOutputStream.write(m10.m21125j(this.f15780a));
        }
    }

    /* renamed from: com.onedelhi.secure.m10$f */
    public static class C2800f {

        /* renamed from: a */
        public static final byte f15783a = 28;

        /* renamed from: a */
        public static final short f15784a = 8;

        /* renamed from: b */
        public static final short f15785b = 2;

        /* renamed from: c */
        public static final int f15786c = 16;

        /* renamed from: c */
        public static final short f15787c = 8;

        /* renamed from: a */
        public final int f15788a;

        /* renamed from: b */
        public final int f15789b;

        public C2800f(int i, @d10 int i2) {
            this.f15788a = i;
            this.f15789b = i2;
        }

        /* renamed from: a */
        public void mo19993a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(m10.m21126k(8));
            byteArrayOutputStream.write(m10.m21126k(2));
            byteArrayOutputStream.write(m10.m21125j(this.f15788a));
            byteArrayOutputStream.write(m10.m21126k(8));
            byteArrayOutputStream.write(new byte[]{0, f15783a});
            byteArrayOutputStream.write(m10.m21125j(this.f15789b));
        }
    }

    /* renamed from: com.onedelhi.secure.m10$g */
    public static class C2801g {

        /* renamed from: a */
        public static final short f15790a = 12;

        /* renamed from: a */
        public final int f15791a;

        /* renamed from: a */
        public final C2799e f15792a;

        /* renamed from: a */
        public final C2802h f15793a;

        /* renamed from: a */
        public final List<C2797c> f15794a = new ArrayList();

        public C2801g(Map<C2798d, List<C2796b>> map) {
            this.f15791a = map.size();
            this.f15793a = new C2802h(new String[0]);
            for (Map.Entry next : map.entrySet()) {
                List list = (List) next.getValue();
                Collections.sort(list, m10.f15758a);
                this.f15794a.add(new C2797c((C2798d) next.getKey(), list));
            }
            this.f15792a = new C2799e(2, 12, mo19994a());
        }

        /* renamed from: a */
        public final int mo19994a() {
            int i = 0;
            for (C2797c a : this.f15794a) {
                i += a.mo19990a();
            }
            return this.f15793a.mo19996a() + 12 + i;
        }

        /* renamed from: b */
        public void mo19995b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f15792a.mo19992a(byteArrayOutputStream);
            byteArrayOutputStream.write(m10.m21125j(this.f15791a));
            this.f15793a.mo19998c(byteArrayOutputStream);
            for (C2797c b : this.f15794a) {
                b.mo19991b(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.m10$h */
    public static class C2802h {

        /* renamed from: a */
        public static final short f15795a = 28;

        /* renamed from: g */
        public static final int f15796g = 256;

        /* renamed from: h */
        public static final int f15797h = -1;

        /* renamed from: a */
        public final int f15798a;

        /* renamed from: a */
        public final C2799e f15799a;

        /* renamed from: a */
        public final List<Integer> f15800a;

        /* renamed from: a */
        public final boolean f15801a;

        /* renamed from: b */
        public final int f15802b;

        /* renamed from: b */
        public final List<Integer> f15803b;

        /* renamed from: c */
        public final int f15804c;

        /* renamed from: c */
        public final List<byte[]> f15805c;

        /* renamed from: d */
        public final int f15806d;

        /* renamed from: d */
        public final List<List<C2803i>> f15807d;

        /* renamed from: e */
        public final int f15808e;

        /* renamed from: f */
        public final int f15809f;

        public C2802h(boolean z, String... strArr) {
            this.f15800a = new ArrayList();
            this.f15803b = new ArrayList();
            this.f15805c = new ArrayList();
            this.f15807d = new ArrayList();
            this.f15801a = z;
            int i = 0;
            int i2 = 0;
            for (String b : strArr) {
                Pair<byte[], List<C2803i>> b2 = mo19997b(b);
                this.f15800a.add(Integer.valueOf(i2));
                Object obj = b2.first;
                i2 += ((byte[]) obj).length;
                this.f15805c.add((byte[]) obj);
                this.f15807d.add((List) b2.second);
            }
            int i3 = 0;
            for (List<C2803i> next : this.f15807d) {
                for (C2803i iVar : next) {
                    this.f15800a.add(Integer.valueOf(i2));
                    i2 += iVar.f15811a.length;
                    this.f15805c.add(iVar.f15811a);
                }
                this.f15803b.add(Integer.valueOf(i3));
                i3 += (next.size() * 12) + 4;
            }
            int i4 = i2 % 4;
            int i5 = i4 == 0 ? 0 : 4 - i4;
            this.f15808e = i5;
            int size = this.f15805c.size();
            this.f15798a = size;
            this.f15802b = this.f15805c.size() - strArr.length;
            boolean z2 = this.f15805c.size() - strArr.length > 0;
            if (!z2) {
                this.f15803b.clear();
                this.f15807d.clear();
            }
            int size2 = (size * 4) + 28 + (this.f15803b.size() * 4);
            this.f15804c = size2;
            int i6 = i2 + i5;
            this.f15806d = z2 ? size2 + i6 : 0;
            int i7 = size2 + i6 + (z2 ? i3 : i);
            this.f15809f = i7;
            this.f15799a = new C2799e(1, 28, i7);
        }

        public C2802h(String... strArr) {
            this(false, strArr);
        }

        /* renamed from: a */
        public int mo19996a() {
            return this.f15809f;
        }

        /* renamed from: b */
        public final Pair<byte[], List<C2803i>> mo19997b(String str) {
            return new Pair<>(this.f15801a ? m10.m21128m(str) : m10.m21127l(str), Collections.emptyList());
        }

        /* renamed from: c */
        public void mo19998c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f15799a.mo19992a(byteArrayOutputStream);
            byteArrayOutputStream.write(m10.m21125j(this.f15798a));
            byteArrayOutputStream.write(m10.m21125j(this.f15802b));
            byteArrayOutputStream.write(m10.m21125j(this.f15801a ? 256 : 0));
            byteArrayOutputStream.write(m10.m21125j(this.f15804c));
            byteArrayOutputStream.write(m10.m21125j(this.f15806d));
            for (Integer intValue : this.f15800a) {
                byteArrayOutputStream.write(m10.m21125j(intValue.intValue()));
            }
            for (Integer intValue2 : this.f15803b) {
                byteArrayOutputStream.write(m10.m21125j(intValue2.intValue()));
            }
            for (byte[] write : this.f15805c) {
                byteArrayOutputStream.write(write);
            }
            int i = this.f15808e;
            if (i > 0) {
                byteArrayOutputStream.write(new byte[i]);
            }
            for (List<C2803i> it : this.f15807d) {
                for (C2803i b : it) {
                    b.mo19999b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(m10.m21125j(-1));
            }
        }
    }

    /* renamed from: com.onedelhi.secure.m10$i */
    public static class C2803i {

        /* renamed from: a */
        public int f15810a;

        /* renamed from: a */
        public byte[] f15811a;

        /* renamed from: b */
        public int f15812b;

        /* renamed from: c */
        public int f15813c;

        /* renamed from: b */
        public void mo19999b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(m10.m21125j(this.f15810a));
            byteArrayOutputStream.write(m10.m21125j(this.f15812b));
            byteArrayOutputStream.write(m10.m21125j(this.f15813c));
        }
    }

    /* renamed from: com.onedelhi.secure.m10$j */
    public static class C2804j {

        /* renamed from: a */
        public static final byte f15814a = 64;

        /* renamed from: a */
        public static final short f15815a = 84;

        /* renamed from: b */
        public static final int f15816b = -1;

        /* renamed from: a */
        public final int f15817a;

        /* renamed from: a */
        public final C2799e f15818a;

        /* renamed from: a */
        public final byte[] f15819a;

        /* renamed from: a */
        public final int[] f15820a;

        /* renamed from: a */
        public final C2800f[] f15821a;

        public C2804j(List<C2796b> list, Set<Short> set, int i) {
            byte[] bArr = new byte[64];
            this.f15819a = bArr;
            this.f15817a = i;
            bArr[0] = f15814a;
            this.f15821a = new C2800f[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f15821a[i2] = new C2800f(i2, list.get(i2).f15767a);
            }
            this.f15820a = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(Short.valueOf(s))) {
                    this.f15820a[s] = i3;
                    i3 += 16;
                } else {
                    this.f15820a[s] = -1;
                }
            }
            this.f15818a = new C2799e(m10.f15764d, 84, mo20000a());
        }

        /* renamed from: a */
        public int mo20000a() {
            return mo20001b() + (this.f15821a.length * 16);
        }

        /* renamed from: b */
        public final int mo20001b() {
            return mo20002c() + 84;
        }

        /* renamed from: c */
        public final int mo20002c() {
            return this.f15820a.length * 4;
        }

        /* renamed from: d */
        public void mo20003d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f15818a.mo19992a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{m10.f15762c, 0, 0, 0});
            byteArrayOutputStream.write(m10.m21125j(this.f15817a));
            byteArrayOutputStream.write(m10.m21125j(mo20001b()));
            byteArrayOutputStream.write(this.f15819a);
            for (int d : this.f15820a) {
                byteArrayOutputStream.write(m10.m21125j(d));
            }
            for (C2800f a : this.f15821a) {
                a.mo19993a(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.m10$k */
    public static class C2805k {

        /* renamed from: a */
        public static final short f15822a = 16;

        /* renamed from: b */
        public static final int f15823b = 1073741824;

        /* renamed from: a */
        public final int f15824a;

        /* renamed from: a */
        public final C2799e f15825a;

        /* renamed from: a */
        public final C2804j f15826a;

        /* renamed from: a */
        public final int[] f15827a;

        public C2805k(List<C2796b> list) {
            this.f15824a = list.get(list.size() - 1).f15769a + 1;
            HashSet hashSet = new HashSet();
            for (C2796b a : list) {
                hashSet.add(Short.valueOf(a.f15769a));
            }
            this.f15827a = new int[this.f15824a];
            for (short s = 0; s < this.f15824a; s = (short) (s + 1)) {
                if (hashSet.contains(Short.valueOf(s))) {
                    this.f15827a[s] = 1073741824;
                }
            }
            this.f15825a = new C2799e(m10.f15765e, 16, mo20004a());
            this.f15826a = new C2804j(list, hashSet, this.f15824a);
        }

        /* renamed from: a */
        public final int mo20004a() {
            return (this.f15824a * 4) + 16;
        }

        /* renamed from: b */
        public int mo20005b() {
            return mo20004a() + this.f15826a.mo20000a();
        }

        /* renamed from: c */
        public void mo20006c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f15825a.mo19992a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{m10.f15762c, 0, 0, 0});
            byteArrayOutputStream.write(m10.m21125j(this.f15824a));
            for (int d : this.f15827a) {
                byteArrayOutputStream.write(m10.m21125j(d));
            }
            this.f15826a.mo20003d(byteArrayOutputStream);
        }
    }

    /* renamed from: h */
    public static byte[] m21123h(char c) {
        return new byte[]{(byte) (c & 255), (byte) ((c >> 8) & 255)};
    }

    /* renamed from: i */
    public static byte[] m21124i(Context context, Map<Integer, Integer> map) throws IOException {
        C2798d dVar;
        if (!map.entrySet().isEmpty()) {
            C2798d dVar2 = new C2798d(127, context.getPackageName());
            HashMap hashMap = new HashMap();
            C2796b bVar = null;
            for (Map.Entry next : map.entrySet()) {
                C2796b bVar2 = new C2796b(((Integer) next.getKey()).intValue(), context.getResources().getResourceName(((Integer) next.getKey()).intValue()), ((Integer) next.getValue()).intValue());
                if (context.getResources().getResourceTypeName(((Integer) next.getKey()).intValue()).equals("color")) {
                    if (bVar2.f15766a == 1) {
                        dVar = f15756a;
                    } else if (bVar2.f15766a == Byte.MAX_VALUE) {
                        dVar = dVar2;
                    } else {
                        throw new IllegalArgumentException("Not supported with unknown package id: " + bVar2.f15766a);
                    }
                    if (!hashMap.containsKey(dVar)) {
                        hashMap.put(dVar, new ArrayList());
                    }
                    ((List) hashMap.get(dVar)).add(bVar2);
                    bVar = bVar2;
                } else {
                    throw new IllegalArgumentException("Non color resource found: name=" + bVar2.f15768a + ", typeId=" + Integer.toHexString(bVar2.f15770b & 255));
                }
            }
            byte d = bVar.f15770b;
            f15762c = d;
            if (d != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new C2801g(hashMap).mo19995b(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    /* renamed from: j */
    public static byte[] m21125j(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    /* renamed from: k */
    public static byte[] m21126k(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    /* renamed from: l */
    public static byte[] m21127l(String str) {
        char[] charArray = str.toCharArray();
        int length = (charArray.length * 2) + 4;
        byte[] bArr = new byte[length];
        byte[] k = m21126k((short) charArray.length);
        bArr[0] = k[0];
        bArr[1] = k[1];
        for (int i = 0; i < charArray.length; i++) {
            byte[] h = m21123h(charArray[i]);
            int i2 = i * 2;
            bArr[i2 + 2] = h[0];
            bArr[i2 + 3] = h[1];
        }
        bArr[length - 2] = 0;
        bArr[length - 1] = 0;
        return bArr;
    }

    /* renamed from: m */
    public static byte[] m21128m(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length + 3;
        byte[] bArr = new byte[length2];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 - 1] = 0;
        return bArr;
    }
}
