package com.example.data.local.chat

import com.example.data.local.ChatPreference
import com.example.domain.entity.ChatInfoEntity
import javax.inject.Inject

class LocalChatDataSourceImpl @Inject constructor(
    private val chatPreference: ChatPreference
) : LocalChatDataSource {
    override suspend fun saveChatInfo(chatInfoEntity: ChatInfoEntity) = with(chatPreference) {
        saveChatType(chatInfoEntity.chatType)
    }

    override suspend fun fetchChatInfo(): ChatInfoEntity = with(chatPreference) {
        return ChatInfoEntity(chatType = fetchChatType())
    }

    override suspend fun clearChatInfo() = with(chatPreference) {
        clearRoomId()
        clearChatType()
    }
}