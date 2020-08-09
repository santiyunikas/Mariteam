package com.santiyunikas.mariteam

import android.app.Activity
import android.content.Context
import android.content.res.Resources

object FishData {


    private val productNames= arrayOf(
        "Ikan Fahaka Fuffer Fish / Ikan Buntal Air tawar",
        "Shrimp Roll (Frozen Food Bento) Isi 10 Termurah Dijamin 100% HALAL",
        "Cedea Steamboat Suki plus bumbu 500g Suki frozen food bandung - 300g",
        "50 Pcs - Dimsum Siomay Premium Super Grosir Frozen Food Halal",
        "ikan tenggiri segar | seafood | hasil laut segar",
        "IKAN LAUT/IKAN SEGAR/IKAN BEKU/ IKAN TENGGIRI STEAK SUPER - 500 GRAM",
        "ikan gabus air tawar | seafood | hasil laut segar",
        "ikan bawal air tawar | seafood | hasil laut segar",
        "Ikan patin hidup",
        "Ikan Kerapu Hidup (Benih)"
    )

    private val imgProducts = intArrayOf(
        R.drawable.ikan_buntal,
        R.drawable.shrimproll,
        R.drawable.suki,
        R.drawable.dimsum,
        R.drawable.ikan_tenggiri2,
        R.drawable.ikan_tenggiri,
        R.drawable.ikan_gabus,
        R.drawable.ikan_bawal,
        R.drawable.ikan_patin,
        R.drawable.ikan_kerapu
    )

    private val prices = arrayOf(
        "Rp27.500",
        "Rp19.000",
        "Rp32.000",
        "Rp100.000",
        "Rp95.000",
        "Rp48.000",
        "Rp60.000",
        "Rp35.000",
        "Rp20.000",
        "Rp3.000"
    )

    private val weights = arrayOf(
        "250gr",
        "250gr",
        "350gr",
        "600gr",
        "2Kg",
        "1Kg",
        "500gr",
        "1Kg",
        "1Kg",
        "1Kg"
    )

    private val conditions = arrayOf(
        "Hidup",
        "Hidup",
        "Frozen",
        "Frozen",
        "Frozen",
        "Frozen",
        "Frozen",
        "Frozen",
        "Frozen",
        "Hidup"
    )

    private val categories = arrayOf(
        "Ikan Air Tawar",
        "Frozen Food",
        "Frozen Food",
        "Frozen Food",
        "Hasil Laut",
        "Hasil Laut",
        "Ikan Air Tawar",
        "Ikan Air Tawar",
        "Ikan Air Tawar",
        "Ikan Air Tawar"
    )

    private val minPurchases = arrayOf(
        "1000 Ekor",
        "10 Ekor",
        "1Kg",
        "600gr",
        "2Kg",
        "1Kg",
        "500gr",
        "3Kg",
        "5Kg",
        "10 Ekor"
    )

