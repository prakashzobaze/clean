package com.zobaze.mealsearch.hilt

import android.content.Context
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.zobaze.mealsearch.common.Constants
import com.zobaze.mealsearch.data.remote.MealSearchAPI
import com.zobaze.mealsearch.data.remote.QuoteDisplayAPI
import com.zobaze.mealsearch.data.repository.FirebaseDataSourceImpl
import com.zobaze.mealsearch.data.repository.MealDetailsRepositoryImpl
import com.zobaze.mealsearch.data.repository.MealSearchRepistoryImpl
import com.zobaze.mealsearch.data.repository.QuoteDisplayRepositoryImpl
import com.zobaze.mealsearch.domain.repository.FirebaseDataSourceRepository
import com.zobaze.mealsearch.domain.repository.MealDetailsRepository
import com.zobaze.mealsearch.domain.repository.MealSearchRepository
import com.zobaze.mealsearch.domain.repository.QuoteDisplayRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object HIltModules {


    @Provides
    @Singleton
    fun provideMealSearchAPI(): MealSearchAPI {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(MealSearchAPI::class.java)
    }


    @Provides
    fun provideMealSearchRepository(mealSearchAPI: MealSearchAPI): MealSearchRepository {
        return MealSearchRepistoryImpl(mealSearchAPI)
    }


    @Provides
    fun provideMealDetails(searchMealSearchAPI: MealSearchAPI): MealDetailsRepository {
        return MealDetailsRepositoryImpl(searchMealSearchAPI)
    }

    @Provides
    @Singleton
    fun provideQuoteDisplayAPI(): QuoteDisplayAPI {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL_QUOTES)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(QuoteDisplayAPI::class.java)
    }

    @Provides
    fun provideQuotesList(quoteDisplayAPI: QuoteDisplayAPI): QuoteDisplayRepository {
        return QuoteDisplayRepositoryImpl(quoteDisplayAPI)
    }

    @Provides
    fun provideUsersRef() = FirebaseFirestore.getInstance().collection(Constants.CONFIG)

    @Provides
    fun provideFirebaseUsers(usersRef: CollectionReference): FirebaseDataSourceRepository {
        return FirebaseDataSourceImpl(usersRef)
    }

}