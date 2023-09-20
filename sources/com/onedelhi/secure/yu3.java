package com.onedelhi.secure;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.onedelhi.secure.pa0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class yu3 implements ia0 {

    /* renamed from: a */
    public static final int f38057a = 4;

    /* renamed from: a */
    public static final String f38058a = "crash";

    /* renamed from: b */
    public static final int f38059b = 8;

    /* renamed from: b */
    public static final String f38060b = "error";

    /* renamed from: c */
    public static final int f38061c = 8192;

    /* renamed from: a */
    public final b92 f38062a;

    /* renamed from: a */
    public final bq4 f38063a;

    /* renamed from: a */
    public final db0 f38064a;

    /* renamed from: a */
    public final qa0 f38065a;

    /* renamed from: a */
    public final xd0 f38066a;

    public yu3(qa0 qa0, db0 db0, xd0 xd0, b92 b92, bq4 bq4) {
        this.f38065a = qa0;
        this.f38064a = db0;
        this.f38066a = xd0;
        this.f38062a = b92;
        this.f38063a = bq4;
    }

    @sj3(api = 30)
    /* renamed from: i */
    public static pa0.C6371a m72206i(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m72207j(traceInputStream);
            }
        } catch (IOException e) {
            o92 f = o92.m59120f();
            f.mo41623m("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return pa0.C6371a.m60546a().mo42438c(applicationExitInfo.getImportance()).mo42440e(applicationExitInfo.getProcessName()).mo42442g(applicationExitInfo.getReason()).mo42444i(applicationExitInfo.getTimestamp()).mo42439d(applicationExitInfo.getPid()).mo42441f(applicationExitInfo.getPss()).mo42443h(applicationExitInfo.getRss()).mo42445j(str).mo42436a();
    }

    @hw4
    @sj3(api = 19)
    /* renamed from: j */
    public static String m72207j(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: k */
    public static yu3 m72208k(Context context, lo1 lo1, t21 t21, C7225x8 x8Var, b92 b92, bq4 bq4, j24 j24, mw3 mw3, tu2 tu2) {
        return new yu3(new qa0(context, lo1, x8Var, j24, mw3), new db0(t21, mw3), xd0.m70138b(context, mw3, tu2), b92, bq4);
    }

    @mr2
    /* renamed from: o */
    public static List<pa0.C6377d> m72209o(@mr2 Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(pa0.C6377d.m60584a().mo42459b((String) next.getKey()).mo42460c((String) next.getValue()).mo42458a());
        }
        Collections.sort(arrayList, xu3.f37598a);
        return arrayList;
    }

    /* renamed from: a */
    public void mo37921a(@mr2 String str, long j) {
        this.f38064a.mo34281A(this.f38065a.mo43263e(str, j));
    }

    /* renamed from: b */
    public void mo37922b(String str) {
        this.f38063a.mo32008o(str);
    }

    /* renamed from: c */
    public void mo37923c(String str, String str2) {
        this.f38063a.mo32005l(str, str2);
    }

    /* renamed from: d */
    public void mo37924d(long j, String str) {
        this.f38062a.mo31464g(j, str);
    }

    /* renamed from: g */
    public final pa0.C6383f.C6391d mo47994g(pa0.C6383f.C6391d dVar) {
        return mo47995h(dVar, this.f38062a, this.f38063a);
    }

    /* renamed from: h */
    public final pa0.C6383f.C6391d mo47995h(pa0.C6383f.C6391d dVar, b92 b92, bq4 bq4) {
        pa0.C6383f.C6391d.C6406b g = dVar.mo36708g();
        String c = b92.mo31460c();
        if (c != null) {
            g.mo36714d(pa0.C6383f.C6391d.C6409d.m60780a().mo42471b(c).mo42470a());
        } else {
            o92.m59120f().mo41621k("No log data to include with this event.");
        }
        List<pa0.C6377d> o = m72209o(bq4.mo32001e());
        List<pa0.C6377d> o2 = m72209o(bq4.mo32002f());
        if (!o.isEmpty() || !o2.isEmpty()) {
            g.mo36712b(dVar.mo36702b().mo37292g().mo37297c(lp1.m56329b(o)).mo37299e(lp1.m56329b(o2)).mo37295a());
        }
        return g.mo36711a();
    }

    /* renamed from: l */
    public void mo47996l(@mr2 String str, @mr2 List<gn2> list, pa0.C6371a aVar) {
        o92.m59120f().mo41613b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (gn2 c : list) {
            pa0.C6379e.C6381b c2 = c.mo36796c();
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        this.f38064a.mo34291l(str, pa0.C6379e.m60590a().mo30923b(lp1.m56329b(arrayList)).mo30922a(), aVar);
    }

    /* renamed from: m */
    public void mo47997m(long j, @ts2 String str) {
        this.f38064a.mo34290k(str, j);
    }

    @sj3(api = 30)
    @ts2
    /* renamed from: n */
    public final ApplicationExitInfo mo47998n(String str, List<ApplicationExitInfo> list) {
        long q = this.f38064a.mo34294q(str);
        for (ApplicationExitInfo next : list) {
            if (next.getTimestamp() < q) {
                return null;
            }
            if (next.getReason() == 6) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: p */
    public boolean mo47999p() {
        return this.f38064a.mo34295r();
    }

    /* renamed from: r */
    public SortedSet<String> mo48000r() {
        return this.f38064a.mo34293p();
    }

    /* renamed from: s */
    public final boolean mo48001s(@mr2 w94<eb0> w94) {
        if (w94.mo17590v()) {
            eb0 r = w94.mo17586r();
            o92 f = o92.m59120f();
            f.mo41613b("Crashlytics report successfully enqueued to DataTransport: " + r.mo35009d());
            File c = r.mo35008c();
            if (c.delete()) {
                o92 f2 = o92.m59120f();
                f2.mo41613b("Deleted report file: " + c.getPath());
                return true;
            }
            o92 f3 = o92.m59120f();
            f3.mo41623m("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        o92.m59120f().mo41624n("Crashlytics report could not be enqueued to DataTransport", w94.mo17585q());
        return false;
    }

    /* renamed from: t */
    public final void mo48002t(@mr2 Throwable th, @mr2 Thread thread, @mr2 String str, @mr2 String str2, long j, boolean z) {
        boolean equals = str2.equals("crash");
        pa0.C6383f.C6391d d = this.f38065a.mo43262d(th, thread, str2, j, 4, 8, z);
        String str3 = str;
        this.f38064a.mo34298z(mo47994g(d), str, equals);
    }

    /* renamed from: u */
    public void mo48003u(@mr2 Throwable th, @mr2 Thread thread, @mr2 String str, long j) {
        o92 f = o92.m59120f();
        f.mo41621k("Persisting fatal event for session " + str);
        mo48002t(th, thread, str, "crash", j, true);
    }

    /* renamed from: v */
    public void mo48004v(@mr2 Throwable th, @mr2 Thread thread, @mr2 String str, long j) {
        o92 f = o92.m59120f();
        f.mo41621k("Persisting non-fatal event for session " + str);
        mo48002t(th, thread, str, "error", j, false);
    }

    @sj3(api = 30)
    /* renamed from: w */
    public void mo48005w(String str, List<ApplicationExitInfo> list, b92 b92, bq4 bq4) {
        ApplicationExitInfo n = mo47998n(str, list);
        if (n == null) {
            o92 f = o92.m59120f();
            f.mo41621k("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        pa0.C6383f.C6391d c = this.f38065a.mo43261c(m72206i(n));
        o92 f2 = o92.m59120f();
        f2.mo41613b("Persisting anr for session " + str);
        this.f38064a.mo34298z(mo47995h(c, b92, bq4), str, true);
    }

    /* renamed from: x */
    public void mo48006x() {
        this.f38064a.mo34288i();
    }

    /* renamed from: y */
    public w94<Void> mo48007y(@mr2 Executor executor) {
        return mo48008z(executor, (String) null);
    }

    /* renamed from: z */
    public w94<Void> mo48008z(@mr2 Executor executor, @ts2 String str) {
        List<eb0> w = this.f38064a.mo34296w();
        ArrayList arrayList = new ArrayList();
        for (eb0 next : w) {
            if (str == null || str.equals(next.mo35009d())) {
                arrayList.add(this.f38066a.mo47127c(next, str != null).mo17582n(executor, new wu3(this)));
            }
        }
        return ha4.m16573h(arrayList);
    }
}
