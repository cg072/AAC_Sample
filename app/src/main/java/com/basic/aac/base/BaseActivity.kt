package com.basic.aac.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseActivity<VB: ViewDataBinding, VM: ViewModel> : AppCompatActivity() {

    lateinit var binding: VB
    abstract val layoutResourceId: Int
    lateinit var viewModel: VM
    abstract val viewModelClass: Class<VM>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResourceId)
        viewModel = ViewModelProvider(this).get(viewModelClass)
        binding.also {
            it.lifecycleOwner = this
            it.setVariable(BR.viewModel, viewModel)
        }
    }
}