package com.phonepe.intent.sdk.bridges;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import androidx.appcompat.widget.C0358b;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.b25;
import com.onedelhi.secure.h15;
import com.onedelhi.secure.j15;
import com.onedelhi.secure.k05;
import com.onedelhi.secure.l05;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.r15;
import com.onedelhi.secure.v15;
import com.onedelhi.secure.x25;
import java.util.ArrayList;
import java.util.Iterator;
import jmjou.C7601c;
import jmjou.C7606e;
import org.json.JSONArray;
import org.json.JSONException;

public class PermissionsHandler implements C7606e {
    public static final int JS_PERMISSIONS = 1011;
    public static final String PERMISSION_NOT_GRANTED = "PERMISSION_NOT_GRANTED";
    public static final String TAG = "PermissionManager";
    public String chmha;
    public j15 cqqlq;
    public Activity irjuc;

    /* renamed from: jmjou  reason: collision with root package name */
    public String f38915jmjou;
    public C7601c rmqfk;

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        Object obj = null;
        this.irjuc = (Activity) (aVar.containsKey(C0358b.f1779e) ? aVar.get(C0358b.f1779e) : null);
        if (aVar.containsKey("bridgeCallback")) {
            obj = aVar.get("bridgeCallback");
        }
        this.cqqlq = (j15) obj;
        this.rmqfk = cVar;
    }

    public boolean isCachingAllowed() {
        return false;
    }

    public void onPermissionReceived(String[] strArr, int[] iArr) {
        this.rmqfk.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            b25 b25 = (b25) this.rmqfk.mo48873i(b25.class);
            b25.put("permissionType", strArr[i]);
            b25.put("permissionGranted", Boolean.valueOf(iArr[i] == 0));
            b25.put("shouldShowRationale", Boolean.valueOf(C3962y2.m31865M(this.irjuc, strArr[i])));
            arrayList.add(b25);
        }
        r15 r15 = (r15) this.rmqfk.mo48873i(r15.class);
        x25 x25 = (x25) this.rmqfk.mo48873i(x25.class);
        x25.getClass();
        if (!l05.m55206j(arrayList, "PermissionsBody", "permissions") && !l05.m55206j(x25.getJsonObject(), "PermissionsBody", "jsonObject")) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(((b25) it.next()).getJsonObject());
            }
            x25.put("permission", jSONArray);
        }
        r15.mo43794a(x25);
        this.cqqlq.mo18086c(this.f38915jmjou, (String) null, this.rmqfk.mo48876m("SUCCESS").toJsonString(), this.chmha, r15.toJsonString());
    }

    @JavascriptInterface
    public void openSettingsPageForPermission(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.irjuc.getPackageName(), (String) null));
        this.irjuc.startActivity(intent);
    }

    @JavascriptInterface
    public void seekPermission(String str, String str2, String str3) {
        this.chmha = str;
        this.f38915jmjou = str3;
        k05 k05 = (k05) h15.fromJsonString(str2, this.rmqfk, k05.class);
        k05.getObjectFactory().getClass();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray b = v15.m67587b(k05.getJsonObject(), "permissions", false, false);
            for (int i = 0; i < b.length(); i++) {
                arrayList.add("android.permission." + b.get(i).toString());
            }
        } catch (JSONException e) {
            m05.m56771b("PermissionData", String.format("JSONException with msg = {%s} for the key {%s}", new Object[]{e.getMessage(), "permission"}));
        }
        C3962y2.m31859G(this.irjuc, (String[]) arrayList.toArray(new String[arrayList.size()]), 1011);
    }

    @JavascriptInterface
    public void seekPermissions(String str, String str2, String str3) {
        this.chmha = str;
        this.f38915jmjou = str3;
        k05 k05 = (k05) h15.fromJsonString(str2, this.rmqfk, k05.class);
        k05.getObjectFactory().getClass();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray b = v15.m67587b(k05.getJsonObject(), "permissions", false, false);
            for (int i = 0; i < b.length(); i++) {
                arrayList.add(b.get(i).toString());
            }
        } catch (JSONException e) {
            m05.m56771b("PermissionData", String.format("JSONException with msg = {%s} for the key {%s}", new Object[]{e.getMessage(), "permission"}));
        }
        C3962y2.m31859G(this.irjuc, (String[]) arrayList.toArray(new String[arrayList.size()]), 1011);
    }
}
