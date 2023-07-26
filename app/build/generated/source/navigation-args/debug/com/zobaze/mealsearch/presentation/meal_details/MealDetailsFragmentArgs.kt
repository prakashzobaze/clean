package com.zobaze.mealsearch.presentation.meal_details

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import kotlin.String
import kotlin.jvm.JvmStatic

public data class MealDetailsFragmentArgs(
  public val mealId: String? = null,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("meal_id", this.mealId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("meal_id", this.mealId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): MealDetailsFragmentArgs {
      bundle.setClassLoader(MealDetailsFragmentArgs::class.java.classLoader)
      val __mealId : String?
      if (bundle.containsKey("meal_id")) {
        __mealId = bundle.getString("meal_id")
      } else {
        __mealId = null
      }
      return MealDetailsFragmentArgs(__mealId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): MealDetailsFragmentArgs {
      val __mealId : String?
      if (savedStateHandle.contains("meal_id")) {
        __mealId = savedStateHandle["meal_id"]
      } else {
        __mealId = null
      }
      return MealDetailsFragmentArgs(__mealId)
    }
  }
}
