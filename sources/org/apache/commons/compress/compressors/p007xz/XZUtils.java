package org.apache.commons.compress.compressors.p007xz;

import java.util.HashMap;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.compressors.FileNameUtil;

/* renamed from: org.apache.commons.compress.compressors.xz.XZUtils */
public class XZUtils {
    private static final byte[] HEADER_MAGIC = {-3, TarConstants.LF_CONTIG, 122, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 90, 0};
    private static volatile CachedAvailability cachedXZAvailability = CachedAvailability.DONT_CACHE;
    private static final FileNameUtil fileNameUtil;

    /* renamed from: org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability */
    public enum CachedAvailability {
        DONT_CACHE,
        CACHED_AVAILABLE,
        CACHED_UNAVAILABLE
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(".txz", ".tar");
        hashMap.put(".xz", "");
        hashMap.put("-xz", "");
        fileNameUtil = new FileNameUtil(hashMap, ".xz");
        try {
            Class.forName("org.osgi.framework.BundleEvent");
        } catch (Exception unused) {
            setCacheXZAvailablity(true);
        }
    }

    private XZUtils() {
    }

    public static CachedAvailability getCachedXZAvailability() {
        return cachedXZAvailability;
    }

    public static String getCompressedFilename(String str) {
        return fileNameUtil.getCompressedFilename(str);
    }

    public static String getUncompressedFilename(String str) {
        return fileNameUtil.getUncompressedFilename(str);
    }

    private static boolean internalIsXZCompressionAvailable() {
        try {
            XZCompressorInputStream.matches((byte[]) null, 0);
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean isCompressedFilename(String str) {
        return fileNameUtil.isCompressedFilename(str);
    }

    public static boolean isXZCompressionAvailable() {
        CachedAvailability cachedAvailability = cachedXZAvailability;
        return cachedAvailability != CachedAvailability.DONT_CACHE ? cachedAvailability == CachedAvailability.CACHED_AVAILABLE : internalIsXZCompressionAvailable();
    }

    public static boolean matches(byte[] bArr, int i) {
        if (i < HEADER_MAGIC.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = HEADER_MAGIC;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static void setCacheXZAvailablity(boolean z) {
        CachedAvailability cachedAvailability;
        if (!z) {
            cachedAvailability = CachedAvailability.DONT_CACHE;
        } else if (cachedXZAvailability == CachedAvailability.DONT_CACHE) {
            cachedAvailability = internalIsXZCompressionAvailable() ? CachedAvailability.CACHED_AVAILABLE : CachedAvailability.CACHED_UNAVAILABLE;
        } else {
            return;
        }
        cachedXZAvailability = cachedAvailability;
    }
}
