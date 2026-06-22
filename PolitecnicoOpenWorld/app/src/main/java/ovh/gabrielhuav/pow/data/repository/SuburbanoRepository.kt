package ovh.gabrielhuav.pow.data.repository

import android.content.Context
import org.osmdroid.util.GeoPoint
import ovh.gabrielhuav.pow.domain.models.SuburbanoStation

object SuburbanoRepository {

    @Suppress("UNUSED_PARAMETER")
    fun loadStations(context: Context): List<SuburbanoStation> {
        return listOf(
            SuburbanoStation("Buenavista", listOf("Suburbano"), GeoPoint(19.4473, -99.1537)),
            SuburbanoStation("Fortuna", listOf("Suburbano"), GeoPoint(19.4827, -99.1482)),
            SuburbanoStation("Tlalnepantla", listOf("Suburbano"), GeoPoint(19.5386, -99.1947)),
            SuburbanoStation("San Rafael", listOf("Suburbano"), GeoPoint(19.5605, -99.2178)),
            SuburbanoStation("Lecheria", listOf("Suburbano"), GeoPoint(19.6087, -99.1811)),
            SuburbanoStation("Tultitlan", listOf("Suburbano"), GeoPoint(19.6465, -99.1688)),
            SuburbanoStation("Cuautitlan", listOf("Suburbano"), GeoPoint(19.6728, -99.1804))
        )
    }
}