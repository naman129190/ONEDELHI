package jmjou;

import android.app.Activity;
import android.content.IntentFilter;
import android.webkit.JavascriptInterface;
import androidx.appcompat.widget.C0358b;
import com.onedelhi.secure.b25;
import com.onedelhi.secure.g05;
import com.onedelhi.secure.j15;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.m15;
import com.onedelhi.secure.o15;
import com.onedelhi.secure.r15;
import com.onedelhi.secure.x25;
import com.phonepe.intent.sdk.bridges.PermissionsHandler;
import jmjou.C7601c;
import org.json.JSONArray;

/* renamed from: jmjou.d */
public class C7605d implements g05, C7606e {

    /* renamed from: a */
    public Activity f38780a;

    /* renamed from: a */
    public j15 f38781a;

    /* renamed from: a */
    public C7601c f38782a;

    /* renamed from: a */
    public wlgrx f38783a;

    /* renamed from: b */
    public String f38784b;

    /* renamed from: c */
    public String f38785c;

    /* renamed from: d */
    public String f38786d;

    /* renamed from: a */
    public final void mo48881a() {
        this.f38783a.f38787a = this;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
        intentFilter.setPriority(999);
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.f38780a.registerReceiver(this.f38783a, intentFilter);
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f38780a = (Activity) (aVar.containsKey(C0358b.f1779e) ? aVar.get(C0358b.f1779e) : null);
        this.f38783a = (wlgrx) cVar.mo48873i(wlgrx.class);
        this.f38781a = (j15) aVar.get("bridgeCallback");
        this.f38782a = cVar;
    }

    public boolean isCachingAllowed() {
        return false;
    }

    @JavascriptInterface
    public void startListeningToOTP(String str, String str2, String str3) {
        this.f38784b = str3;
        this.f38785c = str;
        this.f38786d = str2;
        m05.m56772c("SMSManager", String.format("listening to otp : jsCallback = {%s}, context = {%s}, jsData = {%s}", new Object[]{str3, str, str2}));
        if (!o15.m58890a(this.f38780a, "android.permission.SEND_SMS") || !o15.m58890a(this.f38780a, "android.permission.RECEIVE_SMS") || !o15.m58890a(this.f38780a, "android.permission.READ_SMS")) {
            m05.m56771b("SMSManager", "calling permission error call back for SEND_SMS...");
            m15 m15 = (m15) this.f38782a.mo48873i(m15.class);
            m15.put("code", PermissionsHandler.PERMISSION_NOT_GRANTED);
            String jsonString = m15.toJsonString();
            b25 b25 = (b25) this.f38782a.mo48873i(b25.class);
            b25.put("permissionType", "android.permission.SEND_SMS");
            x25 x25 = (x25) this.f38782a.mo48873i(x25.class);
            JSONArray jSONArray = (JSONArray) x25.get("permission");
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(b25.getJsonObject());
            x25.put("permission", jSONArray);
            r15 r15 = (r15) this.f38782a.mo48873i(r15.class);
            r15.mo43794a(x25);
            String jsonString2 = r15.toJsonString();
            m05.m56772c("SMSManager", String.format("calling onBridgeCallBack  callback = {%s}, error = {%s}, response={%s}, context={%s}, body={%s}.", new Object[]{this.f38784b, jsonString, null, this.f38785c, jsonString2}));
            this.f38781a.mo18086c(this.f38784b, jsonString, (String) null, this.f38785c, jsonString2);
            return;
        }
        mo48881a();
    }

    @JavascriptInterface
    public void stopListeningToOTP() {
        try {
            m05.m56772c("SMSManager", "trying to unregister sms receiver...");
            this.f38780a.unregisterReceiver(this.f38783a);
            m05.m56772c("SMSManager", "sms receiver unregistered successfully");
        } catch (IllegalArgumentException e) {
            m05.m56771b("SMSManager", String.format("sms receiver un-registration failed with message {%s} . ignore if sms receiver was not registered in first place", new Object[]{e.getMessage()}));
        }
    }
}
