package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"", "Lcom/onedelhi/secure/ey2;", "", "", "pairs", "Landroid/os/Bundle;", "b", "([Lcom/onedelhi/secure/ey2;)Landroid/os/Bundle;", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.hq */
public final class C2357hq {
    @vr2
    /* renamed from: a */
    public static final Bundle m16892a() {
        return new Bundle(0);
    }

    @vr2
    /* renamed from: b */
    public static final Bundle m16893b(@vr2 ey2<String, ? extends Object>... ey2Arr) {
        jt1.m53777p(ey2Arr, "pairs");
        Bundle bundle = new Bundle(ey2Arr.length);
        for (ey2<String, ? extends Object> ey2 : ey2Arr) {
            String a = ey2.mo35665a();
            Object b = ey2.mo35666b();
            if (b == null) {
                bundle.putString(a, (String) null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(a, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(a, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(a, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(a, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(a, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(a, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(a, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(a, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(a, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(a, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(a, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(a, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(a, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(a, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(a, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(a, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(a, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(a, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(a, (short[]) b);
            } else {
                if (b instanceof Object[]) {
                    Class<?> componentType = b.getClass().getComponentType();
                    jt1.m53774m(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        bundle.putParcelableArray(a, (Parcelable[]) b);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        bundle.putStringArray(a, (String[]) b);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        bundle.putCharSequenceArray(a, (CharSequence[]) b);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a + tk4.f35693a);
                    }
                } else if (!(b instanceof Serializable)) {
                    if (b instanceof IBinder) {
                        C2069eq.m13939a(bundle, a, (IBinder) b);
                    } else if (b instanceof Size) {
                        C2192fq.m15189a(bundle, a, (Size) b);
                    } else if (b instanceof SizeF) {
                        C2192fq.m15190b(bundle, a, (SizeF) b);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + tk4.f35693a);
                    }
                }
                bundle.putSerializable(a, (Serializable) b);
            }
        }
        return bundle;
    }
}
