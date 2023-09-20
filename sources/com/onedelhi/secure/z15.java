package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.C4311b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class z15 extends z25 {
    public static final Parcelable.Creator<z15> CREATOR = new C7426a();

    /* renamed from: com.onedelhi.secure.z15$a */
    public class C7426a implements Parcelable.Creator<z15> {
        public Object createFromParcel(Parcel parcel) {
            return new z15(parcel);
        }

        public Object[] newArray(int i) {
            return new z15[i];
        }
    }

    public z15() {
    }

    public z15(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public String mo48119a() {
        return (String) h15.get(mo48120b(), "redirectURL");
    }

    /* renamed from: b */
    public final JSONObject mo48120b() {
        return (JSONObject) get(C4311b.C4317f.C4318a.f25149a);
    }

    /* renamed from: c */
    public String mo48121c() {
        return (String) get("code");
    }

    /* renamed from: d */
    public List<d05> mo48122d() {
        d05 d05;
        getObjectFactory().getClass();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray = (JSONArray) h15.get(mo48120b(), "filteredUpiApps");
        } catch (Exception e) {
            m05.m56773d("RedirectResponse", e.getMessage(), e);
        }
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) h15.get(jSONArray, i);
                if (!(jSONObject == null || (d05 = (d05) h15.fromJsonString(jSONObject.toString(), getObjectFactory(), d05.class)) == null)) {
                    Boolean bool = (Boolean) d05.get("enabled");
                    if (bool == null ? true : bool.booleanValue()) {
                        arrayList.add(d05);
                    }
                }
            }
        }
        return arrayList;
    }

    public int describeContents() {
        return super.describeContents();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
