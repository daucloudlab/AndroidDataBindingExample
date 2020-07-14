package kz.alamyn.databindingapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kz.alamyn.databindingapp1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main) ;

//        binding.tvName.setText("Aliash Anarbekova");
//        binding.tvAddress.setText("Шымкент, Қазақстан");

        binding.setUser(new User("Әлия Анарбекова", "Шымкент Қазақстан", "20 K", "34 K"));

        binding.setHandler(new EventHandler(this));
    }
}