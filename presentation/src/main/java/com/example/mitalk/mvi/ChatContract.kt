package com.example.mitalk.mvi

import android.net.Uri
import com.example.domain.entity.RecordDetailEntity
import com.example.mitalk.socket.ChatSocket
import com.example.mitalk.ui.chat.ChatData
import java.time.LocalDateTime


data class ChatState(
    val counsellorName: String = "",
    val accessToken: String = "",
    val remainPeople: String = "",
    val chatSocket: ChatSocket = ChatSocket({}, {}, {}, {}, {}, {}, {}, {}),
    val chatList: List<ChatData> = mutableListOf(),
    val uploadList: List<Uri> = mutableListOf(),
    val callCheck: Boolean = false,
    val chatType: String = "",
)

fun RecordDetailEntity.MessageRecord.toChatData(deleteMsg: String) = ChatData(
    id = messageId,
    text = if (isDeleted) deleteMsg else dataMap.last().message,
    isMe = sender == "CUSTOMER",
    time = LocalDateTime.parse(dataMap.last().time)
)

sealed class ChatSideEffect {
    data class ReceiveChat(val chat: ChatData, val chatSize: Int) : ChatSideEffect()
    data class ReceiveChatUpdate(val chat: ChatData) : ChatSideEffect()
    data class ReceiveChatDelete(val chatId: String) : ChatSideEffect()
    data class SuccessRoom(val name: String) : ChatSideEffect()
    data class SuccessUpload(val url: String) : ChatSideEffect()
    object CrowedService : ChatSideEffect()
    object WaitingRoom : ChatSideEffect()
    object FinishRoom : ChatSideEffect()
    object ErrorSocket : ChatSideEffect()
    data class FileSizeException(val uri: Uri) : ChatSideEffect()
    object FileOverException : ChatSideEffect()
    object FileNotAllowedException : ChatSideEffect()
}