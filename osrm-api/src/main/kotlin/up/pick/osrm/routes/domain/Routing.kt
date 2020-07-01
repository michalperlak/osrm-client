package up.pick.osrm.routes.domain

import up.pick.osrm.common.Ordered

class Routing(
    val waypoints: Ordered<Waypoint>,
    val routes: Ordered<Route>
)