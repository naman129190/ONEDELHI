package com.phonepe.intent.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.l05;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.zz4;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class TransactionRequest implements Parcelable {
    public static final Parcelable.Creator<TransactionRequest> CREATOR = new irjuc();
    public String chmha;
    public String cqqlq;
    public String irjuc;

    /* renamed from: jmjou  reason: collision with root package name */
    public String f38913jmjou;
    public Map<String, String> rmqfk;

    public static class TransactionRequestBuilder {
        public String chmha;
        public String cqqlq;
        public String irjuc;

        /* renamed from: jmjou  reason: collision with root package name */
        public String f38914jmjou;
        public HashMap<String, String> rmqfk;

        public TransactionRequest build() {
            if (l05.m55207k(this.chmha)) {
                throw new InvalidMandatoryRequestParamException(C4311b.C4317f.C4318a.f25149a);
            } else if (l05.m55207k(this.irjuc)) {
                throw new InvalidMandatoryRequestParamException("checksum");
            } else if (!l05.m55207k(this.cqqlq)) {
                TransactionRequest transactionRequest = new TransactionRequest((irjuc) null);
                String str = this.chmha;
                transactionRequest.chmha = str;
                transactionRequest.irjuc = this.irjuc;
                transactionRequest.cqqlq = this.cqqlq;
                transactionRequest.f38913jmjou = this.f38914jmjou;
                try {
                    PhonePe.getObjectFactory().mo48875k("transactionId", new JSONObject(new String(Base64.decode(str, 0))).get("transactionId"));
                } catch (PhonePeInitException | JSONException unused) {
                    m05.m56771b("Utils", "Error getting txnId from data");
                }
                HashMap<String, String> hashMap = this.rmqfk;
                if (hashMap != null && !hashMap.isEmpty()) {
                    transactionRequest.rmqfk.putAll(this.rmqfk);
                }
                try {
                    zz4 zz4 = (zz4) PhonePe.getObjectFactory().mo48873i(zz4.class);
                    zz4.mo48477a(zz4.mo48478b("SDK_TRANSACTION_REQUEST_CREATED"));
                } catch (PhonePeInitException e) {
                    m05.m56773d("TrxRequestBuilder", e.getMessage(), e);
                }
                return transactionRequest;
            } else {
                throw new InvalidMandatoryRequestParamException("apiUrl");
            }
        }

        public TransactionRequestBuilder setChecksum(@mr2 String str) {
            this.irjuc = str;
            return this;
        }

        public TransactionRequestBuilder setData(@mr2 String str) {
            this.chmha = str;
            return this;
        }

        public TransactionRequestBuilder setHeaders(@mr2 HashMap<String, String> hashMap) {
            this.rmqfk = hashMap;
            return this;
        }

        public TransactionRequestBuilder setRedirectUrl(@mr2 String str) {
            this.f38914jmjou = str;
            return this;
        }

        public TransactionRequestBuilder setUrl(@mr2 String str) {
            this.cqqlq = str;
            return this;
        }
    }

    public class irjuc implements Parcelable.Creator<TransactionRequest> {
        public Object createFromParcel(Parcel parcel) {
            return new TransactionRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new TransactionRequest[i];
        }
    }

    private TransactionRequest() {
        this.rmqfk = new HashMap();
    }

    public TransactionRequest(Parcel parcel) {
        this.irjuc = parcel.readString();
        this.cqqlq = parcel.readString();
        this.chmha = parcel.readString();
        this.f38913jmjou = parcel.readString();
        this.rmqfk = parcel.readHashMap(TransactionRequest.class.getClassLoader());
    }

    public /* synthetic */ TransactionRequest(irjuc irjuc2) {
        this();
    }

    public int describeContents() {
        return 0;
    }

    public String getAPIUrl() {
        return this.cqqlq;
    }

    public String getChecksum() {
        return this.irjuc;
    }

    public String getData() {
        return this.chmha;
    }

    public Map<String, String> getHeaderMap() {
        this.rmqfk.put("X-VERIFY", this.irjuc);
        return this.rmqfk;
    }

    public String getRedirectUrl() {
        return this.f38913jmjou;
    }

    public boolean isDebitRequest() {
        return this.cqqlq.contains("debit");
    }

    public String toString() {
        return "TransactionRequest{checksum='" + this.irjuc + '\'' + ", apiUrl='" + this.cqqlq + '\'' + ", data='" + this.chmha + '\'' + ", redirectUrl='" + this.f38913jmjou + '\'' + ", headers=" + this.rmqfk + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.irjuc);
        parcel.writeString(this.cqqlq);
        parcel.writeString(this.chmha);
        parcel.writeString(this.f38913jmjou);
        parcel.writeMap(this.rmqfk);
    }
}
