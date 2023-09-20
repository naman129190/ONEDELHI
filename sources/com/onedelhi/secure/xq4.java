package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class xq4 {

    /* renamed from: a */
    public static C3945a f22710a;

    /* renamed from: com.onedelhi.secure.xq4$a */
    public interface C3945a {
        /* renamed from: a */
        void mo27043a(String str);
    }

    /* renamed from: a */
    public static int m31630a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: c */
    public static void m31631c(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String substring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + ar4.f25981a + stackTraceElement.getLineNumber() + pl2.f33727d + "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + substring;
        System.out.println(str2 + " " + str);
        C3945a aVar = f22710a;
        if (aVar != null) {
            aVar.mo27043a(str2 + " " + str);
        }
    }

    /* renamed from: d */
    public static void m31632d(String str, String str2) {
        PrintStream printStream = System.out;
        printStream.println(str + " : " + str2);
    }

    /* renamed from: e */
    public static void m31633e(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str2 = str2 + " ";
            PrintStream printStream = System.out;
            printStream.println(str + str2 + (".(" + stackTrace[i2].getFileName() + ar4.f25981a + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName()) + str2);
        }
    }

    /* renamed from: f */
    public static void m31634f(String str, String str2) {
        PrintStream printStream = System.err;
        printStream.println(str + " : " + str2);
    }

    /* renamed from: g */
    public static int m31635g(float f, float f2, float f3, float f4) {
        int a = m31630a((int) (f * 255.0f));
        int a2 = m31630a((int) (f2 * 255.0f));
        return (a << 16) | (m31630a((int) (f4 * 255.0f)) << 24) | (a2 << 8) | m31630a((int) (f3 * 255.0f));
    }

    /* renamed from: h */
    public static void m31636h(C3945a aVar) {
        f22710a = aVar;
    }

    /* renamed from: i */
    public static void m31637i(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public int mo27042b(float[] fArr) {
        int a = m31630a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
        int a2 = m31630a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
        return (m31630a((int) (fArr[3] * 255.0f)) << 24) | (a << 16) | (a2 << 8) | m31630a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f));
    }
}
