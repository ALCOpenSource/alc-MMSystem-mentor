package com.peculiaruc.alc_mmsystem_mentor.ui.reports.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.Program
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentSelectProgramBinding
import com.peculiaruc.alc_mmsystem_mentor.ui.reports.adapters.SelectProgramAdapter

/**
 * A [Fragment] where a mentor can view assigned tasks, completed or the ones still in progress.
 *
 * It has fields to filter through the assigned and the completed tasks.
 *
 */
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

        binding.tool2.toolbar2.findViewById<TextView>(R.id.toolbar_create_title)
            .text = getString(R.string.select_program)

        val recyclerView = view.findViewById<RecyclerView>(R.id.pListItems)

        recyclerView.layoutManager = LinearLayoutManager(context)

        val data = ArrayList<Program>()

        for (i in 1..20) {
            data.add(
                Program(
                    title = getString(R.string.room_course),
                    image = R.drawable.ic_google_fill
                )
            )
        }

        val adapter = SelectProgramAdapter(data)

        recyclerView.adapter = adapter

//        binding.programTxtAll.setOnClickListener {
//            val action = SelectProgramFragmentDirections.actionSelectProgramFragmentToComposeReportFragment()
//            binding.programTxtAll.findNavController().navigate(action)
//        }

        binding.tool2.actionBack.setOnClickListener {
            it.findNavController().navigateUp()
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