package com.onedelhi.secure;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B!\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/qk1;", "Lcom/onedelhi/secure/na1;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/fr;", "a", "()Lcom/onedelhi/secure/fr;", "b", "hash", "Lcom/onedelhi/secure/x04;", "source", "", "algorithm", "<init>", "(Lcom/onedelhi/secure/x04;Ljava/lang/String;)V", "key", "(Lcom/onedelhi/secure/x04;Lcom/onedelhi/secure/fr;Ljava/lang/String;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class qk1 extends na1 {

    /* renamed from: a */
    public static final C6589a f34266a = new C6589a((wg0) null);

    /* renamed from: a */
    public final MessageDigest f34267a;

    /* renamed from: a */
    public final Mac f34268a;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/qk1$a;", "", "Lcom/onedelhi/secure/x04;", "source", "Lcom/onedelhi/secure/qk1;", "d", "e", "f", "g", "Lcom/onedelhi/secure/fr;", "key", "a", "b", "c", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.qk1$a */
    public static final class C6589a {
        public C6589a() {
        }

        public /* synthetic */ C6589a(wg0 wg0) {
            this();
        }

        @zw1
        @vr2
        /* renamed from: a */
        public final qk1 mo43643a(@vr2 x04 x04, @vr2 C5301fr frVar) {
            jt1.m53777p(x04, "source");
            jt1.m53777p(frVar, "key");
            return new qk1(x04, frVar, "HmacSHA1");
        }

        @zw1
        @vr2
        /* renamed from: b */
        public final qk1 mo43644b(@vr2 x04 x04, @vr2 C5301fr frVar) {
            jt1.m53777p(x04, "source");
            jt1.m53777p(frVar, "key");
            return new qk1(x04, frVar, "HmacSHA256");
        }

        @zw1
        @vr2
        /* renamed from: c */
        public final qk1 mo43645c(@vr2 x04 x04, @vr2 C5301fr frVar) {
            jt1.m53777p(x04, "source");
            jt1.m53777p(frVar, "key");
            return new qk1(x04, frVar, "HmacSHA512");
        }

        @zw1
        @vr2
        /* renamed from: d */
        public final qk1 mo43646d(@vr2 x04 x04) {
            jt1.m53777p(x04, "source");
            return new qk1(x04, "MD5");
        }

        @zw1
        @vr2
        /* renamed from: e */
        public final qk1 mo43647e(@vr2 x04 x04) {
            jt1.m53777p(x04, "source");
            return new qk1(x04, u10.f35895a);
        }

        @zw1
        @vr2
        /* renamed from: f */
        public final qk1 mo43648f(@vr2 x04 x04) {
            jt1.m53777p(x04, "source");
            return new qk1(x04, "SHA-256");
        }

        @zw1
        @vr2
        /* renamed from: g */
        public final qk1 mo43649g(@vr2 x04 x04) {
            jt1.m53777p(x04, "source");
            return new qk1(x04, "SHA-512");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qk1(@vr2 x04 x04, @vr2 C5301fr frVar, @vr2 String str) {
        super(x04);
        jt1.m53777p(x04, "source");
        jt1.m53777p(frVar, "key");
        jt1.m53777p(str, "algorithm");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(frVar.mo31177t0(), str));
            un4 un4 = un4.f36206a;
            this.f34268a = instance;
            this.f34267a = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qk1(@vr2 x04 x04, @vr2 String str) {
        super(x04);
        jt1.m53777p(x04, "source");
        jt1.m53777p(str, "algorithm");
        this.f34267a = MessageDigest.getInstance(str);
        this.f34268a = null;
    }

    @zw1
    @vr2
    /* renamed from: c */
    public static final qk1 m62995c(@vr2 x04 x04, @vr2 C5301fr frVar) {
        return f34266a.mo43643a(x04, frVar);
    }

    @zw1
    @vr2
    /* renamed from: d */
    public static final qk1 m62996d(@vr2 x04 x04, @vr2 C5301fr frVar) {
        return f34266a.mo43644b(x04, frVar);
    }

    @zw1
    @vr2
    /* renamed from: g */
    public static final qk1 m62997g(@vr2 x04 x04, @vr2 C5301fr frVar) {
        return f34266a.mo43645c(x04, frVar);
    }

    @zw1
    @vr2
    /* renamed from: h */
    public static final qk1 m62998h(@vr2 x04 x04) {
        return f34266a.mo43646d(x04);
    }

    @zw1
    @vr2
    /* renamed from: l */
    public static final qk1 m62999l(@vr2 x04 x04) {
        return f34266a.mo43647e(x04);
    }

    @zw1
    @vr2
    /* renamed from: m */
    public static final qk1 m63000m(@vr2 x04 x04) {
        return f34266a.mo43648f(x04);
    }

    @zw1
    @vr2
    /* renamed from: p */
    public static final qk1 m63001p(@vr2 x04 x04) {
        return f34266a.mo43649g(x04);
    }

    @uw1(name = "-deprecated_hash")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "hash", imports = {}))
    /* renamed from: a */
    public final C5301fr mo43641a() {
        return mo43642b();
    }

    @uw1(name = "hash")
    @vr2
    /* renamed from: b */
    public final C5301fr mo43642b() {
        byte[] bArr;
        MessageDigest messageDigest = this.f34267a;
        if (messageDigest != null) {
            bArr = messageDigest.digest();
        } else {
            Mac mac = this.f34268a;
            jt1.m53774m(mac);
            bArr = mac.doFinal();
        }
        jt1.m53776o(bArr, "result");
        return new C5301fr(bArr);
    }

    public long read(@vr2 C6205no noVar, long j) throws IOException {
        jt1.m53777p(noVar, "sink");
        long read = super.read(noVar, j);
        if (read != -1) {
            long V0 = noVar.mo41244V0() - read;
            long V02 = noVar.mo41244V0();
            ws3 ws3 = noVar.f32655a;
            jt1.m53774m(ws3);
            while (V02 > V0) {
                ws3 = ws3.f37113b;
                jt1.m53774m(ws3);
                V02 -= (long) (ws3.f37112b - ws3.f37108a);
            }
            while (V02 < noVar.mo41244V0()) {
                int i = (int) ((((long) ws3.f37108a) + V0) - V02);
                MessageDigest messageDigest = this.f34267a;
                if (messageDigest != null) {
                    messageDigest.update(ws3.f37111a, i, ws3.f37112b - i);
                } else {
                    Mac mac = this.f34268a;
                    jt1.m53774m(mac);
                    mac.update(ws3.f37111a, i, ws3.f37112b - i);
                }
                V02 += (long) (ws3.f37112b - ws3.f37108a);
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                V0 = V02;
            }
        }
        return read;
    }
}
