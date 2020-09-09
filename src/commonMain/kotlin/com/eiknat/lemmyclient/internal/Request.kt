package com.eiknat.lemmyclient.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@Serializable(with = DataSerializer::class)
internal data class Data<T>(val data: T)

@Serializable
internal data class Request<T>(val op: String, val data: Data<T>)

internal class DataSerializer<T>(private val dataSerializer: KSerializer<T>) : KSerializer<Data<T>> {
    override val descriptor: SerialDescriptor = dataSerializer.descriptor
    override fun serialize(encoder: Encoder, value: Data<T>) = dataSerializer.serialize(encoder, value.data)
    override fun deserialize(decoder: Decoder) = Data(dataSerializer.deserialize(decoder))
}