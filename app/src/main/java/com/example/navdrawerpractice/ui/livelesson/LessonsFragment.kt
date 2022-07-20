package com.example.navdrawerpractice.ui.livelesson

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.transition.TransitionInflater
import com.example.navdrawerpractice.R

class LessonsFragment : Fragment() {

    companion object {
        fun newInstance() = LessonsFragment()
    }

    private lateinit var viewModel: LessonsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val transition = TransitionInflater.from(requireContext())
        exitTransition = transition.inflateTransition(R.transition.fade)
        enterTransition = transition.inflateTransition(R.transition.fade)

        return inflater.inflate(R.layout.fragment_lessons, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LessonsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}