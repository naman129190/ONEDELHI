package org.apache.commons.compress.changes;

import java.io.InputStream;
import java.util.Objects;
import org.apache.commons.compress.archivers.ArchiveEntry;

class Change {
    public static final int TYPE_ADD = 2;
    public static final int TYPE_DELETE = 1;
    public static final int TYPE_DELETE_DIR = 4;
    public static final int TYPE_MOVE = 3;
    private final ArchiveEntry entry;
    private final InputStream input;
    private final boolean replaceMode;
    private final String targetFile;
    private final int type;

    public Change(String str, int i) {
        Objects.requireNonNull(str);
        this.targetFile = str;
        this.type = i;
        this.input = null;
        this.entry = null;
        this.replaceMode = true;
    }

    public Change(ArchiveEntry archiveEntry, InputStream inputStream, boolean z) {
        if (archiveEntry == null || inputStream == null) {
            throw null;
        }
        this.entry = archiveEntry;
        this.input = inputStream;
        this.type = 2;
        this.targetFile = null;
        this.replaceMode = z;
    }

    public ArchiveEntry getEntry() {
        return this.entry;
    }

    public InputStream getInput() {
        return this.input;
    }

    public boolean isReplaceMode() {
        return this.replaceMode;
    }

    public String targetFile() {
        return this.targetFile;
    }

    public int type() {
        return this.type;
    }
}
