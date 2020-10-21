package com.sibelyildiz.bakingapp.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sibelyildiz.bakingapp.model.BakingResponse


/**     Code with ❤
╔════════════════════════════╗
║  Created by Sibel YILDIZ   ║
╠════════════════════════════╣
║ sibelyldz2012@gmail.com    ║
╠════════════════════════════╣
║     21/10/2020 - 22:21     ║
╚════════════════════════════╝
 */
class RecipeAdapter(val recipeList: List<BakingResponse>) :
    RecyclerView.Adapter<RecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(recipeList[position])
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

}