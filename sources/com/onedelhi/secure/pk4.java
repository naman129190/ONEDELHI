package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.onedelhi.secure.aa1;
import com.onedelhi.secure.hl3;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class pk4 {

    /* renamed from: a */
    public static final String f18599a = "TypefaceCompatUtil";

    /* renamed from: b */
    public static final String f18600b = ".font";

    @sj3(19)
    /* renamed from: com.onedelhi.secure.pk4$a */
    public static class C3158a {
        @pn0
        /* renamed from: a */
        public static ParcelFileDescriptor m24798a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m24790a(@ts2 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @sj3(19)
    @ts2
    /* renamed from: b */
    public static ByteBuffer m24791b(@mr2 Context context, @mr2 Resources resources, int i) {
        File e = m24794e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!m24792c(e, resources, i)) {
                return null;
            }
            ByteBuffer g = m24796g(e);
            e.delete();
            return g;
        } finally {
            e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m24792c(@mr2 File file, @mr2 Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean d = m24793d(file, inputStream);
                m24790a(inputStream);
                return d;
            } catch (Throwable th) {
                th = th;
                m24790a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m24790a(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m24793d(@mr2 File file, @mr2 InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m24790a(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e(f18599a, "Error copying resource contents to temp file: " + e.getMessage());
                    m24790a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m24790a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m24790a(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            Log.e(f18599a, "Error copying resource contents to temp file: " + e.getMessage());
            m24790a(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    @ts2
    /* renamed from: e */
    public static File m24794e(@mr2 Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = f18600b + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @sj3(19)
    @ts2
    /* renamed from: f */
    public static ByteBuffer m24795f(@mr2 Context context, @ts2 CancellationSignal cancellationSignal, @mr2 Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor a = C3158a.m24798a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (a == null) {
                if (a != null) {
                    a.close();
                }
                return null;
            }
            try {
                fileInputStream = new FileInputStream(a.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                a.close();
                return map;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @sj3(19)
    @ts2
    /* renamed from: g */
    public static ByteBuffer m24796g(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @mr2
    @sj3(19)
    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m24797h(@mr2 Context context, @mr2 aa1.C1675c[] cVarArr, @ts2 CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (aa1.C1675c cVar : cVarArr) {
            if (cVar.mo12876b() == 0) {
                Uri d = cVar.mo12878d();
                if (!hashMap.containsKey(d)) {
                    hashMap.put(d, m24795f(context, cancellationSignal, d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
