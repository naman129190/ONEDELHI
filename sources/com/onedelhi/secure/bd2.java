package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;

@SafeParcelable.Class(creator = "MapStyleOptionsCreator")
@SafeParcelable.Reserved({1})
public final class bd2 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<bd2> CREATOR = new xd6();

    /* renamed from: c */
    public static final String f9792c = bd2.class.getSimpleName();
    @SafeParcelable.Field(getter = "getJson", mo10053id = 2)

    /* renamed from: b */
    public String f9793b;

    @SafeParcelable.Constructor
    public bd2(@SafeParcelable.Param(mo10056id = 2) @mr2 String str) {
        Preconditions.checkNotNull(str, "json must not be null");
        this.f9793b = str;
    }

    @mr2
    /* renamed from: K2 */
    public static bd2 m11801K2(@mr2 Context context, int i) throws Resources.NotFoundException {
        try {
            return new bd2(new String(IOUtils.readInputStreamFully(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (IOException e) {
            String obj = e.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i + ": " + obj);
        }
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f9793b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
