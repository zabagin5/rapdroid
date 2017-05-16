package com.rapdroid.nyilehkamera;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity{

    private Button signOut;
    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth auth;

    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * get firebase auth instance
         */
        //get firebase auth instance
        auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() != null) {
            // User is logged in
        }
        /**
         * SignOut Auth
         */
        auth.signOut();
        // this listener will be called when there is change in firebase user session
        FirebaseAuth.AuthStateListener authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch login activity
                    startActivity(new Intent(MainActivity.this, login.class));
                    finish();
                }
            }
        };

        /**
         *Setup the DrawerLayout and NavigationView
         */

             mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
             mNavigationView = (NavigationView) findViewById(R.id.shitstuff) ;

        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */

             mFragmentManager = getSupportFragmentManager();
             mFragmentTransaction = mFragmentManager.beginTransaction();
             mFragmentTransaction.replace(R.id.containerView,new TabFragment()).commit();
        /**
         * Setup click events on the Navigation View Items.
         */

             mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                 if (menuItem.getItemId() == R.id.etalase) {
                    FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                    xfragmentTransaction.replace(R.id.containerView,new TabFragment()).commit();
                 }
                 if (menuItem.getItemId() == R.id.cart) {
                     startActivity(new Intent(getApplicationContext(),Keranjang.class));
                 }
                 if (menuItem.getItemId() == R.id.panduan) {
                     FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                     xfragmentTransaction.replace(R.id.containerView,new PanduanFragment()).commit();
                 }
                 if (menuItem.getItemId() == R.id.about) {
                     FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                     xfragmentTransaction.replace(R.id.containerView,new about()).commit();
                 }
                 /**if (menuItem.getItemId() == R.id.join) {
                     startActivity(new Intent(getApplicationContext(),join.class));
                 }
                 if (menuItem.getItemId() == R.id.profile) {
                     startActivity(new Intent(getApplicationContext(),profile.class));
                 }**/
                 if (menuItem.getItemId() == R.id.uploadbarang) {
                     startActivity(new Intent(getApplicationContext(),upload.class));
                 }
                 if (menuItem.getItemId() == R.id.payment) {
                     startActivity(new Intent(getApplicationContext(),payment.class));
                 }
                 if (menuItem.getItemId() == R.id.sign_out) {
                         signOut();
                 }
                 return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

            android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
            R.string.app_name);

            mDrawerLayout.setDrawerListener(mDrawerToggle);

            mDrawerToggle.syncState();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void signOut() {
        auth.signOut();
    }
}