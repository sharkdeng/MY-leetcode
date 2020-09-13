#include <stdio.h>


// c function must return
int FindGreatestSumOfSubArray(int* array, int arrayLen ) {
    // write code here
    int f = array[0];
    int s = array[0];
    int re = array[0];
    for (int i = 1; i < arrayLen; i ++){
        s += array[i];
        printf("%d ", s);
        if (s > array[i]){
            f = s;
        } else {
            f = array[i];
            s = array[i];
        }
        if (s > re){ re = s; }
    }

    return re;
}

int main()
{
    int num[] = {2,8,1,5,9}; // this is array, don't need to assign size
    FindGreatestSumOfSubArray(num, 5);
    return 0;
}


