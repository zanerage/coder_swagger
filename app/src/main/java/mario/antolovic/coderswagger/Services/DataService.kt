package mario.antolovic.coderswagger.Services

import mario.antolovic.coderswagger.Model.Category
import mario.antolovic.coderswagger.Model.Products

object DataService {

    val categories = listOf(
    Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Products("Devslopes Graphic Beanie","$18","hat01"),
        Products("Devslopes Hat Black","$20","hat02"),
        Products("Devslopes Hat White","$21","hat03"),
        Products("Devslopes Hat Snapback","$22","hat04")

    )
    val hoodies = listOf(
        Products ("Devslopes Hoodie Gray","$28","hoodie01"),
        Products ("Devslopes Hoodie Red","$22","hoodie02"),
        Products ("Devslopes Gray Hoodie","$38","hoodie03"),
        Products ("Devslopes Black Hoodie","$48","hoodie04")


    )
    val shirts = listOf(
        Products ("Devslopes Shirt Black","$21","shirt01"),
        Products ("Devslopes Badge Red","$24","shirt02"),
        Products ("Devslopes Logo Shirt Red","$33","shirt03"),
        Products ("Devslopes Hustle","$48","shirt04"),
        Products ("Kickflip Studios","$58","shirt05")



    )
}