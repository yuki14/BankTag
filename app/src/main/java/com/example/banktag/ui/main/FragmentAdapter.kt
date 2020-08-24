package com.example.banktag.ui.main

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView.NO_ID
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * Adapter for fragments
 */
class FragmentAdapter (activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val items = listOf(
        HistoryTabFragment(),
        SettingEditFragment(),
        TransferTabFragment()
    )

    private var mutableItems = mutableListOf<Int>()

    override fun createFragment(position: Int): Fragment {
        return items[position]
    }

    /**
     * Method override to support notify* methods
     *
     * @see FragmentStateAdapter.getItemId
     */
    override fun getItemId(position: Int): Long {
        if (position < 0) return NO_ID
        return items[position].id.toLong()
    }

    /**
     * Method override to support notify* methods
     *
     * @see FragmentStateAdapter.containsItem
     */
    override fun containsItem(itemId: Long): Boolean {
        var containsFlags = mutableListOf<Boolean>()
        items.forEachIndexed { index, fragment ->
            containsFlags.add(index, fragment.id == itemId.toInt())
        }
        return containsFlags.contains(true)
    }

    /**
     * @see FragmentStateAdapter.getItemCount
     */
    override fun getItemCount(): Int = items.size

    /**
     * Add an item which equals to list size after certain position in list
     *
     * @param position position of item to add
     */
    fun addAfter(position: Int) {
        val size = mutableItems.size
        if (size == 0 || position == size) mutableItems.add(size) else mutableItems.add(position + 1, size)
        notifyItemInserted(position)
    }

    /**
     * Delete an item at certain position in list
     *
     * @param position position of item to remove
     */
    fun deleteAt(position: Int) {
        mutableItems.removeAt(position)
        notifyItemRemoved(position)
    }
}