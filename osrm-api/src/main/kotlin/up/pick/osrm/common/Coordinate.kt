package up.pick.osrm.common

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