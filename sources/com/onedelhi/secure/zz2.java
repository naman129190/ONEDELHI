package com.onedelhi.secure;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

public class zz2<T> extends Property<T, Float> {

    /* renamed from: a */
    public final float f23996a;

    /* renamed from: a */
    public final PathMeasure f23997a;

    /* renamed from: a */
    public final PointF f23998a = new PointF();

    /* renamed from: a */
    public final Property<T, PointF> f23999a;

    /* renamed from: a */
    public final float[] f24000a = new float[2];

    /* renamed from: b */
    public float f24001b;

    public zz2(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f23999a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f23997a = pathMeasure;
        this.f23996a = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f24001b);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f24001b = f.floatValue();
        this.f23997a.getPosTan(this.f23996a * f.floatValue(), this.f24000a, (float[]) null);
        PointF pointF = this.f23998a;
        float[] fArr = this.f24000a;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f23999a.set(t, pointF);
    }
}
