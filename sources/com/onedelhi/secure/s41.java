package com.onedelhi.secure;

import android.os.AsyncTask;
import java.io.IOException;
import java.net.InetAddress;

public class s41 {

    /* renamed from: com.onedelhi.secure.s41$a */
    public static class C3471a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public String f20198a;

        public C3471a(String str) {
            this.f20198a = str;
        }

        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return Boolean.valueOf(InetAddress.getByName(pj0.m61166a(-144314208458567L)).isReachable(6000));
            } catch (IOException e) {
                c41.m40702d().mo32241g(e);
                return Boolean.FALSE;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            String a = pj0.m61166a(bool.booleanValue() ? -144348568196935L : -144477417215815L);
            c41.m40702d().mo32241g(new RuntimeException(a + this.f20198a));
        }
    }

    /* renamed from: a */
    public static void m27243a(String str) {
        new C3471a(str).execute(new Void[0]);
    }

    /* renamed from: b */
    public static void m27244b(Exception exc, String str) {
        c41.m40702d().mo32240f(str);
        c41.m40702d().mo32241g(exc);
    }

    /* renamed from: c */
    public static void m27245c(String str, String str2) {
        c41.m40702d().mo32240f(str2);
        c41.m40702d().mo32241g(new RuntimeException(str));
    }
}
