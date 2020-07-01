package up.pick.osrm.domain

data class Coordinate(
    val longitude: Longitude,
    val latitude: Latitude
)

data class Longitude(
    private val value: Double
)

data class Latitude(
    private val value: Double
)