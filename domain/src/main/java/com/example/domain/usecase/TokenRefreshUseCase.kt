package com.example.domain.usecase

import com.example.domain.repository.AuthRepository
import javax.inject.Inject

class TokenRefreshUseCase @Inject  constructor(
    private val authRepository: AuthRepository,
) {
    suspend operator fun invoke() = kotlin.runCatching {
        authRepository.tokenRefresh()
    }
}