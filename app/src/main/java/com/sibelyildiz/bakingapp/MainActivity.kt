package com.sibelyildiz.bakingapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sibelyildiz.bakingapp.model.BakingResponse
import com.sibelyildiz.bakingapp.network.BakingApiService
import com.sibelyildiz.bakingapp.network.RetrofitClient
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
                    val bakingList = ArrayList(response.body()!!)
                    Log.e("RESPONSE", "başarılı")
                    Log.e("Response", bakingList[1].name)
                }

                override fun onFailure(call: Call<List<BakingResponse>>, t: Throwable) {
                    Log.e("hata", t.toString())
                }

            })
    }
}