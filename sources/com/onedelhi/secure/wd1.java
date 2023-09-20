package com.onedelhi.secure;

import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.widget.C0358b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wd1 {

    /* renamed from: a */
    public static final C7012v5 f36948a = C7012v5.m67717e();

    /* renamed from: a */
    public final ActivityManager.MemoryInfo f36949a;

    /* renamed from: a */
    public final ActivityManager f36950a;

    /* renamed from: a */
    public final Context f36951a;

    /* renamed from: a */
    public final Runtime f36952a;

    public wd1(Context context) {
        this(Runtime.getRuntime(), context);
    }

    @hw4
    public wd1(Runtime runtime, Context context) {
        this.f36952a = runtime;
        this.f36951a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C0358b.f1779e);
        this.f36950a = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f36949a = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }

    /* renamed from: a */
    public int mo46673a() {
        return br4.m40323d(d44.BYTES.mo34221g(this.f36949a.totalMem));
    }

    /* renamed from: b */
    public int mo46674b() {
        return br4.m40323d(d44.BYTES.mo34221g(this.f36952a.maxMemory()));
    }

    /* renamed from: c */
    public int mo46675c() {
        return br4.m40323d(d44.MEGABYTES.mo34221g((long) this.f36950a.getMemoryClass()));
    }

    @hw4
    /* renamed from: d */
    public int mo46676d(String str) {
        String str2;
        StringBuilder sb;
        C7012v5 v5Var;
        BufferedReader bufferedReader;
        String readLine;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return 0;
                }
            } while (!readLine.startsWith("MemTotal"));
            Matcher matcher = Pattern.compile("\\d+").matcher(readLine);
            int parseInt = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
            bufferedReader.close();
            return parseInt;
        } catch (IOException e) {
            v5Var = f36948a;
            sb = new StringBuilder();
            sb.append("Unable to read '");
            sb.append(str);
            sb.append("' file: ");
            str2 = e.getMessage();
            sb.append(str2);
            v5Var.mo46010l(sb.toString());
            return 0;
        } catch (NumberFormatException e2) {
            v5Var = f36948a;
            sb = new StringBuilder();
            sb.append("Unable to parse '");
            sb.append(str);
            sb.append("' file: ");
            str2 = e2.getMessage();
            sb.append(str2);
            v5Var.mo46010l(sb.toString());
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
