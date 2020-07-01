package up.pick.osrm.http.reactive

import reactor.core.publisher.Mono
import up.pick.osrm.common.Promise

internal class MonoPromise<T : Any>(
    private val mono: Mono<T>
) : Promise<T> {
    override fun <R : Any> map(mapper: (T) -> R): Promise<R> = MonoPromise(mono.map(mapper))
    override fun <R : Any> flatMap(mapper: (T) -> Promise<R>): Promise<R> = TODO()
    override fun filter(predicate: (T) -> Boolean): Promise<T> = MonoPromise(mono.filter(predicate))
}