package up.pick.osrm.common

interface Promise<out T : Any> {
    fun <R : Any> map(mapper: (T) -> R): Promise<R>
    fun <R : Any> flatMap(mapper: (T) -> Promise<R>): Promise<R>
    fun filter(predicate: (T) -> Boolean): Promise<T>

    companion object {
        fun <T : Any> just(value: T): Promise<T> = Just(value)
        fun <T : Any> empty(): Promise<T> = None
    }
}

internal data class Just<T : Any>(
    val value: T
) : Promise<T> {
    override fun <R : Any> map(mapper: (T) -> R): Promise<R> = Just(mapper(value))
    override fun <R : Any> flatMap(mapper: (T) -> Promise<R>): Promise<R> = mapper(value)
    override fun filter(predicate: (T) -> Boolean): Promise<T> =
        if (predicate(value)) {
            this
        } else {
            None
        }
}

internal object None : Promise<Nothing> {
    override fun <R : Any> map(mapper: (Nothing) -> R): Promise<R> = None
    override fun <R : Any> flatMap(mapper: (Nothing) -> Promise<R>): Promise<R> = None
    override fun filter(predicate: (Nothing) -> Boolean): Promise<Nothing> = None
}