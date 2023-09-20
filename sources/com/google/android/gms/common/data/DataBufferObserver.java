package com.google.android.gms.common.data;

import com.onedelhi.secure.mr2;

public interface DataBufferObserver {

    public interface Observable {
        void addObserver(@mr2 DataBufferObserver dataBufferObserver);

        void removeObserver(@mr2 DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i, int i2);

    void onDataRangeInserted(int i, int i2);

    void onDataRangeMoved(int i, int i2, int i3);

    void onDataRangeRemoved(int i, int i2);
}
