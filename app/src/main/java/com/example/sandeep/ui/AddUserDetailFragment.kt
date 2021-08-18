package com.example.sandeep.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.example.core.exension.observe
import com.example.core.util.Resource
import com.example.core.util.Status
import com.example.core.util.showToast
import com.example.sandeep.Person
import com.example.sandeep.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.layout_add_user_details.*

/**
 * Created by Sandeep Sankla
 */

@AndroidEntryPoint
class AddUserDetailFragment : DialogFragment() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.layout_add_user_details, container)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observe(viewModel.person, ::userListener)
        btSubmit.setOnClickListener {
            if(!etUserName.text.isNullOrEmpty() && !etUserCity.text.isNullOrEmpty()){
                viewModel.addPerson(etUserName.text.toString(), etUserCity.text.toString())
            }
        }
    }
    override fun onResume() {
        // Get existing layout params for the window
        val params: ViewGroup.LayoutParams = dialog!!.window!!.attributes
        // Assign window properties to fill the parent
        params.width = WindowManager.LayoutParams.MATCH_PARENT
        params.height = WindowManager.LayoutParams.WRAP_CONTENT
        dialog!!.window!!.attributes = params as WindowManager.LayoutParams
        // Call super onResume after sizing
        super.onResume()
    }

    private fun userListener(resource: Resource<Person>) {
        //applog.d(TAG, resource.status.name)
        when (resource.status) {
            Status.SUCCESS -> {
                //progressBar.hide()
                context?.showToast("Person added successfully")
                dismissAllowingStateLoss()
            }
            Status.ERROR -> {
                //progressBar.hide()
                viewModel.showSnackBarMessage(resource.message.toString())
            }
            Status.LOADING -> {
                //progressBar.show()
            }

        }
    }
}