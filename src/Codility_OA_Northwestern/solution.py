def solution(blocks):
    cur, turnl = blocks[1], [[0]]
    flat = []
    inits = up = cur - blocks[0] > 0
    for i, e in enumerate(blocks[2:]):
        if e - cur == 0:
            flat.append(i+1)
        elif (e - cur > 0) or not up:
            up = not up
            turnl.append(flat + [i+1])
            flat = []
        else:
            flat = []
            cur = e
    turnl.append([len(blocks)-1])
    print(turnl)
    dis = [turnl[1][-1]]
    
    if inits:
        temp = range(2, len(turnl)-1, 2) 
    else:
        temp = range(1, len(turnl)-1, 2) 
    
    for i in temp:
        dis.append(turnl[i+1][-1]-turnl[i-1][0])
    dis.append(turnl[-1][-1] - turnl[-2][0])
    
    return max(dis) + 1