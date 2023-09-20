package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH&J\b\u0010 \u001a\u00020\u001fH&J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001fH&J\u0010\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001fH&J \u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011H&J\u0018\u0010&\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020'H&J\b\u0010*\u001a\u00020)H&J\u0010\u0010+\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u0007H&J\n\u0010,\u001a\u0004\u0018\u00010)H&J\b\u0010-\u001a\u00020)H&J\u0010\u0010/\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0007H&J\b\u00100\u001a\u00020\u0011H&J\u0010\u00103\u001a\u00020)2\u0006\u00102\u001a\u000201H&J\u0018\u00104\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00102\u001a\u000201H&J\u0010\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020\fH&J\u0018\u00108\u001a\u00020\u00072\u0006\u00105\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0007H&J \u0010:\u001a\u00020\u00072\u0006\u00105\u001a\u00020\f2\u0006\u00107\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H&J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0019H&J\u0018\u0010=\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0007H&J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0019H&J\u0018\u0010@\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0007H&J\u0018\u0010A\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0019H&J(\u0010C\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011H&J\b\u0010D\u001a\u00020\u0000H&J\b\u0010F\u001a\u00020EH&R\u0014\u0010I\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/onedelhi/secure/to;", "Lcom/onedelhi/secure/x04;", "Ljava/nio/channels/ReadableByteChannel;", "Lcom/onedelhi/secure/no;", "f", "", "f2", "", "byteCount", "Lcom/onedelhi/secure/un4;", "o", "T", "", "readByte", "", "readShort", "t1", "", "readInt", "n1", "readLong", "Y1", "b0", "s2", "F1", "Lcom/onedelhi/secure/fr;", "r0", "I", "Lcom/onedelhi/secure/yw2;", "options", "m0", "", "u2", "k1", "sink", "read", "readFully", "offset", "e2", "Lcom/onedelhi/secure/oz3;", "B", "", "j", "r1", "K0", "r2", "limit", "X0", "D0", "Ljava/nio/charset/Charset;", "charset", "H2", "z2", "b", "i", "fromIndex", "I0", "toIndex", "s0", "bytes", "N1", "a0", "targetBytes", "q1", "k", "O", "bytesOffset", "k0", "t", "Ljava/io/InputStream;", "r", "e", "()Lcom/onedelhi/secure/no;", "buffer", "okio"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.to */
public interface C6893to extends x04, ReadableByteChannel {
    /* renamed from: B */
    long mo31668B(@vr2 oz3 oz3) throws IOException;

    /* renamed from: D0 */
    int mo31669D0() throws IOException;

    /* renamed from: F1 */
    void mo31670F1(long j) throws IOException;

    @vr2
    /* renamed from: H2 */
    String mo31671H2(@vr2 Charset charset) throws IOException;

    @vr2
    /* renamed from: I */
    C5301fr mo31672I(long j) throws IOException;

    /* renamed from: I0 */
    long mo31673I0(byte b, long j) throws IOException;

    @ss2
    /* renamed from: K0 */
    String mo31674K0() throws IOException;

    /* renamed from: N1 */
    long mo31675N1(@vr2 C5301fr frVar) throws IOException;

    /* renamed from: O */
    boolean mo31676O(long j, @vr2 C5301fr frVar) throws IOException;

    /* renamed from: T */
    boolean mo31677T(long j) throws IOException;

    @vr2
    /* renamed from: X0 */
    String mo31678X0(long j) throws IOException;

    /* renamed from: Y1 */
    long mo31679Y1() throws IOException;

    /* renamed from: a0 */
    long mo31680a0(@vr2 C5301fr frVar, long j) throws IOException;

    /* renamed from: b0 */
    long mo31681b0() throws IOException;

    @vr2
    /* renamed from: e */
    C6205no mo31682e();

    /* renamed from: e2 */
    void mo31683e2(@vr2 C6205no noVar, long j) throws IOException;

    @vr2
    @xj0(level = ak0.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @oi3(expression = "buffer", imports = {}))
    /* renamed from: f */
    C6205no mo31684f();

    /* renamed from: f2 */
    boolean mo31685f2() throws IOException;

    /* renamed from: i */
    long mo31686i(byte b) throws IOException;

    @vr2
    /* renamed from: j */
    String mo31688j() throws IOException;

    /* renamed from: k */
    long mo31689k(@vr2 C5301fr frVar, long j) throws IOException;

    /* renamed from: k0 */
    boolean mo31690k0(long j, @vr2 C5301fr frVar, int i, int i2) throws IOException;

    @vr2
    /* renamed from: k1 */
    byte[] mo31691k1(long j) throws IOException;

    /* renamed from: m0 */
    int mo31692m0(@vr2 yw2 yw2) throws IOException;

    /* renamed from: n1 */
    int mo31693n1() throws IOException;

    /* renamed from: o */
    void mo31694o(long j) throws IOException;

    /* renamed from: q1 */
    long mo31695q1(@vr2 C5301fr frVar) throws IOException;

    @vr2
    /* renamed from: r */
    InputStream mo31696r();

    @vr2
    /* renamed from: r0 */
    C5301fr mo31697r0() throws IOException;

    @vr2
    /* renamed from: r1 */
    String mo31698r1(long j) throws IOException;

    @vr2
    /* renamed from: r2 */
    String mo31699r2() throws IOException;

    int read(@vr2 byte[] bArr) throws IOException;

    int read(@vr2 byte[] bArr, int i, int i2) throws IOException;

    byte readByte() throws IOException;

    void readFully(@vr2 byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    /* renamed from: s0 */
    long mo31708s0(byte b, long j, long j2) throws IOException;

    /* renamed from: s2 */
    long mo31709s2() throws IOException;

    @vr2
    /* renamed from: t */
    C6893to mo31710t();

    /* renamed from: t1 */
    short mo31711t1() throws IOException;

    @vr2
    /* renamed from: u2 */
    byte[] mo31713u2() throws IOException;

    @vr2
    /* renamed from: z2 */
    String mo31714z2(long j, @vr2 Charset charset) throws IOException;
}
