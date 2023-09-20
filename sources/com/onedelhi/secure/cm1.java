package com.onedelhi.secure;

import com.onedelhi.secure.ea4;
import com.onedelhi.secure.em1;
import com.onedelhi.secure.yg3;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0007\u0001\u0001\u0001\fB\u0015\b\u0000\u0012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0002J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\u001a\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J-\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\"\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0015J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010'\u001a\u00020#H\u0000¢\u0006\u0004\b(\u0010&J\u001f\u0010*\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0015H\u0000¢\u0006\u0004\b*\u0010+J\u001e\u0010/\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002J\u0006\u00100\u001a\u00020\rJ\u0006\u00101\u001a\u00020\rJ\u0006\u00102\u001a\u00020\rJ\u0006\u00103\u001a\u00020\rJ\u000e\u00104\u001a\u00020\r2\u0006\u0010'\u001a\u00020#J\b\u00105\u001a\u00020\rH\u0016J)\u00109\u001a\u00020\r2\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020#2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b9\u0010:J\u001c\u0010>\u001a\u00020\r2\b\b\u0002\u0010;\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u00020<H\u0007J\u000e\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?J\u000e\u0010C\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0015J\u000f\u0010D\u001a\u00020\rH\u0000¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\bH\u0010IJ-\u0010K\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bK\u0010LJ/\u0010O\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\bQ\u0010&R\u001a\u0010R\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010W\u001a\u00020V8\u0000X\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR&\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0[8\u0000X\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010a\u001a\u00020`8\u0000X\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\"\u0010e\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010k\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bk\u0010f\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR\u0017\u0010n\u001a\u00020?8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\"\u0010r\u001a\u00020?8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\br\u0010o\u001a\u0004\bs\u0010q\"\u0004\bt\u0010uR$\u0010w\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u00158\u0006@BX\u000e¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR$\u0010{\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u00158\u0006@BX\u000e¢\u0006\f\n\u0004\b{\u0010x\u001a\u0004\b|\u0010zR$\u0010}\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u00158\u0006@BX\u000e¢\u0006\f\n\u0004\b}\u0010x\u001a\u0004\b~\u0010zR%\u0010\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u00158\u0006@BX\u000e¢\u0006\r\n\u0004\b\u0010x\u001a\u0005\b\u0001\u0010zR \u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R!\u0010\u0001\u001a\u00070\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/onedelhi/secure/cm1;", "Ljava/io/Closeable;", "", "associatedStreamId", "", "Lcom/onedelhi/secure/sk1;", "requestHeaders", "", "out", "Lcom/onedelhi/secure/fm1;", "f1", "Ljava/io/IOException;", "e", "Lcom/onedelhi/secure/un4;", "l0", "i1", "id", "Q0", "streamId", "A1", "(I)Lcom/onedelhi/secure/fm1;", "", "read", "V1", "(J)V", "w1", "h1", "outFinished", "alternating", "b2", "(IZLjava/util/List;)V", "Lcom/onedelhi/secure/no;", "buffer", "byteCount", "a2", "Lcom/onedelhi/secure/hv0;", "errorCode", "j2", "(ILcom/onedelhi/secure/hv0;)V", "statusCode", "i2", "unacknowledgedBytesRead", "o2", "(IJ)V", "reply", "payload1", "payload2", "d2", "g2", "c2", "e0", "flush", "H1", "close", "connectionCode", "streamCode", "cause", "j0", "(Lcom/onedelhi/secure/hv0;Lcom/onedelhi/secure/hv0;Ljava/io/IOException;)V", "sendConnectionPreface", "Lcom/onedelhi/secure/fa4;", "taskRunner", "M1", "Lcom/onedelhi/secure/kv3;", "settings", "G1", "nowNs", "c1", "B1", "()V", "z1", "(I)Z", "p1", "(ILjava/util/List;)V", "inFinished", "l1", "(ILjava/util/List;Z)V", "Lcom/onedelhi/secure/to;", "source", "j1", "(ILcom/onedelhi/secure/to;IZ)V", "s1", "client", "Z", "o0", "()Z", "Lcom/onedelhi/secure/cm1$d;", "listener", "Lcom/onedelhi/secure/cm1$d;", "u0", "()Lcom/onedelhi/secure/cm1$d;", "", "streams", "Ljava/util/Map;", "R0", "()Ljava/util/Map;", "", "connectionName", "Ljava/lang/String;", "p0", "()Ljava/lang/String;", "lastGoodStreamId", "I", "q0", "()I", "C1", "(I)V", "nextStreamId", "C0", "D1", "okHttpSettings", "Lcom/onedelhi/secure/kv3;", "F0", "()Lcom/onedelhi/secure/kv3;", "peerSettings", "G0", "E1", "(Lcom/onedelhi/secure/kv3;)V", "<set-?>", "readBytesTotal", "J", "N0", "()J", "readBytesAcknowledged", "M0", "writeBytesTotal", "V0", "writeBytesMaximum", "S0", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "P0", "()Ljava/net/Socket;", "Lcom/onedelhi/secure/gm1;", "writer", "Lcom/onedelhi/secure/gm1;", "b1", "()Lcom/onedelhi/secure/gm1;", "Lcom/onedelhi/secure/cm1$e;", "readerRunnable", "Lcom/onedelhi/secure/cm1$e;", "O0", "()Lcom/onedelhi/secure/cm1$e;", "Lcom/onedelhi/secure/cm1$b;", "builder", "<init>", "(Lcom/onedelhi/secure/cm1$b;)V", "b", "c", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class cm1 implements Closeable {

    /* renamed from: a */
    public static final C4879c f26891a = new C4879c((wg0) null);
    @vr2

    /* renamed from: c */
    public static final kv3 f26892c;

    /* renamed from: p */
    public static final int f26893p = 16777216;

    /* renamed from: q */
    public static final int f26894q = 1;

    /* renamed from: r */
    public static final int f26895r = 2;

    /* renamed from: s */
    public static final int f26896s = 3;

    /* renamed from: t */
    public static final int f26897t = 1000000000;
    @vr2

    /* renamed from: a */
    public final C4880d f26898a;
    @vr2

    /* renamed from: a */
    public final C4883e f26899a;

    /* renamed from: a */
    public final d83 f26900a;

    /* renamed from: a */
    public final ea4 f26901a;

    /* renamed from: a */
    public final fa4 f26902a;
    @vr2

    /* renamed from: a */
    public final gm1 f26903a;
    @vr2

    /* renamed from: a */
    public final kv3 f26904a;
    @vr2

    /* renamed from: a */
    public final Socket f26905a;
    @vr2

    /* renamed from: a */
    public final Map<Integer, fm1> f26906a = new LinkedHashMap();

    /* renamed from: a */
    public final Set<Integer> f26907a;

    /* renamed from: b */
    public long f26908b;

    /* renamed from: b */
    public final ea4 f26909b;
    @vr2

    /* renamed from: b */
    public kv3 f26910b;
    @vr2

    /* renamed from: b */
    public final String f26911b;

    /* renamed from: b */
    public final boolean f26912b;

    /* renamed from: c */
    public long f26913c;

    /* renamed from: c */
    public final ea4 f26914c;

    /* renamed from: c */
    public boolean f26915c;

    /* renamed from: d */
    public long f26916d;

    /* renamed from: e */
    public long f26917e;

    /* renamed from: f */
    public long f26918f;

    /* renamed from: g */
    public long f26919g;

    /* renamed from: h */
    public long f26920h;

    /* renamed from: i */
    public long f26921i;

    /* renamed from: j */
    public long f26922j;

    /* renamed from: k */
    public long f26923k;

    /* renamed from: l */
    public long f26924l;

    /* renamed from: n */
    public int f26925n;

    /* renamed from: o */
    public int f26926o;

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/ea4$c", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$a */
    public static final class C4877a extends v94 {

        /* renamed from: a */
        public final /* synthetic */ cm1 f26927a;

        /* renamed from: b */
        public final /* synthetic */ long f26928b;

        /* renamed from: b */
        public final /* synthetic */ String f26929b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4877a(String str, String str2, cm1 cm1, long j) {
            super(str2, false, 2, (wg0) null);
            this.f26929b = str;
            this.f26927a = cm1;
            this.f26928b = j;
        }

        /* renamed from: f */
        public long mo33844f() {
            boolean z;
            synchronized (this.f26927a) {
                if (this.f26927a.f26913c < this.f26927a.f26908b) {
                    z = true;
                } else {
                    cm1 cm1 = this.f26927a;
                    cm1.f26908b = cm1.f26908b + 1;
                    z = false;
                }
            }
            cm1 cm12 = this.f26927a;
            if (z) {
                cm12.mo33833l0((IOException) null);
                return -1;
            }
            cm12.mo33822d2(false, 1, 0);
            return this.f26928b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bF\u0010GJ.\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00048\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010B\u001a\u00020A8\u0000X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/onedelhi/secure/cm1$b;", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lcom/onedelhi/secure/to;", "source", "Lcom/onedelhi/secure/so;", "sink", "y", "Lcom/onedelhi/secure/cm1$d;", "listener", "k", "Lcom/onedelhi/secure/d83;", "pushObserver", "m", "", "pingIntervalMillis", "l", "Lcom/onedelhi/secure/cm1;", "a", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "t", "(Ljava/net/Socket;)V", "connectionName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "Lcom/onedelhi/secure/to;", "i", "()Lcom/onedelhi/secure/to;", "u", "(Lcom/onedelhi/secure/to;)V", "Lcom/onedelhi/secure/so;", "g", "()Lcom/onedelhi/secure/so;", "s", "(Lcom/onedelhi/secure/so;)V", "Lcom/onedelhi/secure/cm1$d;", "d", "()Lcom/onedelhi/secure/cm1$d;", "p", "(Lcom/onedelhi/secure/cm1$d;)V", "Lcom/onedelhi/secure/d83;", "f", "()Lcom/onedelhi/secure/d83;", "r", "(Lcom/onedelhi/secure/d83;)V", "I", "e", "()I", "q", "(I)V", "", "client", "Z", "b", "()Z", "n", "(Z)V", "Lcom/onedelhi/secure/fa4;", "taskRunner", "Lcom/onedelhi/secure/fa4;", "j", "()Lcom/onedelhi/secure/fa4;", "<init>", "(ZLcom/onedelhi/secure/fa4;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$b */
    public static final class C4878b {

        /* renamed from: a */
        public int f26930a;
        @vr2

        /* renamed from: a */
        public C4880d f26931a = C4880d.f26940a;
        @vr2

        /* renamed from: a */
        public d83 f26932a = d83.f27277a;
        @vr2

        /* renamed from: a */
        public final fa4 f26933a;
        @vr2

        /* renamed from: a */
        public C6785so f26934a;
        @vr2

        /* renamed from: a */
        public C6893to f26935a;
        @vr2

        /* renamed from: a */
        public String f26936a;
        @vr2

        /* renamed from: a */
        public Socket f26937a;

        /* renamed from: a */
        public boolean f26938a;

        public C4878b(boolean z, @vr2 fa4 fa4) {
            jt1.m53777p(fa4, "taskRunner");
            this.f26938a = z;
            this.f26933a = fa4;
        }

        /* renamed from: z */
        public static /* synthetic */ C4878b m44079z(C4878b bVar, Socket socket, String str, C6893to toVar, C6785so soVar, int i, Object obj) throws IOException {
            if ((i & 2) != 0) {
                str = nq4.m58678P(socket);
            }
            if ((i & 4) != 0) {
                toVar = gu2.m49835d(gu2.m49845n(socket));
            }
            if ((i & 8) != 0) {
                soVar = gu2.m49834c(gu2.m49840i(socket));
            }
            return bVar.mo33869y(socket, str, toVar, soVar);
        }

        @vr2
        /* renamed from: a */
        public final cm1 mo33845a() {
            return new cm1(this);
        }

        /* renamed from: b */
        public final boolean mo33846b() {
            return this.f26938a;
        }

        @vr2
        /* renamed from: c */
        public final String mo33847c() {
            String str = this.f26936a;
            if (str == null) {
                jt1.m53761S("connectionName");
            }
            return str;
        }

        @vr2
        /* renamed from: d */
        public final C4880d mo33848d() {
            return this.f26931a;
        }

        /* renamed from: e */
        public final int mo33849e() {
            return this.f26930a;
        }

        @vr2
        /* renamed from: f */
        public final d83 mo33850f() {
            return this.f26932a;
        }

        @vr2
        /* renamed from: g */
        public final C6785so mo33851g() {
            C6785so soVar = this.f26934a;
            if (soVar == null) {
                jt1.m53761S("sink");
            }
            return soVar;
        }

        @vr2
        /* renamed from: h */
        public final Socket mo33852h() {
            Socket socket = this.f26937a;
            if (socket == null) {
                jt1.m53761S("socket");
            }
            return socket;
        }

        @vr2
        /* renamed from: i */
        public final C6893to mo33853i() {
            C6893to toVar = this.f26935a;
            if (toVar == null) {
                jt1.m53761S("source");
            }
            return toVar;
        }

        @vr2
        /* renamed from: j */
        public final fa4 mo33854j() {
            return this.f26933a;
        }

        @vr2
        /* renamed from: k */
        public final C4878b mo33855k(@vr2 C4880d dVar) {
            jt1.m53777p(dVar, "listener");
            this.f26931a = dVar;
            return this;
        }

        @vr2
        /* renamed from: l */
        public final C4878b mo33856l(int i) {
            this.f26930a = i;
            return this;
        }

        @vr2
        /* renamed from: m */
        public final C4878b mo33857m(@vr2 d83 d83) {
            jt1.m53777p(d83, "pushObserver");
            this.f26932a = d83;
            return this;
        }

        /* renamed from: n */
        public final void mo33858n(boolean z) {
            this.f26938a = z;
        }

        /* renamed from: o */
        public final void mo33859o(@vr2 String str) {
            jt1.m53777p(str, "<set-?>");
            this.f26936a = str;
        }

        /* renamed from: p */
        public final void mo33860p(@vr2 C4880d dVar) {
            jt1.m53777p(dVar, "<set-?>");
            this.f26931a = dVar;
        }

        /* renamed from: q */
        public final void mo33861q(int i) {
            this.f26930a = i;
        }

        /* renamed from: r */
        public final void mo33862r(@vr2 d83 d83) {
            jt1.m53777p(d83, "<set-?>");
            this.f26932a = d83;
        }

        /* renamed from: s */
        public final void mo33863s(@vr2 C6785so soVar) {
            jt1.m53777p(soVar, "<set-?>");
            this.f26934a = soVar;
        }

        /* renamed from: t */
        public final void mo33864t(@vr2 Socket socket) {
            jt1.m53777p(socket, "<set-?>");
            this.f26937a = socket;
        }

        /* renamed from: u */
        public final void mo33865u(@vr2 C6893to toVar) {
            jt1.m53777p(toVar, "<set-?>");
            this.f26935a = toVar;
        }

        @vw1
        @vr2
        /* renamed from: v */
        public final C4878b mo33866v(@vr2 Socket socket) throws IOException {
            return m44079z(this, socket, (String) null, (C6893to) null, (C6785so) null, 14, (Object) null);
        }

        @vw1
        @vr2
        /* renamed from: w */
        public final C4878b mo33867w(@vr2 Socket socket, @vr2 String str) throws IOException {
            return m44079z(this, socket, str, (C6893to) null, (C6785so) null, 12, (Object) null);
        }

        @vw1
        @vr2
        /* renamed from: x */
        public final C4878b mo33868x(@vr2 Socket socket, @vr2 String str, @vr2 C6893to toVar) throws IOException {
            return m44079z(this, socket, str, toVar, (C6785so) null, 8, (Object) null);
        }

        @vw1
        @vr2
        /* renamed from: y */
        public final C4878b mo33869y(@vr2 Socket socket, @vr2 String str, @vr2 C6893to toVar, @vr2 C6785so soVar) throws IOException {
            StringBuilder sb;
            jt1.m53777p(socket, "socket");
            jt1.m53777p(str, "peerName");
            jt1.m53777p(toVar, "source");
            jt1.m53777p(soVar, "sink");
            this.f26937a = socket;
            if (this.f26938a) {
                sb = new StringBuilder();
                sb.append(nq4.f32729a);
                sb.append(' ');
            } else {
                sb = new StringBuilder();
                sb.append("MockWebServer ");
            }
            sb.append(str);
            this.f26936a = sb.toString();
            this.f26935a = toVar;
            this.f26934a = soVar;
            return this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/cm1$c;", "", "Lcom/onedelhi/secure/kv3;", "DEFAULT_SETTINGS", "Lcom/onedelhi/secure/kv3;", "a", "()Lcom/onedelhi/secure/kv3;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$c */
    public static final class C4879c {
        public C4879c() {
        }

        public /* synthetic */ C4879c(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final kv3 mo33870a() {
            return cm1.f26892c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/cm1$d;", "", "Lcom/onedelhi/secure/fm1;", "stream", "Lcom/onedelhi/secure/un4;", "b", "Lcom/onedelhi/secure/cm1;", "connection", "Lcom/onedelhi/secure/kv3;", "settings", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$d */
    public static abstract class C4880d {

        /* renamed from: a */
        public static final C4882b f26939a = new C4882b((wg0) null);
        @rw1
        @vr2

        /* renamed from: a */
        public static final C4880d f26940a = new C4881a();

        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/onedelhi/secure/cm1$d$a", "Lcom/onedelhi/secure/cm1$d;", "Lcom/onedelhi/secure/fm1;", "stream", "Lcom/onedelhi/secure/un4;", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.cm1$d$a */
        public static final class C4881a extends C4880d {
            /* renamed from: b */
            public void mo33872b(@vr2 fm1 fm1) throws IOException {
                jt1.m53777p(fm1, "stream");
                fm1.mo36091d(hv0.REFUSED_STREAM, (IOException) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/cm1$d$b;", "", "Lcom/onedelhi/secure/cm1$d;", "REFUSE_INCOMING_STREAMS", "Lcom/onedelhi/secure/cm1$d;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.cm1$d$b */
        public static final class C4882b {
            public C4882b() {
            }

            public /* synthetic */ C4882b(wg0 wg0) {
                this();
            }
        }

        /* renamed from: a */
        public void mo33871a(@vr2 cm1 cm1, @vr2 kv3 kv3) {
            jt1.m53777p(cm1, dm1.f27486a);
            jt1.m53777p(kv3, uh3.f36123f);
        }

        /* renamed from: b */
        public abstract void mo33872b(@vr2 fm1 fm1) throws IOException;
    }

    @Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b9\u0010:J\t\u0010\u0004\u001a\u00020\u0003H\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J \u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0016J(\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0005H\u0016J&\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J8\u00103\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020#H\u0016R\u001a\u00105\u001a\u0002048\u0000X\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/onedelhi/secure/cm1$e;", "Lcom/onedelhi/secure/em1$c;", "Lkotlin/Function0;", "Lcom/onedelhi/secure/un4;", "y", "", "inFinished", "", "streamId", "Lcom/onedelhi/secure/to;", "source", "length", "b", "associatedStreamId", "", "Lcom/onedelhi/secure/sk1;", "headerBlock", "n", "Lcom/onedelhi/secure/hv0;", "errorCode", "j", "clearPrevious", "Lcom/onedelhi/secure/kv3;", "settings", "l", "s", "d", "ack", "payload1", "payload2", "f", "lastGoodStreamId", "Lcom/onedelhi/secure/fr;", "debugData", "i", "", "windowSizeIncrement", "q", "streamDependency", "weight", "exclusive", "e", "promisedStreamId", "requestHeaders", "a", "", "origin", "protocol", "host", "port", "maxAge", "c", "Lcom/onedelhi/secure/em1;", "reader", "Lcom/onedelhi/secure/em1;", "w", "()Lcom/onedelhi/secure/em1;", "<init>", "(Lcom/onedelhi/secure/cm1;Lcom/onedelhi/secure/em1;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$e */
    public final class C4883e implements em1.C5165c, cc1<un4> {

        /* renamed from: a */
        public final /* synthetic */ cm1 f26941a;
        @vr2

        /* renamed from: a */
        public final em1 f26942a;

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$synchronized$lambda$1"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.cm1$e$a */
        public static final class C4884a extends v94 {

            /* renamed from: a */
            public final /* synthetic */ C4883e f26943a;

            /* renamed from: a */
            public final /* synthetic */ kv3 f26944a;

            /* renamed from: a */
            public final /* synthetic */ yg3.C7356g f26945a;

            /* renamed from: a */
            public final /* synthetic */ yg3.C7357h f26946a;

            /* renamed from: b */
            public final /* synthetic */ yg3.C7357h f26947b;

            /* renamed from: b */
            public final /* synthetic */ String f26948b;

            /* renamed from: b */
            public final /* synthetic */ boolean f26949b;

            /* renamed from: c */
            public final /* synthetic */ boolean f26950c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4884a(String str, boolean z, String str2, boolean z2, C4883e eVar, yg3.C7357h hVar, boolean z3, kv3 kv3, yg3.C7356g gVar, yg3.C7357h hVar2) {
                super(str2, z2);
                this.f26948b = str;
                this.f26949b = z;
                this.f26943a = eVar;
                this.f26946a = hVar;
                this.f26950c = z3;
                this.f26944a = kv3;
                this.f26945a = gVar;
                this.f26947b = hVar2;
            }

            /* renamed from: f */
            public long mo33844f() {
                this.f26943a.f26941a.mo33841u0().mo33871a(this.f26943a.f26941a, (kv3) this.f26946a.f37912a);
                return -1;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$execute$1"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.cm1$e$b */
        public static final class C4885b extends v94 {

            /* renamed from: a */
            public final /* synthetic */ int f26951a;

            /* renamed from: a */
            public final /* synthetic */ C4883e f26952a;

            /* renamed from: a */
            public final /* synthetic */ fm1 f26953a;

            /* renamed from: a */
            public final /* synthetic */ List f26954a;

            /* renamed from: b */
            public final /* synthetic */ fm1 f26955b;

            /* renamed from: b */
            public final /* synthetic */ String f26956b;

            /* renamed from: b */
            public final /* synthetic */ boolean f26957b;

            /* renamed from: c */
            public final /* synthetic */ boolean f26958c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4885b(String str, boolean z, String str2, boolean z2, fm1 fm1, C4883e eVar, fm1 fm12, int i, List list, boolean z3) {
                super(str2, z2);
                this.f26956b = str;
                this.f26957b = z;
                this.f26953a = fm1;
                this.f26952a = eVar;
                this.f26955b = fm12;
                this.f26951a = i;
                this.f26954a = list;
                this.f26958c = z3;
            }

            /* renamed from: f */
            public long mo33844f() {
                try {
                    this.f26952a.f26941a.mo33841u0().mo33872b(this.f26953a);
                    return -1;
                } catch (IOException e) {
                    k23 g = k23.f31087a.mo39034g();
                    g.mo39026m("Http2Connection.Listener failure for " + this.f26952a.f26941a.mo33837p0(), 4, e);
                    try {
                        this.f26953a.mo36091d(hv0.PROTOCOL_ERROR, e);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/ea4$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.cm1$e$c */
        public static final class C4886c extends v94 {

            /* renamed from: a */
            public final /* synthetic */ int f26959a;

            /* renamed from: a */
            public final /* synthetic */ C4883e f26960a;

            /* renamed from: b */
            public final /* synthetic */ int f26961b;

            /* renamed from: b */
            public final /* synthetic */ String f26962b;

            /* renamed from: b */
            public final /* synthetic */ boolean f26963b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4886c(String str, boolean z, String str2, boolean z2, C4883e eVar, int i, int i2) {
                super(str2, z2);
                this.f26962b = str;
                this.f26963b = z;
                this.f26960a = eVar;
                this.f26959a = i;
                this.f26961b = i2;
            }

            /* renamed from: f */
            public long mo33844f() {
                this.f26960a.f26941a.mo33822d2(true, this.f26959a, this.f26961b);
                return -1;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/ea4$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.cm1$e$d */
        public static final class C4887d extends v94 {

            /* renamed from: a */
            public final /* synthetic */ C4883e f26964a;

            /* renamed from: a */
            public final /* synthetic */ kv3 f26965a;

            /* renamed from: b */
            public final /* synthetic */ String f26966b;

            /* renamed from: b */
            public final /* synthetic */ boolean f26967b;

            /* renamed from: c */
            public final /* synthetic */ boolean f26968c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4887d(String str, boolean z, String str2, boolean z2, C4883e eVar, boolean z3, kv3 kv3) {
                super(str2, z2);
                this.f26966b = str;
                this.f26967b = z;
                this.f26964a = eVar;
                this.f26968c = z3;
                this.f26965a = kv3;
            }

            /* renamed from: f */
            public long mo33844f() {
                this.f26964a.mo33884s(this.f26968c, this.f26965a);
                return -1;
            }
        }

        public C4883e(@vr2 cm1 cm1, em1 em1) {
            jt1.m53777p(em1, "reader");
            this.f26941a = cm1;
            this.f26942a = em1;
        }

        /* renamed from: a */
        public void mo33873a(int i, int i2, @vr2 List<sk1> list) {
            jt1.m53777p(list, "requestHeaders");
            this.f26941a.mo33838p1(i2, list);
        }

        /* renamed from: b */
        public void mo33874b(boolean z, int i, @vr2 C6893to toVar, int i2) throws IOException {
            jt1.m53777p(toVar, "source");
            if (this.f26941a.mo33843z1(i)) {
                this.f26941a.mo33831j1(i, toVar, i2, z);
                return;
            }
            fm1 Q0 = this.f26941a.mo33811Q0(i);
            if (Q0 == null) {
                this.f26941a.mo33832j2(i, hv0.PROTOCOL_ERROR);
                long j = (long) i2;
                this.f26941a.mo33815V1(j);
                toVar.mo31670F1(j);
                return;
            }
            Q0.mo36112y(toVar, i2);
            if (z) {
                Q0.mo36113z(nq4.f32731a, true);
            }
        }

        /* renamed from: c */
        public void mo33875c(int i, @vr2 String str, @vr2 C5301fr frVar, @vr2 String str2, int i2, long j) {
            jt1.m53777p(str, "origin");
            jt1.m53777p(frVar, "protocol");
            jt1.m53777p(str2, dm1.f27488b);
        }

        /* renamed from: d */
        public void mo33876d() {
        }

        /* renamed from: e */
        public void mo33877e(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: f */
        public void mo33878f(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.f26941a) {
                    if (i == 1) {
                        cm1 cm1 = this.f26941a;
                        cm1.f26913c = cm1.f26913c + 1;
                    } else if (i != 2) {
                        if (i == 3) {
                            cm1 cm12 = this.f26941a;
                            cm12.f26919g = cm12.f26919g + 1;
                            cm1 cm13 = this.f26941a;
                            if (cm13 != null) {
                                cm13.notifyAll();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        un4 un4 = un4.f36206a;
                    } else {
                        cm1 cm14 = this.f26941a;
                        cm14.f26917e = cm14.f26917e + 1;
                    }
                }
                return;
            }
            String str = this.f26941a.mo33837p0() + " ping";
            this.f26941a.f26901a.mo34998m(new C4886c(str, true, str, true, this, i, i2), 0);
        }

        /* renamed from: i */
        public void mo33879i(int i, @vr2 hv0 hv0, @vr2 C5301fr frVar) {
            int i2;
            fm1[] fm1Arr;
            jt1.m53777p(hv0, "errorCode");
            jt1.m53777p(frVar, "debugData");
            frVar.mo36274j0();
            synchronized (this.f26941a) {
                Object[] array = this.f26941a.mo33812R0().values().toArray(new fm1[0]);
                if (array != null) {
                    fm1Arr = (fm1[]) array;
                    this.f26941a.f26915c = true;
                    un4 un4 = un4.f36206a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (fm1 fm1 : fm1Arr) {
                if (fm1.mo36098k() > i && fm1.mo36109v()) {
                    fm1.mo36076A(hv0.REFUSED_STREAM);
                    this.f26941a.mo33794A1(fm1.mo36098k());
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo33886y();
            return un4.f36206a;
        }

        /* renamed from: j */
        public void mo33880j(int i, @vr2 hv0 hv0) {
            jt1.m53777p(hv0, "errorCode");
            if (this.f26941a.mo33843z1(i)) {
                this.f26941a.mo33840s1(i, hv0);
                return;
            }
            fm1 A1 = this.f26941a.mo33794A1(i);
            if (A1 != null) {
                A1.mo36076A(hv0);
            }
        }

        /* renamed from: l */
        public void mo33881l(boolean z, @vr2 kv3 kv3) {
            jt1.m53777p(kv3, uh3.f36123f);
            String str = this.f26941a.mo33837p0() + " applyAndAckSettings";
            this.f26941a.f26901a.mo34998m(new C4887d(str, true, str, true, this, z, kv3), 0);
        }

        /* renamed from: n */
        public void mo33882n(boolean z, int i, int i2, @vr2 List<sk1> list) {
            boolean z2 = z;
            int i3 = i;
            List<sk1> list2 = list;
            jt1.m53777p(list2, "headerBlock");
            if (this.f26941a.mo33843z1(i3)) {
                this.f26941a.mo33834l1(i3, list2, z2);
                return;
            }
            synchronized (this.f26941a) {
                fm1 Q0 = this.f26941a.mo33811Q0(i3);
                if (Q0 != null) {
                    un4 un4 = un4.f36206a;
                    Q0.mo36113z(nq4.m58687Y(list), z2);
                } else if (!this.f26941a.f26915c) {
                    if (i3 > this.f26941a.mo33839q0()) {
                        if (i3 % 2 != this.f26941a.mo33796C0() % 2) {
                            fm1 fm1 = new fm1(i, this.f26941a, false, z, nq4.m58687Y(list));
                            this.f26941a.mo33797C1(i3);
                            this.f26941a.mo33812R0().put(Integer.valueOf(i), fm1);
                            String str = this.f26941a.mo33837p0() + '[' + i3 + "] onStream";
                            this.f26941a.f26902a.mo35812j().mo34998m(new C4885b(str, true, str, true, fm1, this, Q0, i, list, z), 0);
                        }
                    }
                }
            }
        }

        /* renamed from: q */
        public void mo33883q(int i, long j) {
            Object obj;
            if (i == 0) {
                Object obj2 = this.f26941a;
                synchronized (obj2) {
                    cm1 cm1 = this.f26941a;
                    cm1.f26924l = cm1.mo33813S0() + j;
                    cm1 cm12 = this.f26941a;
                    if (cm12 != null) {
                        cm12.notifyAll();
                        un4 un4 = un4.f36206a;
                        obj = obj2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
            } else {
                fm1 Q0 = this.f26941a.mo33811Q0(i);
                if (Q0 != null) {
                    synchronized (Q0) {
                        Q0.mo36088a(j);
                        un4 un42 = un4.f36206a;
                        obj = Q0;
                    }
                } else {
                    return;
                }
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: s */
        public final void mo33884s(boolean r22, @com.onedelhi.secure.vr2 com.onedelhi.secure.kv3 r23) {
            /*
                r21 = this;
                r12 = r21
                r0 = r23
                java.lang.String r1 = "settings"
                com.onedelhi.secure.jt1.m53777p(r0, r1)
                com.onedelhi.secure.yg3$g r13 = new com.onedelhi.secure.yg3$g
                r13.<init>()
                com.onedelhi.secure.yg3$h r14 = new com.onedelhi.secure.yg3$h
                r14.<init>()
                com.onedelhi.secure.yg3$h r15 = new com.onedelhi.secure.yg3$h
                r15.<init>()
                com.onedelhi.secure.cm1 r1 = r12.f26941a
                com.onedelhi.secure.gm1 r16 = r1.mo33817b1()
                monitor-enter(r16)
                com.onedelhi.secure.cm1 r11 = r12.f26941a     // Catch:{ all -> 0x0108 }
                monitor-enter(r11)     // Catch:{ all -> 0x0108 }
                com.onedelhi.secure.cm1 r1 = r12.f26941a     // Catch:{ all -> 0x0103 }
                com.onedelhi.secure.kv3 r1 = r1.mo33801G0()     // Catch:{ all -> 0x0103 }
                if (r22 == 0) goto L_0x002c
                r2 = r0
                goto L_0x0039
            L_0x002c:
                com.onedelhi.secure.kv3 r2 = new com.onedelhi.secure.kv3     // Catch:{ all -> 0x0103 }
                r2.<init>()     // Catch:{ all -> 0x0103 }
                r2.mo39538j(r1)     // Catch:{ all -> 0x0103 }
                r2.mo39538j(r0)     // Catch:{ all -> 0x0103 }
                com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0103 }
            L_0x0039:
                r15.f37912a = r2     // Catch:{ all -> 0x0103 }
                int r2 = r2.mo39533e()     // Catch:{ all -> 0x0103 }
                long r2 = (long) r2     // Catch:{ all -> 0x0103 }
                int r1 = r1.mo39533e()     // Catch:{ all -> 0x0103 }
                long r4 = (long) r1     // Catch:{ all -> 0x0103 }
                long r2 = r2 - r4
                r13.f37911b = r2     // Catch:{ all -> 0x0103 }
                r10 = 0
                r8 = 0
                int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x0079
                com.onedelhi.secure.cm1 r1 = r12.f26941a     // Catch:{ all -> 0x0103 }
                java.util.Map r1 = r1.mo33812R0()     // Catch:{ all -> 0x0103 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0103 }
                if (r1 == 0) goto L_0x005c
                goto L_0x0079
            L_0x005c:
                com.onedelhi.secure.cm1 r1 = r12.f26941a     // Catch:{ all -> 0x0103 }
                java.util.Map r1 = r1.mo33812R0()     // Catch:{ all -> 0x0103 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0103 }
                com.onedelhi.secure.fm1[] r2 = new com.onedelhi.secure.fm1[r10]     // Catch:{ all -> 0x0103 }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x0103 }
                if (r1 == 0) goto L_0x0071
                com.onedelhi.secure.fm1[] r1 = (com.onedelhi.secure.fm1[]) r1     // Catch:{ all -> 0x0103 }
                goto L_0x007a
            L_0x0071:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0103 }
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)     // Catch:{ all -> 0x0103 }
                throw r0     // Catch:{ all -> 0x0103 }
            L_0x0079:
                r1 = 0
            L_0x007a:
                r14.f37912a = r1     // Catch:{ all -> 0x0103 }
                com.onedelhi.secure.cm1 r1 = r12.f26941a     // Catch:{ all -> 0x0103 }
                T r2 = r15.f37912a     // Catch:{ all -> 0x0103 }
                com.onedelhi.secure.kv3 r2 = (com.onedelhi.secure.kv3) r2     // Catch:{ all -> 0x0103 }
                r1.mo33799E1(r2)     // Catch:{ all -> 0x0103 }
                com.onedelhi.secure.cm1 r1 = r12.f26941a     // Catch:{ all -> 0x0103 }
                com.onedelhi.secure.ea4 r7 = r1.f26914c     // Catch:{ all -> 0x0103 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0103 }
                r1.<init>()     // Catch:{ all -> 0x0103 }
                com.onedelhi.secure.cm1 r2 = r12.f26941a     // Catch:{ all -> 0x0103 }
                java.lang.String r2 = r2.mo33837p0()     // Catch:{ all -> 0x0103 }
                r1.append(r2)     // Catch:{ all -> 0x0103 }
                java.lang.String r2 = " onSettings"
                r1.append(r2)     // Catch:{ all -> 0x0103 }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0103 }
                r5 = 1
                com.onedelhi.secure.cm1$e$a r6 = new com.onedelhi.secure.cm1$e$a     // Catch:{ all -> 0x0103 }
                r1 = r6
                r2 = r4
                r3 = r5
                r17 = r6
                r6 = r21
                r18 = r7
                r7 = r15
                r8 = r22
                r9 = r23
                r19 = 0
                r10 = r13
                r20 = r11
                r11 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0101 }
                r1 = r17
                r0 = r18
                r2 = 0
                r0.mo34998m(r1, r2)     // Catch:{ all -> 0x0101 }
                com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0101 }
                monitor-exit(r20)     // Catch:{ all -> 0x0108 }
                com.onedelhi.secure.cm1 r0 = r12.f26941a     // Catch:{ IOException -> 0x00d6 }
                com.onedelhi.secure.gm1 r0 = r0.mo33817b1()     // Catch:{ IOException -> 0x00d6 }
                T r1 = r15.f37912a     // Catch:{ IOException -> 0x00d6 }
                com.onedelhi.secure.kv3 r1 = (com.onedelhi.secure.kv3) r1     // Catch:{ IOException -> 0x00d6 }
                r0.mo36775a(r1)     // Catch:{ IOException -> 0x00d6 }
                goto L_0x00dc
            L_0x00d6:
                r0 = move-exception
                com.onedelhi.secure.cm1 r1 = r12.f26941a     // Catch:{ all -> 0x0108 }
                r1.mo33833l0(r0)     // Catch:{ all -> 0x0108 }
            L_0x00dc:
                com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0108 }
                monitor-exit(r16)
                T r0 = r14.f37912a
                r1 = r0
                com.onedelhi.secure.fm1[] r1 = (com.onedelhi.secure.fm1[]) r1
                if (r1 == 0) goto L_0x0100
                com.onedelhi.secure.fm1[] r0 = (com.onedelhi.secure.fm1[]) r0
                com.onedelhi.secure.jt1.m53774m(r0)
                int r1 = r0.length
                r10 = 0
            L_0x00ed:
                if (r10 >= r1) goto L_0x0100
                r2 = r0[r10]
                monitor-enter(r2)
                long r3 = r13.f37911b     // Catch:{ all -> 0x00fd }
                r2.mo36088a(r3)     // Catch:{ all -> 0x00fd }
                com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x00fd }
                monitor-exit(r2)
                int r10 = r10 + 1
                goto L_0x00ed
            L_0x00fd:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0100:
                return
            L_0x0101:
                r0 = move-exception
                goto L_0x0106
            L_0x0103:
                r0 = move-exception
                r20 = r11
            L_0x0106:
                monitor-exit(r20)     // Catch:{ all -> 0x0108 }
                throw r0     // Catch:{ all -> 0x0108 }
            L_0x0108:
                r0 = move-exception
                monitor-exit(r16)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cm1.C4883e.mo33884s(boolean, com.onedelhi.secure.kv3):void");
        }

        @vr2
        /* renamed from: w */
        public final em1 mo33885w() {
            return this.f26942a;
        }

        /* renamed from: y */
        public void mo33886y() {
            hv0 hv0;
            hv0 hv02 = hv0.INTERNAL_ERROR;
            e = null;
            try {
                this.f26942a.mo35482c(this);
                while (this.f26942a.mo35481b(false, this)) {
                }
                hv0 = hv0.NO_ERROR;
                try {
                    this.f26941a.mo33830j0(hv0, hv0.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        hv0 hv03 = hv0.PROTOCOL_ERROR;
                        this.f26941a.mo33830j0(hv03, hv03, e);
                        nq4.m58711l(this.f26942a);
                    } catch (Throwable th) {
                        th = th;
                        this.f26941a.mo33830j0(hv0, hv02, e);
                        nq4.m58711l(this.f26942a);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                hv0 = hv02;
                hv0 hv032 = hv0.PROTOCOL_ERROR;
                this.f26941a.mo33830j0(hv032, hv032, e);
                nq4.m58711l(this.f26942a);
            } catch (Throwable th2) {
                th = th2;
                hv0 = hv02;
                this.f26941a.mo33830j0(hv0, hv02, e);
                nq4.m58711l(this.f26942a);
                throw th;
            }
            nq4.m58711l(this.f26942a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/ea4$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$f */
    public static final class C4888f extends v94 {

        /* renamed from: a */
        public final /* synthetic */ int f26969a;

        /* renamed from: a */
        public final /* synthetic */ cm1 f26970a;

        /* renamed from: a */
        public final /* synthetic */ C6205no f26971a;

        /* renamed from: b */
        public final /* synthetic */ int f26972b;

        /* renamed from: b */
        public final /* synthetic */ String f26973b;

        /* renamed from: b */
        public final /* synthetic */ boolean f26974b;

        /* renamed from: c */
        public final /* synthetic */ boolean f26975c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4888f(String str, boolean z, String str2, boolean z2, cm1 cm1, int i, C6205no noVar, int i2, boolean z3) {
            super(str2, z2);
            this.f26973b = str;
            this.f26974b = z;
            this.f26970a = cm1;
            this.f26969a = i;
            this.f26971a = noVar;
            this.f26972b = i2;
            this.f26975c = z3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo33844f() {
            /*
                r5 = this;
                com.onedelhi.secure.cm1 r0 = r5.f26970a     // Catch:{ IOException -> 0x003e }
                com.onedelhi.secure.d83 r0 = r0.f26900a     // Catch:{ IOException -> 0x003e }
                int r1 = r5.f26969a     // Catch:{ IOException -> 0x003e }
                com.onedelhi.secure.no r2 = r5.f26971a     // Catch:{ IOException -> 0x003e }
                int r3 = r5.f26972b     // Catch:{ IOException -> 0x003e }
                boolean r4 = r5.f26975c     // Catch:{ IOException -> 0x003e }
                boolean r0 = r0.mo34245b(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x0021
                com.onedelhi.secure.cm1 r1 = r5.f26970a     // Catch:{ IOException -> 0x003e }
                com.onedelhi.secure.gm1 r1 = r1.mo33817b1()     // Catch:{ IOException -> 0x003e }
                int r2 = r5.f26969a     // Catch:{ IOException -> 0x003e }
                com.onedelhi.secure.hv0 r3 = com.onedelhi.secure.hv0.CANCEL     // Catch:{ IOException -> 0x003e }
                r1.mo36771E(r2, r3)     // Catch:{ IOException -> 0x003e }
            L_0x0021:
                if (r0 != 0) goto L_0x0027
                boolean r0 = r5.f26975c     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x003e
            L_0x0027:
                com.onedelhi.secure.cm1 r0 = r5.f26970a     // Catch:{ IOException -> 0x003e }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
                com.onedelhi.secure.cm1 r1 = r5.f26970a     // Catch:{ all -> 0x003b }
                java.util.Set r1 = r1.f26907a     // Catch:{ all -> 0x003b }
                int r2 = r5.f26969a     // Catch:{ all -> 0x003b }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
                r1.remove(r2)     // Catch:{ all -> 0x003b }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                goto L_0x003e
            L_0x003b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                throw r1     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cm1.C4888f.mo33844f():long");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/ea4$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$g */
    public static final class C4889g extends v94 {

        /* renamed from: a */
        public final /* synthetic */ int f26976a;

        /* renamed from: a */
        public final /* synthetic */ cm1 f26977a;

        /* renamed from: a */
        public final /* synthetic */ List f26978a;

        /* renamed from: b */
        public final /* synthetic */ String f26979b;

        /* renamed from: b */
        public final /* synthetic */ boolean f26980b;

        /* renamed from: c */
        public final /* synthetic */ boolean f26981c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4889g(String str, boolean z, String str2, boolean z2, cm1 cm1, int i, List list, boolean z3) {
            super(str2, z2);
            this.f26979b = str;
            this.f26980b = z;
            this.f26977a = cm1;
            this.f26976a = i;
            this.f26978a = list;
            this.f26981c = z3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo33844f() {
            /*
                r4 = this;
                com.onedelhi.secure.cm1 r0 = r4.f26977a
                com.onedelhi.secure.d83 r0 = r0.f26900a
                int r1 = r4.f26976a
                java.util.List r2 = r4.f26978a
                boolean r3 = r4.f26981c
                boolean r0 = r0.mo34247d(r1, r2, r3)
                if (r0 == 0) goto L_0x001f
                com.onedelhi.secure.cm1 r1 = r4.f26977a     // Catch:{ IOException -> 0x003c }
                com.onedelhi.secure.gm1 r1 = r1.mo33817b1()     // Catch:{ IOException -> 0x003c }
                int r2 = r4.f26976a     // Catch:{ IOException -> 0x003c }
                com.onedelhi.secure.hv0 r3 = com.onedelhi.secure.hv0.CANCEL     // Catch:{ IOException -> 0x003c }
                r1.mo36771E(r2, r3)     // Catch:{ IOException -> 0x003c }
            L_0x001f:
                if (r0 != 0) goto L_0x0025
                boolean r0 = r4.f26981c     // Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x003c
            L_0x0025:
                com.onedelhi.secure.cm1 r0 = r4.f26977a     // Catch:{ IOException -> 0x003c }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003c }
                com.onedelhi.secure.cm1 r1 = r4.f26977a     // Catch:{ all -> 0x0039 }
                java.util.Set r1 = r1.f26907a     // Catch:{ all -> 0x0039 }
                int r2 = r4.f26976a     // Catch:{ all -> 0x0039 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
                r1.remove(r2)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                goto L_0x003c
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                throw r1     // Catch:{ IOException -> 0x003c }
            L_0x003c:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cm1.C4889g.mo33844f():long");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/ea4$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$h */
    public static final class C4890h extends v94 {

        /* renamed from: a */
        public final /* synthetic */ int f26982a;

        /* renamed from: a */
        public final /* synthetic */ cm1 f26983a;

        /* renamed from: a */
        public final /* synthetic */ List f26984a;

        /* renamed from: b */
        public final /* synthetic */ String f26985b;

        /* renamed from: b */
        public final /* synthetic */ boolean f26986b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4890h(String str, boolean z, String str2, boolean z2, cm1 cm1, int i, List list) {
            super(str2, z2);
            this.f26985b = str;
            this.f26986b = z;
            this.f26983a = cm1;
            this.f26982a = i;
            this.f26984a = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo33844f() {
            /*
                r3 = this;
                com.onedelhi.secure.cm1 r0 = r3.f26983a
                com.onedelhi.secure.d83 r0 = r0.f26900a
                int r1 = r3.f26982a
                java.util.List r2 = r3.f26984a
                boolean r0 = r0.mo34246c(r1, r2)
                if (r0 == 0) goto L_0x0034
                com.onedelhi.secure.cm1 r0 = r3.f26983a     // Catch:{ IOException -> 0x0034 }
                com.onedelhi.secure.gm1 r0 = r0.mo33817b1()     // Catch:{ IOException -> 0x0034 }
                int r1 = r3.f26982a     // Catch:{ IOException -> 0x0034 }
                com.onedelhi.secure.hv0 r2 = com.onedelhi.secure.hv0.CANCEL     // Catch:{ IOException -> 0x0034 }
                r0.mo36771E(r1, r2)     // Catch:{ IOException -> 0x0034 }
                com.onedelhi.secure.cm1 r0 = r3.f26983a     // Catch:{ IOException -> 0x0034 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
                com.onedelhi.secure.cm1 r1 = r3.f26983a     // Catch:{ all -> 0x0031 }
                java.util.Set r1 = r1.f26907a     // Catch:{ all -> 0x0031 }
                int r2 = r3.f26982a     // Catch:{ all -> 0x0031 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
                r1.remove(r2)     // Catch:{ all -> 0x0031 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                goto L_0x0034
            L_0x0031:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                throw r1     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cm1.C4890h.mo33844f():long");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/ea4$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$i */
    public static final class C4891i extends v94 {

        /* renamed from: a */
        public final /* synthetic */ int f26987a;

        /* renamed from: a */
        public final /* synthetic */ cm1 f26988a;

        /* renamed from: a */
        public final /* synthetic */ hv0 f26989a;

        /* renamed from: b */
        public final /* synthetic */ String f26990b;

        /* renamed from: b */
        public final /* synthetic */ boolean f26991b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4891i(String str, boolean z, String str2, boolean z2, cm1 cm1, int i, hv0 hv0) {
            super(str2, z2);
            this.f26990b = str;
            this.f26991b = z;
            this.f26988a = cm1;
            this.f26987a = i;
            this.f26989a = hv0;
        }

        /* renamed from: f */
        public long mo33844f() {
            this.f26988a.f26900a.mo34244a(this.f26987a, this.f26989a);
            synchronized (this.f26988a) {
                this.f26988a.f26907a.remove(Integer.valueOf(this.f26987a));
                un4 un4 = un4.f36206a;
            }
            return -1;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/ea4$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$j */
    public static final class C4892j extends v94 {

        /* renamed from: a */
        public final /* synthetic */ cm1 f26992a;

        /* renamed from: b */
        public final /* synthetic */ String f26993b;

        /* renamed from: b */
        public final /* synthetic */ boolean f26994b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4892j(String str, boolean z, String str2, boolean z2, cm1 cm1) {
            super(str2, z2);
            this.f26993b = str;
            this.f26994b = z;
            this.f26992a = cm1;
        }

        /* renamed from: f */
        public long mo33844f() {
            this.f26992a.mo33822d2(false, 2, 0);
            return -1;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/ea4$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$k */
    public static final class C4893k extends v94 {

        /* renamed from: a */
        public final /* synthetic */ int f26995a;

        /* renamed from: a */
        public final /* synthetic */ cm1 f26996a;

        /* renamed from: a */
        public final /* synthetic */ hv0 f26997a;

        /* renamed from: b */
        public final /* synthetic */ String f26998b;

        /* renamed from: b */
        public final /* synthetic */ boolean f26999b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4893k(String str, boolean z, String str2, boolean z2, cm1 cm1, int i, hv0 hv0) {
            super(str2, z2);
            this.f26998b = str;
            this.f26999b = z;
            this.f26996a = cm1;
            this.f26995a = i;
            this.f26997a = hv0;
        }

        /* renamed from: f */
        public long mo33844f() {
            try {
                this.f26996a.mo33829i2(this.f26995a, this.f26997a);
                return -1;
            } catch (IOException e) {
                this.f26996a.mo33833l0(e);
                return -1;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/ea4$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.cm1$l */
    public static final class C4894l extends v94 {

        /* renamed from: a */
        public final /* synthetic */ int f27000a;

        /* renamed from: a */
        public final /* synthetic */ cm1 f27001a;

        /* renamed from: b */
        public final /* synthetic */ long f27002b;

        /* renamed from: b */
        public final /* synthetic */ String f27003b;

        /* renamed from: b */
        public final /* synthetic */ boolean f27004b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4894l(String str, boolean z, String str2, boolean z2, cm1 cm1, int i, long j) {
            super(str2, z2);
            this.f27003b = str;
            this.f27004b = z;
            this.f27001a = cm1;
            this.f27000a = i;
            this.f27002b = j;
        }

        /* renamed from: f */
        public long mo33844f() {
            try {
                this.f27001a.mo33817b1().mo36773K(this.f27000a, this.f27002b);
                return -1;
            } catch (IOException e) {
                this.f27001a.mo33833l0(e);
                return -1;
            }
        }
    }

    static {
        kv3 kv3 = new kv3();
        kv3.mo39539k(7, 65535);
        kv3.mo39539k(5, 16384);
        f26892c = kv3;
    }

    public cm1(@vr2 C4878b bVar) {
        jt1.m53777p(bVar, "builder");
        boolean b = bVar.mo33846b();
        this.f26912b = b;
        this.f26898a = bVar.mo33848d();
        String c = bVar.mo33847c();
        this.f26911b = c;
        this.f26926o = bVar.mo33846b() ? 3 : 2;
        fa4 j = bVar.mo33854j();
        this.f26902a = j;
        ea4 j2 = j.mo35812j();
        this.f26901a = j2;
        this.f26909b = j.mo35812j();
        this.f26914c = j.mo35812j();
        this.f26900a = bVar.mo33850f();
        kv3 kv3 = new kv3();
        if (bVar.mo33846b()) {
            kv3.mo39539k(7, 16777216);
        }
        un4 un4 = un4.f36206a;
        this.f26904a = kv3;
        kv3 kv32 = f26892c;
        this.f26910b = kv32;
        this.f26924l = (long) kv32.mo39533e();
        this.f26905a = bVar.mo33852h();
        this.f26903a = new gm1(bVar.mo33851g(), b);
        this.f26899a = new C4883e(this, new em1(bVar.mo33853i(), b));
        this.f26907a = new LinkedHashSet();
        if (bVar.mo33849e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) bVar.mo33849e());
            String str = c + " ping";
            j2.mo34998m(new C4877a(str, str, this, nanos), nanos);
        }
    }

    /* renamed from: U1 */
    public static /* synthetic */ void m44015U1(cm1 cm1, boolean z, fa4 fa4, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            fa4 = fa4.f28227a;
        }
        cm1.mo33807M1(z, fa4);
    }

    @ss2
    /* renamed from: A1 */
    public final synchronized fm1 mo33794A1(int i) {
        fm1 remove;
        remove = this.f26906a.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: B1 */
    public final void mo33795B1() {
        synchronized (this) {
            long j = this.f26917e;
            long j2 = this.f26916d;
            if (j >= j2) {
                this.f26916d = j2 + 1;
                this.f26920h = System.nanoTime() + ((long) 1000000000);
                un4 un4 = un4.f36206a;
                String str = this.f26911b + " ping";
                this.f26901a.mo34998m(new C4892j(str, true, str, true, this), 0);
            }
        }
    }

    /* renamed from: C0 */
    public final int mo33796C0() {
        return this.f26926o;
    }

    /* renamed from: C1 */
    public final void mo33797C1(int i) {
        this.f26925n = i;
    }

    /* renamed from: D1 */
    public final void mo33798D1(int i) {
        this.f26926o = i;
    }

    /* renamed from: E1 */
    public final void mo33799E1(@vr2 kv3 kv3) {
        jt1.m53777p(kv3, "<set-?>");
        this.f26910b = kv3;
    }

    @vr2
    /* renamed from: F0 */
    public final kv3 mo33800F0() {
        return this.f26904a;
    }

    @vr2
    /* renamed from: G0 */
    public final kv3 mo33801G0() {
        return this.f26910b;
    }

    /* renamed from: G1 */
    public final void mo33802G1(@vr2 kv3 kv3) throws IOException {
        jt1.m53777p(kv3, uh3.f36123f);
        synchronized (this.f26903a) {
            synchronized (this) {
                if (!this.f26915c) {
                    this.f26904a.mo39538j(kv3);
                    un4 un4 = un4.f36206a;
                } else {
                    throw new u50();
                }
            }
            this.f26903a.mo36772H(kv3);
        }
    }

    /* renamed from: H1 */
    public final void mo33803H1(@vr2 hv0 hv0) throws IOException {
        jt1.m53777p(hv0, "statusCode");
        synchronized (this.f26903a) {
            synchronized (this) {
                if (!this.f26915c) {
                    this.f26915c = true;
                    int i = this.f26925n;
                    un4 un4 = un4.f36206a;
                    this.f26903a.mo36783l(i, hv0, nq4.f32735a);
                }
            }
        }
    }

    @vw1
    /* renamed from: J1 */
    public final void mo33804J1() throws IOException {
        m44015U1(this, false, (fa4) null, 3, (Object) null);
    }

    @vw1
    /* renamed from: L1 */
    public final void mo33805L1(boolean z) throws IOException {
        m44015U1(this, z, (fa4) null, 2, (Object) null);
    }

    /* renamed from: M0 */
    public final long mo33806M0() {
        return this.f26922j;
    }

    @vw1
    /* renamed from: M1 */
    public final void mo33807M1(boolean z, @vr2 fa4 fa4) throws IOException {
        jt1.m53777p(fa4, "taskRunner");
        if (z) {
            this.f26903a.mo36776b();
            this.f26903a.mo36772H(this.f26904a);
            int e = this.f26904a.mo39533e();
            if (e != 65535) {
                this.f26903a.mo36773K(0, (long) (e - 65535));
            }
        }
        ea4 j = fa4.mo35812j();
        String str = this.f26911b;
        j.mo34998m(new ea4.C5115b(this.f26899a, str, true, str, true), 0);
    }

    /* renamed from: N0 */
    public final long mo33808N0() {
        return this.f26921i;
    }

    @vr2
    /* renamed from: O0 */
    public final C4883e mo33809O0() {
        return this.f26899a;
    }

    @vr2
    /* renamed from: P0 */
    public final Socket mo33810P0() {
        return this.f26905a;
    }

    @ss2
    /* renamed from: Q0 */
    public final synchronized fm1 mo33811Q0(int i) {
        return this.f26906a.get(Integer.valueOf(i));
    }

    @vr2
    /* renamed from: R0 */
    public final Map<Integer, fm1> mo33812R0() {
        return this.f26906a;
    }

    /* renamed from: S0 */
    public final long mo33813S0() {
        return this.f26924l;
    }

    /* renamed from: V0 */
    public final long mo33814V0() {
        return this.f26923k;
    }

    /* renamed from: V1 */
    public final synchronized void mo33815V1(long j) {
        long j2 = this.f26921i + j;
        this.f26921i = j2;
        long j3 = j2 - this.f26922j;
        if (j3 >= ((long) (this.f26904a.mo39533e() / 2))) {
            mo33836o2(0, j3);
            this.f26922j += j3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.f26903a.mo36785p());
        r6 = (long) r3;
        r8.f26923k += r6;
        r4 = com.onedelhi.secure.un4.f36206a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005d */
    /* renamed from: a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33816a2(int r9, boolean r10, @com.onedelhi.secure.ss2 com.onedelhi.secure.C6205no r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            com.onedelhi.secure.gm1 r12 = r8.f26903a
            r12.mo36777c(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x006c
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f26923k     // Catch:{ InterruptedException -> 0x005d }
            long r5 = r8.f26924l     // Catch:{ InterruptedException -> 0x005d }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, com.onedelhi.secure.fm1> r3 = r8.f26906a     // Catch:{ InterruptedException -> 0x005d }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005d }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005d }
            if (r3 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x005d }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005d }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005d }
            throw r9     // Catch:{ InterruptedException -> 0x005d }
        L_0x0032:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch:{ all -> 0x005b }
            int r4 = (int) r3     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.gm1 r3 = r8.f26903a     // Catch:{ all -> 0x005b }
            int r3 = r3.mo36785p()     // Catch:{ all -> 0x005b }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x005b }
            long r4 = r8.f26923k     // Catch:{ all -> 0x005b }
            long r6 = (long) r3     // Catch:{ all -> 0x005b }
            long r4 = r4 + r6
            r8.f26923k = r4     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x005b }
            monitor-exit(r8)
            long r12 = r12 - r6
            com.onedelhi.secure.gm1 r4 = r8.f26903a
            if (r10 == 0) goto L_0x0056
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            r4.mo36777c(r5, r9, r11, r3)
            goto L_0x000d
        L_0x005b:
            r9 = move-exception
            goto L_0x006a
        L_0x005d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x005b }
            r9.interrupt()     // Catch:{ all -> 0x005b }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x005b }
            r9.<init>()     // Catch:{ all -> 0x005b }
            throw r9     // Catch:{ all -> 0x005b }
        L_0x006a:
            monitor-exit(r8)
            throw r9
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cm1.mo33816a2(int, boolean, com.onedelhi.secure.no, long):void");
    }

    @vr2
    /* renamed from: b1 */
    public final gm1 mo33817b1() {
        return this.f26903a;
    }

    /* renamed from: b2 */
    public final void mo33818b2(int i, boolean z, @vr2 List<sk1> list) throws IOException {
        jt1.m53777p(list, "alternating");
        this.f26903a.mo36784m(z, i, list);
    }

    /* renamed from: c1 */
    public final synchronized boolean mo33819c1(long j) {
        if (this.f26915c) {
            return false;
        }
        return this.f26917e >= this.f26916d || j < this.f26920h;
    }

    /* renamed from: c2 */
    public final void mo33820c2() throws InterruptedException {
        synchronized (this) {
            this.f26918f++;
        }
        mo33822d2(false, 3, 1330343787);
    }

    public void close() {
        mo33830j0(hv0.NO_ERROR, hv0.CANCEL, (IOException) null);
    }

    /* renamed from: d2 */
    public final void mo33822d2(boolean z, int i, int i2) {
        try {
            this.f26903a.mo36786q(z, i, i2);
        } catch (IOException e) {
            mo33833l0(e);
        }
    }

    /* renamed from: e0 */
    public final synchronized void mo33823e0() throws InterruptedException {
        while (this.f26919g < this.f26918f) {
            wait();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.fm1 mo33824f1(int r11, java.util.List<com.onedelhi.secure.sk1> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            com.onedelhi.secure.gm1 r7 = r10.f26903a
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0084 }
            int r0 = r10.f26926o     // Catch:{ all -> 0x0081 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            com.onedelhi.secure.hv0 r0 = com.onedelhi.secure.hv0.REFUSED_STREAM     // Catch:{ all -> 0x0081 }
            r10.mo33803H1(r0)     // Catch:{ all -> 0x0081 }
        L_0x0013:
            boolean r0 = r10.f26915c     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x007b
            int r8 = r10.f26926o     // Catch:{ all -> 0x0081 }
            int r0 = r8 + 2
            r10.f26926o = r0     // Catch:{ all -> 0x0081 }
            com.onedelhi.secure.fm1 r9 = new com.onedelhi.secure.fm1     // Catch:{ all -> 0x0081 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0081 }
            r0 = 1
            if (r13 == 0) goto L_0x0041
            long r1 = r10.f26923k     // Catch:{ all -> 0x0081 }
            long r3 = r10.f26924l     // Catch:{ all -> 0x0081 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0041
            long r1 = r9.mo36107t()     // Catch:{ all -> 0x0081 }
            long r3 = r9.mo36106s()     // Catch:{ all -> 0x0081 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r13 = 0
            goto L_0x0042
        L_0x0041:
            r13 = 1
        L_0x0042:
            boolean r1 = r9.mo36110w()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0051
            java.util.Map<java.lang.Integer, com.onedelhi.secure.fm1> r1 = r10.f26906a     // Catch:{ all -> 0x0081 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0081 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0081 }
        L_0x0051:
            com.onedelhi.secure.un4 r1 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0081 }
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            if (r11 != 0) goto L_0x005c
            com.onedelhi.secure.gm1 r11 = r10.f26903a     // Catch:{ all -> 0x0084 }
            r11.mo36784m(r6, r8, r12)     // Catch:{ all -> 0x0084 }
            goto L_0x0066
        L_0x005c:
            boolean r1 = r10.f26912b     // Catch:{ all -> 0x0084 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006f
            com.onedelhi.secure.gm1 r0 = r10.f26903a     // Catch:{ all -> 0x0084 }
            r0.mo36770A(r11, r8, r12)     // Catch:{ all -> 0x0084 }
        L_0x0066:
            monitor-exit(r7)
            if (r13 == 0) goto L_0x006e
            com.onedelhi.secure.gm1 r11 = r10.f26903a
            r11.flush()
        L_0x006e:
            return r9
        L_0x006f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0084 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0084 }
            r12.<init>(r11)     // Catch:{ all -> 0x0084 }
            throw r12     // Catch:{ all -> 0x0084 }
        L_0x007b:
            com.onedelhi.secure.u50 r11 = new com.onedelhi.secure.u50     // Catch:{ all -> 0x0081 }
            r11.<init>()     // Catch:{ all -> 0x0081 }
            throw r11     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            throw r11     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cm1.mo33824f1(int, java.util.List, boolean):com.onedelhi.secure.fm1");
    }

    public final void flush() throws IOException {
        this.f26903a.flush();
    }

    /* renamed from: g2 */
    public final void mo33826g2() throws InterruptedException {
        mo33820c2();
        mo33823e0();
    }

    @vr2
    /* renamed from: h1 */
    public final fm1 mo33827h1(@vr2 List<sk1> list, boolean z) throws IOException {
        jt1.m53777p(list, "requestHeaders");
        return mo33824f1(0, list, z);
    }

    /* renamed from: i1 */
    public final synchronized int mo33828i1() {
        return this.f26906a.size();
    }

    /* renamed from: i2 */
    public final void mo33829i2(int i, @vr2 hv0 hv0) throws IOException {
        jt1.m53777p(hv0, "statusCode");
        this.f26903a.mo36771E(i, hv0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:6|7|8|45|(2:22|(5:24|25|26|39|27))|29|30|31|32|33|35) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0084 */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33830j0(@com.onedelhi.secure.vr2 com.onedelhi.secure.hv0 r4, @com.onedelhi.secure.vr2 com.onedelhi.secure.hv0 r5, @com.onedelhi.secure.ss2 java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            java.lang.String r0 = "streamCode"
            com.onedelhi.secure.jt1.m53777p(r5, r0)
            boolean r0 = com.onedelhi.secure.nq4.f32734a
            if (r0 == 0) goto L_0x0041
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x0041
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            com.onedelhi.secure.jt1.m53776o(r6, r0)
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0041:
            r3.mo33803H1(r4)     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, com.onedelhi.secure.fm1> r0 = r3.f26906a     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0099 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x006f
            java.util.Map<java.lang.Integer, com.onedelhi.secure.fm1> r4 = r3.f26906a     // Catch:{ all -> 0x0099 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0099 }
            com.onedelhi.secure.fm1[] r0 = new com.onedelhi.secure.fm1[r1]     // Catch:{ all -> 0x0099 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0067
            com.onedelhi.secure.fm1[] r4 = (com.onedelhi.secure.fm1[]) r4     // Catch:{ all -> 0x0099 }
            java.util.Map<java.lang.Integer, com.onedelhi.secure.fm1> r0 = r3.f26906a     // Catch:{ all -> 0x0099 }
            r0.clear()     // Catch:{ all -> 0x0099 }
            goto L_0x006f
        L_0x0067:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0099 }
            throw r4     // Catch:{ all -> 0x0099 }
        L_0x006f:
            com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0099 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x007f
            int r0 = r4.length
        L_0x0075:
            if (r1 >= r0) goto L_0x007f
            r2 = r4[r1]
            r2.mo36091d(r5, r6)     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0075
        L_0x007f:
            com.onedelhi.secure.gm1 r4 = r3.f26903a     // Catch:{ IOException -> 0x0084 }
            r4.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            java.net.Socket r4 = r3.f26905a     // Catch:{ IOException -> 0x0089 }
            r4.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            com.onedelhi.secure.ea4 r4 = r3.f26901a
            r4.mo35005u()
            com.onedelhi.secure.ea4 r4 = r3.f26909b
            r4.mo35005u()
            com.onedelhi.secure.ea4 r4 = r3.f26914c
            r4.mo35005u()
            return
        L_0x0099:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cm1.mo33830j0(com.onedelhi.secure.hv0, com.onedelhi.secure.hv0, java.io.IOException):void");
    }

    /* renamed from: j1 */
    public final void mo33831j1(int i, @vr2 C6893to toVar, int i2, boolean z) throws IOException {
        jt1.m53777p(toVar, "source");
        C6205no noVar = new C6205no();
        long j = (long) i2;
        toVar.mo31694o(j);
        toVar.read(noVar, j);
        String str = this.f26911b + '[' + i + "] onData";
        this.f26909b.mo34998m(new C4888f(str, true, str, true, this, i, noVar, i2, z), 0);
    }

    /* renamed from: j2 */
    public final void mo33832j2(int i, @vr2 hv0 hv0) {
        jt1.m53777p(hv0, "errorCode");
        String str = this.f26911b + '[' + i + "] writeSynReset";
        this.f26901a.mo34998m(new C4893k(str, true, str, true, this, i, hv0), 0);
    }

    /* renamed from: l0 */
    public final void mo33833l0(IOException iOException) {
        hv0 hv0 = hv0.PROTOCOL_ERROR;
        mo33830j0(hv0, hv0, iOException);
    }

    /* renamed from: l1 */
    public final void mo33834l1(int i, @vr2 List<sk1> list, boolean z) {
        jt1.m53777p(list, "requestHeaders");
        String str = this.f26911b + '[' + i + "] onHeaders";
        this.f26909b.mo34998m(new C4889g(str, true, str, true, this, i, list, z), 0);
    }

    /* renamed from: o0 */
    public final boolean mo33835o0() {
        return this.f26912b;
    }

    /* renamed from: o2 */
    public final void mo33836o2(int i, long j) {
        String str = this.f26911b + '[' + i + "] windowUpdate";
        this.f26901a.mo34998m(new C4894l(str, true, str, true, this, i, j), 0);
    }

    @vr2
    /* renamed from: p0 */
    public final String mo33837p0() {
        return this.f26911b;
    }

    /* renamed from: p1 */
    public final void mo33838p1(int i, @vr2 List<sk1> list) {
        jt1.m53777p(list, "requestHeaders");
        synchronized (this) {
            if (this.f26907a.contains(Integer.valueOf(i))) {
                mo33832j2(i, hv0.PROTOCOL_ERROR);
                return;
            }
            this.f26907a.add(Integer.valueOf(i));
            String str = this.f26911b + '[' + i + "] onRequest";
            this.f26909b.mo34998m(new C4890h(str, true, str, true, this, i, list), 0);
        }
    }

    /* renamed from: q0 */
    public final int mo33839q0() {
        return this.f26925n;
    }

    /* renamed from: s1 */
    public final void mo33840s1(int i, @vr2 hv0 hv0) {
        jt1.m53777p(hv0, "errorCode");
        String str = this.f26911b + '[' + i + "] onReset";
        this.f26909b.mo34998m(new C4891i(str, true, str, true, this, i, hv0), 0);
    }

    @vr2
    /* renamed from: u0 */
    public final C4880d mo33841u0() {
        return this.f26898a;
    }

    @vr2
    /* renamed from: w1 */
    public final fm1 mo33842w1(int i, @vr2 List<sk1> list, boolean z) throws IOException {
        jt1.m53777p(list, "requestHeaders");
        if (!this.f26912b) {
            return mo33824f1(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    /* renamed from: z1 */
    public final boolean mo33843z1(int i) {
        return i != 0 && (i & 1) == 0;
    }
}
