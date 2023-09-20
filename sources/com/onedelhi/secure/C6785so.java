package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH&J \u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0011H&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H&J \u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\bH&J\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH&J(\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\bH&J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\bH&J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\bH&J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0011H&J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0011H&J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0011H&J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0011H&J\b\u0010,\u001a\u00020+H&J\b\u0010-\u001a\u00020\u0000H&J\b\u0010.\u001a\u00020\u0000H&J\b\u00100\u001a\u00020/H&R\u0014\u00103\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/onedelhi/secure/so;", "Lcom/onedelhi/secure/oz3;", "Ljava/nio/channels/WritableByteChannel;", "Lcom/onedelhi/secure/no;", "f", "Lcom/onedelhi/secure/fr;", "byteString", "s", "", "offset", "byteCount", "u", "", "source", "D2", "h0", "Lcom/onedelhi/secure/x04;", "", "N", "R1", "", "string", "n", "beginIndex", "endIndex", "W0", "codePoint", "k2", "Ljava/nio/charset/Charset;", "charset", "z", "J2", "b", "L0", "V", "u1", "i", "w0", "h2", "v", "B0", "S1", "e1", "Lcom/onedelhi/secure/un4;", "flush", "C", "y2", "Ljava/io/OutputStream;", "F", "e", "()Lcom/onedelhi/secure/no;", "buffer", "okio"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.so */
public interface C6785so extends oz3, WritableByteChannel {
    @vr2
    /* renamed from: B0 */
    C6785so mo41215B0(long j) throws IOException;

    @vr2
    /* renamed from: C */
    C6785so mo41217C() throws IOException;

    @vr2
    /* renamed from: D2 */
    C6785so mo41221D2(@vr2 byte[] bArr) throws IOException;

    @vr2
    /* renamed from: F */
    OutputStream mo41223F();

    @vr2
    /* renamed from: J2 */
    C6785so mo41229J2(@vr2 String str, int i, int i2, @vr2 Charset charset) throws IOException;

    @vr2
    /* renamed from: L0 */
    C6785so mo41230L0(int i) throws IOException;

    /* renamed from: N */
    long mo41235N(@vr2 x04 x04) throws IOException;

    @vr2
    /* renamed from: R1 */
    C6785so mo41240R1(@vr2 x04 x04, long j) throws IOException;

    @vr2
    /* renamed from: S1 */
    C6785so mo41242S1(long j) throws IOException;

    @vr2
    /* renamed from: V */
    C6785so mo41243V(int i) throws IOException;

    @vr2
    /* renamed from: W0 */
    C6785so mo41246W0(@vr2 String str, int i, int i2) throws IOException;

    @vr2
    /* renamed from: e */
    C6205no mo31682e();

    @vr2
    /* renamed from: e1 */
    C6785so mo41261e1(long j) throws IOException;

    @vr2
    @xj0(level = ak0.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @oi3(expression = "buffer", imports = {}))
    /* renamed from: f */
    C6205no mo31684f();

    void flush() throws IOException;

    @vr2
    /* renamed from: h0 */
    C6785so mo41266h0(@vr2 byte[] bArr, int i, int i2) throws IOException;

    @vr2
    /* renamed from: h2 */
    C6785so mo41268h2(int i) throws IOException;

    @vr2
    /* renamed from: k2 */
    C6785so mo41274k2(int i) throws IOException;

    @vr2
    /* renamed from: n */
    C6785so mo41279n(@vr2 String str) throws IOException;

    @vr2
    /* renamed from: s */
    C6785so mo41287s(@vr2 C5301fr frVar) throws IOException;

    @vr2
    /* renamed from: u */
    C6785so mo41290u(@vr2 C5301fr frVar, int i, int i2) throws IOException;

    @vr2
    /* renamed from: u1 */
    C6785so mo41291u1(int i) throws IOException;

    @vr2
    /* renamed from: v */
    C6785so mo41292v(long j) throws IOException;

    @vr2
    /* renamed from: w0 */
    C6785so mo41293w0(int i) throws IOException;

    @vr2
    /* renamed from: y2 */
    C6785so mo41296y2() throws IOException;

    @vr2
    /* renamed from: z */
    C6785so mo41297z(@vr2 String str, @vr2 Charset charset) throws IOException;
}
