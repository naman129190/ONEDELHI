package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import jmjou.C7601c;
import org.json.JSONObject;

public class z25 extends h15 implements Parcelable {
    public static final Parcelable.Creator<z25> CREATOR = new C7428a();
    public C7601c cqqlq;
    public JSONObject irjuc;

    /* renamed from: com.onedelhi.secure.z25$a */
    public class C7428a implements Parcelable.Creator<z25> {
        public Object createFromParcel(Parcel parcel) {
            return new z25(parcel);
        }

        public Object[] newArray(int i) {
            return new z25[i];
        }
    }

    public z25() {
    }

    public z25(Parcel parcel) {
        C7601c cVar = (C7601c) parcel.readParcelable(z25.class.getClassLoader());
        this.cqqlq = cVar;
        this.irjuc = cVar.mo48866b(parcel.readString());
    }

    public int describeContents() {
        return 0;
    }

    public JSONObject getJsonObject() {
        return this.irjuc;
    }

    public C7601c getObjectFactory() {
        return this.cqqlq;
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        JSONObject jSONObject;
        super.init(cVar, aVar);
        this.cqqlq = cVar;
        if (aVar == null || !aVar.containsKey(h15.TAG)) {
            getObjectFactory().getClass();
            jSONObject = new JSONObject();
        } else {
            jSONObject = (JSONObject) aVar.get(h15.TAG);
        }
        this.irjuc = jSONObject;
    }

    public JSONObject toJsonObject() {
        return getJsonObject();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.cqqlq, i);
        parcel.writeString(getJsonObject().toString());
    }
}
