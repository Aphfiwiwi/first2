fun main() {
    var dog1 =doggie("Gunpowder","German shepherd","black",4)
    println(dog1.breed)
    var dog2 =doggie("happy","Golden retriver","blonde",1)
    println(dog2.breed)
    var dog3 =doggie("lollie","cocker spanial","brown",6)
    println(dog1.breed)

}

class doggie(var name:String, var breed:String, var colour:String, var age:Int,){

}