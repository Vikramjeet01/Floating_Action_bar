package com.example.actionbar;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
public class MainActivity extends AppCompatActivity {



    public static BottomNavigationView navView ;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



         navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        //BadgeDrawable badgeDrawable = BadgeDrawable.create(getApplicationContext());

        navView.getOrCreateBadge(R.id.navigation_home).setNumber(15); // Show badge

        navView.getOrCreateBadge(R.id.navigation_dashboard); // Show badge

        //navView.getOrCreateBadge(R.id.navigation_notifications).setBadgeTextColor(android.R.color.black);
        navView.getOrCreateBadge(R.id.navigation_notifications).setNumber(22);
        navView.getOrCreateBadge(R.id.navigation_notifications).setMaxCharacterCount(2);
        //navView.getOrCreateBadge(R.id.navigation_notifications).setContentDescriptionNumberless("ABC");
        //navView.getOrCreateBadge(R.id.navigation_notifications).setBackgroundColor(android.R.color.holo_green_dark);


        //navView.removeBadge(R.id.navigation_home); // Remove badge


       /* BadgeDrawable badge = navView.getBadge(R.id.navigation_home); // Get badge
        badge.setNumber(15);
        badge.setBackgroundColor(holo_red_dark);
*/






    }


}
