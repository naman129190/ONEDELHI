package jmjou;

import android.content.SharedPreferences;
import com.onedelhi.secure.mr2;
import jmjou.C7601c;

/* renamed from: jmjou.b */
public abstract class C7600b implements C7606e {

    /* renamed from: a */
    public C7601c f38775a;

    /* renamed from: a */
    public abstract String mo31298a();

    /* renamed from: b */
    public SharedPreferences mo48862b() {
        this.f38775a.getClass();
        return C7601c.f38776a.getSharedPreferences(mo31298a(), 0);
    }

    /* renamed from: c */
    public void mo48863c() {
        mo48862b().edit().clear().commit();
    }

    /* renamed from: d */
    public void mo48864d(@mr2 String str, String str2) {
        mo48862b().edit().putString(str, str2).apply();
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f38775a = cVar;
    }

    public boolean isCachingAllowed() {
        return true;
    }
}
