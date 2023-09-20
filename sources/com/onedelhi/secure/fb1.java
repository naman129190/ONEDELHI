package com.onedelhi.secure;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0653j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class fb1 {

    /* renamed from: a */
    public static final String f12000a = "FragmentManager";

    /* renamed from: a */
    public xa1 f12001a;

    /* renamed from: a */
    public final ArrayList<Fragment> f12002a = new ArrayList<>();

    /* renamed from: a */
    public final HashMap<String, C0653j> f12003a = new HashMap<>();

    /* renamed from: a */
    public void mo15910a(@mr2 Fragment fragment) {
        if (!this.f12002a.contains(fragment)) {
            synchronized (this.f12002a) {
                this.f12002a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: b */
    public void mo15911b() {
        this.f12003a.values().removeAll(Collections.singleton((Object) null));
    }

    /* renamed from: c */
    public boolean mo15912c(@mr2 String str) {
        return this.f12003a.get(str) != null;
    }

    /* renamed from: d */
    public void mo15913d(int i) {
        for (C0653j next : this.f12003a.values()) {
            if (next != null) {
                next.mo4831u(i);
            }
        }
    }

    /* renamed from: e */
    public void mo15914e(@mr2 String str, @ts2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @ts2 String[] strArr) {
        String str2 = str + "    ";
        if (!this.f12003a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0653j next : this.f12003a.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k = next.mo4821k();
                    printWriter.println(k);
                    k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f12002a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f12002a.get(i).toString());
            }
        }
    }

    @ts2
    /* renamed from: f */
    public Fragment mo15915f(@mr2 String str) {
        C0653j jVar = this.f12003a.get(str);
        if (jVar != null) {
            return jVar.mo4821k();
        }
        return null;
    }

    @ts2
    /* renamed from: g */
    public Fragment mo15916g(@mo1 int i) {
        for (int size = this.f12002a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f12002a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C0653j next : this.f12003a.values()) {
            if (next != null) {
                Fragment k = next.mo4821k();
                if (k.mFragmentId == i) {
                    return k;
                }
            }
        }
        return null;
    }

    @ts2
    /* renamed from: h */
    public Fragment mo15917h(@ts2 String str) {
        if (str != null) {
            for (int size = this.f12002a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f12002a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0653j next : this.f12003a.values()) {
            if (next != null) {
                Fragment k = next.mo4821k();
                if (str.equals(k.mTag)) {
                    return k;
                }
            }
        }
        return null;
    }

    @ts2
    /* renamed from: i */
    public Fragment mo15918i(@mr2 String str) {
        Fragment findFragmentByWho;
        for (C0653j next : this.f12003a.values()) {
            if (next != null && (findFragmentByWho = next.mo4821k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int mo15919j(@mr2 Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f12002a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f12002a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f12002a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f12002a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    public int mo15920k() {
        return this.f12003a.size();
    }

    @mr2
    /* renamed from: l */
    public List<C0653j> mo15921l() {
        ArrayList arrayList = new ArrayList();
        for (C0653j next : this.f12003a.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @mr2
    /* renamed from: m */
    public List<Fragment> mo15922m() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0653j> it = this.f12003a.values().iterator();
        while (it.hasNext()) {
            C0653j next = it.next();
            arrayList.add(next != null ? next.mo4821k() : null);
        }
        return arrayList;
    }

    @ts2
    /* renamed from: n */
    public C0653j mo15923n(@mr2 String str) {
        return this.f12003a.get(str);
    }

    @mr2
    /* renamed from: o */
    public List<Fragment> mo15924o() {
        ArrayList arrayList;
        if (this.f12002a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f12002a) {
            arrayList = new ArrayList(this.f12002a);
        }
        return arrayList;
    }

    /* renamed from: p */
    public xa1 mo15925p() {
        return this.f12001a;
    }

    /* renamed from: q */
    public void mo15926q(@mr2 C0653j jVar) {
        Fragment k = jVar.mo4821k();
        if (!mo15912c(k.mWho)) {
            this.f12003a.put(k.mWho, jVar);
            if (k.mRetainInstanceChangedWhileDetached) {
                if (k.mRetainInstance) {
                    this.f12001a.mo26845b(k);
                } else {
                    this.f12001a.mo26855m(k);
                }
                k.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.m4279T0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k);
            }
        }
    }

    /* renamed from: r */
    public void mo15927r(@mr2 C0653j jVar) {
        Fragment k = jVar.mo4821k();
        if (k.mRetainInstance) {
            this.f12001a.mo26855m(k);
        }
        if (this.f12003a.put(k.mWho, (Object) null) != null && FragmentManager.m4279T0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    /* renamed from: s */
    public void mo15928s() {
        Iterator<Fragment> it = this.f12002a.iterator();
        while (it.hasNext()) {
            C0653j jVar = this.f12003a.get(it.next().mWho);
            if (jVar != null) {
                jVar.mo4823m();
            }
        }
        for (C0653j next : this.f12003a.values()) {
            if (next != null) {
                next.mo4823m();
                Fragment k = next.mo4821k();
                if (k.mRemoving && !k.isInBackStack()) {
                    mo15927r(next);
                }
            }
        }
    }

    /* renamed from: t */
    public void mo15929t(@mr2 Fragment fragment) {
        synchronized (this.f12002a) {
            this.f12002a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* renamed from: u */
    public void mo15930u() {
        this.f12003a.clear();
    }

    /* renamed from: v */
    public void mo15931v(@ts2 List<String> list) {
        this.f12002a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo15915f(next);
                if (f != null) {
                    if (FragmentManager.m4279T0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f);
                    }
                    mo15910a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + pl2.f33727d);
                }
            }
        }
    }

    @mr2
    /* renamed from: w */
    public ArrayList<cb1> mo15932w() {
        ArrayList<cb1> arrayList = new ArrayList<>(this.f12003a.size());
        for (C0653j next : this.f12003a.values()) {
            if (next != null) {
                Fragment k = next.mo4821k();
                cb1 s = next.mo4829s();
                arrayList.add(s);
                if (FragmentManager.m4279T0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + s.f10205b);
                }
            }
        }
        return arrayList;
    }

    @ts2
    /* renamed from: x */
    public ArrayList<String> mo15933x() {
        synchronized (this.f12002a) {
            if (this.f12002a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f12002a.size());
            Iterator<Fragment> it = this.f12002a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.m4279T0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: y */
    public void mo15934y(@mr2 xa1 xa1) {
        this.f12001a = xa1;
    }
}
