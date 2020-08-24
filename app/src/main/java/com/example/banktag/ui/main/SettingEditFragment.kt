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

class SettingEditFragment : Fragment() {

    companion object {
        fun newInstance() = SettingEditFragment()
    }

    private lateinit var viewModel: SettingEditViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.setting_edit_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SettingEditViewModel::class.java)
        // TODO: Use the ViewModel
        ic_edit_copy_image_view.setOnClickListener {
            findNavController().navigate(R.id.action_settingEditFragment_to_settingAddBankAccountFragment)
        }
    }

}