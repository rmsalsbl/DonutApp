package com.slowmotion.donuttapp.Data

import com.slowmotion.donuttapp.R

object DonutDataObject {

    private val donutName = arrayOf(
        "Alcapone",
        "Avocado Dicaprio",
        "Berry Spears",
        "Caviar Chocolate",
        "Crunchy Crunchy",
        "Don Mochino",
        "Glazzy",
        "Oreology",
        "Snow White",
        "Tira Miss U",
    )

    private val donutFlavor = arrayOf(
        "Almond",
        "Avocado, Chocolate",
        "Berry, Cheese",
        "Chocolate",
        "Chocolate",
        "Mocha",
        "Glazz",
        "Oreo",
        "Sugar",
        "Tiramisu",
    )

    private val donutPrice = arrayOf(
        "Rp.8000",
        "Rp.8000",
        "Rp.8000",
        "Rp.8000",
        "Rp.8000",
        "Rp.8000",
        "Rp.8000",
        "Rp.8000",
        "Rp.8000",
        "Rp.8000",
    )

    private val donutDetail = arrayOf(
        "Donut dipped in white chocolate and topped with sliced toasted almonds.olate and topped with sliced toasted almonds.",
        "Donut filled with avocado cream, dipped in avocado chocolate, and garnished with dark chocolate flakes.",
        "Donut filled with whipped cream cheese, dipped in strawberry jam, and garnished with white chocolate flakes.",
        "Donut dipped in hazelnut chocolate and sprinkled with dark chocolate coated crisps",
        "Donut dipped in milk chocolate and topped with chocolate cornflakes.",
        "Donut filled with mocha cream, dipped in dark chocolate, and garnished with white chocolate.",
        "Donut dipped in light honey glaze.",
        "Donut dipped in white chocolate, topped with cookie crumbs, and drizzled with white chocolate.",
        "Donut filled with vanilla whipped cream and topped with sugar icing powder.",
        "Donut filled with tiramisu cream, dipped in tiramisu chocolate, and sprinkled with chocolate powder.",
    )

    private val donutImages = intArrayOf(
        R.drawable.almond,
        R.drawable.avocado,
        R.drawable.berrysp,
        R.drawable.caviarch,
        R.drawable.crunchy,
        R.drawable.mochino,
        R.drawable.glazz,
        R.drawable.oreology,
        R.drawable.snow,
        R.drawable.tiramisu,
    )

    val listData: ArrayList<DonutData>
    get() {
        val list = arrayListOf<DonutData>()
        for (posisition in donutName.indices){
            val donut = DonutData()
            donut.name = donutName[posisition]
            donut.flavor = donutFlavor[posisition]
            donut.price = donutPrice[posisition]
            donut.detail = donutDetail[posisition]
            donut.photo = donutImages[posisition]
            list.add(donut)
        }
        return list
    }
}
