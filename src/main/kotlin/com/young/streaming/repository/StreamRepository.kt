package com.young.streaming.repository

import com.young.streaming.model.StreamModel
import org.springframework.data.repository.CrudRepository

interface StreamRepository: CrudRepository<StreamModel, Int> {
    fun findAllBy(): List<StreamModel>?
    fun findStreamModelByMaster(master: String): StreamModel?
    fun removeStreamModelByStreamKey(streamKey: String): Any?
    fun deleteAllBy()
    fun removeAllBy()
}
