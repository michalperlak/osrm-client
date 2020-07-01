package up.pick.osrm.routes.params

sealed class Alternatives {
    abstract val limit: Int

    companion object {
        fun none(): Alternatives = NoAlternatives
        fun all(): Alternatives = AllAvailableAlternatives
        fun upTo(max: Int): Alternatives = UpToAlternatives(max)
    }
}

internal object NoAlternatives : Alternatives() {
    override val limit: Int = 0
}

internal object AllAvailableAlternatives : Alternatives() {
    override val limit: Int = Int.MAX_VALUE
}

internal data class UpToAlternatives(
    override val limit: Int
) : Alternatives()