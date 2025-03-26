

fun main() {
    //while loop
    var x = 20
    while(x <= 25){
        println("Number is $x")
        x ++
    }

    var y = 5
    while(y >= 1){
        println("Number is $y")
        y --
    }


    // do while loop
    var count = 100
    do {
        println("$count is the current")
        count --
    }
        while (count <= 100 && count >= 94)




    // for loooooooooooop
    for(z in 35 .. 40)
        println("Number : $z")

    for(letter in 'a' .. 'f')
        println("Letter is $letter")

    for(pb in 1..5){
        if(pb == 4)
            break //to stop the loop
    }
    println("Num is $")


    for(myjuice in 'd'..'i'){
        if(myjuice == 'f')
            continue
    }

    println("myjuice is $")



}