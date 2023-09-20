package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.q51;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0010B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/wl1;", "", "Lcom/onedelhi/secure/fr;", "name", "a", "", "", "d", "", "Lcom/onedelhi/secure/sk1;", "STATIC_HEADER_TABLE", "[Lcom/onedelhi/secure/sk1;", "c", "()[Lcom/onedelhi/secure/sk1;", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class wl1 {

    /* renamed from: a */
    public static final int f37011a = 15;

    /* renamed from: a */
    public static final wl1 f37012a;
    @vr2

    /* renamed from: a */
    public static final Map<C5301fr, Integer> f37013a;
    @vr2

    /* renamed from: a */
    public static final sk1[] f37014a;

    /* renamed from: b */
    public static final int f37015b = 31;

    /* renamed from: c */
    public static final int f37016c = 63;

    /* renamed from: d */
    public static final int f37017d = 127;

    /* renamed from: e */
    public static final int f37018e = 4096;

    /* renamed from: f */
    public static final int f37019f = 16384;

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\b\b\u0002\u0010#\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0002¨\u0006&"}, d2 = {"Lcom/onedelhi/secure/wl1$a;", "", "", "Lcom/onedelhi/secure/sk1;", "e", "", "i", "Lcom/onedelhi/secure/un4;", "l", "firstByte", "prefixMask", "n", "Lcom/onedelhi/secure/fr;", "k", "a", "b", "bytesToRecover", "d", "index", "m", "c", "q", "r", "nameIndex", "o", "p", "f", "", "h", "entry", "g", "j", "Lcom/onedelhi/secure/x04;", "source", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lcom/onedelhi/secure/x04;II)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.wl1$a */
    public static final class C7171a {

        /* renamed from: a */
        public int f37020a;

        /* renamed from: a */
        public final C6893to f37021a;

        /* renamed from: a */
        public final List<sk1> f37022a;
        @rw1
        @vr2

        /* renamed from: a */
        public sk1[] f37023a;
        @rw1

        /* renamed from: b */
        public int f37024b;
        @rw1

        /* renamed from: c */
        public int f37025c;

        /* renamed from: d */
        public final int f37026d;

        /* renamed from: e */
        public int f37027e;

        @vw1
        public C7171a(@vr2 x04 x04, int i) {
            this(x04, i, 0, 4, (wg0) null);
        }

        @vw1
        public C7171a(@vr2 x04 x04, int i, int i2) {
            jt1.m53777p(x04, "source");
            this.f37026d = i;
            this.f37027e = i2;
            this.f37022a = new ArrayList();
            this.f37021a = gu2.m49835d(x04);
            sk1[] sk1Arr = new sk1[8];
            this.f37023a = sk1Arr;
            this.f37020a = sk1Arr.length - 1;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C7171a(x04 x04, int i, int i2, int i3, wg0 wg0) {
            this(x04, i, (i3 & 4) != 0 ? i : i2);
        }

        /* renamed from: a */
        public final void mo46771a() {
            int i = this.f37027e;
            int i2 = this.f37025c;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                mo46772b();
            } else {
                mo46774d(i2 - i);
            }
        }

        /* renamed from: b */
        public final void mo46772b() {
            C7458za.m73006w2(this.f37023a, (Object) null, 0, 0, 6, (Object) null);
            this.f37020a = this.f37023a.length - 1;
            this.f37024b = 0;
            this.f37025c = 0;
        }

        /* renamed from: c */
        public final int mo46773c(int i) {
            return this.f37020a + 1 + i;
        }

        /* renamed from: d */
        public final int mo46774d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f37023a.length;
                while (true) {
                    length--;
                    i2 = this.f37020a;
                    if (length < i2 || i <= 0) {
                        sk1[] sk1Arr = this.f37023a;
                        System.arraycopy(sk1Arr, i2 + 1, sk1Arr, i2 + 1 + i3, this.f37024b);
                        this.f37020a += i3;
                    } else {
                        sk1 sk1 = this.f37023a[length];
                        jt1.m53774m(sk1);
                        int i4 = sk1.f35132a;
                        i -= i4;
                        this.f37025c -= i4;
                        this.f37024b--;
                        i3++;
                    }
                }
                sk1[] sk1Arr2 = this.f37023a;
                System.arraycopy(sk1Arr2, i2 + 1, sk1Arr2, i2 + 1 + i3, this.f37024b);
                this.f37020a += i3;
            }
            return i3;
        }

        @vr2
        /* renamed from: e */
        public final List<sk1> mo46775e() {
            List<sk1> Q5 = a10.m35769Q5(this.f37022a);
            this.f37022a.clear();
            return Q5;
        }

        /* renamed from: f */
        public final C5301fr mo46776f(int i) throws IOException {
            sk1 sk1;
            if (mo46778h(i)) {
                sk1 = wl1.f37012a.mo46769c()[i];
            } else {
                int c = mo46773c(i - wl1.f37012a.mo46769c().length);
                if (c >= 0) {
                    sk1[] sk1Arr = this.f37023a;
                    if (c < sk1Arr.length) {
                        sk1 = sk1Arr[c];
                        jt1.m53774m(sk1);
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            return sk1.f35133a;
        }

        /* renamed from: g */
        public final void mo46777g(int i, sk1 sk1) {
            this.f37022a.add(sk1);
            int i2 = sk1.f35132a;
            if (i != -1) {
                sk1 sk12 = this.f37023a[mo46773c(i)];
                jt1.m53774m(sk12);
                i2 -= sk12.f35132a;
            }
            int i3 = this.f37027e;
            if (i2 > i3) {
                mo46772b();
                return;
            }
            int d = mo46774d((this.f37025c + i2) - i3);
            if (i == -1) {
                int i4 = this.f37024b + 1;
                sk1[] sk1Arr = this.f37023a;
                if (i4 > sk1Arr.length) {
                    sk1[] sk1Arr2 = new sk1[(sk1Arr.length * 2)];
                    System.arraycopy(sk1Arr, 0, sk1Arr2, sk1Arr.length, sk1Arr.length);
                    this.f37020a = this.f37023a.length - 1;
                    this.f37023a = sk1Arr2;
                }
                int i5 = this.f37020a;
                this.f37020a = i5 - 1;
                this.f37023a[i5] = sk1;
                this.f37024b++;
            } else {
                this.f37023a[i + mo46773c(i) + d] = sk1;
            }
            this.f37025c += i2;
        }

        /* renamed from: h */
        public final boolean mo46778h(int i) {
            return i >= 0 && i <= wl1.f37012a.mo46769c().length - 1;
        }

        /* renamed from: i */
        public final int mo46779i() {
            return this.f37027e;
        }

        /* renamed from: j */
        public final int mo46780j() throws IOException {
            return nq4.m58691b(this.f37021a.readByte(), 255);
        }

        @vr2
        /* renamed from: k */
        public final C5301fr mo46781k() throws IOException {
            int j = mo46780j();
            boolean z = (j & 128) == 128;
            long n = (long) mo46784n(j, 127);
            if (!z) {
                return this.f37021a.mo31672I(n);
            }
            C6205no noVar = new C6205no();
            fn1.f28603a.mo36146b(this.f37021a, n, noVar);
            return noVar.mo31697r0();
        }

        /* renamed from: l */
        public final void mo46782l() throws IOException {
            while (!this.f37021a.mo31685f2()) {
                int b = nq4.m58691b(this.f37021a.readByte(), 255);
                if (b == 128) {
                    throw new IOException("index == 0");
                } else if ((b & 128) == 128) {
                    mo46783m(mo46784n(b, 127) - 1);
                } else if (b == 64) {
                    mo46786p();
                } else if ((b & 64) == 64) {
                    mo46785o(mo46784n(b, 63) - 1);
                } else if ((b & 32) == 32) {
                    int n = mo46784n(b, 31);
                    this.f37027e = n;
                    if (n < 0 || n > this.f37026d) {
                        throw new IOException("Invalid dynamic table size update " + this.f37027e);
                    }
                    mo46771a();
                } else if (b == 16 || b == 0) {
                    mo46788r();
                } else {
                    mo46787q(mo46784n(b, 15) - 1);
                }
            }
        }

        /* renamed from: m */
        public final void mo46783m(int i) throws IOException {
            if (mo46778h(i)) {
                this.f37022a.add(wl1.f37012a.mo46769c()[i]);
                return;
            }
            int c = mo46773c(i - wl1.f37012a.mo46769c().length);
            if (c >= 0) {
                sk1[] sk1Arr = this.f37023a;
                if (c < sk1Arr.length) {
                    List<sk1> list = this.f37022a;
                    sk1 sk1 = sk1Arr[c];
                    jt1.m53774m(sk1);
                    list.add(sk1);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: n */
        public final int mo46784n(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int j = mo46780j();
                if ((j & 128) == 0) {
                    return i2 + (j << i4);
                }
                i2 += (j & 127) << i4;
                i4 += 7;
            }
        }

        /* renamed from: o */
        public final void mo46785o(int i) throws IOException {
            mo46777g(-1, new sk1(mo46776f(i), mo46781k()));
        }

        /* renamed from: p */
        public final void mo46786p() throws IOException {
            mo46777g(-1, new sk1(wl1.f37012a.mo46767a(mo46781k()), mo46781k()));
        }

        /* renamed from: q */
        public final void mo46787q(int i) throws IOException {
            this.f37022a.add(new sk1(mo46776f(i), mo46781k()));
        }

        /* renamed from: r */
        public final void mo46788r() throws IOException {
            this.f37022a.add(new sk1(wl1.f37012a.mo46767a(mo46781k()), mo46781k()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002¨\u0006\u001d"}, d2 = {"Lcom/onedelhi/secure/wl1$b;", "", "", "Lcom/onedelhi/secure/sk1;", "headerBlock", "Lcom/onedelhi/secure/un4;", "g", "", "value", "prefixMask", "bits", "h", "Lcom/onedelhi/secure/fr;", "data", "f", "headerTableSizeSetting", "e", "b", "bytesToRecover", "c", "entry", "d", "a", "", "useCompression", "Lcom/onedelhi/secure/no;", "out", "<init>", "(IZLcom/onedelhi/secure/no;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.wl1$b */
    public static final class C7172b {

        /* renamed from: a */
        public int f37028a;

        /* renamed from: a */
        public final C6205no f37029a;

        /* renamed from: a */
        public boolean f37030a;
        @rw1
        @vr2

        /* renamed from: a */
        public sk1[] f37031a;
        @rw1

        /* renamed from: b */
        public int f37032b;

        /* renamed from: b */
        public final boolean f37033b;

        /* renamed from: c */
        public int f37034c;
        @rw1

        /* renamed from: d */
        public int f37035d;
        @rw1

        /* renamed from: e */
        public int f37036e;
        @rw1

        /* renamed from: f */
        public int f37037f;

        @vw1
        public C7172b(int i, @vr2 C6205no noVar) {
            this(i, false, noVar, 2, (wg0) null);
        }

        @vw1
        public C7172b(int i, boolean z, @vr2 C6205no noVar) {
            jt1.m53777p(noVar, "out");
            this.f37037f = i;
            this.f37033b = z;
            this.f37029a = noVar;
            this.f37028a = Integer.MAX_VALUE;
            this.f37032b = i;
            sk1[] sk1Arr = new sk1[8];
            this.f37031a = sk1Arr;
            this.f37034c = sk1Arr.length - 1;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C7172b(int i, boolean z, C6205no noVar, int i2, wg0 wg0) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, noVar);
        }

        @vw1
        public C7172b(@vr2 C6205no noVar) {
            this(0, false, noVar, 3, (wg0) null);
        }

        /* renamed from: a */
        public final void mo46789a() {
            int i = this.f37032b;
            int i2 = this.f37036e;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                mo46790b();
            } else {
                mo46791c(i2 - i);
            }
        }

        /* renamed from: b */
        public final void mo46790b() {
            C7458za.m73006w2(this.f37031a, (Object) null, 0, 0, 6, (Object) null);
            this.f37034c = this.f37031a.length - 1;
            this.f37035d = 0;
            this.f37036e = 0;
        }

        /* renamed from: c */
        public final int mo46791c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f37031a.length;
                while (true) {
                    length--;
                    i2 = this.f37034c;
                    if (length < i2 || i <= 0) {
                        sk1[] sk1Arr = this.f37031a;
                        System.arraycopy(sk1Arr, i2 + 1, sk1Arr, i2 + 1 + i3, this.f37035d);
                        sk1[] sk1Arr2 = this.f37031a;
                        int i4 = this.f37034c;
                        Arrays.fill(sk1Arr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f37034c += i3;
                    } else {
                        sk1 sk1 = this.f37031a[length];
                        jt1.m53774m(sk1);
                        i -= sk1.f35132a;
                        int i5 = this.f37036e;
                        sk1 sk12 = this.f37031a[length];
                        jt1.m53774m(sk12);
                        this.f37036e = i5 - sk12.f35132a;
                        this.f37035d--;
                        i3++;
                    }
                }
                sk1[] sk1Arr3 = this.f37031a;
                System.arraycopy(sk1Arr3, i2 + 1, sk1Arr3, i2 + 1 + i3, this.f37035d);
                sk1[] sk1Arr22 = this.f37031a;
                int i42 = this.f37034c;
                Arrays.fill(sk1Arr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f37034c += i3;
            }
            return i3;
        }

        /* renamed from: d */
        public final void mo46792d(sk1 sk1) {
            int i = sk1.f35132a;
            int i2 = this.f37032b;
            if (i > i2) {
                mo46790b();
                return;
            }
            mo46791c((this.f37036e + i) - i2);
            int i3 = this.f37035d + 1;
            sk1[] sk1Arr = this.f37031a;
            if (i3 > sk1Arr.length) {
                sk1[] sk1Arr2 = new sk1[(sk1Arr.length * 2)];
                System.arraycopy(sk1Arr, 0, sk1Arr2, sk1Arr.length, sk1Arr.length);
                this.f37034c = this.f37031a.length - 1;
                this.f37031a = sk1Arr2;
            }
            int i4 = this.f37034c;
            this.f37034c = i4 - 1;
            this.f37031a[i4] = sk1;
            this.f37035d++;
            this.f37036e += i;
        }

        /* renamed from: e */
        public final void mo46793e(int i) {
            this.f37037f = i;
            int min = Math.min(i, 16384);
            int i2 = this.f37032b;
            if (i2 != min) {
                if (min < i2) {
                    this.f37028a = Math.min(this.f37028a, min);
                }
                this.f37030a = true;
                this.f37032b = min;
                mo46789a();
            }
        }

        /* renamed from: f */
        public final void mo46794f(@vr2 C5301fr frVar) throws IOException {
            int i;
            int i2;
            jt1.m53777p(frVar, C4311b.C4317f.C4318a.f25149a);
            if (this.f37033b) {
                fn1 fn1 = fn1.f28603a;
                if (fn1.mo36148d(frVar) < frVar.mo36274j0()) {
                    C6205no noVar = new C6205no();
                    fn1.mo36147c(frVar, noVar);
                    frVar = noVar.mo31697r0();
                    i2 = frVar.mo36274j0();
                    i = 128;
                    mo46796h(i2, 127, i);
                    this.f37029a.mo41287s(frVar);
                }
            }
            i2 = frVar.mo36274j0();
            i = 0;
            mo46796h(i2, 127, i);
            this.f37029a.mo41287s(frVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo46795g(@com.onedelhi.secure.vr2 java.util.List<com.onedelhi.secure.sk1> r14) throws java.io.IOException {
            /*
                r13 = this;
                java.lang.String r0 = "headerBlock"
                com.onedelhi.secure.jt1.m53777p(r14, r0)
                boolean r0 = r13.f37030a
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r0 = r13.f37028a
                int r2 = r13.f37032b
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0017
                r13.mo46796h(r0, r4, r3)
            L_0x0017:
                r13.f37030a = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.f37028a = r0
                int r0 = r13.f37032b
                r13.mo46796h(r0, r4, r3)
            L_0x0023:
                int r0 = r14.size()
                r2 = 0
            L_0x0028:
                if (r2 >= r0) goto L_0x0106
                java.lang.Object r3 = r14.get(r2)
                com.onedelhi.secure.sk1 r3 = (com.onedelhi.secure.sk1) r3
                com.onedelhi.secure.fr r4 = r3.f35133a
                com.onedelhi.secure.fr r4 = r4.mo31174r0()
                com.onedelhi.secure.fr r5 = r3.f35134b
                com.onedelhi.secure.wl1 r6 = com.onedelhi.secure.wl1.f37012a
                java.util.Map r7 = r6.mo46768b()
                java.lang.Object r7 = r7.get(r4)
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = -1
                if (r7 == 0) goto L_0x007c
                int r7 = r7.intValue()
                int r7 = r7 + 1
                r9 = 7
                r10 = 2
                if (r10 <= r7) goto L_0x0052
                goto L_0x007a
            L_0x0052:
                if (r9 < r7) goto L_0x007a
                com.onedelhi.secure.sk1[] r9 = r6.mo46769c()
                int r10 = r7 + -1
                r9 = r9[r10]
                com.onedelhi.secure.fr r9 = r9.f35134b
                boolean r9 = com.onedelhi.secure.jt1.m53768g(r9, r5)
                if (r9 == 0) goto L_0x0066
                r6 = r7
                goto L_0x007e
            L_0x0066:
                com.onedelhi.secure.sk1[] r6 = r6.mo46769c()
                r6 = r6[r7]
                com.onedelhi.secure.fr r6 = r6.f35134b
                boolean r6 = com.onedelhi.secure.jt1.m53768g(r6, r5)
                if (r6 == 0) goto L_0x007a
                int r6 = r7 + 1
                r12 = r7
                r7 = r6
                r6 = r12
                goto L_0x007e
            L_0x007a:
                r6 = r7
                goto L_0x007d
            L_0x007c:
                r6 = -1
            L_0x007d:
                r7 = -1
            L_0x007e:
                if (r7 != r8) goto L_0x00c4
                int r9 = r13.f37034c
                int r9 = r9 + 1
                com.onedelhi.secure.sk1[] r10 = r13.f37031a
                int r10 = r10.length
            L_0x0087:
                if (r9 >= r10) goto L_0x00c4
                com.onedelhi.secure.sk1[] r11 = r13.f37031a
                r11 = r11[r9]
                com.onedelhi.secure.jt1.m53774m(r11)
                com.onedelhi.secure.fr r11 = r11.f35133a
                boolean r11 = com.onedelhi.secure.jt1.m53768g(r11, r4)
                if (r11 == 0) goto L_0x00c1
                com.onedelhi.secure.sk1[] r11 = r13.f37031a
                r11 = r11[r9]
                com.onedelhi.secure.jt1.m53774m(r11)
                com.onedelhi.secure.fr r11 = r11.f35134b
                boolean r11 = com.onedelhi.secure.jt1.m53768g(r11, r5)
                if (r11 == 0) goto L_0x00b3
                int r7 = r13.f37034c
                int r9 = r9 - r7
                com.onedelhi.secure.wl1 r7 = com.onedelhi.secure.wl1.f37012a
                com.onedelhi.secure.sk1[] r7 = r7.mo46769c()
                int r7 = r7.length
                int r7 = r7 + r9
                goto L_0x00c4
            L_0x00b3:
                if (r6 != r8) goto L_0x00c1
                int r6 = r13.f37034c
                int r6 = r9 - r6
                com.onedelhi.secure.wl1 r11 = com.onedelhi.secure.wl1.f37012a
                com.onedelhi.secure.sk1[] r11 = r11.mo46769c()
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00c1:
                int r9 = r9 + 1
                goto L_0x0087
            L_0x00c4:
                if (r7 == r8) goto L_0x00ce
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.mo46796h(r7, r3, r4)
                goto L_0x0102
            L_0x00ce:
                r7 = 64
                if (r6 != r8) goto L_0x00e1
                com.onedelhi.secure.no r6 = r13.f37029a
                r6.mo41230L0(r7)
                r13.mo46794f(r4)
            L_0x00da:
                r13.mo46794f(r5)
                r13.mo46792d(r3)
                goto L_0x0102
            L_0x00e1:
                com.onedelhi.secure.fr r8 = com.onedelhi.secure.sk1.f35123c
                boolean r8 = r4.mo36275k0(r8)
                if (r8 == 0) goto L_0x00fc
                com.onedelhi.secure.fr r8 = com.onedelhi.secure.sk1.f35131h
                boolean r4 = com.onedelhi.secure.jt1.m53768g(r8, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00fc
                r3 = 15
                r13.mo46796h(r6, r3, r1)
                r13.mo46794f(r5)
                goto L_0x0102
            L_0x00fc:
                r4 = 63
                r13.mo46796h(r6, r4, r7)
                goto L_0x00da
            L_0x0102:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0106:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wl1.C7172b.mo46795g(java.util.List):void");
        }

        /* renamed from: h */
        public final void mo46796h(int i, int i2, int i3) {
            int i4;
            C6205no noVar;
            if (i < i2) {
                noVar = this.f37029a;
                i4 = i | i3;
            } else {
                this.f37029a.mo41230L0(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f37029a.mo41230L0(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                noVar = this.f37029a;
            }
            noVar.mo41230L0(i4);
        }
    }

    static {
        wl1 wl1 = new wl1();
        f37012a = wl1;
        C5301fr frVar = sk1.f35127e;
        C5301fr frVar2 = sk1.f35129f;
        C5301fr frVar3 = sk1.f35130g;
        C5301fr frVar4 = sk1.f35125d;
        f37014a = new sk1[]{new sk1(sk1.f35131h, ""), new sk1(frVar, "GET"), new sk1(frVar, (String) q51.C6513a.f34002v), new sk1(frVar2, "/"), new sk1(frVar2, "/index.html"), new sk1(frVar3, (String) m51.f32018a), new sk1(frVar3, (String) m51.f32019b), new sk1(frVar4, "200"), new sk1(frVar4, "204"), new sk1(frVar4, "206"), new sk1(frVar4, "304"), new sk1(frVar4, "400"), new sk1(frVar4, "404"), new sk1(frVar4, "500"), new sk1("accept-charset", ""), new sk1("accept-encoding", "gzip, deflate"), new sk1("accept-language", ""), new sk1("accept-ranges", ""), new sk1("accept", ""), new sk1("access-control-allow-origin", ""), new sk1("age", ""), new sk1("allow", ""), new sk1("authorization", ""), new sk1("cache-control", ""), new sk1("content-disposition", ""), new sk1("content-encoding", ""), new sk1("content-language", ""), new sk1("content-length", ""), new sk1("content-location", ""), new sk1("content-range", ""), new sk1("content-type", ""), new sk1("cookie", ""), new sk1("date", ""), new sk1("etag", ""), new sk1("expect", ""), new sk1("expires", ""), new sk1("from", ""), new sk1((String) dm1.f27488b, ""), new sk1("if-match", ""), new sk1("if-modified-since", ""), new sk1("if-none-match", ""), new sk1("if-range", ""), new sk1("if-unmodified-since", ""), new sk1("last-modified", ""), new sk1("link", ""), new sk1("location", ""), new sk1("max-forwards", ""), new sk1("proxy-authenticate", ""), new sk1("proxy-authorization", ""), new sk1("range", ""), new sk1("referer", ""), new sk1("refresh", ""), new sk1("retry-after", ""), new sk1("server", ""), new sk1("set-cookie", ""), new sk1("strict-transport-security", ""), new sk1((String) dm1.f27492e, ""), new sk1("user-agent", ""), new sk1("vary", ""), new sk1("via", ""), new sk1("www-authenticate", "")};
        f37013a = wl1.mo46770d();
    }

    @vr2
    /* renamed from: a */
    public final C5301fr mo46767a(@vr2 C5301fr frVar) throws IOException {
        jt1.m53777p(frVar, "name");
        int j0 = frVar.mo36274j0();
        for (int i = 0; i < j0; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte y = frVar.mo36284y(i);
            if (b <= y && b2 >= y) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + frVar.mo36280u0());
            }
        }
        return frVar;
    }

    @vr2
    /* renamed from: b */
    public final Map<C5301fr, Integer> mo46768b() {
        return f37013a;
    }

    @vr2
    /* renamed from: c */
    public final sk1[] mo46769c() {
        return f37014a;
    }

    /* renamed from: d */
    public final Map<C5301fr, Integer> mo46770d() {
        sk1[] sk1Arr = f37014a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(sk1Arr.length);
        int length = sk1Arr.length;
        for (int i = 0; i < length; i++) {
            sk1[] sk1Arr2 = f37014a;
            if (!linkedHashMap.containsKey(sk1Arr2[i].f35133a)) {
                linkedHashMap.put(sk1Arr2[i].f35133a, Integer.valueOf(i));
            }
        }
        Map<C5301fr, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        jt1.m53776o(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }
}
