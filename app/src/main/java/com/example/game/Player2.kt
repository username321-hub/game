package com.example.game

class Player2 (HP:Int, damag: Int){
    var HP = 100
    var damag = 10
    var lvl = 1
    var zelkol = 3
    var rasst = 0
    fun beat(HPvr : Int, Damagor: Int): Int{
        var hpvr = HPvr
        hpvr -= damag + Damagor
        return hpvr
    }
    fun zel(){
        if(zelkol > 0){
            HP+=20
            zelkol-=1
            println(HP)
        }
        if(zelkol <= 0 ){
            println("Нету зелья!")
        }
    }
}