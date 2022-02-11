package com.example.crpito;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.crpito.databinding.ActivityWelcomepageBinding;

import java.util.ArrayList;

public class welcomepage extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    ArrayList<Button> buttons = new ArrayList<Button>();
    Button btn = findViewById(R.id.clicker);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buttons.add(btn);

        btn.getWidth();
        setContentView(R.layout.activity_main5);

        com.example.crpito.databinding.ActivityWelcomepageBinding binding = ActivityWelcomepageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_welcomepage);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}