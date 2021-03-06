package com.nerdery.rtaza.jobtracker.ui.util

fun String.Companion.join(delimiter: String?, vararg strings: String?): String? {
    val builder = StringBuilder()
    var string: String?

    for (index in 0 until strings.size) {
        string = strings[index]

        if (!string.isNullOrEmpty()) {
            if (builder.isNotEmpty()) {
                builder.append(delimiter)
            }
            builder.append(string)
        }
    }

    return if (builder.isEmpty()) null else builder.toString()
}