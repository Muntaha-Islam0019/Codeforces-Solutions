t = int(input())

while t > 0:

    user_input = str(input())
    values = [int(x) for x in user_input.split()]

    a = values[0]
    b = values[1]

    if a != b:
        if max(a, b) == a:
            if (a - b) % 2 == 0:
                print('1')
            else:
                print('2')
        else:
            if (a - b) % 2 == 0:
                print('2')
            else:
                print('1')
    else:
        print('0')
    
    t -= 1
