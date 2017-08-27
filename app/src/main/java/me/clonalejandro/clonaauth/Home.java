package me.clonalejandro.clonaauth;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.clonalejandro.clonaauth.elements.HomeElements;
import me.clonalejandro.clonaauth.listeners.HElementsListeners;

/**
 * Created by alejandrorioscalera
 * On 26/8/17
 *
 * -- SOCIAL NETWORKS --
 *
 * GitHub: https://github.com/clonalejandro or @clonalejandro
 * Website: https://clonalejandro.me/
 * Twitter: https://twitter.com/clonalejandro11/ or @clonalejandro11
 * Keybase: https://keybase.io/clonalejandro/
 *
 * -- LICENSE --
 *
 * All rights reserved for clonalejandro ©ClonaAuth 2017 / 2018
 */

public class Home extends AppCompatActivity {


    /** SMALL CONSTRUCTORS **/

    public static Home instance;
    public static Resources resources = instance.getResources();


    /** REST **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);


        instance = this;

        Events();

        //new HomeElements(instance);
    }


    /** OTHERS **/

    private void Events(){
        new HElementsListeners(instance);
    }


}