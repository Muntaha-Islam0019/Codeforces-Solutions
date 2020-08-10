t = int(input())

while t > 0:
    
    user_input_two = str(input())
    moves = [int(x) for x in user_input_two.split()]

    a = moves[0]
    b = moves[1]
    c = moves[2]
    d = moves[3]

    user_input_two = str(input())
    points = [int(x) for x in user_input_two.split()]

    x = points[0]
    y = points[1]
    x_1 = points[2]
    y_1 = points[3]
    x_2 = points[4]
    y_2 = points[5]
    
    if b - a in range(x_1, x_2 + 1) and d - c in range(y_1, y_2 + 1):
        print('Yes')
    else:
        print('No')

    t -= 1
