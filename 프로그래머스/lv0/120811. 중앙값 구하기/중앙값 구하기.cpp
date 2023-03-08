#include <string>
#include <algorithm>
#include <vector>

using namespace std;

int solution(vector<int> array) {
    int answer = 0;
    int center = 0; // 중앙 인덱스 값
    sort(array.begin(), array.end());
    center = array.size() / 2; // 중앙 인덱스 값
    return array[center];
}