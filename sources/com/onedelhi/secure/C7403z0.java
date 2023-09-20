package com.onedelhi.secure;

import com.onedelhi.secure.C5173er;
import com.onedelhi.secure.C7403z0;
import com.onedelhi.secure.C7403z0.C7404a;
import com.onedelhi.secure.yh2;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.onedelhi.secure.z0 */
public abstract class C7403z0<MessageType extends C7403z0<MessageType, BuilderType>, BuilderType extends C7404a<MessageType, BuilderType>> implements yh2 {
    public int memoizedHashCode = 0;

    /* renamed from: com.onedelhi.secure.z0$a */
    public static abstract class C7404a<MessageType extends C7403z0<MessageType, BuilderType>, BuilderType extends C7404a<MessageType, BuilderType>> implements yh2.C7362a {

        /* renamed from: com.onedelhi.secure.z0$a$a */
        public static final class C7405a extends FilterInputStream {

            /* renamed from: n */
            public int f38152n;

            public C7405a(InputStream inputStream, int i) {
                super(inputStream);
                this.f38152n = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.f38152n);
            }

            public int read() throws IOException {
                if (this.f38152n <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f38152n--;
                }
                return read;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f38152n;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f38152n -= read;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f38152n));
                if (skip >= 0) {
                    this.f38152n = (int) (((long) this.f38152n) - skip);
                }
                return skip;
            }
        }

        @Deprecated
        /* renamed from: bj */
        public static <T> void m72423bj(Iterable<T> iterable, Collection<? super T> collection) {
            m72424cj(iterable, (List) collection);
        }

        /* renamed from: cj */
        public static <T> void m72424cj(Iterable<T> iterable, List<? super T> list) {
            vs1.m68432d(iterable);
            if (iterable instanceof n22) {
                List<?> b1 = ((n22) iterable).mo36160b1();
                n22 n22 = (n22) list;
                int size = list.size();
                for (Object next : b1) {
                    if (next == null) {
                        String str = "Element at index " + (n22.size() - size) + " is null.";
                        for (int size2 = n22.size() - 1; size2 >= size; size2--) {
                            n22.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C5173er) {
                        n22.mo36157M((C5173er) next);
                    } else {
                        n22.add((String) next);
                    }
                }
            } else if (iterable instanceof x43) {
                list.addAll((Collection) iterable);
            } else {
                m72425dj(iterable, list);
            }
        }

        /* renamed from: dj */
        public static <T> void m72425dj(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        /* renamed from: sj */
        public static rn4 m72426sj(yh2 yh2) {
            return new rn4(yh2);
        }

        /* renamed from: d6 */
        public boolean mo47815d6(InputStream inputStream, zy0 zy0) throws IOException {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mo47813Rf(new C7405a(inputStream, g00.m48666O(read, inputStream)), zy0);
            return true;
        }

        /* renamed from: di */
        public boolean mo47816di(InputStream inputStream) throws IOException {
            return mo47815d6(inputStream, zy0.m74393d());
        }

        /* renamed from: ej */
        public abstract BuilderType clone();

        /* renamed from: fj */
        public final String mo48082fj(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        /* renamed from: gj */
        public abstract BuilderType mo43384gj(MessageType messagetype);

        /* renamed from: hj */
        public BuilderType mo47817h3(C5173er erVar) throws nt1 {
            try {
                g00 L = erVar.mo34537L();
                mo47820u4(L);
                L.mo36435a(0);
                return this;
            } catch (nt1 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(mo48082fj("ByteString"), e2);
            }
        }

        /* renamed from: ij */
        public BuilderType mo47812Je(C5173er erVar, zy0 zy0) throws nt1 {
            try {
                g00 L = erVar.mo34537L();
                mo43380Z7(L, zy0);
                L.mo36435a(0);
                return this;
            } catch (nt1 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(mo48082fj("ByteString"), e2);
            }
        }

        /* renamed from: jj */
        public BuilderType mo47820u4(g00 g00) throws IOException {
            return mo43380Z7(g00, zy0.m74393d());
        }

        /* renamed from: kj */
        public abstract BuilderType mo43380Z7(g00 g00, zy0 zy0) throws IOException;

        /* renamed from: lj */
        public BuilderType mo47818ia(yh2 yh2) {
            if (mo43344Dd().getClass().isInstance(yh2)) {
                return mo43384gj((C7403z0) yh2);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        /* renamed from: mj */
        public BuilderType mo47811I8(InputStream inputStream) throws IOException {
            g00 j = g00.m48670j(inputStream);
            mo47820u4(j);
            j.mo36435a(0);
            return this;
        }

        /* renamed from: nj */
        public BuilderType mo47813Rf(InputStream inputStream, zy0 zy0) throws IOException {
            g00 j = g00.m48670j(inputStream);
            mo43380Z7(j, zy0);
            j.mo36435a(0);
            return this;
        }

        /* renamed from: oj */
        public BuilderType mo47814a9(byte[] bArr) throws nt1 {
            return mo43385ki(bArr, 0, bArr.length);
        }

        /* renamed from: pj */
        public BuilderType mo43385ki(byte[] bArr, int i, int i2) throws nt1 {
            try {
                g00 q = g00.m48677q(bArr, i, i2);
                mo47820u4(q);
                q.mo36435a(0);
                return this;
            } catch (nt1 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(mo48082fj("byte array"), e2);
            }
        }

        /* renamed from: qj */
        public BuilderType mo43378Qg(byte[] bArr, int i, int i2, zy0 zy0) throws nt1 {
            try {
                g00 q = g00.m48677q(bArr, i, i2);
                mo43380Z7(q, zy0);
                q.mo36435a(0);
                return this;
            } catch (nt1 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(mo48082fj("byte array"), e2);
            }
        }

        /* renamed from: rj */
        public BuilderType mo47819q6(byte[] bArr, zy0 zy0) throws nt1 {
            return mo43378Qg(bArr, 0, bArr.length, zy0);
        }
    }

    /* renamed from: com.onedelhi.secure.z0$b */
    public interface C7406b {
        /* renamed from: j */
        int mo48095j();
    }

    /* renamed from: F9 */
    public static void m72411F9(C5173er erVar) throws IllegalArgumentException {
        if (!erVar.mo34533G()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* renamed from: X6 */
    public static <T> void m72412X6(Iterable<T> iterable, List<? super T> list) {
        C7404a.m72424cj(iterable, list);
    }

    @Deprecated
    /* renamed from: l3 */
    public static <T> void m72413l3(Iterable<T> iterable, Collection<? super T> collection) {
        C7404a.m72424cj(iterable, (List) collection);
    }

    /* renamed from: F8 */
    public void mo47807F8(OutputStream outputStream) throws IOException {
        i00 k1 = i00.m51432k1(outputStream, i00.m51397J0(mo43354ed()));
        mo43346Ia(k1);
        k1.mo37770e1();
    }

    /* renamed from: Qe */
    public final String mo48079Qe(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: Yb */
    public int mo48080Yb(xr3 xr3) {
        int wa = mo43365wa();
        if (wa != -1) {
            return wa;
        }
        int e = xr3.mo31766e(this);
        mo43351ai(e);
        return e;
    }

    /* renamed from: ai */
    public void mo43351ai(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b4 */
    public byte[] mo47808b4() {
        try {
            byte[] bArr = new byte[mo43354ed()];
            i00 n1 = i00.m51438n1(bArr);
            mo43346Ia(n1);
            n1.mo37761Z();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(mo48079Qe("byte array"), e);
        }
    }

    /* renamed from: c8 */
    public C5173er mo47809c8() {
        try {
            C5173er.C5181h J = C5173er.m47113J(mo43354ed());
            mo43346Ia(J.mo35561b());
            return J.mo35560a();
        } catch (IOException e) {
            throw new RuntimeException(mo48079Qe("ByteString"), e);
        }
    }

    /* renamed from: jh */
    public rn4 mo48081jh() {
        return new rn4((yh2) this);
    }

    /* renamed from: re */
    public void mo47810re(OutputStream outputStream) throws IOException {
        int ed = mo43354ed();
        i00 k1 = i00.m51432k1(outputStream, i00.m51397J0(i00.m51399L0(ed) + ed));
        k1.mo37762Z1(ed);
        mo43346Ia(k1);
        k1.mo37770e1();
    }

    /* renamed from: wa */
    public int mo43365wa() {
        throw new UnsupportedOperationException();
    }
}
