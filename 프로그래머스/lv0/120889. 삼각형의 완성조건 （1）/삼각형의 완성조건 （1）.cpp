#include <string>
#include <algorithm>
#include <vector>

using namespace std;

int solution(vector<int> sides) {
    int max = 0;
    int total = 0;
    sort(sides.begin(), sides.end()); // 오름차순 정렬
    max = sides.back();
    sides.pop_back(); // 맨 뒤 숫자(제일 큰 숫자) 제거
    
    total = sides.front() + sides.back(); // 큰 수 제거하고 나머지 두개 합
    
    if(total > max) {
        return 1;
    } else return 2;
}