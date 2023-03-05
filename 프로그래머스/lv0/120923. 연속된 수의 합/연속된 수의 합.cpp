#include <vector>

using namespace std;

vector<int> solution(int num, int total) {
    vector<int> answer;
    if(num % 2 != 0) {
        int mid = total / num;
        for(int i=mid-num/2; i<=mid+num/2; i++)
            answer.push_back(i);
    }
    else {
        int mid = total / num;
        for(int i=mid-num/2+1; i<=mid+num/2; i++)
            answer.push_back(i);
    }
    return answer;
}