#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> numbers) {
    int max1 = 0;
    int max2 = 0;
    sort(numbers.begin(), numbers.end());
    max1 = numbers.back();
    numbers.pop_back();
    max2 = numbers.back();
    return max1 * max2;
}