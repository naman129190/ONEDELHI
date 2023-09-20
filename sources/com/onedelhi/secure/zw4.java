package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.C6205no;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/onedelhi/secure/zw4;", "Ljava/io/Closeable;", "Lcom/onedelhi/secure/fr;", "payload", "Lcom/onedelhi/secure/un4;", "h", "l", "", "code", "reason", "c", "formatOpcode", "data", "g", "close", "opcode", "d", "Lcom/onedelhi/secure/so;", "sink", "Lcom/onedelhi/secure/so;", "b", "()Lcom/onedelhi/secure/so;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "a", "()Ljava/util/Random;", "", "isClient", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLcom/onedelhi/secure/so;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class zw4 implements Closeable {

    /* renamed from: a */
    public final C6205no.C6206a f38473a;

    /* renamed from: a */
    public final C6205no f38474a = new C6205no();

    /* renamed from: a */
    public sh2 f38475a;
    @vr2

    /* renamed from: a */
    public final C6785so f38476a;
    @vr2

    /* renamed from: a */
    public final Random f38477a;

    /* renamed from: a */
    public final byte[] f38478a;

    /* renamed from: b */
    public final long f38479b;

    /* renamed from: b */
    public final C6205no f38480b;

    /* renamed from: b */
    public boolean f38481b;

    /* renamed from: c */
    public final boolean f38482c;

    /* renamed from: d */
    public final boolean f38483d;

    /* renamed from: e */
    public final boolean f38484e;

    public zw4(boolean z, @vr2 C6785so soVar, @vr2 Random random, boolean z2, boolean z3, long j) {
        jt1.m53777p(soVar, "sink");
        jt1.m53777p(random, "random");
        this.f38482c = z;
        this.f38476a = soVar;
        this.f38477a = random;
        this.f38483d = z2;
        this.f38484e = z3;
        this.f38479b = j;
        this.f38480b = soVar.mo31682e();
        C6205no.C6206a aVar = null;
        this.f38478a = z ? new byte[4] : null;
        this.f38473a = z ? new C6205no.C6206a() : aVar;
    }

    @vr2
    /* renamed from: a */
    public final Random mo48454a() {
        return this.f38477a;
    }

    @vr2
    /* renamed from: b */
    public final C6785so mo48455b() {
        return this.f38476a;
    }

    /* renamed from: c */
    public final void mo48456c(int i, @ss2 C5301fr frVar) throws IOException {
        C5301fr frVar2 = C5301fr.f28634a;
        if (!(i == 0 && frVar == null)) {
            if (i != 0) {
                xw4.f37655a.mo47428d(i);
            }
            C6205no noVar = new C6205no();
            noVar.mo41243V(i);
            if (frVar != null) {
                noVar.mo41287s(frVar);
            }
            frVar2 = noVar.mo31697r0();
        }
        try {
            mo48458d(8, frVar2);
        } finally {
            this.f38481b = true;
        }
    }

    public void close() {
        sh2 sh2 = this.f38475a;
        if (sh2 != null) {
            sh2.close();
        }
    }

    /* renamed from: d */
    public final void mo48458d(int i, C5301fr frVar) throws IOException {
        if (!this.f38481b) {
            int j0 = frVar.mo36274j0();
            if (((long) j0) <= 125) {
                this.f38480b.mo41230L0(i | 128);
                if (this.f38482c) {
                    this.f38480b.mo41230L0(j0 | 128);
                    Random random = this.f38477a;
                    byte[] bArr = this.f38478a;
                    jt1.m53774m(bArr);
                    random.nextBytes(bArr);
                    this.f38480b.mo41221D2(this.f38478a);
                    if (j0 > 0) {
                        long V0 = this.f38480b.mo41244V0();
                        this.f38480b.mo41287s(frVar);
                        C6205no noVar = this.f38480b;
                        C6205no.C6206a aVar = this.f38473a;
                        jt1.m53774m(aVar);
                        noVar.mo41285q0(aVar);
                        this.f38473a.mo41303d(V0);
                        xw4.f37655a.mo47427c(this.f38473a, this.f38478a);
                        this.f38473a.close();
                    }
                } else {
                    this.f38480b.mo41230L0(j0);
                    this.f38480b.mo41287s(frVar);
                }
                this.f38476a.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    /* renamed from: g */
    public final void mo48459g(int i, @vr2 C5301fr frVar) throws IOException {
        jt1.m53777p(frVar, C4311b.C4317f.C4318a.f25149a);
        if (!this.f38481b) {
            this.f38474a.mo41287s(frVar);
            int i2 = 128;
            int i3 = i | 128;
            if (this.f38483d && ((long) frVar.mo36274j0()) >= this.f38479b) {
                sh2 sh2 = this.f38475a;
                if (sh2 == null) {
                    sh2 = new sh2(this.f38484e);
                    this.f38475a = sh2;
                }
                sh2.mo44353a(this.f38474a);
                i3 |= 64;
            }
            long V0 = this.f38474a.mo41244V0();
            this.f38480b.mo41230L0(i3);
            if (!this.f38482c) {
                i2 = 0;
            }
            if (V0 <= 125) {
                this.f38480b.mo41230L0(((int) V0) | i2);
            } else if (V0 <= xw4.f37660c) {
                this.f38480b.mo41230L0(i2 | 126);
                this.f38480b.mo41243V((int) V0);
            } else {
                this.f38480b.mo41230L0(i2 | 127);
                this.f38480b.mo41292v(V0);
            }
            if (this.f38482c) {
                Random random = this.f38477a;
                byte[] bArr = this.f38478a;
                jt1.m53774m(bArr);
                random.nextBytes(bArr);
                this.f38480b.mo41221D2(this.f38478a);
                if (V0 > 0) {
                    C6205no noVar = this.f38474a;
                    C6205no.C6206a aVar = this.f38473a;
                    jt1.m53774m(aVar);
                    noVar.mo41285q0(aVar);
                    this.f38473a.mo41303d(0);
                    xw4.f37655a.mo47427c(this.f38473a, this.f38478a);
                    this.f38473a.close();
                }
            }
            this.f38480b.write(this.f38474a, V0);
            this.f38476a.mo41217C();
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: h */
    public final void mo48460h(@vr2 C5301fr frVar) throws IOException {
        jt1.m53777p(frVar, "payload");
        mo48458d(9, frVar);
    }

    /* renamed from: l */
    public final void mo48461l(@vr2 C5301fr frVar) throws IOException {
        jt1.m53777p(frVar, "payload");
        mo48458d(10, frVar);
    }
}
