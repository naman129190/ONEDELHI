package com.phonepe.intent.sdk.p004ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import com.google.android.gms.common.internal.ImagesContract;
import com.onedelhi.secure.C7360yh;
import com.onedelhi.secure.au4;
import com.onedelhi.secure.b35;
import com.onedelhi.secure.f05;
import com.onedelhi.secure.g15;
import com.onedelhi.secure.h35;
import com.onedelhi.secure.id2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.m95;
import com.onedelhi.secure.n95;
import com.onedelhi.secure.o05;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.u25;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.w15;
import com.onedelhi.secure.yi4;
import com.onedelhi.secure.z05;
import com.onedelhi.secure.zz4;
import com.phonepe.intent.sdk.api.B2BPGRequest;
import com.phonepe.intent.sdk.api.PhonePe;
import java.util.Map;
import jmjou.C7601c;
import kotlin.Metadata;
import zihjx.chmha;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/phonepe/intent/sdk/ui/B2BPGActivity;", "Lzihjx/chmha;", "<init>", "()V", "b", "a", "IntentSDK_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: com.phonepe.intent.sdk.ui.B2BPGActivity */
public final class B2BPGActivity extends chmha {

    /* renamed from: o */
    public static final /* synthetic */ int f38586o = 0;

    /* renamed from: a */
    public z05 f38587a;

    /* renamed from: com.phonepe.intent.sdk.ui.B2BPGActivity$a */
    public static final class C7561a extends WebViewClient {
        public boolean shouldOverrideUrlLoading(@vr2 WebView webView, @vr2 String str) {
            jt1.m53777p(webView, "view");
            jt1.m53777p(str, ImagesContract.URL);
            webView.loadUrl(str);
            return true;
        }
    }

    /* renamed from: com.phonepe.intent.sdk.ui.B2BPGActivity$b */
    public static final class C7562b extends WebChromeClient {
        @ss2

        /* renamed from: a */
        public final C7601c f38588a;

        /* renamed from: com.phonepe.intent.sdk.ui.B2BPGActivity$b$a */
        public /* synthetic */ class C7563a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f38589a;

            static {
                int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
                iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 2;
                iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 3;
                iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 4;
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 5;
                f38589a = iArr;
            }
        }

        public C7562b(@ss2 C7601c cVar) {
            this.f38588a = cVar;
        }

