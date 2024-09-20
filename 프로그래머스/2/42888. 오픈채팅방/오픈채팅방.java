import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < record.length; i++) {
            String[] array = record[i].split(" ");
            if (array.length < 3) {
                continue;
            }
            map.put(array[1], array[2]);
        }
        String value = "";
        String s = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < record.length; i++) {
            String[] array = record[i].split(" ");
            if (array[0].equals("Enter")) {
                value = map.get(array[1]);
                s = value + "님이 들어왔습니다.";
                list.add(s);
            } else if (array[0].equals("Leave")) {
                value = map.get(array[1]);
                s = value + "님이 나갔습니다.";
                list.add(s);
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}