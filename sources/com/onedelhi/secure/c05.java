package com.onedelhi.secure;

import android.os.AsyncTask;
import com.onedelhi.secure.uz4;
import java.util.Map;

public class c05 extends AsyncTask<Void, Void, uz4.C6991a> {

    /* renamed from: a */
    public final /* synthetic */ t25 f26604a;

    /* renamed from: a */
    public final /* synthetic */ uz4 f26605a;

    /* renamed from: a */
    public final /* synthetic */ String f26606a;

    /* renamed from: a */
    public final /* synthetic */ Map f26607a;

    /* renamed from: a */
    public final /* synthetic */ boolean f26608a;

    /* renamed from: b */
    public final /* synthetic */ String f26609b;

    /* renamed from: b */
    public final /* synthetic */ boolean f26610b;

    public c05(uz4 uz4, String str, boolean z, boolean z2, Map map, String str2, t25 t25) {
        this.f26605a = uz4;
        this.f26606a = str;
        this.f26608a = z;
        this.f26610b = z2;
        this.f26607a = map;
        this.f26609b = str2;
        this.f26604a = t25;
    }

    public Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        uz4 uz4 = this.f26605a;
        return uz4.mo45880b(this.f26606a, this.f26608a, this.f26610b, false, this.f26607a, this.f26609b, uz4.f36359a).mo39619b();
    }

    public void onPostExecute(Object obj) {
        uz4.C6991a aVar = (uz4.C6991a) obj;
        t25 t25 = this.f26604a;
        aVar.getClass();
        if (t25 == null) {
            return;
        }
        if (aVar.f36361b) {
            t25.mo30387h(aVar.f36360b);
        } else {
            t25.mo30383c(aVar.f36362n, aVar.f36360b);
        }
    }
}
