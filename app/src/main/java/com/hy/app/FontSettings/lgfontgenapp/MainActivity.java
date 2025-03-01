package com.hy.app.FontSettings.lgfontgenapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        intent.setClassName("com.android.settings", "com.android.settings.Settings$UnifiedFontSettingsActivity");
        startActivity(intent);

        Context context = getApplicationContext();
        String font_name = context.getString(R.string.app_name);
        String toast_message = "Tap on " + font_name + " to apply font. Visit t.me/lg_fonts for more!";
        Toast.makeText(context, toast_message, Toast.LENGTH_LONG).show();

        finish();
    }
}