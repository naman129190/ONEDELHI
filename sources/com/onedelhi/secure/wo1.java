package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\f\u001a\u00020\u000b*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\bø\u0001\u0000\u001aU\u0010\u000e\u001a\u00020\r*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u000f"}, d2 = {"Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lcom/onedelhi/secure/iy2;", "name", "info", "source", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "action", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/drawable/Drawable;", "b", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
@SuppressLint({"ClassVerificationFailure"})
public final class wo1 {

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "Lcom/onedelhi/secure/un4;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.wo1$a */
    public static final class C3866a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        public final /* synthetic */ uc1<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, un4> f22232a;

        public C3866a(uc1<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, un4> uc1) {
            this.f22232a = uc1;
        }

        public final void onHeaderDecoded(@vr2 ImageDecoder imageDecoder, @vr2 ImageDecoder.ImageInfo imageInfo, @vr2 ImageDecoder.Source source) {
            jt1.m53777p(imageDecoder, "decoder");
            jt1.m53777p(imageInfo, "info");
            jt1.m53777p(source, "source");
            this.f22232a.mo34871o(imageDecoder, imageInfo, source);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "Lcom/onedelhi/secure/un4;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.wo1$b */
    public static final class C3867b implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        public final /* synthetic */ uc1<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, un4> f22233a;

        public C3867b(uc1<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, un4> uc1) {
            this.f22233a = uc1;
        }

        public final void onHeaderDecoded(@vr2 ImageDecoder imageDecoder, @vr2 ImageDecoder.ImageInfo imageInfo, @vr2 ImageDecoder.Source source) {
            jt1.m53777p(imageDecoder, "decoder");
            jt1.m53777p(imageInfo, "info");
            jt1.m53777p(source, "source");
            this.f22233a.mo34871o(imageDecoder, imageInfo, source);
        }
    }

    @sj3(28)
    @vr2
    /* renamed from: a */
    public static final Bitmap m31006a(@vr2 ImageDecoder.Source source, @vr2 uc1<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, un4> uc1) {
        jt1.m53777p(source, "<this>");
        jt1.m53777p(uc1, "action");
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new C3866a(uc1));
        jt1.m53776o(decodeBitmap, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeBitmap;
    }

    @sj3(28)
    @vr2
    /* renamed from: b */
    public static final Drawable m31007b(@vr2 ImageDecoder.Source source, @vr2 uc1<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, un4> uc1) {
        jt1.m53777p(source, "<this>");
        jt1.m53777p(uc1, "action");
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new C3867b(uc1));
        jt1.m53776o(decodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeDrawable;
    }
}
