package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public interface mg1 {

    /* renamed from: a */
    public static final int f16089a = 0;

    /* renamed from: b */
    public static final int f16090b = 1;

    /* renamed from: c */
    public static final int f16091c = 2;

    /* renamed from: d */
    public static final int f16092d = 3;

    /* renamed from: e */
    public static final int f16093e = 0;

    /* renamed from: com.onedelhi.secure.mg1$a */
    public interface C2858a {
        /* renamed from: a */
        void mo19545a(@mr2 Bitmap bitmap);

        /* renamed from: b */
        void mo19546b(@mr2 int[] iArr);

        @mr2
        /* renamed from: c */
        byte[] mo19547c(int i);

        @mr2
        /* renamed from: d */
        Bitmap mo19548d(int i, int i2, @mr2 Bitmap.Config config);

        @mr2
        /* renamed from: e */
        int[] mo19549e(int i);

        /* renamed from: f */
        void mo19550f(@mr2 byte[] bArr);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.mg1$b */
    public @interface C2859b {
    }

    /* renamed from: A1 */
    int mo20332A1();

    @Deprecated
    /* renamed from: B1 */
    int mo20333B1();

    /* renamed from: C1 */
    int mo20334C1(int i);

    @mr2
    /* renamed from: D1 */
    ByteBuffer mo20335D1();

    /* renamed from: E1 */
    void mo20336E1(@mr2 vg1 vg1, @mr2 ByteBuffer byteBuffer);

    /* renamed from: F1 */
    int mo20337F1();

    void clear();

    int getHeight();

    int getWidth();

    /* renamed from: o1 */
    int mo20341o1();

    /* renamed from: p1 */
    int mo20342p1();

    /* renamed from: q1 */
    int mo20343q1();

    /* renamed from: r1 */
    void mo20344r1(@mr2 vg1 vg1, @mr2 ByteBuffer byteBuffer, int i);

    int read(@ts2 byte[] bArr);

    /* renamed from: s1 */
    void mo20346s1(@mr2 vg1 vg1, @mr2 byte[] bArr);

    /* renamed from: t1 */
    void mo20347t1();

    /* renamed from: u1 */
    void mo20348u1();

    @ts2
    /* renamed from: v1 */
    Bitmap mo20349v1();

    /* renamed from: w1 */
    int mo20350w1();

    /* renamed from: x1 */
    int mo20351x1();

    /* renamed from: y1 */
    void mo20352y1(@mr2 Bitmap.Config config);

    /* renamed from: z1 */
    int mo20353z1(@ts2 InputStream inputStream, int i);
}
