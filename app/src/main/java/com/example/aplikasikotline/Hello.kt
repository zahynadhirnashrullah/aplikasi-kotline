package com.example.aplikasikotline

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Input biodata
    print("Enter your name: ")
    val name = scanner.nextLine()

    print("Enter your age: ")
    val age = scanner.nextInt()

    scanner.nextLine() // Consume the newline character

    print("Enter your Hoby: ")
    val address = scanner.nextLine()

    // Display biodata
    println("\nBiodata:")
    println("Name: $name")
    println("Age: $age")
    println("Hoby: $address")
}
