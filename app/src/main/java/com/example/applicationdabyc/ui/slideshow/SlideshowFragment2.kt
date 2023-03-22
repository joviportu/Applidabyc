package com.example.applicationdabyc.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.applicationdabyc.databinding.FragmentSlideshow2Binding
import com.example.applicationdabyc.databinding.FragmentSlideshowBinding

class SlideshowFragment2 : Fragment() {

    private var _binding: FragmentSlideshow2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel2::class.java)

        _binding = FragmentSlideshow2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSlideshow1
        slideshowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}