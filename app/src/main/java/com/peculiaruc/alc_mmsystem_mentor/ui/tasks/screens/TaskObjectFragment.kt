package com.peculiaruc.alc_mmsystem_mentor.ui.tasks.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.Task
import com.peculiaruc.alc_mmsystem_mentor.ui.tasks.adapters.TaskListAdapter

/**
 * A [Fragment] that displays the tasks assigning screen.
 *
 *
 *
 */
class TaskObjectFragment(position: Int) : Fragment() {

    /**
     * Holds the object reference to the constant value of the tempName string.
     */
    object Key{
        const val tempName: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dignissimpharetra metus, ut cursus purus efficitur et. Duis ac enim tellus. Phasellus eget tortor dapibus, laoreet maurissed, dignissim lectus. Phasellus eget tortor dapibus, laoreet maurissed, dignissim lectus."
    }
    private val pos: Int = position
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TaskListAdapter

    var tasks: ArrayList<Task> = arrayListOf()

    private val taskOne = Task(
        1,
        "Write Documentation for Auth",
        Key.tempName,
        false,
        false,
        0
    )
    private val taskTwo = Task(
        2,
        "Implement Dependency Injection",
        Key.tempName,
        true,
        false,
        3
    )
    private val taskThree = Task(
        3,
        "Fetch API endpoint for all tasks",
        Key.tempName,
        false,
        true,
        4
    )
    private val taskFour = Task(
        4,
        "Implement local caching",
        Key.tempName,
        true,
        false,
        3
    )
    private val taskFive = Task(
        5,
        "Create Database",
        Key.tempName,
        false,
        false,
        5
    )
    private val taskSix = Task(
        6,
        "Implement Navigation Graph",
        Key.tempName,
        false,
        true,
        5
    )
    private val taskSeven = Task(
        7,
        "Liaise with Backend on the Settings endpoints",
        Key.tempName,
        false,
        false,
        1
    )
    private val taskEight = Task(
        8,
        "Implement Firestore caching",
        Key.tempName,
        true,
        false,
        3
    )
    private val taskNine = Task(
        9,
        "Implement UI for Chat function",
        Key.tempName,
        true,
        false,
        3
    )
    private val taskTen = Task(
        10,
        "Implement Internationalization",
        Key.tempName,
        false,
        true,
        4
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_task_object, container, false)
        recyclerView = view.findViewById(R.id.recycle)
        adapter = TaskListAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        when (pos) {
            0 -> {
                tasks.add(taskOne)
                tasks.add(taskTwo)
                tasks.add(taskThree)
                tasks.add(taskFour)
                tasks.add(taskFive)
                tasks.add(taskSix)
                tasks.add(taskSeven)
                tasks.add(taskEight)
                tasks.add(taskNine)
                tasks.add(taskTen)
                adapter.submitList(tasks)
            }
            1 -> {
                tasks.add(taskTwo)
                tasks.add(taskFour)
                tasks.add(taskEight)
                tasks.add(taskNine)
                adapter.submitList(tasks)
            }
            2 -> {
                tasks.add(taskThree)
                tasks.add(taskSix)
                tasks.add(taskSeven)
                tasks.add(taskEight)
                tasks.add(taskTen)
                adapter.submitList(tasks)
            }
            3 -> {
                tasks.add(taskTwo)
                tasks.add(taskFour)
                tasks.add(taskEight)
                tasks.add(taskNine)
                adapter.submitList(tasks)
            }
        }
    }
}
