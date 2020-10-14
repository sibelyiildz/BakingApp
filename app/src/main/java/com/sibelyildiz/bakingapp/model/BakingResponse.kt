package com.sibelyildiz.bakingapp.model


/**     Code with ❤
╔════════════════════════════╗
║  Created by Sibel YILDIZ   ║
╠════════════════════════════╣
║ sibelyldz2012@gmail.com    ║
╠════════════════════════════╣
║     12/10/2020 - 20:56     ║
╚════════════════════════════╝
 */


data class BakingResponse(
    val id: Int?,
    val name: String?,
    val ingredients: List<Ingredients>?,
    val steps: List<Steps>?,
    val servings: Int?,
    val image: String?
)