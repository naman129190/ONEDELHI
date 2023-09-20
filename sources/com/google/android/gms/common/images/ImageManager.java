package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.onedelhi.secure.g55;
import com.onedelhi.secure.h55;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.z45;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    /* access modifiers changed from: private */
    public static final Object zaa = new Object();
    /* access modifiers changed from: private */
    public static HashSet zab = new HashSet();
    private static ImageManager zac;
    /* access modifiers changed from: private */
    public final Context zad;
    /* access modifiers changed from: private */
    public final Handler zae = new h55(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final ExecutorService zaf = g55.m15529a().mo14530c(4, 2);
    /* access modifiers changed from: private */
    public final z45 zag = new z45();
    /* access modifiers changed from: private */
    public final Map zah = new HashMap();
    /* access modifiers changed from: private */
    public final Map zai = new HashMap();
    /* access modifiers changed from: private */
    public final Map zaj = new HashMap();

    @KeepName
    public final class ImageReceiver extends ResultReceiver {
        private final Uri zab;
        /* access modifiers changed from: private */
        public final ArrayList zac = new ArrayList();

        public ImageReceiver(Uri uri) {
            super(new h55(Looper.getMainLooper()));
            this.zab = uri;
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager imageManager = ImageManager.this;
            imageManager.zaf.execute(new zaa(imageManager, this.zab, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }

        public final void zab(zag zag) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zac.add(zag);
        }

        public final void zac(zag zag) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zac.remove(zag);
        }

        public final void zad() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.zab);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.zad.sendBroadcast(intent);
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(@mr2 Uri uri, @ts2 Drawable drawable, boolean z);
    }

    private ImageManager(Context context, boolean z) {
        this.zad = context.getApplicationContext();
    }

    @mr2
    public static ImageManager create(@mr2 Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    public void loadImage(@mr2 ImageView imageView, int i) {
        zaj(new zae(imageView, i));
    }

    public void loadImage(@mr2 ImageView imageView, @mr2 Uri uri) {
        zaj(new zae(imageView, uri));
    }

    public void loadImage(@mr2 ImageView imageView, @mr2 Uri uri, int i) {
        zae zae2 = new zae(imageView, uri);
        zae2.zab = i;
        zaj(zae2);
    }

    public void loadImage(@mr2 OnImageLoadedListener onImageLoadedListener, @mr2 Uri uri) {
        zaj(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(@mr2 OnImageLoadedListener onImageLoadedListener, @mr2 Uri uri, int i) {
        zaf zaf2 = new zaf(onImageLoadedListener, uri);
        zaf2.zab = i;
        zaj(zaf2);
    }

    public final void zaj(zag zag2) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zab(this, zag2).run();
    }
}
