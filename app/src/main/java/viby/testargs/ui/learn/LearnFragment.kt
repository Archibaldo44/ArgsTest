package viby.testargs.ui.learn

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import viby.testargs.R
import viby.testargs.databinding.FragmentLearnBinding
import viby.testargs.databinding.FragmentSlideshowBinding

class LearnFragment : Fragment() {

    private var _binding: FragmentLearnBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLearnBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val specialCase = LearnFragmentArgs.fromBundle(requireArguments()).specialCase
        if (specialCase) {
            binding.root.setBackgroundColor(Color.CYAN)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
