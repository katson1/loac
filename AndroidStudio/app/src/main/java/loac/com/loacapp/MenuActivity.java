package loac.com.loacapp;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
;import loac.com.loacapp.fragments.about;
import loac.com.loacapp.fragments.favstores;
import loac.com.loacapp.fragments.home;
import loac.com.loacapp.fragments.msg;
import loac.com.loacapp.fragments.myacc;
import loac.com.loacapp.fragments.myorders;
import loac.com.loacapp.fragments.sac;
import loac.com.loacapp.fragments.settings;
import loac.com.loacapp.fragments.shopcart;
import loac.com.loacapp.fragments.suggestions;
import loac.com.loacapp.fragments.wish;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        android.app.FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame
                        , new home())
                .commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        android.app.FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.home) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new home())
                    .commit();
        } else if (id == R.id.my_acc) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new myacc())
                    .commit();
        } else if (id == R.id.my_orders) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new myorders())
                    .commit();
        } else if (id == R.id.shop_cart) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new shopcart())
                    .commit();
        } else if (id == R.id.wish) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new wish())
                    .commit();
        } else if (id == R.id.fav_stores) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new favstores())
                    .commit();
        } else if (id == R.id.msg) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new msg())
                    .commit();
        } else if (id == R.id.settings) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new settings())
                    .commit();
        } else if (id == R.id.suggestions) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new suggestions())
                    .commit();
        } else if (id == R.id.sac) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new sac())
                    .commit();
        } else if (id == R.id.about) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new about())
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
