package com.onedelhi.secure;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.n33;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.onedelhi.secure.mb */
public final class C2843mb {

    /* renamed from: a */
    public static final String f16004a = "AsyncLayoutInflater";

    /* renamed from: a */
    public Handler.Callback f16005a = new C2844a();

    /* renamed from: a */
    public Handler f16006a;

    /* renamed from: a */
    public LayoutInflater f16007a;

    /* renamed from: a */
    public C2847d f16008a;

    /* renamed from: com.onedelhi.secure.mb$a */
    public class C2844a implements Handler.Callback {
        public C2844a() {
        }

        public boolean handleMessage(Message message) {
            C2846c cVar = (C2846c) message.obj;
            if (cVar.f16012a == null) {
                cVar.f16012a = C2843mb.this.f16007a.inflate(cVar.f16011a, cVar.f16013a, false);
            }
            cVar.f16014a.mo20250a(cVar.f16012a, cVar.f16011a, cVar.f16013a);
            C2843mb.this.f16008a.mo20247d(cVar);
            return true;
        }
    }

    /* renamed from: com.onedelhi.secure.mb$b */
    public static class C2845b extends LayoutInflater {

        /* renamed from: a */
        public static final String[] f16010a = {"android.widget.", "android.webkit.", "android.app."};

        public C2845b(Context context) {
            super(context);
        }

        public LayoutInflater cloneInContext(Context context) {
            return new C2845b(context);
        }

        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            String[] strArr = f16010a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                try {
                    View createView = createView(str, strArr[i], attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                    i++;
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: com.onedelhi.secure.mb$c */
    public static class C2846c {

        /* renamed from: a */
        public int f16011a;

        /* renamed from: a */
        public View f16012a;

        /* renamed from: a */
        public ViewGroup f16013a;

        /* renamed from: a */
        public C2848e f16014a;

        /* renamed from: a */
        public C2843mb f16015a;
    }

    /* renamed from: com.onedelhi.secure.mb$d */
    public static class C2847d extends Thread {

        /* renamed from: a */
        public static final C2847d f16016a;

        /* renamed from: a */
        public n33.C2924c<C2846c> f16017a = new n33.C2924c<>(10);

        /* renamed from: a */
        public ArrayBlockingQueue<C2846c> f16018a = new ArrayBlockingQueue<>(10);

        static {
            C2847d dVar = new C2847d();
            f16016a = dVar;
            dVar.start();
        }

        /* renamed from: b */
        public static C2847d m21414b() {
            return f16016a;
        }

        /* renamed from: a */
        public void mo20245a(C2846c cVar) {
            try {
                this.f16018a.put(cVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        /* renamed from: c */
        public C2846c mo20246c() {
            C2846c b = this.f16017a.mo20818b();
            return b == null ? new C2846c() : b;
        }

        /* renamed from: d */
        public void mo20247d(C2846c cVar) {
            cVar.f16014a = null;
            cVar.f16015a = null;
            cVar.f16013a = null;
            cVar.f16011a = 0;
            cVar.f16012a = null;
            this.f16017a.mo20817a(cVar);
        }

        /* renamed from: e */
        public void mo20248e() {
            try {
                C2846c take = this.f16018a.take();
                try {
                    take.f16012a = take.f16015a.f16007a.inflate(take.f16011a, take.f16013a, false);
                } catch (RuntimeException e) {
                    Log.w(C2843mb.f16004a, "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message.obtain(take.f16015a.f16006a, 0, take).sendToTarget();
            } catch (InterruptedException e2) {
                Log.w(C2843mb.f16004a, e2);
            }
        }

        public void run() {
            while (true) {
                mo20248e();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.mb$e */
    public interface C2848e {
        /* renamed from: a */
        void mo20250a(@mr2 View view, @s12 int i, @ts2 ViewGroup viewGroup);
    }

    public C2843mb(@mr2 Context context) {
        this.f16007a = new C2845b(context);
        this.f16006a = new Handler(this.f16005a);
        this.f16008a = C2847d.m21414b();
    }

    @hn4
    /* renamed from: a */
    public void mo20241a(@s12 int i, @ts2 ViewGroup viewGroup, @mr2 C2848e eVar) {
        Objects.requireNonNull(eVar, "callback argument may not be null!");
        C2846c c = this.f16008a.mo20246c();
        c.f16015a = this;
        c.f16011a = i;
        c.f16013a = viewGroup;
        c.f16014a = eVar;
        this.f16008a.mo20245a(c);
    }
}
