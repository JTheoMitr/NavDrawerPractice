package com.example.navdrawerpractice.ui.grades

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.transition.TransitionInflater
import com.example.navdrawerpractice.R

class GradesFragment : Fragment() {

    companion object {
        fun newInstance() = GradesFragment()
    }

    private lateinit var viewModel: GradesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val transition = TransitionInflater.from(requireContext())
        exitTransition = transition.inflateTransition(R.transition.fade)
        enterTransition = transition.inflateTransition(R.transition.fade)

        return inflater.inflate(R.layout.fragment_grades, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GradesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}