package com.onedelhi.secure;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u0019\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B!\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/pk1;", "Lcom/onedelhi/secure/ma1;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "Lcom/onedelhi/secure/fr;", "a", "()Lcom/onedelhi/secure/fr;", "b", "hash", "Lcom/onedelhi/secure/oz3;", "sink", "", "algorithm", "<init>", "(Lcom/onedelhi/secure/oz3;Ljava/lang/String;)V", "key", "(Lcom/onedelhi/secure/oz3;Lcom/onedelhi/secure/fr;Ljava/lang/String;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class pk1 extends ma1 {

    /* renamed from: a */
    public static final C6452a f33703a = new C6452a((wg0) null);

    /* renamed from: a */
    public final MessageDigest f33704a;

    /* renamed from: a */
    public final Mac f33705a;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/pk1$a;", "", "Lcom/onedelhi/secure/oz3;", "sink", "Lcom/onedelhi/secure/pk1;", "d", "e", "f", "g", "Lcom/onedelhi/secure/fr;", "key", "a", "b", "c", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.pk1$a */
    public static final class C6452a {
        public C6452a() {
        }

        public /* synthetic */ C6452a(wg0 wg0) {
            this();
        }

        @zw1
        @vr2
        /* renamed from: a */
        public final pk1 mo42700a(@vr2 oz3 oz3, @vr2 C5301fr frVar) {
            jt1.m53777p(oz3, "sink");
            jt1.m53777p(frVar, "key");
            return new pk1(oz3, frVar, "HmacSHA1");
        }

        @zw1
        @vr2
        /* renamed from: b */
        public final pk1 mo42701b(@vr2 oz3 oz3, @vr2 C5301fr frVar) {
            jt1.m53777p(oz3, "sink");
            jt1.m53777p(frVar, "key");
            return new pk1(oz3, frVar, "HmacSHA256");
        }

        @zw1
        @vr2
        /* renamed from: c */
        public final pk1 mo42702c(@vr2 oz3 oz3, @vr2 C5301fr frVar) {
            jt1.m53777p(oz3, "sink");
            jt1.m53777p(frVar, "key");
            return new pk1(oz3, frVar, "HmacSHA512");
        }

        @zw1
        @vr2
        /* renamed from: d */
        public final pk1 mo42703d(@vr2 oz3 oz3) {
            jt1.m53777p(oz3, "sink");
            return new pk1(oz3, "MD5");
        }

        @zw1
        @vr2
        /* renamed from: e */
        public final pk1 mo42704e(@vr2 oz3 oz3) {
            jt1.m53777p(oz3, "sink");
            return new pk1(oz3, u10.f35895a);
        }

        @zw1
        @vr2
        /* renamed from: f */
        public final pk1 mo42705f(@vr2 oz3 oz3) {
            jt1.m53777p(oz3, "sink");
            return new pk1(oz3, "SHA-256");
        }

        @zw1
        @vr2
        /* renamed from: g */
        public final pk1 mo42706g(@vr2 oz3 oz3) {
            jt1.m53777p(oz3, "sink");
            return new pk1(oz3, "SHA-512");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pk1(@vr2 oz3 oz3, @vr2 C5301fr frVar, @vr2 String str) {
        super(oz3);
        jt1.m53777p(oz3, "sink");
        jt1.m53777p(frVar, "key");
        jt1.m53777p(str, "algorithm");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(frVar.mo31177t0(), str));
            un4 un4 = un4.f36206a;
            this.f33705a = instance;
            this.f33704a = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pk1(@vr2 oz3 oz3, @vr2 String str) {
        super(oz3);
        jt1.m53777p(oz3, "sink");
        jt1.m53777p(str, "algorithm");
        this.f33704a = MessageDigest.getInstance(str);
        this.f33705a = null;
    }

    @zw1
    @vr2
    /* renamed from: c */
    public static final pk1 m61176c(@vr2 oz3 oz3, @vr2 C5301fr frVar) {
        return f33703a.mo42700a(oz3, frVar);
    }

    @zw1
    @vr2
    /* renamed from: d */
    public static final pk1 m61177d(@vr2 oz3 oz3, @vr2 C5301fr frVar) {
        return f33703a.mo42701b(oz3, frVar);
    }

    @zw1
    @vr2
    /* renamed from: g */
    public static final pk1 m61178g(@vr2 oz3 oz3, @vr2 C5301fr frVar) {
        return f33703a.mo42702c(oz3, frVar);
    }

    @zw1
    @vr2
    /* renamed from: h */
    public static final pk1 m61179h(@vr2 oz3 oz3) {
        return f33703a.mo42703d(oz3);
    }

    @zw1
    @vr2
    /* renamed from: l */
    public static final pk1 m61180l(@vr2 oz3 oz3) {
        return f33703a.mo42704e(oz3);
    }

    @zw1
    @vr2
    /* renamed from: m */
    public static final pk1 m61181m(@vr2 oz3 oz3) {
        return f33703a.mo42705f(oz3);
    }

    @zw1
    @vr2
    /* renamed from: p */
    public static final pk1 m61182p(@vr2 oz3 oz3) {
        return f33703a.mo42706g(oz3);
    }

    @uw1(name = "-deprecated_hash")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "hash", imports = {}))
    /* renamed from: a */
    public final C5301fr mo42698a() {
        return mo42699b();
    }

    @uw1(name = "hash")
    @vr2
    /* renamed from: b */
    public final C5301fr mo42699b() {
        byte[] bArr;
        MessageDigest messageDigest = this.f33704a;
        if (messageDigest != null) {
            bArr = messageDigest.digest();
        } else {
            Mac mac = this.f33705a;
            jt1.m53774m(mac);
            bArr = mac.doFinal();
        }
        jt1.m53776o(bArr, "result");
        return new C5301fr(bArr);
    }

    public void write(@vr2 C6205no noVar, long j) throws IOException {
        jt1.m53777p(noVar, "source");
        C5950l.m55169e(noVar.mo41244V0(), 0, j);
        ws3 ws3 = noVar.f32655a;
        jt1.m53774m(ws3);
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, (long) (ws3.f37112b - ws3.f37108a));
            MessageDigest messageDigest = this.f33704a;
            if (messageDigest != null) {
                messageDigest.update(ws3.f37111a, ws3.f37108a, min);
            } else {
                Mac mac = this.f33705a;
                jt1.m53774m(mac);
                mac.update(ws3.f37111a, ws3.f37108a, min);
            }
            j2 += (long) min;
            ws3 = ws3.f37109a;
            jt1.m53774m(ws3);
        }
        super.write(noVar, j);
    }
}
