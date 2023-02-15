package com.example.data.local

import java.time.LocalDateTime

interface AuthPreference {

    suspend fun saveAccessToken(accessToken: String)

    suspend fun fetchAccessToken(): String

    suspend fun clearAccessToken()

    suspend fun saveRefreshToken(refreshToken: String)

    suspend fun fetchRefreshToken(): String

    suspend fun clearRefreshToken()

    suspend fun saveRefreshExp(refreshExp: LocalDateTime)

    suspend fun fetchRefreshExp(): LocalDateTime

    suspend fun clearRefreshExp()
}