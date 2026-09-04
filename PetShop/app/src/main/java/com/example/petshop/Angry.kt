package com.example.petshop

class Angry: Mood() {
    override fun moodType(): String {
        return "Pet is angry"
    }
}