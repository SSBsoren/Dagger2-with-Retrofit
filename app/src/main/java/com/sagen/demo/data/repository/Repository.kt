package com.sagen.demo.data.repository

import com.sagen.demo.data.remote.RemoteDataSource
import javax.inject.Inject


class Repository @Inject constructor(remoteDataSource: RemoteDataSource) {
    val remote = remoteDataSource
}