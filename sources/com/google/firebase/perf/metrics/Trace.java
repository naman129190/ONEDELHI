package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.C4336a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.onedelhi.secure.C5068dz;
import com.onedelhi.secure.C5665i9;
import com.onedelhi.secure.C5765j9;
import com.onedelhi.secure.C7012v5;
import com.onedelhi.secure.f13;
import com.onedelhi.secure.fg4;
import com.onedelhi.secure.g13;
import com.onedelhi.secure.li4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qe4;
import com.onedelhi.secure.r51;
import com.onedelhi.secure.t90;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uu3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Trace extends C5765j9 implements Parcelable, r51, uu3 {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new C4362a();
    @VisibleForTesting

    /* renamed from: a */
    public static final Parcelable.Creator<Trace> f25283a = new C4363b();

    /* renamed from: a */
    public static final C7012v5 f25284a = C7012v5.m67717e();

    /* renamed from: c */
    public static final Map<String, Trace> f25285c = new ConcurrentHashMap();

    /* renamed from: a */
    public final Trace f25286a;

    /* renamed from: a */
    public final GaugeManager f25287a;

    /* renamed from: a */
    public final C5068dz f25288a;

    /* renamed from: a */
    public final li4 f25289a;

    /* renamed from: a */
    public qe4 f25290a;

    /* renamed from: a */
    public final WeakReference<uu3> f25291a;

    /* renamed from: a */
    public final List<g13> f25292a;

    /* renamed from: a */
    public final Map<String, t90> f25293a;

    /* renamed from: b */
    public qe4 f25294b;

    /* renamed from: b */
    public final String f25295b;

    /* renamed from: b */
    public final List<Trace> f25296b;

    /* renamed from: b */
    public final Map<String, String> f25297b;

    /* renamed from: com.google.firebase.perf.metrics.Trace$a */
    public class C4362a implements Parcelable.Creator<Trace> {
        /* renamed from: a */
        public Trace createFromParcel(@mr2 Parcel parcel) {
            return new Trace(parcel, false, (C4362a) null);
        }

        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.Trace$b */
    public class C4363b implements Parcelable.Creator<Trace> {
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, (C4362a) null);
        }

        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Trace(@mr2 Parcel parcel, boolean z) {
        super(z ? null : C5665i9.m51864c());
        this.f25291a = new WeakReference<>(this);
        this.f25286a = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f25295b = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f25296b = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f25293a = concurrentHashMap;
        this.f25297b = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, t90.class.getClassLoader());
        this.f25290a = (qe4) parcel.readParcelable(qe4.class.getClassLoader());
        this.f25294b = (qe4) parcel.readParcelable(qe4.class.getClassLoader());
        List<g13> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f25292a = synchronizedList;
        parcel.readList(synchronizedList, g13.class.getClassLoader());
        if (z) {
            this.f25289a = null;
            this.f25288a = null;
            this.f25287a = null;
            return;
        }
        this.f25289a = li4.m55636l();
        this.f25288a = new C5068dz();
        this.f25287a = GaugeManager.getInstance();
    }

    public /* synthetic */ Trace(Parcel parcel, boolean z, C4362a aVar) {
        this(parcel, z);
    }

    public Trace(@mr2 Trace trace, @mr2 String str, qe4 qe4, qe4 qe42, @ts2 List<Trace> list, @ts2 Map<String, t90> map, @ts2 Map<String, String> map2) {
        this.f25291a = new WeakReference<>(this);
        this.f25286a = trace;
        this.f25295b = str.trim();
        this.f25290a = qe4;
        this.f25294b = qe42;
        this.f25296b = list == null ? new ArrayList<>() : list;
        this.f25293a = map == null ? new ConcurrentHashMap<>() : map;
        this.f25297b = map2 == null ? new ConcurrentHashMap<>() : map2;
        this.f25288a = trace.f25288a;
        this.f25289a = trace.f25289a;
        this.f25292a = Collections.synchronizedList(new ArrayList());
        this.f25287a = trace.f25287a;
    }

    public Trace(@mr2 String str) {
        this(str, li4.m55636l(), new C5068dz(), C5665i9.m51864c(), GaugeManager.getInstance());
    }

    public Trace(@mr2 String str, @mr2 li4 li4, @mr2 C5068dz dzVar, @mr2 C5665i9 i9Var) {
        this(str, li4, dzVar, i9Var, GaugeManager.getInstance());
    }

    public Trace(@mr2 String str, @mr2 li4 li4, @mr2 C5068dz dzVar, @mr2 C5665i9 i9Var, @mr2 GaugeManager gaugeManager) {
        super(i9Var);
        this.f25291a = new WeakReference<>(this);
        this.f25286a = null;
        this.f25295b = str.trim();
        this.f25296b = new ArrayList();
        this.f25293a = new ConcurrentHashMap();
        this.f25297b = new ConcurrentHashMap();
        this.f25288a = dzVar;
        this.f25289a = li4;
        this.f25292a = Collections.synchronizedList(new ArrayList());
        this.f25287a = gaugeManager;
    }

    @mr2
    /* renamed from: c */
    public static Trace m35091c(@mr2 String str) {
        return new Trace(str);
    }

    @mr2
    /* renamed from: k */
    public static synchronized Trace m35092k(@mr2 String str) {
        Trace trace;
        synchronized (Trace.class) {
            Map<String, Trace> map = f25285c;
            trace = map.get(str);
            if (trace == null) {
                trace = new Trace(str);
                map.put(str, trace);
            }
        }
        return trace;
    }

    @mr2
    @VisibleForTesting
    /* renamed from: m */
    public static synchronized Trace m35093m(@mr2 String str, @mr2 li4 li4, @mr2 C5068dz dzVar, @mr2 C5665i9 i9Var) {
        Trace trace;
        synchronized (Trace.class) {
            Map<String, Trace> map = f25285c;
            trace = map.get(str);
            if (trace == null) {
                trace = new Trace(str, li4, dzVar, i9Var, GaugeManager.getInstance());
                map.put(str, trace);
            }
        }
        return trace;
    }

    @ts2
    /* renamed from: t */
    public static Trace m35094t(@mr2 String str) {
        Trace trace = f25285c.get(str);
        if (trace != null) {
            trace.start();
        }
        return trace;
    }

    @ts2
    /* renamed from: v */
    public static Trace m35095v(@mr2 String str) {
        Map<String, Trace> map = f25285c;
        Trace trace = map.get(str);
        if (trace != null) {
            trace.stop();
            map.remove(str);
        }
        return trace;
    }

    /* renamed from: a */
    public void mo29944a(g13 g13) {
        if (g13 == null) {
            f25284a.mo46010l("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (mo29958n() && !mo29960p()) {
            this.f25292a.add(g13);
        }
    }

    /* renamed from: b */
    public final void mo29945b(@mr2 String str, @mr2 String str2) {
        if (mo29960p()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[]{this.f25295b}));
        } else if (this.f25297b.containsKey(str) || this.f25297b.size() < 5) {
            f13.m47449d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    @mr2
    @VisibleForTesting
    /* renamed from: d */
    public Map<String, t90> mo29946d() {
        return this.f25293a;
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    @VisibleForTesting
    /* renamed from: e */
    public qe4 mo29948e() {
        return this.f25294b;
    }

    @mr2
    @VisibleForTesting
    /* renamed from: f */
    public String mo29949f() {
        return this.f25295b;
    }

    public void finalize() throws Throwable {
        try {
            if (mo29959o()) {
                f25284a.mo46011m("Trace '%s' is started but not stopped when it is destructed!", this.f25295b);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @ts2
    @Keep
    public String getAttribute(@mr2 String str) {
        return this.f25297b.get(str);
    }

    @mr2
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f25297b);
    }

    @Keep
    public long getLongMetric(@mr2 String str) {
        t90 t90 = str != null ? this.f25293a.get(str.trim()) : null;
        if (t90 == null) {
            return 0;
        }
        return t90.mo44948a();
    }

    @VisibleForTesting
    /* renamed from: h */
    public List<g13> mo29954h() {
        List<g13> unmodifiableList;
        synchronized (this.f25292a) {
            ArrayList arrayList = new ArrayList();
            for (g13 next : this.f25292a) {
                if (next != null) {
                    arrayList.add(next);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    @VisibleForTesting
    /* renamed from: i */
    public qe4 mo29955i() {
        return this.f25290a;
    }

    @Keep
    public void incrementMetric(@mr2 String str, long j) {
        String e = f13.m47450e(str);
        if (e != null) {
            f25284a.mo46003d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e);
        } else if (!mo29958n()) {
            f25284a.mo46011m("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f25295b);
        } else if (mo29960p()) {
            f25284a.mo46011m("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f25295b);
        } else {
            t90 q = mo29963q(str.trim());
            q.mo44950c(j);
            f25284a.mo46001b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(q.mo44948a()), this.f25295b);
        }
    }

    @mr2
    @VisibleForTesting
    /* renamed from: j */
    public List<Trace> mo29957j() {
        return this.f25296b;
    }

    @VisibleForTesting
    /* renamed from: n */
    public boolean mo29958n() {
        return this.f25290a != null;
    }

    @VisibleForTesting
    /* renamed from: o */
    public boolean mo29959o() {
        return mo29958n() && !mo29960p();
    }

    @VisibleForTesting
    /* renamed from: p */
    public boolean mo29960p() {
        return this.f25294b != null;
    }

    @Keep
    public void putAttribute(@mr2 String str, @mr2 String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            mo29945b(str, str2);
            f25284a.mo46001b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f25295b);
            z = true;
        } catch (Exception e) {
            f25284a.mo46003d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f25297b.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@mr2 String str, long j) {
        String e = f13.m47450e(str);
        if (e != null) {
            f25284a.mo46003d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e);
        } else if (!mo29958n()) {
            f25284a.mo46011m("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f25295b);
        } else if (mo29960p()) {
            f25284a.mo46011m("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f25295b);
        } else {
            mo29963q(str.trim()).mo44951d(j);
            f25284a.mo46001b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), this.f25295b);
        }
    }

    @mr2
    /* renamed from: q */
    public final t90 mo29963q(@mr2 String str) {
        t90 t90 = this.f25293a.get(str);
        if (t90 != null) {
            return t90;
        }
        t90 t902 = new t90(str);
        this.f25293a.put(str, t902);
        return t902;
    }

    /* renamed from: r */
    public final void mo29964r(qe4 qe4) {
        if (!this.f25296b.isEmpty()) {
            Trace trace = this.f25296b.get(this.f25296b.size() - 1);
            if (trace.f25294b == null) {
                trace.f25294b = qe4;
            }
        }
    }

    @Keep
    public void removeAttribute(@mr2 String str) {
        if (mo29960p()) {
            f25284a.mo46002c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f25297b.remove(str);
        }
    }

    /* renamed from: s */
    public void mo29966s(@mr2 String str) {
        qe4 a = this.f25288a.mo34720a();
        mo29964r(a);
        this.f25296b.add(new Trace(this, str, a, (qe4) null, (List<Trace>) null, (Map<String, t90>) null, (Map<String, String>) null));
    }

    @Keep
    public void start() {
        if (!C4336a.m34908h().mo29861M()) {
            f25284a.mo46000a("Trace feature is disabled.");
            return;
        }
        String f = f13.m47451f(this.f25295b);
        if (f != null) {
            f25284a.mo46003d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f25295b, f);
        } else if (this.f25290a != null) {
            f25284a.mo46003d("Trace '%s' has already started, should not start again!", this.f25295b);
        } else {
            this.f25290a = this.f25288a.mo34720a();
            registerForAppState();
            g13 perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f25291a);
            mo29944a(perfSession);
            if (perfSession.mo36519f()) {
                this.f25287a.collectGaugeMetricOnce(perfSession.mo36516d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!mo29958n()) {
            f25284a.mo46003d("Trace '%s' has not been started so unable to stop!", this.f25295b);
        } else if (mo29960p()) {
            f25284a.mo46003d("Trace '%s' has already stopped, should not stop again!", this.f25295b);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f25291a);
            unregisterForAppState();
            qe4 a = this.f25288a.mo34720a();
            this.f25294b = a;
            if (this.f25286a == null) {
                mo29964r(a);
                if (!this.f25295b.isEmpty()) {
                    this.f25289a.mo39872I(new fg4(this).mo35940a(), getAppState());
                    if (SessionManager.getInstance().perfSession().mo36519f()) {
                        this.f25287a.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().mo36516d());
                        return;
                    }
                    return;
                }
                f25284a.mo46002c("Trace name is empty, no log is sent to server");
            }
        }
    }

    /* renamed from: u */
    public void mo29969u() {
        mo29964r(this.f25288a.mo34720a());
    }

    @Keep
    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeParcelable(this.f25286a, 0);
        parcel.writeString(this.f25295b);
        parcel.writeList(this.f25296b);
        parcel.writeMap(this.f25293a);
        parcel.writeParcelable(this.f25290a, 0);
        parcel.writeParcelable(this.f25294b, 0);
        synchronized (this.f25292a) {
            parcel.writeList(this.f25292a);
        }
    }
}
