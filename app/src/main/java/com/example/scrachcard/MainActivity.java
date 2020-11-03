package com.example.scrachcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.anupkumarpanwar.scratchview.ScratchView;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScratchView scratchView = findViewById(R.id.scratch);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            scratchView.setRevealListener(new ScratchView.IRevealListener() {
                @Override
                public void onRevealed(ScratchView scratchView) {
                  Toasty.success(MainActivity.this, "Revealed", Toast.LENGTH_LONG, true).show();

                }

                @Override
                public void onRevealPercentChangedListener(ScratchView scratchView, float percent) {

                }
            });
        }
    }
}