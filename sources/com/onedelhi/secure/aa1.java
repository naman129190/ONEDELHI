package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ik4;
import com.onedelhi.secure.zk3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;

public class aa1 {
    @Deprecated
    @hl3({hl3.C2354a.f13188c})

    /* renamed from: a */
    public static final int f8920a = -1;
    @Deprecated
    @hl3({hl3.C2354a.f13188c})

    /* renamed from: a */
    public static final String f8921a = "font_results";
    @Deprecated
    @hl3({hl3.C2354a.f13188c})

    /* renamed from: b */
    public static final int f8922b = -2;

    /* renamed from: com.onedelhi.secure.aa1$a */
    public static final class C1673a implements BaseColumns {

        /* renamed from: a */
        public static final int f8923a = 0;

        /* renamed from: a */
        public static final String f8924a = "file_id";

        /* renamed from: b */
        public static final int f8925b = 1;

        /* renamed from: b */
        public static final String f8926b = "font_ttc_index";

        /* renamed from: c */
        public static final int f8927c = 2;

        /* renamed from: c */
        public static final String f8928c = "font_variation_settings";

        /* renamed from: d */
        public static final int f8929d = 3;

        /* renamed from: d */
        public static final String f8930d = "font_weight";

        /* renamed from: e */
        public static final String f8931e = "font_italic";

        /* renamed from: f */
        public static final String f8932f = "result_code";
    }

    /* renamed from: com.onedelhi.secure.aa1$b */
    public static class C1674b {

        /* renamed from: b */
        public static final int f8933b = 0;

        /* renamed from: c */
        public static final int f8934c = 1;

        /* renamed from: d */
        public static final int f8935d = 2;

        /* renamed from: a */
        public final int f8936a;

        /* renamed from: a */
        public final C1675c[] f8937a;

        @Deprecated
        @hl3({hl3.C2354a.f13188c})
        public C1674b(int i, @ts2 C1675c[] cVarArr) {
            this.f8936a = i;
            this.f8937a = cVarArr;
        }

        /* renamed from: a */
        public static C1674b m10960a(int i, @ts2 C1675c[] cVarArr) {
            return new C1674b(i, cVarArr);
        }

        /* renamed from: b */
        public C1675c[] mo12874b() {
            return this.f8937a;
        }

        /* renamed from: c */
        public int mo12875c() {
            return this.f8936a;
        }
    }

    /* renamed from: com.onedelhi.secure.aa1$c */
    public static class C1675c {

        /* renamed from: a */
        public final int f8938a;

        /* renamed from: a */
        public final Uri f8939a;

        /* renamed from: a */
        public final boolean f8940a;

        /* renamed from: b */
        public final int f8941b;

        /* renamed from: c */
        public final int f8942c;

        @Deprecated
        @hl3({hl3.C2354a.f13188c})
        public C1675c(@mr2 Uri uri, @js1(from = 0) int i, @js1(from = 1, mo18580to = 1000) int i2, boolean z, int i3) {
            this.f8939a = (Uri) k43.m19455l(uri);
            this.f8938a = i;
            this.f8941b = i2;
            this.f8940a = z;
            this.f8942c = i3;
        }

        /* renamed from: a */
        public static C1675c m10963a(@mr2 Uri uri, @js1(from = 0) int i, @js1(from = 1, mo18580to = 1000) int i2, boolean z, int i3) {
            return new C1675c(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int mo12876b() {
            return this.f8942c;
        }

        @js1(from = 0)
        /* renamed from: c */
        public int mo12877c() {
            return this.f8938a;
        }

        @mr2
        /* renamed from: d */
        public Uri mo12878d() {
            return this.f8939a;
        }

        @js1(from = 1, mo18580to = 1000)
        /* renamed from: e */
        public int mo12879e() {
            return this.f8941b;
        }

        /* renamed from: f */
        public boolean mo12880f() {
            return this.f8940a;
        }
    }

    /* renamed from: com.onedelhi.secure.aa1$d */
    public static class C1676d {
        @Deprecated
        @hl3({hl3.C2354a.f13188c})

        /* renamed from: a */
        public static final int f8943a = 0;

        /* renamed from: b */
        public static final int f8944b = 0;

        /* renamed from: c */
        public static final int f8945c = -1;

        /* renamed from: d */
        public static final int f8946d = -2;

        /* renamed from: e */
        public static final int f8947e = -3;

        /* renamed from: f */
        public static final int f8948f = -4;

        /* renamed from: g */
        public static final int f8949g = 1;

        /* renamed from: h */
        public static final int f8950h = 2;

        /* renamed from: i */
        public static final int f8951i = 3;

        @hl3({hl3.C2354a.f13188c})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.onedelhi.secure.aa1$d$a */
        public @interface C1677a {
        }

        /* renamed from: a */
        public void mo12881a(int i) {
        }

        /* renamed from: b */
        public void mo12882b(Typeface typeface) {
        }
    }

    @ts2
    /* renamed from: a */
    public static Typeface m10951a(@mr2 Context context, @ts2 CancellationSignal cancellationSignal, @mr2 C1675c[] cVarArr) {
        return ik4.m17651c(context, cancellationSignal, cVarArr, 0);
    }

    @mr2
    /* renamed from: b */
    public static C1674b m10952b(@mr2 Context context, @ts2 CancellationSignal cancellationSignal, @mr2 u91 u91) throws PackageManager.NameNotFoundException {
        return t91.m28207e(context, u91, cancellationSignal);
    }

    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: c */
    public static Typeface m10953c(Context context, u91 u91, @ts2 zk3.C4109g gVar, @ts2 Handler handler, boolean z, int i, int i2) {
        return m10956f(context, u91, i2, z, i, zk3.C4109g.m33223e(handler), new ik4.C2449a(gVar));
    }

    @hw4
    @hl3({hl3.C2354a.f13188c})
    @ts2
    @Deprecated
    /* renamed from: d */
    public static ProviderInfo m10954d(@mr2 PackageManager packageManager, @mr2 u91 u91, @ts2 Resources resources) throws PackageManager.NameNotFoundException {
        return t91.m28208f(packageManager, u91, resources);
    }

    @sj3(19)
    @hl3({hl3.C2354a.f13188c})
    @Deprecated
    /* renamed from: e */
    public static Map<Uri, ByteBuffer> m10955e(Context context, C1675c[] cVarArr, CancellationSignal cancellationSignal) {
        return pk4.m24797h(context, cVarArr, cancellationSignal);
    }

    @ts2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: f */
    public static Typeface m10956f(@mr2 Context context, @mr2 u91 u91, int i, boolean z, @js1(from = 0) int i2, @mr2 Handler handler, @mr2 C1676d dVar) {
        C1730at atVar = new C1730at(dVar, handler);
        return z ? x91.m31347e(context, u91, atVar, i, i2) : x91.m31346d(context, u91, i, (Executor) null, atVar);
    }

    /* renamed from: g */
    public static void m10957g(@mr2 Context context, @mr2 u91 u91, @mr2 C1676d dVar, @mr2 Handler handler) {
        C1730at atVar = new C1730at(dVar);
        x91.m31346d(context.getApplicationContext(), u91, 0, xi3.m31477b(handler), atVar);
    }

    @Deprecated
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: h */
    public static void m10958h() {
        x91.m31348f();
    }

    @hw4
    @hl3({hl3.C2354a.f13190e})
    /* renamed from: i */
    public static void m10959i() {
        x91.m31348f();
    }
}
