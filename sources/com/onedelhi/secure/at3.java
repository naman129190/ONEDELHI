package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0:\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0001H\u0016J\b\u0010\t\u001a\u00020\u0001H\u0016J\u0017\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016J'\u0010'\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0010¢\u0006\u0004\b'\u0010(J(\u0010,\u001a\u00020+2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0016J(\u0010-\u001a\u00020+2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0016J\u0018\u0010/\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u0011H\u0016J\u0018\u00100\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u0011H\u0016J\u000f\u00101\u001a\u00020\u001bH\u0010¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\u00020+2\b\u0010)\u001a\u0004\u0018\u000103H\u0002J\b\u00105\u001a\u00020\u0011H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\b\u00107\u001a\u00020\u0001H\u0002J\b\u00109\u001a\u000208H\u0002R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0:8\u0000X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0000X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/onedelhi/secure/at3;", "Lcom/onedelhi/secure/fr;", "Ljava/nio/charset/Charset;", "charset", "", "m0", "g", "D", "r0", "s0", "algorithm", "t", "(Ljava/lang/String;)Lcom/onedelhi/secure/fr;", "key", "E", "(Ljava/lang/String;Lcom/onedelhi/secure/fr;)Lcom/onedelhi/secure/fr;", "l", "", "beginIndex", "endIndex", "p0", "pos", "", "P", "(I)B", "B", "()I", "", "t0", "Ljava/nio/ByteBuffer;", "e", "Ljava/io/OutputStream;", "out", "Lcom/onedelhi/secure/un4;", "v0", "Lcom/onedelhi/secure/no;", "buffer", "offset", "byteCount", "w0", "(Lcom/onedelhi/secure/no;II)V", "other", "otherOffset", "", "a0", "b0", "fromIndex", "L", "T", "O", "()[B", "", "equals", "hashCode", "toString", "A0", "Ljava/lang/Object;", "B0", "", "segments", "[[B", "z0", "()[[B", "", "directory", "[I", "y0", "()[I", "<init>", "([[B[I)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class at3 extends C5301fr {
    @vr2

    /* renamed from: a */
    public final transient int[] f25998a;
    @vr2

    /* renamed from: a */
    public final transient byte[][] f25999a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public at3(@vr2 byte[][] bArr, @vr2 int[] iArr) {
        super(C5301fr.f28634a.mo36285z());
        jt1.m53777p(bArr, "segments");
        jt1.m53777p(iArr, "directory");
        this.f25999a = bArr;
        this.f25998a = iArr;
    }

    /* renamed from: A0 */
    public final C5301fr mo31156A0() {
        return new C5301fr(mo31177t0());
    }

    /* renamed from: B */
    public int mo31157B() {
        return mo31181y0()[mo31182z0().length - 1];
    }

    /* renamed from: B0 */
    public final Object mo31158B0() {
        C5301fr A0 = mo31156A0();
        Objects.requireNonNull(A0, "null cannot be cast to non-null type java.lang.Object");
        return A0;
    }

    @vr2
    /* renamed from: D */
    public String mo31159D() {
        return mo31156A0().mo31159D();
    }

    @vr2
    /* renamed from: E */
    public C5301fr mo31160E(@vr2 String str, @vr2 C5301fr frVar) {
        jt1.m53777p(str, "algorithm");
        jt1.m53777p(frVar, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(frVar.mo31177t0(), str));
            int length = mo31182z0().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = mo31181y0()[length + i];
                int i4 = mo31181y0()[i];
                instance.update(mo31182z0()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] doFinal = instance.doFinal();
            jt1.m53776o(doFinal, "mac.doFinal()");
            return new C5301fr(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: L */
    public int mo31161L(@vr2 byte[] bArr, int i) {
        jt1.m53777p(bArr, "other");
        return mo31156A0().mo31161L(bArr, i);
    }

    @vr2
    /* renamed from: O */
    public byte[] mo31162O() {
        return mo31177t0();
    }

    /* renamed from: P */
    public byte mo31163P(int i) {
        C5950l.m55169e((long) mo31181y0()[mo31182z0().length - 1], (long) i, 1);
        int n = bt3.m40376n(this, i);
        return mo31182z0()[n][(i - (n == 0 ? 0 : mo31181y0()[n - 1])) + mo31181y0()[mo31182z0().length + n]];
    }

    /* renamed from: T */
    public int mo31164T(@vr2 byte[] bArr, int i) {
        jt1.m53777p(bArr, "other");
        return mo31156A0().mo31164T(bArr, i);
    }

    /* renamed from: a0 */
    public boolean mo31165a0(int i, @vr2 C5301fr frVar, int i2, int i3) {
        jt1.m53777p(frVar, "other");
        if (i < 0 || i > mo36274j0() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int n = bt3.m40376n(this, i);
        while (i < i4) {
            int i5 = n == 0 ? 0 : mo31181y0()[n - 1];
            int i6 = mo31181y0()[mo31182z0().length + n];
            int min = Math.min(i4, (mo31181y0()[n] - i5) + i5) - i;
            if (!frVar.mo31166b0(i2, mo31182z0()[n], i6 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    /* renamed from: b0 */
    public boolean mo31166b0(int i, @vr2 byte[] bArr, int i2, int i3) {
        jt1.m53777p(bArr, "other");
        if (i < 0 || i > mo36274j0() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int n = bt3.m40376n(this, i);
        while (i < i4) {
            int i5 = n == 0 ? 0 : mo31181y0()[n - 1];
            int i6 = mo31181y0()[mo31182z0().length + n];
            int min = Math.min(i4, (mo31181y0()[n] - i5) + i5) - i;
            if (!C5950l.m55168d(mo31182z0()[n], i6 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    @vr2
    /* renamed from: e */
    public ByteBuffer mo31167e() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(mo31177t0()).asReadOnlyBuffer();
        jt1.m53776o(asReadOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5301fr) {
            C5301fr frVar = (C5301fr) obj;
            return frVar.mo36274j0() == mo36274j0() && mo31165a0(0, frVar, 0, mo36274j0());
        }
    }

    @vr2
    /* renamed from: g */
    public String mo31169g() {
        return mo31156A0().mo31169g();
    }

    public int hashCode() {
        int A = mo36253A();
        if (A != 0) {
            return A;
        }
        int length = mo31182z0().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = mo31181y0()[length + i];
            int i5 = mo31181y0()[i];
            byte[] bArr = mo31182z0()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        mo36269e0(i2);
        return i2;
    }

    @vr2
    /* renamed from: l */
    public String mo31171l() {
        return mo31156A0().mo31171l();
    }

    @vr2
    /* renamed from: m0 */
    public String mo31172m0(@vr2 Charset charset) {
        jt1.m53777p(charset, "charset");
        return mo31156A0().mo31172m0(charset);
    }

    @vr2
    /* renamed from: p0 */
    public C5301fr mo31173p0(int i, int i2) {
        int i3 = 0;
        if (i >= 0) {
            if (i2 <= mo36274j0()) {
                int i4 = i2 - i;
                if (!(i4 >= 0)) {
                    throw new IllegalArgumentException(("endIndex=" + i2 + " < beginIndex=" + i).toString());
                } else if (i == 0 && i2 == mo36274j0()) {
                    return this;
                } else {
                    if (i == i2) {
                        return C5301fr.f28634a;
                    }
                    int n = bt3.m40376n(this, i);
                    int n2 = bt3.m40376n(this, i2 - 1);
                    byte[][] bArr = (byte[][]) C7458za.m72781M1(mo31182z0(), n, n2 + 1);
                    int[] iArr = new int[(bArr.length * 2)];
                    if (n <= n2) {
                        int i5 = n;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(mo31181y0()[i5] - i, i4);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr.length] = mo31181y0()[mo31182z0().length + i5];
                            if (i5 == n2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (n != 0) {
                        i3 = mo31181y0()[n - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i - i3);
                    return new at3(bArr, iArr);
                }
            } else {
                throw new IllegalArgumentException(("endIndex=" + i2 + " > length(" + mo36274j0() + ')').toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
    }

    @vr2
    /* renamed from: r0 */
    public C5301fr mo31174r0() {
        return mo31156A0().mo31174r0();
    }

    @vr2
    /* renamed from: s0 */
    public C5301fr mo31175s0() {
        return mo31156A0().mo31175s0();
    }

    @vr2
    /* renamed from: t */
    public C5301fr mo31176t(@vr2 String str) {
        jt1.m53777p(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = mo31182z0().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo31181y0()[length + i];
            int i4 = mo31181y0()[i];
            instance.update(mo31182z0()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        jt1.m53776o(digest, "digest.digest()");
        return new C5301fr(digest);
    }

    @vr2
    /* renamed from: t0 */
    public byte[] mo31177t0() {
        byte[] bArr = new byte[mo36274j0()];
        int length = mo31182z0().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = mo31181y0()[length + i];
            int i5 = mo31181y0()[i];
            int i6 = i5 - i2;
            C7458za.m72840W0(mo31182z0()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @vr2
    public String toString() {
        return mo31156A0().toString();
    }

    /* renamed from: v0 */
    public void mo31179v0(@vr2 OutputStream outputStream) throws IOException {
        jt1.m53777p(outputStream, "out");
        int length = mo31182z0().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo31181y0()[length + i];
            int i4 = mo31181y0()[i];
            outputStream.write(mo31182z0()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    /* renamed from: w0 */
    public void mo31180w0(@vr2 C6205no noVar, int i, int i2) {
        jt1.m53777p(noVar, "buffer");
        int i3 = i2 + i;
        int n = bt3.m40376n(this, i);
        while (i < i3) {
            int i4 = n == 0 ? 0 : mo31181y0()[n - 1];
            int i5 = mo31181y0()[mo31182z0().length + n];
            int min = Math.min(i3, (mo31181y0()[n] - i4) + i4) - i;
            int i6 = i5 + (i - i4);
            ws3 ws3 = new ws3(mo31182z0()[n], i6, i6 + min, true, false);
            ws3 ws32 = noVar.f32655a;
            if (ws32 == null) {
                ws3.f37113b = ws3;
                ws3.f37109a = ws3;
                noVar.f32655a = ws3;
            } else {
                jt1.m53774m(ws32);
                ws3 ws33 = ws32.f37113b;
                jt1.m53774m(ws33);
                ws33.mo46874c(ws3);
            }
            i += min;
            n++;
        }
        noVar.mo41237P0(noVar.mo41244V0() + ((long) mo36274j0()));
    }

    @vr2
    /* renamed from: y0 */
    public final int[] mo31181y0() {
        return this.f25998a;
    }

    @vr2
    /* renamed from: z0 */
    public final byte[][] mo31182z0() {
        return this.f25999a;
    }
}
