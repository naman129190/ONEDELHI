package com.onedelhi.secure;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.onedelhi.secure.pa0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class qa0 {

    /* renamed from: a */
    public static final int f34041a = 3;

    /* renamed from: a */
    public static final String f34042a = String.format(Locale.US, ea0.f27763f, new Object[]{C7174wo.f37061c});

    /* renamed from: a */
    public static final Map<String, Integer> f34043a;

    /* renamed from: b */
    public static final int f34044b = 4;

    /* renamed from: b */
    public static final String f34045b = "0";

    /* renamed from: c */
    public static final int f34046c = 3;

    /* renamed from: a */
    public final Context f34047a;

    /* renamed from: a */
    public final j24 f34048a;

    /* renamed from: a */
    public final lo1 f34049a;

    /* renamed from: a */
    public final mw3 f34050a;

    /* renamed from: a */
    public final C7225x8 f34051a;

    static {
        HashMap hashMap = new HashMap();
        f34043a = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public qa0(Context context, lo1 lo1, C7225x8 x8Var, j24 j24, mw3 mw3) {
        this.f34047a = context;
        this.f34049a = lo1;
        this.f34051a = x8Var;
        this.f34048a = j24;
        this.f34050a = mw3;
    }

    /* renamed from: f */
    public static int m62331f() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f34043a.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    /* renamed from: a */
    public final pa0.C6371a mo43259a(pa0.C6371a aVar) {
        lp1 lp1;
        if (!this.f34050a.mo40840a().f30953a.f30960c || this.f34051a.f37363a.size() <= 0) {
            lp1 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C7275xp next : this.f34051a.f37363a) {
                arrayList.add(pa0.C6371a.C6372a.m60556a().mo42435d(next.mo47374c()).mo42433b(next.mo47372a()).mo42434c(next.mo47373b()).mo42432a());
            }
            lp1 = lp1.m56329b(arrayList);
        }
        return pa0.C6371a.m60546a().mo42438c(aVar.mo42421c()).mo42440e(aVar.mo42423e()).mo42442g(aVar.mo42425g()).mo42444i(aVar.mo42427i()).mo42439d(aVar.mo42422d()).mo42441f(aVar.mo42424f()).mo42443h(aVar.mo42426h()).mo42445j(aVar.mo42428j()).mo42437b(lp1).mo42436a();
    }

    /* renamed from: b */
    public final pa0.C6376c mo43260b() {
        return pa0.m60529b().mo42454i(C7174wo.f37061c).mo42450e(this.f34051a.f37362a).mo42451f(this.f34049a.mo38197a()).mo42448c(this.f34051a.f37367e).mo42449d(this.f34051a.f37368f).mo42453h(4);
    }

    /* renamed from: c */
    public pa0.C6383f.C6391d mo43261c(pa0.C6371a aVar) {
        int i = this.f34047a.getResources().getConfiguration().orientation;
        return pa0.C6383f.C6391d.m60676a().mo36716f("anr").mo36715e(aVar.mo42427i()).mo36712b(mo43266i(i, mo43259a(aVar))).mo36713c(mo43268k(i)).mo36711a();
    }

    /* renamed from: d */
    public pa0.C6383f.C6391d mo43262d(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f34047a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        String str2 = str;
        long j2 = j;
        return pa0.C6383f.C6391d.m60676a().mo36716f(str).mo36715e(j).mo36712b(mo43267j(i3, new ui4(th, this.f34048a), thread, i, i2, z)).mo36713c(mo43268k(i3)).mo36711a();
    }

    /* renamed from: e */
    public pa0 mo43263e(String str, long j) {
        return mo43260b().mo42455j(mo43276s(str, j)).mo42446a();
    }

    /* renamed from: g */
    public final pa0.C6383f.C6391d.C6392a.C6394b.C6395a mo43264g() {
        return pa0.C6383f.C6391d.C6392a.C6394b.C6395a.m60702a().mo38629b(0).mo38631d(0).mo38630c(this.f34051a.f37366d).mo38632e(this.f34051a.f37364b).mo38628a();
    }

    /* renamed from: h */
    public final lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6395a> mo43265h() {
        return lp1.m56330e(mo43264g());
    }

    /* renamed from: i */
    public final pa0.C6383f.C6391d.C6392a mo43266i(int i, pa0.C6371a aVar) {
        return pa0.C6383f.C6391d.C6392a.m60683a().mo37296b(Boolean.valueOf(aVar.mo42421c() != 100)).mo37300f(i).mo37298d(mo43271n(aVar)).mo37295a();
    }

    /* renamed from: j */
    public final pa0.C6383f.C6391d.C6392a mo43267j(int i, ui4 ui4, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j = u10.m66363j(this.f34051a.f37366d, this.f34047a);
        if (j != null) {
            bool = Boolean.valueOf(j.importance != 100);
        } else {
            bool = null;
        }
        return pa0.C6383f.C6391d.C6392a.m60683a().mo37296b(bool).mo37300f(i).mo37298d(mo43272o(ui4, thread, i2, i3, z)).mo37295a();
    }

    /* renamed from: k */
    public final pa0.C6383f.C6391d.C6407c mo43268k(int i) {
        C5281fk a = C5281fk.m47987a(this.f34047a);
        Float b = a.mo36036b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.mo36037c();
        boolean q = u10.m66370q(this.f34047a);
        return pa0.C6383f.C6391d.C6407c.m60766a().mo41770b(valueOf).mo41771c(c).mo41774f(q).mo41773e(i).mo41775g(u10.m66375v() - u10.m66354a(this.f34047a)).mo41772d(u10.m66355b(Environment.getDataDirectory().getPath())).mo41769a();
    }

    /* renamed from: l */
    public final pa0.C6383f.C6391d.C6392a.C6394b.C6398c mo43269l(ui4 ui4, int i, int i2) {
        return mo43270m(ui4, i, i2, 0);
    }

    /* renamed from: m */
    public final pa0.C6383f.C6391d.C6392a.C6394b.C6398c mo43270m(ui4 ui4, int i, int i2, int i3) {
        String str = ui4.f36158b;
        String str2 = ui4.f36156a;
        StackTraceElement[] stackTraceElementArr = ui4.f36157a;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ui4 ui42 = ui4.f36155a;
        if (i3 >= i2) {
            ui4 ui43 = ui42;
            while (ui43 != null) {
                ui43 = ui43.f36155a;
                i4++;
            }
        }
        pa0.C6383f.C6391d.C6392a.C6394b.C6398c.C6399a d = pa0.C6383f.C6391d.C6392a.C6394b.C6398c.m60720a().mo39255f(str).mo39254e(str2).mo39252c(lp1.m56329b(mo43274q(stackTraceElementArr, i))).mo39253d(i4);
        if (ui42 != null && i4 == 0) {
            d.mo39251b(mo43270m(ui42, i, i2, i3 + 1));
        }
        return d.mo39250a();
    }

    /* renamed from: n */
    public final pa0.C6383f.C6391d.C6392a.C6394b mo43271n(pa0.C6371a aVar) {
        return pa0.C6383f.C6391d.C6392a.C6394b.m60696a().mo38073b(aVar).mo38076e(mo43279v()).mo38074c(mo43265h()).mo38072a();
    }

    /* renamed from: o */
    public final pa0.C6383f.C6391d.C6392a.C6394b mo43272o(ui4 ui4, Thread thread, int i, int i2, boolean z) {
        return pa0.C6383f.C6391d.C6392a.C6394b.m60696a().mo38077f(mo43282y(ui4, thread, i, z)).mo38075d(mo43269l(ui4, i, i2)).mo38076e(mo43279v()).mo38074c(mo43265h()).mo38072a();
    }

    /* renamed from: p */
    public final pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b mo43273p(StackTraceElement stackTraceElement, pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b.C6405a aVar) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = (long) stackTraceElement.getLineNumber();
        }
        return aVar.mo41050e(max).mo41051f(str).mo41047b(fileName).mo41049d(j).mo41046a();
    }

    /* renamed from: q */
    public final lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> mo43274q(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement p : stackTraceElementArr) {
            arrayList.add(mo43273p(p, pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b.m60748a().mo41048c(i)));
        }
        return lp1.m56329b(arrayList);
    }

    /* renamed from: r */
    public final pa0.C6383f.C6384a mo43275r() {
        return pa0.C6383f.C6384a.m60620a().mo34406e(this.f34049a.mo40146f()).mo34409h(this.f34051a.f37367e).mo34405d(this.f34051a.f37368f).mo34407f(this.f34049a.mo38197a()).mo34403b(this.f34051a.f37361a.mo42695d()).mo34404c(this.f34051a.f37361a.mo42696e()).mo34402a();
    }

    /* renamed from: s */
    public final pa0.C6383f mo43276s(String str, long j) {
        return pa0.C6383f.m60603a().mo32361l(j).mo32359i(str).mo32357g(f34042a).mo32352b(mo43275r()).mo32360k(mo43278u()).mo32354d(mo43277t()).mo32358h(3).mo32351a();
    }

    /* renamed from: t */
    public final pa0.C6383f.C6389c mo43277t() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int f = m62331f();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long v = u10.m66375v();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean B = u10.m66347B();
        int n = u10.m66367n();
        String str = Build.MANUFACTURER;
        return pa0.C6383f.C6389c.m60656a().mo35930b(f).mo35934f(Build.MODEL).mo35931c(availableProcessors).mo35936h(v).mo35932d(blockCount).mo35937i(B).mo35938j(n).mo35933e(str).mo35935g(Build.PRODUCT).mo35929a();
    }

    /* renamed from: u */
    public final pa0.C6383f.C6411e mo43278u() {
        return pa0.C6383f.C6411e.m60784a().mo42479d(3).mo42480e(Build.VERSION.RELEASE).mo42477b(Build.VERSION.CODENAME).mo42478c(u10.m66349D()).mo42476a();
    }

    /* renamed from: v */
    public final pa0.C6383f.C6391d.C6392a.C6394b.C6400d mo43279v() {
        return pa0.C6383f.C6391d.C6392a.C6394b.C6400d.m60732a().mo39843d(f34045b).mo39842c(f34045b).mo39841b(0).mo39840a();
    }

    /* renamed from: w */
    public final pa0.C6383f.C6391d.C6392a.C6394b.C6402e mo43280w(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return mo43281x(thread, stackTraceElementArr, 0);
    }

    /* renamed from: x */
    public final pa0.C6383f.C6391d.C6392a.C6394b.C6402e mo43281x(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return pa0.C6383f.C6391d.C6392a.C6394b.C6402e.m60740a().mo40580d(thread.getName()).mo40579c(i).mo40578b(lp1.m56329b(mo43274q(stackTraceElementArr, i))).mo40577a();
    }

    /* renamed from: y */
    public final lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e> mo43282y(ui4 ui4, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo43281x(thread, ui4.f36157a, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(mo43280w(thread2, this.f34048a.mo34471a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return lp1.m56329b(arrayList);
    }
}
