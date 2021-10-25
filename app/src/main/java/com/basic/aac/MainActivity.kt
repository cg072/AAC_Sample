package com.basic.aac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.basic.aac.base.BaseActivity
import com.basic.aac.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResourceId: Int
        get() = R.layout.activity_main
    override val viewModelClass: Class<MainViewModel>
        get() = MainViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

}