        /* JADX WARNING: type inference failed for: r0v7, types: [jmjou.e] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onConsoleMessage(@com.onedelhi.secure.vr2 android.webkit.ConsoleMessage r8) {
            /*
                r7 = this;
                java.lang.String r0 = "consoleMessage"
                com.onedelhi.secure.jt1.m53777p(r8, r0)
                jmjou.c r0 = r7.f38588a
                r1 = 0
                if (r0 != 0) goto L_0x000c
                r0 = r1
                goto L_0x0014
            L_0x000c:
                java.lang.Class<com.onedelhi.secure.r25> r2 = com.onedelhi.secure.r25.class
                jmjou.e r0 = r0.mo48873i(r2)
                com.onedelhi.secure.r25 r0 = (com.onedelhi.secure.r25) r0
            L_0x0014:
                r2 = 0
                r3 = 1
                if (r0 != 0) goto L_0x0019
                goto L_0x0021
            L_0x0019:
                boolean r0 = r0.mo43795a()
                if (r0 != r3) goto L_0x0021
                r0 = 1
                goto L_0x0022
            L_0x0021:
                r0 = 0
            L_0x0022:
                if (r0 == 0) goto L_0x00a8
                android.webkit.ConsoleMessage$MessageLevel r0 = r8.messageLevel()
                if (r0 != 0) goto L_0x002c
                r0 = -1
                goto L_0x0034
            L_0x002c:
                int[] r4 = com.phonepe.intent.sdk.p004ui.B2BPGActivity.C7562b.C7563a.f38589a
                int r0 = r0.ordinal()
                r0 = r4[r0]
            L_0x0034:
                java.lang.String r4 = "WebViewConsole"
                if (r0 == r3) goto L_0x0095
                r3 = 2
                if (r0 == r3) goto L_0x0081
                r3 = 3
                if (r0 == r3) goto L_0x006d
                r3 = 4
                if (r0 == r3) goto L_0x0059
                r3 = 5
                if (r0 == r3) goto L_0x0045
                goto L_0x00a8
            L_0x0045:
                java.lang.String r0 = r8.message()
                int r3 = r8.lineNumber()
                java.lang.String r5 = r8.sourceId()
                com.onedelhi.secure.m05$b r6 = com.onedelhi.secure.m05.f31968a
                if (r6 == 0) goto L_0x00a8
                r6.mo40410i(r4, r0, r3, r5)
                goto L_0x00a8
            L_0x0059:
                java.lang.String r0 = r8.message()
                int r3 = r8.lineNumber()
                java.lang.String r5 = r8.sourceId()
                com.onedelhi.secure.m05$b r6 = com.onedelhi.secure.m05.f31968a
                if (r6 == 0) goto L_0x00a8
                r6.mo40406e(r4, r0, r3, r5)
                goto L_0x00a8
            L_0x006d:
                java.lang.String r0 = r8.message()
                int r3 = r8.lineNumber()
                java.lang.String r5 = r8.sourceId()
                com.onedelhi.secure.m05$b r6 = com.onedelhi.secure.m05.f31968a
                if (r6 == 0) goto L_0x00a8
                r6.mo40405d(r4, r0, r3, r5)
                goto L_0x00a8
            L_0x0081:
                java.lang.String r0 = r8.message()
                int r3 = r8.lineNumber()
                java.lang.String r5 = r8.sourceId()
                com.onedelhi.secure.m05$b r6 = com.onedelhi.secure.m05.f31968a
                if (r6 == 0) goto L_0x00a8
                r6.mo40411j(r4, r0, r3, r5)
                goto L_0x00a8
            L_0x0095:
                java.lang.String r0 = r8.message()
                int r3 = r8.lineNumber()
                java.lang.String r5 = r8.sourceId()
                com.onedelhi.secure.m05$b r6 = com.onedelhi.secure.m05.f31968a
                if (r6 == 0) goto L_0x00a8
                r6.mo40412k(r4, r0, r3, r5)
            L_0x00a8:
                jmjou.c r0 = r7.f38588a
                if (r0 != 0) goto L_0x00ad
                goto L_0x00b6
            L_0x00ad:
                java.lang.Class<com.onedelhi.secure.zz4> r1 = com.onedelhi.secure.zz4.class
                jmjou.e r0 = r0.mo48873i(r1)
                r1 = r0
                com.onedelhi.secure.zz4 r1 = (com.onedelhi.secure.zz4) r1
            L_0x00b6:
                if (r1 != 0) goto L_0x00b9
                goto L_0x00d7
            L_0x00b9:
                java.lang.String r0 = "SDK_WEB_VIEW_CONSOLE_ERROR"
                com.onedelhi.secure.u25 r0 = r1.mo48478b(r0)
                java.lang.String r8 = r8.message()
                java.lang.String r3 = "data"
                java.lang.Object r3 = r0.get(r3)
                org.json.JSONObject r3 = (org.json.JSONObject) r3
                jmjou.c r4 = r0.getObjectFactory()
                java.lang.String r5 = "errorMessage"
                com.onedelhi.secure.h15.put(r3, r4, r5, r8)
                r1.mo48477a(r0)
            L_0x00d7:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.phonepe.intent.sdk.p004ui.B2BPGActivity.C7562b.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
        }

        public void onProgressChanged(@vr2 WebView webView, int i) {
            jt1.m53777p(webView, "view");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m74468n1(com.phonepe.intent.sdk.p004ui.B2BPGActivity r19, com.onedelhi.secure.f05 r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.Class<com.onedelhi.secure.zz4> r2 = com.onedelhi.secure.zz4.class
            java.lang.String r3 = "this$0"
            com.onedelhi.secure.jt1.m53777p(r0, r3)
            boolean r3 = r1 instanceof com.onedelhi.secure.f05.C5205b
            r4 = 0
            if (r3 == 0) goto L_0x03a6
            com.onedelhi.secure.f05$b r1 = (com.onedelhi.secure.f05.C5205b) r1
            com.onedelhi.secure.n15 r1 = r1.f28140a
            r19.getClass()
            com.onedelhi.secure.s15 r3 = r1.f32340a
            if (r3 != 0) goto L_0x001d
            r3 = 0
            goto L_0x001f
        L_0x001d:
            java.lang.String r3 = r3.f34896a
        L_0x001f:
            if (r3 == 0) goto L_0x002a
            boolean r3 = com.onedelhi.secure.t54.m65422U1(r3)
            if (r3 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r3 = 0
            goto L_0x002b
        L_0x002a:
            r3 = 1
        L_0x002b:
            if (r3 != 0) goto L_0x0038
            com.onedelhi.secure.s15 r1 = r1.f32340a
            if (r1 != 0) goto L_0x0034
            r2 = 0
            goto L_0x0397
        L_0x0034:
            java.lang.String r5 = r1.f34896a
            goto L_0x03a2
        L_0x0038:
            com.onedelhi.secure.a35 r3 = r1.f32339a
            if (r3 != 0) goto L_0x003e
            r3 = 0
            goto L_0x004c
        L_0x003e:
            java.lang.String r7 = "success"
            java.lang.Object r3 = r3.get(r7)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r3 = com.onedelhi.secure.jt1.m53768g(r3, r7)
        L_0x004c:
            if (r3 == 0) goto L_0x0392
            com.onedelhi.secure.a35 r3 = r1.f32339a
            java.lang.String r7 = "data"
            java.lang.Object r3 = r3.get(r7)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r8 = "instrumentResponse"
            java.lang.Object r3 = com.onedelhi.secure.h15.getOrNull(r3, r8)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r9 = "intentUrl"
            java.lang.Object r3 = com.onedelhi.secure.h15.getOrNull(r3, r9)
            java.lang.String r3 = (java.lang.String) r3
            com.onedelhi.secure.a35 r10 = r1.f32339a
            java.lang.Object r10 = r10.get(r7)
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.Object r10 = com.onedelhi.secure.h15.getOrNull(r10, r8)
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.String r11 = "redirectInfo"
            java.lang.Object r10 = com.onedelhi.secure.h15.getOrNull(r10, r11)
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.String r12 = "url"
            java.lang.Object r10 = com.onedelhi.secure.h15.getOrNull(r10, r12)
            java.lang.String r10 = (java.lang.String) r10
            com.onedelhi.secure.a35 r12 = r1.f32339a
            java.lang.Object r7 = r12.get(r7)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r7 = com.onedelhi.secure.h15.getOrNull(r7, r8)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r7 = com.onedelhi.secure.h15.getOrNull(r7, r11)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.String r8 = "method"
            java.lang.Object r7 = com.onedelhi.secure.h15.getOrNull(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r3 == 0) goto L_0x00ad
            boolean r8 = com.onedelhi.secure.t54.m65422U1(r3)
            if (r8 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r8 = 0
            goto L_0x00ae
        L_0x00ad:
            r8 = 1
        L_0x00ae:
            java.lang.String r11 = "eventName"
            java.lang.String r12 = "B2B_PG_API_CALL_SUCCESS"
            java.lang.String r14 = "merchantUserId"
            java.lang.String r5 = "merchantTransactionId"
            r16 = 2
            java.lang.String r13 = "merchantId"
            java.lang.String r15 = "targetPackageName"
            r6 = 5
            java.lang.String r17 = "b2BPGViewModel"
            if (r8 != 0) goto L_0x02dd
            com.onedelhi.secure.z05 r7 = r0.f38587a
            if (r7 != 0) goto L_0x00c9
            com.onedelhi.secure.jt1.m53761S(r17)
            r7 = 0
        L_0x00c9:
            com.onedelhi.secure.b35 r8 = r7.mo48098b()
            java.lang.String r7 = r7.f38161b
            r8.getClass()
            com.onedelhi.secure.ey2[] r10 = new com.onedelhi.secure.ey2[r6]
            com.onedelhi.secure.ey2 r9 = com.onedelhi.secure.yi4.m71797a(r9, r3)
            r10[r4] = r9
            com.onedelhi.secure.ey2 r7 = com.onedelhi.secure.yi4.m71797a(r15, r7)
            r9 = 1
            r10[r9] = r7
            java.lang.String r7 = r8.f26121a
            com.onedelhi.secure.ey2 r7 = com.onedelhi.secure.yi4.m71797a(r13, r7)
            r10[r16] = r7
            java.lang.String r7 = r8.f26122b
            com.onedelhi.secure.ey2 r7 = com.onedelhi.secure.yi4.m71797a(r5, r7)
            r9 = 3
            r10[r9] = r7
            java.lang.String r7 = r8.f26123c
            com.onedelhi.secure.ey2 r7 = com.onedelhi.secure.yi4.m71797a(r14, r7)
            r8 = 4
            r10[r8] = r7
            java.util.Map r7 = com.onedelhi.secure.id2.m52120W(r10)
            com.onedelhi.secure.jt1.m53777p(r12, r11)
            jmjou.c r8 = com.phonepe.intent.sdk.api.PhonePe.getObjectFactory()
            jmjou.e r8 = r8.mo48873i(r2)
            com.onedelhi.secure.zz4 r8 = (com.onedelhi.secure.zz4) r8
            com.onedelhi.secure.u25 r9 = r8.mo48478b(r12)
            if (r7 != 0) goto L_0x0113
            goto L_0x0135
        L_0x0113:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x011b:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0135
            java.lang.Object r10 = r7.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r12 = r10.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r10 = r10.getValue()
            r9.mo45379a(r12, r10)
            goto L_0x011b
        L_0x0135:
            r8.mo48477a(r9)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            com.onedelhi.secure.v25 r1 = r1.f32341a
            if (r1 != 0) goto L_0x0142
            r1 = 0
            goto L_0x0144
        L_0x0142:
            java.lang.String r1 = r1.f36418a
        L_0x0144:
            if (r1 == 0) goto L_0x0147
            goto L_0x0149
        L_0x0147:
            java.lang.String r1 = ""
        L_0x0149:
            com.onedelhi.secure.z05 r7 = r0.f38587a
            if (r7 != 0) goto L_0x0151
            com.onedelhi.secure.jt1.m53761S(r17)
            r7 = 0
        L_0x0151:
            if (r3 != 0) goto L_0x0155
            r8 = 0
            goto L_0x0159
        L_0x0155:
            java.lang.String r8 = r3.toString()
        L_0x0159:
            com.onedelhi.secure.b35 r7 = r7.mo48098b()
            r7.getClass()
            com.onedelhi.secure.ey2[] r9 = new com.onedelhi.secure.ey2[r6]
            java.lang.String r10 = "intentUri"
            com.onedelhi.secure.ey2 r8 = com.onedelhi.secure.yi4.m71797a(r10, r8)
            r9[r4] = r8
            com.onedelhi.secure.ey2 r8 = com.onedelhi.secure.yi4.m71797a(r15, r1)
            r12 = 1
            r9[r12] = r8
            java.lang.String r8 = r7.f26121a
            com.onedelhi.secure.ey2 r8 = com.onedelhi.secure.yi4.m71797a(r13, r8)
            r9[r16] = r8
            java.lang.String r8 = r7.f26122b
            com.onedelhi.secure.ey2 r8 = com.onedelhi.secure.yi4.m71797a(r5, r8)
            r12 = 3
            r9[r12] = r8
            java.lang.String r7 = r7.f26123c
            com.onedelhi.secure.ey2 r7 = com.onedelhi.secure.yi4.m71797a(r14, r7)
            r8 = 4
            r9[r8] = r7
            java.util.Map r7 = com.onedelhi.secure.id2.m52120W(r9)
            java.lang.String r8 = "B2B_PG_OPEN_APP_FOR_INTENT_STARTED"
            com.onedelhi.secure.jt1.m53777p(r8, r11)
            jmjou.c r9 = com.phonepe.intent.sdk.api.PhonePe.getObjectFactory()
            jmjou.e r9 = r9.mo48873i(r2)
            com.onedelhi.secure.zz4 r9 = (com.onedelhi.secure.zz4) r9
            com.onedelhi.secure.u25 r8 = r9.mo48478b(r8)
            if (r7 != 0) goto L_0x01a5
            goto L_0x01ca
        L_0x01a5:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x01ad:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x01ca
            java.lang.Object r12 = r7.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r18 = r12.getKey()
            r6 = r18
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r12 = r12.getValue()
            r8.mo45379a(r6, r12)
            r6 = 5
            goto L_0x01ad
        L_0x01ca:
            r9.mo48477a(r8)
            com.onedelhi.secure.x44 r6 = com.onedelhi.secure.x44.f37329a
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r4] = r3
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
            java.lang.String r6 = "request activity start for result for uri = {%s}."
            java.lang.String r6 = java.lang.String.format(r6, r7)
            java.lang.String r7 = "java.lang.String.format(format, *args)"
            com.onedelhi.secure.jt1.m53776o(r6, r7)
            java.lang.String r7 = "B2BPGActivity"
            com.onedelhi.secure.m05.m56772c(r7, r6)
            boolean r6 = com.onedelhi.secure.l05.m55204h(r0, r1)
            if (r6 != 0) goto L_0x0208
            com.onedelhi.secure.z05 r6 = r0.f38587a
            if (r6 != 0) goto L_0x01f6
            com.onedelhi.secure.jt1.m53761S(r17)
            r6 = 0
        L_0x01f6:
            if (r3 != 0) goto L_0x01fa
            r8 = 0
            goto L_0x01fe
        L_0x01fa:
            java.lang.String r8 = r3.toString()
        L_0x01fe:
            java.lang.String r9 = "TARGET_APP_NOT_INSTALLED"
            r6.mo48100e(r8, r1, r9)
            java.lang.String r6 = "Target app not installed-b2b pg"
            com.onedelhi.secure.m05.m56772c(r7, r6)
        L_0x0208:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r8 = "android.intent.action.VIEW"
            r6.<init>(r8, r3)
            r6.setPackage(r1)
            boolean r8 = r19.isFinishing()
            if (r8 != 0) goto L_0x03d0
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r12 = r6.toString()
            r9[r4] = r12
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r8)
            java.lang.String r8 = "starting activity for intent = {%s}."
            java.lang.String r8 = java.lang.String.format(r8, r9)
            java.lang.String r9 = "java.lang.String.format(format, *args)"
            com.onedelhi.secure.jt1.m53776o(r8, r9)
            com.onedelhi.secure.m05.m56772c(r7, r8)
            android.content.pm.PackageManager r7 = r19.getPackageManager()
            android.content.ComponentName r7 = r6.resolveActivity(r7)
            if (r7 == 0) goto L_0x02c6
            com.onedelhi.secure.z05 r7 = r0.f38587a
            if (r7 != 0) goto L_0x0245
            com.onedelhi.secure.jt1.m53761S(r17)
            r7 = 0
        L_0x0245:
            if (r3 != 0) goto L_0x0249
            r3 = 0
            goto L_0x024d
        L_0x0249:
            java.lang.String r3 = r3.toString()
        L_0x024d:
            com.onedelhi.secure.b35 r7 = r7.mo48098b()
            r7.getClass()
            r8 = 5
            com.onedelhi.secure.ey2[] r8 = new com.onedelhi.secure.ey2[r8]
            com.onedelhi.secure.ey2 r3 = com.onedelhi.secure.yi4.m71797a(r10, r3)
            r8[r4] = r3
            com.onedelhi.secure.ey2 r1 = com.onedelhi.secure.yi4.m71797a(r15, r1)
            r3 = 1
            r8[r3] = r1
            java.lang.String r1 = r7.f26121a
            com.onedelhi.secure.ey2 r1 = com.onedelhi.secure.yi4.m71797a(r13, r1)
            r8[r16] = r1
            java.lang.String r1 = r7.f26122b
            com.onedelhi.secure.ey2 r1 = com.onedelhi.secure.yi4.m71797a(r5, r1)
            r3 = 3
            r8[r3] = r1
            java.lang.String r1 = r7.f26123c
            com.onedelhi.secure.ey2 r1 = com.onedelhi.secure.yi4.m71797a(r14, r1)
            r3 = 4
            r8[r3] = r1
            java.util.Map r1 = com.onedelhi.secure.id2.m52120W(r8)
            java.lang.String r3 = "B2B_PG_OPEN_APP_FOR_INTENT_SUCCESS"
            com.onedelhi.secure.jt1.m53777p(r3, r11)
            jmjou.c r3 = com.phonepe.intent.sdk.api.PhonePe.getObjectFactory()
            jmjou.e r2 = r3.mo48873i(r2)
            com.onedelhi.secure.zz4 r2 = (com.onedelhi.secure.zz4) r2
            java.lang.String r3 = "B2B_PG_OPEN_APP_FOR_INTENT_SUCCESS"
            com.onedelhi.secure.u25 r3 = r2.mo48478b(r3)
            if (r1 != 0) goto L_0x029a
            goto L_0x02bc
        L_0x029a:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x02a2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02bc
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            r3.mo45379a(r5, r4)
            goto L_0x02a2
        L_0x02bc:
            r2.mo48477a(r3)
            r1 = 725(0x2d5, float:1.016E-42)
            r0.startActivityForResult(r6, r1)
            goto L_0x03d0
        L_0x02c6:
            com.onedelhi.secure.z05 r0 = r0.f38587a
            if (r0 != 0) goto L_0x02ce
            com.onedelhi.secure.jt1.m53761S(r17)
            r0 = 0
        L_0x02ce:
            if (r3 != 0) goto L_0x02d2
            r5 = 0
            goto L_0x02d6
        L_0x02d2:
            java.lang.String r5 = r3.toString()
        L_0x02d6:
            java.lang.String r2 = "INTENT_RESOLVE_ACTIVITY_NULL"
            r0.mo48100e(r5, r1, r2)
            goto L_0x03d0
        L_0x02dd:
            if (r10 == 0) goto L_0x02e8
            boolean r1 = com.onedelhi.secure.t54.m65422U1(r10)
            if (r1 == 0) goto L_0x02e6
            goto L_0x02e8
        L_0x02e6:
            r1 = 0
            goto L_0x02e9
        L_0x02e8:
            r1 = 1
        L_0x02e9:
            if (r1 != 0) goto L_0x0385
            java.lang.String r1 = "GET"
            r3 = 1
            boolean r1 = com.onedelhi.secure.t54.m65410K1(r7, r1, r3)
            if (r1 == 0) goto L_0x0385
            com.onedelhi.secure.z05 r1 = r0.f38587a
            if (r1 != 0) goto L_0x02fc
            com.onedelhi.secure.jt1.m53761S(r17)
            r1 = 0
        L_0x02fc:
            com.onedelhi.secure.b35 r3 = r1.mo48098b()
            java.lang.String r1 = r1.f38161b
            r3.getClass()
            r6 = 5
            com.onedelhi.secure.ey2[] r6 = new com.onedelhi.secure.ey2[r6]
            java.lang.String r7 = "redirectUrl"
            com.onedelhi.secure.ey2 r7 = com.onedelhi.secure.yi4.m71797a(r7, r10)
            r6[r4] = r7
            com.onedelhi.secure.ey2 r1 = com.onedelhi.secure.yi4.m71797a(r15, r1)
            r7 = 1
            r6[r7] = r1
            java.lang.String r1 = r3.f26121a
            com.onedelhi.secure.ey2 r1 = com.onedelhi.secure.yi4.m71797a(r13, r1)
            r6[r16] = r1
            java.lang.String r1 = r3.f26122b
            com.onedelhi.secure.ey2 r1 = com.onedelhi.secure.yi4.m71797a(r5, r1)
            r5 = 3
            r6[r5] = r1
            java.lang.String r1 = r3.f26123c
            com.onedelhi.secure.ey2 r1 = com.onedelhi.secure.yi4.m71797a(r14, r1)
            r3 = 4
            r6[r3] = r1
            java.util.Map r1 = com.onedelhi.secure.id2.m52120W(r6)
            com.onedelhi.secure.jt1.m53777p(r12, r11)
            jmjou.c r3 = com.phonepe.intent.sdk.api.PhonePe.getObjectFactory()
            jmjou.e r2 = r3.mo48873i(r2)
            com.onedelhi.secure.zz4 r2 = (com.onedelhi.secure.zz4) r2
            com.onedelhi.secure.u25 r3 = r2.mo48478b(r12)
            if (r1 != 0) goto L_0x0349
            goto L_0x036b
        L_0x0349:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0351:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x036b
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            r3.mo45379a(r6, r5)
            goto L_0x0351
        L_0x036b:
            r2.mo48477a(r3)
            if (r10 == 0) goto L_0x0379
            boolean r1 = com.onedelhi.secure.t54.m65422U1(r10)
            if (r1 == 0) goto L_0x0377
            goto L_0x0379
        L_0x0377:
            r6 = 0
            goto L_0x037a
        L_0x0379:
            r6 = 1
        L_0x037a:
            if (r6 != 0) goto L_0x03d0
            android.webkit.WebView r1 = r0.f38900a
            r1.setVisibility(r4)
            r0.mo47501k(r10)
            goto L_0x03d0
        L_0x0385:
            com.onedelhi.secure.z05 r0 = r0.f38587a
            if (r0 != 0) goto L_0x038d
            com.onedelhi.secure.jt1.m53761S(r17)
            r0 = 0
        L_0x038d:
            r2 = 0
            r0.mo48099d(r2)
            goto L_0x03d0
        L_0x0392:
            r2 = 0
            com.onedelhi.secure.a35 r1 = r1.f32339a
            if (r1 != 0) goto L_0x0399
        L_0x0397:
            r5 = r2
            goto L_0x03a2
        L_0x0399:
            java.lang.String r2 = "message"
            java.lang.Object r1 = r1.get(r2)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
        L_0x03a2:
            r0.mo48631o1(r5)
            goto L_0x03d0
        L_0x03a6:
            boolean r2 = r1 instanceof com.onedelhi.secure.f05.C5204a
            if (r2 == 0) goto L_0x03d0
            com.onedelhi.secure.f05$a r1 = (com.onedelhi.secure.f05.C5204a) r1
            java.lang.String r2 = r1.f28139a
            java.lang.Boolean r1 = r1.f28138a
            r19.getClass()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r5 = "key_txn_result"
            r3.putExtra(r5, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = com.onedelhi.secure.jt1.m53768g(r1, r2)
            if (r1 == 0) goto L_0x03c9
            r0.setResult(r4, r3)
            goto L_0x03cd
        L_0x03c9:
            r1 = -1
            r0.setResult(r1, r3)
        L_0x03cd:
            r19.finish()
        L_0x03d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.phonepe.intent.sdk.p004ui.B2BPGActivity.m74468n1(com.phonepe.intent.sdk.ui.B2BPGActivity, com.onedelhi.secure.f05):void");
    }

    /* renamed from: a */
    public void mo18084a(@ss2 String str, @ss2 String str2, @ss2 String str3) {
    }

