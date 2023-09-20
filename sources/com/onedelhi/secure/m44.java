package com.onedelhi.secure;

import com.google.gson.internal.bind.TypeAdapters;
import java.io.IOException;
import java.io.Writer;

public final class m44 {

    /* renamed from: com.onedelhi.secure.m44$a */
    public static final class C6089a extends Writer {

        /* renamed from: a */
        public final C6090a f32012a = new C6090a();

        /* renamed from: a */
        public final Appendable f32013a;

        /* renamed from: com.onedelhi.secure.m44$a$a */
        public static class C6090a implements CharSequence {

            /* renamed from: a */
            public char[] f32014a;

            public char charAt(int i) {
                return this.f32014a[i];
            }

            public int length() {
                return this.f32014a.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f32014a, i, i2 - i);
            }
        }

        public C6089a(Appendable appendable) {
            this.f32013a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) throws IOException {
            this.f32013a.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            C6090a aVar = this.f32012a;
            aVar.f32014a = cArr;
            this.f32013a.append(aVar, i, i2 + i);
        }
    }

    public m44() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.onedelhi.secure.qv1((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.onedelhi.secure.ew1((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.onedelhi.secure.rv1.f34755a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.onedelhi.secure.ew1((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.onedelhi.secure.ew1((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: cc2 (r2v4 'e' com.onedelhi.secure.cc2 A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.ov1 m56909a(com.onedelhi.secure.xv1 r2) throws com.onedelhi.secure.tv1 {
        /*
            r2.mo36944q0()     // Catch:{ EOFException -> 0x0024, cc2 -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.onedelhi.secure.cj4<com.onedelhi.secure.ov1> r1 = com.google.gson.internal.bind.TypeAdapters.f25498B     // Catch:{ EOFException -> 0x000d, cc2 -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo30144e(r2)     // Catch:{ EOFException -> 0x000d, cc2 -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.onedelhi.secure.ov1 r2 = (com.onedelhi.secure.ov1) r2     // Catch:{ EOFException -> 0x000d, cc2 -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.onedelhi.secure.ew1 r0 = new com.onedelhi.secure.ew1
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.onedelhi.secure.qv1 r0 = new com.onedelhi.secure.qv1
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.onedelhi.secure.ew1 r0 = new com.onedelhi.secure.ew1
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.onedelhi.secure.rv1 r2 = com.onedelhi.secure.rv1.f34755a
            return r2
        L_0x002b:
            com.onedelhi.secure.ew1 r0 = new com.onedelhi.secure.ew1
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.m44.m56909a(com.onedelhi.secure.xv1):com.onedelhi.secure.ov1");
    }

    /* renamed from: b */
    public static void m56910b(ov1 ov1, lw1 lw1) throws IOException {
        TypeAdapters.f25498B.mo30145i(lw1, ov1);
    }

    /* renamed from: c */
    public static Writer m56911c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C6089a(appendable);
    }
}
