// "Create header class implementation for platform JVM" "true"

header class <caret>WithNested {
    fun foo(): Int

    class Nested {
        fun bar()
    }

    inner class Inner {
        fun baz()
    }
}
