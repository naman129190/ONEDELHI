package com.onedelhi.secure;

import android.content.Context;
import android.util.Base64OutputStream;
import com.onedelhi.secure.bl1;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class gh0 implements al1, bl1 {

    /* renamed from: a */
    public final Context f29193a;

    /* renamed from: a */
    public final b73<cl1> f29194a;

    /* renamed from: a */
    public final Set<yk1> f29195a;

    /* renamed from: a */
    public final Executor f29196a;

    /* renamed from: b */
    public final b73<wp4> f29197b;

    public gh0(Context context, String str, Set<yk1> set, b73<wp4> b73, Executor executor) {
        this((b73<cl1>) new dh0(context, str), set, executor, b73, context);
    }

    @hw4
    public gh0(b73<cl1> b73, Set<yk1> set, Executor executor, b73<wp4> b732, Context context) {
        this.f29194a = b73;
        this.f29195a = set;
        this.f29196a = executor;
        this.f29197b = b732;
        this.f29193a = context;
    }

    @mr2
    /* renamed from: g */
    public static a30<gh0> m49478g() {
        z83<Executor> a = z83.m72649a(C6278oi.class, Executor.class);
        return a30.m36015i(gh0.class, al1.class, bl1.class).mo30433b(rj0.m63679m(Context.class)).mo30433b(rj0.m63679m(w31.class)).mo30433b(rj0.m63683q(yk1.class)).mo30433b(rj0.m63681o(wp4.class)).mo30433b(rj0.m63678l(a)).mo30437f(new ch0(a)).mo30435d();
    }

    /* renamed from: h */
    public static /* synthetic */ gh0 m49479h(z83 z83, g30 g30) {
        return new gh0((Context) g30.mo36546b(Context.class), ((w31) g30.mo36546b(w31.class)).mo46530t(), g30.mo36551h(yk1.class), g30.mo36549f(wp4.class), (Executor) g30.mo36547c(z83));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m49480i() throws Exception {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            cl1 cl1 = this.f29194a.get();
            List<dl1> c = cl1.mo33780c();
            cl1.mo33779b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c.size(); i++) {
                dl1 dl1 = c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", dl1.mo34496c());
                jSONObject.put("dates", new JSONArray(dl1.mo34495b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", mx0.f16744n2);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    /* renamed from: j */
    public static /* synthetic */ cl1 m49481j(Context context, String str) {
        return new cl1(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m49482k() throws Exception {
        synchronized (this) {
            this.f29194a.get().mo33790m(System.currentTimeMillis(), this.f29197b.get().mo46155b1());
        }
        return null;
    }

    /* renamed from: a */
    public w94<String> mo30968a() {
        return yp4.m32589a(this.f29193a) ^ true ? ha4.m16572g("") : ha4.m16569d(this.f29196a, new fh0(this));
    }

    @mr2
    /* renamed from: b */
    public synchronized bl1.C4681a mo31921b(@mr2 String str) {
        long currentTimeMillis = System.currentTimeMillis();
        cl1 cl1 = this.f29194a.get();
        if (cl1.mo33788k(currentTimeMillis)) {
            cl1.mo33786i();
            return bl1.C4681a.GLOBAL;
        }
        return bl1.C4681a.NONE;
    }

    /* renamed from: l */
    public w94<Void> mo36741l() {
        return this.f29195a.size() <= 0 ? ha4.m16572g(null) : yp4.m32589a(this.f29193a) ^ true ? ha4.m16572g(null) : ha4.m16569d(this.f29196a, new eh0(this));
    }
}
