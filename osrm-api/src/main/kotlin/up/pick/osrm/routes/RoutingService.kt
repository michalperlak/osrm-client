package up.pick.osrm.routes

import up.pick.osrm.common.Promise
import up.pick.osrm.domain.Coordinate
import up.pick.osrm.routes.domain.Routing
import up.pick.osrm.routes.params.Alternatives
import up.pick.osrm.routes.params.Annotations
import up.pick.osrm.routes.params.Overview

interface RoutingService {
    fun route(
        coordinates: List<Coordinate>,
        alternatives: Alternatives = Alternatives.none(),
        steps: Boolean = false,
        overview: Overview = Overview.SIMPLIFIED,
        annotations: Annotations = Annotations.NONE
    ): Promise<Routing>
}