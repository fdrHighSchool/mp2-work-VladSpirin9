# Div By 3
#### Respond to the following:

1. A number is considered *prime* if its only factors are 1 and itself. For example, 7 is prime (1 and 7 are the only factors) and 9 is not (1, 3 and 9 are factors).  
Outline an algorithm to determine whether or not a number is prime.  
Think of the following method header:
`public static boolean isPrime(int num)`

  * **YOUR WRITING HERE**
The prime number cannot divide by anything but 1 and itself. If a given number is a factor of 2, we move on 3. If after that the number is a factor of 3, we move on to 4. If a number is a factor of 4, it is clear it is not a prime. Otherwise, the number is a prime.
 
