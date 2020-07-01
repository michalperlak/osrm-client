package up.pick.osrm.common

data class Ordered<T : Comparable<T>>(
    private val elements: List<T>
): Iterable<T> {
    private val sorted by lazy { elements.sorted() }

    override fun iterator(): Iterator<T> = sorted.iterator()
}