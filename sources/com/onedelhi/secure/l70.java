package com.onedelhi.secure;

import android.content.ContentValues;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lcom/onedelhi/secure/ey2;", "", "", "pairs", "Landroid/content/ContentValues;", "a", "([Lcom/onedelhi/secure/ey2;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class l70 {
    @vr2
    /* renamed from: a */
    public static final ContentValues m20242a(@vr2 ey2<String, ? extends Object>... ey2Arr) {
        jt1.m53777p(ey2Arr, "pairs");
        ContentValues contentValues = new ContentValues(ey2Arr.length);
        for (ey2<String, ? extends Object> ey2 : ey2Arr) {
            String a = ey2.mo35665a();
            Object b = ey2.mo35666b();
            if (b == null) {
                contentValues.putNull(a);
            } else if (b instanceof String) {
                contentValues.put(a, (String) b);
            } else if (b instanceof Integer) {
                contentValues.put(a, (Integer) b);
            } else if (b instanceof Long) {
                contentValues.put(a, (Long) b);
            } else if (b instanceof Boolean) {
                contentValues.put(a, (Boolean) b);
            } else if (b instanceof Float) {
                contentValues.put(a, (Float) b);
            } else if (b instanceof Double) {
                contentValues.put(a, (Double) b);
            } else if (b instanceof byte[]) {
                contentValues.put(a, (byte[]) b);
            } else if (b instanceof Byte) {
                contentValues.put(a, (Byte) b);
            } else if (b instanceof Short) {
                contentValues.put(a, (Short) b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + tk4.f35693a);
            }
        }
        return contentValues;
    }
}
