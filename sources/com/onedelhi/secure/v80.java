package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class v80 {

    /* renamed from: a */
    public static final Map<String, Lock> f21708a = new HashMap();

    /* renamed from: a */
    public final File f21709a;

    /* renamed from: a */
    public FileChannel f21710a;

    /* renamed from: a */
    public final Lock f21711a;

    /* renamed from: a */
    public final boolean f21712a;

    public v80(@mr2 String str, @mr2 File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f21709a = file2;
        this.f21711a = m29876a(file2.getAbsolutePath());
        this.f21712a = z;
    }

    /* renamed from: a */
    public static Lock m29876a(String str) {
        Lock lock;
        Map<String, Lock> map = f21708a;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: b */
    public void mo25902b() {
        this.f21711a.lock();
        if (this.f21712a) {
            try {
                FileChannel channel = new FileOutputStream(this.f21709a).getChannel();
                this.f21710a = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    /* renamed from: c */
    public void mo25903c() {
        FileChannel fileChannel = this.f21710a;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f21711a.unlock();
    }
}
