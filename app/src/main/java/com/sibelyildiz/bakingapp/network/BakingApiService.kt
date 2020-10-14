package com.sibelyildiz.bakingapp.network

import com.sibelyildiz.bakingapp.model.BakingResponse
import retrofit2.Call
import retrofit2.http.GET


/**     Code with ❤
╔════════════════════════════╗
║  Created by Sibel YILDIZ   ║
╠════════════════════════════╣
║ sibelyldz2012@gmail.com    ║
╠════════════════════════════╣
║     12/10/2020 - 21:05     ║
╚════════════════════════════╝
 */
interface BakingApiService {

    @GET("baking.json")
    fun getBakiing(): Call<List<BakingResponse>>
}