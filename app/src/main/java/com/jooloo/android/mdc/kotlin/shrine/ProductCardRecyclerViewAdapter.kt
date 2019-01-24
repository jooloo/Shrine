package com.jooloo.android.mdc.kotlin.shrine

import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.jooloo.android.mdc.kotlin.shrine.network.Product

/**
 * Adapter used to show a simple grid of products
 */
class ProductCardRecyclerViewAdapter(
    private val fragment: Fragment, private val productList: List<Product>
) : RecyclerView.Adapter<ProductCardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ProductCardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product_card, parent, false)
        return ProductCardViewHolder(view)
    }

    override fun getItemCount() = productList.size

    override fun onBindViewHolder(holder: ProductCardViewHolder, position: Int) {
        holder.bind(fragment, productList[position])
    }
}