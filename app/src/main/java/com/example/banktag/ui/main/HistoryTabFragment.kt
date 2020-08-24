package com.example.banktag.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.banktag.R
import kotlinx.android.synthetic.main.history_details_fragment.*
import kotlinx.android.synthetic.main.history_details_fragment.row_copy3_constraint_layout
import kotlinx.android.synthetic.main.history_tab_fragment.*

class HistoryTabFragment : Fragment() {

    companion object {
        fun newInstance() = HistoryTabFragment()
    }

    private lateinit var viewModel: HistoryTabViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.history_tab_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HistoryTabViewModel::class.java)
        // TODO: Use the ViewModel
        imageView4.setOnClickListener {
            findNavController().navigate(R.id.mainFragment)
        }
        imageView5.setOnClickListener {
            findNavController().navigate(R.id.transferTabFragment)
        }
        imageView6.setOnClickListener {
            findNavController().navigate(R.id.historyTabFragment)
        }

        row_copy4_constraint_layout.setOnClickListener {
            findNavController().navigate(R.id.action_historyTabFragment_to_historyDetailsFragment)
        }
    }

}