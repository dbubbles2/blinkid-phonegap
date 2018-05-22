package com.phonegap.plugins.blinkid.overlays.serialization;

import com.microblink.entities.recognizers.RecognizerBundle;
import com.microblink.uisettings.BaseScanUISettings;
import com.microblink.uisettings.DocumentUISettings;
import com.phonegap.plugins.blinkid.overlays.OverlaySettingsSerialization;

import org.json.JSONObject;

public final class DocumentOverlaySettingsSerialization implements OverlaySettingsSerialization {
    @Override
    public BaseScanUISettings createUISettings(JSONObject jsonUISettings, RecognizerBundle recognizerBundle) {
        // no settings deserialized at the moment
        return new DocumentUISettings(recognizerBundle);
    }

    @Override
    public String getJsonName() {
        return "DocumentOverlaySettings";
    }
}
