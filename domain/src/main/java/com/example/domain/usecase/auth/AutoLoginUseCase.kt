package com.example.domain.usecase.auth

import com.example.domain.repository.AuthRepository
import javax.inject.Inject

class AutoLoginUseCase @Inject constructor(
    private val autRepository: AuthRepository,
) {
    suspend operator fun invoke() = kotlin.runCatching {
        autRepository.autoLogin()
    }
}