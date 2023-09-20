package com.phonepe.intent.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.wy2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import jmjou.C7601c;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001'BQ\b\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001f¢\u0006\u0004\b%\u0010&J\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005HÖ\u0001R$\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R$\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R%\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/phonepe/intent/sdk/api/B2BPGRequest;", "Landroid/os/Parcelable;", "", "", "getHeaderMaps", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcom/onedelhi/secure/un4;", "writeToParcel", "irjuc", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "data", "cqqlq", "getApiUrl", "setApiUrl", "apiUrl", "chmha", "getCallbackUrl", "setCallbackUrl", "callbackUrl", "jmjou", "getChecksum", "setChecksum", "checksum", "", "rmqfk", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Builder", "IntentSDK_release"}, k = 1, mv = {1, 5, 1})
@wy2
public final class B2BPGRequest implements Parcelable {
    @vr2
    public static final Parcelable.Creator<B2BPGRequest> CREATOR = new Creator();
    @ss2
    public String chmha;
    @ss2
    public String cqqlq;
    @ss2
    public String irjuc;
    @ss2

    /* renamed from: jmjou  reason: collision with root package name */
    public String f38911jmjou;
    @vr2
    public final Map<String, String> rmqfk;

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J*\u0010\b\u001a\u00020\u00002\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000e"}, mo38105d2 = {"Lcom/phonepe/intent/sdk/api/B2BPGRequest$Builder;", "", "", "data", "apiUrl", "callbackUrl", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "headers", "checksum", "Lcom/phonepe/intent/sdk/api/B2BPGRequest;", "build", "<init>", "()V", "IntentSDK_release"}, mo38106k = 1, mo38107mv = {1, 5, 1})
    public static final class Builder {
        @ss2
        public String chmha;
        @ss2
        public String cqqlq;
        @ss2
        public String irjuc;
        @ss2

        /* renamed from: jmjou  reason: collision with root package name */
        public String f38912jmjou;
        @ss2
        public HashMap<String, String> rmqfk;

        @vr2
        public final Builder apiUrl(@vr2 String str) {
            jt1.m53777p(str, "apiUrl");
            this.cqqlq = str;
            return this;
        }

        @vr2
        public final B2BPGRequest build() {
            B2BPGRequest b2BPGRequest = new B2BPGRequest(this.irjuc, this.cqqlq, this.chmha, this.f38912jmjou, new HashMap());
            String data = b2BPGRequest.getData();
            try {
                C7601c objectFactory = PhonePe.getObjectFactory();
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(data, 0)));
                objectFactory.mo48875k("transactionId", jSONObject.get("merchantTransactionId"));
                objectFactory.mo48875k("merchantUserId", jSONObject.get("merchantUserId"));
            } catch (PhonePeInitException | JSONException unused) {
                m05.m56771b("Utils", "Error getting merchant txnId from data");
            }
            HashMap<String, String> hashMap = this.rmqfk;
            if (hashMap != null) {
                b2BPGRequest.getHeaders().putAll(hashMap);
            }
            return b2BPGRequest;
        }

        @vr2
        public final Builder callbackUrl(@vr2 String str) {
            jt1.m53777p(str, "callbackUrl");
            this.chmha = str;
            return this;
        }

        @vr2
        public final Builder checksum(@vr2 String str) {
            jt1.m53777p(str, "checksum");
            this.f38912jmjou = str;
            return this;
        }

        @vr2
        public final Builder data(@vr2 String str) {
            jt1.m53777p(str, C4311b.C4317f.C4318a.f25149a);
            this.irjuc = str;
            return this;
        }

        @vr2
        public final Builder headers(@vr2 HashMap<String, String> hashMap) {
            jt1.m53777p(hashMap, "headers");
            this.rmqfk = hashMap;
            return this;
        }
    }

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {}, mo38105d2 = {}, mo38106k = 3, mo38107mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<B2BPGRequest> {
        @vr2
        public final B2BPGRequest createFromParcel(@vr2 Parcel parcel) {
            jt1.m53777p(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new B2BPGRequest(readString, readString2, readString3, readString4, linkedHashMap, (wg0) null);
        }

        @vr2
        public final B2BPGRequest[] newArray(int i) {
            return new B2BPGRequest[i];
        }
    }

    public B2BPGRequest(String str, String str2, String str3, String str4, Map<String, String> map) {
        this.irjuc = str;
        this.cqqlq = str2;
        this.chmha = str3;
        this.f38911jmjou = str4;
        this.rmqfk = map;
    }

    public /* synthetic */ B2BPGRequest(String str, String str2, String str3, String str4, Map map, wg0 wg0) {
        this(str, str2, str3, str4, map);
    }

    public int describeContents() {
        return 0;
    }

    @ss2
    public final String getApiUrl() {
        return this.cqqlq;
    }

    @ss2
    public final String getCallbackUrl() {
        return this.chmha;
    }

    @ss2
    public final String getChecksum() {
        return this.f38911jmjou;
    }

    @ss2
    public final String getData() {
        return this.irjuc;
    }

    @vr2
    public final Map<String, String> getHeaderMaps() {
        Map<String, String> map = this.rmqfk;
        map.put("X-VERIFY", getChecksum());
        return map;
    }

    @vr2
    public final Map<String, String> getHeaders() {
        return this.rmqfk;
    }

    public final void setApiUrl(@ss2 String str) {
        this.cqqlq = str;
    }

    public final void setCallbackUrl(@ss2 String str) {
        this.chmha = str;
    }

    public final void setChecksum(@ss2 String str) {
        this.f38911jmjou = str;
    }

    public final void setData(@ss2 String str) {
        this.irjuc = str;
    }

    public void writeToParcel(@vr2 Parcel parcel, int i) {
        jt1.m53777p(parcel, "out");
        parcel.writeString(this.irjuc);
        parcel.writeString(this.cqqlq);
        parcel.writeString(this.chmha);
        parcel.writeString(this.f38911jmjou);
        Map<String, String> map = this.rmqfk;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }
}
