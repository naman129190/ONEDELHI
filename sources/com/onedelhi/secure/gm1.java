package com.onedelhi.secure;

import com.onedelhi.secure.wl1;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00107\u001a\u00020\u0013¢\u0006\u0004\b8\u00109J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0007J(\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0007J(\u0010\u001b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0004J\u001e\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007J\u001e\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#J\u0016\u0010(\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&J&\u0010+\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007J\b\u0010,\u001a\u00020\u0002H\u0016J$\u0010.\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0018\u0010/\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020&H\u0002R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u0006:"}, d2 = {"Lcom/onedelhi/secure/gm1;", "Ljava/io/Closeable;", "Lcom/onedelhi/secure/un4;", "b", "Lcom/onedelhi/secure/kv3;", "peerSettings", "a", "", "streamId", "promisedStreamId", "", "Lcom/onedelhi/secure/sk1;", "requestHeaders", "A", "flush", "Lcom/onedelhi/secure/hv0;", "errorCode", "E", "p", "", "outFinished", "Lcom/onedelhi/secure/no;", "source", "byteCount", "c", "flags", "buffer", "d", "settings", "H", "ack", "payload1", "payload2", "q", "lastGoodStreamId", "", "debugData", "l", "", "windowSizeIncrement", "K", "length", "type", "g", "close", "headerBlock", "m", "M", "Lcom/onedelhi/secure/wl1$b;", "hpackWriter", "Lcom/onedelhi/secure/wl1$b;", "h", "()Lcom/onedelhi/secure/wl1$b;", "Lcom/onedelhi/secure/so;", "sink", "client", "<init>", "(Lcom/onedelhi/secure/so;Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class gm1 implements Closeable {

    /* renamed from: a */
    public static final C5438a f29219a = new C5438a((wg0) null);

    /* renamed from: a */
    public static final Logger f29220a = Logger.getLogger(bm1.class.getName());

    /* renamed from: a */
    public final C6205no f29221a;

    /* renamed from: a */
    public final C6785so f29222a;
    @vr2

    /* renamed from: a */
    public final wl1.C7172b f29223a;

    /* renamed from: b */
    public boolean f29224b;

    /* renamed from: c */
    public final boolean f29225c;

    /* renamed from: n */
    public int f29226n = 16384;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/gm1$a;", "", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.gm1$a */
    public static final class C5438a {
        public C5438a() {
        }

        public /* synthetic */ C5438a(wg0 wg0) {
            this();
        }
    }

    public gm1(@vr2 C6785so soVar, boolean z) {
        jt1.m53777p(soVar, "sink");
        this.f29222a = soVar;
        this.f29225c = z;
        C6205no noVar = new C6205no();
        this.f29221a = noVar;
        this.f29223a = new wl1.C7172b(0, false, noVar, 3, (wg0) null);
    }

    /* renamed from: A */
    public final synchronized void mo36770A(int i, int i2, @vr2 List<sk1> list) throws IOException {
        jt1.m53777p(list, "requestHeaders");
        if (!this.f29224b) {
            this.f29223a.mo46795g(list);
            long V0 = this.f29221a.mo41244V0();
            int min = (int) Math.min(((long) this.f29226n) - 4, V0);
            int i3 = min + 4;
            long j = (long) min;
            int i4 = (V0 > j ? 1 : (V0 == j ? 0 : -1));
            mo36781g(i, i3, 5, i4 == 0 ? 4 : 0);
            this.f29222a.mo41293w0(i2 & Integer.MAX_VALUE);
            this.f29222a.write(this.f29221a, j);
            if (i4 > 0) {
                mo36774M(i, V0 - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: E */
    public final synchronized void mo36771E(int i, @vr2 hv0 hv0) throws IOException {
        jt1.m53777p(hv0, "errorCode");
        if (!this.f29224b) {
            if (hv0.mo37573a() != -1) {
                mo36781g(i, 4, 3, 0);
                this.f29222a.mo41293w0(hv0.mo37573a());
                this.f29222a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: H */
    public final synchronized void mo36772H(@vr2 kv3 kv3) throws IOException {
        jt1.m53777p(kv3, uh3.f36123f);
        if (!this.f29224b) {
            int i = 0;
            mo36781g(0, kv3.mo39540l() * 6, 4, 0);
            while (i < 10) {
                if (kv3.mo39537i(i)) {
                    this.f29222a.mo41243V(i != 4 ? i != 7 ? i : 4 : 3);
                    this.f29222a.mo41293w0(kv3.mo39530b(i));
                }
                i++;
            }
            this.f29222a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: K */
    public final synchronized void mo36773K(int i, long j) throws IOException {
        if (!this.f29224b) {
            if (j != 0 && j <= 2147483647L) {
                mo36781g(i, 4, 8, 0);
                this.f29222a.mo41293w0((int) j);
                this.f29222a.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: M */
    public final void mo36774M(int i, long j) throws IOException {
        while (j > 0) {
            long min = Math.min((long) this.f29226n, j);
            j -= min;
            mo36781g(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f29222a.write(this.f29221a, min);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36775a(@vr2 kv3 kv3) throws IOException {
        jt1.m53777p(kv3, "peerSettings");
        if (!this.f29224b) {
            this.f29226n = kv3.mo39535g(this.f29226n);
            if (kv3.mo39532d() != -1) {
                this.f29223a.mo46793e(kv3.mo39532d());
            }
            mo36781g(0, 0, 4, 1);
            this.f29222a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public final synchronized void mo36776b() throws IOException {
        if (this.f29224b) {
            throw new IOException("closed");
        } else if (this.f29225c) {
            Logger logger = f29220a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(nq4.m58722v(">> CONNECTION " + bm1.f26419a.mo31159D(), new Object[0]));
            }
            this.f29222a.mo41287s(bm1.f26419a);
            this.f29222a.flush();
        }
    }

    /* renamed from: c */
    public final synchronized void mo36777c(boolean z, int i, @ss2 C6205no noVar, int i2) throws IOException {
        if (!this.f29224b) {
            mo36779d(i, z ? 1 : 0, noVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() throws IOException {
        this.f29224b = true;
        this.f29222a.close();
    }

    /* renamed from: d */
    public final void mo36779d(int i, int i2, @ss2 C6205no noVar, int i3) throws IOException {
        mo36781g(i, i3, 0, i2);
        if (i3 > 0) {
            C6785so soVar = this.f29222a;
            jt1.m53774m(noVar);
            soVar.write(noVar, (long) i3);
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.f29224b) {
            this.f29222a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: g */
    public final void mo36781g(int i, int i2, int i3, int i4) throws IOException {
        Logger logger = f29220a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(bm1.f26418a.mo31951c(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.f29226n) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                nq4.m58712l0(this.f29222a, i2);
                this.f29222a.mo41230L0(i3 & 255);
                this.f29222a.mo41230L0(i4 & 255);
                this.f29222a.mo41293w0(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f29226n + ": " + i2).toString());
    }

    @vr2
    /* renamed from: h */
    public final wl1.C7172b mo36782h() {
        return this.f29223a;
    }

    /* renamed from: l */
    public final synchronized void mo36783l(int i, @vr2 hv0 hv0, @vr2 byte[] bArr) throws IOException {
        jt1.m53777p(hv0, "errorCode");
        jt1.m53777p(bArr, "debugData");
        if (!this.f29224b) {
            boolean z = false;
            if (hv0.mo37573a() != -1) {
                mo36781g(0, bArr.length + 8, 7, 0);
                this.f29222a.mo41293w0(i);
                this.f29222a.mo41293w0(hv0.mo37573a());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f29222a.mo41221D2(bArr);
                }
                this.f29222a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: m */
    public final synchronized void mo36784m(boolean z, int i, @vr2 List<sk1> list) throws IOException {
        jt1.m53777p(list, "headerBlock");
        if (!this.f29224b) {
            this.f29223a.mo46795g(list);
            long V0 = this.f29221a.mo41244V0();
            long min = Math.min((long) this.f29226n, V0);
            int i2 = (V0 > min ? 1 : (V0 == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            mo36781g(i, (int) min, 1, i3);
            this.f29222a.write(this.f29221a, min);
            if (i2 > 0) {
                mo36774M(i, V0 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: p */
    public final int mo36785p() {
        return this.f29226n;
    }

    /* renamed from: q */
    public final synchronized void mo36786q(boolean z, int i, int i2) throws IOException {
        if (!this.f29224b) {
            mo36781g(0, 8, 6, z ? 1 : 0);
            this.f29222a.mo41293w0(i);
            this.f29222a.mo41293w0(i2);
            this.f29222a.flush();
        } else {
            throw new IOException("closed");
        }
    }
}
