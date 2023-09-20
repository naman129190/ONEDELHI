package com.delhitransport.onedelhi.p002ev;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

/* renamed from: com.delhitransport.onedelhi.ev.EVRequest */
public class EVRequest {
    @nu3("available_chargers")
    @qy0
    private boolean available_chargers;
    @nu3("charger_type")
    @qy0
    private ArrayList<String> charger_type;
    @nu3("connector_type")
    @qy0
    private ArrayList<String> connector_type;
    @nu3("free_chargers")
    @qy0
    private boolean free_chargers;
    @nu3("latitude")
    @qy0
    private double latitude;
    @nu3("longitude")
    @qy0
    private double longitude;
    @nu3("station_type")
    @qy0
    private ArrayList<String> station_type;
    @nu3("vehicle_type")
    @qy0
    private ArrayList<String> vehicle_type;
    @nu3("vendor")
    @qy0
    private ArrayList<String> vendor;

    public EVRequest() {
    }

    public EVRequest(double d, double d2, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<String> arrayList5, boolean z, boolean z2) {
        this.latitude = d;
        this.longitude = d2;
        this.station_type = arrayList;
        this.vehicle_type = arrayList2;
        this.connector_type = arrayList3;
        this.vendor = arrayList4;
        this.charger_type = arrayList5;
        this.free_chargers = z;
        this.available_chargers = z2;
    }

    public ArrayList<String> getCharger_type() {
        return this.charger_type;
    }

    public ArrayList<String> getConnector_type() {
        return this.connector_type;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public ArrayList<String> getStation_type() {
        return this.station_type;
    }

    public ArrayList<String> getVehicle_type() {
        return this.vehicle_type;
    }

    public ArrayList<String> getVendor() {
        return this.vendor;
    }

    public boolean isAvailable_chargers() {
        return this.available_chargers;
    }

    public boolean isFree_chargers() {
        return this.free_chargers;
    }

    public void setAvailable_chargers(boolean z) {
        this.available_chargers = z;
    }

    public void setCharger_type(ArrayList<String> arrayList) {
        this.charger_type = arrayList;
    }

    public void setConnector_type(ArrayList<String> arrayList) {
        this.connector_type = arrayList;
    }

    public void setFree_chargers(boolean z) {
        this.free_chargers = z;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setStation_type(ArrayList<String> arrayList) {
        this.station_type = arrayList;
    }

    public void setVehicle_type(ArrayList<String> arrayList) {
        this.vehicle_type = arrayList;
    }

    public void setVendor(ArrayList<String> arrayList) {
        this.vendor = arrayList;
    }
}
