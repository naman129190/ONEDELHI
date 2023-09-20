package easypay.appinvoke.manager;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.onedelhi.secure.C5500hb;
import com.onedelhi.secure.C5706ib;
import com.onedelhi.secure.vw4;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class EasypayWebViewClient extends WebViewClient implements Serializable {
    public static long smsTrackingTime;
    /* access modifiers changed from: private */
    public EasypayBrowserFragment fragment;
    private Activity mActivity;
    private ArrayList<vw4> mWcListListener;

    public EasypayWebViewClient() {
    }

    public EasypayWebViewClient(Activity activity) {
        C5706ib.m51978a("EasypayWebViewClient" + toString(), this);
        this.mActivity = activity;
        this.mWcListListener = PaytmAssist.getAssistInstance().getmWcListListener();
        smsTrackingTime = System.currentTimeMillis();
        this.fragment = PaytmAssist.getAssistInstance().getFragment();
    }

    private void fireActions(final WebView webView, final String str) {
        if (this.fragment != null && !PaytmAssist.getAssistInstance().getAssistEngineTerminatedStatus()) {
            this.mActivity.runOnUiThread(new Runnable() {
                public void run() {
                    if (EasypayWebViewClient.this.fragment != null) {
                        C5706ib.m51978a("page finish: fire action:checkAssistFlow", this);
                        EasypayWebViewClient.this.fragment.mo48693a0(webView, str);
                    }
                }
            });
        }
    }

    public void addAssistWebClientListener(vw4 vw4) {
        ArrayList<vw4> arrayList = this.mWcListListener;
        if (arrayList != null) {
            try {
                arrayList.listIterator().add(vw4);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                throw new C5500hb(Constants.Assist_Invoke_Exception_Message);
            } catch (C5500hb e2) {
                e2.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e2);
            }
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C5706ib.m51978a("" + str, this);
        try {
            ArrayList<vw4> arrayList = this.mWcListListener;
            if (arrayList != null) {
                Iterator<vw4> it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().mo33964t(webView, str);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
        try {
            if (this.fragment == null) {
                this.fragment = PaytmAssist.getAssistInstance().getFragment();
            }
            fireActions(webView, str);
            PaytmAssist.getAssistInstance().setLastLoadedUrl(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e2);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C5706ib.m51978a("onpage started-" + str, this);
        try {
            if (this.mWcListListener != null) {
                for (int i = 0; i < this.mWcListListener.size(); i++) {
                    this.mWcListListener.get(i).mo33955K(webView, str, bitmap);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
        EasypayBrowserFragment easypayBrowserFragment = this.fragment;
        if (easypayBrowserFragment != null) {
            easypayBrowserFragment.mo48676C0();
            try {
                this.fragment.getActivity().runOnUiThread(new Runnable() {
                    public void run() {
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    public synchronized void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            ArrayList<vw4> arrayList = this.mWcListListener;
            if (arrayList != null) {
                Iterator<vw4> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo33966v(webView, sslErrorHandler, sslError);
                }
            }
        } catch (AbstractMethodError unused) {
        }
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
    }

    public synchronized void removeAssistWebClientListener(vw4 vw4) {
        ArrayList<vw4> arrayList = this.mWcListListener;
        if (arrayList != null) {
            try {
                Iterator<vw4> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(vw4)) {
                        it.remove();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                throw new C5500hb(Constants.Assist_Invoke_Exception_Message);
            } catch (C5500hb e2) {
                e2.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e2);
            }
        }
        return;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            ArrayList<vw4> arrayList = this.mWcListListener;
            if (arrayList != null) {
                Iterator<vw4> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo33956V(webView, str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            ArrayList<vw4> arrayList = this.mWcListListener;
            if (arrayList != null) {
                Iterator<vw4> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo33954H(webView, webResourceRequest);
                }
            }
        } catch (Exception unused) {
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            ArrayList<vw4> arrayList = this.mWcListListener;
            if (arrayList != null) {
                Iterator<vw4> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo33954H(webView, str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
