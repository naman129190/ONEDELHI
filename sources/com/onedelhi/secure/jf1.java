package com.onedelhi.secure;

import android.util.Log;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class jf1 {

    /* renamed from: a */
    public static final String f30732a = "GeoJsonParser";

    /* renamed from: b */
    public static final String f30733b = "Feature";

    /* renamed from: c */
    public static final String f30734c = "geometry";

    /* renamed from: d */
    public static final String f30735d = "id";

    /* renamed from: e */
    public static final String f30736e = "FeatureCollection";

    /* renamed from: f */
    public static final String f30737f = "features";

    /* renamed from: g */
    public static final String f30738g = "coordinates";

    /* renamed from: h */
    public static final String f30739h = "GeometryCollection";

    /* renamed from: i */
    public static final String f30740i = "geometries";

    /* renamed from: j */
    public static final String f30741j = "bbox";

    /* renamed from: k */
    public static final String f30742k = "properties";

    /* renamed from: l */
    public static final String f30743l = "Point";

    /* renamed from: m */
    public static final String f30744m = "MultiPoint";

    /* renamed from: n */
    public static final String f30745n = "LineString";

    /* renamed from: o */
    public static final String f30746o = "MultiLineString";

    /* renamed from: p */
    public static final String f30747p = "Polygon";

    /* renamed from: q */
    public static final String f30748q = "MultiPolygon";

    /* renamed from: a */
    public LatLngBounds f30749a = null;

    /* renamed from: a */
    public final ArrayList<af1> f30750a = new ArrayList<>();

    /* renamed from: a */
    public final JSONObject f30751a;

    public jf1(JSONObject jSONObject) {
        this.f30751a = jSONObject;
        mo38612r();
    }

    /* renamed from: a */
    public static bf1 m53288a(String str, JSONArray jSONArray) throws JSONException {
        if (str.equals("Point")) {
            return m53294g(jSONArray);
        }
        if (str.equals("MultiPoint")) {
            return m53292e(jSONArray);
        }
        if (str.equals("LineString")) {
            return m53290c(jSONArray);
        }
        if (str.equals("MultiLineString")) {
            return m53291d(jSONArray);
        }
        if (str.equals("Polygon")) {
            return m53295h(jSONArray);
        }
        if (str.equals("MultiPolygon")) {
            return m53293f(jSONArray);
        }
        if (str.equals("GeometryCollection")) {
            return m53289b(jSONArray);
        }
        return null;
    }

    /* renamed from: b */
    public static cf1 m53289b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            bf1 s = m53302s(jSONArray.getJSONObject(i));
            if (s != null) {
                arrayList.add(s);
            }
        }
        return new cf1(arrayList);
    }

    /* renamed from: c */
    public static ef1 m53290c(JSONArray jSONArray) throws JSONException {
        return new ef1(m53299n(jSONArray));
    }

    /* renamed from: d */
    public static gf1 m53291d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m53290c(jSONArray.getJSONArray(i)));
        }
        return new gf1(arrayList);
    }

    /* renamed from: e */
    public static hf1 m53292e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m53294g(jSONArray.getJSONArray(i)));
        }
        return new hf1(arrayList);
    }

    /* renamed from: f */
    public static if1 m53293f(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m53295h(jSONArray.getJSONArray(i)));
        }
        return new if1(arrayList);
    }

    /* renamed from: g */
    public static kf1 m53294g(JSONArray jSONArray) throws JSONException {
        return new kf1(m53298m(jSONArray));
    }

    /* renamed from: h */
    public static mf1 m53295h(JSONArray jSONArray) throws JSONException {
        return new mf1(m53300o(jSONArray));
    }

    /* renamed from: k */
    public static boolean m53296k(String str) {
        return str.matches("Point|MultiPoint|LineString|MultiLineString|Polygon|MultiPolygon|GeometryCollection");
    }

    /* renamed from: l */
    public static LatLngBounds m53297l(JSONArray jSONArray) throws JSONException {
        return new LatLngBounds(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), new LatLng(jSONArray.getDouble(3), jSONArray.getDouble(2)));
    }

    /* renamed from: m */
    public static LatLng m53298m(JSONArray jSONArray) throws JSONException {
        return new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0));
    }

    /* renamed from: n */
    public static ArrayList<LatLng> m53299n(JSONArray jSONArray) throws JSONException {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m53298m(jSONArray.getJSONArray(i)));
        }
        return arrayList;
    }

    /* renamed from: o */
    public static ArrayList<ArrayList<LatLng>> m53300o(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m53299n(jSONArray.getJSONArray(i)));
        }
        return arrayList;
    }

    /* renamed from: p */
    public static af1 m53301p(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            String string = jSONObject.has("id") ? jSONObject.getString("id") : null;
            LatLngBounds l = jSONObject.has(f30741j) ? m53297l(jSONObject.getJSONArray(f30741j)) : null;
            bf1 s = (!jSONObject.has(f30734c) || jSONObject.isNull(f30734c)) ? null : m53302s(jSONObject.getJSONObject(f30734c));
            if (jSONObject.has(f30742k) && !jSONObject.isNull(f30742k)) {
                hashMap = m53304u(jSONObject.getJSONObject(f30742k));
            }
            return new af1(s, string, hashMap, l);
        } catch (JSONException unused) {
            Log.w(f30732a, "Feature could not be successfully parsed " + jSONObject.toString());
            return null;
        }
    }

    /* renamed from: s */
    public static bf1 m53302s(JSONObject jSONObject) {
        String str;
        try {
            String string = jSONObject.getString("type");
            if (string.equals("GeometryCollection")) {
                str = f30740i;
            } else {
                if (m53296k(string)) {
                    str = f30738g;
                }
                return null;
            }
            return m53288a(string, jSONObject.getJSONArray(str));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: t */
    public static af1 m53303t(JSONObject jSONObject) {
        bf1 s = m53302s(jSONObject);
        if (s != null) {
            return new af1(s, (String) null, new HashMap(), (LatLngBounds) null);
        }
        Log.w(f30732a, "Geometry could not be parsed");
        return null;
    }

    /* renamed from: u */
    public static HashMap<String, String> m53304u(JSONObject jSONObject) throws JSONException {
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.getString(next));
        }
        return hashMap;
    }

    /* renamed from: i */
    public LatLngBounds mo38609i() {
        return this.f30749a;
    }

    /* renamed from: j */
    public ArrayList<af1> mo38610j() {
        return this.f30750a;
    }

    /* renamed from: q */
    public final ArrayList<af1> mo38611q(JSONObject jSONObject) {
        ArrayList<af1> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("features");
            if (jSONObject.has(f30741j)) {
                this.f30749a = m53297l(jSONObject.getJSONArray(f30741j));
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2.getString("type").equals(f30733b)) {
                        af1 p = m53301p(jSONObject2);
                        if (p != null) {
                            arrayList.add(p);
                        } else {
                            Log.w(f30732a, "Index of Feature in Feature Collection that could not be created: " + i);
                        }
                    }
                } catch (JSONException unused) {
                    Log.w(f30732a, "Index of Feature in Feature Collection that could not be created: " + i);
                }
            }
            return arrayList;
        } catch (JSONException unused2) {
            Log.w(f30732a, "Feature Collection could not be created.");
            return arrayList;
        }
    }

    /* renamed from: r */
    public final void mo38612r() {
        af1 t;
        try {
            String string = this.f30751a.getString("type");
            if (string.equals(f30733b)) {
                t = m53301p(this.f30751a);
                if (t == null) {
                    return;
                }
            } else if (string.equals(f30736e)) {
                this.f30750a.addAll(mo38611q(this.f30751a));
                return;
            } else if (m53296k(string)) {
                t = m53303t(this.f30751a);
                if (t == null) {
                    return;
                }
            } else {
                Log.w(f30732a, "GeoJSON file could not be parsed.");
                return;
            }
            this.f30750a.add(t);
        } catch (JSONException unused) {
            Log.w(f30732a, "GeoJSON file could not be parsed.");
        }
    }
}
