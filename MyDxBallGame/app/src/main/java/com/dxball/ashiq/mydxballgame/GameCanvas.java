package com.dxball.ashiq.mydxballgame;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Ashiq on 5/11/2017.
 */

public class GameCanvas extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.music);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(new MyCanvas(this, mp));

    }
}
