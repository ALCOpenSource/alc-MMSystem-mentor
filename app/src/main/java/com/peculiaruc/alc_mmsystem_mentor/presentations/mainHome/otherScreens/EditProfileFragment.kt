package com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.otherScreens

import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.peculiaruc.alc_mmsystem_mentor.databinding.EditProfileFragmentLayoutBinding
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.editProfile.EditProfileChipsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.editProfile.EditProfileDocumentsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.adapters.editProfile.EditProfilePrevProgramsAdapter
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.Navigator
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.UiData
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.mmController
import com.peculiaruc.alc_mmsystem_mentor.presentations.mainHome.utils.showToast

class EditProfileFragment : Fragment() {
    private var _binding: EditProfileFragmentLayoutBinding? = null
    private val binding
        get() = _binding!!

    private lateinit var technicalProAdapter: EditProfileChipsAdapter.Adapter
    private lateinit var rolesHeldAdapter: EditProfileChipsAdapter.Adapter
    private lateinit var docsAdapter: EditProfileDocumentsAdapter.Adapter
    private lateinit var prevProgramsAdapter: EditProfilePrevProgramsAdapter.Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        EditProfileFragmentLayoutBinding.inflate(inflater).let { _binding = it }

        initUi()

        return binding.root
    }

    private fun initUi() {
        setScreenTitle()
        initRecyclerViews()
    }

    private fun initRecyclerViews() {

        technicalProAdapter = EditProfileChipsAdapter.Adapter {

        }.apply {
            add(UiData.availableTechnicalProficiencies)
        }

        rolesHeldAdapter = EditProfileChipsAdapter.Adapter {

        }.apply {
            add(UiData.availableRolesHeld)
        }

        docsAdapter = EditProfileDocumentsAdapter.Adapter(
            onSelect = {
                Toast.makeText(requireActivity(), "Selected $it", Toast.LENGTH_SHORT).show()
            },
            onDelete = {
                Toast.makeText(requireActivity(), "Requesting Delete for $it", Toast.LENGTH_SHORT)
                    .show()
            }
        ).apply {
            add(UiData.availableDocuments)
        }

        prevProgramsAdapter = EditProfilePrevProgramsAdapter.Adapter {
            Toast.makeText(requireActivity(), "Requesting Delete for $it", Toast.LENGTH_SHORT)
                .show()
        }.apply {
            add(UiData.availablePreviewPrograms)
        }

        binding.editProfileTechProficiency.apply {
            editProfileTechProficiency.apply {
                setHasFixedSize(false)
                adapter = technicalProAdapter
                addItemDecoration(object : ItemDecoration() {
                    override fun getItemOffsets(
                        outRect: Rect,
                        view: View,
                        parent: RecyclerView,
                        state: RecyclerView.State
                    ) {
                        super.getItemOffsets(outRect, view, parent, state)
                        outRect.apply {
                            left = 10
                            right = 10
                            bottom = 16
                        }
                    }
                })
            }
        }

        binding.editProfilePrevPrograms.apply {
            editProfilePrevPrograms.apply {
                setHasFixedSize(false)
                adapter = prevProgramsAdapter
                addItemDecoration(object : ItemDecoration() {
                    override fun getItemOffsets(
                        outRect: Rect,
                        view: View,
                        parent: RecyclerView,
                        state: RecyclerView.State
                    ) {
                        super.getItemOffsets(outRect, view, parent, state)
                        outRect.bottom = 16
                    }
                })
            }
        }

        binding.editProfileDocs.apply {
            editProfileDocs.apply {
                setHasFixedSize(false)
                adapter = docsAdapter
            }
        }

        initClicks()

    }

    private fun initClicks() {
        binding.editProfilePhoto.editProfileImg.setOnClickListener { showToast("Change Profile") }
        binding.editProfilePhoto.editProfileSelectProfile.setOnClickListener { showToast("Change Profile") }

        binding.editProfilePrevPrograms.editProfilePrevProgramsAddProgram.setOnClickListener { showToast("Add Program") }
        binding.editProfileDocs.editProfileDocsAddDoc.setOnClickListener { showToast("Add Document") }

        binding.editProfileSaveChanges.setOnClickListener { showToast("Save Changes") }
    }

    private fun setScreenTitle() {

        binding.apppbar.apply {
            backBtn.setOnClickListener {
                Navigator.navigateUp(mmController)
            }
            screenTitle.text = "Edit Profile"
        }

    }

    override fun onDestroyView() {

        super.onDestroyView()
        _binding = null

    }
}