package jmjou;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.onedelhi.secure.g05;
import com.onedelhi.secure.h15;
import com.onedelhi.secure.i05;
import com.onedelhi.secure.l05;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.pz4;
import com.onedelhi.secure.r15;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jmjou.C7601c;

public class wlgrx extends BroadcastReceiver implements C7606e {

    /* renamed from: a */
    public g05 f38787a;

    /* renamed from: a */
    public final void mo48884a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (!l05.m55206j(extras, "SmsReceiver", "bundle")) {
            Object[] objArr = (Object[]) extras.get("pdus");
            if (!l05.m55206j(objArr, "SmsReceiver", "pdus")) {
                for (Object obj : objArr) {
                    byte[] bArr = (byte[]) obj;
                    SmsMessage createFromPdu = Build.VERSION.SDK_INT >= 23 ? SmsMessage.createFromPdu(bArr, "3gpp") : SmsMessage.createFromPdu(bArr);
                    createFromPdu.getDisplayOriginatingAddress();
                    String displayMessageBody = createFromPdu.getDisplayMessageBody();
                    if (this.f38787a != null) {
                        m05.m56772c("SmsReceiver", "calling sms listener ...");
                        C7605d dVar = (C7605d) this.f38787a;
                        Matcher matcher = Pattern.compile((String) ((pz4) h15.fromJsonString(dVar.f38786d, dVar.f38782a, pz4.class)).get("regex")).matcher(displayMessageBody);
                        if (!matcher.find() || matcher.groupCount() <= 0) {
                            m05.m56772c("SMSManager", "message not matched");
                        } else {
                            String group = matcher.group(1);
                            i05 i05 = (i05) dVar.f38782a.mo48873i(i05.class);
                            i05.put("otp", group);
                            r15 r15 = (r15) dVar.f38782a.mo48873i(r15.class);
                            String jsonString = dVar.f38782a.mo48876m("SUCCESS").toJsonString();
                            r15.mo43794a(i05);
                            String jsonString2 = r15.toJsonString();
                            m05.m56772c("SMSManager", String.format("calling onBridgeCallBack  callback = {%s}, error = {%s}, response={%s}, context={%s}, body={%s}.", new Object[]{dVar.f38784b, null, jsonString, dVar.f38785c, jsonString2}));
                            dVar.f38781a.mo18086c(dVar.f38784b, (String) null, jsonString, dVar.f38785c, jsonString2);
                        }
                    }
                }
            }
        }
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
    }

    public boolean isCachingAllowed() {
        return true;
    }

    public void onReceive(Context context, Intent intent) {
        m05.m56774e("SmsReceiver", "Received triggered in SmsReceiver");
        try {
            mo48884a(intent);
        } catch (Exception e) {
            m05.m56773d("SmsReceiver", String.format("sms parsing failed with exception = {%s}, intent = {%s}.", new Object[]{e.getMessage(), intent.toString()}), e);
        }
    }
}
