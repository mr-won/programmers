#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    for(auto i : numbers) {
        i = i*2;
        answer.push_back(i);
    }
    return answer;
}