package org.apache.commons.compress.archivers.tar;

import easypay.appinvoke.manager.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.utils.ArchiveUtils;

public class TarArchiveEntry implements TarConstants, ArchiveEntry {
    public static final int DEFAULT_DIR_MODE = 16877;
    public static final int DEFAULT_FILE_MODE = 33188;
    public static final int MAX_NAMELEN = 31;
    public static final int MILLIS_PER_SECOND = 1000;
    private boolean checkSumOK;
    private int devMajor;
    private int devMinor;
    private final File file;
    private long groupId;
    private String groupName;
    private boolean isExtended;
    private byte linkFlag;
    private String linkName;
    private String magic;
    private long modTime;
    private int mode;
    private String name;
    private long realSize;
    private long size;
    private long userId;
    private String userName;
    private String version;

    private TarArchiveEntry() {
        this.name = "";
        this.userId = 0;
        this.groupId = 0;
        this.size = 0;
        this.linkName = "";
        this.magic = "ustar\u0000";
        this.version = "00";
        this.groupName = "";
        this.devMajor = 0;
        this.devMinor = 0;
        String property = System.getProperty("user.name", "");
        this.userName = property.length() > 31 ? property.substring(0, 31) : property;
        this.file = null;
    }

    public TarArchiveEntry(File file2) {
        this(file2, file2.getPath());
    }

    public TarArchiveEntry(File file2, String str) {
        this.name = "";
        this.userId = 0;
        this.groupId = 0;
        this.size = 0;
        this.linkName = "";
        this.magic = "ustar\u0000";
        this.version = "00";
        this.groupName = "";
        this.devMajor = 0;
        this.devMinor = 0;
        String normalizeFileName = normalizeFileName(str, false);
        this.file = file2;
        if (file2.isDirectory()) {
            this.mode = DEFAULT_DIR_MODE;
            this.linkFlag = TarConstants.LF_DIR;
            int length = normalizeFileName.length();
            if (length == 0 || normalizeFileName.charAt(length - 1) != '/') {
                normalizeFileName = normalizeFileName + "/";
            }
        } else {
            this.mode = DEFAULT_FILE_MODE;
            this.linkFlag = TarConstants.LF_NORMAL;
            this.size = file2.length();
        }
        this.name = normalizeFileName;
        this.modTime = file2.lastModified() / 1000;
        this.userName = "";
    }

    public TarArchiveEntry(String str) {
        this(str, false);
    }

    public TarArchiveEntry(String str, byte b) {
        this(str, b, false);
    }

    public TarArchiveEntry(String str, byte b, boolean z) {
        this(str, z);
        this.linkFlag = b;
        if (b == 76) {
            this.magic = TarConstants.MAGIC_GNU;
            this.version = TarConstants.VERSION_GNU_SPACE;
        }
    }

    public TarArchiveEntry(String str, boolean z) {
        this();
        String normalizeFileName = normalizeFileName(str, z);
        boolean endsWith = normalizeFileName.endsWith("/");
        this.name = normalizeFileName;
        this.mode = endsWith ? DEFAULT_DIR_MODE : DEFAULT_FILE_MODE;
        this.linkFlag = endsWith ? TarConstants.LF_DIR : TarConstants.LF_NORMAL;
        this.modTime = new Date().getTime() / 1000;
        this.userName = "";
    }

    public TarArchiveEntry(byte[] bArr) {
        this();
        parseTarHeader(bArr);
    }

    public TarArchiveEntry(byte[] bArr, ZipEncoding zipEncoding) throws IOException {
        this();
        parseTarHeader(bArr, zipEncoding);
    }

    private int evaluateType(byte[] bArr) {
        if (ArchiveUtils.matchAsciiBuffer(TarConstants.MAGIC_GNU, bArr, 257, 6)) {
            return 2;
        }
        return ArchiveUtils.matchAsciiBuffer("ustar\u0000", bArr, 257, 6) ? 3 : 0;
    }

    private static String normalizeFileName(String str, boolean z) {
        int indexOf;
        String lowerCase = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
        if (lowerCase != null) {
            if (lowerCase.startsWith("windows")) {
                if (str.length() > 2) {
                    char charAt = str.charAt(0);
                    if (str.charAt(1) == ':' && ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                        str = str.substring(2);
                    }
                }
            } else if (lowerCase.contains("netware") && (indexOf = str.indexOf(58)) != -1) {
                str = str.substring(indexOf + 1);
            }
        }
        String replace = str.replace(File.separatorChar, '/');
        while (!z && replace.startsWith("/")) {
            replace = replace.substring(1);
        }
        return replace;
    }

