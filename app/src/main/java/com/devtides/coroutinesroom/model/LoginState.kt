package com.devtides.coroutinesroom.model

object LoginState {

    var isLogged = false
    var user : User? = null

    fun login(user: User) {
        isLogged = true
        this.user = user
    }

    fun logout() {
        isLogged = false
        user = null
    }

}