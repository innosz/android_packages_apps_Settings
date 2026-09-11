package com.android.settings.innosz;

import android.content.Context;
import android.content.pm.PackageManager;

import com.android.settings.core.BasePreferenceController;

public class InnoszRestrictPreferenceController extends BasePreferenceController {
    public InnoszRestrictPreferenceController(Context context, String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override
    public int getAvailabilityStatus() {
        try {
            mContext.getPackageManager().getPackageInfo("com.innosz.restrict", 0);
            return AVAILABLE;
        } catch (PackageManager.NameNotFoundException e) {
            return UNSUPPORTED_ON_DEVICE;
        }
    }
}
