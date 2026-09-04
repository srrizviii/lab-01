package com.example.petshop

class Happy: Mood() {
    override fun moodType(): String {
        return "Pet is happy"
    }
}