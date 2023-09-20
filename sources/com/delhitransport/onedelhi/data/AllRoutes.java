package com.delhitransport.onedelhi.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import com.onedelhi.secure.r10;
import com.onedelhi.secure.vu0;
import com.onedelhi.secure.w43;

@vu0(tableName = "AllRoutes")
public class AllRoutes implements Parcelable {
    public static final Parcelable.Creator<AllRoutes> CREATOR = new Parcelable.Creator<AllRoutes>() {
        public AllRoutes createFromParcel(Parcel parcel) {
            return new AllRoutes(parcel);
        }

        public AllRoutes[] newArray(int i) {
            return new AllRoutes[i];
        }
    };
    @nu3("direction")
    @qy0
    @r10(name = "direction")
    private String direction;
    @nu3("end")
    @qy0
    @r10(name = "end")
    private String end;
    @nu3("id")
    @mr2
    @w43
    @qy0
    @r10(name = "id")

    /* renamed from: id */
    private String f7029id;
    @nu3("long_name")
    @qy0
    @r10(name = "long_name")
    private String longName;
    @nu3("route")
    @qy0
    @r10(name = "route")
    private String route;
    @nu3("short_name")
    @qy0
    @r10(name = "short_name")
    private String shortName;
    @nu3("start")
    @qy0
    @r10(name = "start")
    private String start;

    public AllRoutes(Parcel parcel) {
    }

    public AllRoutes(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7029id = str;
        this.route = str2;
        this.shortName = str3;
        this.longName = str4;
        this.end = str5;
        this.start = str6;
        this.direction = str7;
    }

    public int describeContents() {
        return 0;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getEnd() {
        return this.end;
    }

    public String getId() {
        return this.f7029id;
    }

    public String getLongName() {
        return this.longName;
    }

    public String getRoute() {
        return this.route;
    }

    public String getShortName() {
        return this.shortName;
    }

    public String getStart() {
        return this.start;
    }

    public void setDirection(String str) {
        this.direction = str;
    }

    public void setEnd(String str) {
        this.end = str;
    }

    public void setId(String str) {
        this.f7029id = str;
    }

    public void setLongName(String str) {
        this.longName = str;
    }

    public void setRoute(String str) {
        this.route = str;
    }

    public void setShortName(String str) {
        this.shortName = str;
    }

    public void setStart(String str) {
        this.start = str;
    }

    @mr2
    public String toString() {
        return "\nid: " + this.f7029id + "\nroute: " + this.route + "\nshort_name: " + this.shortName + "\nlong_name: " + this.longName + "\nend: " + this.end + "\nstart: " + this.start + "\ndirection: " + this.direction;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(String.valueOf(this.f7029id));
        parcel.writeString(this.route);
        parcel.writeString(this.shortName);
        parcel.writeString(this.longName);
        parcel.writeString(this.end);
        parcel.writeString(this.start);
        parcel.writeString(this.direction);
    }
}