    private void parseTarHeader(byte[] bArr, ZipEncoding zipEncoding, boolean z) throws IOException {
        this.name = z ? TarUtils.parseName(bArr, 0, 100) : TarUtils.parseName(bArr, 0, 100, zipEncoding);
        this.mode = (int) TarUtils.parseOctalOrBinary(bArr, 100, 8);
        this.userId = (long) ((int) TarUtils.parseOctalOrBinary(bArr, 108, 8));
        this.groupId = (long) ((int) TarUtils.parseOctalOrBinary(bArr, 116, 8));
        this.size = TarUtils.parseOctalOrBinary(bArr, 124, 12);
        this.modTime = TarUtils.parseOctalOrBinary(bArr, 136, 12);
        this.checkSumOK = TarUtils.verifyCheckSum(bArr);
        this.linkFlag = bArr[156];
        this.linkName = z ? TarUtils.parseName(bArr, Constants.ACTION_SAVE_CUST_ID, 100) : TarUtils.parseName(bArr, Constants.ACTION_SAVE_CUST_ID, 100, zipEncoding);
        this.magic = TarUtils.parseName(bArr, 257, 6);
        this.version = TarUtils.parseName(bArr, TarConstants.VERSION_OFFSET, 2);
        this.userName = z ? TarUtils.parseName(bArr, 265, 32) : TarUtils.parseName(bArr, 265, 32, zipEncoding);
        this.groupName = z ? TarUtils.parseName(bArr, 297, 32) : TarUtils.parseName(bArr, 297, 32, zipEncoding);
        this.devMajor = (int) TarUtils.parseOctalOrBinary(bArr, 329, 8);
        this.devMinor = (int) TarUtils.parseOctalOrBinary(bArr, 337, 8);
        if (evaluateType(bArr) != 2) {
            String parseName = z ? TarUtils.parseName(bArr, 345, 155) : TarUtils.parseName(bArr, 345, 155, zipEncoding);
            if (isDirectory() && !this.name.endsWith("/")) {
                this.name += "/";
            }
            if (parseName.length() > 0) {
                this.name = parseName + "/" + this.name;
                return;
            }
            return;
        }
        this.isExtended = TarUtils.parseBoolean(bArr, 482);
        this.realSize = TarUtils.parseOctal(bArr, 483, 12);
    }

