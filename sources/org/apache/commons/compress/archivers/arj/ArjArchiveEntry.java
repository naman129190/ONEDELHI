package org.apache.commons.compress.archivers.arj;

import java.io.File;
import java.util.Date;
import java.util.regex.Matcher;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipUtil;

public class ArjArchiveEntry implements ArchiveEntry {
    private final LocalFileHeader localFileHeader;

    public static class HostOs {
        public static final int AMIGA = 3;
        public static final int APPLE_GS = 6;
        public static final int ATARI_ST = 7;
        public static final int DOS = 0;
        public static final int MAC_OS = 4;
        public static final int NEXT = 8;
        public static final int OS_2 = 5;
        public static final int PRIMOS = 1;
        public static final int UNIX = 2;
        public static final int VAX_VMS = 9;
        public static final int WIN32 = 11;
        public static final int WIN95 = 10;
    }

    public ArjArchiveEntry() {
        this.localFileHeader = new LocalFileHeader();
    }

    public ArjArchiveEntry(LocalFileHeader localFileHeader2) {
        this.localFileHeader = localFileHeader2;
    }

    public int getHostOs() {
        return this.localFileHeader.hostOS;
    }

    public Date getLastModifiedDate() {
        return new Date(isHostOsUnix() ? ((long) this.localFileHeader.dateTimeModified) * 1000 : ZipUtil.dosToJavaTime(ZipConstants.ZIP64_MAGIC & ((long) this.localFileHeader.dateTimeModified)));
    }

    public int getMethod() {
        return this.localFileHeader.method;
    }

    public int getMode() {
        return this.localFileHeader.fileAccessMode;
    }

    public String getName() {
        LocalFileHeader localFileHeader2 = this.localFileHeader;
        int i = localFileHeader2.arjFlags & 16;
        String str = localFileHeader2.name;
        return i != 0 ? str.replaceAll("/", Matcher.quoteReplacement(File.separator)) : str;
    }

    public long getSize() {
        return this.localFileHeader.originalSize;
    }

    public int getUnixMode() {
        if (isHostOsUnix()) {
            return getMode();
        }
        return 0;
    }

    public boolean isDirectory() {
        return this.localFileHeader.fileType == 3;
    }

    public boolean isHostOsUnix() {
        return getHostOs() == 2 || getHostOs() == 8;
    }
}
