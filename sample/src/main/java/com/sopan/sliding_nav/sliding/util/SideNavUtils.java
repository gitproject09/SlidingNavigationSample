package com.sopan.sliding_nav.sliding.util;

/**
 * Created by Sopan on 25.03.2017.
 */

public abstract class SideNavUtils {

    public static float evaluate(float fraction, float startValue, float endValue) {
        return startValue + fraction * (endValue - startValue);
    }
}
