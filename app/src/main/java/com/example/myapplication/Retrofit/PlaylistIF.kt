package com.example.myapplication.Retrofit

import com.example.myapplication.Data.Response.AllPlaylistResponse
import com.example.myapplication.Data.Response.TrackResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface PlaylistIF {
    @GET("api/playlists")
    fun getAllPlaylist(
        @Header("Authorization") token:String,
    ): Call<AllPlaylistResponse>

    @GET("api/playlists/{playlistId}/track")
    fun getTracklist(
        @Path("playlistId") playlistId:Long
    ): Call<TrackResponse>

}