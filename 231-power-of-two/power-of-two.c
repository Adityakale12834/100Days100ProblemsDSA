bool isPowerOfTwo(int n) {
    int num = 0;
    if(n <= 0) return false;
    while(n > 1){
        if(n % 2 == 1){
            return false;
        }
        n = n/2; 
    }
    return true;
}