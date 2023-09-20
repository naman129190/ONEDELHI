package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class vz1 implements nz1<ArrayList<ArrayList<LatLng>>> {

    /* renamed from: a */
    public static final String f36786a = "Polygon";

    /* renamed from: a */
    public final ArrayList<LatLng> f36787a;

    /* renamed from: b */
    public final ArrayList<ArrayList<LatLng>> f36788b;

    public vz1(ArrayList<LatLng> arrayList, ArrayList<ArrayList<LatLng>> arrayList2) {
        if (arrayList != null) {
            this.f36787a = arrayList;
            this.f36788b = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Outer boundary coordinates cannot be null");
    }

    /* renamed from: a */
    public String mo41500a() {
        return "Polygon";
    }

    /* renamed from: c */
    public ArrayList<ArrayList<LatLng>> mo41501b() {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        arrayList.add(this.f36787a);
        ArrayList<ArrayList<LatLng>> arrayList2 = this.f36788b;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: d */
    public ArrayList<ArrayList<LatLng>> mo46450d() {
        return this.f36788b;
    }

    /* renamed from: e */
    public ArrayList<LatLng> mo46451e() {
        return this.f36787a;
    }

    public String toString() {
        return "Polygon" + to1.f35745h + "\n outer coordinates=" + this.f36787a + ",\n inner coordinates=" + this.f36788b + "\n}\n";
    }
}