    /* renamed from: b */
    public void mo18085b(@ss2 String str, @ss2 String str2, @ss2 String str3) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18087d(@com.onedelhi.secure.ss2 java.lang.String r8) {
        /*
            r7 = this;
            com.onedelhi.secure.z05 r0 = r7.f38587a
            java.lang.String r1 = "b2BPGViewModel"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            com.onedelhi.secure.jt1.m53761S(r1)
            r0 = r2
        L_0x000b:
            jmjou.c r3 = r0.f38159a
            java.lang.Class<com.onedelhi.secure.h35> r4 = com.onedelhi.secure.h35.class
            jmjou.e r3 = com.onedelhi.secure.h15.fromJsonString(r8, r3, r4)
            com.onedelhi.secure.h35 r3 = (com.onedelhi.secure.h35) r3
            com.onedelhi.secure.lm2<com.onedelhi.secure.f05> r4 = r0.f38155a
            java.lang.String r5 = "statusCode"
            if (r3 != 0) goto L_0x001d
            r6 = r2
            goto L_0x0023
        L_0x001d:
            java.lang.Object r6 = r3.get(r5)
            java.lang.String r6 = (java.lang.String) r6
        L_0x0023:
            if (r6 == 0) goto L_0x0056
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r5 = "response.get<String>(\n  …                        )"
            com.onedelhi.secure.jt1.m53776o(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            com.onedelhi.secure.eh3 r5 = new com.onedelhi.secure.eh3
            r5.<init>((java.lang.String) r3)
            java.lang.String r3 = "USER_CANCEL"
            boolean r5 = r5.mo35379k(r3)
            if (r5 == 0) goto L_0x0056
            com.onedelhi.secure.f05$a r5 = new com.onedelhi.secure.f05$a
            jmjou.c r0 = r0.f38159a
            if (r0 != 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            com.onedelhi.secure.h35 r0 = r0.mo48876m(r3)
            if (r0 != 0) goto L_0x004c
        L_0x004a:
            r0 = r2
            goto L_0x0050
        L_0x004c:
            java.lang.String r0 = r0.toJsonString()
        L_0x0050:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r5.<init>(r0, r3)
            goto L_0x005d
        L_0x0056:
            com.onedelhi.secure.f05$a r5 = new com.onedelhi.secure.f05$a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.<init>(r8, r0)
        L_0x005d:
            r4.mo4930n(r5)
            com.onedelhi.secure.z05 r0 = r7.f38587a
            if (r0 != 0) goto L_0x0068
            com.onedelhi.secure.jt1.m53761S(r1)
            goto L_0x0069
        L_0x0068:
            r2 = r0
        L_0x0069:
            com.onedelhi.secure.b35 r0 = r2.mo48098b()
            r0.getClass()
            r1 = 4
            com.onedelhi.secure.ey2[] r1 = new com.onedelhi.secure.ey2[r1]
            java.lang.String r2 = "webviewResult"
            com.onedelhi.secure.ey2 r8 = com.onedelhi.secure.yi4.m71797a(r2, r8)
            r2 = 0
            r1[r2] = r8
            java.lang.String r8 = r0.f26121a
            java.lang.String r2 = "merchantId"
            com.onedelhi.secure.ey2 r8 = com.onedelhi.secure.yi4.m71797a(r2, r8)
            r2 = 1
            r1[r2] = r8
            java.lang.String r8 = r0.f26122b
            java.lang.String r2 = "merchantTransactionId"
            com.onedelhi.secure.ey2 r8 = com.onedelhi.secure.yi4.m71797a(r2, r8)
            r2 = 2
            r1[r2] = r8
            java.lang.String r8 = r0.f26123c
            java.lang.String r0 = "merchantUserId"
            com.onedelhi.secure.ey2 r8 = com.onedelhi.secure.yi4.m71797a(r0, r8)
            r0 = 3
            r1[r0] = r8
            java.util.Map r8 = com.onedelhi.secure.id2.m52120W(r1)
            java.lang.String r0 = "B2B_PG_WEBVIEW_RESULT"
            java.lang.String r1 = "eventName"
            com.onedelhi.secure.jt1.m53777p(r0, r1)
            jmjou.c r1 = com.phonepe.intent.sdk.api.PhonePe.getObjectFactory()
            java.lang.Class<com.onedelhi.secure.zz4> r2 = com.onedelhi.secure.zz4.class
            jmjou.e r1 = r1.mo48873i(r2)
            com.onedelhi.secure.zz4 r1 = (com.onedelhi.secure.zz4) r1
            com.onedelhi.secure.u25 r0 = r1.mo48478b(r0)
            if (r8 != 0) goto L_0x00bb
            goto L_0x00dd
        L_0x00bb:
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x00c3:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00dd
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            r0.mo45379a(r3, r2)
            goto L_0x00c3
        L_0x00dd:
            r1.mo48477a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.phonepe.intent.sdk.p004ui.B2BPGActivity.mo18087d(java.lang.String):void");
    }

    /* renamed from: j */
    public void mo18088j(@ss2 o05 o05) {
    }

    /* renamed from: k1 */
    public void mo48630k1() {
        this.f38900a.setWebViewClient(new C7561a());
        WebView webView = this.f38900a;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("data_factory");
        webView.setWebChromeClient(new C7562b(parcelableExtra instanceof C7601c ? (C7601c) parcelableExtra : null));
        super.mo48630k1();
    }

    /* renamed from: o1 */
    public final void mo48631o1(String str) {
        z05 z05 = this.f38587a;
        if (z05 == null) {
            jt1.m53761S("b2BPGViewModel");
            z05 = null;
        }
        z05.mo48099d(str);
        Toast.makeText(this, str, 1).show();
        finish();
    }

    public void onActivityResult(int i, int i2, @ss2 Intent intent) {
        super.onActivityResult(i, i2, intent);
        z05 z05 = this.f38587a;
        String str = null;
        if (z05 == null) {
            jt1.m53761S("b2BPGViewModel");
            z05 = null;
        }
        z05.getClass();
        if (i == 725) {
            boolean z = i2 == 0;
            m95 a = m95.m57004a(intent);
            C7601c cVar = z05.f38159a;
            h35 m = cVar == null ? null : cVar.mo48876m("FAILED");
            String m95 = a == null ? null : a.toString();
            if (m95 != null) {
                str = m95;
            } else if (m != null) {
                str = m.toJsonString();
            }
            z05.f38155a.mo4933q(new f05.C5204a(str, Boolean.valueOf(z)));
            b35 b = z05.mo48098b();
            String str2 = z05.f38161b;
            b.getClass();
            Map W = id2.m52120W(yi4.m71797a("response", str), yi4.m71797a("isUserCancelled", Boolean.valueOf(z)), yi4.m71797a("targetPackageName", str2), yi4.m71797a("merchantId", b.f26121a), yi4.m71797a("merchantTransactionId", b.f26122b), yi4.m71797a("merchantUserId", b.f26123c));
            jt1.m53777p("B2B_PG_UPI_APP_RETURNED_RESULT", "eventName");
            zz4 zz4 = (zz4) PhonePe.getObjectFactory().mo48873i(zz4.class);
            u25 b2 = zz4.mo48478b("B2B_PG_UPI_APP_RETURNED_RESULT");
            if (W != null) {
                for (Map.Entry entry : W.entrySet()) {
                    b2.mo45379a((String) entry.getKey(), entry.getValue());
                }
            }
            zz4.mo48477a(b2);
        }
    }

    public void onCreate(@ss2 Bundle bundle) {
        super.onCreate(bundle);
        au4 a = new C0709m(this).mo5027a(z05.class);
        jt1.m53776o(a, "ViewModelProvider(this)[…BPGViewModel::class.java]");
        z05 z05 = (z05) a;
        this.f38587a = z05;
        z05 z052 = null;
        if (z05 == null) {
            jt1.m53761S("b2BPGViewModel");
            z05 = null;
        }
        Parcelable parcelableExtra = getIntent().getParcelableExtra("data_factory");
        C7601c cVar = parcelableExtra instanceof C7601c ? (C7601c) parcelableExtra : null;
        z05.getClass();
        if (cVar != null) {
            z05.f38159a = cVar;
        }
        z05 z053 = this.f38587a;
        if (z053 == null) {
            jt1.m53761S("b2BPGViewModel");
            z053 = null;
        }
        Bundle extras = getIntent().getExtras();
        z053.getClass();
        z053.f38161b = extras == null ? null : extras.getString("openIntentWithApp");
        B2BPGRequest b2BPGRequest = extras == null ? null : (B2BPGRequest) extras.getParcelable("request");
        if (!(b2BPGRequest instanceof B2BPGRequest)) {
            b2BPGRequest = null;
        }
        z053.f38158a = b2BPGRequest;
        w15 w15 = extras == null ? null : (w15) extras.getParcelable("sdk_context");
        if (!(w15 instanceof w15)) {
            w15 = null;
        }
        z053.f38157a = w15;
        z05 z054 = this.f38587a;
        if (z054 == null) {
            jt1.m53761S("b2BPGViewModel");
            z054 = null;
        }
        b35 b = z054.mo48098b();
        String str = z054.f38161b;
        b.getClass();
        Map W = id2.m52120W(yi4.m71797a("targetPackageName", str), yi4.m71797a("merchantId", b.f26121a), yi4.m71797a("merchantTransactionId", b.f26122b), yi4.m71797a("merchantUserId", b.f26123c));
        jt1.m53777p("B2B_PG_API_CALL_STARTED", "eventName");
        zz4 zz4 = (zz4) PhonePe.getObjectFactory().mo48873i(zz4.class);
        u25 b2 = zz4.mo48478b("B2B_PG_API_CALL_STARTED");
        if (W != null) {
            for (Map.Entry entry : W.entrySet()) {
                b2.mo45379a((String) entry.getKey(), entry.getValue());
            }
        }
        zz4.mo48477a(b2);
        g15 g15 = (g15) z054.f38156a.getValue();
        if (g15 != null) {
            g15.mo36530j(z054.f38158a, z054.f38157a, (n95) null, z054);
        }
        z05 z055 = this.f38587a;
        if (z055 == null) {
            jt1.m53761S("b2BPGViewModel");
        } else {
            z052 = z055;
        }
        z052.f38155a.mo4926j(this, new C7360yh(this));
    }
}
