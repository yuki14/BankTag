package com.example.banktag.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.banktag.R
import kotlinx.android.synthetic.main.main_fragment.*
import kotlinx.android.synthetic.main.transfer_tab_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

        imageView7.setOnClickListener {
            findNavController().navigate(R.id.mainFragment)
        }
        imageView8.setOnClickListener {
            findNavController().navigate(R.id.transferTabFragment)
        }
        imageView9.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_historyTabFragment)
        }

        setHasOptionsMenu(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // リップルがわかるように処理を遅らせる。
        // Handlerクラスをインスタンス化し、postDelayedメソッドを呼んでいる
        // Handlerクラスをインスタンス化し、postDelayedメソッドを呼んでいる
        Handler().postDelayed(Runnable // Runnable型のインスタンス化と定義
        {
            // 遅らせて実行したい処理
            findNavController().navigate(R.id.action_mainFragment_to_settingEditFragment)
        }, 100
        ) // 遅らせたい時間(ミリ秒) 3000ミリ秒 -> 3秒
        return true
    }
}