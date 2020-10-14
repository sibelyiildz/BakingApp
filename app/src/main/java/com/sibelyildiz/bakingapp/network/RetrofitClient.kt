package com.sibelyildiz.bakingapp.network

import com.sibelyildiz.bakingapp.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**     Code with ❤
╔════════════════════════════╗
║  Created by Sibel YILDIZ   ║
╠════════════════════════════╣
║ sibelyldz2012@gmail.com    ║
╠════════════════════════════╣
║     12/10/2020 - 21:10     ║
╚════════════════════════════╝
 */
abstract class RetrofitClient {

    companion object {
        fun getRetrofit(): Retrofit {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.BASE_URL)
                .build()

            //val BackingService = retrofit.create(BakingApiService::class.java)
            return retrofit

        }
    }
}

/* companion object {
        @Volatile
        private var INSTANCE: Retrofit? = null

        private fun getRetrofit(): Retrofit {

            return INSTANCE ?: run {
                synchronized(this) {
                    return Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(BuildConfig.BASE_URL)
                        .build()

                }
            }
        }
    }*/
