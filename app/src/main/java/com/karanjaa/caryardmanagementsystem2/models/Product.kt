package com.karanjaa.CarYardManagementSystem.models

class Product {
        var name:String=""
        var model:String=""
        var quantity:String=""
        var price:String=""
        var id:String=""

        constructor(name:String,model:String,quantity:String,price:String,id:String){
            this.name=name
            this.model=model
            this.quantity=quantity
            this.price=price
            this.id=id

        }
        constructor()
}