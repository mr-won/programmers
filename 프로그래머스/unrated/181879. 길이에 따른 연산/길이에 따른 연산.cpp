#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int answer = num_list.size();
    if(answer >= 11) {
        int sum = 0;
        for(int i : num_list) {
            sum += i;
        }
        return sum;
    } else {
        int sum = 1;
        for(int i : num_list) {
            sum *= i;
        }
        return sum;
    }
}