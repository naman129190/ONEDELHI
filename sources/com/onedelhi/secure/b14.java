package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;

public class b14 {

    /* renamed from: a */
    public int f26094a;

    /* renamed from: a */
    public Rect f26095a;

    /* renamed from: a */
    public jf3 f26096a;

    /* renamed from: a */
    public boolean f26097a;

    /* renamed from: b */
    public int f26098b;

    /* renamed from: c */
    public int f26099c = 1;

    public b14(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f26096a = new jf3(bArr, i, i2);
        this.f26098b = i4;
        this.f26094a = i3;
        if (i * i2 > bArr.length) {
            throw new IllegalArgumentException("Image data does not match the resolution. " + i + "x" + i2 + " > " + bArr.length);
        }
    }

    /* renamed from: a */
    public j23 mo31330a() {
        jf3 a = this.f26096a.mo38620h(this.f26098b).mo38616a(this.f26095a, this.f26099c);
        return new j23(a.mo38617b(), a.mo38619d(), a.mo38618c(), 0, 0, a.mo38619d(), a.mo38618c(), false);
    }

    /* renamed from: b */
    public Bitmap mo31331b() {
        return mo31332c(1);
    }

    /* renamed from: c */
    public Bitmap mo31332c(int i) {
        return mo31333d(this.f26095a, i);
    }

    /* renamed from: d */
    public Bitmap mo31333d(Rect rect, int i) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f26096a.mo38619d(), this.f26096a.mo38618c());
        } else if (mo31341l()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f26096a.mo38617b(), this.f26094a, this.f26096a.mo38619d(), this.f26096a.mo38618c(), (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f26098b == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) this.f26098b);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    /* renamed from: e */
    public Rect mo31334e() {
        return this.f26095a;
    }

    /* renamed from: f */
    public byte[] mo31335f() {
        return this.f26096a.mo38617b();
    }

    /* renamed from: g */
    public int mo31336g() {
        return this.f26096a.mo38618c();
    }

    /* renamed from: h */
    public int mo31337h() {
        return this.f26096a.mo38619d();
    }

    /* renamed from: i */
    public int mo31338i() {
        return this.f26094a;
    }

    /* renamed from: j */
    public int mo31339j() {
        return this.f26099c;
    }

    /* renamed from: k */
    public boolean mo31340k() {
        return this.f26097a;
    }

    /* renamed from: l */
    public boolean mo31341l() {
        return this.f26098b % 180 != 0;
    }

    /* renamed from: m */
    public void mo31342m(Rect rect) {
        this.f26095a = rect;
    }

    /* renamed from: n */
    public void mo31343n(boolean z) {
        this.f26097a = z;
    }

    /* renamed from: o */
    public void mo31344o(int i) {
        this.f26099c = i;
    }

    /* renamed from: p */
    public sl3 mo31345p(sl3 sl3) {
        float c = (sl3.mo44403c() * ((float) this.f26099c)) + ((float) this.f26095a.left);
        float d = (sl3.mo44404d() * ((float) this.f26099c)) + ((float) this.f26095a.top);
        if (this.f26097a) {
            c = ((float) this.f26096a.mo38619d()) - c;
        }
        return new sl3(c, d);
    }
}
