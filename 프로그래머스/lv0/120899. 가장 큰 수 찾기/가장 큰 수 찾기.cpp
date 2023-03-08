#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array) {
    vector<int> answer;
    int index = 0;
    int max = 0;
    for(int i : array) {
        if(i > max) {
            max = i;
            index = find(array.begin(), array.end(), i) - array.begin();
        }
    }
    answer.push_back(max);
    answer.push_back(index);
    
    return answer;
}