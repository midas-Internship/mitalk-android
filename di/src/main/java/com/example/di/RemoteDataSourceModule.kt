package com.example.di

import com.example.data.remote.datasource.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {

    @Singleton
    @Binds
    abstract fun provideRemoteQuestionDataSource(
        remoteQuestionDataSourceImpl: RemoteQuestionDataSourceImpl
    ): RemoteQuestionDataSource

    @Singleton
    @Binds
    abstract fun provideRemoteAuthDataSource(
        remoteAuthDataSourceImpl: RemoteAuthDataSourceImpl
    ): RemoteAuthDataSource

    @Singleton
    @Binds
    abstract fun provideRemoteRecordDataSource(
        remoteRecordDataSourceImpl: RemoteRecordDataSourceImpl
    ): RemoteRecordDataSource

    @Singleton
    @Binds
    abstract fun provideRemoteReviewDataSource(
        remoteReviewDataSourceImpl: RemoteReviewDataSourceImpl
    ): RemoteReviewDataSource

    @Singleton
    @Binds
    abstract fun provideRemoteFileDataSource(
        remoteFileDataSourceImpl: RemoteFileDataSourceImpl
    ): RemoteFileDataSource
}