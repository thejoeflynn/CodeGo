while (i <= 10) {
    System.out.println(i);
    i++;
}
printNumbers();
printNumbers(5)
printNumbers(10);
printNumbers(20);
sumNumbersto10();
int sumNumbersTo13(){
    return sumNumbers(13);
}
while (i <= 10) {
    System.out.println(i);
    i++;
}
void printNumbers() {
    int i = 1;
    while (i <= 10) {
        System.out.println(i);
        i++;
    }
}
printNumbers();
void printNumbers(int n) {
    int i = 1;
    while (i <= n) {
        System.out.println(i);
        i++;
    }
}
printNumbers(5)
printNumbers(10);
printNumbers(20);
sumNumbers(5);
sumNumbers(11);
sumNumbers(23);
sumNumbers(5683);
sumNumbers(106839);
sumNumbers(6180);
sumNumbers(5);
sumNumbers(10);
sumNumbers(20);
sumNumbers(106839);
int sumNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum = sum + i;
    }
    return sum;
}
int sumNumbersto10() {
    return sumNumbers(10);
}
sumNumbersto10();
int addTwoNumber(int x, int y){
    int sum;
    sum = x + y;
    return sum;
}
int minusTwoNumber(int x, int y){
    int sum;
    sum = x - y;
    return sum;
}
int multiplyTwoNumber(int x, int y){
    int sum;
    sum = x * y;
    return sum;
}
int divideTwoNumber(int x, int y){
    int sum;
    sum = x / y;
    return sum;
}
boolean isEven;
boolean isEven(int x) {
    return x % 2 == 0;
}
int i = 1;
while (i <= 10) {
    System.out.println(i + " % 2 = " + i % 2);
    i++;
}
boolean isOdd(int x) {
    return x % 2 == 1;
}
void printOddEven() {
    int i=1;
    while (i <= 10) {
        if (isEven(i)) {
            System.out.println(i + " is even");
        } else {
            System.out.println(i + " is odd");
        }
        i++;
    }
}