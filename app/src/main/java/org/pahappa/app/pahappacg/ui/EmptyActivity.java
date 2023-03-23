package org.pahappa.app.pahappacg.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.pahappa.app.pahappacg.R;
import org.pahappa.app.pahappacg.databinding.ActivityEmptyBinding;

public class EmptyActivity extends AppCompatActivity {

    ActivityEmptyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);


    }
}