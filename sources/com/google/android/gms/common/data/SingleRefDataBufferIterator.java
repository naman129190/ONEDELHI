package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.mr2;
import java.util.NoSuchElementException;

@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(@mr2 DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @mr2
    public final Object next() {
        if (hasNext()) {
            int i = this.zab + 1;
            this.zab = i;
            if (i == 0) {
                Object checkNotNull = Preconditions.checkNotNull(this.zaa.get(0));
                this.zac = checkNotNull;
                if (!(checkNotNull instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(checkNotNull.getClass());
                    throw new IllegalStateException("DataBuffer reference of type " + valueOf + " is not movable");
                }
            } else {
                ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
            }
            return this.zac;
        }
        int i2 = this.zab;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i2);
    }
}
