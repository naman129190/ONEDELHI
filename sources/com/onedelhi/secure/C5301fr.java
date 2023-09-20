package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.ak4;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001PB\u0011\b\u0000\u0012\u0006\u0010^\u001a\u00020-¢\u0006\u0004\ba\u0010bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\b\u0010\u0011\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u001f\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\b\u0010 \u001a\u00020\u0000H\u0016J\u001c\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!H\u0017J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020!H\u0010¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020&2\u0006\u0010)\u001a\u00020!H\u0002¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020!H\u0010¢\u0006\u0004\b+\u0010,J\b\u0010.\u001a\u00020-H\u0016J\u000f\u0010/\u001a\u00020-H\u0010¢\u0006\u0004\b/\u00100J\b\u00102\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u0010\b\u001a\u000203H\u0016J'\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0010¢\u0006\u0004\b9\u0010:J(\u0010>\u001a\u00020=2\u0006\u00107\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016J(\u0010?\u001a\u00020=2\u0006\u00107\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016J\u000e\u0010A\u001a\u00020=2\u0006\u0010@\u001a\u00020\u0000J\u000e\u0010B\u001a\u00020=2\u0006\u0010@\u001a\u00020-J\u000e\u0010D\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0000J\u000e\u0010E\u001a\u00020=2\u0006\u0010C\u001a\u00020-J\u001a\u0010G\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\b\b\u0002\u0010F\u001a\u00020!H\u0007J\u001a\u0010H\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\b\b\u0002\u0010F\u001a\u00020!H\u0017J\u001a\u0010I\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\b\b\u0002\u0010F\u001a\u00020!H\u0007J\u001a\u0010J\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\b\b\u0002\u0010F\u001a\u00020!H\u0017J\u0013\u0010L\u001a\u00020=2\b\u0010;\u001a\u0004\u0018\u00010KH\u0002J\b\u0010M\u001a\u00020!H\u0016J\u0011\u0010N\u001a\u00020!2\u0006\u0010;\u001a\u00020\u0000H\u0002J\b\u0010O\u001a\u00020\nH\u0016J\u0017\u0010P\u001a\u00020&2\u0006\u0010)\u001a\u00020!H\u0007¢\u0006\u0004\bP\u0010(J\u000f\u0010Q\u001a\u00020!H\u0007¢\u0006\u0004\bQ\u0010,R\"\u0010M\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bM\u0010R\u001a\u0004\bS\u0010,\"\u0004\bT\u0010UR$\u0010V\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0011\u0010]\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\\\u0010,R\u001a\u0010^\u001a\u00020-8\u0000X\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u00100¨\u0006c"}, d2 = {"Lcom/onedelhi/secure/fr;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lcom/onedelhi/secure/un4;", "d0", "Ljava/io/ObjectOutputStream;", "out", "x0", "", "u0", "Ljava/nio/charset/Charset;", "charset", "m0", "g", "W", "g0", "h0", "i0", "algorithm", "t", "(Ljava/lang/String;)Lcom/onedelhi/secure/fr;", "key", "F", "G", "H", "E", "(Ljava/lang/String;Lcom/onedelhi/secure/fr;)Lcom/onedelhi/secure/fr;", "l", "D", "r0", "s0", "", "beginIndex", "endIndex", "p0", "pos", "", "P", "(I)B", "index", "y", "B", "()I", "", "t0", "O", "()[B", "Ljava/nio/ByteBuffer;", "e", "Ljava/io/OutputStream;", "v0", "Lcom/onedelhi/secure/no;", "buffer", "offset", "byteCount", "w0", "(Lcom/onedelhi/secure/no;II)V", "other", "otherOffset", "", "a0", "b0", "prefix", "k0", "l0", "suffix", "w", "x", "fromIndex", "J", "L", "R", "T", "", "equals", "hashCode", "q", "toString", "a", "b", "I", "A", "e0", "(I)V", "utf8", "Ljava/lang/String;", "C", "()Ljava/lang/String;", "f0", "(Ljava/lang/String;)V", "j0", "size", "data", "[B", "z", "<init>", "([B)V", "okio"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.fr */
public class C5301fr implements Serializable, Comparable<C5301fr> {

    /* renamed from: a */
    public static final C5302a f28633a = new C5302a((wg0) null);
    @rw1
    @vr2

