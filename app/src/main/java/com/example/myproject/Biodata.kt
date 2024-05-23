package com.example.myproject


data class Biodata( var gambar: Int, var nama: String, var nim: Int, var ttl: String, var alamat: String, var wa: String, var ig: String)

fun DataBiodata():MutableList<Biodata>{
    val data = mutableListOf<Biodata>()

    data.add(Biodata(R.drawable.adi,"Adi Alam", 23307091, "01 Mei 2004", "Madiun", "http://wa.me/+62882009045911", "https://www.instagram.com/kidiepie/"))
    data.add(Biodata(R.drawable.ahmad,"Ahmad Hamdani", 23307092, "19 Mei 2005", "Madiun", "http://wa.me/+6285607599369","https://www.instagram.com/hamdani_qhmqd/"))
    data.add(Biodata(R.drawable.alzamna,"Alzamna Lentera", 233307093, "16 Desember 2004", "Madiun", "http://wa.me/+6285607141421","https://www.instagram.com/"))
    data.add(Biodata(R.drawable.anis,"Annisya", 23307094, "10 Maret 2005", "Magetan", "http://wa.me/+628993193158","https://www.instagram.com/anniisyya_/"))
    data.add(Biodata(R.drawable.bagas,"Bagas Yudha", 233307095, "04 Juni 2005", "Ngawi", "http://wa.me/+6282224010532","https://www.instagram.com/yudhaaa.y/"))
    data.add(Biodata(R.drawable.bagus,"Bagus Prasetyo ", 23307096, "18 Agustus 2003", "Magetan", "http://wa.me/+6289621659356","https://www.instagram.com/prasetyobagusssss/"))
    data.add(Biodata(R.drawable.bintang,"Bintang Raka", 233307097, "08 Mei 2005", "Ngawi", "http://wa.me/+6285607053282","https://www.instagram.com/rrrrrrrkaaaaaaaa/"))
    data.add(Biodata(R.drawable.dira,"Dirajati Kusuma", 233307098, "26 Maret 2005", "Madiun", "http://wa.me/+6285706577250","https://www.instagram.com/2.dzxraxx5/"))
    data.add(Biodata(R.drawable.evita,"Evita Dwi", 23307099, "01 April 2004", "Magetan", "http://wa.me/+6285656829503","https://www.instagram.com/evtaadv_/"))
    data.add(Biodata(R.drawable.ferry,"Ferry Fernando", 233307100, "28 Maret 2005", "Magetan",  "http://wa.me/+62895399094076", "https://www.instagram.com/ferynnd/"))
    data.add(Biodata(R.drawable.hadziq,"Hadziq Naufal", 233307101, "16 Juli 2005", "Madiun", "http://wa.me/+62895343028010","https://www.instagram.com/h.dzq__/"))
    data.add(Biodata(R.drawable.gading,"Ilham Gading", 23307102, "22 Oktober 2004", "Ngawi", "http://wa.me/+6283845586939", "https://www.instagram.com/ilham_stu/"))
    data.add(Biodata(R.drawable.ilham,"Ilham Surya", 23307103, "23 Mei 2005", "Ngawi", "http://wa.me/+6281230891261","https://www.instagram.com/ilhmmputra/"))
    data.add(Biodata(R.drawable.ilma,"Ilma Ayu", 233307104, "01 November 2004", "Madiun", "http://wa.me/+6281392189055","https://www.instagram.com/ilmaayups/"))
    data.add(Biodata(R.drawable.java,"Java Dwenda", 23307105, "24 April 2005", "Madiun", "http://wa.me/+6285754395215","https://www.instagram.com/mzjavakoestyantara/"))
    data.add(Biodata(R.drawable.leni,"Leni Novitasari", 233307106, "12 Juli 2004", "Ponorogo", "http://wa.me/+6285334645836","https://www.instagram.com/lennissii/"))
    data.add(Biodata(R.drawable.muaz,"Muaz Muhammad ", 23307107, "24 Februari 2003", "Madiun", "http://wa.me/+6281515874078","https://www.instagram.com/the_unkindle_one/"))
    data.add(Biodata(R.drawable.ikhsan,"Muhammad Ikhsan", 233307108, "10 Juli 2003", "Madiun", "http://wa.me/+628817129947","https://www.instagram.com/m.ikhsan.aldi/"))
    data.add(Biodata(R.drawable.karim,"Miftahul Karim", 23330709, "28 Oktober 2004", "Tulungagung", "http://wa.me/+6285643025562","https://www.instagram.com/k_4_r1m/"))
    data.add(Biodata(R.drawable.sasa,"Nihlatansya Riskia", 23307110, "03 Mei 2004", "Nganjuk", "http://wa.me/+6281617638463","https://www.instagram.com/sassyyyaa_/"))
    data.add(Biodata(R.drawable.niken,"Niken Setyo", 233307111, "17 Januari 2005", "Magetan", "http://wa.me/+62895710617373","https://www.instagram.com/anxee.o/"))
    data.add(Biodata(R.drawable.putri,"Putri Arensya", 233307112, "09 Juli 2005", "Madiun", "http://wa.me/+6282148978966","https://www.instagram.com/vyy_0.0/"))
    data.add(Biodata(R.drawable.rivia,"Rivia Marsadah", 23307114, "22 Maret 2005", "Madiun", "http://wa.me/+6289608074844", "https://www.instagram.com/zibethinus_uf/"))
    data.add(Biodata(R.drawable.samodra,"Samodra Haqqi", 23307115, "07 November 2005", "Madiun", "http://wa.me/+6282228770779","https://www.instagram.com/alucky_30/"))
    data.add(Biodata(R.drawable.triani,"Triani Yuli", 233307116, "09 Juli 2004", "Magetan", "http://wa.me/+62895395668580","https://www.instagram.com/nnyyyy_ya/"))
    data.add(Biodata(R.drawable.umi,"Umi Latifah", 23307117, "15 Agustus 2004", "Magetan", "http://wa.me/+6285730859907","https://www.instagram.com/umilyukaa/"))
    data.add(Biodata(R.drawable.warda,"Warda Imana", 233307118, "16 Mei 2004", "Ngawi", "http://wa.me/+6285791409080","https://www.instagram.com/wardaimn_/"))
    data.add(Biodata(R.drawable.yola,"Yola Septian", 23307119, "07 September 2005", "Magetan", "http://wa.me/+6289603172796","https://www.instagram.com/ylsptia/"))

    return data
}