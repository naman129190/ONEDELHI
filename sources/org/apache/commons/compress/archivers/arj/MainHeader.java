package org.apache.commons.compress.archivers.arj;

import java.util.Arrays;

class MainHeader {
    public long archiveSize;
    public int archiverVersionNumber;
    public int arjFlags;
    public int arjFlags2;
    public int arjProtectionFactor;
    public String comment;
    public int dateTimeCreated;
    public int dateTimeModified;
    public int encryptionVersion;
    public byte[] extendedHeaderBytes = null;
    public int fileSpecPosition;
    public int fileType;
    public int hostOS;
    public int lastChapter;
    public int minVersionToExtract;
    public String name;
    public int reserved;
    public int securityEnvelopeFilePosition;
    public int securityEnvelopeLength;
    public int securityVersion;

    public static class Flags {
        public static final int ALTNAME = 128;
        public static final int ARJPROT = 8;
        public static final int BACKUP = 32;
        public static final int GARBLED = 1;
        public static final int OLD_SECURED_NEW_ANSI_PAGE = 2;
        public static final int PATHSYM = 16;
        public static final int SECURED = 64;
        public static final int VOLUME = 4;
    }

    public String toString() {
        return "MainHeader [archiverVersionNumber=" + this.archiverVersionNumber + ", minVersionToExtract=" + this.minVersionToExtract + ", hostOS=" + this.hostOS + ", arjFlags=" + this.arjFlags + ", securityVersion=" + this.securityVersion + ", fileType=" + this.fileType + ", reserved=" + this.reserved + ", dateTimeCreated=" + this.dateTimeCreated + ", dateTimeModified=" + this.dateTimeModified + ", archiveSize=" + this.archiveSize + ", securityEnvelopeFilePosition=" + this.securityEnvelopeFilePosition + ", fileSpecPosition=" + this.fileSpecPosition + ", securityEnvelopeLength=" + this.securityEnvelopeLength + ", encryptionVersion=" + this.encryptionVersion + ", lastChapter=" + this.lastChapter + ", arjProtectionFactor=" + this.arjProtectionFactor + ", arjFlags2=" + this.arjFlags2 + ", name=" + this.name + ", comment=" + this.comment + ", extendedHeaderBytes=" + Arrays.toString(this.extendedHeaderBytes) + "]";
    }
}
