package easypay.appinvoke.actions;

import android.text.TextUtils;
import com.onedelhi.secure.C5706ib;
import com.onedelhi.secure.C5762j5;
import easypay.appinvoke.manager.PaytmAssist;
import java.io.Serializable;
import java.util.HashMap;

public class GAEventManager implements C5762j5, Serializable {

    /* renamed from: a */
    public HashMap<String, Object> f38714a = new HashMap<>();

    /* renamed from: A */
    public void mo38399A(boolean z) {
        this.f38714a.put("isNbSubmitButtonClicked", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isNbSubmitButtonClicked:" + z, this);
    }

    /* renamed from: B */
    public void mo38400B(boolean z) {
        this.f38714a.put("isAutoFillUserIdSuccess", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isAutoFillUserIdSuccess:" + z, this);
    }

    /* renamed from: C */
    public void mo38401C(boolean z) {
        this.f38714a.put("NBIsotpSelected", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:NbIsotpSelected:" + z, this);
    }

    /* renamed from: D */
    public void mo38402D(boolean z) {
        this.f38714a.put("isNetbanking", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isNetbanking:" + z, this);
    }

    /* renamed from: E */
    public void mo38403E(String str) {
        this.f38714a.put("acsUrlRequested", str);
    }

    /* renamed from: F */
    public void mo38404F(boolean z) {
        this.f38714a.put("isSubmitted", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isSubmitted:" + z, this);
    }

    /* renamed from: G */
    public void mo38405G(boolean z) {
        this.f38714a.put("smsDetected", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:smsDetected:" + z, this);
    }

    /* renamed from: H */
    public void mo38406H(boolean z) {
    }

    /* renamed from: I */
    public void mo38407I(String str) {
    }

    /* renamed from: J */
    public void mo38408J(boolean z) {
        PaytmAssist.getAssistInstance().getmEventMap().put("isAutoFillSuccess", Boolean.valueOf(z));
        this.f38714a.put("isAutoFillSuccess", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isAutoFillSuccess:" + z, this);
    }

    /* renamed from: K */
    public void mo38409K(boolean z) {
        this.f38714a.put("isRememberUserIdChecked", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isRememberUserIdChecked:" + z, this);
    }

    /* renamed from: L */
    public void mo38410L(boolean z) {
        this.f38714a.put("NBOtpSubmitted", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:NBOtpSubmitted:" + z, this);
    }

    /* renamed from: M */
    public void mo38411M(boolean z) {
        this.f38714a.put("isPauseButtonTapped", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isPauseButtonTapped:" + z, this);
    }

    /* renamed from: N */
    public void mo38412N(boolean z) {
        this.f38714a.put("isShowPasswordClicked", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isShowPasswordClicked:" + z, this);
    }

    /* renamed from: O */
    public HashMap<String, Object> mo48735O() {
        return this.f38714a;
    }

    /* renamed from: a */
    public void mo38413a(boolean z) {
    }

    /* renamed from: b */
    public void mo38414b(StringBuilder sb) {
        this.f38714a.put("redirectUrls", sb.toString());
        C5706ib.m51978a("AssistAnalytics:redirectUrls:" + sb.toString(), this);
    }

    /* renamed from: c */
    public void mo38415c(String str) {
        this.f38714a.put("acsUrl", str);
        C5706ib.m51978a("AssistAnalytics:acsUrl:" + str, this);
    }

    /* renamed from: d */
    public void mo38416d(String str) {
        this.f38714a.put("sender", str);
        C5706ib.m51978a("AssistAnalytics:sender:" + str, this);
    }

    /* renamed from: e */
    public void mo38417e(String str) {
        this.f38714a.put("mid", str);
    }

    /* renamed from: f */
    public void mo38418f(boolean z) {
        this.f38714a.put("isSMSRead", Boolean.TRUE);
        this.f38714a.put("otp", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isSMSRead:" + z, this);
    }

    /* renamed from: g */
    public void mo38419g(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f38714a.put("NBPageUrl", str);
            this.f38714a.put("acsUrl", str);
        } else {
            this.f38714a.put("NBPageUrl", "URl Not supported|couldnot invoke netbaking asssist");
        }
        C5706ib.m51978a("AssistAnalytics:NbPageUrl:" + str, this);
    }

    /* renamed from: h */
    public void mo38420h(String str) {
        this.f38714a.put("cardIssuer", str);
        C5706ib.m51978a("AssistAnalytics:cardIssuer:" + str, this);
    }

    /* renamed from: i */
    public void mo38421i() {
    }

    /* renamed from: j */
    public void mo38422j(Object obj) {
        try {
            this.f38714a.put("extendedInfo", (HashMap) obj);
            C5706ib.m51978a("AssistAnalytics:extendedInfo:" + obj.toString(), this);
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: k */
    public void mo38423k(boolean z) {
        this.f38714a.put("isAssistEnable", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isAssistEnabled:" + z, this);
    }

    /* renamed from: l */
    public void mo38424l(String str) {
    }

    /* renamed from: m */
    public void mo38425m(boolean z) {
        this.f38714a.put("isBankEnabled", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isBankEnabled:" + z, this);
    }

    /* renamed from: n */
    public void mo38426n(boolean z) {
        this.f38714a.put("smsPermission", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:smsPermission:" + z, this);
    }

    /* renamed from: o */
    public void mo38427o(Boolean bool) {
        String str;
        HashMap<String, Object> hashMap;
        C5706ib.m51978a("AssistAnalytics:backPressClicked:" + bool, this);
        if (PaytmAssist.getAssistInstance().isFragmentResumed()) {
            if (!TextUtils.isEmpty(PaytmAssist.getAssistInstance().getLastLoadedUrl()) && !PaytmAssist.getAssistInstance().getLastLoadedUrl().contains("paytm")) {
                hashMap = this.f38714a;
                str = "isBackClickedOnAcsPage";
            } else {
                return;
            }
        } else if (!PaytmAssist.getAssistInstance().isFragmentPaused()) {
            hashMap = this.f38714a;
            str = "backPressClicked";
        } else {
            return;
        }
        hashMap.put(str, bool);
    }

    /* renamed from: p */
    public void mo38428p(boolean z) {
        this.f38714a.put("NonOTPRequest", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:NonOTPRequest:" + z, this);
    }

    /* renamed from: q */
    public void mo38429q() {
    }

    /* renamed from: r */
    public void mo38430r() {
    }

    /* renamed from: s */
    public void mo38431s(boolean z) {
        this.f38714a.put("OTPManuallyEntered", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:OTPManuallyEntered:" + z, this);
    }

    /* renamed from: t */
    public void mo38432t(boolean z) {
        this.f38714a.put("isAssistMinimized", Boolean.valueOf(z));
        C5706ib.m51978a("AssistAnalytics:isAssistMinimized:" + z, this);
    }

    /* renamed from: u */
    public void mo38433u(String str) {
        this.f38714a.put("cardType", str);
        C5706ib.m51978a("AssistAnalytics:cardType:" + str, this);
    }

    /* renamed from: v */
    public void mo38434v(boolean z) {
        PaytmAssist.getAssistInstance().getmEventMap().put("autoSubmit", Boolean.valueOf(z));
        this.f38714a.put("autoSubmitAssist", PaytmAssist.getAssistInstance().getmEventMap());
        C5706ib.m51978a("AssistAnalytics:autoSubmitAssist:" + PaytmAssist.getAssistInstance().getmEventMap(), this);
    }

    /* renamed from: w */
    public void mo38435w(String str) {
        this.f38714a.put("acsUrlLoaded", str);
    }

    /* renamed from: x */
    public void mo38436x(boolean z, int i) {
        PaytmAssist.getAssistInstance().getmEventMap().put("buttonClicked", Boolean.valueOf(z));
        PaytmAssist.getAssistInstance().getmEventMap().put("buttonClickedCount", Integer.valueOf(i));
        this.f38714a.put("buttonClickedWithCount", PaytmAssist.getAssistInstance().getmEventMap());
        C5706ib.m51978a("AssistAnalytics:buttonClickedWithCount:" + PaytmAssist.getAssistInstance().getmEventMap(), this);
    }

    /* renamed from: y */
    public void mo38437y(boolean z) {
        C5706ib.m51978a("AssistAnalytics:isAssistPopped:" + z, this);
        this.f38714a.put("isAssistPopped", Boolean.valueOf(z));
    }

    /* renamed from: z */
    public void mo38438z(String str, String str2, String str3) {
        this.f38714a.put("appName", str);
        this.f38714a.put("orderId", str2);
        this.f38714a.put("appVersion", str3);
        C5706ib.m51978a("AssistAnalytics:" + str + str2 + str3, this);
    }
}
