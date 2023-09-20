package com.onedelhi.secure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* renamed from: com.onedelhi.secure.js */
public class C5844js {

    /* renamed from: a */
    public static final String f30924a = "com.crashlytics.settings.json";

    /* renamed from: a */
    public final File f30925a;

    public C5844js(t21 t21) {
        this.f30925a = t21.mo44760f(f30924a);
    }

    /* renamed from: a */
    public final File mo38837a() {
        return this.f30925a;
    }

    /* renamed from: b */
    public JSONObject mo38838b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        o92.m59120f().mo41613b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a = mo38837a();
            if (a.exists()) {
                fileInputStream = new FileInputStream(a);
                try {
                    jSONObject = new JSONObject(u10.m66353H(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        o92.m59120f().mo41616e("Failed to fetch cached settings", e);
                        u10.m66358e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        u10.m66358e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                o92.m59120f().mo41621k("Settings file does not exist.");
                jSONObject = null;
            }
            u10.m66358e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            o92.m59120f().mo41616e("Failed to fetch cached settings", e);
            u10.m66358e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            u10.m66358e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void mo38839c(long j, JSONObject jSONObject) {
        o92.m59120f().mo41621k("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put(jw3.f30971a, j);
                FileWriter fileWriter2 = new FileWriter(mo38837a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    u10.m66358e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        o92.m59120f().mo41616e("Failed to cache settings", e);
                        u10.m66358e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        u10.m66358e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    u10.m66358e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                o92.m59120f().mo41616e("Failed to cache settings", e);
                u10.m66358e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
