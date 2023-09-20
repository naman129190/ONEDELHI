package com.onedelhi.secure;

import com.onedelhi.secure.C6205no;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/yw4;", "Ljava/io/Closeable;", "Lcom/onedelhi/secure/un4;", "b", "close", "d", "c", "h", "l", "g", "Lcom/onedelhi/secure/to;", "source", "Lcom/onedelhi/secure/to;", "a", "()Lcom/onedelhi/secure/to;", "", "isClient", "Lcom/onedelhi/secure/yw4$a;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLcom/onedelhi/secure/to;Lcom/onedelhi/secure/yw4$a;ZZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class yw4 implements Closeable {

    /* renamed from: a */
    public final C6205no.C6206a f38086a;

    /* renamed from: a */
    public final C6205no f38087a = new C6205no();
    @vr2

    /* renamed from: a */
    public final C6893to f38088a;

    /* renamed from: a */
    public uh2 f38089a;

    /* renamed from: a */
    public final C7396a f38090a;

    /* renamed from: a */
    public final byte[] f38091a;

    /* renamed from: b */
    public long f38092b;

    /* renamed from: b */
    public final C6205no f38093b = new C6205no();

    /* renamed from: b */
    public boolean f38094b;

    /* renamed from: c */
    public boolean f38095c;

    /* renamed from: d */
    public boolean f38096d;

    /* renamed from: e */
    public boolean f38097e;

    /* renamed from: f */
    public final boolean f38098f;

    /* renamed from: g */
    public final boolean f38099g;

    /* renamed from: h */
    public final boolean f38100h;

    /* renamed from: n */
    public int f38101n;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H&¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/yw4$a;", "", "", "text", "Lcom/onedelhi/secure/un4;", "c", "Lcom/onedelhi/secure/fr;", "bytes", "b", "payload", "a", "e", "", "code", "reason", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.yw4$a */
    public interface C7396a {
        /* renamed from: a */
        void mo38637a(@vr2 C5301fr frVar);

        /* renamed from: b */
        void mo38638b(@vr2 C5301fr frVar) throws IOException;

        /* renamed from: c */
        void mo38639c(@vr2 String str) throws IOException;

        /* renamed from: d */
        void mo38642d(int i, @vr2 String str);

        /* renamed from: e */
        void mo38643e(@vr2 C5301fr frVar);
    }

    public yw4(boolean z, @vr2 C6893to toVar, @vr2 C7396a aVar, boolean z2, boolean z3) {
        jt1.m53777p(toVar, "source");
        jt1.m53777p(aVar, "frameCallback");
        this.f38098f = z;
        this.f38088a = toVar;
        this.f38090a = aVar;
        this.f38099g = z2;
        this.f38100h = z3;
        C6205no.C6206a aVar2 = null;
        this.f38091a = z ? null : new byte[4];
        this.f38086a = !z ? new C6205no.C6206a() : aVar2;
    }

    @vr2
    /* renamed from: a */
    public final C6893to mo48029a() {
        return this.f38088a;
    }

    /* renamed from: b */
    public final void mo48030b() throws IOException {
        mo48033d();
        if (this.f38096d) {
            mo48031c();
        } else {
            mo48035h();
        }
    }

    /* renamed from: c */
    public final void mo48031c() throws IOException {
        String str;
        long j = this.f38092b;
        if (j > 0) {
            this.f38088a.mo31683e2(this.f38087a, j);
            if (!this.f38098f) {
                C6205no noVar = this.f38087a;
                C6205no.C6206a aVar = this.f38086a;
                jt1.m53774m(aVar);
                noVar.mo41285q0(aVar);
                this.f38086a.mo41303d(0);
                xw4 xw4 = xw4.f37655a;
                C6205no.C6206a aVar2 = this.f38086a;
                byte[] bArr = this.f38091a;
                jt1.m53774m(bArr);
                xw4.mo47427c(aVar2, bArr);
                this.f38086a.close();
            }
        }
        switch (this.f38101n) {
            case 8:
                short s = 1005;
                long V0 = this.f38087a.mo41244V0();
                if (V0 != 1) {
                    if (V0 != 0) {
                        s = this.f38087a.readShort();
                        str = this.f38087a.mo31688j();
                        String b = xw4.f37655a.mo47426b(s);
                        if (b != null) {
                            throw new ProtocolException(b);
                        }
                    } else {
                        str = "";
                    }
                    this.f38090a.mo38642d(s, str);
                    this.f38094b = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f38090a.mo38637a(this.f38087a.mo31697r0());
                return;
            case 10:
                this.f38090a.mo38643e(this.f38087a.mo31697r0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + nq4.m58688Z(this.f38101n));
        }
    }

    public void close() throws IOException {
        uh2 uh2 = this.f38089a;
        if (uh2 != null) {
            uh2.close();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final void mo48033d() throws IOException, ProtocolException {
        boolean z;
        if (!this.f38094b) {
            long j = this.f38088a.timeout().mo40563j();
            this.f38088a.timeout().mo40555b();
            try {
                int b = nq4.m58691b(this.f38088a.readByte(), 255);
                this.f38088a.timeout().mo40562i(j, TimeUnit.NANOSECONDS);
                int i = b & 15;
                this.f38101n = i;
                boolean z2 = false;
                boolean z3 = (b & 128) != 0;
                this.f38095c = z3;
                boolean z4 = (b & 8) != 0;
                this.f38096d = z4;
                if (!z4 || z3) {
                    boolean z5 = (b & 64) != 0;
                    if (i == 1 || i == 2) {
                        if (!z5) {
                            z = false;
                        } else if (this.f38099g) {
                            z = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.f38097e = z;
                    } else if (z5) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if (!((b & 32) != 0)) {
                        if (!((b & 16) != 0)) {
                            int b2 = nq4.m58691b(this.f38088a.readByte(), 255);
                            if ((b2 & 128) != 0) {
                                z2 = true;
                            }
                            if (z2 == this.f38098f) {
                                throw new ProtocolException(this.f38098f ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                            }
                            long j2 = (long) (b2 & 127);
                            this.f38092b = j2;
                            if (j2 == ((long) 126)) {
                                this.f38092b = (long) nq4.m58693c(this.f38088a.readShort(), 65535);
                            } else if (j2 == ((long) 127)) {
                                long readLong = this.f38088a.readLong();
                                this.f38092b = readLong;
                                if (readLong < 0) {
                                    throw new ProtocolException("Frame length 0x" + nq4.m58690a0(this.f38092b) + " > 0x7FFFFFFFFFFFFFFF");
                                }
                            }
                            if (this.f38096d && this.f38092b > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            } else if (z2) {
                                C6893to toVar = this.f38088a;
                                byte[] bArr = this.f38091a;
                                jt1.m53774m(bArr);
                                toVar.readFully(bArr);
                            }
                        } else {
                            throw new ProtocolException("Unexpected rsv3 flag");
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f38088a.timeout().mo40562i(j, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: g */
    public final void mo48034g() throws IOException {
        while (!this.f38094b) {
            long j = this.f38092b;
            if (j > 0) {
                this.f38088a.mo31683e2(this.f38093b, j);
                if (!this.f38098f) {
                    C6205no noVar = this.f38093b;
                    C6205no.C6206a aVar = this.f38086a;
                    jt1.m53774m(aVar);
                    noVar.mo41285q0(aVar);
                    this.f38086a.mo41303d(this.f38093b.mo41244V0() - this.f38092b);
                    xw4 xw4 = xw4.f37655a;
                    C6205no.C6206a aVar2 = this.f38086a;
                    byte[] bArr = this.f38091a;
                    jt1.m53774m(bArr);
                    xw4.mo47427c(aVar2, bArr);
                    this.f38086a.close();
                }
            }
            if (!this.f38095c) {
                mo48036l();
                if (this.f38101n != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + nq4.m58688Z(this.f38101n));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    /* renamed from: h */
    public final void mo48035h() throws IOException {
        int i = this.f38101n;
        if (i == 1 || i == 2) {
            mo48034g();
            if (this.f38097e) {
                uh2 uh2 = this.f38089a;
                if (uh2 == null) {
                    uh2 = new uh2(this.f38100h);
                    this.f38089a = uh2;
                }
                uh2.mo45596a(this.f38093b);
            }
            if (i == 1) {
                this.f38090a.mo38639c(this.f38093b.mo31688j());
            } else {
                this.f38090a.mo38638b(this.f38093b.mo31697r0());
            }
        } else {
            throw new ProtocolException("Unknown opcode: " + nq4.m58688Z(i));
        }
    }

    /* renamed from: l */
    public final void mo48036l() throws IOException {
        while (!this.f38094b) {
            mo48033d();
            if (this.f38096d) {
                mo48031c();
            } else {
                return;
            }
        }
    }
}
