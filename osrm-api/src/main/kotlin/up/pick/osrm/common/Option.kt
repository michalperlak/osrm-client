package up.pick.osrm.common

sealed class Option<out T> {
    abstract fun <S> map(mapper: (T) -> S): Option<S>
    abstract fun <S> flatMap(mapper: (T) -> Option<S>): Option<S>
    abstract fun ifPresent(consumer: (T) -> Unit)
}

object None : Option<Nothing>() {
    override fun <S> map(mapper: (Nothing) -> S): Option<S> = None
    override fun <S> flatMap(mapper: (Nothing) -> Option<S>): Option<S> = None
    override fun ifPresent(consumer: (Nothing) -> Unit) = Unit
}

data class Some<T>(
    private val value: T
) : Option<T>() {
    override fun <S> map(mapper: (T) -> S): Option<S> = Some(mapper(value))
    override fun <S> flatMap(mapper: (T) -> Option<S>): Option<S> = mapper(value)
    override fun ifPresent(consumer: (T) -> Unit) = consumer(value)
}