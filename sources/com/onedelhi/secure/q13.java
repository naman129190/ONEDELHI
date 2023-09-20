package com.onedelhi.secure;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class q13 {

    /* renamed from: a */
    public static final String f33939a = "PersistedInstallation";

    /* renamed from: b */
    public static final String f33940b = "Fid";

    /* renamed from: c */
    public static final String f33941c = "AuthToken";

    /* renamed from: d */
    public static final String f33942d = "RefreshToken";

    /* renamed from: e */
    public static final String f33943e = "TokenCreationEpochInSecs";

    /* renamed from: f */
    public static final String f33944f = "ExpiresInSecs";

    /* renamed from: g */
    public static final String f33945g = "Status";

    /* renamed from: h */
    public static final String f33946h = "FisError";
    @mr2

    /* renamed from: a */
    public final w31 f33947a;

    /* renamed from: a */
    public File f33948a;

    /* renamed from: com.onedelhi.secure.q13$a */
    public enum C6501a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public q13(@mr2 w31 w31) {
        this.f33947a = w31;
    }

    /* renamed from: a */
    public void mo43075a() {
        mo43076b().delete();
    }

    /* renamed from: b */
    public final File mo43076b() {
        if (this.f33948a == null) {
            synchronized (this) {
                if (this.f33948a == null) {
                    File filesDir = this.f33947a.mo46527n().getFilesDir();
                    this.f33948a = new File(filesDir, "PersistedInstallation." + this.f33947a.mo46530t() + ".json");
                }
            }
        }
        return this.f33948a;
    }

    @mr2
    /* renamed from: c */
    public r13 mo43077c(@mr2 r13 r13) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f33940b, r13.mo35943d());
            jSONObject.put(f33945g, r13.mo35947g().ordinal());
            jSONObject.put(f33941c, r13.mo35941b());
            jSONObject.put(f33942d, r13.mo35946f());
            jSONObject.put(f33943e, r13.mo35948h());
            jSONObject.put(f33944f, r13.mo35942c());
            jSONObject.put(f33946h, r13.mo35944e());
            File createTempFile = File.createTempFile(f33939a, "tmp", this.f33947a.mo46527n().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(mo43076b())) {
                return r13;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: d */
    public final JSONObject mo43078d() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(mo43076b());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @mr2
    /* renamed from: e */
    public r13 mo43079e() {
        JSONObject d = mo43078d();
        String optString = d.optString(f33940b, (String) null);
        int optInt = d.optInt(f33945g, C6501a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = d.optString(f33941c, (String) null);
        String optString3 = d.optString(f33942d, (String) null);
        long optLong = d.optLong(f33943e, 0);
        long optLong2 = d.optLong(f33944f, 0);
        return r13.m63311a().mo35955d(optString).mo35958g(C6501a.values()[optInt]).mo35953b(optString2).mo35957f(optString3).mo35959h(optLong).mo35954c(optLong2).mo35956e(d.optString(f33946h, (String) null)).mo35952a();
    }
}
