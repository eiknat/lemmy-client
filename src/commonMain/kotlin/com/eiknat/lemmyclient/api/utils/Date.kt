package com.eiknat.lemmyclient.api.utils

// TODO this is gonna be wild, need special handling because ktx serialization cant handle inlines

//data class Date(val dateTime: DateTime) {
//    internal var dateTime = DateTime(0)
//
//    var time: Long
//        get() = dateTime.unixMillisLong
//        set(value) {
//            dateTime = DateTime(value)
//        }
//
//    override fun toString(): String = dateTime.toString()
//}
//
//
//@Serializer(forClass = Date::class)
//object DateSerializer : KSerializer<Date> {
//    override val descriptor: SerialDescriptor =
//        PrimitiveDescriptor("date", PrimitiveKind.STRING)
//
//    override fun serialize(output: Encoder, obj: Date) {
//        output.encodeString(obj.time.toString())
//    }
//
//    override fun deserialize(input: Decoder): Date {
//        return Date(input.decodeString().toLong())
//    }
//}