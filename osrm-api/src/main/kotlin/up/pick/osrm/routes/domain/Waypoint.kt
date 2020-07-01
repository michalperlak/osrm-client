package up.pick.osrm.routes.domain

import up.pick.osrm.domain.Coordinate

data class Waypoint(
    val location: Coordinate,
    val name: String
)