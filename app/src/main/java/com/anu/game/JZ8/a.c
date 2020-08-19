
/**
 *
 * @param number int整型
 * @return int整型
 */
// 对于第n个台阶来说，只能从n-1或者n-2的台阶跳上来，所以 F(n) = F(n-1) + F(n-2)
int jumpFloor(int number ) {
    // write code here
    
    if (number <=2 ){
        return number;
    } else {
        return jumpFloor(number-1) + jumpFloor(number-2);
    }
}
