package up.pick.osrm.routes.domain

import up.pick.osrm.common.Ordered

data class Route(
    val legs: Ordered<RouteLeg>,
    val weight: Weight,
    val distance: Distance,
    val duration: Duration
)