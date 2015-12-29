package android.novatrix.com.br.amorteamo;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import java.net.URI;


public class MainActivity extends Activity {

    MediaPlayer mp = null;
    int colorSelector = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mp = MediaPlayer.create(this.getApplicationContext(), R.raw.amorteamo);
        setContentView(R.layout.activity_main);

    }


    public void playMessage(View view)      {
        if (!mp.isPlaying()) {
            mp.start();
        }

        int bg = 0;

        if (colorSelector==0)   {
            bg = Color.RED;
            colorSelector++;
        } else if (colorSelector==1)    {
            bg = Color.MAGENTA;
            colorSelector++;
        } else if (colorSelector==2)    {
            bg = Color.rgb(0,0,200);
            colorSelector=0;
        }

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.fundo);
        relativeLayout.setBackgroundColor(bg);
    }
}
