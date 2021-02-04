fun repeatedString(s: String, n: Long): Long {
    var numberOfAs = 0
    var occourences = 0L
    val numberOfRepetitions = if(n % s.length == 0L) (n / s.length) else ((n / s.length) + 1)
    var lastForN = n % s.length
    
    for (i in s.indices) {
        if(s[i] == 'a'){
            numberOfAs++
        }
    }
    
    occourences = numberOfAs * numberOfRepetitions
    
    if(lastForN != 0L){
        occourences = occourences - numberOfAs
        for(i in (0..(lastForN - 1))){
            if(s[i.toInt()] == 'a'){
                occourences++
            }
        }
    }
    
    return occourences
}