    /* renamed from: a */
    public static final C5301fr f28634a = new C5301fr(new byte[0]);

    /* renamed from: b */
    public static final long f28635b = 1;
    @vr2

    /* renamed from: a */
    public final byte[] f28636a;
    @ss2

    /* renamed from: b */
    public transient String f28637b;

    /* renamed from: n */
    public transient int f28638n;

    @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0007J'\u0010\n\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0005*\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0010\u001a\u00020\u0005*\u00020\u000fH\u0007J\u001d\u0010\u0013\u001a\u00020\u0005*\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0005*\u00020\u000fH\u0007J\f\u0010\u0016\u001a\u00020\u0005*\u00020\u000fH\u0007J\u001b\u0010\u0018\u001a\u00020\u0005*\u00020\u00172\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\u000eJ'\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b#\u0010\u000bJ\u001f\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002XT¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/onedelhi/secure/fr$a;", "", "", "", "data", "Lcom/onedelhi/secure/fr;", "n", "", "offset", "byteCount", "o", "([BII)Lcom/onedelhi/secure/fr;", "Ljava/nio/ByteBuffer;", "m", "(Ljava/nio/ByteBuffer;)Lcom/onedelhi/secure/fr;", "", "l", "Ljava/nio/charset/Charset;", "charset", "j", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/onedelhi/secure/fr;", "h", "i", "Ljava/io/InputStream;", "q", "(Ljava/io/InputStream;I)Lcom/onedelhi/secure/fr;", "string", "a", "(Ljava/lang/String;)Lcom/onedelhi/secure/fr;", "b", "c", "d", "buffer", "e", "array", "f", "inputstream", "g", "EMPTY", "Lcom/onedelhi/secure/fr;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fr$a */
    public static final class C5302a {
        public C5302a() {
        }

        public /* synthetic */ C5302a(wg0 wg0) {
            this();
        }

        /* renamed from: k */
        public static /* synthetic */ C5301fr m48445k(C5302a aVar, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = C5604hx.f29888a;
            }
            return aVar.mo36295j(str, charset);
        }

        /* renamed from: p */
        public static /* synthetic */ C5301fr m48446p(C5302a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo36299o(bArr, i, i2);
        }

        @uw1(name = "-deprecated_decodeBase64")
        @ss2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        /* renamed from: a */
        public final C5301fr mo36286a(@vr2 String str) {
            jt1.m53777p(str, ak4.C1709b.f9167e);
            return mo36293h(str);
        }

        @uw1(name = "-deprecated_decodeHex")
        @vr2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        /* renamed from: b */
        public final C5301fr mo36287b(@vr2 String str) {
            jt1.m53777p(str, ak4.C1709b.f9167e);
            return mo36294i(str);
        }

        @uw1(name = "-deprecated_encodeString")
        @vr2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        /* renamed from: c */
        public final C5301fr mo36288c(@vr2 String str, @vr2 Charset charset) {
            jt1.m53777p(str, ak4.C1709b.f9167e);
            jt1.m53777p(charset, "charset");
            return mo36295j(str, charset);
        }

        @uw1(name = "-deprecated_encodeUtf8")
        @vr2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        /* renamed from: d */
        public final C5301fr mo36289d(@vr2 String str) {
            jt1.m53777p(str, ak4.C1709b.f9167e);
            return mo36296l(str);
        }

        @uw1(name = "-deprecated_of")
        @vr2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        /* renamed from: e */
        public final C5301fr mo36290e(@vr2 ByteBuffer byteBuffer) {
            jt1.m53777p(byteBuffer, "buffer");
            return mo36297m(byteBuffer);
        }

        @uw1(name = "-deprecated_of")
        @vr2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        /* renamed from: f */
        public final C5301fr mo36291f(@vr2 byte[] bArr, int i, int i2) {
            jt1.m53777p(bArr, "array");
            return mo36299o(bArr, i, i2);
        }

        @uw1(name = "-deprecated_read")
        @vr2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        /* renamed from: g */
        public final C5301fr mo36292g(@vr2 InputStream inputStream, int i) {
            jt1.m53777p(inputStream, "inputstream");
            return mo36300q(inputStream, i);
        }

        @zw1
        @ss2
        /* renamed from: h */
        public final C5301fr mo36293h(@vr2 String str) {
            jt1.m53777p(str, "$this$decodeBase64");
            byte[] a = C4717c.m40637a(str);
            if (a != null) {
                return new C5301fr(a);
            }
            return null;
        }

