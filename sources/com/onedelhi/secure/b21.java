package com.onedelhi.secure;

import java.lang.reflect.Field;
import java.util.Locale;

public enum b21 implements c21 {
    IDENTITY {
        /* renamed from: a */
        public String mo31347a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo31347a(Field field) {
            return b21.m39325e(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo31347a(Field field) {
            return b21.m39325e(b21.m39324b(field.getName(), ' '));
        }
    },
    UPPER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo31347a(Field field) {
            return b21.m39324b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo31347a(Field field) {
            return b21.m39324b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo31347a(Field field) {
            return b21.m39324b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: a */
        public String mo31347a(Field field) {
            return b21.m39324b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: b */
    public static String m39324b(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m39325e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt)) {
                i++;
            } else if (Character.isUpperCase(charAt)) {
                return str;
            } else {
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }
}
