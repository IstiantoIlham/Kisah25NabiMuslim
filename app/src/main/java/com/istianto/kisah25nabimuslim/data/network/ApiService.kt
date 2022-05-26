package com.istianto.kisah25nabimuslim.data.network

import com.istianto.kisah25nabimuslim.data.KisahResponse
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ApiService {
    @GET("kisahnabi")
    fun getKisahNabi(): Flowable<List<KisahResponse>>
}