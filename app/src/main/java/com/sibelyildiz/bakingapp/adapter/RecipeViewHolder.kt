package com.sibelyildiz.bakingapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sibelyildiz.bakingapp.R
import com.sibelyildiz.bakingapp.model.BakingResponse
import kotlinx.android.synthetic.main.row_item_list_recipe.view.*


/**     Code with ❤
╔════════════════════════════╗
║  Created by Sibel YILDIZ   ║
╠════════════════════════════╣
║ sibelyldz2012@gmail.com    ║
╠════════════════════════════╣
║     21/10/2020 - 22:21     ║
╚════════════════════════════╝
 */
class RecipeViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(R.layout.row_item_list_recipe, container, false)
) {
    fun bind(bakingResponse: BakingResponse) {
        itemView.tvRecipe.text = bakingResponse.name
    }

}