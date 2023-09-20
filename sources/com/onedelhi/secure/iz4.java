package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;

public class iz4 {

    /* renamed from: a */
    public SharedPreferences f13966a;

    public iz4(File file, File file2, Context context) throws IOException {
        SevenZFile sevenZFile = new SevenZFile(file);
        while (true) {
            try {
                SevenZArchiveEntry nextEntry = sevenZFile.getNextEntry();
                if (nextEntry == null) {
                    break;
                } else if (!nextEntry.isDirectory()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(file2, pj0.m61166a(-144623446103879L)));
                    int size = (int) nextEntry.getSize();
                    byte[] bArr = new byte[size];
                    sevenZFile.read(bArr, 0, size);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                sevenZFile.close();
                if (file.exists()) {
                    file.delete();
                }
                File file3 = new File(file2, pj0.m61166a(-144954158585671L));
                if (file3.exists() && file3.length() > 128000) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(pj0.m61166a(-145014288127815L), 0);
                    this.f13966a = sharedPreferences;
                    int i = sharedPreferences.getInt(pj0.m61166a(-145100187473735L), 0);
                    SharedPreferences.Editor edit = this.f13966a.edit();
                    edit.putInt(pj0.m61166a(-145177496885063L), i);
                    edit.apply();
                }
                throw th;
            }
        }
        sevenZFile.close();
        if (file.exists()) {
            file.delete();
        }
        File file4 = new File(file2, pj0.m61166a(-144683575646023L));
        if (file4.exists() && file4.length() > 128000) {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(pj0.m61166a(-144743705188167L), 0);
            this.f13966a = sharedPreferences2;
            int i2 = sharedPreferences2.getInt(pj0.m61166a(-144829604534087L), 0);
            SharedPreferences.Editor edit2 = this.f13966a.edit();
            edit2.putInt(pj0.m61166a(-144906913945415L), i2);
            edit2.apply();
        }
    }
}
