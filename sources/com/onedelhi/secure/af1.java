package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

public class af1 extends Observable implements Observer {

    /* renamed from: a */
    public final LatLngBounds f25821a;

    /* renamed from: a */
    public bf1 f25822a;

    /* renamed from: a */
    public ff1 f25823a;

    /* renamed from: a */
    public lf1 f25824a;

    /* renamed from: a */
    public nf1 f25825a;

    /* renamed from: a */
    public final String f25826a;

    /* renamed from: a */
    public final HashMap<String, String> f25827a;

    public af1(bf1 bf1, String str, HashMap<String, String> hashMap, LatLngBounds latLngBounds) {
        this.f25822a = bf1;
        this.f25826a = str;
        this.f25821a = latLngBounds;
        if (hashMap == null) {
            this.f25827a = new HashMap<>();
        } else {
            this.f25827a = hashMap;
        }
    }

    /* renamed from: a */
    public final void mo30897a(pf1 pf1) {
        if (this.f25822a != null && Arrays.asList(pf1.mo35881b()).contains(this.f25822a.mo31558h())) {
            setChanged();
            notifyObservers();
        }
    }

    /* renamed from: b */
    public LatLngBounds mo30898b() {
        return this.f25821a;
    }

    /* renamed from: c */
    public bf1 mo30899c() {
        return this.f25822a;
    }

    /* renamed from: d */
    public String mo30900d() {
        return this.f25826a;
    }

    /* renamed from: e */
    public ff1 mo30901e() {
        return this.f25823a;
    }

    /* renamed from: f */
    public lf1 mo30902f() {
        return this.f25824a;
    }

    /* renamed from: g */
    public nf1 mo30903g() {
        return this.f25825a;
    }

    /* renamed from: h */
    public String mo30904h(String str) {
        return this.f25827a.get(str);
    }

    /* renamed from: i */
    public Iterable<String> mo30905i() {
        return this.f25827a.keySet();
    }

    /* renamed from: j */
    public boolean mo30906j() {
        return this.f25822a != null;
    }

    /* renamed from: k */
    public boolean mo30907k(String str) {
        return this.f25827a.containsKey(str);
    }

    /* renamed from: l */
    public String mo30908l(String str) {
        return this.f25827a.remove(str);
    }

    /* renamed from: m */
    public void mo30909m(bf1 bf1) {
        this.f25822a = bf1;
        setChanged();
        notifyObservers();
    }

    /* renamed from: n */
    public void mo30910n(ff1 ff1) {
        if (ff1 != null) {
            ff1 ff12 = this.f25823a;
            if (ff12 != null) {
                ff12.deleteObserver(this);
            }
            this.f25823a = ff1;
            ff1.addObserver(this);
            mo30897a(this.f25823a);
            return;
        }
        throw new IllegalArgumentException("Line string style cannot be null");
    }

    /* renamed from: o */
    public void mo30911o(lf1 lf1) {
        if (lf1 != null) {
            lf1 lf12 = this.f25824a;
            if (lf12 != null) {
                lf12.deleteObserver(this);
            }
            this.f25824a = lf1;
            lf1.addObserver(this);
            mo30897a(this.f25824a);
            return;
        }
        throw new IllegalArgumentException("Point style cannot be null");
    }

    /* renamed from: p */
    public void mo30912p(nf1 nf1) {
        if (nf1 != null) {
            nf1 nf12 = this.f25825a;
            if (nf12 != null) {
                nf12.deleteObserver(this);
            }
            this.f25825a = nf1;
            nf1.addObserver(this);
            mo30897a(this.f25825a);
            return;
        }
        throw new IllegalArgumentException("Polygon style cannot be null");
    }

    /* renamed from: q */
    public String mo30913q(String str, String str2) {
        return this.f25827a.put(str, str2);
    }

    public String toString() {
        return "Feature{" + "\n bounding box=" + this.f25821a + ",\n geometry=" + this.f25822a + ",\n point style=" + this.f25824a + ",\n line string style=" + this.f25823a + ",\n polygon style=" + this.f25825a + ",\n id=" + this.f25826a + ",\n properties=" + this.f25827a + "\n}\n";
    }

    public void update(Observable observable, Object obj) {
        if (observable instanceof pf1) {
            mo30897a((pf1) observable);
        }
    }
}
