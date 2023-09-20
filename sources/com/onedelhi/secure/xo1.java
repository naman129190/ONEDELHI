package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import java.io.IOException;

@sj3(api = 28)
public abstract class xo1<T> implements ik3<ImageDecoder.Source, T> {

    /* renamed from: a */
    public static final String f22691a = "ImageDecoder";

    /* renamed from: a */
    public final gk1 f22692a = gk1.m15888d();

    /* renamed from: com.onedelhi.secure.xo1$a */
    public class C3938a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        public final /* synthetic */ int f22693a;

        /* renamed from: a */
        public final /* synthetic */ lf0 f22694a;

        /* renamed from: a */
        public final /* synthetic */ no0 f22695a;

        /* renamed from: a */
        public final /* synthetic */ q43 f22696a;

        /* renamed from: a */
        public final /* synthetic */ boolean f22698a;

        /* renamed from: b */
        public final /* synthetic */ int f22699b;

        /* renamed from: com.onedelhi.secure.xo1$a$a */
        public class C3939a implements ImageDecoder.OnPartialImageListener {
            public C3939a() {
            }

            public boolean onPartialImage(@mr2 ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C3938a(int i, int i2, boolean z, lf0 lf0, no0 no0, q43 q43) {
            this.f22693a = i;
            this.f22699b = i2;
            this.f22698a = z;
            this.f22694a = lf0;
            this.f22695a = no0;
            this.f22696a = q43;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (xo1.this.f22692a.mo16690g(this.f22693a, this.f22699b, this.f22698a, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f22694a == lf0.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C3939a());
            Size size = imageInfo.getSize();
            int i = this.f22693a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.f22699b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b = this.f22695a.mo21387b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b);
            int round2 = Math.round(((float) size.getHeight()) * b);
            if (Log.isLoggable(xo1.f22691a, 2)) {
                Log.v(xo1.f22691a, "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f22696a == q43.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i3 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    /* renamed from: c */
    public abstract ck3<T> mo15226c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @ts2
    /* renamed from: d */
    public final ck3<T> mo14336a(@mr2 ImageDecoder.Source source, int i, int i2, @mr2 zw2 zw2) throws IOException {
        lf0 lf0 = (lf0) zw2.mo28148c(oo0.f18036a);
        no0 no0 = (no0) zw2.mo28148c(no0.f17493a);
        ow2 ow2 = oo0.f18046e;
        return mo15226c(source, i, i2, new C3938a(i, i2, zw2.mo28148c(ow2) != null && ((Boolean) zw2.mo28148c(ow2)).booleanValue(), lf0, no0, (q43) zw2.mo28148c(oo0.f18040b)));
    }

    /* renamed from: e */
    public final boolean mo14337b(@mr2 ImageDecoder.Source source, @mr2 zw2 zw2) {
        return true;
    }
}
