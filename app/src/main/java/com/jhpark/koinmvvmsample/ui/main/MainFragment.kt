package com.jhpark.koinmvvmsample.ui.main

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.jhpark.koinmvvmsample.R
import com.jhpark.koinmvvmsample.base.BaseFragment
import com.jhpark.koinmvvmsample.databinding.FragmentMainBinding
import com.jhpark.koinmvvmsample.vm.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment: BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {

    private val mainVM: MainViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadBundleData(savedInstanceState)

        initView()


        with(mainVM){
            getGitHubs()

//            github.observe(viewLifecycleOwner, Observer {
//                Log.e("JHTEST", "observe receive ")
//                tvMain.text = it.toString()
//            })

            isLoadingObservable.observe(viewLifecycleOwner, Observer {
                when{
                    it -> showLoadingDialog()
                    else -> hideLoadingDialog()
                }
            })
        }

    }

    private fun initView(){
        binding.run {
            mainViewModel = mainVM
        }

    }

    private fun loadBundleData(savedInstanceState: Bundle?) {
        val bundle = savedInstanceState ?: arguments ?: return
//        val filter = bundle.getString(KEY)
    }



    companion object{

        fun newInstance(): MainFragment{
            val args = Bundle()
//            args.putString(KEY, key)
            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }
    }
}