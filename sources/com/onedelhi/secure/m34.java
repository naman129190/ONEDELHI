package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;
import com.onedelhi.secure.C6723rz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class m34<T extends C6723rz> implements C6622qz<T> {

    /* renamed from: a */
    public final LatLng f32004a;

    /* renamed from: a */
    public final List<T> f32005a = new ArrayList();

    public m34(LatLng latLng) {
        this.f32004a = latLng;
    }

    /* renamed from: a */
    public LatLng mo39427a() {
        return this.f32004a;
    }

    /* renamed from: b */
    public Collection<T> mo39428b() {
        return this.f32005a;
    }

    /* renamed from: c */
    public int mo39429c() {
        return this.f32005a.size();
    }

    /* renamed from: d */
    public boolean mo40476d(T t) {
        return this.f32005a.add(t);
    }

    /* renamed from: e */
    public boolean mo40477e(T t) {
        return this.f32005a.remove(t);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m34)) {
            return false;
        }
        m34 m34 = (m34) obj;
        return m34.f32004a.equals(this.f32004a) && m34.f32005a.equals(this.f32005a);
    }

    public int hashCode() {
        return this.f32004a.hashCode() + this.f32005a.hashCode();
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.f32004a + ", mItems.size=" + this.f32005a.size() + '}';
    }
}
