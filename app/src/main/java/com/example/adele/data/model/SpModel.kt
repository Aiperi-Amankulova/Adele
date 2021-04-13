package com.example.adele.data.model

data class SpModel(
        val title: String,
        val specs: ArrayList<FeaturesModel>
) {
    companion object {
        fun generateSize() = SpModel("Size", FeaturesModel.generateData())
        fun generateColor() = SpModel("Display", FeaturesModel.generateData())
        fun generateFrom() = SpModel("Camera", FeaturesModel.generateData())
        fun generatePrise() = SpModel("Camera", FeaturesModel.generateData())
    }
}

data class FeaturesModel(
        val title: String,
        val features: String
) {
    companion object {
        fun generateData(): ArrayList<FeaturesModel> {
            val list = arrayListOf<FeaturesModel>()
            list.add(FeaturesModel("Color", "black"))
            list.add(FeaturesModel("Size", "M"))
            list.add(FeaturesModel("From", "Korey"))
            list.add(FeaturesModel("Prise", "$10"))
            return list
        }
    }
}