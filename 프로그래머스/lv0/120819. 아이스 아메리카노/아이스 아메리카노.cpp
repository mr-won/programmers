#include <string>
#include <vector>

using namespace std;

vector<int> solution(int money) {
    vector<int> answer;
    int leftMoney = 0; // 남는 돈
    int cup = 0; // 잔 수
    cup = money / 5500;
    leftMoney = money % 5500;
    answer.push_back(cup);
    answer.push_back(leftMoney);
    return answer;
}