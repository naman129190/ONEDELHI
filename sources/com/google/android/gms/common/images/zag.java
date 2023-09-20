package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.z45;

public abstract class zag {
    public final zad zaa;
    public int zab = 0;

    public zag(Uri uri, int i) {
        this.zaa = new zad(uri);
        this.zab = i;
    }

    public abstract void zaa(@ts2 Drawable drawable, boolean z, boolean z2, boolean z3);

    public final void zab(Context context, z45 z45, boolean z) {
        int i = this.zab;
        zaa(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    public final void zac(Context context, Bitmap bitmap, boolean z) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
