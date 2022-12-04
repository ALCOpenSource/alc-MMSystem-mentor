package com.peculiaruc.alc_mmsystem_mentor.view.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.coroutineScope
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentor.databinding.FragmentNotificationBinding
import com.peculiaruc.alc_mmsystem_mentor.view.activity.MainActivity
import com.peculiaruc.alc_mmsystem_mentor.view.adapter.NotificationAdapter
import com.peculiaruc.alc_mmsystem_mentor.view.adapter.NotificationData
import kotlinx.coroutines.*

/**
 * This class defines the notification view
 * and interaction that occur during mentor application process
 */
class NotificationFragment : Fragment() {
    private lateinit var binding: FragmentNotificationBinding
    private lateinit var adapter: NotificationAdapter
    private lateinit var dataList: ArrayList<NotificationData>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNotificationBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        dataList = ArrayList()
        dataList.add(NotificationData(NotificationAdapter.DATE_TYPE, "Sep 30"))
        dataList.add(
            NotificationData(
                NotificationAdapter.MESSAGE_TYPE,
                "Your Application to be a mentor is in processing. You will get notification about the process update."
            )
        )
        dataList.add(NotificationData(NotificationAdapter.DATE_TYPE, "Oct 15"))
        dataList.add(
            NotificationData(
                NotificationAdapter.MESSAGE_TYPE,
                "Please update your experience information for the interview.."
            )
        )




        adapter = NotificationAdapter(requireActivity(), dataList)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        binding.recyclerView.adapter = adapter




        view.delayOnLifecycle(5000L) {
            dataList.add(NotificationData(NotificationAdapter.DATE_TYPE, "Oct 15"))
            dataList.add(
                NotificationData(
                    NotificationAdapter.MESSAGE_TYPE,
                    "Congratulations!! You have been accepted as a mentor. Click on continue at the bottom to go to your dashboard."
                )
            )

            adapter.notifyDataSetChanged()
            binding.btnNotificationContinue.visibility = View.VISIBLE
        }

        binding.btnNotificationContinue.setOnClickListener {
            startActivity(Intent(requireActivity(), MainActivity::class.java))
        }

    }

    private fun View.delayOnLifecycle(
        durationInMillis: Long,
        dispatcher: CoroutineDispatcher = Dispatchers.Main,
        block: () -> Unit
    ): Job? = findViewTreeLifecycleOwner()?.let { lifecycleOwner ->
        lifecycleOwner.lifecycle.coroutineScope.launch(dispatcher) {
            delay(durationInMillis)
            block()

        }
    }
}