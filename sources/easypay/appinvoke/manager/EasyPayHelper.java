package easypay.appinvoke.manager;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.onedelhi.secure.C5235fb;
import com.onedelhi.secure.C5706ib;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.lu1;
import com.onedelhi.secure.tj4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EasyPayHelper {
    private C5235fb bankResponse;
    private ArrayList<lu1> mJsCallListListener = new ArrayList<>();

    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public EasyPayHelper() {
        PaytmAssist.getAssistInstance().getWebView().addJavascriptInterface(this, Constants.EASYPAY_JS_INTERFACE);
    }

    @JavascriptInterface
    public void NBWatcher(String str, String str2, int i) {
        if (str != null && str2 != null) {
            if (i == 106) {
                Iterator<lu1> it = this.mJsCallListListener.iterator();
                while (it.hasNext()) {
                    it.next().mo34511b("", str, i);
                }
            } else if (i != 156) {
                if (i != 157) {
                    switch (i) {
                        case Constants.ACTION_PASSWORD_VIEWER:
                        case Constants.ACTION_UID_VIEWER:
                        case Constants.ACTION_REMOVE_NB_LAYOUT:
                            break;
                        default:
                            switch (i) {
                                case Constants.ACTION_NB_NEXT_BTN_CLICKED:
                                case 160:
                                case Constants.ACTION_NB_WV_LOGIN_CLICKED:
                                    break;
                                default:
                                    switch (i) {
                                        case Constants.ACTION_NB_RESEND_CLICKED:
                                        case Constants.ACTION_NB_REMOVE_LOADER:
                                            break;
                                        case Constants.ACTION_WEB_OPTIMIZATION_EXECUTED:
                                            C5706ib.m51978a("Bank Bage optimized called", this);
                                            if (PaytmAssist.getAssistInstance().getmEventMap() != null) {
                                                PaytmAssist.getAssistInstance().getmEventMap().put("isWebPageOptimized", Boolean.TRUE);
                                                C5706ib.m51978a("Bank Bage optimized called" + PaytmAssist.getAssistInstance().getmEventMap(), this);
                                                return;
                                            }
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
                }
                Iterator<lu1> it2 = this.mJsCallListListener.iterator();
                while (it2.hasNext()) {
                    it2.next().mo34510a(str2, str, i);
                }
            } else {
                Iterator<lu1> it3 = this.mJsCallListListener.iterator();
                while (it3.hasNext()) {
                    it3.next().mo34511b(str, str2, i);
                }
            }
        }
    }

    @JavascriptInterface
    public void OTPWatcher(String str, String str2, int i) {
        if (i != 108) {
            if (i == 158) {
                Iterator<lu1> it = this.mJsCallListListener.iterator();
                while (it.hasNext()) {
                    it.next().mo34510a(str2, str, i);
                }
                return;
            } else if (i != 201) {
                if (i == 300) {
                    Iterator<lu1> it2 = this.mJsCallListListener.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo34511b(str2, str, i);
                    }
                    return;
                } else if (i == 221) {
                    Iterator<lu1> it3 = this.mJsCallListListener.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo34510a(str2, str, i);
                    }
                    return;
                } else if (i == 222) {
                    Iterator<lu1> it4 = this.mJsCallListListener.iterator();
                    while (it4.hasNext()) {
                        it4.next().mo34510a(str2, str, i);
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        Iterator<lu1> it5 = this.mJsCallListListener.iterator();
        while (it5.hasNext()) {
            it5.next().mo34510a(str2, str, i);
        }
    }

    public void addJsCallListener(lu1 lu1) {
        ArrayList<lu1> arrayList = this.mJsCallListListener;
        if (arrayList != null) {
            arrayList.add(lu1);
        }
    }

    public C5235fb getBankResponse() {
        return this.bankResponse;
    }

    @JavascriptInterface
    public void logError(String str) {
        Iterator<lu1> it = this.mJsCallListListener.iterator();
        while (it.hasNext()) {
            it.next().mo34510a("", str, 110);
        }
        PaytmAssist.getAssistInstance().getmEventMap().put("JSError", str);
        if (!TextUtils.isEmpty(PaytmAssist.getAssistInstance().getCardDetails())) {
            Map<String, Object> map = PaytmAssist.getAssistInstance().getmEventMap();
            map.put("JSError", str + "bank Details" + PaytmAssist.getAssistInstance().getCardDetails());
        }
    }

    @JavascriptInterface
    public void sendBnkDtlToApp(String str) {
        C5706ib.m51978a("Json From UI:" + str, this);
        HashMap hashMap = (HashMap) new fj1().mo36013o(str, new tj4<HashMap<String, String>>() {
        }.getType());
        String str2 = "";
        String obj = (hashMap == null || hashMap.get(Constants.EXTRA_BANK_CODE) == null) ? str2 : hashMap.get(Constants.EXTRA_BANK_CODE).toString();
        String obj2 = (hashMap == null || hashMap.get(Constants.EXTRA_BANK_PAYTYPE) == null) ? str2 : hashMap.get(Constants.EXTRA_BANK_PAYTYPE).toString();
        if (!(hashMap == null || hashMap.get(Constants.EXTRA_BANK_SCHEME) == null)) {
            str2 = hashMap.get(Constants.EXTRA_BANK_SCHEME).toString();
        }
        PaytmAssist.getAssistInstance().setBankInfo(obj, obj2, str2);
    }

    public void setBankResponse(C5235fb fbVar) {
        this.bankResponse = fbVar;
    }

    @JavascriptInterface
    public void showLog(String str) {
        Iterator<lu1> it = this.mJsCallListListener.iterator();
        while (it.hasNext()) {
            it.next().mo34510a("", str, 109);
        }
        PaytmAssist.getAssistInstance().setAssistEngineTerminatedStatus(true);
    }

    @JavascriptInterface
    public void successEvent(int i, String str) {
        if (!(i == 100 || i == 101)) {
            if (i != 107) {
                switch (i) {
                    case Constants.ACTION_PASSWORD_FOUND:
                    case 155:
                    case Constants.ACTION_DELAY_PASSWORD_FOUND:
                        break;
                    default:
                        return;
                }
            } else {
                Iterator<lu1> it = this.mJsCallListListener.iterator();
                while (it.hasNext()) {
                    lu1 next = it.next();
                    C5706ib.m51978a("EasyPayHelper :Web success Ui callback" + next.toString(), this);
                    next.mo34510a("", str, i);
                }
                return;
            }
        }
        Iterator<lu1> it2 = this.mJsCallListListener.iterator();
        while (it2.hasNext()) {
            it2.next().mo34511b("", str, i);
        }
    }
}
