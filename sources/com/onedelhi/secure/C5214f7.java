package com.onedelhi.secure;

import android.content.ContentResolver;
import android.provider.Settings;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
/* renamed from: com.onedelhi.secure.f7 */
public class C5214f7 {

    /* renamed from: a */
    public static float f28185a = 1.0f;

    @hw4
    /* renamed from: b */
    public static void m47587b(float f) {
        f28185a = f;
    }

    /* renamed from: a */
    public float mo35784a(@mr2 ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
