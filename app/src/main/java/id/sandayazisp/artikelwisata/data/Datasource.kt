package id.sandayazisp.artikelwisata.data
import id.sandayazisp.artikelwisata.model.Artikel
import id.sandayazisp.artikelwisata.R

class Datasource() {
    fun loadArtikels(): List<Artikel> {
        return listOf<Artikel>(
            Artikel(R.string.artikel1, R.drawable.image1),
            Artikel(R.string.artikel2, R.drawable.image2),
            Artikel(R.string.artikel3, R.drawable.image3),
            Artikel(R.string.artikel4, R.drawable.image4),
            Artikel(R.string.artikel5, R.drawable.image5),
            Artikel(R.string.artikel6, R.drawable.image6),
            Artikel(R.string.artikel7, R.drawable.image7),
            Artikel(R.string.artikel8, R.drawable.image8),
            Artikel(R.string.artikel9, R.drawable.image9),
            Artikel(R.string.artikel10, R.drawable.image10))
    }
}
