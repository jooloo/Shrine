package com.jooloo.android.mdc.kotlin.shrine

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by liujian (xiaojianmailbox@gmail.com) on 2019/1/11 20:39
 */
class MainActivity : AppCompatActivity(), NavigationHost {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, LoginFragment())
                .commit()
        }
    }

    /**
     * Navigate to the given fragment.
     *
     * @param fragment Fragment to navigate to
     * @param addToBackStack Whether or not the current fragment should be added to the back stack
     */
    override fun navigateTo(fragment: Fragment, addToBackStack: Boolean) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment).apply {
                if (addToBackStack) {
                    addToBackStack(null)
                }
            }
            .commit()

    }
}