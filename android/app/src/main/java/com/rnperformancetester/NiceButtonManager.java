package com.rnperformancetester;

import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class NiceButtonManager extends SimpleViewManager<NiceButton> {

    private static final View.OnClickListener ON_CHECKED_CHANGE_LISTENER =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ReactContext reactContext = (ReactContext) v.getContext();
                    reactContext.getNativeModule(UIManagerModule.class).getEventDispatcher().dispatchEvent(
                            new NiceButtonClickEvent(v.getId())
                    );
                }
            };


    @Override
    public String getName() {
        return "NiceButton";
    }

    @Override
    protected NiceButton createViewInstance(ThemedReactContext reactContext) {
        return new NiceButton(reactContext);
    }


    @ReactProp(name = "title")
    public void setTitle(NiceButton niceButton, @Nullable String title) {
        Log.d("NiceButton", "setTitle " + title);
        niceButton.setText(title);
    }

    @Override
    protected void addEventEmitters(ThemedReactContext reactContext, NiceButton view) {
        super.addEventEmitters(reactContext, view);
        view.setOnClickListener(ON_CHECKED_CHANGE_LISTENER);
    }
}
