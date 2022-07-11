package com.sharad.daggermvvm.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey


@Entity
data class Product(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    val id: Int=0,
    @ColumnInfo(name = "category")
    val category: String ="",
    @ColumnInfo(name = "description")
    val description: String ="",
    @ColumnInfo(name = "image")
    val image: String ="",
    @ColumnInfo(name = "price")
    val price: Double =0.0,
    @ColumnInfo(name = "title")
    val title: String = ""
)

