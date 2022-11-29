package com.peculiaruc.alc_mmsystem_mentor.ui.tasks.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.local.models.Task

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class TaskDetailFragment : Fragment() {

    var tasks: ArrayList<Task> = arrayListOf()

    private val taskOne = Task(1, "Write Documentation for Auth",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. " +
            "Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. " +
            "Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh, " +
            "at maximus ante fermentum sit amet. Pellentesque commodo lacus at sodales sodales",false, false,  0)
    private val taskTwo = Task(2, "Implement Dependency Injection",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. " +
            "Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. " +
            "Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh, ", true, false,  3)
    private val taskThree = Task(3, "Fetch API endpoint for all tasks",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
            "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
            "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh", false, true,  4)
    private val taskFour = Task(4, "Implement local caching",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
            "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
            "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh", true, false,  3)
    private val taskFive = Task(5, "Create Database",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
            "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
            "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh", false, false,  5)
    private val taskSix = Task(6, "Implement Navigation Graph",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
            "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
            "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh", false, true,  5)
    private val taskSeven = Task(7, "Liaise with Backend on the Settings endpoints",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
            "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
            "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh", false, false,  1)
    private val taskEight = Task(8, "Implement Firestore caching",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
            "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
            "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh", true, false,  3)
    private val taskNine= Task(9, "Implement UI for Chat function",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
            "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
            "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh", true, false,  3)
    private val taskTen = Task(10, "Implement Internationalization",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut et massa mi. \" +\n" +
            "            \"Aliquam in hendrerit urna. Pellentesque sit amet sapien fringilla, mattis ligula consectetur, ultrices mauris. Maecenas vitae mattis tellus. \" +\n" +
            "            \"Nullam quis imperdiet augue. Vestibulum auctor ornare leo, non suscipit magna interdum eu. Curabitur pellentesque nibh nibh", false, true,  4)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view  = inflater.inflate(R.layout.fragment_task_detail, container, false)
        val btn = view.findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            findNavController().navigate(R.id.action_taskDetailFragment_to_taskAssignedFragment)
        }
        val back = view.findViewById<ImageView>(R.id.imageView)
        back.setOnClickListener {
            it.findNavController().navigateUp()
        }
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

            return view
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = arguments
//        if (bundle != null) {
//            Log.e("TaskDetailFragment", "Fragment received information")
//            val args = TaskDetailFragmentArgs.fromBundle(bundle)
//            val id = args.id
//            for (i in tasks.indices){
//                if (tasks.get(i).id == id) {
//                    var tv = view.findViewById<TextView>(R.id.textView4)
//                    tv.text = tasks.get(i).title
//                    view.findViewById<TextView>(R.id.textView5).text = tasks.get(i).desc
//                }
//            }
//        }
    }

}