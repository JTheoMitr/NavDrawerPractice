package com.example.navdrawerpractice.ui.attendance

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.transition.TransitionInflater
import com.example.navdrawerpractice.R
import com.example.navdrawerpractice.databinding.FragmentAttendanceBinding

class AttendanceFragment : Fragment() {

    private var _binding: FragmentAttendanceBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(AttendanceViewModel::class.java)

        val transition = TransitionInflater.from(requireContext())
        exitTransition = transition.inflateTransition(R.transition.fade)
        enterTransition = transition.inflateTransition(R.transition.fade)

        _binding = FragmentAttendanceBinding.inflate(inflater, container, false)

        val root: View = binding.root

//        val textView: TextView = binding.textGallery
//        galleryViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}