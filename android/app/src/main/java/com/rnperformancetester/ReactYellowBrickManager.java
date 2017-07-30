package com.rnperformancetester;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class ReactYellowBrickManager extends SimpleViewManager<YellowBrick> {
    @Override
    public String getName() {
        return "YellowBrick";
    }

    @Override
    protected YellowBrick createViewInstance(ThemedReactContext reactContext) {
        return new YellowBrick(reactContext);
    }
}
