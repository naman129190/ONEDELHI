package com.onedelhi.secure;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class dr4 {

    /* renamed from: a */
    public static final String f27607a = zo3.class.getSimpleName();

    /* renamed from: a */
    public static String m45521a(InputStream inputStream) {
        return new Scanner(inputStream).useDelimiter("\\A").next();
    }

    /* renamed from: b */
    public static ZipInputStream m45522b(InputStream inputStream) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        if (nextEntry == null) {
            return null;
        }
        String str = f27607a;
        Log.w(str, "extracting file: '" + nextEntry.getName() + "'...");
        return zipInputStream;
    }

    /* renamed from: c */
    public static List<String> m45523c(String str, char c) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == '\"') {
                z = !z;
            }
            if (charArray[i] != c || z) {
                sb.append(charArray[i]);
            } else if (sb.length() > 0) {
                arrayList.add(sb.toString().trim());
                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString().trim());
        }
        return arrayList;
    }

    /* renamed from: d */
    public static void m45524d(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                outputStream.close();
                inputStream.close();
                return;
            }
        }
    }
}
