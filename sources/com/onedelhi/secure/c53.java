package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.util.Log;
import java.io.FileNotFoundException;

public final class c53 {

    /* renamed from: a */
    public static final String f10107a = "PrintHelper";

    /* renamed from: a */
    public static final boolean f10108a;

    /* renamed from: b */
    public static final boolean f10109b;

    /* renamed from: d */
    public static final int f10110d = 3500;

    /* renamed from: e */
    public static final int f10111e = 1;

    /* renamed from: f */
    public static final int f10112f = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: g */
    public static final int f10113g = 1;
    @SuppressLint({"InlinedApi"})

    /* renamed from: h */
    public static final int f10114h = 2;

    /* renamed from: i */
    public static final int f10115i = 1;

    /* renamed from: j */
    public static final int f10116j = 2;

    /* renamed from: a */
    public int f10117a = 2;

    /* renamed from: a */
    public final Context f10118a;

    /* renamed from: a */
    public BitmapFactory.Options f10119a = null;

    /* renamed from: a */
    public final Object f10120a = new Object();

    /* renamed from: b */
    public int f10121b = 2;

    /* renamed from: c */
    public int f10122c = 1;

    /* renamed from: com.onedelhi.secure.c53$a */
    public class C1843a extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: a */
        public final /* synthetic */ int f10123a;

        /* renamed from: a */
        public final /* synthetic */ Bitmap f10124a;

        /* renamed from: a */
        public final /* synthetic */ CancellationSignal f10125a;

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptor f10126a;

        /* renamed from: a */
        public final /* synthetic */ PrintAttributes f10127a;

        /* renamed from: a */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f10128a;

        /* renamed from: b */
        public final /* synthetic */ PrintAttributes f10130b;

