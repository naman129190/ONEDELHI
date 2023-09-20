package com.onedelhi.secure;

import com.onedelhi.secure.C7403z0;
import com.onedelhi.secure.yh2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.e1 */
public abstract class C5070e1<MessageType extends yh2> implements cz2<MessageType> {

    /* renamed from: a */
    public static final zy0 f27666a = zy0.m74393d();

    /* renamed from: A */
    public final MessageType mo34745A(MessageType messagetype) throws nt1 {
        if (messagetype == null || messagetype.mo43347N1()) {
            return messagetype;
        }
        throw mo34746B(messagetype).mo43961a().mo41485l(messagetype);
    }

    /* renamed from: B */
    public final rn4 mo34746B(MessageType messagetype) {
        return messagetype instanceof C7403z0 ? ((C7403z0) messagetype).mo48081jh() : new rn4((yh2) messagetype);
    }

    /* renamed from: C */
    public MessageType mo34020t(InputStream inputStream) throws nt1 {
        return mo34011k(inputStream, f27666a);
    }

    /* renamed from: D */
    public MessageType mo34011k(InputStream inputStream, zy0 zy0) throws nt1 {
        return mo34745A(mo34003c(inputStream, zy0));
    }

    /* renamed from: E */
    public MessageType mo34018r(C5173er erVar) throws nt1 {
        return mo34002b(erVar, f27666a);
    }

    /* renamed from: F */
    public MessageType mo34002b(C5173er erVar, zy0 zy0) throws nt1 {
        return mo34745A(mo34005e(erVar, zy0));
    }

    /* renamed from: G */
    public MessageType mo34016p(g00 g00) throws nt1 {
        return mo34008h(g00, f27666a);
    }

    /* renamed from: H */
    public MessageType mo34008h(g00 g00, zy0 zy0) throws nt1 {
        return mo34745A((yh2) mo34004d(g00, zy0));
    }

    /* renamed from: I */
    public MessageType mo34009i(InputStream inputStream) throws nt1 {
        return mo34026z(inputStream, f27666a);
    }

    /* renamed from: J */
    public MessageType mo34026z(InputStream inputStream, zy0 zy0) throws nt1 {
        return mo34745A(mo34024x(inputStream, zy0));
    }

    /* renamed from: K */
    public MessageType mo34006f(ByteBuffer byteBuffer) throws nt1 {
        return mo34017q(byteBuffer, f27666a);
    }

    /* renamed from: L */
    public MessageType mo34017q(ByteBuffer byteBuffer, zy0 zy0) throws nt1 {
        yh2 yh2;
        try {
            g00 n = g00.m48674n(byteBuffer);
            yh2 = (yh2) mo34004d(n, zy0);
            n.mo36435a(0);
            return mo34745A(yh2);
        } catch (nt1 e) {
            throw e.mo41485l(yh2);
        } catch (nt1 e2) {
            throw e2;
        }
    }

    /* renamed from: M */
    public MessageType mo34001a(byte[] bArr) throws nt1 {
        return mo34019s(bArr, f27666a);
    }

    /* renamed from: N */
    public MessageType mo34025y(byte[] bArr, int i, int i2) throws nt1 {
        return mo34022v(bArr, i, i2, f27666a);
    }

    /* renamed from: O */
    public MessageType mo34022v(byte[] bArr, int i, int i2, zy0 zy0) throws nt1 {
        return mo34745A(mo34021u(bArr, i, i2, zy0));
    }

    /* renamed from: P */
    public MessageType mo34019s(byte[] bArr, zy0 zy0) throws nt1 {
        return mo34022v(bArr, 0, bArr.length, zy0);
    }

    /* renamed from: Q */
    public MessageType mo34013m(InputStream inputStream) throws nt1 {
        return mo34003c(inputStream, f27666a);
    }

    /* renamed from: R */
    public MessageType mo34003c(InputStream inputStream, zy0 zy0) throws nt1 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return mo34024x(new C7403z0.C7404a.C7405a(inputStream, g00.m48666O(read, inputStream)), zy0);
        } catch (IOException e) {
            throw new nt1(e);
        }
    }

    /* renamed from: S */
    public MessageType mo34015o(C5173er erVar) throws nt1 {
        return mo34005e(erVar, f27666a);
    }

    /* renamed from: T */
    public MessageType mo34005e(C5173er erVar, zy0 zy0) throws nt1 {
        MessageType messagetype;
        try {
            g00 L = erVar.mo34537L();
            messagetype = (yh2) mo34004d(L, zy0);
            L.mo36435a(0);
            return messagetype;
        } catch (nt1 e) {
            throw e.mo41485l(messagetype);
        } catch (nt1 e2) {
            throw e2;
        }
    }

    /* renamed from: U */
    public MessageType mo34014n(g00 g00) throws nt1 {
        return (yh2) mo34004d(g00, f27666a);
    }

    /* renamed from: V */
    public MessageType mo34007g(InputStream inputStream) throws nt1 {
        return mo34024x(inputStream, f27666a);
    }

    /* renamed from: W */
    public MessageType mo34024x(InputStream inputStream, zy0 zy0) throws nt1 {
        g00 j = g00.m48670j(inputStream);
        MessageType messagetype = (yh2) mo34004d(j, zy0);
        try {
            j.mo36435a(0);
            return messagetype;
        } catch (nt1 e) {
            throw e.mo41485l(messagetype);
        }
    }

    /* renamed from: X */
    public MessageType mo34010j(byte[] bArr) throws nt1 {
        return mo34021u(bArr, 0, bArr.length, f27666a);
    }

    /* renamed from: Y */
    public MessageType mo34023w(byte[] bArr, int i, int i2) throws nt1 {
        return mo34021u(bArr, i, i2, f27666a);
    }

    /* renamed from: Z */
    public MessageType mo34021u(byte[] bArr, int i, int i2, zy0 zy0) throws nt1 {
        MessageType messagetype;
        try {
            g00 q = g00.m48677q(bArr, i, i2);
            messagetype = (yh2) mo34004d(q, zy0);
            q.mo36435a(0);
            return messagetype;
        } catch (nt1 e) {
            throw e.mo41485l(messagetype);
        } catch (nt1 e2) {
            throw e2;
        }
    }

    /* renamed from: a0 */
    public MessageType mo34012l(byte[] bArr, zy0 zy0) throws nt1 {
        return mo34021u(bArr, 0, bArr.length, zy0);
    }
}
