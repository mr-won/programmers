#include <string>
#include <vector>

using namespace std;

int solution(int n) { 
     long long i = 1;
    long long factorial = 1;
    while (factorial <= n) {
        i++;
        factorial *= i;
    }
    return i - 1;
}