    private int writeEntryHeaderField(long j, byte[] bArr, int i, int i2, boolean z) {
        return (z || (j >= 0 && j < (1 << ((i2 + -1) * 3)))) ? TarUtils.formatLongOctalOrBinaryBytes(j, bArr, i, i2) : TarUtils.formatLongOctalBytes(0, bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return equals((TarArchiveEntry) obj);
    }

    public boolean equals(TarArchiveEntry tarArchiveEntry) {
        return getName().equals(tarArchiveEntry.getName());
    }

    public int getDevMajor() {
        return this.devMajor;
    }

    public int getDevMinor() {
        return this.devMinor;
    }

    public TarArchiveEntry[] getDirectoryEntries() {
        File file2 = this.file;
        if (file2 == null || !file2.isDirectory()) {
            return new TarArchiveEntry[0];
        }
        String[] list = this.file.list();
        TarArchiveEntry[] tarArchiveEntryArr = new TarArchiveEntry[list.length];
        for (int i = 0; i < list.length; i++) {
            tarArchiveEntryArr[i] = new TarArchiveEntry(new File(this.file, list[i]));
        }
        return tarArchiveEntryArr;
    }

    public File getFile() {
        return this.file;
    }

    @Deprecated
    public int getGroupId() {
        return (int) (this.groupId & -1);
    }

    public String getGroupName() {
        return this.groupName;
    }

    public Date getLastModifiedDate() {
        return getModTime();
    }

    public String getLinkName() {
        return this.linkName;
    }

    public long getLongGroupId() {
        return this.groupId;
    }

    public long getLongUserId() {
        return this.userId;
    }

    public Date getModTime() {
        return new Date(this.modTime * 1000);
    }

    public int getMode() {
        return this.mode;
    }

    public String getName() {
        return this.name;
    }

    public long getRealSize() {
        return this.realSize;
    }

    public long getSize() {
        return this.size;
    }

    @Deprecated
    public int getUserId() {
        return (int) (this.userId & -1);
    }

    public String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public boolean isBlockDevice() {
        return this.linkFlag == 52;
    }

    public boolean isCharacterDevice() {
        return this.linkFlag == 51;
    }

    public boolean isCheckSumOK() {
        return this.checkSumOK;
    }

    public boolean isDescendent(TarArchiveEntry tarArchiveEntry) {
        return tarArchiveEntry.getName().startsWith(getName());
    }

    public boolean isDirectory() {
        File file2 = this.file;
        return file2 != null ? file2.isDirectory() : this.linkFlag == 53 || getName().endsWith("/");
    }

    public boolean isExtended() {
        return this.isExtended;
    }

    public boolean isFIFO() {
        return this.linkFlag == 54;
    }

    public boolean isFile() {
        File file2 = this.file;
        if (file2 != null) {
            return file2.isFile();
        }
        byte b = this.linkFlag;
        if (b == 0 || b == 48) {
            return true;
        }
        return !getName().endsWith("/");
    }

    public boolean isGNULongLinkEntry() {
        return this.linkFlag == 75 && this.name.equals(TarConstants.GNU_LONGLINK);
    }

    public boolean isGNULongNameEntry() {
        return this.linkFlag == 76 && this.name.equals(TarConstants.GNU_LONGLINK);
    }

    public boolean isGNUSparse() {
        return this.linkFlag == 83;
    }

    public boolean isGlobalPaxHeader() {
        return this.linkFlag == 103;
    }

    public boolean isLink() {
        return this.linkFlag == 49;
    }

    public boolean isPaxHeader() {
        byte b = this.linkFlag;
        return b == 120 || b == 88;
    }

    public boolean isSymbolicLink() {
        return this.linkFlag == 50;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0006 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void parseTarHeader(byte[] r3) {
        /*
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING     // Catch:{ IOException -> 0x0006 }
            r2.parseTarHeader(r3, r0)     // Catch:{ IOException -> 0x0006 }
            goto L_0x000c
        L_0x0006:
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING     // Catch:{ IOException -> 0x000d }
            r1 = 1
            r2.parseTarHeader(r3, r0, r1)     // Catch:{ IOException -> 0x000d }
        L_0x000c:
            return
        L_0x000d:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[]):void");
    }

    public void parseTarHeader(byte[] bArr, ZipEncoding zipEncoding) throws IOException {
        parseTarHeader(bArr, zipEncoding, false);
    }

    public void setDevMajor(int i) {
        if (i >= 0) {
            this.devMajor = i;
            return;
        }
        throw new IllegalArgumentException("Major device number is out of range: " + i);
    }

    public void setDevMinor(int i) {
        if (i >= 0) {
            this.devMinor = i;
            return;
        }
        throw new IllegalArgumentException("Minor device number is out of range: " + i);
    }

    public void setGroupId(int i) {
        setGroupId((long) i);
    }

    public void setGroupId(long j) {
        this.groupId = j;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setIds(int i, int i2) {
        setUserId(i);
        setGroupId(i2);
    }

    public void setLinkName(String str) {
        this.linkName = str;
    }

    public void setModTime(long j) {
        this.modTime = j / 1000;
    }

    public void setModTime(Date date) {
        this.modTime = date.getTime() / 1000;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setName(String str) {
        this.name = normalizeFileName(str, false);
    }

    public void setNames(String str, String str2) {
        setUserName(str);
        setGroupName(str2);
    }

    public void setSize(long j) {
        if (j >= 0) {
            this.size = j;
            return;
        }
        throw new IllegalArgumentException("Size is out of range: " + j);
    }

    public void setUserId(int i) {
        setUserId((long) i);
    }

    public void setUserId(long j) {
        this.userId = j;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeEntryHeader(byte[] r3) {
        /*
            r2 = this;
            r0 = 0
            org.apache.commons.compress.archivers.zip.ZipEncoding r1 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING     // Catch:{ IOException -> 0x0007 }
            r2.writeEntryHeader(r3, r1, r0)     // Catch:{ IOException -> 0x0007 }
            goto L_0x000c
        L_0x0007:
            org.apache.commons.compress.archivers.zip.ZipEncoding r1 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING     // Catch:{ IOException -> 0x000d }
            r2.writeEntryHeader(r3, r1, r0)     // Catch:{ IOException -> 0x000d }
        L_0x000c:
            return
        L_0x000d:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[]):void");
    }

    public void writeEntryHeader(byte[] bArr, ZipEncoding zipEncoding, boolean z) throws IOException {
        byte[] bArr2 = bArr;
        ZipEncoding zipEncoding2 = zipEncoding;
        int formatNameBytes = TarUtils.formatNameBytes(this.name, bArr, 0, 100, zipEncoding2);
        byte[] bArr3 = bArr;
        boolean z2 = z;
        int writeEntryHeaderField = writeEntryHeaderField(this.modTime, bArr3, writeEntryHeaderField(this.size, bArr3, writeEntryHeaderField(this.groupId, bArr3, writeEntryHeaderField(this.userId, bArr3, writeEntryHeaderField((long) this.mode, bArr3, formatNameBytes, 8, z2), 8, z2), 8, z2), 12, z2), 12, z2);
        int i = writeEntryHeaderField;
        int i2 = 0;
        while (i2 < 8) {
            bArr2[i] = 32;
            i2++;
            i++;
        }
        bArr2[i] = this.linkFlag;
        int formatNameBytes2 = TarUtils.formatNameBytes(this.groupName, bArr, TarUtils.formatNameBytes(this.userName, bArr, TarUtils.formatNameBytes(this.version, bArr, TarUtils.formatNameBytes(this.magic, bArr, TarUtils.formatNameBytes(this.linkName, bArr, i + 1, 100, zipEncoding2), 6), 2), 32, zipEncoding2), 32, zipEncoding2);
        byte[] bArr4 = bArr;
        boolean z3 = z;
        int writeEntryHeaderField2 = writeEntryHeaderField((long) this.devMajor, bArr4, formatNameBytes2, 8, z3);
        for (int writeEntryHeaderField3 = writeEntryHeaderField((long) this.devMinor, bArr4, writeEntryHeaderField2, 8, z3); writeEntryHeaderField3 < bArr2.length; writeEntryHeaderField3++) {
            bArr2[writeEntryHeaderField3] = 0;
        }
        TarUtils.formatCheckSumOctalBytes(TarUtils.computeCheckSum(bArr), bArr, writeEntryHeaderField, 8);
    }
}
