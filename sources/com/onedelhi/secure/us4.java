package com.onedelhi.secure;

import android.util.Log;
import com.onedelhi.secure.zo3;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class us4 implements Comparator<String> {

    /* renamed from: b */
    public static final String f36271b = zo3.class.getSimpleName();

    /* renamed from: a */
    public Pattern f36272a = Pattern.compile(".*_upgrade_([0-9]+)-([0-9]+).*");

    /* renamed from: a */
    public int compare(String str, String str2) {
        Matcher matcher = this.f36272a.matcher(str);
        Matcher matcher2 = this.f36272a.matcher(str2);
        if (!matcher.matches()) {
            String str3 = f36271b;
            Log.w(str3, "could not parse upgrade script file: " + str);
            throw new zo3.C7510a("Invalid upgrade script file");
        } else if (matcher2.matches()) {
            int intValue = Integer.valueOf(matcher.group(1)).intValue();
            int intValue2 = Integer.valueOf(matcher2.group(1)).intValue();
            int intValue3 = Integer.valueOf(matcher.group(2)).intValue();
            int intValue4 = Integer.valueOf(matcher2.group(2)).intValue();
            if (intValue != intValue2) {
                return intValue < intValue2 ? -1 : 1;
            }
            if (intValue3 == intValue4) {
                return 0;
            }
            return intValue3 < intValue4 ? -1 : 1;
        } else {
            String str4 = f36271b;
            Log.w(str4, "could not parse upgrade script file: " + str2);
            throw new zo3.C7510a("Invalid upgrade script file");
        }
    }
}
