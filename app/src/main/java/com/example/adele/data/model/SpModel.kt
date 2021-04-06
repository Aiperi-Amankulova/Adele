package com.example.adele.data.model

data class SpModel(
        val title: String,
        val specs: ArrayList<FeaturesModel>
) {
    companion object {
        fun generateMemory() = SpModel("Memory", FeaturesModel.generateFeaturesData())
        fun generateDisplay() = SpModel("Display", FeaturesModel.generateFeaturesData())
        fun generateCamera() = SpModel("Camera", FeaturesModel.generateFeaturesData())
        fun generateOS() = SpModel("OS", FeaturesModel.generateFeaturesData())
        fun generateBatteries() = SpModel("Batteries", FeaturesModel.generateFeaturesData())
    }
}

data class FeaturesModel(
        val title: String,
        val features: String
) {
    companion object {
        fun generateFeaturesData(): ArrayList<FeaturesModel> {
            val list = arrayListOf<FeaturesModel>()
            list.add(FeaturesModel("RAM", "128 GB"))
            list.add(FeaturesModel("Display technology", "Super AMOLED"))
            list.add(FeaturesModel("Front camera", "Front"))
            return list
        }
    }
}