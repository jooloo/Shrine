package com.jooloo.android.mdc.kotlin.shrine.network

import android.content.res.Resources
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.jooloo.android.mdc.kotlin.shrine.R

/**
 * product model
 */
data class Product(val title: String, val price: String, val url: String)

/**
 * Loads a raw JSON at R.raw.products and converts it into a list of [Product] objects.
 */
fun fetchProducts(resource: Resources): List<Product> {
    val ins = resource.openRawResource(R.raw.products)
    val json = ins.bufferedReader().use {
        it.readText()
    }
    val productListType = object : TypeToken<ArrayList<Product>>() {}.type
    return Gson().fromJson(json, productListType)
}