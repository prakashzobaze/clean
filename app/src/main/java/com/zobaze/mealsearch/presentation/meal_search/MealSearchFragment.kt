package com.zobaze.mealsearch.presentation.meal_search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.coroutineScope
import androidx.navigation.fragment.findNavController
import com.zobaze.mealsearch.databinding.FragmentMealSearchBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MealSearchFragment : Fragment() {

    private val searchAdapter = MealSearchAdapter()


    private val mealSearchViewModel: MealSearchViewModel by viewModel()


    private var _binding: FragmentMealSearchBinding? = null
    val binding: FragmentMealSearchBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMealSearchBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        binding.mealSearchRecycler.apply {
            adapter = searchAdapter
        }


        binding.mealSearchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(s: String?): Boolean {
                s?.let {
                    mealSearchViewModel.getSearchMeals(it)
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                return false
            }
        })

        lifecycle.coroutineScope.launchWhenCreated {
            mealSearchViewModel.mealSearchList.collect {
                if (it.isLoading) {
                    binding.nothingFound.visibility = View.GONE
                    binding.progressMealSearch.visibility = View.VISIBLE
                }
                if (it.error.isNotBlank()) {
                    binding.nothingFound.visibility = View.GONE
                    binding.progressMealSearch.visibility = View.GONE
                    Toast.makeText(requireContext(), it.error, Toast.LENGTH_SHORT).show()
                }

                it.data?.let {

                    if (it.isEmpty()) {
                        binding.nothingFound.visibility = View.VISIBLE
                    }
                    binding.progressMealSearch.visibility = View.GONE
                    searchAdapter.setContentList(it.toMutableList())
                }


            }
        }


        searchAdapter.itemClickListener {
            findNavController().navigate(
                MealSearchFragmentDirections.actionMealSearchFragmentToMealDetailsFragment(
                    it.id
                )
            )
        }

        binding.tvDisplayProducts.setOnClickListener {
            findNavController().navigate(MealSearchFragmentDirections.actionMealSearchFragmentToQuotesFragment())
        }

        binding.tvUsers.setOnClickListener {
            findNavController().navigate(MealSearchFragmentDirections.actionMealSearchFragmentToUsersFragment())
        }

    }

}