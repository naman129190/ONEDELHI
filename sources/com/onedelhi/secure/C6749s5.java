package com.onedelhi.secure;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/s5;", "", "", "loggerName", "", "logLevel", "message", "", "t", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "d", "logger", "tag", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
@e84
/* renamed from: com.onedelhi.secure.s5 */
public final class C6749s5 {

    /* renamed from: a */
    public static final int f34915a = 4000;

    /* renamed from: a */
    public static final C6749s5 f34916a = new C6749s5();

    /* renamed from: a */
    public static final Map<String, String> f34917a;

    /* renamed from: a */
    public static final CopyOnWriteArraySet<Logger> f34918a = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = OkHttpClient.class.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        jt1.m53776o(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = bm1.class.getName();
        jt1.m53776o(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = fa4.class.getName();
        jt1.m53776o(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f34917a = id2.m52098F0(linkedHashMap);
    }

    /* renamed from: a */
    public final void mo44201a(@vr2 String str, int i, @vr2 String str2, @ss2 Throwable th) {
        int min;
        jt1.m53777p(str, "loggerName");
        jt1.m53777p(str2, "message");
        String d = mo44204d(str);
        if (Log.isLoggable(d, i)) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                int q3 = u54.m66666q3(str2, 10, i2, false, 4, (Object) null);
                if (q3 == -1) {
                    q3 = length;
                }
                while (true) {
                    min = Math.min(q3, i2 + f34915a);
                    String substring = str2.substring(i2, min);
                    jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, d, substring);
                    if (min >= q3) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: b */
    public final void mo44202b() {
        for (Map.Entry next : f34917a.entrySet()) {
            mo44203c((String) next.getKey(), (String) next.getValue());
        }
    }

    /* renamed from: c */
    public final void mo44203c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f34918a.add(logger)) {
            jt1.m53776o(logger, "logger");
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C6837t5.f35425a);
        }
    }

    /* renamed from: d */
    public final String mo44204d(String str) {
        String str2 = f34917a.get(str);
        return str2 != null ? str2 : w54.m68934X8(str, 23);
    }
}
