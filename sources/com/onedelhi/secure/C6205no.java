package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.ak4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0001B\t¢\u0006\u0006\b§\u0001\u0010¨\u0001J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0000H\u0016J\b\u0010\u0017\u001a\u00020\u0000H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0001H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J$\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007J \u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0007J\u001a\u0010\"\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010$\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0007J\b\u0010'\u001a\u00020&H\u0016J\u0018\u0010)\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010*J\b\u0010,\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J\b\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020-H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u00020\u0007H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020\u000fH\u0016J\u0010\u00106\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u00109\u001a\u00020-2\u0006\u00108\u001a\u000207H\u0016J\u0018\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010=\u001a\u00020\u00072\u0006\u0010:\u001a\u00020<H\u0016J\b\u0010>\u001a\u00020\rH\u0016J\u0010\u0010?\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010B\u001a\u00020\r2\u0006\u0010A\u001a\u00020@H\u0016J\u0018\u0010C\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010A\u001a\u00020@H\u0016J\n\u0010D\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010E\u001a\u00020\rH\u0016J\u0010\u0010G\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u0007H\u0016J\b\u0010H\u001a\u00020-H\u0016J\b\u0010J\u001a\u00020IH\u0016J\u0010\u0010K\u001a\u00020I2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010L\u001a\u00020-2\u0006\u0010:\u001a\u00020IH\u0016J\u0010\u0010M\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020IH\u0016J \u0010L\u001a\u00020-2\u0006\u0010:\u001a\u00020I2\u0006\u0010\u001e\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\u0010\u0010L\u001a\u00020-2\u0006\u0010:\u001a\u00020NH\u0016J\u0006\u0010O\u001a\u00020\u000bJ\u0010\u0010P\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u000fH\u0016J \u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\rH\u0016J \u0010X\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\r2\u0006\u0010V\u001a\u00020-2\u0006\u0010W\u001a\u00020-H\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020-H\u0016J\u0018\u0010[\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\r2\u0006\u0010A\u001a\u00020@H\u0016J(\u0010\\\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\r2\u0006\u0010V\u001a\u00020-2\u0006\u0010W\u001a\u00020-2\u0006\u0010A\u001a\u00020@H\u0016J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010]\u001a\u00020IH\u0016J \u0010_\u001a\u00020\u00002\u0006\u0010]\u001a\u00020I2\u0006\u0010\u001e\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\u0010\u0010`\u001a\u00020-2\u0006\u0010]\u001a\u00020NH\u0016J\u0010\u0010b\u001a\u00020\u00072\u0006\u0010]\u001a\u00020aH\u0016J\u0018\u0010c\u001a\u00020\u00002\u0006\u0010]\u001a\u00020a2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010e\u001a\u00020\u00002\u0006\u0010d\u001a\u00020-H\u0016J\u0010\u0010g\u001a\u00020\u00002\u0006\u0010f\u001a\u00020-H\u0016J\u0010\u0010h\u001a\u00020\u00002\u0006\u0010f\u001a\u00020-H\u0016J\u0010\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020-H\u0016J\u0010\u0010k\u001a\u00020\u00002\u0006\u0010i\u001a\u00020-H\u0016J\u0010\u0010m\u001a\u00020\u00002\u0006\u0010l\u001a\u00020\u0007H\u0016J\u0010\u0010n\u001a\u00020\u00002\u0006\u0010l\u001a\u00020\u0007H\u0016J\u0010\u0010o\u001a\u00020\u00002\u0006\u0010l\u001a\u00020\u0007H\u0016J\u0010\u0010p\u001a\u00020\u00002\u0006\u0010l\u001a\u00020\u0007H\u0016J\u0017\u0010s\u001a\u00020r2\u0006\u0010q\u001a\u00020-H\u0000¢\u0006\u0004\bs\u0010tJ\u0018\u0010`\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010L\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010i\u001a\u00020\u00072\u0006\u0010d\u001a\u00020&H\u0016J\u0018\u0010v\u001a\u00020\u00072\u0006\u0010d\u001a\u00020&2\u0006\u0010u\u001a\u00020\u0007H\u0016J \u0010x\u001a\u00020\u00072\u0006\u0010d\u001a\u00020&2\u0006\u0010u\u001a\u00020\u00072\u0006\u0010w\u001a\u00020\u0007H\u0016J\u0010\u0010z\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u000fH\u0016J\u0018\u0010{\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u000f2\u0006\u0010u\u001a\u00020\u0007H\u0016J\u0010\u0010}\u001a\u00020\u00072\u0006\u0010|\u001a\u00020\u000fH\u0016J\u0018\u0010~\u001a\u00020\u00072\u0006\u0010|\u001a\u00020\u000f2\u0006\u0010u\u001a\u00020\u0007H\u0016J\u0018\u0010\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u000fH\u0016J*\u0010\u0001\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u000f2\u0007\u0010\u0001\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\t\u0010\u0001\u001a\u00020\u000bH\u0016J\t\u0010\u0001\u001a\u00020\tH\u0016J\t\u0010\u0001\u001a\u00020\u000bH\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u0007\u0010\u0001\u001a\u00020\u000fJ\u0007\u0010\u0001\u001a\u00020\u000fJ\u0007\u0010\u0001\u001a\u00020\u000fJ\u0007\u0010\u0001\u001a\u00020\u000fJ\u000f\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u000f\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u000f\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\u0001\u001a\u00020\t2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\t\u0010\u0001\u001a\u00020-H\u0016J\t\u0010\u0001\u001a\u00020\rH\u0016J\u0007\u0010\u0001\u001a\u00020\u0000J\t\u0010\u0001\u001a\u00020\u0000H\u0016J\u0007\u0010\u0001\u001a\u00020\u000fJ\u000f\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020-J\u0016\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u0001H\u0007J\u0016\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u0001H\u0007J\u001a\u0010\u0001\u001a\u00020&2\u0007\u0010\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0005\b\u0001\u0010*J\u0010\u0010d\u001a\u00020\u0007H\u0007¢\u0006\u0005\bd\u0010\u0001R2\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u00078G@@X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u0017\u0010¦\u0001\u001a\u00020\u00008VX\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001¨\u0006©\u0001"}, d2 = {"Lcom/onedelhi/secure/no;", "Lcom/onedelhi/secure/to;", "Lcom/onedelhi/secure/so;", "", "Ljava/nio/channels/ByteChannel;", "Ljava/io/InputStream;", "input", "", "byteCount", "", "forever", "Lcom/onedelhi/secure/un4;", "G0", "", "algorithm", "Lcom/onedelhi/secure/fr;", "M", "key", "c0", "f", "Ljava/io/OutputStream;", "F", "Y", "X", "f2", "o", "T", "t", "r", "out", "offset", "A", "m", "l", "M1", "C0", "F0", "g", "", "readByte", "pos", "Z", "(J)B", "", "readShort", "", "readInt", "readLong", "t1", "n1", "Y1", "b0", "s2", "r0", "I", "Lcom/onedelhi/secure/yw2;", "options", "m0", "sink", "e2", "Lcom/onedelhi/secure/oz3;", "B", "j", "r1", "Ljava/nio/charset/Charset;", "charset", "H2", "z2", "K0", "r2", "limit", "X0", "D0", "", "u2", "k1", "read", "readFully", "Ljava/nio/ByteBuffer;", "c", "F1", "byteString", "h1", "i1", "string", "V1", "beginIndex", "endIndex", "a2", "codePoint", "b2", "J1", "H1", "source", "l1", "p1", "write", "Lcom/onedelhi/secure/x04;", "N", "j1", "b", "s1", "s", "E1", "G1", "i", "A1", "B1", "v", "C1", "D1", "w1", "z1", "minimumCapacity", "Lcom/onedelhi/secure/ws3;", "f1", "(I)Lcom/onedelhi/secure/ws3;", "fromIndex", "I0", "toIndex", "s0", "bytes", "N1", "a0", "targetBytes", "q1", "k", "O", "bytesOffset", "k0", "flush", "isOpen", "close", "Lcom/onedelhi/secure/me4;", "timeout", "o0", "Q0", "R0", "S0", "e0", "j0", "l0", "", "other", "equals", "hashCode", "toString", "h", "d", "b1", "c1", "Lcom/onedelhi/secure/no$a;", "unsafeCursor", "N0", "q0", "index", "a", "()J", "<set-?>", "size", "J", "V0", "P0", "(J)V", "e", "()Lcom/onedelhi/secure/no;", "buffer", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.no */
public final class C6205no implements C6893to, C6785so, Cloneable, ByteChannel {
    @rw1
    @ss2

    /* renamed from: a */
    public ws3 f32655a;

    /* renamed from: b */
    public long f32656b;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/no$a;", "Ljava/io/Closeable;", "", "b", "", "offset", "d", "newSize", "c", "minByteCount", "a", "Lcom/onedelhi/secure/un4;", "close", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.no$a */
    public static final class C6206a implements Closeable {
        @rw1
        @ss2

        /* renamed from: a */
        public C6205no f32657a;

        /* renamed from: a */
        public ws3 f32658a;
        @rw1
        @ss2

        /* renamed from: a */
        public byte[] f32659a;
        @rw1

        /* renamed from: b */
        public long f32660b = -1;
        @rw1

        /* renamed from: b */
        public boolean f32661b;
        @rw1

        /* renamed from: n */
        public int f32662n = -1;
        @rw1

        /* renamed from: o */
        public int f32663o = -1;

        /* renamed from: a */
        public final long mo41299a(int i) {
            boolean z = true;
            if (i > 0) {
                if (i > 8192) {
                    z = false;
                }
                if (z) {
                    C6205no noVar = this.f32657a;
                    if (noVar == null) {
                        throw new IllegalStateException("not attached to a buffer".toString());
                    } else if (this.f32661b) {
                        long V0 = noVar.mo41244V0();
                        ws3 f1 = noVar.mo41263f1(i);
                        int i2 = 8192 - f1.f37112b;
                        f1.f37112b = 8192;
                        long j = (long) i2;
                        noVar.mo41237P0(V0 + j);
                        this.f32658a = f1;
                        this.f32660b = V0;
                        this.f32659a = f1.f37111a;
                        this.f32662n = 8192 - i2;
                        this.f32663o = 8192;
                        return j;
                    } else {
                        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
                    }
                } else {
                    throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
                }
            } else {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i).toString());
            }
        }

        /* renamed from: b */
        public final int mo41300b() {
            long j = this.f32660b;
            C6205no noVar = this.f32657a;
            jt1.m53774m(noVar);
            if (j != noVar.mo41244V0()) {
                long j2 = this.f32660b;
                return mo41303d(j2 == -1 ? 0 : j2 + ((long) (this.f32663o - this.f32662n)));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        /* renamed from: c */
        public final long mo41301c(long j) {
            long j2 = j;
            C6205no noVar = this.f32657a;
            if (noVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (this.f32661b) {
                long V0 = noVar.mo41244V0();
                int i = 1;
                int i2 = (j2 > V0 ? 1 : (j2 == V0 ? 0 : -1));
                if (i2 <= 0) {
                    if (j2 >= 0) {
                        long j3 = V0 - j2;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            ws3 ws3 = noVar.f32655a;
                            jt1.m53774m(ws3);
                            ws3 ws32 = ws3.f37113b;
                            jt1.m53774m(ws32);
                            int i3 = ws32.f37112b;
                            long j4 = (long) (i3 - ws32.f37108a);
                            if (j4 > j3) {
                                ws32.f37112b = i3 - ((int) j3);
                                break;
                            }
                            noVar.f32655a = ws32.mo46873b();
                            zs3.m74279d(ws32);
                            j3 -= j4;
                        }
                        this.f32658a = null;
                        this.f32660b = j2;
                        this.f32659a = null;
                        this.f32662n = -1;
                        this.f32663o = -1;
                    } else {
                        throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                    }
                } else if (i2 > 0) {
                    long j5 = j2 - V0;
                    boolean z = true;
                    while (j5 > 0) {
                        ws3 f1 = noVar.mo41263f1(i);
                        int min = (int) Math.min(j5, (long) (8192 - f1.f37112b));
                        int i4 = f1.f37112b + min;
                        f1.f37112b = i4;
                        j5 -= (long) min;
                        if (z) {
                            this.f32658a = f1;
                            this.f32660b = V0;
                            this.f32659a = f1.f37111a;
                            this.f32662n = i4 - min;
                            this.f32663o = i4;
                            z = false;
                        }
                        i = 1;
                    }
                }
                noVar.mo41237P0(j2);
                return V0;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
        }

        public void close() {
            if (this.f32657a != null) {
                this.f32657a = null;
                this.f32658a = null;
                this.f32660b = -1;
                this.f32659a = null;
                this.f32662n = -1;
                this.f32663o = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: d */
        public final int mo41303d(long j) {
            ws3 ws3;
            C6205no noVar = this.f32657a;
            if (noVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (j < ((long) -1) || j > noVar.mo41244V0()) {
                x44 x44 = x44.f37329a;
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(noVar.mo41244V0())}, 2));
                jt1.m53776o(format, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(format);
            } else if (j == -1 || j == noVar.mo41244V0()) {
                this.f32658a = null;
                this.f32660b = j;
                this.f32659a = null;
                this.f32662n = -1;
                this.f32663o = -1;
                return -1;
            } else {
                long j2 = 0;
                long V0 = noVar.mo41244V0();
                ws3 ws32 = noVar.f32655a;
                ws3 ws33 = this.f32658a;
                if (ws33 != null) {
                    long j3 = this.f32660b;
                    int i = this.f32662n;
                    jt1.m53774m(ws33);
                    long j4 = j3 - ((long) (i - ws33.f37108a));
                    if (j4 > j) {
                        ws3 = ws32;
                        ws32 = this.f32658a;
                        V0 = j4;
                    } else {
                        ws3 = this.f32658a;
                        j2 = j4;
                    }
                } else {
                    ws3 = ws32;
                }
                if (V0 - j > j - j2) {
                    while (true) {
                        jt1.m53774m(ws3);
                        int i2 = ws3.f37112b;
                        int i3 = ws3.f37108a;
                        if (j < ((long) (i2 - i3)) + j2) {
                            break;
                        }
                        j2 += (long) (i2 - i3);
                        ws3 = ws3.f37109a;
                    }
                } else {
                    while (V0 > j) {
                        jt1.m53774m(ws32);
                        ws32 = ws32.f37113b;
                        jt1.m53774m(ws32);
                        V0 -= (long) (ws32.f37112b - ws32.f37108a);
                    }
                    j2 = V0;
                    ws3 = ws32;
                }
                if (this.f32661b) {
                    jt1.m53774m(ws3);
                    if (ws3.f37110a) {
                        ws3 f = ws3.mo46877f();
                        if (noVar.f32655a == ws3) {
                            noVar.f32655a = f;
                        }
                        ws3 = ws3.mo46874c(f);
                        ws3 ws34 = ws3.f37113b;
                        jt1.m53774m(ws34);
                        ws34.mo46873b();
                    }
                }
                this.f32658a = ws3;
                this.f32660b = j;
                jt1.m53774m(ws3);
                this.f32659a = ws3.f37111a;
                int i4 = ws3.f37108a + ((int) (j - j2));
                this.f32662n = i4;
                int i5 = ws3.f37112b;
                this.f32663o = i5;
                return i5 - i4;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"com/onedelhi/secure/no$b", "Ljava/io/InputStream;", "", "read", "", "sink", "offset", "byteCount", "available", "Lcom/onedelhi/secure/un4;", "close", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.no$b */
    public static final class C6207b extends InputStream {

        /* renamed from: a */
        public final /* synthetic */ C6205no f32664a;

        public C6207b(C6205no noVar) {
            this.f32664a = noVar;
        }

        public int available() {
            return (int) Math.min(this.f32664a.mo41244V0(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f32664a.mo41244V0() > 0) {
                return this.f32664a.readByte() & 255;
            }
            return -1;
        }

        public int read(@vr2 byte[] bArr, int i, int i2) {
            jt1.m53777p(bArr, "sink");
            return this.f32664a.read(bArr, i, i2);
        }

        @vr2
        public String toString() {
            return this.f32664a + ".inputStream()";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"com/onedelhi/secure/no$c", "Ljava/io/OutputStream;", "", "b", "Lcom/onedelhi/secure/un4;", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.no$c */
    public static final class C6208c extends OutputStream {

        /* renamed from: a */
        public final /* synthetic */ C6205no f32665a;

        public C6208c(C6205no noVar) {
            this.f32665a = noVar;
        }

        public void close() {
        }

        public void flush() {
        }

        @vr2
        public String toString() {
            return this.f32665a + ".outputStream()";
        }

        public void write(int i) {
            this.f32665a.mo41230L0(i);
        }

        public void write(@vr2 byte[] bArr, int i, int i2) {
            jt1.m53777p(bArr, C4311b.C4317f.C4318a.f25149a);
            this.f32665a.mo41266h0(bArr, i, i2);
        }
    }

    /* renamed from: E */
    public static /* synthetic */ C6205no m58316E(C6205no noVar, C6205no noVar2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return noVar.mo41275l(noVar2, j);
    }

    /* renamed from: H */
    public static /* synthetic */ C6205no m58317H(C6205no noVar, C6205no noVar2, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return noVar.mo41278m(noVar2, j, j2);
    }

    /* renamed from: K */
    public static /* synthetic */ C6205no m58318K(C6205no noVar, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = noVar.f32656b - j3;
        }
        return noVar.mo41213A(outputStream, j3, j2);
    }

    /* renamed from: O0 */
    public static /* synthetic */ C6206a m58319O0(C6205no noVar, C6206a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new C6206a();
        }
        return noVar.mo41236N0(aVar);
    }

    /* renamed from: U1 */
    public static /* synthetic */ C6205no m58320U1(C6205no noVar, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = noVar.f32656b;
        }
        return noVar.mo41234M1(outputStream, j);
    }

    /* renamed from: u0 */
    public static /* synthetic */ C6206a m58321u0(C6205no noVar, C6206a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new C6206a();
        }
        return noVar.mo41285q0(aVar);
    }

    @vw1
    @vr2
    /* renamed from: A */
    public final C6205no mo41213A(@vr2 OutputStream outputStream, long j, long j2) throws IOException {
        jt1.m53777p(outputStream, "out");
        C5950l.m55169e(this.f32656b, j, j2);
        if (j2 == 0) {
            return this;
        }
        ws3 ws3 = this.f32655a;
        while (true) {
            jt1.m53774m(ws3);
            int i = ws3.f37112b;
            int i2 = ws3.f37108a;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            ws3 = ws3.f37109a;
        }
        while (j2 > 0) {
            jt1.m53774m(ws3);
            int i3 = (int) (((long) ws3.f37108a) + j);
            int min = (int) Math.min((long) (ws3.f37112b - i3), j2);
            outputStream.write(ws3.f37111a, i3, min);
            j2 -= (long) min;
            ws3 = ws3.f37109a;
            j = 0;
        }
        return this;
    }

    @vr2
    /* renamed from: A1 */
    public C6205no mo41293w0(int i) {
        ws3 f1 = mo41263f1(4);
        byte[] bArr = f1.f37111a;
        int i2 = f1.f37112b;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        f1.f37112b = i5 + 1;
        mo41237P0(mo41244V0() + 4);
        return this;
    }

    /* renamed from: B */
    public long mo31668B(@vr2 oz3 oz3) throws IOException {
        jt1.m53777p(oz3, "sink");
        long V0 = mo41244V0();
        if (V0 > 0) {
            oz3.write(this, V0);
        }
        return V0;
    }

    @vr2
    /* renamed from: B1 */
    public C6205no mo41268h2(int i) {
        return mo41293w0(C5950l.m55172h(i));
    }

    @vr2
    /* renamed from: C0 */
    public final C6205no mo41218C0(@vr2 InputStream inputStream) throws IOException {
        jt1.m53777p(inputStream, "input");
        mo41225G0(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @vr2
    /* renamed from: C1 */
    public C6205no mo41292v(long j) {
        ws3 f1 = mo41263f1(8);
        byte[] bArr = f1.f37111a;
        int i = f1.f37112b;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        f1.f37112b = i8 + 1;
        mo41237P0(mo41244V0() + 8);
        return this;
    }

    /* renamed from: D0 */
    public int mo31669D0() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (mo41244V0() != 0) {
            byte Z = mo41249Z(0);
            int i2 = 1;
            if ((Z & C7276xq.f37586a) == 0) {
                b2 = Z & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((Z & 224) == 192) {
                b2 = Z & 31;
                i = 2;
                b = C7276xq.f37586a;
            } else if ((Z & 240) == 224) {
                b2 = Z & 15;
                i = 3;
                b = 2048;
            } else if ((Z & 248) == 240) {
                b2 = Z & 7;
                i = 4;
                b = 65536;
            } else {
                mo31670F1(1);
                return iq4.f30425a;
            }
            long j = (long) i;
            if (mo41244V0() >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte Z2 = mo41249Z(j2);
                    if ((Z2 & mx0.f16640e) == 128) {
                        b2 = (b2 << 6) | (Z2 & iq4.f30423a);
                        i2++;
                    } else {
                        mo31670F1(j2);
                        return iq4.f30425a;
                    }
                }
                mo31670F1(j);
                return b2 > 1114111 ? iq4.f30425a : ((55296 <= b2 && 57343 >= b2) || b2 < b) ? iq4.f30425a : b2;
            }
            throw new EOFException("size < " + i + ": " + mo41244V0() + " (to read code point prefixed 0x" + C5950l.m55177m(Z) + ')');
        }
        throw new EOFException();
    }

    @vr2
    /* renamed from: D1 */
    public C6205no mo41215B0(long j) {
        return mo41292v(C5950l.m55173i(j));
    }

    @vr2
    /* renamed from: E1 */
    public C6205no mo41243V(int i) {
        ws3 f1 = mo41263f1(2);
        byte[] bArr = f1.f37111a;
        int i2 = f1.f37112b;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        f1.f37112b = i3 + 1;
        mo41237P0(mo41244V0() + 2);
        return this;
    }

    @vr2
    /* renamed from: F */
    public OutputStream mo41223F() {
        return new C6208c(this);
    }

    @vr2
    /* renamed from: F0 */
    public final C6205no mo41224F0(@vr2 InputStream inputStream, long j) throws IOException {
        jt1.m53777p(inputStream, "input");
        if (j >= 0) {
            mo41225G0(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    /* renamed from: F1 */
    public void mo31670F1(long j) throws EOFException {
        while (j > 0) {
            ws3 ws3 = this.f32655a;
            if (ws3 != null) {
                int min = (int) Math.min(j, (long) (ws3.f37112b - ws3.f37108a));
                long j2 = (long) min;
                mo41237P0(mo41244V0() - j2);
                j -= j2;
                int i = ws3.f37108a + min;
                ws3.f37108a = i;
                if (i == ws3.f37112b) {
                    this.f32655a = ws3.mo46873b();
                    zs3.m74279d(ws3);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: G0 */
    public final void mo41225G0(InputStream inputStream, long j, boolean z) throws IOException {
        while (true) {
            if (j > 0 || z) {
                ws3 f1 = mo41263f1(1);
                int read = inputStream.read(f1.f37111a, f1.f37112b, (int) Math.min(j, (long) (8192 - f1.f37112b)));
                if (read == -1) {
                    if (f1.f37108a == f1.f37112b) {
                        this.f32655a = f1.mo46873b();
                        zs3.m74279d(f1);
                    }
                    if (!z) {
                        throw new EOFException();
                    }
                    return;
                }
                f1.f37112b += read;
                long j2 = (long) read;
                this.f32656b += j2;
                j -= j2;
            } else {
                return;
            }
        }
    }

    @vr2
    /* renamed from: G1 */
    public C6205no mo41291u1(int i) {
        return mo41243V(C5950l.m55174j((short) i));
    }

    @vr2
    /* renamed from: H1 */
    public C6205no mo41229J2(@vr2 String str, int i, int i2, @vr2 Charset charset) {
        jt1.m53777p(str, ak4.C1709b.f9167e);
        jt1.m53777p(charset, "charset");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
                } else if (jt1.m53768g(charset, C5604hx.f29888a)) {
                    return mo41246W0(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = substring.getBytes(charset);
                    jt1.m53776o(bytes, "(this as java.lang.String).getBytes(charset)");
                    return mo41266h0(bytes, 0, bytes.length);
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
    }

    @vr2
    /* renamed from: H2 */
    public String mo31671H2(@vr2 Charset charset) {
        jt1.m53777p(charset, "charset");
        return mo31714z2(this.f32656b, charset);
    }

    @vr2
    /* renamed from: I */
    public C5301fr mo31672I(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (mo41244V0() < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new C5301fr(mo31691k1(j));
        } else {
            C5301fr c1 = mo41257c1((int) j);
            mo31670F1(j);
            return c1;
        }
    }

    /* renamed from: I0 */
    public long mo31673I0(byte b, long j) {
        return mo31708s0(b, j, Long.MAX_VALUE);
    }

    @vr2
    /* renamed from: J1 */
    public C6205no mo41297z(@vr2 String str, @vr2 Charset charset) {
        jt1.m53777p(str, ak4.C1709b.f9167e);
        jt1.m53777p(charset, "charset");
        return mo41229J2(str, 0, str.length(), charset);
    }

    @ss2
    /* renamed from: K0 */
    public String mo31674K0() throws EOFException {
        long i = mo31686i((byte) 10);
        if (i != -1) {
            return C6467po.m61499b0(this, i);
        }
        if (mo41244V0() != 0) {
            return mo31698r1(mo41244V0());
        }
        return null;
    }

    @vw1
    @vr2
    /* renamed from: L1 */
    public final C6205no mo41231L1(@vr2 OutputStream outputStream) throws IOException {
        return m58320U1(this, outputStream, 0, 2, (Object) null);
    }

    /* renamed from: M */
    public final C5301fr mo41232M(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        ws3 ws3 = this.f32655a;
        if (ws3 != null) {
            byte[] bArr = ws3.f37111a;
            int i = ws3.f37108a;
            instance.update(bArr, i, ws3.f37112b - i);
            ws3 ws32 = ws3.f37109a;
            while (true) {
                jt1.m53774m(ws32);
                if (ws32 == ws3) {
                    break;
                }
                byte[] bArr2 = ws32.f37111a;
                int i2 = ws32.f37108a;
                instance.update(bArr2, i2, ws32.f37112b - i2);
                ws32 = ws32.f37109a;
            }
        }
        byte[] digest = instance.digest();
        jt1.m53776o(digest, "messageDigest.digest()");
        return new C5301fr(digest);
    }

    @vw1
    @vr2
    /* renamed from: M0 */
    public final C6206a mo41233M0() {
        return m58319O0(this, (C6206a) null, 1, (Object) null);
    }

    @vw1
    @vr2
    /* renamed from: M1 */
    public final C6205no mo41234M1(@vr2 OutputStream outputStream, long j) throws IOException {
        jt1.m53777p(outputStream, "out");
        C5950l.m55169e(this.f32656b, 0, j);
        ws3 ws3 = this.f32655a;
        while (j > 0) {
            jt1.m53774m(ws3);
            int min = (int) Math.min(j, (long) (ws3.f37112b - ws3.f37108a));
            outputStream.write(ws3.f37111a, ws3.f37108a, min);
            int i = ws3.f37108a + min;
            ws3.f37108a = i;
            long j2 = (long) min;
            this.f32656b -= j2;
            j -= j2;
            if (i == ws3.f37112b) {
                ws3 b = ws3.mo46873b();
                this.f32655a = b;
                zs3.m74279d(ws3);
                ws3 = b;
            }
        }
        return this;
    }

    /* renamed from: N */
    public long mo41235N(@vr2 x04 x04) throws IOException {
        jt1.m53777p(x04, "source");
        long j = 0;
        while (true) {
            long read = x04.read(this, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @vw1
    @vr2
    /* renamed from: N0 */
    public final C6206a mo41236N0(@vr2 C6206a aVar) {
        jt1.m53777p(aVar, "unsafeCursor");
        if (aVar.f32657a == null) {
            aVar.f32657a = this;
            aVar.f32661b = false;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    /* renamed from: N1 */
    public long mo31675N1(@vr2 C5301fr frVar) throws IOException {
        jt1.m53777p(frVar, "bytes");
        return mo31680a0(frVar, 0);
    }

    /* renamed from: O */
    public boolean mo31676O(long j, @vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "bytes");
        return mo31690k0(j, frVar, 0, frVar.mo36274j0());
    }

    /* renamed from: P0 */
    public final void mo41237P0(long j) {
        this.f32656b = j;
    }

    @vr2
    /* renamed from: Q0 */
    public final C5301fr mo41238Q0() {
        return mo41232M(u10.f35895a);
    }

    @vr2
    /* renamed from: R0 */
    public final C5301fr mo41239R0() {
        return mo41232M("SHA-256");
    }

    @vr2
    /* renamed from: S0 */
    public final C5301fr mo41241S0() {
        return mo41232M("SHA-512");
    }

    /* renamed from: T */
    public boolean mo31677T(long j) {
        return this.f32656b >= j;
    }

    @uw1(name = "size")
    /* renamed from: V0 */
    public final long mo41244V0() {
        return this.f32656b;
    }

    @vr2
    /* renamed from: V1 */
    public C6205no mo41279n(@vr2 String str) {
        jt1.m53777p(str, ak4.C1709b.f9167e);
        return mo41246W0(str, 0, str.length());
    }

    @vr2
    /* renamed from: X */
    public C6205no mo41217C() {
        return this;
    }

    @vr2
    /* renamed from: X0 */
    public String mo31678X0(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long s0 = mo31708s0(b, 0, j2);
            if (s0 != -1) {
                return C6467po.m61499b0(this, s0);
            }
            if (j2 < mo41244V0() && mo41249Z(j2 - 1) == ((byte) 13) && mo41249Z(j2) == b) {
                return C6467po.m61499b0(this, j2);
            }
            C6205no noVar = new C6205no();
            mo41278m(noVar, 0, Math.min((long) 32, mo41244V0()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo41244V0(), j) + " content=" + noVar.mo31697r0().mo31159D() + tk4.f35682E);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @vr2
    /* renamed from: Y */
    public C6205no mo41296y2() {
        return this;
    }

    /* renamed from: Y1 */
    public long mo31679Y1() throws EOFException {
        return C5950l.m55173i(readLong());
    }

    @uw1(name = "getByte")
    /* renamed from: Z */
    public final byte mo41249Z(long j) {
        C5950l.m55169e(mo41244V0(), j, 1);
        ws3 ws3 = this.f32655a;
        if (ws3 == null) {
            jt1.m53774m((Object) null);
            throw null;
        } else if (mo41244V0() - j < j) {
            long V0 = mo41244V0();
            while (V0 > j) {
                ws3 = ws3.f37113b;
                jt1.m53774m(ws3);
                V0 -= (long) (ws3.f37112b - ws3.f37108a);
            }
            jt1.m53774m(ws3);
            return ws3.f37111a[(int) ((((long) ws3.f37108a) + j) - V0)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (ws3.f37112b - ws3.f37108a)) + j2;
                if (j3 > j) {
                    jt1.m53774m(ws3);
                    return ws3.f37111a[(int) ((((long) ws3.f37108a) + j) - j2)];
                }
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                j2 = j3;
            }
        }
    }

    @uw1(name = "-deprecated_getByte")
    @xj0(level = ak0.ERROR, message = "moved to operator function", replaceWith = @oi3(expression = "this[index]", imports = {}))
    /* renamed from: a */
    public final byte mo41250a(long j) {
        return mo41249Z(j);
    }

    /* renamed from: a0 */
    public long mo31680a0(@vr2 C5301fr frVar, long j) throws IOException {
        long j2 = j;
        jt1.m53777p(frVar, "bytes");
        if (frVar.mo36274j0() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                ws3 ws3 = this.f32655a;
                if (ws3 != null) {
                    if (mo41244V0() - j2 < j2) {
                        long V0 = mo41244V0();
                        while (V0 > j2) {
                            ws3 = ws3.f37113b;
                            jt1.m53774m(ws3);
                            V0 -= (long) (ws3.f37112b - ws3.f37108a);
                        }
                        byte[] O = frVar.mo31162O();
                        byte b = O[0];
                        int j0 = frVar.mo36274j0();
                        long V02 = (mo41244V0() - ((long) j0)) + 1;
                        while (V0 < V02) {
                            byte[] bArr = ws3.f37111a;
                            long j4 = V0;
                            int min = (int) Math.min((long) ws3.f37112b, (((long) ws3.f37108a) + V02) - V0);
                            long j5 = ((long) ws3.f37108a) + j2;
                            long j6 = j4;
                            for (int i = (int) (j5 - j6); i < min; i++) {
                                if (bArr[i] == b && C6467po.m61497a0(ws3, i + 1, O, 1, j0)) {
                                    return ((long) (i - ws3.f37108a)) + j6;
                                }
                            }
                            V0 = j6 + ((long) (ws3.f37112b - ws3.f37108a));
                            ws3 = ws3.f37109a;
                            jt1.m53774m(ws3);
                            j2 = V0;
                        }
                    } else {
                        while (true) {
                            long j7 = ((long) (ws3.f37112b - ws3.f37108a)) + j3;
                            if (j7 > j2) {
                                break;
                            }
                            ws3 = ws3.f37109a;
                            jt1.m53774m(ws3);
                            j3 = j7;
                        }
                        byte[] O2 = frVar.mo31162O();
                        byte b2 = O2[0];
                        int j02 = frVar.mo36274j0();
                        long V03 = (mo41244V0() - ((long) j02)) + 1;
                        while (j3 < V03) {
                            byte[] bArr2 = ws3.f37111a;
                            long j8 = V03;
                            int min2 = (int) Math.min((long) ws3.f37112b, (((long) ws3.f37108a) + V03) - j3);
                            for (int i2 = (int) ((((long) ws3.f37108a) + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2) {
                                    if (C6467po.m61497a0(ws3, i2 + 1, O2, 1, j02)) {
                                        return ((long) (i2 - ws3.f37108a)) + j3;
                                    }
                                }
                            }
                            j3 += (long) (ws3.f37112b - ws3.f37108a);
                            ws3 = ws3.f37109a;
                            jt1.m53774m(ws3);
                            j2 = j3;
                            V03 = j8;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @vr2
    /* renamed from: a2 */
    public C6205no mo41246W0(@vr2 String str, int i, int i2) {
        long V0;
        long j;
        jt1.m53777p(str, ak4.C1709b.f9167e);
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            ws3 f1 = mo41263f1(1);
                            byte[] bArr = f1.f37111a;
                            int i3 = f1.f37112b - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = f1.f37112b;
                            int i6 = (i3 + i4) - i5;
                            f1.f37112b = i5 + i6;
                            mo41237P0(mo41244V0() + ((long) i6));
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                ws3 f12 = mo41263f1(2);
                                byte[] bArr2 = f12.f37111a;
                                int i7 = f12.f37112b;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                f12.f37112b = i7 + 2;
                                V0 = mo41244V0();
                                j = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                ws3 f13 = mo41263f1(3);
                                byte[] bArr3 = f13.f37111a;
                                int i8 = f13.f37112b;
                                bArr3[i8] = (byte) ((charAt >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                f13.f37112b = i8 + 3;
                                V0 = mo41244V0();
                                j = 3;
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    mo41230L0(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + C6794sw.f35203a;
                                    ws3 f14 = mo41263f1(4);
                                    byte[] bArr4 = f14.f37111a;
                                    int i11 = f14.f37112b;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    f14.f37112b = i11 + 4;
                                    mo41237P0(mo41244V0() + 4);
                                    i += 2;
                                }
                            }
                            mo41237P0(V0 + j);
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    @uw1(name = "-deprecated_size")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "size", imports = {}))
    /* renamed from: b */
    public final long mo41252b() {
        return this.f32656b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        if (r10 != r11) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        r0.f32655a = r16.mo46873b();
        com.onedelhi.secure.zs3.m74279d(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        r16.f37108a = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r7 != false) goto L_0x00c2;
     */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo31681b0() throws java.io.EOFException {
        /*
            r17 = this;
            r0 = r17
            long r1 = r17.mo41244V0()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00d0
            r1 = -7
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0011:
            com.onedelhi.secure.ws3 r8 = r0.f32655a
            com.onedelhi.secure.jt1.m53774m(r8)
            byte[] r9 = r8.f37111a
            int r10 = r8.f37108a
            int r11 = r8.f37112b
        L_0x001c:
            r12 = 1
            if (r10 >= r11) goto L_0x00a9
            byte r13 = r9[r10]
            r14 = 48
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x0074
            r15 = 57
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x0074
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0047
            r15 = r7
            r16 = r8
            if (r12 != 0) goto L_0x0040
            long r7 = (long) r14
            int r12 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0040
            goto L_0x0047
        L_0x0040:
            r7 = 10
            long r3 = r3 * r7
            long r7 = (long) r14
            long r3 = r3 + r7
            goto L_0x0082
        L_0x0047:
            com.onedelhi.secure.no r1 = new com.onedelhi.secure.no
            r1.<init>()
            com.onedelhi.secure.no r1 = r1.mo41242S1(r3)
            com.onedelhi.secure.no r1 = r1.mo41230L0(r13)
            if (r6 != 0) goto L_0x0059
            r1.readByte()
        L_0x0059:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.mo31688j()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0074:
            r15 = r7
            r16 = r8
            r7 = 45
            byte r7 = (byte) r7
            if (r13 != r7) goto L_0x008a
            if (r5 != 0) goto L_0x008a
            r6 = 1
            long r1 = r1 - r6
            r6 = 1
        L_0x0082:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r7 = r15
            r8 = r16
            goto L_0x001c
        L_0x008a:
            if (r5 == 0) goto L_0x008e
            r7 = 1
            goto L_0x00ac
        L_0x008e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = com.onedelhi.secure.C5950l.m55177m(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00a9:
            r15 = r7
            r16 = r8
        L_0x00ac:
            if (r10 != r11) goto L_0x00b8
            com.onedelhi.secure.ws3 r8 = r16.mo46873b()
            r0.f32655a = r8
            com.onedelhi.secure.zs3.m74279d(r16)
            goto L_0x00bc
        L_0x00b8:
            r8 = r16
            r8.f37108a = r10
        L_0x00bc:
            if (r7 != 0) goto L_0x00c2
            com.onedelhi.secure.ws3 r8 = r0.f32655a
            if (r8 != 0) goto L_0x0011
        L_0x00c2:
            long r1 = r17.mo41244V0()
            long r7 = (long) r5
            long r1 = r1 - r7
            r0.mo41237P0(r1)
            if (r6 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            long r3 = -r3
        L_0x00cf:
            return r3
        L_0x00d0:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6205no.mo31681b0():long");
    }

    @vr2
    /* renamed from: b1 */
    public final C5301fr mo41253b1() {
        if (mo41244V0() <= ((long) Integer.MAX_VALUE)) {
            return mo41257c1((int) mo41244V0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + mo41244V0()).toString());
    }

    @vr2
    /* renamed from: b2 */
    public C6205no mo41274k2(int i) {
        long V0;
        long j;
        if (i < 128) {
            mo41230L0(i);
        } else {
            if (i < 2048) {
                ws3 f1 = mo41263f1(2);
                byte[] bArr = f1.f37111a;
                int i2 = f1.f37112b;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                f1.f37112b = i2 + 2;
                V0 = mo41244V0();
                j = 2;
            } else if (55296 <= i && 57343 >= i) {
                mo41230L0(63);
            } else if (i < 65536) {
                ws3 f12 = mo41263f1(3);
                byte[] bArr2 = f12.f37111a;
                int i3 = f12.f37112b;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                f12.f37112b = i3 + 3;
                V0 = mo41244V0();
                j = 3;
            } else if (i <= 1114111) {
                ws3 f13 = mo41263f1(4);
                byte[] bArr3 = f13.f37111a;
                int i4 = f13.f37112b;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                f13.f37112b = i4 + 4;
                V0 = mo41244V0();
                j = 4;
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + C5950l.m55178n(i));
            }
            mo41237P0(V0 + j);
        }
        return this;
    }

    /* renamed from: c */
    public final void mo41255c() {
        mo31670F1(mo41244V0());
    }

    /* renamed from: c0 */
    public final C5301fr mo41256c0(String str, C5301fr frVar) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(frVar.mo31162O(), str));
            ws3 ws3 = this.f32655a;
            if (ws3 != null) {
                byte[] bArr = ws3.f37111a;
                int i = ws3.f37108a;
                instance.update(bArr, i, ws3.f37112b - i);
                ws3 ws32 = ws3.f37109a;
                while (true) {
                    jt1.m53774m(ws32);
                    if (ws32 == ws3) {
                        break;
                    }
                    byte[] bArr2 = ws32.f37111a;
                    int i2 = ws32.f37108a;
                    instance.update(bArr2, i2, ws32.f37112b - i2);
                    ws32 = ws32.f37109a;
                }
            }
            byte[] doFinal = instance.doFinal();
            jt1.m53776o(doFinal, "mac.doFinal()");
            return new C5301fr(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @vr2
    /* renamed from: c1 */
    public final C5301fr mo41257c1(int i) {
        if (i == 0) {
            return C5301fr.f28634a;
        }
        C5950l.m55169e(mo41244V0(), 0, (long) i);
        ws3 ws3 = this.f32655a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            jt1.m53774m(ws3);
            int i5 = ws3.f37112b;
            int i6 = ws3.f37108a;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                ws3 = ws3.f37109a;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        ws3 ws32 = this.f32655a;
        int i7 = 0;
        while (i2 < i) {
            jt1.m53774m(ws32);
            bArr[i7] = ws32.f37111a;
            i2 += ws32.f37112b - ws32.f37108a;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = ws32.f37108a;
            ws32.f37110a = true;
            i7++;
            ws32 = ws32.f37109a;
        }
        return new at3(bArr, iArr);
    }

    public void close() {
    }

    @vr2
    /* renamed from: d */
    public C6205no clone() {
        return mo41265h();
    }

    @vr2
    /* renamed from: e */
    public C6205no mo31682e() {
        return this;
    }

    @vr2
    /* renamed from: e0 */
    public final C5301fr mo41260e0(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "key");
        return mo41256c0("HmacSHA1", frVar);
    }

    /* renamed from: e2 */
    public void mo31683e2(@vr2 C6205no noVar, long j) throws EOFException {
        jt1.m53777p(noVar, "sink");
        if (mo41244V0() >= j) {
            noVar.write(this, j);
        } else {
            noVar.write(this, mo41244V0());
            throw new EOFException();
        }
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@com.onedelhi.secure.ss2 java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = 1
            goto L_0x0082
        L_0x000b:
            boolean r4 = r1 instanceof com.onedelhi.secure.C6205no
            if (r4 != 0) goto L_0x0011
            goto L_0x0082
        L_0x0011:
            long r4 = r20.mo41244V0()
            com.onedelhi.secure.no r1 = (com.onedelhi.secure.C6205no) r1
            long r6 = r1.mo41244V0()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0020
            goto L_0x0082
        L_0x0020:
            long r4 = r20.mo41244V0()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x002b
            goto L_0x0008
        L_0x002b:
            com.onedelhi.secure.ws3 r4 = r0.f32655a
            com.onedelhi.secure.jt1.m53774m(r4)
            com.onedelhi.secure.ws3 r1 = r1.f32655a
            com.onedelhi.secure.jt1.m53774m(r1)
            int r5 = r4.f37108a
            int r8 = r1.f37108a
            r9 = r6
        L_0x003a:
            long r11 = r20.mo41244V0()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0008
            int r11 = r4.f37112b
            int r11 = r11 - r5
            int r12 = r1.f37112b
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x006a
            byte[] r15 = r4.f37111a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f37111a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0061
            goto L_0x0082
        L_0x0061:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x004e
        L_0x006a:
            int r13 = r4.f37112b
            if (r5 != r13) goto L_0x0075
            com.onedelhi.secure.ws3 r4 = r4.f37109a
            com.onedelhi.secure.jt1.m53774m(r4)
            int r5 = r4.f37108a
        L_0x0075:
            int r13 = r1.f37112b
            if (r8 != r13) goto L_0x0080
            com.onedelhi.secure.ws3 r1 = r1.f37109a
            com.onedelhi.secure.jt1.m53774m(r1)
            int r8 = r1.f37108a
        L_0x0080:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6205no.equals(java.lang.Object):boolean");
    }

    @vr2
    /* renamed from: f */
    public C6205no mo31684f() {
        return this;
    }

    @vr2
    /* renamed from: f1 */
    public final ws3 mo41263f1(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            ws3 ws3 = this.f32655a;
            if (ws3 == null) {
                ws3 e = zs3.m74280e();
                this.f32655a = e;
                e.f37113b = e;
                e.f37109a = e;
                return e;
            }
            jt1.m53774m(ws3);
            ws3 ws32 = ws3.f37113b;
            jt1.m53774m(ws32);
            return (ws32.f37112b + i > 8192 || !ws32.f37114b) ? ws32.mo46874c(zs3.m74280e()) : ws32;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: f2 */
    public boolean mo31685f2() {
        return this.f32656b == 0;
    }

    public void flush() {
    }

    /* renamed from: g */
    public final long mo41264g() {
        long V0 = mo41244V0();
        if (V0 == 0) {
            return 0;
        }
        ws3 ws3 = this.f32655a;
        jt1.m53774m(ws3);
        ws3 ws32 = ws3.f37113b;
        jt1.m53774m(ws32);
        int i = ws32.f37112b;
        if (i < 8192 && ws32.f37114b) {
            V0 -= (long) (i - ws32.f37108a);
        }
        return V0;
    }

    @vr2
    /* renamed from: h */
    public final C6205no mo41265h() {
        C6205no noVar = new C6205no();
        if (mo41244V0() != 0) {
            ws3 ws3 = this.f32655a;
            jt1.m53774m(ws3);
            ws3 d = ws3.mo46875d();
            noVar.f32655a = d;
            d.f37113b = d;
            d.f37109a = d;
            for (ws3 ws32 = ws3.f37109a; ws32 != ws3; ws32 = ws32.f37109a) {
                ws3 ws33 = d.f37113b;
                jt1.m53774m(ws33);
                jt1.m53774m(ws32);
                ws33.mo46874c(ws32.mo46875d());
            }
            noVar.mo41237P0(mo41244V0());
        }
        return noVar;
    }

    @vr2
    /* renamed from: h1 */
    public C6205no mo41287s(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "byteString");
        frVar.mo31180w0(this, 0, frVar.mo36274j0());
        return this;
    }

    public int hashCode() {
        ws3 ws3 = this.f32655a;
        if (ws3 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ws3.f37112b;
            for (int i3 = ws3.f37108a; i3 < i2; i3++) {
                i = (i * 31) + ws3.f37111a[i3];
            }
            ws3 = ws3.f37109a;
            jt1.m53774m(ws3);
        } while (ws3 != this.f32655a);
        return i;
    }

    /* renamed from: i */
    public long mo31686i(byte b) {
        return mo31708s0(b, 0, Long.MAX_VALUE);
    }

    @vr2
    /* renamed from: i1 */
    public C6205no mo41290u(@vr2 C5301fr frVar, int i, int i2) {
        jt1.m53777p(frVar, "byteString");
        frVar.mo31180w0(this, i, i2);
        return this;
    }

    public boolean isOpen() {
        return true;
    }

    @vr2
    /* renamed from: j */
    public String mo31688j() {
        return mo31714z2(this.f32656b, C5604hx.f29888a);
    }

    @vr2
    /* renamed from: j0 */
    public final C5301fr mo41272j0(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "key");
        return mo41256c0("HmacSHA256", frVar);
    }

    @vr2
    /* renamed from: j1 */
    public C6205no mo41240R1(@vr2 x04 x04, long j) throws IOException {
        jt1.m53777p(x04, "source");
        while (j > 0) {
            long read = x04.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    /* renamed from: k */
    public long mo31689k(@vr2 C5301fr frVar, long j) {
        long j2;
        int i;
        jt1.m53777p(frVar, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            ws3 ws3 = this.f32655a;
            if (ws3 == null) {
                return -1;
            }
            if (mo41244V0() - j < j) {
                j2 = mo41244V0();
                while (j2 > j) {
                    ws3 = ws3.f37113b;
                    jt1.m53774m(ws3);
                    j2 -= (long) (ws3.f37112b - ws3.f37108a);
                }
                if (frVar.mo36274j0() == 2) {
                    byte y = frVar.mo36284y(0);
                    byte y2 = frVar.mo36284y(1);
                    while (j2 < mo41244V0()) {
                        byte[] bArr = ws3.f37111a;
                        i = (int) ((((long) ws3.f37108a) + j) - j2);
                        int i2 = ws3.f37112b;
                        while (i < i2) {
                            byte b = bArr[i];
                            if (!(b == y || b == y2)) {
                                i++;
                            }
                        }
                        j2 += (long) (ws3.f37112b - ws3.f37108a);
                        ws3 = ws3.f37109a;
                        jt1.m53774m(ws3);
                        j = j2;
                    }
                    return -1;
                }
                byte[] O = frVar.mo31162O();
                while (j2 < mo41244V0()) {
                    byte[] bArr2 = ws3.f37111a;
                    int i3 = (int) ((((long) ws3.f37108a) + j) - j2);
                    int i4 = ws3.f37112b;
                    while (i < i4) {
                        byte b2 = bArr2[i];
                        int length = O.length;
                        int i5 = 0;
                        while (i5 < length) {
                            if (b2 != O[i5]) {
                                i5++;
                            }
                        }
                        i3 = i + 1;
                    }
                    j2 += (long) (ws3.f37112b - ws3.f37108a);
                    ws3 = ws3.f37109a;
                    jt1.m53774m(ws3);
                    j = j2;
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (ws3.f37112b - ws3.f37108a)) + j3;
                if (j4 > j) {
                    break;
                }
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                j3 = j4;
            }
            if (frVar.mo36274j0() == 2) {
                byte y3 = frVar.mo36284y(0);
                byte y4 = frVar.mo36284y(1);
                while (j2 < mo41244V0()) {
                    byte[] bArr3 = ws3.f37111a;
                    int i6 = (int) ((((long) ws3.f37108a) + j) - j2);
                    int i7 = ws3.f37112b;
                    while (i < i7) {
                        byte b3 = bArr3[i];
                        if (!(b3 == y3 || b3 == y4)) {
                            i6 = i + 1;
                        }
                    }
                    j3 = j2 + ((long) (ws3.f37112b - ws3.f37108a));
                    ws3 = ws3.f37109a;
                    jt1.m53774m(ws3);
                    j = j3;
                }
                return -1;
            }
            byte[] O2 = frVar.mo31162O();
            while (j2 < mo41244V0()) {
                byte[] bArr4 = ws3.f37111a;
                int i8 = (int) ((((long) ws3.f37108a) + j) - j2);
                int i9 = ws3.f37112b;
                while (i < i9) {
                    byte b4 = bArr4[i];
                    int length2 = O2.length;
                    int i10 = 0;
                    while (i10 < length2) {
                        if (b4 != O2[i10]) {
                            i10++;
                        }
                    }
                    i8 = i + 1;
                }
                j3 = j2 + ((long) (ws3.f37112b - ws3.f37108a));
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                j = j3;
            }
            return -1;
            return ((long) (i - ws3.f37108a)) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    /* renamed from: k0 */
    public boolean mo31690k0(long j, @vr2 C5301fr frVar, int i, int i2) {
        jt1.m53777p(frVar, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || mo41244V0() - j < ((long) i2) || frVar.mo36274j0() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo41249Z(((long) i3) + j) != frVar.mo36284y(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @vr2
    /* renamed from: k1 */
    public byte[] mo31691k1(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (mo41244V0() >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @vr2
    /* renamed from: l */
    public final C6205no mo41275l(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "out");
        return mo41278m(noVar, j, this.f32656b - j);
    }

    @vr2
    /* renamed from: l0 */
    public final C5301fr mo41276l0(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "key");
        return mo41256c0("HmacSHA512", frVar);
    }

    @vr2
    /* renamed from: l1 */
    public C6205no mo41221D2(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "source");
        return mo41266h0(bArr, 0, bArr.length);
    }

    @vr2
    /* renamed from: m */
    public final C6205no mo41278m(@vr2 C6205no noVar, long j, long j2) {
        jt1.m53777p(noVar, "out");
        C5950l.m55169e(mo41244V0(), j, j2);
        if (j2 != 0) {
            noVar.mo41237P0(noVar.mo41244V0() + j2);
            ws3 ws3 = this.f32655a;
            while (true) {
                jt1.m53774m(ws3);
                int i = ws3.f37112b;
                int i2 = ws3.f37108a;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                ws3 = ws3.f37109a;
            }
            while (j2 > 0) {
                jt1.m53774m(ws3);
                ws3 d = ws3.mo46875d();
                int i3 = d.f37108a + ((int) j);
                d.f37108a = i3;
                d.f37112b = Math.min(i3 + ((int) j2), d.f37112b);
                ws3 ws32 = noVar.f32655a;
                if (ws32 == null) {
                    d.f37113b = d;
                    d.f37109a = d;
                    noVar.f32655a = d;
                } else {
                    jt1.m53774m(ws32);
                    ws3 ws33 = ws32.f37113b;
                    jt1.m53774m(ws33);
                    ws33.mo46874c(d);
                }
                j2 -= (long) (d.f37112b - d.f37108a);
                ws3 = ws3.f37109a;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: m0 */
    public int mo31692m0(@vr2 yw2 yw2) {
        jt1.m53777p(yw2, "options");
        int e0 = C6467po.m61505e0(this, yw2, false, 2, (Object) null);
        if (e0 == -1) {
            return -1;
        }
        mo31670F1((long) yw2.mo48022i()[e0].mo36274j0());
        return e0;
    }

    /* renamed from: n1 */
    public int mo31693n1() throws EOFException {
        return C5950l.m55172h(readInt());
    }

    /* renamed from: o */
    public void mo31694o(long j) throws EOFException {
        if (this.f32656b < j) {
            throw new EOFException();
        }
    }

    @vr2
    /* renamed from: o0 */
    public final C5301fr mo41280o0() {
        return mo41232M("MD5");
    }

    @vw1
    @vr2
    /* renamed from: p */
    public final C6205no mo41281p(@vr2 OutputStream outputStream) throws IOException {
        return m58318K(this, outputStream, 0, 0, 6, (Object) null);
    }

    @vw1
    @vr2
    /* renamed from: p0 */
    public final C6206a mo41282p0() {
        return m58321u0(this, (C6206a) null, 1, (Object) null);
    }

    @vr2
    /* renamed from: p1 */
    public C6205no mo41266h0(@vr2 byte[] bArr, int i, int i2) {
        jt1.m53777p(bArr, "source");
        long j = (long) i2;
        C5950l.m55169e((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            ws3 f1 = mo41263f1(1);
            int min = Math.min(i3 - i, 8192 - f1.f37112b);
            int i4 = i + min;
            C7458za.m72840W0(bArr, f1.f37111a, f1.f37112b, i, i4);
            f1.f37112b += min;
            i = i4;
        }
        mo41237P0(mo41244V0() + j);
        return this;
    }

    @vw1
    @vr2
    /* renamed from: q */
    public final C6205no mo41284q(@vr2 OutputStream outputStream, long j) throws IOException {
        return m58318K(this, outputStream, j, 0, 4, (Object) null);
    }

    @vw1
    @vr2
    /* renamed from: q0 */
    public final C6206a mo41285q0(@vr2 C6206a aVar) {
        jt1.m53777p(aVar, "unsafeCursor");
        if (aVar.f32657a == null) {
            aVar.f32657a = this;
            aVar.f32661b = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    /* renamed from: q1 */
    public long mo31695q1(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "targetBytes");
        return mo31689k(frVar, 0);
    }

    @vr2
    /* renamed from: r */
    public InputStream mo31696r() {
        return new C6207b(this);
    }

    @vr2
    /* renamed from: r0 */
    public C5301fr mo31697r0() {
        return mo31672I(mo41244V0());
    }

    @vr2
    /* renamed from: r1 */
    public String mo31698r1(long j) throws EOFException {
        return mo31714z2(j, C5604hx.f29888a);
    }

    @vr2
    /* renamed from: r2 */
    public String mo31699r2() throws EOFException {
        return mo31678X0(Long.MAX_VALUE);
    }

    public int read(@vr2 ByteBuffer byteBuffer) throws IOException {
        jt1.m53777p(byteBuffer, "sink");
        ws3 ws3 = this.f32655a;
        if (ws3 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), ws3.f37112b - ws3.f37108a);
        byteBuffer.put(ws3.f37111a, ws3.f37108a, min);
        int i = ws3.f37108a + min;
        ws3.f37108a = i;
        this.f32656b -= (long) min;
        if (i == ws3.f37112b) {
            this.f32655a = ws3.mo46873b();
            zs3.m74279d(ws3);
        }
        return min;
    }

    public int read(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    public int read(@vr2 byte[] bArr, int i, int i2) {
        jt1.m53777p(bArr, "sink");
        C5950l.m55169e((long) bArr.length, (long) i, (long) i2);
        ws3 ws3 = this.f32655a;
        if (ws3 == null) {
            return -1;
        }
        int min = Math.min(i2, ws3.f37112b - ws3.f37108a);
        byte[] bArr2 = ws3.f37111a;
        int i3 = ws3.f37108a;
        C7458za.m72840W0(bArr2, bArr, i, i3, i3 + min);
        ws3.f37108a += min;
        mo41237P0(mo41244V0() - ((long) min));
        if (ws3.f37108a != ws3.f37112b) {
            return min;
        }
        this.f32655a = ws3.mo46873b();
        zs3.m74279d(ws3);
        return min;
    }

    public long read(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (mo41244V0() == 0) {
            return -1;
        } else {
            if (j > mo41244V0()) {
                j = mo41244V0();
            }
            noVar.write(this, j);
            return j;
        }
    }

    public byte readByte() throws EOFException {
        if (mo41244V0() != 0) {
            ws3 ws3 = this.f32655a;
            jt1.m53774m(ws3);
            int i = ws3.f37108a;
            int i2 = ws3.f37112b;
            int i3 = i + 1;
            byte b = ws3.f37111a[i];
            mo41237P0(mo41244V0() - 1);
            if (i3 == i2) {
                this.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            } else {
                ws3.f37108a = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public void readFully(@vr2 byte[] bArr) throws EOFException {
        jt1.m53777p(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() throws EOFException {
        if (mo41244V0() >= 4) {
            ws3 ws3 = this.f32655a;
            jt1.m53774m(ws3);
            int i = ws3.f37108a;
            int i2 = ws3.f37112b;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = ws3.f37111a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            mo41237P0(mo41244V0() - 4);
            if (i6 == i2) {
                this.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            } else {
                ws3.f37108a = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public long readLong() throws EOFException {
        if (mo41244V0() >= 8) {
            ws3 ws3 = this.f32655a;
            jt1.m53774m(ws3);
            int i = ws3.f37108a;
            int i2 = ws3.f37112b;
            if (((long) (i2 - i)) < 8) {
                return ((((long) readInt()) & ZipConstants.ZIP64_MAGIC) << 32) | (ZipConstants.ZIP64_MAGIC & ((long) readInt()));
            }
            byte[] bArr = ws3.f37111a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40);
            int i6 = i5 + 1;
            long j2 = ((((long) bArr[i5]) & 255) << 32) | j;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j3 = j2 | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j4 = j3 | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            mo41237P0(mo41244V0() - 8);
            if (i10 == i2) {
                this.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            } else {
                ws3.f37108a = i10;
            }
            return j4;
        }
        throw new EOFException();
    }

    public short readShort() throws EOFException {
        if (mo41244V0() >= 2) {
            ws3 ws3 = this.f32655a;
            jt1.m53774m(ws3);
            int i = ws3.f37108a;
            int i2 = ws3.f37112b;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = ws3.f37111a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            mo41237P0(mo41244V0() - 2);
            if (i4 == i2) {
                this.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            } else {
                ws3.f37108a = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    /* renamed from: s0 */
    public long mo31708s0(byte b, long j, long j2) {
        ws3 ws3;
        long j3;
        int i;
        long j4 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > mo41244V0()) {
                j2 = mo41244V0();
            }
            if (j == j2 || (ws3 = this.f32655a) == null) {
                return -1;
            }
            if (mo41244V0() - j < j) {
                j3 = mo41244V0();
                while (j3 > j) {
                    ws3 = ws3.f37113b;
                    jt1.m53774m(ws3);
                    j3 -= (long) (ws3.f37112b - ws3.f37108a);
                }
                while (j3 < j2) {
                    byte[] bArr = ws3.f37111a;
                    int min = (int) Math.min((long) ws3.f37112b, (((long) ws3.f37108a) + j2) - j3);
                    i = (int) ((((long) ws3.f37108a) + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += (long) (ws3.f37112b - ws3.f37108a);
                    ws3 = ws3.f37109a;
                    jt1.m53774m(ws3);
                    j = j3;
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (ws3.f37112b - ws3.f37108a)) + j4;
                if (j5 > j) {
                    break;
                }
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                j4 = j5;
            }
            while (j3 < j2) {
                byte[] bArr2 = ws3.f37111a;
                int min2 = (int) Math.min((long) ws3.f37112b, (((long) ws3.f37108a) + j2) - j3);
                int i2 = (int) ((((long) ws3.f37108a) + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i2 = i + 1;
                    }
                }
                j4 = j3 + ((long) (ws3.f37112b - ws3.f37108a));
                ws3 = ws3.f37109a;
                jt1.m53774m(ws3);
                j = j4;
            }
            return -1;
            return ((long) (i - ws3.f37108a)) + j3;
        }
        throw new IllegalArgumentException(("size=" + mo41244V0() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    @vr2
    /* renamed from: s1 */
    public C6205no mo41230L0(int i) {
        ws3 f1 = mo41263f1(1);
        byte[] bArr = f1.f37111a;
        int i2 = f1.f37112b;
        f1.f37112b = i2 + 1;
        bArr[i2] = (byte) i;
        mo41237P0(mo41244V0() + 1);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        if (r8 != r9) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        r15.f32655a = r6.mo46873b();
        com.onedelhi.secure.zs3.m74279d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r6.f37108a = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        if (r1 != false) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f A[SYNTHETIC] */
    /* renamed from: s2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo31709s2() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.mo41244V0()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b8
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000d:
            com.onedelhi.secure.ws3 r6 = r15.f32655a
            com.onedelhi.secure.jt1.m53774m(r6)
            byte[] r7 = r6.f37111a
            int r8 = r6.f37108a
            int r9 = r6.f37112b
        L_0x0018:
            if (r8 >= r9) goto L_0x009a
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0029
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0029
            int r11 = r10 - r11
            goto L_0x0043
        L_0x0029:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0038
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0038
        L_0x0033:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0043
        L_0x0038:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x007b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x007b
            goto L_0x0033
        L_0x0043:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0053
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0053:
            com.onedelhi.secure.no r0 = new com.onedelhi.secure.no
            r0.<init>()
            com.onedelhi.secure.no r0 = r0.mo41261e1(r4)
            com.onedelhi.secure.no r0 = r0.mo41230L0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo31688j()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x007b:
            if (r0 == 0) goto L_0x007f
            r1 = 1
            goto L_0x009a
        L_0x007f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = com.onedelhi.secure.C5950l.m55177m(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009a:
            if (r8 != r9) goto L_0x00a6
            com.onedelhi.secure.ws3 r7 = r6.mo46873b()
            r15.f32655a = r7
            com.onedelhi.secure.zs3.m74279d(r6)
            goto L_0x00a8
        L_0x00a6:
            r6.f37108a = r8
        L_0x00a8:
            if (r1 != 0) goto L_0x00ae
            com.onedelhi.secure.ws3 r6 = r15.f32655a
            if (r6 != 0) goto L_0x000d
        L_0x00ae:
            long r1 = r15.mo41244V0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.mo41237P0(r1)
            return r4
        L_0x00b8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6205no.mo31709s2():long");
    }

    @vr2
    /* renamed from: t */
    public C6893to mo31710t() {
        return gu2.m49835d(new b13(this));
    }

    /* renamed from: t1 */
    public short mo31711t1() throws EOFException {
        return C5950l.m55174j(readShort());
    }

    @vr2
    public me4 timeout() {
        return me4.f32090a;
    }

    @vr2
    public String toString() {
        return mo41253b1().toString();
    }

    @vr2
    /* renamed from: u2 */
    public byte[] mo31713u2() {
        return mo31691k1(mo41244V0());
    }

    @vr2
    /* renamed from: w1 */
    public C6205no mo41242S1(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return mo41230L0(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo41279n("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < C4564ak.f25870a ? j < eg3.f27898b ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < zv0.f38454a ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        ws3 f1 = mo41263f1(i2);
        byte[] bArr = f1.f37111a;
        int i3 = f1.f37112b + i2;
        while (j != 0) {
            long j2 = (long) 10;
            i3--;
            bArr[i3] = C6467po.m61495Z()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        f1.f37112b += i2;
        mo41237P0(mo41244V0() + ((long) i2));
        return this;
    }

    public int write(@vr2 ByteBuffer byteBuffer) throws IOException {
        jt1.m53777p(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            ws3 f1 = mo41263f1(1);
            int min = Math.min(i, 8192 - f1.f37112b);
            byteBuffer.get(f1.f37111a, f1.f37112b, min);
            i -= min;
            f1.f37112b += min;
        }
        this.f32656b += (long) remaining;
        return remaining;
    }

    public void write(@vr2 C6205no noVar, long j) {
        ws3 ws3;
        jt1.m53777p(noVar, "source");
        if (noVar != this) {
            C5950l.m55169e(noVar.mo41244V0(), 0, j);
            while (j > 0) {
                ws3 ws32 = noVar.f32655a;
                jt1.m53774m(ws32);
                int i = ws32.f37112b;
                ws3 ws33 = noVar.f32655a;
                jt1.m53774m(ws33);
                if (j < ((long) (i - ws33.f37108a))) {
                    ws3 ws34 = this.f32655a;
                    if (ws34 != null) {
                        jt1.m53774m(ws34);
                        ws3 = ws34.f37113b;
                    } else {
                        ws3 = null;
                    }
                    if (ws3 != null && ws3.f37114b) {
                        if ((((long) ws3.f37112b) + j) - ((long) (ws3.f37110a ? 0 : ws3.f37108a)) <= ((long) 8192)) {
                            ws3 ws35 = noVar.f32655a;
                            jt1.m53774m(ws35);
                            ws35.mo46878g(ws3, (int) j);
                            noVar.mo41237P0(noVar.mo41244V0() - j);
                            mo41237P0(mo41244V0() + j);
                            return;
                        }
                    }
                    ws3 ws36 = noVar.f32655a;
                    jt1.m53774m(ws36);
                    noVar.f32655a = ws36.mo46876e((int) j);
                }
                ws3 ws37 = noVar.f32655a;
                jt1.m53774m(ws37);
                long j2 = (long) (ws37.f37112b - ws37.f37108a);
                noVar.f32655a = ws37.mo46873b();
                ws3 ws38 = this.f32655a;
                if (ws38 == null) {
                    this.f32655a = ws37;
                    ws37.f37113b = ws37;
                    ws37.f37109a = ws37;
                } else {
                    jt1.m53774m(ws38);
                    ws3 ws39 = ws38.f37113b;
                    jt1.m53774m(ws39);
                    ws39.mo46874c(ws37).mo46872a();
                }
                noVar.mo41237P0(noVar.mo41244V0() - j2);
                mo41237P0(mo41244V0() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @vr2
    /* renamed from: z1 */
    public C6205no mo41261e1(long j) {
        if (j == 0) {
            return mo41230L0(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        ws3 f1 = mo41263f1(i);
        byte[] bArr = f1.f37111a;
        int i2 = f1.f37112b;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C6467po.m61495Z()[(int) (15 & j)];
            j >>>= 4;
        }
        f1.f37112b += i;
        mo41237P0(mo41244V0() + ((long) i));
        return this;
    }

    @vr2
    /* renamed from: z2 */
    public String mo31714z2(long j, @vr2 Charset charset) throws EOFException {
        jt1.m53777p(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f32656b < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            ws3 ws3 = this.f32655a;
            jt1.m53774m(ws3);
            int i2 = ws3.f37108a;
            if (((long) i2) + j > ((long) ws3.f37112b)) {
                return new String(mo31691k1(j), charset);
            }
            int i3 = (int) j;
            String str = new String(ws3.f37111a, i2, i3, charset);
            int i4 = ws3.f37108a + i3;
            ws3.f37108a = i4;
            this.f32656b -= j;
            if (i4 == ws3.f37112b) {
                this.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            }
            return str;
        }
    }
}
