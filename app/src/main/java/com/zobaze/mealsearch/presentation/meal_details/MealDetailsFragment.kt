package com.zobaze.mealsearch.presentation.meal_details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.coroutineScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.zobaze.mealsearch.databinding.FragmentMealDetailsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class MealDetailsFragment : Fragment() {

    private var _binding: FragmentMealDetailsBinding? = null
    private val binding: FragmentMealDetailsBinding
        get() = _binding!!

    private val mealDetailsViewModel: MealDetailsViewModel by viewModel()

    private val args: MealDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMealDetailsBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        args.mealId?.let {
            mealDetailsViewModel.getMealDetails(it)
        }


        lifecycle.coroutineScope.launchWhenCreated {
            mealDetailsViewModel.mealDetails.collect {
                if (it.isLoading) {
                }
                if (it.error.isNotBlank()) {
                    Toast.makeText(requireContext(),it.error,Toast.LENGTH_SHORT).show()
                }
                it.data?.let {
                    binding.mealDetails = it
                }
            }
        }


        binding.detailsBackArrow.setOnClickListener {
            findNavController().popBackStack()
        }


    }

}