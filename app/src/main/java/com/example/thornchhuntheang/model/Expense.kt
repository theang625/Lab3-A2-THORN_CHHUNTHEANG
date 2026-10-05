package com.example.thornchhuntheang.model

data class Expense(
    val id: String,
    val amount: Double,
    val currency: String = "$",
    val category: String,
    val date: String,
    val remark: String? = null
)

val sampleExpenses = listOf(
    Expense("1", 12.50, "$", "Food", "2026-10-01", "Lunch"),
    Expense("2", 45.00, "$", "Transport", "2026-10-02"),
    Expense("3", 120.00, "$", "Shopping", "2026-10-03", "Shoes"),
    Expense("4", 8.00, "$", "Food", "2026-10-04", "Coffee")
)