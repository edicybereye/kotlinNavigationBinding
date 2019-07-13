package com.whitaaplikasi.kotlinbasic


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.whitaaplikasi.kotlinbasic.databinding.FragmentDepanBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class DepanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentDepanBinding>(inflater,
            R.layout.fragment_depan,container,false)
        // Inflate the layout for this fragment
        binding.button.setOnClickListener{
                view : View ->
            view.findNavController().navigate(R.id.action_depanFragment_to_nextFragment)
        }
        return binding.root
    }


}
