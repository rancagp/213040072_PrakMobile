class IndexNilaiMatkul (){

	fun nilaiIndexMatkul (nilaiAkhir: Int? = null): String {

	if (nilaiAkhir == null){
			return "Nilai harus diisi"
		}else if (nilaiAkhir > 100){
			return "Nilai diluar jangkauan"
		}

        return when (nilaiAkhir) {
            in 80..100 -> "A"
            in 70..79 -> "AB"
            in 60..69 -> "B"
            in 50..59 -> "BC"
            in 40..49 -> "C"
            in 30..39 -> "D"
            else -> "E"
		}
	}
}

	fun main() {
		val indexNilaiMatkul = IndexNilaiMatkul()
		var nilaiAkhir = 0

		nilaiAkhir = 77
		println("Input = ${nilaiAkhir} | Output = ${indexNilaiMatkul.nilaiIndexMatkul(nilaiAkhir)}")

		nilaiAkhir = 110
		println("Input = ${nilaiAkhir} | Output = ${indexNilaiMatkul.nilaiIndexMatkul(nilaiAkhir)}")


		println("Input = {Kosong} | Output = ${indexNilaiMatkul.nilaiIndexMatkul()}")

		nilaiAkhir = 25
		println("Input = ${nilaiAkhir} | Output = ${indexNilaiMatkul.nilaiIndexMatkul(nilaiAkhir)}")
}