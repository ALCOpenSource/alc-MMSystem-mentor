package com.peculiaruc.alc_mmsystem_mentor.mentortasks_ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.adapters.ItemPrograms
import com.peculiaruc.alc_mmsystem_mentor.adapters.SelectProgramAdapter
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentSelectProgramBinding
import kotlinx.android.synthetic.main.fragment_compose_report_tasks.view.*
import kotlinx.android.synthetic.main.fragment_select_program.*
import kotlinx.android.synthetic.main.include_toolbar.*


class SelectProgramFragment : Fragment() {

    private var _binding: FragmentSelectProgramBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentSelectProgramBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar2.toolbar_create_title.text = getString(R.string.select_program)

        val recyclerView = view.findViewById<RecyclerView>(R.id.pListItems)

        recyclerView.layoutManager = LinearLayoutManager(context)

        val data = ArrayList<ItemPrograms>()

        for (i in 1..20) {
            data.add(
                ItemPrograms(
                    title = getString(R.string.room_course),
                    image = R.drawable.ic_task
                )
            )
        }

        val adapter = SelectProgramAdapter(data)

        recyclerView.adapter = adapter

        program_txt_all.setOnClickListener {
            val action = SelectProgramFragmentDirections.actionSelectProgramFragmentToComposeReportFragment()
            program_txt_all.findNavController().navigate(action)
        }

    }


    /**
     * Frees the binding object when the Fragment is destroyed.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}