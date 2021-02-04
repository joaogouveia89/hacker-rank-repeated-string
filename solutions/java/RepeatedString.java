import java.math.BigInteger;

public class RepeatedString{
	public static BigInteger run(String s, BigInteger n){
		BigInteger stringSize = new BigInteger(Integer.toString(s.length()));

		BigInteger numberOfAs = BigInteger.ZERO;
		BigInteger occourences = null;

		BigInteger[] nAndArraySizeDivRem = n.divideAndRemainder(stringSize);

		BigInteger numberOfRepetitions = nAndArraySizeDivRem[1].equals(numberOfAs /* seems to doesnt make sense but, it is not to create a new BigInteger */) ? nAndArraySizeDivRem[0] : nAndArraySizeDivRem[0].add(BigInteger.ONE);

		for(int i  = 0; i < s.length(); i++){
			if(s.charAt(i) == 'a'){
				numberOfAs = numberOfAs.add(BigInteger.ONE);
			}
		}

		occourences = numberOfAs.multiply(numberOfRepetitions);

		if(nAndArraySizeDivRem[1].compareTo(BigInteger.ZERO) != 0){
			occourences = occourences.subtract(numberOfAs);
			for(BigInteger i = BigInteger.ZERO; i.compareTo(nAndArraySizeDivRem[1]) < 0; i = i.add(BigInteger.ONE)){
				if(s.charAt(i.intValue()) == 'a'){
					occourences = occourences.add(BigInteger.ONE);
				}
			}
		}
		return occourences;
	}
}