package com.onedelhi.secure;

import com.onedelhi.secure.C5173er;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

public final class wq2 extends C5173er.C5182i {

    /* renamed from: a */
    public final ByteBuffer f37087a;

    /* renamed from: com.onedelhi.secure.wq2$a */
    public class C7176a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f37089a;

        public C7176a() {
            this.f37089a = wq2.this.f37087a.slice();
        }

        public int available() throws IOException {
            return this.f37089a.remaining();
        }

        public void mark(int i) {
            this.f37089a.mark();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() throws IOException {
            if (!this.f37089a.hasRemaining()) {
                return -1;
            }
            return this.f37089a.get() & 255;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f37089a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, this.f37089a.remaining());
            this.f37089a.get(bArr, i, min);
            return min;
        }

        public void reset() throws IOException {
            try {
                this.f37089a.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }
    }

    public wq2(ByteBuffer byteBuffer) {
        vs1.m68433e(byteBuffer, "buffer");
        this.f37087a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    /* renamed from: A */
    public void mo34528A(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.f37087a.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    /* renamed from: A0 */
    public final void mo46820A0(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    /* renamed from: B0 */
    public final ByteBuffer mo46821B0(int i, int i2) {
        if (i < this.f37087a.position() || i2 > this.f37087a.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        ByteBuffer slice = this.f37087a.slice();
        slice.position(i - this.f37087a.position());
        slice.limit(i2 - this.f37087a.position());
        return slice;
    }

    /* renamed from: D */
    public byte mo34530D(int i) {
        return mo34545i(i);
    }

    /* renamed from: D0 */
    public final Object mo46822D0() {
        return C5173er.m47132s(this.f37087a.slice());
    }

    /* renamed from: G */
    public boolean mo34533G() {
        return hq4.m50770s(this.f37087a);
    }

    /* renamed from: L */
    public g00 mo34537L() {
        return g00.m48675o(this.f37087a, true);
    }

    /* renamed from: N */
    public InputStream mo34538N() {
        return new C7176a();
    }

    /* renamed from: Q */
    public int mo34539Q(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f37087a.get(i4);
        }
        return i;
    }

    /* renamed from: R */
    public int mo34540R(int i, int i2, int i3) {
        return hq4.m50773v(i, this.f37087a, i2, i3 + i2);
    }

    /* renamed from: b0 */
    public C5173er mo34541b0(int i, int i2) {
        try {
            return new wq2(mo46821B0(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* renamed from: e */
    public ByteBuffer mo34542e() {
        return this.f37087a.asReadOnlyBuffer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5173er)) {
            return false;
        }
        C5173er erVar = (C5173er) obj;
        if (size() != erVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof wq2 ? this.f37087a.equals(((wq2) obj).f37087a) : obj instanceof dn3 ? obj.equals(this) : this.f37087a.equals(erVar.mo34542e());
    }

    /* renamed from: f */
    public List<ByteBuffer> mo34544f() {
        return Collections.singletonList(mo34542e());
    }

    /* renamed from: i */
    public byte mo34545i(int i) {
        try {
            return this.f37087a.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* renamed from: i0 */
    public String mo34546i0(Charset charset) {
        int i;
        int i2;
        byte[] bArr;
        if (this.f37087a.hasArray()) {
            bArr = this.f37087a.array();
            i2 = this.f37087a.arrayOffset() + this.f37087a.position();
            i = this.f37087a.remaining();
        } else {
            bArr = mo35538d0();
            i2 = 0;
            i = bArr.length;
        }
        return new String(bArr, i2, i, charset);
    }

    /* renamed from: s0 */
    public void mo34548s0(C4589ar arVar) throws IOException {
        arVar.mo31115W(this.f37087a.slice());
    }

    public int size() {
        return this.f37087a.remaining();
    }

    /* renamed from: t0 */
    public void mo34550t0(OutputStream outputStream) throws IOException {
        outputStream.write(mo35538d0());
    }

    /* renamed from: w0 */
    public void mo34551w0(OutputStream outputStream, int i, int i2) throws IOException {
        if (this.f37087a.hasArray()) {
            outputStream.write(this.f37087a.array(), this.f37087a.arrayOffset() + this.f37087a.position() + i, i2);
            return;
        }
        C7175wq.m69538h(mo46821B0(i, i2 + i), outputStream);
    }

    /* renamed from: x */
    public void mo34552x(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f37087a.slice());
    }

    /* renamed from: y0 */
    public boolean mo35562y0(C5173er erVar, int i, int i2) {
        return mo34541b0(0, i2).equals(erVar.mo34541b0(i, i2 + i));
    }
}
