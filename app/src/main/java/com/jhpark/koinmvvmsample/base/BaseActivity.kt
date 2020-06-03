package com.jhpark.koinmvvmsample.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.jhpark.koinmvvmsample.R
import com.jhpark.koinmvvmsample.ui.ProgressDialogFragment
import java.lang.Exception

abstract class BaseActivity<B : ViewDataBinding>(@LayoutRes val layoutResId: Int) : AppCompatActivity() {

    protected lateinit var binding: B
        private set

    private var dialog: ProgressDialogFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutResId)
    }

    fun showLoadingDialog(){
        if(dialog == null){
            dialog = ProgressDialogFragment().apply {
                show(supportFragmentManager, PROGRESS_DIALOG_FRAGMENT)
            }
        }
    }

    fun hideLoadingDialog(){
        if(dialog != null){
            dialog?.dismiss()
            dialog = null
        }
    }

    companion object {
        const val PROGRESS_DIALOG_FRAGMENT = "PROGRESS_DIALOG_FRAGMENT"
    }
}
