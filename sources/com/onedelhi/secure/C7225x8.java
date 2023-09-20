package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: com.onedelhi.secure.x8 */
public class C7225x8 {

    /* renamed from: a */
    public final pk0 f37361a;

    /* renamed from: a */
    public final String f37362a;

    /* renamed from: a */
    public final List<C7275xp> f37363a;

    /* renamed from: b */
    public final String f37364b;

    /* renamed from: c */
    public final String f37365c;

    /* renamed from: d */
    public final String f37366d;

    /* renamed from: e */
    public final String f37367e;

    /* renamed from: f */
    public final String f37368f;

    public C7225x8(String str, String str2, List<C7275xp> list, String str3, String str4, String str5, String str6, pk0 pk0) {
        this.f37362a = str;
        this.f37364b = str2;
        this.f37363a = list;
        this.f37365c = str3;
        this.f37366d = str4;
        this.f37367e = str5;
        this.f37368f = str6;
        this.f37361a = pk0;
    }

    /* renamed from: a */
    public static C7225x8 m70010a(Context context, lo1 lo1, String str, String str2, List<C7275xp> list, pk0 pk0) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g = lo1.mo40147g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = lo1.f31745c;
        }
        return new C7225x8(str, str2, list, g, packageName, num, str3, pk0);
    }
}
