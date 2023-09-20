package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class db0 {

    /* renamed from: a */
    public static final int f27358a = 8;

    /* renamed from: a */
    public static final ya0 f27359a = new ya0();

    /* renamed from: a */
    public static final FilenameFilter f27360a = ab0.f25806a;

    /* renamed from: a */
    public static final String f27361a = "report";

    /* renamed from: a */
    public static final Charset f27362a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static final Comparator<? super File> f27363a = bb0.f26260a;

    /* renamed from: b */
    public static final int f27364b = 10;

    /* renamed from: b */
    public static final String f27365b = "start-time";

    /* renamed from: c */
    public static final int f27366c = 15;

    /* renamed from: c */
    public static final String f27367c = "event";

    /* renamed from: d */
    public static final String f27368d = "%010d";

    /* renamed from: e */
    public static final String f27369e = "_";

    /* renamed from: f */
    public static final String f27370f = "";
    @mr2

    /* renamed from: a */
    public final mw3 f27371a;

    /* renamed from: a */
    public final t21 f27372a;

    /* renamed from: a */
    public final AtomicInteger f27373a = new AtomicInteger(0);

    public db0(t21 t21, mw3 mw3) {
        this.f27372a = t21;
        this.f27371a = mw3;
    }

    @mr2
    /* renamed from: B */
    public static String m44957B(@mr2 File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f27362a);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: G */
    public static void m44958G(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f27362a);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: H */
    public static void m44959H(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f27362a);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m44965h(j));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    public static int m44964f(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            t21.m65158t(next);
            size--;
        }
        return size;
    }

    /* renamed from: h */
    public static long m44965h(long j) {
        return j * 1000;
    }

    @mr2
    /* renamed from: m */
    public static String m44966m(int i, boolean z) {
        String format = String.format(Locale.US, f27368d, new Object[]{Integer.valueOf(i)});
        String str = z ? f27369e : "";
        return "event" + format + str;
    }

    @mr2
    /* renamed from: o */
    public static String m44967o(@mr2 String str) {
        return str.substring(0, f27366c);
    }

    /* renamed from: s */
    public static boolean m44968s(@mr2 String str) {
        return str.startsWith("event") && str.endsWith(f27369e);
    }

    /* renamed from: t */
    public static boolean m44969t(@mr2 File file, @mr2 String str) {
        return str.startsWith("event") && !str.endsWith(f27369e);
    }

    /* renamed from: x */
    public static int m44972x(@mr2 File file, @mr2 File file2) {
        return m44967o(file.getName()).compareTo(m44967o(file2.getName()));
    }

    /* renamed from: A */
    public void mo34281A(@mr2 pa0 pa0) {
        pa0.C6383f k = pa0.mo42412k();
        if (k == null) {
            o92.m59120f().mo41613b("Could not get session for report");
            return;
        }
        String h = k.mo32343h();
        try {
            m44958G(this.f27372a.mo44770p(h, f27361a), f27359a.mo47659I(pa0));
            m44959H(this.f27372a.mo44770p(h, f27365b), "", k.mo32346k());
        } catch (IOException e) {
            o92 f = o92.m59120f();
            f.mo41614c("Could not persist report for session " + h, e);
        }
    }

    /* renamed from: C */
    public final void mo34282C(@mr2 File file, @mr2 pa0.C6379e eVar, @mr2 String str, pa0.C6371a aVar) {
        try {
            ya0 ya0 = f27359a;
            m44958G(this.f27372a.mo44762h(str), ya0.mo47659I(ya0.mo47658H(m44957B(file)).mo42417p(eVar).mo42415n(aVar)));
        } catch (IOException e) {
            o92 f = o92.m59120f();
            f.mo41624n("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: D */
    public final void mo34283D(String str, long j) {
        boolean z;
        List<File> q = this.f27372a.mo44771q(str, f27360a);
        if (q.isEmpty()) {
            o92 f = o92.m59120f();
            f.mo41621k("Session " + str + " has no events.");
            return;
        }
        Collections.sort(q);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = q.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f27359a.mo47662j(m44957B(next)));
                    if (z || m44968s(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    o92 f2 = o92.m59120f();
                    f2.mo41624n("Could not add event to report for " + next, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            o92 f3 = o92.m59120f();
            f3.mo41623m("Could not parse event files for session " + str);
            return;
        }
        String j2 = bq4.m40300j(str, this.f27372a);
        mo34284E(this.f27372a.mo44770p(str, f27361a), arrayList, j, z, j2);
    }

    /* renamed from: E */
    public final void mo34284E(@mr2 File file, @mr2 List<pa0.C6383f.C6391d> list, long j, boolean z, @ts2 String str) {
        try {
            ya0 ya0 = f27359a;
            pa0 o = ya0.mo47658H(m44957B(file)).mo42419r(j, z, str).mo42416o(lp1.m56329b(list));
            pa0.C6383f k = o.mo42412k();
            if (k != null) {
                m44958G(z ? this.f27372a.mo44765k(k.mo32343h()) : this.f27372a.mo44767m(k.mo32343h()), ya0.mo47659I(o));
            }
        } catch (IOException e) {
            o92 f = o92.m59120f();
            f.mo41624n("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: F */
    public final int mo34285F(String str, int i) {
        List<File> q = this.f27372a.mo44771q(str, za0.f38297a);
        Collections.sort(q, cb0.f26714a);
        return m44964f(q, i);
    }

    /* renamed from: e */
    public final SortedSet<String> mo34286e(@ts2 String str) {
        this.f27372a.mo44756b();
        SortedSet<String> p = mo34293p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() <= 8) {
            return p;
        }
        while (p.size() > 8) {
            String last = p.last();
            o92 f = o92.m59120f();
            f.mo41613b("Removing session over cap: " + last);
            this.f27372a.mo44758d(last);
            p.remove(last);
        }
        return p;
    }

    /* renamed from: g */
    public final void mo34287g() {
        int i = this.f27371a.mo40840a().f30954a.f30962b;
        List<File> n = mo34292n();
        int size = n.size();
        if (size > i) {
            for (File delete : n.subList(i, size)) {
                delete.delete();
            }
        }
    }

    /* renamed from: i */
    public void mo34288i() {
        mo34289j(this.f27372a.mo44768n());
        mo34289j(this.f27372a.mo44766l());
        mo34289j(this.f27372a.mo44763i());
    }

    /* renamed from: j */
    public final void mo34289j(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* renamed from: k */
    public void mo34290k(@ts2 String str, long j) {
        for (String next : mo34286e(str)) {
            o92 f = o92.m59120f();
            f.mo41621k("Finalizing report for session " + next);
            mo34283D(next, j);
            this.f27372a.mo44758d(next);
        }
        mo34287g();
    }

    /* renamed from: l */
    public void mo34291l(String str, pa0.C6379e eVar, pa0.C6371a aVar) {
        File p = this.f27372a.mo44770p(str, f27361a);
        o92 f = o92.m59120f();
        f.mo41613b("Writing native session report for " + str + " to file: " + p);
        mo34282C(p, eVar, str, aVar);
    }

    /* renamed from: n */
    public final List<File> mo34292n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f27372a.mo44766l());
        arrayList.addAll(this.f27372a.mo44763i());
        Comparator<? super File> comparator = f27363a;
        Collections.sort(arrayList, comparator);
        List<File> n = this.f27372a.mo44768n();
        Collections.sort(n, comparator);
        arrayList.addAll(n);
        return arrayList;
    }

    /* renamed from: p */
    public SortedSet<String> mo34293p() {
        return new TreeSet(this.f27372a.mo44759e()).descendingSet();
    }

    /* renamed from: q */
    public long mo34294q(String str) {
        return this.f27372a.mo44770p(str, f27365b).lastModified();
    }

    /* renamed from: r */
    public boolean mo34295r() {
        return !this.f27372a.mo44768n().isEmpty() || !this.f27372a.mo44766l().isEmpty() || !this.f27372a.mo44763i().isEmpty();
    }

    @mr2
    /* renamed from: w */
    public List<eb0> mo34296w() {
        List<File> n = mo34292n();
        ArrayList arrayList = new ArrayList();
        for (File next : n) {
            try {
                arrayList.add(eb0.m46251a(f27359a.mo47658H(m44957B(next)), next.getName(), next));
            } catch (IOException e) {
                o92 f = o92.m59120f();
                f.mo41624n("Could not load report file " + next + "; deleting", e);
                next.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void mo34297y(@mr2 pa0.C6383f.C6391d dVar, @mr2 String str) {
        mo34298z(dVar, str, false);
    }

    /* renamed from: z */
    public void mo34298z(@mr2 pa0.C6383f.C6391d dVar, @mr2 String str, boolean z) {
        int i = this.f27371a.mo40840a().f30954a.f30961a;
        try {
            m44958G(this.f27372a.mo44770p(str, m44966m(this.f27373a.getAndIncrement(), z)), f27359a.mo47663k(dVar));
        } catch (IOException e) {
            o92 f = o92.m59120f();
            f.mo41624n("Could not persist event for session " + str, e);
        }
        mo34285F(str, i);
    }
}
