package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.onedelhi.secure.b70;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class zq1 {

    /* renamed from: a */
    public static final int f23833a = 1;

    /* renamed from: a */
    public static final String f23834a = "InputConnectionCompat";

    /* renamed from: b */
    public static final String f23835b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: c */
    public static final String f23836c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: d */
    public static final String f23837d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: e */
    public static final String f23838e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: f */
    public static final String f23839f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: g */
    public static final String f23840g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: h */
    public static final String f23841h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: i */
    public static final String f23842i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: j */
    public static final String f23843j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: k */
    public static final String f23844k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: l */
    public static final String f23845l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: m */
    public static final String f23846m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: n */
    public static final String f23847n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: o */
    public static final String f23848o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: p */
    public static final String f23849p = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* renamed from: com.onedelhi.secure.zq1$a */
    public class C4115a extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ C4118d f23850a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4115a(InputConnection inputConnection, boolean z, C4118d dVar) {
            super(inputConnection, z);
            this.f23850a = dVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f23850a.mo28064a(ar1.m11373g(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: com.onedelhi.secure.zq1$b */
    public class C4116b extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ C4118d f23851a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4116b(InputConnection inputConnection, boolean z, C4118d dVar) {
            super(inputConnection, z);
            this.f23851a = dVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (zq1.m33316f(str, bundle, this.f23851a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    @sj3(25)
    /* renamed from: com.onedelhi.secure.zq1$c */
    public static class C4117c {
        @pn0
        /* renamed from: a */
        public static boolean m33318a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: com.onedelhi.secure.zq1$d */
    public interface C4118d {
        /* renamed from: a */
        boolean mo28064a(@mr2 ar1 ar1, int i, @ts2 Bundle bundle);
    }

    /* renamed from: b */
    public static boolean m33312b(@mr2 InputConnection inputConnection, @mr2 EditorInfo editorInfo, @mr2 ar1 ar1, int i, @ts2 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25) {
            return C4117c.m33318a(inputConnection, (InputContentInfo) ar1.mo13245f(), i, bundle);
        }
        int e = es0.m13951e(editorInfo);
        boolean z = false;
        if (e == 2) {
            z = true;
        } else if (!(e == 3 || e == 4)) {
            return false;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z ? f23838e : f23837d, ar1.mo13240a());
        bundle2.putParcelable(z ? f23840g : f23839f, ar1.mo13241b());
        bundle2.putParcelable(z ? f23842i : f23841h, ar1.mo13242c());
        bundle2.putInt(z ? f23846m : f23845l, i);
        bundle2.putParcelable(z ? f23844k : f23843j, bundle);
        return inputConnection.performPrivateCommand(z ? f23836c : f23835b, bundle2);
    }

    @mr2
    /* renamed from: c */
    public static C4118d m33313c(@mr2 View view) {
        k43.m19455l(view);
        return new yq1(view);
    }

    @mr2
    /* renamed from: d */
    public static InputConnection m33314d(@mr2 View view, @mr2 InputConnection inputConnection, @mr2 EditorInfo editorInfo) {
        return m33315e(inputConnection, editorInfo, m33313c(view));
    }

    @mr2
    @Deprecated
    /* renamed from: e */
    public static InputConnection m33315e(@mr2 InputConnection inputConnection, @mr2 EditorInfo editorInfo, @mr2 C4118d dVar) {
        ot2.m24060e(inputConnection, "inputConnection must be non-null");
        ot2.m24060e(editorInfo, "editorInfo must be non-null");
        ot2.m24060e(dVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new C4115a(inputConnection, false, dVar) : es0.m13947a(editorInfo).length == 0 ? inputConnection : new C4116b(inputConnection, false, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m33316f(@com.onedelhi.secure.ts2 java.lang.String r7, @com.onedelhi.secure.ts2 android.os.Bundle r8, @com.onedelhi.secure.mr2 com.onedelhi.secure.zq1.C4118d r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x000e
            r7 = 0
            goto L_0x0017
        L_0x000e:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L_0x0081
            r7 = 1
        L_0x0017:
            r1 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x001f
        L_0x001d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x001f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x0079 }
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x002c
        L_0x002a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x002c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x0077 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0037
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x0039
        L_0x0037:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x0039:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x0077 }
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0044
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x0046
        L_0x0044:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x0046:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch:{ all -> 0x0077 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0053
        L_0x0051:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0053:
            int r6 = r8.getInt(r6)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x005c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x005e
        L_0x005c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x005e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ all -> 0x0077 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            com.onedelhi.secure.ar1 r8 = new com.onedelhi.secure.ar1     // Catch:{ all -> 0x0077 }
            r8.<init>(r3, r4, r5)     // Catch:{ all -> 0x0077 }
            boolean r0 = r9.mo28064a(r8, r6, r7)     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.send(r0, r1)
        L_0x0076:
            return r0
        L_0x0077:
            r7 = move-exception
            goto L_0x007b
        L_0x0079:
            r7 = move-exception
            r2 = r1
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.send(r0, r1)
        L_0x0080:
            throw r7
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zq1.m33316f(java.lang.String, android.os.Bundle, com.onedelhi.secure.zq1$d):boolean");
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m33317g(View view, ar1 ar1, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ar1.mo13244e();
                InputContentInfo inputContentInfo = (InputContentInfo) ar1.mo13245f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(f23849p, inputContentInfo);
            } catch (Exception e) {
                Log.w(f23834a, "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        return jt4.m18981m1(view, new b70.C1754b(new ClipData(ar1.mo13241b(), new ClipData.Item(ar1.mo13240a())), 2).mo13495e(ar1.mo13242c()).mo13493c(bundle).mo13491a()) == null;
    }
}
