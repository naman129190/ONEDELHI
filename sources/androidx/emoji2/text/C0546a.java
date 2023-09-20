package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u91;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.emoji2.text.a */
public final class C0546a {

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.emoji2.text.a$a */
    public static class C0547a {
        @mr2

        /* renamed from: a */
        public static final String f3533a = "emoji2.text.DefaultEmojiConfig";
        @mr2

        /* renamed from: b */
        public static final String f3534b = "androidx.content.action.LOAD_EMOJI_FONT";
        @mr2

        /* renamed from: c */
        public static final String f3535c = "emojicompat-emoji-font";

        /* renamed from: a */
        public final C0548b f3536a;

        @hl3({hl3.C2354a.f13185a})
        public C0547a(@ts2 C0548b bVar) {
            this.f3536a = bVar == null ? m4086e() : bVar;
        }

        @mr2
        /* renamed from: e */
        public static C0548b m4086e() {
            return Build.VERSION.SDK_INT >= 28 ? new C0550d() : new C0549c();
        }

        @ts2
        /* renamed from: a */
        public final C0552c.C0557d mo4154a(@mr2 Context context, @ts2 u91 u91) {
            if (u91 == null) {
                return null;
            }
            return new C0569e(context, u91);
        }

        @mr2
        /* renamed from: b */
        public final List<List<byte[]>> mo4155b(@mr2 Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @ts2
        @hl3({hl3.C2354a.f13185a})
        /* renamed from: c */
        public C0552c.C0557d mo4156c(@mr2 Context context) {
            return mo4154a(context, mo4160h(context));
        }

        @mr2
        /* renamed from: d */
        public final u91 mo4157d(@mr2 ProviderInfo providerInfo, @mr2 PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new u91(str, str2, f3535c, mo4155b(this.f3536a.mo4162b(packageManager, str2)));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r2 = r2.applicationInfo;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo4158f(@com.onedelhi.secure.ts2 android.content.pm.ProviderInfo r2) {
            /*
                r1 = this;
                r0 = 1
                if (r2 == 0) goto L_0x000d
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto L_0x000d
                int r2 = r2.flags
                r2 = r2 & r0
                if (r2 != r0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0546a.C0547a.mo4158f(android.content.pm.ProviderInfo):boolean");
        }

        @ts2
        /* renamed from: g */
        public final ProviderInfo mo4159g(@mr2 PackageManager packageManager) {
            for (ResolveInfo a : this.f3536a.mo4163c(packageManager, new Intent(f3534b), 0)) {
                ProviderInfo a2 = this.f3536a.mo4161a(a);
                if (mo4158f(a2)) {
                    return a2;
                }
            }
            return null;
        }

        @hw4
        @ts2
        @hl3({hl3.C2354a.f13185a})
        /* renamed from: h */
        public u91 mo4160h(@mr2 Context context) {
            PackageManager packageManager = context.getPackageManager();
            k43.m19456m(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = mo4159g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return mo4157d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf(f3533a, e);
                return null;
            }
        }
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.emoji2.text.a$b */
    public static class C0548b {
        @ts2
        /* renamed from: a */
        public ProviderInfo mo4161a(@mr2 ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @mr2
        /* renamed from: b */
        public Signature[] mo4162b(@mr2 PackageManager packageManager, @mr2 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @mr2
        /* renamed from: c */
        public List<ResolveInfo> mo4163c(@mr2 PackageManager packageManager, @mr2 Intent intent, int i) {
            return Collections.emptyList();
        }
    }

    @sj3(19)
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.emoji2.text.a$c */
    public static class C0549c extends C0548b {
        @ts2
        /* renamed from: a */
        public ProviderInfo mo4161a(@mr2 ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @mr2
        /* renamed from: c */
        public List<ResolveInfo> mo4163c(@mr2 PackageManager packageManager, @mr2 Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    @sj3(28)
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: androidx.emoji2.text.a$d */
    public static class C0550d extends C0549c {
        @mr2
        /* renamed from: b */
        public Signature[] mo4162b(@mr2 PackageManager packageManager, @mr2 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    @ts2
    /* renamed from: a */
    public static C0569e m4085a(@mr2 Context context) {
        return (C0569e) new C0547a((C0548b) null).mo4156c(context);
    }
}
