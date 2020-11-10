package com.example.filmcuttingmachine.data.repository

import com.example.filmcuttingmachine.data.bean.Category
import com.example.filmcuttingmachine.data.bean.Pageable
import com.example.filmcuttingmachine.data.bean.base.ResultData
import com.example.filmcuttingmachine.repository.datasource.RemoteDataSource

class HomePageRepository(private val homeRemoteDataSource: RemoteDataSource) {
    suspend fun getCategory(): ResultData<List<Category>> {
        var category = Category(0, "", "")
        var pageable = Pageable(1, 20, "id")
        val categoryList = homeRemoteDataSource.getHomePageCategory()
        if (categoryList is ResultData.Success) {
            return categoryList
        }
        return categoryList
    }
}