package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentDiscussionBinding
import com.peculiaruc.alc_mmsystem_mentor.domain.DiscussionItem
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.DiscussionsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController


/**
 * Discussion fragment
 *
 * @constructor Create empty Discussion fragment
 */
class DiscussionFragment : Fragment(), DiscussionsAdapter.OnDiscussionsClickListener,
    DiscussionsAdapter.OnCommentDiscussionsClickListener {
    private var _binding: FragmentDiscussionBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentDiscussionBinding.inflate(inflater).let { _binding = it }

        binding.appbar.apply {
            screenTitle.text = getString(R.string.discussion)
            backBtn.setOnClickListener {
                findNavController().navigateUp()
            }
        }

        binding.floatingActionButton.setOnClickListener {
            Navigator.navigate(
                mmController,
                DiscussionFragmentDirections.actionDiscussionFragmentToCreateDiscussionFragment()
            )
        }

        binding.discussionsRv.apply {
            adapter = DiscussionsAdapter(
                UiData.discussionList,
                object : DiscussionsAdapter.OnDiscussionsClickListener {
                    override fun onClick(discussionItem: DiscussionItem) = Unit
                },
                object : DiscussionsAdapter.OnCommentDiscussionsClickListener {
                    override fun onCommentClick(discussionItem: DiscussionItem) {
                        Navigator.navigate(mmController, DiscussionFragmentDirections.actionDiscussionFragmentToDiscussionCommentFragment())
                    }

                }
            )
            addItemDecoration(object : ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    super.getItemOffsets(outRect, view, parent, state)
                    outRect.bottom = 15
                    outRect.left = 16
                    outRect.right = 16
                }
            })
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(discussionItem: DiscussionItem) {
        TODO("Not yet implemented")
    }

    override fun onCommentClick(discussionItem: DiscussionItem) {
        TODO("Not yet implemented")
    }


}