package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.databinding.MainHomeFragmentDrawerListItemBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.NavItems

/**
 * Main home fragment drawer items adapter
 *
 * @property onItemClick
 * @constructor
 *
 * @param context
 */
class MainHomeFragmentDrawerItemsAdapter(context: Context, val onItemClick: (NavItems?) -> Unit) :
    ArrayAdapter<NavItems>(context, 0) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding = MainHomeFragmentDrawerListItemBinding.inflate(
            LayoutInflater.from(
                parent.context
            )
        )
        val drawerItem = getItem(position)
        DrawerListViewHolder(binding).bind(context, drawerItem)
            .setOnClickListener { onItemClick(drawerItem) }

        return convertView ?: binding.root
    }

    /**
     * Drawer list view holder
     *
     * @property binding
     * @constructor Create empty Drawer list view holder
     */
    internal class DrawerListViewHolder(private val binding: MainHomeFragmentDrawerListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        /**
         * Bind
         *
         * @param context
         * @param _drawerItem
         * @return
         */
        fun bind(context: Context, _drawerItem: NavItems?): View {
            _drawerItem?.let { drawerItem ->
                binding.apply {
                    mainHomeFragmentDrawerItemIcon.setImageDrawable(
                        ResourcesCompat.getDrawable(
                            context.resources,
                            drawerItem.icon,
                            null
                        )
                    )
                    mainHomeFragmentDrawerItemLabel.text = context.getString(drawerItem.label)
                }
            }
            return binding.root
        }

    }
}


