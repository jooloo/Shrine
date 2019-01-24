package com.jooloo.android.mdc.kotlin.shrine

import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import com.jooloo.android.mdc.kotlin.shrine.network.Product
import kotlinx.android.synthetic.main.item_product_card.view.*

/**
 * ViewHolder contains the product item view
 */
class ProductCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(fragment: Fragment, product: Product) {
        itemView.product_title.text = product.title
        itemView.product_price.text = product.price
        Glide.with(fragment)
            .load(product.url)
            .into(itemView.product_image)
    }
}