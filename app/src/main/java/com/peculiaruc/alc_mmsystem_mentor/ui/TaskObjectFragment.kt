package com.peculiaruc.alc_mmsystem_mentor.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.model.MentorTasks
import com.peculiaruc.alc_mmsystem_mentor.ui.adapter.TaskListAdapter

class TaskObjectFragment(position: Int) : Fragment() {

    val pos: Int = position
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TaskListAdapter

    var tasks: ArrayList<MentorTasks> = arrayListOf()

    private val taskOne = MentorTasks(
        1,
        "Write Documentation for Auth",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. " +
                "Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. " +
                "Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh, " +
                "at maximus ante fermentum sit amet. Pellentesque commodo lacus at sodales sodales",
        false,
        false,
        0
    )
    private val taskTwo = MentorTasks(
        2,
        "Implement Dependency Injection",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. " +
                "Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. " +
                "Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh, ",
        true,
        false,
        3
    )
    private val taskThree = MentorTasks(
        3,
        "Fetch API endpoint for all tasks",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        false,
        true,
        4
    )
    private val taskFour = MentorTasks(
        4,
        "Implement local caching",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        true,
        false,
        3
    )
    private val taskFive = MentorTasks(
        5,
        "Create Database",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        false,
        false,
        5
    )
    private val taskSix = MentorTasks(
        6,
        "Implement Navigation Graph",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        false,
        true,
        5
    )
    private val taskSeven = MentorTasks(
        7,
        "Liaise with Backend on the Settings endpoints",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        false,
        false,
        1
    )
    private val taskEight = MentorTasks(
        8,
        "Implement Firestore caching",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        true,
        false,
        3
    )
    private val taskNine = MentorTasks(
        9,
        "Implement UI for Chat function",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
        true,
        false,
        3
    )
    private val taskTen = MentorTasks(
        10,
        "Implement Internationalization",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
                "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
                "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh",
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
        recyclerView = view.findViewById<RecyclerView>(R.id.recycle)
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