    private val descriptions = arrayOf(
        "Data Ikan : Fahaka Fuffer Fish \n" +
                "Size : 3-4 cm -/+ \n" +
                "Diet : Casut, Cabek, Jantik Nyamuk \n" +
                "Adaptasi : Air Tawar)",
        "Homemade Shrimp Roll / Udang Cincang Gulung Telur\n" +
                "1 Pack : 10 Pcs\n" +
                "- Panaskan minyak goreng\n" +
                "- Setelah minyak panas, kecilkan api\n" +
                "- Masukkan shrimp roll\n" +
                "- Goreng dlm keadaan beku dengan api yang kecil (hal ini utk mencegah shrimp roll jadi gosong krn di dalamnya msh beku)\n" +
                "- Masa Konsumsi 2bulan dengan penyimpanan di freezer sejak barang diterima (Produk FRESH produksi baru setiap hari)\n" +
                "Karna Frozen food Jadi harus selalu simpan di freezer.",
        "Deskripsi Cedea Steamboat Suki plus bumbu 500g Suki frozen food bandung - 300g\n" +
                "bikin suki atau steamboat di rumah anti ribet",
        "1 paket isi 50 pc ada 5 varian toping udang, beef, tuna, jamur, dan wortel",
        "ikan tenggiri segar | seafood | hasil laut segar\n" +
                "Ikan tenggiri segar langsung dari pelelangan ikan/hasil tangkapan para nelayan harian di jakarta, 100% fresh\n" +
                "Kondisi:\n" +
                "* ikan tenggiri yang sehat, bersih, segar dan berkwalitas\n" +
                "* 100 halal tanpa bahan pengawet\n" +
                "* Menjual produk dengan real dan amanah terpercaya\n" +
                "* Size semua ukuran\n" +
                "* Dikemas secara higienis\n" +
                "* Packing rapi, aman dan siap dikirim\n" +
                "* packing menggunakan kantong palstik/kantong kresek ,tidak menggunakan box/strofrom",
        "BAHAN: TENGGIRI SEGAR SEKALI, DAGING KENYAL, TIDAK BAKAL KECEWA!!\n" +
                "KUALITAS: SUPER BAGUS, BEKU KAPAL, KULIT IKAN BAGUS, INSANG MERAH, SUDAH DIPOTONG STEAK TINGGAL DIMASAK\n" +
                "WARNA DAGING: PINK KEMERAHAN\n" +
                "1KG BISA 7-8 KEPING\n" +
                "KONDISI: FROZEN\n" +
                "Penyimpanan:\n" +
                "Produk ikan sangat berpengaruh pada suhu sehingga untuk mempertahankan kualitas yang baik pastikan selalu tersimpan di dalam freezer (beku)",
        "Ikan gabus segar langsung dari pelelangan ikan/hasil tangkapan para nelayan harian di jakarta, 100% fresh\n" +
                "Kondisi:\n" +
                "* ikan gabus yang sehat, bersih, segar dan berkwalitas\n" +
                "* 100 halal tanpa bahan pengawet\n" +
                "* Menjual produk dengan real dan amanah terpercaya\n" +
                "* Size semua ukuran\n" +
                "* Dikemas secara higienis\n" +
                "* Packing rapi, aman dan siap dikirim\n" +
                "* packing menggunakan kantong palstik/kantong kresek ,tidak menggunakan box/strofrom",
    "Ikan bawal air tawar langsung dari pelelangan ikan/hasil tangkapan para nelayan harian di jakarta, 100% fresh\n" +
    "Kondisi:\n" +
    "* ikan tenggiri yang sehat, bersih, segar dan berkwalitas\n" +
    "* 100 halal tanpa bahan pengawet\n" +
    "* Menjual produk dengan real dan amanah terpercaya\n" +
    "* Size semua ukuran\n" +
    "* Dikemas secara higienis\n" +
    "* Packing rapi, aman dan siap dikirim\n" +
    "* packing menggunakan kantong palstik/kantong kresek ,tidak menggunakan box/strofrom",
        "Ikan patin hidup segar dan fresh.\n" +
                "Harga di atas sudah termasuk packing dan oksigen\n" +
                ". Harga di atas merupakan harga satuan.\n" +
                ".pemesanan untuk pengiriman hidup\n" +
                ".ukuran ikan , 30-45 cm ",
        "Jual benih ikan kerapu hidup. Termasuk kerapu hybrid\n" +
                "Kerapu Cantang\n" +
                "Kerapu Cantik\n" +
                "Kerapu Bebek\n" +
                "Kerapu Macan"
    )

    private val sendFroms = arrayOf(
        "Jakarta Barat, Cengkareng",
        "Jakarta Barat, Cengkareng",
        "Kota Depok",
        "Kota Bandung",
        "Kota Tangerang",
        "Jakarta Utara",
        "Kota Tangerang",
        "Jakarta Utara",
        "Jakarta Utara",
        "Jakarta Barat"
    )

    private val sellerNames = arrayOf(
        "Tambak Hanif",
        "Benaya Fish Farn",
        "Ratih Frozen Food",
        "Nuta Polite",
        "Small Food",
        "North Seafood Jakartah",
        "Sentra Ikan Laut",
        "North Seafood Jakarta",
        "North Seafood Jakarta",
        "Kotafish2",
        "North Seafood Jakarta"
    )

    private val preorderTimes = arrayOf(
        "1 Hari",
        "1 Hari",
        "Ready Stok",
        "Ready Stok",
        "1 Hari",
        "1 Hari",
        "Ready Stok",
        "1 Hari",
        "1 Hari",
        "1 Hari"
    )

    val listData: ArrayList<Fish>
        get() {
            val list = arrayListOf<Fish>()
            for (position in productNames.indices) {
                val fish = Fish()
                fish.title = productNames[position]
                fish.category = categories[position]
                fish.condition = conditions[position]
                fish.description = descriptions[position]
                fish.imgProduct = imgProducts[position]
                fish.minPurchase = minPurchases[position]
                fish.preorderTime = preorderTimes[position]
                fish.price = prices[position]
                fish.sellerName = sellerNames[position]
                fish.sendFrom = sendFroms[position]
                fish.weight = weights[position]

                list.add(fish)
            }
            return list
        }

}