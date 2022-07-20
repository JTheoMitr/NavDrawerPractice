package com.example.navdrawerpractice.ui.log

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.transition.TransitionInflater
import com.example.navdrawerpractice.R
import com.example.navdrawerpractice.databinding.FragmentLogEntryBinding

class LogEntryFragment : Fragment() {

    private var _binding: FragmentLogEntryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(LogEntryViewModel::class.java)

        val transition = TransitionInflater.from(requireContext())
        exitTransition = transition.inflateTransition(R.transition.fade)
        enterTransition = transition.inflateTransition(R.transition.fade)

        _binding = FragmentLogEntryBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textSlideshow
//        slideshowViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}