package com.example.thornchhuntheang.model

import java.time.LocalDate

data class Expense(
    val id: String,
    val amount: Double,
    val currency: String = "$",
    val category: String,
    val date: LocalDate,
    val remark: String? = null
)

val sampleExpenses = listOf(
    Expense("1", 45.0, "$", "Food", LocalDate.now(), "Groceries"),
    Expense("2", 15.0, "$", "Transport", LocalDate.now().minusDays(1), "Taxi"),
    Expense("3", 120.0, "$", "Shopping", LocalDate.now().minusDays(2), "New Shoes")
)
