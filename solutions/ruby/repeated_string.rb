def repeated_string s, n

	number_of_a = 0
	s_as_array = s.split('')
	number_of_repetitions = n % s_as_array.size === 0 ? (n / s_as_array.size) : ((n / s_as_array.size) + 1)
	last_for_n = n % s_as_array.size

	s_as_array.each do |letter|
		if letter === 'a'
			number_of_a = number_of_a + 1
		end	
	end

	occourences = number_of_a * number_of_repetitions

	unless last_for_n === 0
		occourences = occourences - number_of_a
		(0..(last_for_n - 1)).each do |idx|
			if s_as_array[idx] === 'a'
				occourences = occourences + 1
			end
		end
	end
	puts(occourences)
	return occourences
end