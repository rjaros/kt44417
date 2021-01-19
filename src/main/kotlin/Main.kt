@file:UseContextualSerialization(Date::class)

package org.example

import kotlinx.serialization.Serializable
import kotlinx.serialization.UseContextualSerialization
import java.util.*

@Serializable
data class Test(val date: Date?)

fun main() {
    println("Hello")
}
