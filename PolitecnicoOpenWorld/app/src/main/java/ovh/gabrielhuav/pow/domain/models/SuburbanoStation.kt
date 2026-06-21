package ovh.gabrielhuav.pow.domain.models

import org.osmdroid.util.GeoPoint

data class SuburbanoStation(
    val name: String,
    val routes: List<String>,
    val location: GeoPoint
)