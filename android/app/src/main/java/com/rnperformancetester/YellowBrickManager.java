package com.rnperformancetester;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by kobi on 30/07/17.
 */

public class YellowBrickManager extends SimpleViewManager<YellowBrick> {
    @Override
    public String getName() {
        return "YellowBrick";
    }

    @Override
    protected YellowBrick createViewInstance(ThemedReactContext reactContext) {
        return new YellowBrick(reactContext);
    }
}
