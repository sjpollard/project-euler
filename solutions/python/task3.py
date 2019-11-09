def isPrime(n):
    for i in range (1, n):
        if(n % i == 0):
            n /= i
            print(i)



if __name__ == "__main__":
    isPrime(600851475143)