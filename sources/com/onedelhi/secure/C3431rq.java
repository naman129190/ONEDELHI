package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.C1173a;
import com.bumptech.glide.load.C1186a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.onedelhi.secure.mg1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.onedelhi.secure.rq */
public class C3431rq implements ik3<ByteBuffer, ng1> {

    /* renamed from: a */
    public static final String f19968a = "BufferGifDecoder";

    /* renamed from: b */
    public static final C3432a f19969b = new C3432a();

    /* renamed from: b */
    public static final C3433b f19970b = new C3433b();

    /* renamed from: a */
    public final Context f19971a;

    /* renamed from: a */
    public final lg1 f19972a;

    /* renamed from: a */
    public final C3432a f19973a;

    /* renamed from: a */
    public final C3433b f19974a;

    /* renamed from: a */
    public final List<ImageHeaderParser> f19975a;

    @hw4
    /* renamed from: com.onedelhi.secure.rq$a */
    public static class C3432a {
        /* renamed from: a */
        public mg1 mo23980a(mg1.C2858a aVar, vg1 vg1, ByteBuffer byteBuffer, int i) {
            return new o24(aVar, vg1, byteBuffer, i);
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.rq$b */
    public static class C3433b {

        /* renamed from: a */
        public final Queue<wg1> f19976a = oq4.m24018f(0);

        /* renamed from: a */
        public synchronized wg1 mo23981a(ByteBuffer byteBuffer) {
            wg1 poll;
            poll = this.f19976a.poll();
            if (poll == null) {
                poll = new wg1();
            }
            return poll.mo26526q(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void mo23982b(wg1 wg1) {
            wg1.mo26510a();
            this.f19976a.offer(wg1);
        }
    }

    public C3431rq(Context context) {
        this(context, C1173a.m7529e(context).mo7461n().mo19558g(), C1173a.m7529e(context).mo7457h(), C1173a.m7529e(context).mo7456g());
    }

    public C3431rq(Context context, List<ImageHeaderParser> list, C2355hm hmVar, C3131pa paVar) {
        this(context, list, hmVar, paVar, f19970b, f19969b);
    }

    @hw4
    public C3431rq(Context context, List<ImageHeaderParser> list, C2355hm hmVar, C3131pa paVar, C3433b bVar, C3432a aVar) {
        this.f19971a = context.getApplicationContext();
        this.f19975a = list;
        this.f19973a = aVar;
        this.f19972a = new lg1(hmVar, paVar);
        this.f19974a = bVar;
    }

    /* renamed from: e */
    public static int m26885e(vg1 vg1, int i, int i2) {
        int min = Math.min(vg1.mo26051a() / i2, vg1.mo26054d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable(f19968a, 2) && max > 1) {
            Log.v(f19968a, "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + vg1.mo26054d() + "x" + vg1.mo26051a() + "]");
        }
        return max;
    }

    @ts2
    /* renamed from: c */
    public final qg1 mo23977c(ByteBuffer byteBuffer, int i, int i2, wg1 wg1, zw2 zw2) {
        long b = j92.m18214b();
        try {
            vg1 d = wg1.mo26513d();
            if (d.mo26052b() > 0) {
                if (d.mo26053c() == 0) {
                    Bitmap.Config config = zw2.mo28148c(xg1.f22553a) == lf0.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    mg1 a = this.f19973a.mo23980a(this.f19972a, d, byteBuffer, m26885e(d, i, i2));
                    a.mo20352y1(config);
                    a.mo20347t1();
                    Bitmap v1 = a.mo20349v1();
                    if (v1 == null) {
                        if (Log.isLoggable(f19968a, 2)) {
                            Log.v(f19968a, "Decoded GIF from stream in " + j92.m18213a(b));
                        }
                        return null;
                    }
                    qg1 qg1 = new qg1(new ng1(this.f19971a, a, zn4.m33294c(), i, i2, v1));
                    if (Log.isLoggable(f19968a, 2)) {
                        Log.v(f19968a, "Decoded GIF from stream in " + j92.m18213a(b));
                    }
                    return qg1;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable(f19968a, 2)) {
                Log.v(f19968a, "Decoded GIF from stream in " + j92.m18213a(b));
            }
        }
    }

    /* renamed from: d */
    public qg1 mo14336a(@mr2 ByteBuffer byteBuffer, int i, int i2, @mr2 zw2 zw2) {
        wg1 a = this.f19974a.mo23981a(byteBuffer);
        try {
            return mo23977c(byteBuffer, i, i2, a, zw2);
        } finally {
            this.f19974a.mo23982b(a);
        }
    }

    /* renamed from: f */
    public boolean mo14337b(@mr2 ByteBuffer byteBuffer, @mr2 zw2 zw2) throws IOException {
        return !((Boolean) zw2.mo28148c(xg1.f22554b)).booleanValue() && C1186a.m7604f(this.f19975a, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
