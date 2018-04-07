package com.example.logonrm.fiaploginaqui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.facebook.FacebookSdk
import com.facebook.FacebookException
import com.facebook.login.LoginResult
import com.facebook.FacebookCallback
import com.facebook.login.LoginManager
import com.facebook.CallbackManager



class MainActivity : AppCompatActivity() {

    lateinit var callbackManager: CallbackManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FacebookSdk.sdkInitialize(getApplicationContext());


        callbackManager = CallbackManager.Factory.create()

        LoginManager.getInstance().registerCallback(callbackManager,
                object : FacebookCallback<LoginResult> {
                    override fun onSuccess(loginResult: LoginResult) {
                        // App code
                    }

                    override fun onCancel() {
                        // App code
                    }

                    override fun onError(exception: FacebookException) {
                        // App code
                    }
                })

    }
}
