package com.example.banktag.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.banktag.R
import kotlinx.android.synthetic.main.transfer_tab_fragment.*

class TransferTabFragment : Fragment() {

    companion object {
        fun newInstance() = TransferTabFragment()
    }

    private lateinit var viewModel: TransferTabViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.transfer_tab_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TransferTabViewModel::class.java)
        // TODO: Use the ViewModel
        imageView10.setOnClickListener {
            findNavController().navigate(R.id.mainFragment)
        }
        imageView11.setOnClickListener {
            findNavController().navigate(R.id.transferTabFragment)
        }
        imageView12.setOnClickListener {
            findNavController().navigate(R.id.historyTabFragment)
        }

        send_constraint_layout.setOnClickListener {
            findNavController().navigate(R.id.chooseContactInactiveScrollFragment)
        }
        request_constraint_layout.setOnClickListener {
            findNavController().navigate(R.id.transactionConfirmMultipleFragment)
        }
    }

}