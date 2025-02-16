class PersegiPanjang(val panjang: Double, val lebar: Double) {
    fun hitungLuas(): Double {
        return panjang * lebar
    }

    fun hitungKeliling(): Double {
        return 2 * (panjang + lebar)
    }
}

fun main() {
    val panjang = 10.0
    val lebar = 20.0
    val persegiPanjang = PersegiPanjang(panjang, lebar)
    val luas = persegiPanjang.hitungLuas()
    val keliling = persegiPanjang.hitungKeliling()

    println("Panjang = $panjang")
    println("Lebar = $lebar")
    println("Luas = $luas")
    println("Keliling = $keliling")
}
