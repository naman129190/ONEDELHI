package okhttp3.internal.publicsuffix;

import com.onedelhi.secure.a10;
import com.onedelhi.secure.ec1;
import com.onedelhi.secure.hu3;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.r00;
import com.onedelhi.secure.s00;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.u54;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "e", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "Lcom/onedelhi/secure/un4;", "h", "", "i", "domainLabels", "d", "g", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "[B", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class PublicSuffixDatabase {

    /* renamed from: a */
    public static final char f38853a = '!';
    @vr2

    /* renamed from: a */
    public static final String f38854a = "publicsuffixes.gz";

    /* renamed from: a */
    public static final List<String> f38855a = r00.m63300l("*");

    /* renamed from: a */
    public static final C7624a f38856a = new C7624a((wg0) null);

    /* renamed from: a */
    public static final PublicSuffixDatabase f38857a = new PublicSuffixDatabase();

    /* renamed from: c */
    public static final byte[] f38858c = {(byte) 42};

    /* renamed from: a */
    public final CountDownLatch f38859a = new CountDownLatch(1);

    /* renamed from: a */
    public final AtomicBoolean f38860a = new AtomicBoolean(false);

    /* renamed from: a */
    public byte[] f38861a;

    /* renamed from: b */
    public byte[] f38862b;

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J+\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;", "", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C7624a {
        public C7624a() {
        }

        public /* synthetic */ C7624a(wg0 wg0) {
            this();
        }

        /* renamed from: b */
        public final String mo49739b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int b;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = nq4.m58691b(bArr4[i9][i10], 255);
                    }
                    b = i3 - nq4.m58691b(bArr3[i6 + i11], 255);
                    if (b == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            z2 = true;
                            i10 = -1;
                        }
                    } else {
                        break;
                    }
                }
                if (b >= 0) {
                    if (b <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                jt1.m53776o(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        @vr2
        /* renamed from: c */
        public final PublicSuffixDatabase mo49740c() {
            return PublicSuffixDatabase.f38857a;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ byte[] m74718b(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.f38861a;
        if (bArr == null) {
            jt1.m53761S("publicSuffixListBytes");
        }
        return bArr;
    }

    /* renamed from: d */
    public final List<String> mo49733d(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> list2;
        List<String> list3;
        if (this.f38860a.get() || !this.f38860a.compareAndSet(false, true)) {
            try {
                this.f38859a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            mo49736g();
        }
        if (this.f38861a != null) {
            int size = list.size();
            byte[][] bArr = new byte[size][];
            for (int i = 0; i < size; i++) {
                String str4 = list.get(i);
                Charset charset = StandardCharsets.UTF_8;
                jt1.m53776o(charset, "UTF_8");
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = str4.getBytes(charset);
                jt1.m53776o(bytes, "(this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                str = null;
                if (i2 >= size) {
                    str2 = null;
                    break;
                }
                C7624a aVar = f38856a;
                byte[] bArr2 = this.f38861a;
                if (bArr2 == null) {
                    jt1.m53761S("publicSuffixListBytes");
                }
                str2 = aVar.mo49739b(bArr2, bArr, i2);
                if (str2 != null) {
                    break;
                }
                i2++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    bArr3[i3] = f38858c;
                    C7624a aVar2 = f38856a;
                    byte[] bArr4 = this.f38861a;
                    if (bArr4 == null) {
                        jt1.m53761S("publicSuffixListBytes");
                    }
                    String a = aVar2.mo49739b(bArr4, bArr3, i3);
                    if (a != null) {
                        str3 = a;
                        break;
                    }
                    i3++;
                }
            }
            str3 = null;
            if (str3 != null) {
                int i4 = size - 1;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    C7624a aVar3 = f38856a;
                    byte[] bArr5 = this.f38862b;
                    if (bArr5 == null) {
                        jt1.m53761S("publicSuffixExceptionListBytes");
                    }
                    String a2 = aVar3.mo49739b(bArr5, bArr, i5);
                    if (a2 != null) {
                        str = a2;
                        break;
                    }
                    i5++;
                }
            }
            if (str != null) {
                return u54.m66592S4(f38853a + str, new char[]{'.'}, false, 0, 6, (Object) null);
            } else if (str2 == null && str3 == null) {
                return f38855a;
            } else {
                if (str2 == null || (list2 = u54.m66592S4(str2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
                    list2 = s00.m64037F();
                }
                if (str3 == null || (list3 = u54.m66592S4(str3, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
                    list3 = s00.m64037F();
                }
                return list2.size() > list3.size() ? list2 : list3;
            }
        } else {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
    }

    @ss2
    /* renamed from: e */
    public final String mo49734e(@vr2 String str) {
        jt1.m53777p(str, "domain");
        String unicode = IDN.toUnicode(str);
        jt1.m53776o(unicode, "unicodeDomain");
        List<String> i = mo49738i(unicode);
        List<String> d = mo49733d(i);
        if (i.size() == d.size() && d.get(0).charAt(0) != '!') {
            return null;
        }
        char charAt = d.get(0).charAt(0);
        int size = i.size();
        int size2 = d.size();
        if (charAt != '!') {
            size2++;
        }
        return hu3.m51017e1(hu3.m51040k0(a10.m35912v1(mo49738i(str)), size - size2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (ec1) null, 62, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        throw r2;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49735f() throws java.io.IOException {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x004b
            com.onedelhi.secure.tj1 r1 = new com.onedelhi.secure.tj1
            com.onedelhi.secure.x04 r0 = com.onedelhi.secure.gu2.m49844m(r0)
            r1.<init>(r0)
            com.onedelhi.secure.to r0 = com.onedelhi.secure.gu2.m49835d(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0044 }
            long r2 = (long) r2     // Catch:{ all -> 0x0044 }
            byte[] r2 = r0.mo31691k1(r2)     // Catch:{ all -> 0x0044 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0044 }
            long r3 = (long) r3     // Catch:{ all -> 0x0044 }
            byte[] r3 = r0.mo31691k1(r3)     // Catch:{ all -> 0x0044 }
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0044 }
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            monitor-enter(r5)
            com.onedelhi.secure.jt1.m53774m(r2)     // Catch:{ all -> 0x0041 }
            r5.f38861a = r2     // Catch:{ all -> 0x0041 }
            com.onedelhi.secure.jt1.m53774m(r3)     // Catch:{ all -> 0x0041 }
            r5.f38862b = r3     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f38859a
            r0.countDown()
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            throw r2
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo49735f():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49736g() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.mo49735f()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            com.onedelhi.secure.k23$a r2 = com.onedelhi.secure.k23.f31087a     // Catch:{ all -> 0x000e }
            com.onedelhi.secure.k23 r2 = r2.mo39034g()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.mo39026m(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo49736g():void");
    }

    /* renamed from: h */
    public final void mo49737h(@vr2 byte[] bArr, @vr2 byte[] bArr2) {
        jt1.m53777p(bArr, "publicSuffixListBytes");
        jt1.m53777p(bArr2, "publicSuffixExceptionListBytes");
        this.f38861a = bArr;
        this.f38862b = bArr2;
        this.f38860a.set(true);
        this.f38859a.countDown();
    }

    /* renamed from: i */
    public final List<String> mo49738i(String str) {
        List<String> S4 = u54.m66592S4(str, new char[]{'.'}, false, 0, 6, (Object) null);
        return jt1.m53768g((String) a10.m35865k3(S4), "") ? a10.m35805Y1(S4, 1) : S4;
    }
}
