package com.sopan.sliding_nav.sliding.adapter;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;

import com.sopan.sliding_nav.sliding.helper.SlidingRootNavLayout;

/**
 * Created by Sopan on 26.03.2017.
 */

public class ActionBarToggleAdapter extends DrawerLayout {

    private SlidingRootNavLayout adaptee;

    public ActionBarToggleAdapter(Context context) {
        super(context);
    }

    @Override
    public void openDrawer(int gravity) {
        adaptee.openMenu();
    }

    @Override
    public void closeDrawer(int gravity) {
        adaptee.closeMenu();
    }

    @Override
    public boolean isDrawerVisible(int drawerGravity) {
        return !adaptee.isMenuClosed();
    }

    @Override
    public int getDrawerLockMode(int edgeGravity) {
        if (adaptee.isMenuLocked() && adaptee.isMenuClosed()) {
            return DrawerLayout.LOCK_MODE_LOCKED_CLOSED;
        } else if (adaptee.isMenuLocked() && !adaptee.isMenuClosed()) {
            return DrawerLayout.LOCK_MODE_LOCKED_OPEN;
        } else {
            return DrawerLayout.LOCK_MODE_UNLOCKED;
        }
    }

    public void setAdaptee(SlidingRootNavLayout adaptee) {
        this.adaptee = adaptee;
    }
}
