package org.apache.commons.compress.compressors.pack200;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

class TempFileCachingStreamBridge extends StreamBridge {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final File f38888f;

    public TempFileCachingStreamBridge() throws IOException {
        File createTempFile = File.createTempFile("commons-compress", "packtemp");
        this.f38888f = createTempFile;
        createTempFile.deleteOnExit();
        this.out = new FileOutputStream(createTempFile);
    }

    public InputStream getInputView() throws IOException {
        this.out.close();
        return new FileInputStream(this.f38888f) {
            public void close() throws IOException {
                super.close();
                TempFileCachingStreamBridge.this.f38888f.delete();
            }
        };
    }
}
