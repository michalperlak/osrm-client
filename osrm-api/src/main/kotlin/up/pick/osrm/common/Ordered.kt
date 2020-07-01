package up.pick.osrm.common

class Ordered<T>(
    private val elements: Array<T>
) : Iterable<T> {
    override fun iterator(): Iterator<T> = elements.iterator()
}