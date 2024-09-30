let input = readLine()!.split(separator: " ").map { Int($0)! }
var n: Int = input[0], d: Int = input[1]

var shortcut: [[Int]] = []
for _ in 0..<n {
    let way = readLine()!.split(separator: " ").map { Int($0)! }
    shortcut.append(way)
}
shortcut.sort(by: { ($0[1], $0[0]) < ($1[1], $1[0]) })

var k: Int = 0
var isShort: Bool = true
var distance: [Int] = [0]

for i in 0..<d {
    var min: Int = distance[i]+1
    
    while isShort && shortcut[k][1] == i+1 {
        if min > distance[shortcut[k][0]] + shortcut[k][2] {
            min = distance[shortcut[k][0]] + shortcut[k][2]
        }
        if k < shortcut.count-1 { k += 1 }
        else { isShort = false }
    }
    
    distance.append(min)
}

print(distance.last!)