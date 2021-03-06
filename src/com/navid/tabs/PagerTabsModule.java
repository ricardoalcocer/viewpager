/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.navid.tabs;

import android.view.Gravity;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;

@Kroll.module(name = "Tabs", id = "com.navid.tabs")
public class PagerTabsModule extends KrollModule {
    @Kroll.constant
    public static final String PAGE_SCROLLED_EVENT_NAME = "pageScrolled";
    @Kroll.constant
    public static final String PAGE_SELECTED_EVENT_NAME = "pageSelected";
    @Kroll.constant
    public static final String PAGE_SCROLL_STATE_CHANGED_EVENT_NAME = "pageScrollStateChanged";
    @Kroll.constant
    public static final String CLICK_EVENT_NAME = "click";
    @Kroll.constant
    public static final String LONG_CLICK_EVENT_NAME = "longClick";
    @Kroll.constant
    public static final String TOUCH_EVENT_NAME = "touch";
    @Kroll.constant
    public static final String FOCUS_CHANGE_EVENT_NAME = "focusChange";
    @Kroll.constant
    public static final int ALIGNMENT_RIGHT = Gravity.RIGHT;
    @Kroll.constant
    public static final int ALIGNMENT_LEFT = Gravity.LEFT;

    // Standard Debugging variables
    private static final String TAG = PagerTabsModule.class.getSimpleName();

    // @Kroll.constant public static final String EXTERNAL_NAME = value;

    public PagerTabsModule() {
        super();
    }

    @Kroll.onAppCreate
    public static void onAppCreate(TiApplication app) {
        Log.d(TAG, "inside onAppCreate");
        // put module init code that needs to run when the application is created
    }
}

