package com.peculiaruc.alc_mmsystem_mentor.ui

import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentor.R
import com.peculiaruc.alc_mmsystem_mentor.data.model.MentorTasks
import com.peculiaruc.alc_mmsystem_mentor.databinding.ActivityTaskBinding
import com.peculiaruc.alc_mmsystem_mentor.ui.adapter.TaskListAdapter
import java.util.*

class TaskActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityTaskBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TaskListAdapter
    var searchView: SearchView? = null

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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val toolbar = findViewById<Toolbar>(R.id.toolbar2)
        setSupportActionBar(toolbar)

        binding = ActivityTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment_content_task)
        appBarConfiguration = AppBarConfiguration(navController.graph)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_task)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    // calling on create option menu
    // layout to inflate our menu file.
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // below line is to get our inflater
        val inflater = menuInflater

        // inside inflater we are inflating our menu file.
        inflater.inflate(R.menu.search_menu, menu)

        // below line is to get our menu item.
        val searchItem = menu.findItem(R.id.actionSearch)

        // getting search view of our item.
        val searchView: SearchView = searchItem.actionView as SearchView

        searchView.setOnClickListener {
            val backButton = findViewById<ImageView?>(R.id.imageView)
            backButton.visibility = View.GONE
            val title: ImageView = findViewById<ImageView?>(R.id.imageView2)
            title.visibility = View.GONE
            backButton.visibility = View.GONE
        }

        // below line is to call set on query text listener method.
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                // inside on query text change method we are
                // calling a method to filter our recycler view.
                filter(newText)
                return false
            }
        })
        return true
    }

    private fun filter(text: String) {
        // creating a new array list to filter our data.
        val filteredlist = ArrayList<MentorTasks>()

        adapter.submitList(tasks)
        // running a for loop to compare elements.
        for (item in tasks) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.title.lowercase(Locale.getDefault()).contains(text.lowercase(Locale.getDefault()))) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item)
            }
        }
        if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(this, "No Data Found..", Toast.LENGTH_SHORT).show()
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            adapter.filterList(filteredlist)
        }
    }
}