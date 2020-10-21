package com.sibelyildiz.bakingapp.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sibelyildiz.bakingapp.R
import com.sibelyildiz.bakingapp.adapter.RecipeAdapter
import com.sibelyildiz.bakingapp.model.BakingResponse
import com.sibelyildiz.bakingapp.network.BakingApiService
import com.sibelyildiz.bakingapp.network.RetrofitClient
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RetrofitClient.getRetrofit().create(BakingApiService::class.java)
            .getBakiing().enqueue(object : Callback<List<BakingResponse>> {
                override fun onResponse(
                    call: Call<List<BakingResponse>>,
                    response: Response<List<BakingResponse>>
                ) {
                    val recipeList = ArrayList(response.body()!!)
                    recyclerView_recipe.layoutManager = LinearLayoutManager(this@MainActivity)
                    recyclerView_recipe.adapter = RecipeAdapter(recipeList)
                }

                override fun onFailure(call: Call<List<BakingResponse>>, t: Throwable) {
                    Log.e("hata", t.toString())
                }

            })
    }
}