package up.pick.osrm.routes.domain

data class RouteLeg(
    val weight: Weight,
    val distance: Distance,
    val duration: Duration
)