        public C1843a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f10125a = cancellationSignal;
            this.f10127a = printAttributes;
            this.f10124a = bitmap;
            this.f10130b = printAttributes2;
            this.f10123a = i;
            this.f10126a = parcelFileDescriptor;
            this.f10128a = writeResultCallback;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00d2 */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Throwable doInBackground(java.lang.Void... r9) {
            /*
                r8 = this;
                android.os.CancellationSignal r9 = r8.f10125a     // Catch:{ all -> 0x00da }
                boolean r9 = r9.isCanceled()     // Catch:{ all -> 0x00da }
                r0 = 0
                if (r9 == 0) goto L_0x000a
                return r0
            L_0x000a:
                android.print.pdf.PrintedPdfDocument r9 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00da }
                com.onedelhi.secure.c53 r1 = com.onedelhi.secure.c53.this     // Catch:{ all -> 0x00da }
                android.content.Context r1 = r1.f10118a     // Catch:{ all -> 0x00da }
                android.print.PrintAttributes r2 = r8.f10127a     // Catch:{ all -> 0x00da }
                r9.<init>(r1, r2)     // Catch:{ all -> 0x00da }
                android.graphics.Bitmap r1 = r8.f10124a     // Catch:{ all -> 0x00da }
                android.print.PrintAttributes r2 = r8.f10127a     // Catch:{ all -> 0x00da }
                int r2 = r2.getColorMode()     // Catch:{ all -> 0x00da }
                android.graphics.Bitmap r1 = com.onedelhi.secure.c53.m12304a(r1, r2)     // Catch:{ all -> 0x00da }
                android.os.CancellationSignal r2 = r8.f10125a     // Catch:{ all -> 0x00da }
                boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00da }
                if (r2 == 0) goto L_0x002a
                return r0
            L_0x002a:
                r2 = 1
                android.graphics.pdf.PdfDocument$Page r3 = r9.startPage(r2)     // Catch:{ all -> 0x00c7 }
                boolean r4 = com.onedelhi.secure.c53.f10109b     // Catch:{ all -> 0x00c7 }
                if (r4 == 0) goto L_0x0041
                android.graphics.RectF r2 = new android.graphics.RectF     // Catch:{ all -> 0x00c7 }
                android.graphics.pdf.PdfDocument$PageInfo r5 = r3.getInfo()     // Catch:{ all -> 0x00c7 }
                android.graphics.Rect r5 = r5.getContentRect()     // Catch:{ all -> 0x00c7 }
                r2.<init>(r5)     // Catch:{ all -> 0x00c7 }
                goto L_0x0064
            L_0x0041:
                android.print.pdf.PrintedPdfDocument r5 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00c7 }
                com.onedelhi.secure.c53 r6 = com.onedelhi.secure.c53.this     // Catch:{ all -> 0x00c7 }
                android.content.Context r6 = r6.f10118a     // Catch:{ all -> 0x00c7 }
                android.print.PrintAttributes r7 = r8.f10130b     // Catch:{ all -> 0x00c7 }
                r5.<init>(r6, r7)     // Catch:{ all -> 0x00c7 }
                android.graphics.pdf.PdfDocument$Page r2 = r5.startPage(r2)     // Catch:{ all -> 0x00c7 }
                android.graphics.RectF r6 = new android.graphics.RectF     // Catch:{ all -> 0x00c7 }
                android.graphics.pdf.PdfDocument$PageInfo r7 = r2.getInfo()     // Catch:{ all -> 0x00c7 }
                android.graphics.Rect r7 = r7.getContentRect()     // Catch:{ all -> 0x00c7 }
                r6.<init>(r7)     // Catch:{ all -> 0x00c7 }
                r5.finishPage(r2)     // Catch:{ all -> 0x00c7 }
                r5.close()     // Catch:{ all -> 0x00c7 }
                r2 = r6
            L_0x0064:
                int r5 = r1.getWidth()     // Catch:{ all -> 0x00c7 }
                int r6 = r1.getHeight()     // Catch:{ all -> 0x00c7 }
                int r7 = r8.f10123a     // Catch:{ all -> 0x00c7 }
                android.graphics.Matrix r5 = com.onedelhi.secure.c53.m12306d(r5, r6, r2, r7)     // Catch:{ all -> 0x00c7 }
                if (r4 == 0) goto L_0x0075
                goto L_0x0083
            L_0x0075:
                float r4 = r2.left     // Catch:{ all -> 0x00c7 }
                float r6 = r2.top     // Catch:{ all -> 0x00c7 }
                r5.postTranslate(r4, r6)     // Catch:{ all -> 0x00c7 }
                android.graphics.Canvas r4 = r3.getCanvas()     // Catch:{ all -> 0x00c7 }
                r4.clipRect(r2)     // Catch:{ all -> 0x00c7 }
            L_0x0083:
                android.graphics.Canvas r2 = r3.getCanvas()     // Catch:{ all -> 0x00c7 }
                r2.drawBitmap(r1, r5, r0)     // Catch:{ all -> 0x00c7 }
                r9.finishPage(r3)     // Catch:{ all -> 0x00c7 }
                android.os.CancellationSignal r2 = r8.f10125a     // Catch:{ all -> 0x00c7 }
                boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00c7 }
                if (r2 == 0) goto L_0x00a7
                r9.close()     // Catch:{ all -> 0x00da }
                android.os.ParcelFileDescriptor r9 = r8.f10126a     // Catch:{ all -> 0x00da }
                if (r9 == 0) goto L_0x009f
                r9.close()     // Catch:{ IOException -> 0x009f }
            L_0x009f:
                android.graphics.Bitmap r9 = r8.f10124a     // Catch:{ all -> 0x00da }
                if (r1 == r9) goto L_0x00a6
                r1.recycle()     // Catch:{ all -> 0x00da }
            L_0x00a6:
                return r0
            L_0x00a7:
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c7 }
                android.os.ParcelFileDescriptor r3 = r8.f10126a     // Catch:{ all -> 0x00c7 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x00c7 }
                r2.<init>(r3)     // Catch:{ all -> 0x00c7 }
                r9.writeTo(r2)     // Catch:{ all -> 0x00c7 }
                r9.close()     // Catch:{ all -> 0x00da }
                android.os.ParcelFileDescriptor r9 = r8.f10126a     // Catch:{ all -> 0x00da }
                if (r9 == 0) goto L_0x00bf
                r9.close()     // Catch:{ IOException -> 0x00bf }
            L_0x00bf:
                android.graphics.Bitmap r9 = r8.f10124a     // Catch:{ all -> 0x00da }
                if (r1 == r9) goto L_0x00c6
                r1.recycle()     // Catch:{ all -> 0x00da }
            L_0x00c6:
                return r0
            L_0x00c7:
                r0 = move-exception
                r9.close()     // Catch:{ all -> 0x00da }
                android.os.ParcelFileDescriptor r9 = r8.f10126a     // Catch:{ all -> 0x00da }
                if (r9 == 0) goto L_0x00d2
                r9.close()     // Catch:{ IOException -> 0x00d2 }
            L_0x00d2:
                android.graphics.Bitmap r9 = r8.f10124a     // Catch:{ all -> 0x00da }
                if (r1 == r9) goto L_0x00d9
                r1.recycle()     // Catch:{ all -> 0x00da }
            L_0x00d9:
                throw r0     // Catch:{ all -> 0x00da }
            L_0x00da:
                r9 = move-exception
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.c53.C1843a.doInBackground(java.lang.Void[]):java.lang.Throwable");
        }

        /* renamed from: b */
        public void onPostExecute(Throwable th) {
            if (this.f10125a.isCanceled()) {
                this.f10128a.onWriteCancelled();
            } else if (th == null) {
                this.f10128a.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e(c53.f10107a, "Error writing printed content", th);
                this.f10128a.onWriteFailed((CharSequence) null);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.c53$b */
    public interface C1844b {
        /* renamed from: a */
        void mo13998a();
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.c53$c */
    public class C1845c extends PrintDocumentAdapter {

        /* renamed from: a */
        public final int f10131a;

        /* renamed from: a */
        public final Bitmap f10132a;

        /* renamed from: a */
        public PrintAttributes f10133a;

        /* renamed from: a */
        public final C1844b f10134a;

        /* renamed from: a */
        public final String f10136a;

        public C1845c(String str, int i, Bitmap bitmap, C1844b bVar) {
            this.f10136a = str;
            this.f10131a = i;
            this.f10132a = bitmap;
            this.f10134a = bVar;
        }

        public void onFinish() {
            C1844b bVar = this.f10134a;
            if (bVar != null) {
                bVar.mo13998a();
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f10133a = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f10136a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            c53.this.mo13993r(this.f10133a, this.f10131a, this.f10132a, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.c53$d */
    public class C1846d extends PrintDocumentAdapter {

        /* renamed from: a */
        public final int f10137a;

        /* renamed from: a */
        public Bitmap f10138a = null;

        /* renamed from: a */
        public final Uri f10139a;

        /* renamed from: a */
        public AsyncTask<Uri, Boolean, Bitmap> f10140a;

        /* renamed from: a */
        public PrintAttributes f10141a;

        /* renamed from: a */
        public final C1844b f10142a;

        /* renamed from: a */
        public final String f10144a;

        /* renamed from: com.onedelhi.secure.c53$d$a */
        public class C1847a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: a */
            public final /* synthetic */ CancellationSignal f10145a;

            /* renamed from: a */
            public final /* synthetic */ PrintAttributes f10146a;

            /* renamed from: a */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f10147a;

            /* renamed from: b */
            public final /* synthetic */ PrintAttributes f10149b;

            /* renamed from: com.onedelhi.secure.c53$d$a$a */
            public class C1848a implements CancellationSignal.OnCancelListener {
                public C1848a() {
                }

                public void onCancel() {
                    C1846d.this.mo14002a();
                    C1847a.this.cancel(false);
                }
            }

            public C1847a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f10145a = cancellationSignal;
                this.f10146a = printAttributes;
                this.f10149b = printAttributes2;
                this.f10147a = layoutResultCallback;
            }

            /* renamed from: a */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    C1846d dVar = C1846d.this;
                    return c53.this.mo13985i(dVar.f10139a);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* renamed from: b */
            public void onCancelled(Bitmap bitmap) {
                this.f10147a.onLayoutCancelled();
                C1846d.this.f10140a = null;
            }

            /* renamed from: c */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!c53.f10108a || c53.this.f10122c == 0)) {
                    synchronized (this) {
                        mediaSize = C1846d.this.f10141a.getMediaSize();
                    }
                    if (!(mediaSize == null || mediaSize.isPortrait() == c53.m12307g(bitmap))) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                C1846d.this.f10138a = bitmap;
                if (bitmap != null) {
                    this.f10147a.onLayoutFinished(new PrintDocumentInfo.Builder(C1846d.this.f10144a).setContentType(1).setPageCount(1).build(), true ^ this.f10146a.equals(this.f10149b));
                } else {
                    this.f10147a.onLayoutFailed((CharSequence) null);
                }
                C1846d.this.f10140a = null;
            }

            public void onPreExecute() {
                this.f10145a.setOnCancelListener(new C1848a());
            }
        }

        public C1846d(String str, Uri uri, C1844b bVar, int i) {
            this.f10144a = str;
            this.f10139a = uri;
            this.f10142a = bVar;
            this.f10137a = i;
        }

        /* renamed from: a */
        public void mo14002a() {
            synchronized (c53.this.f10120a) {
                BitmapFactory.Options options = c53.this.f10119a;
                if (options != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        options.requestCancelDecode();
                    }
                    c53.this.f10119a = null;
                }
            }
        }

        public void onFinish() {
            super.onFinish();
            mo14002a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f10140a;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            C1844b bVar = this.f10142a;
            if (bVar != null) {
                bVar.mo13998a();
            }
            Bitmap bitmap = this.f10138a;
            if (bitmap != null) {
                bitmap.recycle();
                this.f10138a = null;
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f10141a = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f10138a != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f10144a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f10140a = new C1847a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            c53.this.mo13993r(this.f10141a, this.f10137a, this.f10138a, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        f10108a = i > 23;
        if (i != 23) {
            z = true;
        }
        f10109b = z;
    }

    public c53(@mr2 Context context) {
        this.f10118a = context;
    }

    /* renamed from: a */
    public static Bitmap m12304a(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    @sj3(19)
    /* renamed from: b */
    public static PrintAttributes.Builder m12305b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (Build.VERSION.SDK_INT >= 23 && printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    /* renamed from: d */
    public static Matrix m12306d(int i, int i2, RectF rectF, int i3) {
        Matrix matrix = new Matrix();
        float f = (float) i;
        float width = rectF.width() / f;
        float max = i3 == 2 ? Math.max(width, rectF.height() / ((float) i2)) : Math.min(width, rectF.height() / ((float) i2));
        matrix.postScale(max, max);
        matrix.postTranslate((rectF.width() - (f * max)) / 2.0f, (rectF.height() - (((float) i2) * max)) / 2.0f);
        return matrix;
    }

    /* renamed from: g */
    public static boolean m12307g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    /* renamed from: q */
    public static boolean m12308q() {
        return true;
    }

    /* renamed from: c */
    public int mo13981c() {
        return this.f10121b;
    }

    /* renamed from: e */
    public int mo13982e() {
        int i = this.f10122c;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: f */
    public int mo13983f() {
        return this.f10117a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[SYNTHETIC, Splitter:B:19:0x0028] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo13984h(android.net.Uri r5, android.graphics.BitmapFactory.Options r6) throws java.io.FileNotFoundException {
        /*
            r4 = this;
            java.lang.String r0 = "close fail "
            java.lang.String r1 = "PrintHelper"
            if (r5 == 0) goto L_0x0031
            android.content.Context r2 = r4.f10118a
            if (r2 == 0) goto L_0x0031
            r3 = 0
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0025 }
            java.io.InputStream r5 = r2.openInputStream(r5)     // Catch:{ all -> 0x0025 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch:{ all -> 0x0022 }
            if (r5 == 0) goto L_0x0021
            r5.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x0021
        L_0x001d:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x0021:
            return r6
        L_0x0022:
            r6 = move-exception
            r3 = r5
            goto L_0x0026
        L_0x0025:
            r6 = move-exception
        L_0x0026:
            if (r3 == 0) goto L_0x0030
            r3.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x0030:
            throw r6
        L_0x0031:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "bad argument to loadBitmap"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.c53.mo13984h(android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: i */
    public Bitmap mo13985i(Uri uri) throws FileNotFoundException {
        BitmapFactory.Options options;
        if (uri == null || this.f10118a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        mo13984h(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int max = Math.max(i, i2);
            int i3 = 1;
            while (max > 3500) {
                max >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                synchronized (this.f10120a) {
                    options = new BitmapFactory.Options();
                    this.f10119a = options;
                    options.inMutable = true;
                    options.inSampleSize = i3;
                }
                try {
                    Bitmap h = mo13984h(uri, options);
                    synchronized (this.f10120a) {
                        this.f10119a = null;
                    }
                    return h;
                } catch (Throwable th) {
                    synchronized (this.f10120a) {
                        this.f10119a = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    public void mo13986j(@mr2 String str, @mr2 Bitmap bitmap) {
        mo13987k(str, bitmap, (C1844b) null);
    }

    /* renamed from: k */
    public void mo13987k(@mr2 String str, @mr2 Bitmap bitmap, @ts2 C1844b bVar) {
        if (bitmap != null) {
            ((PrintManager) this.f10118a.getSystemService("print")).print(str, new C1845c(str, this.f10117a, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(m12307g(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f10121b).build());
        }
    }

    /* renamed from: l */
    public void mo13988l(@mr2 String str, @mr2 Uri uri) throws FileNotFoundException {
        mo13989m(str, uri, (C1844b) null);
    }

    /* renamed from: m */
    public void mo13989m(@mr2 String str, @mr2 Uri uri, @ts2 C1844b bVar) throws FileNotFoundException {
        PrintAttributes.MediaSize mediaSize;
        C1846d dVar = new C1846d(str, uri, bVar, this.f10117a);
        PrintManager printManager = (PrintManager) this.f10118a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f10121b);
        int i = this.f10122c;
        if (i == 1 || i == 0) {
            mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        } else {
            if (i == 2) {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
            }
            printManager.print(str, dVar, builder.build());
        }
        builder.setMediaSize(mediaSize);
        printManager.print(str, dVar, builder.build());
    }

    /* renamed from: n */
    public void mo13990n(int i) {
        this.f10121b = i;
    }

    /* renamed from: o */
    public void mo13991o(int i) {
        this.f10122c = i;
    }

    /* renamed from: p */
    public void mo13992p(int i) {
        this.f10117a = i;
    }

    @sj3(19)
    /* renamed from: r */
    public void mo13993r(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new C1843a(cancellationSignal, f10109b ? printAttributes : m12305b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