        @zw1
        @vr2
        /* renamed from: i */
        public final C5301fr mo36294i(@vr2 String str) {
            jt1.m53777p(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((C5445gr.m49679H(str.charAt(i2)) << 4) + C5445gr.m49679H(str.charAt(i2 + 1)));
                }
                return new C5301fr(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        @zw1
        @uw1(name = "encodeString")
        @vr2
        /* renamed from: j */
        public final C5301fr mo36295j(@vr2 String str, @vr2 Charset charset) {
            jt1.m53777p(str, "$this$encode");
            jt1.m53777p(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            jt1.m53776o(bytes, "(this as java.lang.String).getBytes(charset)");
            return new C5301fr(bytes);
        }

        @zw1
        @vr2
        /* renamed from: l */
        public final C5301fr mo36296l(@vr2 String str) {
            jt1.m53777p(str, "$this$encodeUtf8");
            C5301fr frVar = new C5301fr(C5857k.m53899a(str));
            frVar.mo36270f0(str);
            return frVar;
        }

        @zw1
        @uw1(name = "of")
        @vr2
        /* renamed from: m */
        public final C5301fr mo36297m(@vr2 ByteBuffer byteBuffer) {
            jt1.m53777p(byteBuffer, "$this$toByteString");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new C5301fr(bArr);
        }

        @zw1
        @vr2
        /* renamed from: n */
        public final C5301fr mo36298n(@vr2 byte... bArr) {
            jt1.m53777p(bArr, C4311b.C4317f.C4318a.f25149a);
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new C5301fr(copyOf);
        }

        @zw1
        @uw1(name = "of")
        @vr2
        /* renamed from: o */
        public final C5301fr mo36299o(@vr2 byte[] bArr, int i, int i2) {
            jt1.m53777p(bArr, "$this$toByteString");
            C5950l.m55169e((long) bArr.length, (long) i, (long) i2);
            return new C5301fr(C7458za.m72745G1(bArr, i, i2 + i));
        }

        @zw1
        @uw1(name = "read")
        @vr2
        /* renamed from: q */
        public final C5301fr mo36300q(@vr2 InputStream inputStream, int i) throws IOException {
            jt1.m53777p(inputStream, "$this$readByteString");
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C5301fr(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }
    }

    public C5301fr(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, C4311b.C4317f.C4318a.f25149a);
        this.f28636a = bArr;
    }

    /* renamed from: M */
    public static /* synthetic */ int m48380M(C5301fr frVar, C5301fr frVar2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return frVar.mo36259J(frVar2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    /* renamed from: N */
    public static /* synthetic */ int m48381N(C5301fr frVar, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return frVar.mo31161L(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    /* renamed from: U */
    public static /* synthetic */ int m48382U(C5301fr frVar, C5301fr frVar2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = frVar.mo36274j0();
            }
            return frVar.mo36262R(frVar2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    /* renamed from: V */
    public static /* synthetic */ int m48383V(C5301fr frVar, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = frVar.mo36274j0();
            }
            return frVar.mo31164T(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    @zw1
    @uw1(name = "of")
    @vr2
    /* renamed from: X */
    public static final C5301fr m48384X(@vr2 ByteBuffer byteBuffer) {
        return f28633a.mo36297m(byteBuffer);
    }

    @zw1
    @vr2
    /* renamed from: Y */
    public static final C5301fr m48385Y(@vr2 byte... bArr) {
        return f28633a.mo36298n(bArr);
    }

    @zw1
    @uw1(name = "of")
    @vr2
    /* renamed from: Z */
    public static final C5301fr m48386Z(@vr2 byte[] bArr, int i, int i2) {
        return f28633a.mo36299o(bArr, i, i2);
    }

    @zw1
    @uw1(name = "read")
    @vr2
    /* renamed from: c0 */
    public static final C5301fr m48387c0(@vr2 InputStream inputStream, int i) throws IOException {
        return f28633a.mo36300q(inputStream, i);
    }

    /* renamed from: q0 */
    public static /* synthetic */ C5301fr m48388q0(C5301fr frVar, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = frVar.mo36274j0();
            }
            return frVar.mo31173p0(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    @zw1
    @ss2
    /* renamed from: r */
    public static final C5301fr m48389r(@vr2 String str) {
        return f28633a.mo36293h(str);
    }

    @zw1
    @vr2
    /* renamed from: s */
    public static final C5301fr m48390s(@vr2 String str) {
        return f28633a.mo36294i(str);
    }

    @zw1
    @uw1(name = "encodeString")
    @vr2
    /* renamed from: u */
    public static final C5301fr m48391u(@vr2 String str, @vr2 Charset charset) {
        return f28633a.mo36295j(str, charset);
    }

    @zw1
    @vr2
    /* renamed from: v */
    public static final C5301fr m48392v(@vr2 String str) {
        return f28633a.mo36296l(str);
    }

    /* renamed from: A */
    public final int mo36253A() {
        return this.f28638n;
    }

    /* renamed from: B */
    public int mo31157B() {
        return mo36285z().length;
    }

    @ss2
    /* renamed from: C */
    public final String mo36254C() {
        return this.f28637b;
    }

    @vr2
    /* renamed from: D */
    public String mo31159D() {
        char[] cArr = new char[(mo36285z().length * 2)];
        int i = 0;
        for (byte b : mo36285z()) {
            int i2 = i + 1;
            cArr[i] = C5445gr.m49680I()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C5445gr.m49680I()[b & 15];
        }
        return new String(cArr);
    }

    @vr2
    /* renamed from: E */
    public C5301fr mo31160E(@vr2 String str, @vr2 C5301fr frVar) {
        jt1.m53777p(str, "algorithm");
        jt1.m53777p(frVar, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(frVar.mo31177t0(), str));
            byte[] doFinal = instance.doFinal(this.f28636a);
            jt1.m53776o(doFinal, "mac.doFinal(data)");
            return new C5301fr(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @vr2
    /* renamed from: F */
    public C5301fr mo36255F(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "key");
        return mo31160E("HmacSHA1", frVar);
    }

    @vr2
    /* renamed from: G */
    public C5301fr mo36256G(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "key");
        return mo31160E("HmacSHA256", frVar);
    }

    @vr2
    /* renamed from: H */
    public C5301fr mo36257H(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "key");
        return mo31160E("HmacSHA512", frVar);
    }

    @vw1
    /* renamed from: I */
    public final int mo36258I(@vr2 C5301fr frVar) {
        return m48380M(this, frVar, 0, 2, (Object) null);
    }

    @vw1
    /* renamed from: J */
    public final int mo36259J(@vr2 C5301fr frVar, int i) {
        jt1.m53777p(frVar, "other");
        return mo31161L(frVar.mo31162O(), i);
    }

    @vw1
    /* renamed from: K */
    public final int mo36260K(@vr2 byte[] bArr) {
        return m48381N(this, bArr, 0, 2, (Object) null);
    }

    @vw1
    /* renamed from: L */
    public int mo31161L(@vr2 byte[] bArr, int i) {
        jt1.m53777p(bArr, "other");
        int length = mo36285z().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!C5950l.m55168d(mo36285z(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @vr2
    /* renamed from: O */
    public byte[] mo31162O() {
        return mo36285z();
    }

    /* renamed from: P */
    public byte mo31163P(int i) {
        return mo36285z()[i];
    }

    @vw1
    /* renamed from: Q */
    public final int mo36261Q(@vr2 C5301fr frVar) {
        return m48382U(this, frVar, 0, 2, (Object) null);
    }

    @vw1
    /* renamed from: R */
    public final int mo36262R(@vr2 C5301fr frVar, int i) {
        jt1.m53777p(frVar, "other");
        return mo31164T(frVar.mo31162O(), i);
    }

    @vw1
    /* renamed from: S */
    public final int mo36263S(@vr2 byte[] bArr) {
        return m48383V(this, bArr, 0, 2, (Object) null);
    }

    @vw1
    /* renamed from: T */
    public int mo31164T(@vr2 byte[] bArr, int i) {
        jt1.m53777p(bArr, "other");
        for (int min = Math.min(i, mo36285z().length - bArr.length); min >= 0; min--) {
            if (C5950l.m55168d(mo36285z(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @vr2
    /* renamed from: W */
    public C5301fr mo36264W() {
        return mo31176t("MD5");
    }

    @uw1(name = "-deprecated_getByte")
    @xj0(level = ak0.ERROR, message = "moved to operator function", replaceWith = @oi3(expression = "this[index]", imports = {}))
    /* renamed from: a */
    public final byte mo36265a(int i) {
        return mo36284y(i);
    }

    /* renamed from: a0 */
    public boolean mo31165a0(int i, @vr2 C5301fr frVar, int i2, int i3) {
        jt1.m53777p(frVar, "other");
        return frVar.mo31166b0(i2, mo36285z(), i, i3);
    }

    @uw1(name = "-deprecated_size")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "size", imports = {}))
    /* renamed from: b */
    public final int mo36266b() {
        return mo36274j0();
    }

    /* renamed from: b0 */
    public boolean mo31166b0(int i, @vr2 byte[] bArr, int i2, int i3) {
        jt1.m53777p(bArr, "other");
        return i >= 0 && i <= mo36285z().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C5950l.m55168d(mo36285z(), i, bArr, i2, i3);
    }

    /* renamed from: d0 */
    public final void mo36268d0(ObjectInputStream objectInputStream) throws IOException {
        C5301fr q = f28633a.mo36300q(objectInputStream, objectInputStream.readInt());
        Field declaredField = C5301fr.class.getDeclaredField("a");
        jt1.m53776o(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, q.f28636a);
    }

    @vr2
    /* renamed from: e */
    public ByteBuffer mo31167e() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.f28636a).asReadOnlyBuffer();
        jt1.m53776o(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    /* renamed from: e0 */
    public final void mo36269e0(int i) {
        this.f28638n = i;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5301fr) {
            C5301fr frVar = (C5301fr) obj;
            return frVar.mo36274j0() == mo36285z().length && frVar.mo31166b0(0, mo36285z(), 0, mo36285z().length);
        }
    }

    /* renamed from: f0 */
    public final void mo36270f0(@ss2 String str) {
        this.f28637b = str;
    }

    @vr2
    /* renamed from: g */
    public String mo31169g() {
        return C4717c.m40639c(mo36285z(), (byte[]) null, 1, (Object) null);
    }

    @vr2
    /* renamed from: g0 */
    public C5301fr mo36271g0() {
        return mo31176t(u10.f35895a);
    }

    @vr2
    /* renamed from: h0 */
    public C5301fr mo36272h0() {
        return mo31176t("SHA-256");
    }

    public int hashCode() {
        int A = mo36253A();
        if (A != 0) {
            return A;
        }
        int hashCode = Arrays.hashCode(mo36285z());
        mo36269e0(hashCode);
        return hashCode;
    }

    @vr2
    /* renamed from: i0 */
    public C5301fr mo36273i0() {
        return mo31176t("SHA-512");
    }

    @uw1(name = "size")
    /* renamed from: j0 */
    public final int mo36274j0() {
        return mo31157B();
    }

    /* renamed from: k0 */
    public final boolean mo36275k0(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "prefix");
        return mo31165a0(0, frVar, 0, frVar.mo36274j0());
    }

    @vr2
    /* renamed from: l */
    public String mo31171l() {
        return C4717c.m40638b(mo36285z(), C4717c.m40641e());
    }

    /* renamed from: l0 */
    public final boolean mo36276l0(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "prefix");
        return mo31166b0(0, bArr, 0, bArr.length);
    }

    @vr2
    /* renamed from: m0 */
    public String mo31172m0(@vr2 Charset charset) {
        jt1.m53777p(charset, "charset");
        return new String(this.f28636a, charset);
    }

    @vw1
    @vr2
    /* renamed from: n0 */
    public final C5301fr mo36277n0() {
        return m48388q0(this, 0, 0, 3, (Object) null);
    }

    @vw1
    @vr2
    /* renamed from: o0 */
    public final C5301fr mo36278o0(int i) {
        return m48388q0(this, i, 0, 2, (Object) null);
    }

    @vw1
    @vr2
    /* renamed from: p0 */
    public C5301fr mo31173p0(int i, int i2) {
        boolean z = true;
        if (i >= 0) {
            if (i2 <= mo36285z().length) {
                if (i2 - i < 0) {
                    z = false;
                }
                if (z) {
                    return (i == 0 && i2 == mo36285z().length) ? this : new C5301fr(C7458za.m72745G1(mo36285z(), i, i2));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + mo36285z().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030 A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(@com.onedelhi.secure.vr2 com.onedelhi.secure.C5301fr r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            com.onedelhi.secure.jt1.m53777p(r10, r0)
            int r0 = r9.mo36274j0()
            int r1 = r10.mo36274j0()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.mo36284y(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo36284y(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5301fr.compareTo(com.onedelhi.secure.fr):int");
    }

    @vr2
    /* renamed from: r0 */
    public C5301fr mo31174r0() {
        byte b;
        int i = 0;
        while (i < mo36285z().length) {
            byte b2 = mo36285z()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] z = mo36285z();
                byte[] copyOf = Arrays.copyOf(z, z.length);
                jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C5301fr(copyOf);
            }
        }
        return this;
    }

    @vr2
    /* renamed from: s0 */
    public C5301fr mo31175s0() {
        byte b;
        int i = 0;
        while (i < mo36285z().length) {
            byte b2 = mo36285z()[i];
            byte b3 = (byte) 97;
            if (b2 < b3 || b2 > (b = (byte) 122)) {
                i++;
            } else {
                byte[] z = mo36285z();
                byte[] copyOf = Arrays.copyOf(z, z.length);
                jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new C5301fr(copyOf);
            }
        }
        return this;
    }

    @vr2
    /* renamed from: t */
    public C5301fr mo31176t(@vr2 String str) {
        jt1.m53777p(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f28636a);
        jt1.m53776o(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new C5301fr(digest);
    }

    @vr2
    /* renamed from: t0 */
    public byte[] mo31177t0() {
        byte[] z = mo36285z();
        byte[] copyOf = Arrays.copyOf(z, z.length);
        jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @vr2
    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        boolean z = true;
        if (mo36285z().length == 0) {
            return "[size=0]";
        }
        int a = C5445gr.m49683c(mo36285z(), 64);
        if (a != -1) {
            String u0 = mo36280u0();
            Objects.requireNonNull(u0, "null cannot be cast to non-null type java.lang.String");
            String substring = u0.substring(0, a);
            jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String k2 = t54.m65446k2(t54.m65446k2(t54.m65446k2(substring, C3002nr.f17551h, "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (a < u0.length()) {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(mo36285z().length);
                sb.append(" text=");
                sb.append(k2);
                sb.append("…]");
                return sb.toString();
            }
            sb2 = new StringBuilder();
            sb2.append("[text=");
            sb2.append(k2);
        } else if (mo36285z().length <= 64) {
            sb2 = new StringBuilder();
            sb2.append("[hex=");
            sb2.append(mo31159D());
        } else {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(mo36285z().length);
            sb.append(" hex=");
            if (64 > mo36285z().length) {
                z = false;
            }
            if (z) {
                sb.append((64 == mo36285z().length ? this : new C5301fr(C7458za.m72745G1(mo36285z(), 0, 64))).mo31159D());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + mo36285z().length + ')').toString());
        }
        sb.append(']');
        return sb.toString();
    }

    @vr2
    /* renamed from: u0 */
    public String mo36280u0() {
        String C = mo36254C();
        if (C != null) {
            return C;
        }
        String c = C5857k.m53901c(mo31162O());
        mo36270f0(c);
        return c;
    }

    /* renamed from: v0 */
    public void mo31179v0(@vr2 OutputStream outputStream) throws IOException {
        jt1.m53777p(outputStream, "out");
        outputStream.write(this.f28636a);
    }

    /* renamed from: w */
    public final boolean mo36281w(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "suffix");
        return mo31165a0(mo36274j0() - frVar.mo36274j0(), frVar, 0, frVar.mo36274j0());
    }

    /* renamed from: w0 */
    public void mo31180w0(@vr2 C6205no noVar, int i, int i2) {
        jt1.m53777p(noVar, "buffer");
        C5445gr.m49678G(this, noVar, i, i2);
    }

    /* renamed from: x */
    public final boolean mo36282x(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "suffix");
        return mo31166b0(mo36274j0() - bArr.length, bArr, 0, bArr.length);
    }

    /* renamed from: x0 */
    public final void mo36283x0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f28636a.length);
        objectOutputStream.write(this.f28636a);
    }

    @uw1(name = "getByte")
    /* renamed from: y */
    public final byte mo36284y(int i) {
        return mo31163P(i);
    }

    @vr2
    /* renamed from: z */
    public final byte[] mo36285z() {
        return this.f28636a;
    }
}
