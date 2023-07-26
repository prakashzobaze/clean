package com.zobaze.mealsearch.presentation.meal_search

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.zobaze.mealsearch.R
import kotlin.Int
import kotlin.String

public class MealSearchFragmentDirections private constructor() {
  private data class ActionMealSearchFragmentToMealDetailsFragment(
    public val mealId: String? = null,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_mealSearchFragment_to_mealDetailsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("meal_id", this.mealId)
        return result
      }
  }

  public companion object {
    public fun actionMealSearchFragmentToMealDetailsFragment(mealId: String? = null): NavDirections
        = ActionMealSearchFragmentToMealDetailsFragment(mealId)

    public fun actionMealSearchFragmentToQuotesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mealSearchFragment_to_quotesFragment)

    public fun actionMealSearchFragmentToUsersFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mealSearchFragment_to_usersFragment)
  }
}
