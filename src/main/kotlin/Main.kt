fun main(args: Array<String>) {

    println(getGCF(10, 6))

    println(getLCM(10, 20))

    println(resNum(1030))

    println(stringFun("Hello\$ Bro;>"))

    println(sumPrimeNum())

    println(palindrome("omo"))
}

//1
fun getGCF(num1: Int, num2: Int): Int{
    var res = 0;
    for(i in 1..(num1+num2)){
        if(num1 % i == 0 && num2 % i == 0)
            res = i
    }
    return  res
}

//2
fun getLCM(num1: Int, num2: Int): Int{
    var res = 0
    for(i in 1..num1){
        if((num2 * i) % num1 == 0){
            res = num2 * i
            break
        }
    }
    return  res;
}

//3
fun stringFun(str: String): Boolean{
    return str.contains('$')
}

// 4
fun sumPrimeNum(num: Int = 2): Int {
    if (num > 100) return 0
    return if (primeNum(num)) num + sumPrimeNum(num + 1) else sumPrimeNum(num + 1)
}

fun primeNum(n: Int, i: Int = 2): Boolean{
    if (n <= 1) return false
    if (i * i > n) return true
    if (n % i == 0) return false
    return primeNum(n, i + 1)
}

// 5
fun resNum(num: Int): Int{
    return num.toString().reversed().toInt()
}

//6
fun palindrome(str: String): Boolean{
    for(i in str.indices){
        if(str[i] != str[(str.length-1)-i]){
            return false
        }
    }
    return true
}





