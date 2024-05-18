package com.karanjaa.CarYardManagementSystem.models

 class Upload{
    var name:String=""
    var model:String=""
    var price:String=""
    var quantity:String=""
    var imageUrl:String=""
    var id:String=""

    constructor(name:String,model:String,price:String,quantity:String,imageUrl:String,id:String){

        this.name=name
        this.model=model
        this.price=price
        this.quantity=quantity
        this.imageUrl=imageUrl
        this.id=id

    }
    constructor()
}
