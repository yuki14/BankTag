package com.example.banktag.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.banktag.R
import kotlinx.android.synthetic.main.setting_edit_fragment.*

class SettingAddBankAccountFragment : Fragment() {

    companion object {
        fun newInstance() = SettingAddBankAccountFragment()
    }

    private lateinit var viewModel: SettingAddBankAccountViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.setting_add_bank_account_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SettingAddBankAccountViewModel::class.java)
        // TODO: Use the ViewModel
        row_constraint_layout.setOnClickListener {
            findNavController().navigate(R.id.action_settingAddBankAccountFragment_to_settingsEditBankAccountFragment)
        }
    }

}