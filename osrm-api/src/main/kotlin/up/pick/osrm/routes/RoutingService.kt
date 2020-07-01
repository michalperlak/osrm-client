package up.pick.osrm.routes

import up.pick.osrm.common.Coordinate
import up.pick.osrm.common.Option
import up.pick.osrm.routes.domain.Routing
import up.pick.osrm.routes.params.Alternatives
import up.pick.osrm.routes.params.Annotations
import up.pick.osrm.routes.params.Overview

class RoutingService {
    fun route(
        coordinates: List<Coordinate>,
        alternatives: Alternatives = Alternatives.none(),
        steps: Boolean = false,
        overview: Overview = Overview.SIMPLIFIED,
        annotations: Annotations = Annotations.NONE
    ): Option<Routing> = TODO()
}