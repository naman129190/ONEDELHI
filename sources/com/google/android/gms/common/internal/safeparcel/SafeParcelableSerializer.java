package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.onedelhi.secure.ee5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;

@KeepForSdk
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    @mr2
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromBytes(@mr2 byte[] bArr, @mr2 Parcelable.Creator<T> creator) {
        Preconditions.checkNotNull(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    @KeepForSdk
    @ts2
    public static <T extends SafeParcelable> T deserializeFromIntentExtra(@mr2 Intent intent, @mr2 String str, @mr2 Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return deserializeFromBytes(byteArrayExtra, creator);
    }

    @mr2
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromString(@mr2 String str, @mr2 Parcelable.Creator<T> creator) {
        return deserializeFromBytes(Base64Utils.decodeUrlSafe(str), creator);
    }

    @ts2
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundle(@mr2 Bundle bundle, @mr2 String str, @mr2 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @KeepForSdk
    @ts2
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundleSafe(@mr2 Bundle bundle, @mr2 String str, @mr2 Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(bundle.getByteArray(str), creator);
    }

    @ts2
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBytes(@ts2 byte[] bArr, @mr2 Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    @KeepForSdk
    @ts2
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtra(@mr2 Intent intent, @mr2 String str, @mr2 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @KeepForSdk
    @ts2
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtraSafe(@mr2 Intent intent, @mr2 String str, @mr2 Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToBundle(@mr2 Iterable<T> iterable, @mr2 Bundle bundle, @mr2 String str) {
        ArrayList arrayList = new ArrayList();
        for (T serializeToBytes : iterable) {
            arrayList.add(serializeToBytes(serializeToBytes));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends SafeParcelable> void serializeIterableToBundleSafe(@mr2 Iterable<T> iterable, @mr2 Bundle bundle, @mr2 String str) {
        bundle.putByteArray(str, zza(iterable));
    }

    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToIntentExtra(@mr2 Iterable<T> iterable, @mr2 Intent intent, @mr2 String str) {
        ArrayList arrayList = new ArrayList();
        for (T serializeToBytes : iterable) {
            arrayList.add(serializeToBytes(serializeToBytes));
        }
        intent.putExtra(str, arrayList);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeIterableToIntentExtraSafe(@mr2 Iterable<T> iterable, @mr2 Intent intent, @mr2 String str) {
        intent.putExtra(str, zza(iterable));
    }

    @mr2
    @KeepForSdk
    public static <T extends SafeParcelable> byte[] serializeToBytes(@mr2 T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeToIntentExtra(@mr2 T t, @mr2 Intent intent, @mr2 String str) {
        intent.putExtra(str, serializeToBytes(t));
    }

    @mr2
    @KeepForSdk
    public static <T extends SafeParcelable> String serializeToString(@mr2 T t) {
        return Base64Utils.encodeUrlSafe(serializeToBytes(t));
    }

    private static byte[] zza(Iterable iterable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeTypedList(ee5.m13718o(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
